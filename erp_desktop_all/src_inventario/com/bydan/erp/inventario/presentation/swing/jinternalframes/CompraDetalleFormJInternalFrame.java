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
import com.bydan.erp.inventario.util.CompraConstantesFunciones;

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
public class CompraDetalleFormJInternalFrame extends CompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleCompra;
	
	protected JMenuBar jmenuBarDetalleCompra;
	
	protected JMenu jmenuDetalleCompra;
	protected JMenu jmenuDetalleArchivoCompra;
	protected JMenu jmenuDetalleAccionesCompra;
	protected JMenu jmenuDetalleDatosCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutCompra;	
	protected GridBagConstraints gridBagConstraintsCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected CompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleCompra;		
	
	
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

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected EstadoInventarioBeanSwingJInternalFrame estadoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadoinventario="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected OrdenCompraBeanSwingJInternalFrame ordencompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ordencompra="";

	protected PedidoCompraBeanSwingJInternalFrame pedidocompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidocompra="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public CompraSessionBean compraSessionBean;
	
	

	public RetencionInvenBeanSwingJInternalFrame retencioninvenBeanSwingJInternalFrame=null;
	public RetencionInvenBeanSwingJInternalFrame retencioninvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteRetencionInven=false;
	public RetencionInvenSessionBean retencioninvenSessionBean;

	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame=null;
	public TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteTransaccionLocal=false;
	public TransaccionLocalSessionBean transaccionlocalSessionBean;

	public FormaPagoInvenBeanSwingJInternalFrame formapagoinvenBeanSwingJInternalFrame=null;
	public FormaPagoInvenBeanSwingJInternalFrame formapagoinvenBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoInven=false;
	public FormaPagoInvenSessionBean formapagoinvenSessionBean;

	public DetalleCompraBeanSwingJInternalFrame detallecompraBeanSwingJInternalFrame=null;
	public DetalleCompraBeanSwingJInternalFrame detallecompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleCompra=false;
	public DetalleCompraSessionBean detallecompraSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public EstadoInventarioSessionBean estadoinventarioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public OrdenCompraSessionBean ordencompraSessionBean;
	public PedidoCompraSessionBean pedidocompraSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;	
	
	public CompraLogic compraLogic;
	
	public JScrollPane jScrollPanelDatosCompra;
	public JScrollPane jScrollPanelDatosEdicionCompra;
	public JScrollPane jScrollPanelDatosGeneralCompra;
	
	protected JPanel jPanelCamposCompra;    
	protected JPanel jPanelCamposOcultosCompra;    	
	protected JPanel jPanelAccionesCompra;
	protected JPanel jPanelAccionesFormularioCompra;
    
	
	
	protected Integer iXPanelCamposCompra=0;
	protected Integer iYPanelCamposCompra=0;
	
	protected Integer iXPanelCamposOcultosCompra=0;
	protected Integer iYPanelCamposOcultosCompra=0;
	
	

	protected JPanel jPanelCamposFintotalCompra;
	protected Integer iXPanelCamposFintotalCompra=0;
	protected Integer iYPanelCamposFintotalCompra=0;

	protected JPanel jPanelCamposIniciogeneralCompra;
	protected Integer iXPanelCamposIniciogeneralCompra=0;
	protected Integer iYPanelCamposIniciogeneralCompra=0;

	protected JPanel jPanelCamposIniciocoaCompra;
	protected Integer iXPanelCamposIniciocoaCompra=0;
	protected Integer iYPanelCamposIniciocoaCompra=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoCompra;
	public JButton jButtonModificarCompra;
	public JButton jButtonActualizarCompra;
    public JButton jButtonEliminarCompra;
	public JButton jButtonCancelarCompra;
    public JButton jButtonGuardarCambiosCompra;
	public JButton jButtonGuardarCambiosTablaCompra;
	protected JButton jButtonCerrarCompra;
	
	
	protected JButton jButtonProcesarInformacionCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarCompra;
	protected JButton jButtonModificarToolBarCompra;
	protected JButton jButtonActualizarToolBarCompra;
    protected JButton jButtonEliminarToolBarCompra;
	protected JButton jButtonCancelarToolBarCompra;
    protected JButton jButtonGuardarCambiosToolBarCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarCompra;
	protected JButton jButtonCerrarToolBarCompra;
	
	protected JButton jButtonProcesarInformacionToolBarCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoCompra;
	protected JMenuItem jMenuItemModificarCompra;
	protected JMenuItem jMenuItemActualizarCompra;
    protected JMenuItem jMenuItemEliminarCompra;
	protected JMenuItem jMenuItemCancelarCompra;
    protected JMenuItem jMenuItemGuardarCambiosCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaCompra;
	protected JMenuItem jMenuItemCerrarCompra;
	protected JMenuItem jMenuItemDetalleCerrarCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosCompra;
	protected JMenuItem jMenuItemMostrarOcultarCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidCompra;
	public JLabel jLabelIdCompra;
	public JLabel jLabelidCompra;
	public JButton jButtonidCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionCompra;
	public JLabel jLabelfecha_emisionCompra;
	//public JFormattedTextField jDateChooserfecha_emisionCompra;

	public JDateChooser jDateChooserfecha_emisionCompra;
	public JButton jButtonfecha_emisionCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaCompra;
	public JLabel jLabelfecha_entregaCompra;
	//public JFormattedTextField jDateChooserfecha_entregaCompra;

	public JDateChooser jDateChooserfecha_entregaCompra;
	public JButton jButtonfecha_entregaCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialCompra;
	public JLabel jLabelnumero_secuencialCompra;
	public JTextField jTextFieldnumero_secuencialCompra;
	public JButton jButtonnumero_secuencialCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaCompra;
	public JLabel jLabelnumero_facturaCompra;
	public JTextField jTextFieldnumero_facturaCompra;
	public JButton jButtonnumero_facturaCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionCompra;
	public JLabel jLabeldescripcionCompra;
	public JTextArea jTextAreadescripcionCompra;
	public JScrollPane jscrollPanedescripcionCompra;
	public JButton jButtondescripcionCompraBusqueda= new JButtonMe();

	public JPanel jPanelautori_usuarioCompra;
	public JLabel jLabelautori_usuarioCompra;
	public JTextField jTextFieldautori_usuarioCompra;
	public JButton jButtonautori_usuarioCompraBusqueda= new JButtonMe();

	public JPanel jPanelfactura_inicialCompra;
	public JLabel jLabelfactura_inicialCompra;
	public JTextField jTextFieldfactura_inicialCompra;
	public JButton jButtonfactura_inicialCompraBusqueda= new JButtonMe();

	public JPanel jPanelfactura_finalCompra;
	public JLabel jLabelfactura_finalCompra;
	public JTextField jTextFieldfactura_finalCompra;
	public JButton jButtonfactura_finalCompraBusqueda= new JButtonMe();

	public JPanel jPanelservicio_documentoCompra;
	public JLabel jLabelservicio_documentoCompra;
	public JTextField jTextFieldservicio_documentoCompra;
	public JButton jButtonservicio_documentoCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_valorCompra;
	public JLabel jLabelfecha_valorCompra;
	//public JFormattedTextField jDateChooserfecha_valorCompra;

	public JDateChooser jDateChooserfecha_valorCompra;
	public JButton jButtonfecha_valorCompraBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_descuentoCompra;
	public JLabel jLabelporcentaje_descuentoCompra;
	public JTextField jTextFieldporcentaje_descuentoCompra;
	public JButton jButtonporcentaje_descuentoCompraBusqueda= new JButtonMe();

	public JPanel jPanelsumanCompra;
	public JLabel jLabelsumanCompra;
	public JTextField jTextFieldsumanCompra;
	public JButton jButtonsumanCompraBusqueda= new JButtonMe();

	public JPanel jPaneliceCompra;
	public JLabel jLabeliceCompra;
	public JTextField jTextFieldiceCompra;
	public JButton jButtoniceCompraBusqueda= new JButtonMe();

	public JPanel jPanelvalor_descuentoCompra;
	public JLabel jLabelvalor_descuentoCompra;
	public JTextField jTextFieldvalor_descuentoCompra;
	public JButton jButtonvalor_descuentoCompraBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoCompra;
	public JLabel jLabeltotal_descuentoCompra;
	public JTextField jTextFieldtotal_descuentoCompra;
	public JButton jButtontotal_descuentoCompraBusqueda= new JButtonMe();

	public JPanel jPanelivaCompra;
	public JLabel jLabelivaCompra;
	public JTextField jTextFieldivaCompra;
	public JButton jButtonivaCompraBusqueda= new JButtonMe();

	public JPanel jPanelstockCompra;
	public JLabel jLabelstockCompra;
	public JTextField jTextFieldstockCompra;
	public JButton jButtonstockCompraBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalCompra;
	public JLabel jLabelsub_totalCompra;
	public JTextField jTextFieldsub_totalCompra;
	public JButton jButtonsub_totalCompraBusqueda= new JButtonMe();

	public JPanel jPaneltotal_otroCompra;
	public JLabel jLabeltotal_otroCompra;
	public JTextField jTextFieldtotal_otroCompra;
	public JButton jButtontotal_otroCompraBusqueda= new JButtonMe();

	public JPanel jPanelultimo_costoCompra;
	public JLabel jLabelultimo_costoCompra;
	public JTextField jTextFieldultimo_costoCompra;
	public JButton jButtonultimo_costoCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_itemsCompra;
	public JLabel jLabelnumero_itemsCompra;
	public JTextField jTextFieldnumero_itemsCompra;
	public JButton jButtonnumero_itemsCompraBusqueda= new JButtonMe();

	public JPanel jPanelretencionCompra;
	public JLabel jLabelretencionCompra;
	public JTextField jTextFieldretencionCompra;
	public JButton jButtonretencionCompraBusqueda= new JButtonMe();

	public JPanel jPaneltotalCompra;
	public JLabel jLabeltotalCompra;
	public JTextField jTextFieldtotalCompra;
	public JButton jButtontotalCompraBusqueda= new JButtonMe();

	public JPanel jPanelfleteCompra;
	public JLabel jLabelfleteCompra;
	public JTextField jTextFieldfleteCompra;
	public JButton jButtonfleteCompraBusqueda= new JButtonMe();

	public JPanel jPanelimpuestoCompra;
	public JLabel jLabelimpuestoCompra;
	public JTextField jTextFieldimpuestoCompra;
	public JButton jButtonimpuestoCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteCompra;
	public JLabel jLabelnumero_comprobanteCompra;
	public JTextField jTextFieldnumero_comprobanteCompra;
	public JButton jButtonnumero_comprobanteCompraBusqueda= new JButtonMe();

	public JPanel jPanelfechaCompra;
	public JLabel jLabelfechaCompra;
	//public JFormattedTextField jDateChooserfechaCompra;

	public JDateChooser jDateChooserfechaCompra;
	public JButton jButtonfechaCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaCompra;
	public JLabel jLabelid_empresaCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaCompra;
	public JButton jButtonid_empresaCompra= new JButtonMe();
	public JButton jButtonid_empresaCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalCompra;
	public JLabel jLabelid_sucursalCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalCompra;
	public JButton jButtonid_sucursalCompra= new JButtonMe();
	public JButton jButtonid_sucursalCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloCompra;
	public JLabel jLabelid_moduloCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloCompra;
	public JButton jButtonid_moduloCompra= new JButtonMe();
	public JButton jButtonid_moduloCompraUpdate= new JButtonMe();
	public JButton jButtonid_moduloCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioCompra;
	public JLabel jLabelid_ejercicioCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioCompra;
	public JButton jButtonid_ejercicioCompra= new JButtonMe();
	public JButton jButtonid_ejercicioCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoCompra;
	public JLabel jLabelid_periodoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoCompra;
	public JButton jButtonid_periodoCompra= new JButtonMe();
	public JButton jButtonid_periodoCompraUpdate= new JButtonMe();
	public JButton jButtonid_periodoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_anioCompra;
	public JLabel jLabelid_anioCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioCompra;
	public JButton jButtonid_anioCompra= new JButtonMe();
	public JButton jButtonid_anioCompraUpdate= new JButtonMe();
	public JButton jButtonid_anioCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_mesCompra;
	public JLabel jLabelid_mesCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesCompra;
	public JButton jButtonid_mesCompra= new JButtonMe();
	public JButton jButtonid_mesCompraUpdate= new JButtonMe();
	public JButton jButtonid_mesCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioCompra;
	public JLabel jLabelid_usuarioCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioCompra;
	public JButton jButtonid_usuarioCompra= new JButtonMe();
	public JButton jButtonid_usuarioCompraUpdate= new JButtonMe();
	public JButton jButtonid_usuarioCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaCompra;
	public JLabel jLabelid_monedaCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaCompra;
	public JButton jButtonid_monedaCompra= new JButtonMe();
	public JButton jButtonid_monedaCompraUpdate= new JButtonMe();
	public JButton jButtonid_monedaCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioCompra;
	public JLabel jLabelid_tipo_cambioCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioCompra;
	public JButton jButtonid_tipo_cambioCompra= new JButtonMe();
	public JButton jButtonid_tipo_cambioCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_inventarioCompra;
	public JLabel jLabelid_estado_inventarioCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_inventarioCompra;
	public JButton jButtonid_estado_inventarioCompra= new JButtonMe();
	public JButton jButtonid_estado_inventarioCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_inventarioCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteCompra;
	public JLabel jLabelid_clienteCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteCompra;
	public JButton jButtonid_clienteCompra= new JButtonMe();
	public JButton jButtonid_clienteCompraUpdate= new JButtonMe();
	public JButton jButtonid_clienteCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoCompra;
	public JLabel jLabelid_formatoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoCompra;
	public JButton jButtonid_formatoCompra= new JButtonMe();
	public JButton jButtonid_formatoCompraUpdate= new JButtonMe();
	public JButton jButtonid_formatoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoCompra;
	public JLabel jLabelid_empleadoCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoCompra;
	public JButton jButtonid_empleadoCompra= new JButtonMe();
	public JButton jButtonid_empleadoCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaCompra;
	public JLabel jLabelid_transportistaCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaCompra;
	public JButton jButtonid_transportistaCompra= new JButtonMe();
	public JButton jButtonid_transportistaCompraUpdate= new JButtonMe();
	public JButton jButtonid_transportistaCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_orden_compraCompra;
	public JLabel jLabelid_orden_compraCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_orden_compraCompra;
	public JButton jButtonid_orden_compraCompra= new JButtonMe();
	public JButton jButtonid_orden_compraCompraUpdate= new JButtonMe();
	public JButton jButtonid_orden_compraCompraBusqueda= new JButtonMe();
	public JButton jButtonid_orden_compraCompraArbol= new JButtonMe();

	public JPanel jPanelid_pedido_compraCompra;
	public JLabel jLabelid_pedido_compraCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_compraCompra;
	public JButton jButtonid_pedido_compraCompra= new JButtonMe();
	public JButton jButtonid_pedido_compraCompraUpdate= new JButtonMe();
	public JButton jButtonid_pedido_compraCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloCompra;
	public JLabel jLabelid_tipo_transaccion_moduloCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloCompra;
	public JButton jButtonid_tipo_transaccion_moduloCompra= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableCompra;
	public JLabel jLabelid_asiento_contableCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableCompra;
	public JButton jButtonid_asiento_contableCompra= new JButtonMe();
	public JButton jButtonid_asiento_contableCompraUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableCompraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesCompra;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="MEDIO";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=1115;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=755;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public CompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposCompra=new JPanel();
				this.jPanelAccionesFormularioCompra=new JPanel();
				this.jmenuBarDetalleCompra=new JMenuBar();
				this.jTtoolBarDetalleCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Compra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public CompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Compra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Compra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Compra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public CompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Compra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarCompra() {
		return this.jButtonActualizarToolBarCompra;
	}
	
	public JButton getjButtonEliminarToolBarCompra() {
		return this.jButtonEliminarToolBarCompra;
	}
	
	public JButton getjButtonCancelarToolBarCompra() {
		return this.jButtonCancelarToolBarCompra;
	}		
	
	public JButton getjButtonProcesarInformacionCompra() {
		return this.jButtonProcesarInformacionCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionCompra)	{
		this.jButtonProcesarInformacionCompra = jButtonProcesarInformacionCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesCompra() {
		return this.jComboBoxTiposAccionesCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesCompra(
			JComboBox jComboBoxTiposRelacionesCompra) {
		this.jComboBoxTiposRelacionesCompra = jComboBoxTiposRelacionesCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesCompra(
			JComboBox jComboBoxTiposAccionesCompra) {
		this.jComboBoxTiposAccionesCompra = jComboBoxTiposAccionesCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioCompra() {
		return this.jComboBoxTiposAccionesFormularioCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioCompra(
			JComboBox jComboBoxTiposAccionesFormularioCompra) {
		this.jComboBoxTiposAccionesFormularioCompra = jComboBoxTiposAccionesFormularioCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.compraSessionBean=new CompraSessionBean();
		
		this.compraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.compraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.compraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.retencioninvenSessionBean=new RetencionInvenSessionBean();
		//this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		//this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
		//this.detallecompraSessionBean=new DetalleCompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		CompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		CompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		CompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Compra MANTENIMIENTO"));
		
		
		if(iWidth > 3350) {
			iWidth=3350;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.compraSessionBean.getEsGuardarRelacionado()) {
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
	
		CompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarCompra=new JButtonMe();
				this.jButtonModificarToolBarCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarCompra,this.jTtoolBarDetalleCompra,
							"actualizar","actualizar","Actualizar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarCompra,this.jTtoolBarDetalleCompra,
							"eliminar","eliminar","Eliminar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarCompra,this.jTtoolBarDetalleCompra,
							"cancelar","cancelar","Cancelar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarCompra,this.jTtoolBarDetalleCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoCompra.add(this.jMenuItemDetalleCerrarCompra);
		
		this.jmenuDetalleAccionesCompra.add(this.jMenuItemActualizarCompra);
		this.jmenuDetalleAccionesCompra.add(this.jMenuItemEliminarCompra);
		this.jmenuDetalleAccionesCompra.add(this.jMenuItemCancelarCompra);		
		
		//this.jmenuDetalleDatosCompra.add(this.jMenuItemDetalleAbrirOrderByCompra);				
		this.jmenuDetalleDatosCompra.add(this.jMenuItemDetalleMostarOcultarCompra);				
				
		//this.jmenuDetalleAccionesCompra.add(this.jMenuItemGuardarCambiosCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleCompra.add(this.jmenuDetalleArchivoCompra);		
		this.jmenuBarDetalleCompra.add(this.jmenuDetalleAccionesCompra);		
		this.jmenuBarDetalleCompra.add(this.jmenuDetalleDatosCompra);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleCompra.add(this.jmenuDetalleCompra);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdCompra = new JLabelMe();
		jLabelIdCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidCompra.setToolTipText(CompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutCompra= new GridBagLayout();

		this.jPanelidCompra.setLayout(this.gridaBagLayoutCompra);

		jLabelidCompra = new JLabel();
		jLabelidCompra.setText("Id");

		jLabelidCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emisionCompra = new JLabelMe();
		this.jLabelfecha_emisionCompra.setText(""+CompraConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionCompra.setToolTipText("F Emision");
		this.jLabelfecha_emisionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionCompra.setToolTipText(CompraConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelfecha_emisionCompra.setLayout(this.gridaBagLayoutCompra);


		//jFormattedTextFieldfecha_emisionCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionCompra= new JDateChooser();
		jDateChooserfecha_emisionCompra.setEnabled(false);
		jDateChooserfecha_emisionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionCompra.setDate(new Date());
		jDateChooserfecha_emisionCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionCompraBusqueda= new JButtonMe();
		this.jButtonfecha_emisionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionCompraBusqueda.setText("U");
		this.jButtonfecha_emisionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaCompra = new JLabelMe();
		this.jLabelfecha_entregaCompra.setText(""+CompraConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaCompra.setToolTipText("F Entrega");
		this.jLabelfecha_entregaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaCompra.setToolTipText(CompraConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelfecha_entregaCompra.setLayout(this.gridaBagLayoutCompra);


		//jFormattedTextFieldfecha_entregaCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaCompra= new JDateChooser();
		jDateChooserfecha_entregaCompra.setEnabled(false);
		jDateChooserfecha_entregaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaCompra.setDate(new Date());
		jDateChooserfecha_entregaCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaCompraBusqueda= new JButtonMe();
		this.jButtonfecha_entregaCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaCompraBusqueda.setText("U");
		this.jButtonfecha_entregaCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaCompraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_secuencialCompra = new JLabelMe();
		this.jLabelnumero_secuencialCompra.setText(""+CompraConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialCompra.setToolTipText("No Secuencial");
		this.jLabelnumero_secuencialCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialCompra.setToolTipText(CompraConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelnumero_secuencialCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldnumero_secuencialCompra= new JTextFieldMe();

		jTextFieldnumero_secuencialCompra.setEnabled(false);
		jTextFieldnumero_secuencialCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialCompraBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialCompraBusqueda.setText("U");
		this.jButtonnumero_secuencialCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialCompraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaCompra = new JLabelMe();
		this.jLabelnumero_facturaCompra.setText(""+CompraConstantesFunciones.LABEL_NUMEROFACTURA+" :");
		this.jLabelnumero_facturaCompra.setToolTipText("No Factura");
		this.jLabelnumero_facturaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaCompra.setToolTipText(CompraConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelnumero_facturaCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldnumero_facturaCompra= new JTextFieldMe();

		jTextFieldnumero_facturaCompra.setEnabled(false);
		jTextFieldnumero_facturaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaCompraBusqueda= new JButtonMe();
		this.jButtonnumero_facturaCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaCompraBusqueda.setText("U");
		this.jButtonnumero_facturaCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionCompra = new JLabelMe();
		this.jLabeldescripcionCompra.setText(""+CompraConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionCompra.setToolTipText("Descripcion");
		this.jLabeldescripcionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionCompra.setToolTipText(CompraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPaneldescripcionCompra.setLayout(this.gridaBagLayoutCompra);


		jTextAreadescripcionCompra= new JTextAreaMe();
		jTextAreadescripcionCompra.setEnabled(false);
		jTextAreadescripcionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionCompra.setLineWrap(true);
		jTextAreadescripcionCompra.setWrapStyleWord(true);
		jTextAreadescripcionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionCompra.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionCompra = new JScrollPane(jTextAreadescripcionCompra);
		jscrollPanedescripcionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionCompraBusqueda= new JButtonMe();
		this.jButtondescripcionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionCompraBusqueda.setText("U");
		this.jButtondescripcionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionCompraBusqueda.setVisible(false);		}


					
		this.jLabelautori_usuarioCompra = new JLabelMe();
		this.jLabelautori_usuarioCompra.setText(""+CompraConstantesFunciones.LABEL_AUTORIUSUARIO+" :");
		this.jLabelautori_usuarioCompra.setToolTipText("COA->Aut. Usuario");
		this.jLabelautori_usuarioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelautori_usuarioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelautori_usuarioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelautori_usuarioCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautori_usuarioCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautori_usuarioCompra.setToolTipText(CompraConstantesFunciones.LABEL_AUTORIUSUARIO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelautori_usuarioCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldautori_usuarioCompra= new JTextFieldMe();

		jTextFieldautori_usuarioCompra.setEnabled(false);
		jTextFieldautori_usuarioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautori_usuarioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautori_usuarioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautori_usuarioCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonautori_usuarioCompraBusqueda= new JButtonMe();
		this.jButtonautori_usuarioCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautori_usuarioCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautori_usuarioCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautori_usuarioCompraBusqueda.setText("U");
		this.jButtonautori_usuarioCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautori_usuarioCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautori_usuarioCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldautori_usuarioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldautori_usuarioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autori_usuarioCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautori_usuarioCompraBusqueda.setVisible(false);		}


					
		this.jLabelfactura_inicialCompra = new JLabelMe();
		this.jLabelfactura_inicialCompra.setText(""+CompraConstantesFunciones.LABEL_FACTURAINICIAL+" :");
		this.jLabelfactura_inicialCompra.setToolTipText("Fac Inicial");
		this.jLabelfactura_inicialCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfactura_inicialCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfactura_inicialCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfactura_inicialCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfactura_inicialCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfactura_inicialCompra.setToolTipText(CompraConstantesFunciones.LABEL_FACTURAINICIAL);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelfactura_inicialCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldfactura_inicialCompra= new JTextFieldMe();

		jTextFieldfactura_inicialCompra.setEnabled(false);
		jTextFieldfactura_inicialCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfactura_inicialCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfactura_inicialCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfactura_inicialCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfactura_inicialCompraBusqueda= new JButtonMe();
		this.jButtonfactura_inicialCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfactura_inicialCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfactura_inicialCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfactura_inicialCompraBusqueda.setText("U");
		this.jButtonfactura_inicialCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfactura_inicialCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfactura_inicialCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfactura_inicialCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfactura_inicialCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"factura_inicialCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfactura_inicialCompraBusqueda.setVisible(false);		}


					
		this.jLabelfactura_finalCompra = new JLabelMe();
		this.jLabelfactura_finalCompra.setText(""+CompraConstantesFunciones.LABEL_FACTURAFINAL+" :");
		this.jLabelfactura_finalCompra.setToolTipText("Fac Final");
		this.jLabelfactura_finalCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfactura_finalCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfactura_finalCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-35),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfactura_finalCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfactura_finalCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfactura_finalCompra.setToolTipText(CompraConstantesFunciones.LABEL_FACTURAFINAL);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelfactura_finalCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldfactura_finalCompra= new JTextFieldMe();

		jTextFieldfactura_finalCompra.setEnabled(false);
		jTextFieldfactura_finalCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfactura_finalCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfactura_finalCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfactura_finalCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonfactura_finalCompraBusqueda= new JButtonMe();
		this.jButtonfactura_finalCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfactura_finalCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfactura_finalCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfactura_finalCompraBusqueda.setText("U");
		this.jButtonfactura_finalCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfactura_finalCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfactura_finalCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfactura_finalCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfactura_finalCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"factura_finalCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfactura_finalCompraBusqueda.setVisible(false);		}


					
		this.jLabelservicio_documentoCompra = new JLabelMe();
		this.jLabelservicio_documentoCompra.setText(""+CompraConstantesFunciones.LABEL_SERVICIODOCUMENTO+" :");
		this.jLabelservicio_documentoCompra.setToolTipText("Serv Documento");
		this.jLabelservicio_documentoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelservicio_documentoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelservicio_documentoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelservicio_documentoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelservicio_documentoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelservicio_documentoCompra.setToolTipText(CompraConstantesFunciones.LABEL_SERVICIODOCUMENTO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelservicio_documentoCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldservicio_documentoCompra= new JTextFieldMe();

		jTextFieldservicio_documentoCompra.setEnabled(false);
		jTextFieldservicio_documentoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicio_documentoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicio_documentoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,-35),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldservicio_documentoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonservicio_documentoCompraBusqueda= new JButtonMe();
		this.jButtonservicio_documentoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicio_documentoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicio_documentoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonservicio_documentoCompraBusqueda.setText("U");
		this.jButtonservicio_documentoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonservicio_documentoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonservicio_documentoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldservicio_documentoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldservicio_documentoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"servicio_documentoCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonservicio_documentoCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_valorCompra = new JLabelMe();
		this.jLabelfecha_valorCompra.setText(""+CompraConstantesFunciones.LABEL_FECHAVALOR+" : *");
		this.jLabelfecha_valorCompra.setToolTipText("F Valor");
		this.jLabelfecha_valorCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_valorCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_valorCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_valorCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_valorCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_valorCompra.setToolTipText(CompraConstantesFunciones.LABEL_FECHAVALOR);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelfecha_valorCompra.setLayout(this.gridaBagLayoutCompra);


		//jFormattedTextFieldfecha_valorCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_valorCompra= new JDateChooser();
		jDateChooserfecha_valorCompra.setEnabled(false);
		jDateChooserfecha_valorCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_valorCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_valorCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_valorCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_valorCompra.setDate(new Date());
		jDateChooserfecha_valorCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_valorCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_valorCompraBusqueda= new JButtonMe();
		this.jButtonfecha_valorCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_valorCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_valorCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_valorCompraBusqueda.setText("U");
		this.jButtonfecha_valorCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_valorCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_valorCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_valorCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_valorCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_valorCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_valorCompraBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_descuentoCompra = new JLabelMe();
		this.jLabelporcentaje_descuentoCompra.setText(""+CompraConstantesFunciones.LABEL_PORCENTAJEDESCUENTO+" : *");
		this.jLabelporcentaje_descuentoCompra.setToolTipText("Descuento %");
		this.jLabelporcentaje_descuentoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_descuentoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_descuentoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_descuentoCompra.setToolTipText(CompraConstantesFunciones.LABEL_PORCENTAJEDESCUENTO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelporcentaje_descuentoCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldporcentaje_descuentoCompra= new JTextFieldMe();
		jTextFieldporcentaje_descuentoCompra.setEnabled(false);
		jTextFieldporcentaje_descuentoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_descuentoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_descuentoCompra.setText("0.0");

		this.jButtonporcentaje_descuentoCompraBusqueda= new JButtonMe();
		this.jButtonporcentaje_descuentoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_descuentoCompraBusqueda.setText("U");
		this.jButtonporcentaje_descuentoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_descuentoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_descuentoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_descuentoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_descuentoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_descuentoCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_descuentoCompraBusqueda.setVisible(false);		}


					
		this.jLabelsumanCompra = new JLabelMe();
		this.jLabelsumanCompra.setText(""+CompraConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanCompra.setToolTipText("Suman");
		this.jLabelsumanCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanCompra.setToolTipText(CompraConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelsumanCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldsumanCompra= new JTextFieldMe();
		jTextFieldsumanCompra.setEnabled(false);
		jTextFieldsumanCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanCompra.setText("0.0");

		this.jButtonsumanCompraBusqueda= new JButtonMe();
		this.jButtonsumanCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanCompraBusqueda.setText("U");
		this.jButtonsumanCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanCompraBusqueda.setVisible(false);		}


					
		this.jLabeliceCompra = new JLabelMe();
		this.jLabeliceCompra.setText(""+CompraConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceCompra.setToolTipText("Ice");
		this.jLabeliceCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceCompra.setToolTipText(CompraConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPaneliceCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldiceCompra= new JTextFieldMe();
		jTextFieldiceCompra.setEnabled(false);
		jTextFieldiceCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceCompra.setText("0.0");

		this.jButtoniceCompraBusqueda= new JButtonMe();
		this.jButtoniceCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceCompraBusqueda.setText("U");
		this.jButtoniceCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceCompraBusqueda.setVisible(false);		}


					
		this.jLabelvalor_descuentoCompra = new JLabelMe();
		this.jLabelvalor_descuentoCompra.setText(""+CompraConstantesFunciones.LABEL_VALORDESCUENTO+" : *");
		this.jLabelvalor_descuentoCompra.setToolTipText("Descuento Valor");
		this.jLabelvalor_descuentoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_descuentoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_descuentoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_descuentoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_descuentoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_descuentoCompra.setToolTipText(CompraConstantesFunciones.LABEL_VALORDESCUENTO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelvalor_descuentoCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldvalor_descuentoCompra= new JTextFieldMe();
		jTextFieldvalor_descuentoCompra.setEnabled(false);
		jTextFieldvalor_descuentoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_descuentoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_descuentoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_descuentoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_descuentoCompra.setText("0.0");

		this.jButtonvalor_descuentoCompraBusqueda= new JButtonMe();
		this.jButtonvalor_descuentoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_descuentoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_descuentoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_descuentoCompraBusqueda.setText("U");
		this.jButtonvalor_descuentoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_descuentoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_descuentoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_descuentoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_descuentoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_descuentoCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_descuentoCompraBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoCompra = new JLabelMe();
		this.jLabeltotal_descuentoCompra.setText(""+CompraConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoCompra.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoCompra.setToolTipText(CompraConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPaneltotal_descuentoCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldtotal_descuentoCompra= new JTextFieldMe();
		jTextFieldtotal_descuentoCompra.setEnabled(false);
		jTextFieldtotal_descuentoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoCompra.setText("0.0");

		this.jButtontotal_descuentoCompraBusqueda= new JButtonMe();
		this.jButtontotal_descuentoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoCompraBusqueda.setText("U");
		this.jButtontotal_descuentoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoCompraBusqueda.setVisible(false);		}


					
		this.jLabelivaCompra = new JLabelMe();
		this.jLabelivaCompra.setText(""+CompraConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaCompra.setToolTipText("Iva");
		this.jLabelivaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaCompra.setToolTipText(CompraConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelivaCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldivaCompra= new JTextFieldMe();
		jTextFieldivaCompra.setEnabled(false);
		jTextFieldivaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaCompra.setText("0.0");

		this.jButtonivaCompraBusqueda= new JButtonMe();
		this.jButtonivaCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaCompraBusqueda.setText("U");
		this.jButtonivaCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaCompraBusqueda.setVisible(false);		}


					
		this.jLabelstockCompra = new JLabelMe();
		this.jLabelstockCompra.setText(""+CompraConstantesFunciones.LABEL_STOCK+" : *");
		this.jLabelstockCompra.setToolTipText("Stock");
		this.jLabelstockCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstockCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstockCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstockCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstockCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstockCompra.setToolTipText(CompraConstantesFunciones.LABEL_STOCK);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelstockCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldstockCompra= new JTextFieldMe();
		jTextFieldstockCompra.setEnabled(false);
		jTextFieldstockCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstockCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstockCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstockCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstockCompra.setText("0.0");

		this.jButtonstockCompraBusqueda= new JButtonMe();
		this.jButtonstockCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstockCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstockCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstockCompraBusqueda.setText("U");
		this.jButtonstockCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstockCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstockCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstockCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstockCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stockCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstockCompraBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalCompra = new JLabelMe();
		this.jLabelsub_totalCompra.setText(""+CompraConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalCompra.setToolTipText("Sub Total");
		this.jLabelsub_totalCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalCompra.setToolTipText(CompraConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelsub_totalCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldsub_totalCompra= new JTextFieldMe();
		jTextFieldsub_totalCompra.setEnabled(false);
		jTextFieldsub_totalCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalCompra.setText("0.0");

		this.jButtonsub_totalCompraBusqueda= new JButtonMe();
		this.jButtonsub_totalCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalCompraBusqueda.setText("U");
		this.jButtonsub_totalCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalCompraBusqueda.setVisible(false);		}


					
		this.jLabeltotal_otroCompra = new JLabelMe();
		this.jLabeltotal_otroCompra.setText(""+CompraConstantesFunciones.LABEL_TOTALOTRO+" : *");
		this.jLabeltotal_otroCompra.setToolTipText("Total Otro");
		this.jLabeltotal_otroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_otroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_otroCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_otroCompra.setToolTipText(CompraConstantesFunciones.LABEL_TOTALOTRO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPaneltotal_otroCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldtotal_otroCompra= new JTextFieldMe();
		jTextFieldtotal_otroCompra.setEnabled(false);
		jTextFieldtotal_otroCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_otroCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_otroCompra.setText("0.0");

		this.jButtontotal_otroCompraBusqueda= new JButtonMe();
		this.jButtontotal_otroCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_otroCompraBusqueda.setText("U");
		this.jButtontotal_otroCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_otroCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_otroCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_otroCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_otroCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_otroCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_otroCompraBusqueda.setVisible(false);		}


					
		this.jLabelultimo_costoCompra = new JLabelMe();
		this.jLabelultimo_costoCompra.setText(""+CompraConstantesFunciones.LABEL_ULTIMOCOSTO+" : *");
		this.jLabelultimo_costoCompra.setToolTipText("Ultimo Costo");
		this.jLabelultimo_costoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelultimo_costoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelultimo_costoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelultimo_costoCompra.setToolTipText(CompraConstantesFunciones.LABEL_ULTIMOCOSTO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelultimo_costoCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldultimo_costoCompra= new JTextFieldMe();
		jTextFieldultimo_costoCompra.setEnabled(false);
		jTextFieldultimo_costoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldultimo_costoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldultimo_costoCompra.setText("0.0");

		this.jButtonultimo_costoCompraBusqueda= new JButtonMe();
		this.jButtonultimo_costoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonultimo_costoCompraBusqueda.setText("U");
		this.jButtonultimo_costoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonultimo_costoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonultimo_costoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldultimo_costoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldultimo_costoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ultimo_costoCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonultimo_costoCompraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_itemsCompra = new JLabelMe();
		this.jLabelnumero_itemsCompra.setText(""+CompraConstantesFunciones.LABEL_NUMEROITEMS+" : *");
		this.jLabelnumero_itemsCompra.setToolTipText("No Items");
		this.jLabelnumero_itemsCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_itemsCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_itemsCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_itemsCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_itemsCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_itemsCompra.setToolTipText(CompraConstantesFunciones.LABEL_NUMEROITEMS);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelnumero_itemsCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldnumero_itemsCompra= new JTextFieldMe();
		jTextFieldnumero_itemsCompra.setEnabled(false);
		jTextFieldnumero_itemsCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_itemsCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_itemsCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_itemsCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_itemsCompra.setText("0");

		this.jButtonnumero_itemsCompraBusqueda= new JButtonMe();
		this.jButtonnumero_itemsCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_itemsCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_itemsCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_itemsCompraBusqueda.setText("U");
		this.jButtonnumero_itemsCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_itemsCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_itemsCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_itemsCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_itemsCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_itemsCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_itemsCompraBusqueda.setVisible(false);		}


					
		this.jLabelretencionCompra = new JLabelMe();
		this.jLabelretencionCompra.setText(""+CompraConstantesFunciones.LABEL_RETENCION+" : *");
		this.jLabelretencionCompra.setToolTipText("Retencion");
		this.jLabelretencionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencionCompra.setToolTipText(CompraConstantesFunciones.LABEL_RETENCION);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelretencionCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldretencionCompra= new JTextFieldMe();
		jTextFieldretencionCompra.setEnabled(false);
		jTextFieldretencionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencionCompra.setText("0.0");

		this.jButtonretencionCompraBusqueda= new JButtonMe();
		this.jButtonretencionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencionCompraBusqueda.setText("U");
		this.jButtonretencionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencionCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencionCompraBusqueda.setVisible(false);		}


					
		this.jLabeltotalCompra = new JLabelMe();
		this.jLabeltotalCompra.setText(""+CompraConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalCompra.setToolTipText("Total");
		this.jLabeltotalCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalCompra.setToolTipText(CompraConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPaneltotalCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldtotalCompra= new JTextFieldMe();
		jTextFieldtotalCompra.setEnabled(false);
		jTextFieldtotalCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalCompra.setText("0.0");

		this.jButtontotalCompraBusqueda= new JButtonMe();
		this.jButtontotalCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalCompraBusqueda.setText("U");
		this.jButtontotalCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalCompraBusqueda.setVisible(false);		}


					
		this.jLabelfleteCompra = new JLabelMe();
		this.jLabelfleteCompra.setText(""+CompraConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteCompra.setToolTipText("Flete");
		this.jLabelfleteCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteCompra.setToolTipText(CompraConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelfleteCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldfleteCompra= new JTextFieldMe();
		jTextFieldfleteCompra.setEnabled(false);
		jTextFieldfleteCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteCompra.setText("0.0");

		this.jButtonfleteCompraBusqueda= new JButtonMe();
		this.jButtonfleteCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteCompraBusqueda.setText("U");
		this.jButtonfleteCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteCompraBusqueda.setVisible(false);		}


					
		this.jLabelimpuestoCompra = new JLabelMe();
		this.jLabelimpuestoCompra.setText(""+CompraConstantesFunciones.LABEL_IMPUESTO+" : *");
		this.jLabelimpuestoCompra.setToolTipText("Impuesto");
		this.jLabelimpuestoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuestoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuestoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuestoCompra.setToolTipText(CompraConstantesFunciones.LABEL_IMPUESTO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelimpuestoCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldimpuestoCompra= new JTextFieldMe();
		jTextFieldimpuestoCompra.setEnabled(false);
		jTextFieldimpuestoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuestoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuestoCompra.setText("0.0");

		this.jButtonimpuestoCompraBusqueda= new JButtonMe();
		this.jButtonimpuestoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuestoCompraBusqueda.setText("U");
		this.jButtonimpuestoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuestoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuestoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuestoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuestoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuestoCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuestoCompraBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteCompra = new JLabelMe();
		this.jLabelnumero_comprobanteCompra.setText(""+CompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" :");
		this.jLabelnumero_comprobanteCompra.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteCompra.setToolTipText(CompraConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelnumero_comprobanteCompra.setLayout(this.gridaBagLayoutCompra);


		jTextFieldnumero_comprobanteCompra= new JTextFieldMe();

		jTextFieldnumero_comprobanteCompra.setEnabled(false);
		jTextFieldnumero_comprobanteCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteCompraBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteCompraBusqueda.setText("U");
		this.jButtonnumero_comprobanteCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteCompraBusqueda.setVisible(false);		}


					
		this.jLabelfechaCompra = new JLabelMe();
		this.jLabelfechaCompra.setText(""+CompraConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaCompra.setToolTipText("Fecha");
		this.jLabelfechaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaCompra.setToolTipText(CompraConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelfechaCompra.setLayout(this.gridaBagLayoutCompra);


		//jFormattedTextFieldfechaCompra= new JFormattedTextFieldMe();

		jDateChooserfechaCompra= new JDateChooser();
		jDateChooserfechaCompra.setEnabled(false);
		jDateChooserfechaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaCompra.setDate(new Date());
		jDateChooserfechaCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaCompraBusqueda= new JButtonMe();
		this.jButtonfechaCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaCompraBusqueda.setText("U");
		this.jButtonfechaCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaCompra = new JLabelMe();
		this.jLabelid_empresaCompra.setText(""+CompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaCompra.setToolTipText("Empresa");
		this.jLabelid_empresaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_empresaCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_empresaCompra= new JComboBoxMe();
		jComboBoxid_empresaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaCompra.setEnabled(false);

		this.jButtonid_empresaCompra= new JButtonMe();
		this.jButtonid_empresaCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaCompra.setText("Buscar");
		this.jButtonid_empresaCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCompra"));

		this.jButtonid_empresaCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCompraBusqueda.setText("U");
		this.jButtonid_empresaCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaCompraUpdate= new JButtonMe();
		this.jButtonid_empresaCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaCompraUpdate.setText("U");
		this.jButtonid_empresaCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaCompraUpdate"));



					
		this.jLabelid_sucursalCompra = new JLabelMe();
		this.jLabelid_sucursalCompra.setText(""+CompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_sucursalCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_sucursalCompra= new JComboBoxMe();
		jComboBoxid_sucursalCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalCompra.setEnabled(false);

		this.jButtonid_sucursalCompra= new JButtonMe();
		this.jButtonid_sucursalCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalCompra.setText("Buscar");
		this.jButtonid_sucursalCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCompra"));

		this.jButtonid_sucursalCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCompraBusqueda.setText("U");
		this.jButtonid_sucursalCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalCompraUpdate.setText("U");
		this.jButtonid_sucursalCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalCompraUpdate"));



					
		this.jLabelid_moduloCompra = new JLabelMe();
		this.jLabelid_moduloCompra.setText(""+CompraConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloCompra.setToolTipText("Modulo");
		this.jLabelid_moduloCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_moduloCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_moduloCompra= new JComboBoxMe();
		jComboBoxid_moduloCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloCompra.setEnabled(false);

		this.jButtonid_moduloCompra= new JButtonMe();
		this.jButtonid_moduloCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloCompra.setText("Buscar");
		this.jButtonid_moduloCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloCompra"));

		this.jButtonid_moduloCompraBusqueda= new JButtonMe();
		this.jButtonid_moduloCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloCompraBusqueda.setText("U");
		this.jButtonid_moduloCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloCompraBusqueda.setVisible(false);		}

		this.jButtonid_moduloCompraUpdate= new JButtonMe();
		this.jButtonid_moduloCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloCompraUpdate.setText("U");
		this.jButtonid_moduloCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloCompraUpdate"));



					
		this.jLabelid_ejercicioCompra = new JLabelMe();
		this.jLabelid_ejercicioCompra.setText(""+CompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_ejercicioCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_ejercicioCompra= new JComboBoxMe();
		jComboBoxid_ejercicioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioCompra.setEnabled(false);

		this.jButtonid_ejercicioCompra= new JButtonMe();
		this.jButtonid_ejercicioCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioCompra.setText("Buscar");
		this.jButtonid_ejercicioCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCompra"));

		this.jButtonid_ejercicioCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCompraBusqueda.setText("U");
		this.jButtonid_ejercicioCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioCompraUpdate.setText("U");
		this.jButtonid_ejercicioCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioCompraUpdate"));



					
		this.jLabelid_periodoCompra = new JLabelMe();
		this.jLabelid_periodoCompra.setText(""+CompraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoCompra.setToolTipText("Periodo");
		this.jLabelid_periodoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_periodoCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_periodoCompra= new JComboBoxMe();
		jComboBoxid_periodoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoCompra.setEnabled(false);

		this.jButtonid_periodoCompra= new JButtonMe();
		this.jButtonid_periodoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoCompra.setText("Buscar");
		this.jButtonid_periodoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoCompra"));

		this.jButtonid_periodoCompraBusqueda= new JButtonMe();
		this.jButtonid_periodoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoCompraBusqueda.setText("U");
		this.jButtonid_periodoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoCompraBusqueda.setVisible(false);		}

		this.jButtonid_periodoCompraUpdate= new JButtonMe();
		this.jButtonid_periodoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoCompraUpdate.setText("U");
		this.jButtonid_periodoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoCompraUpdate"));



					
		this.jLabelid_anioCompra = new JLabelMe();
		this.jLabelid_anioCompra.setText(""+CompraConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioCompra.setToolTipText("Anio");
		this.jLabelid_anioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_anioCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_anioCompra= new JComboBoxMe();
		jComboBoxid_anioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioCompra.setEnabled(false);

		this.jButtonid_anioCompra= new JButtonMe();
		this.jButtonid_anioCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioCompra.setText("Buscar");
		this.jButtonid_anioCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioCompra"));

		this.jButtonid_anioCompraBusqueda= new JButtonMe();
		this.jButtonid_anioCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioCompraBusqueda.setText("U");
		this.jButtonid_anioCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioCompraBusqueda.setVisible(false);		}

		this.jButtonid_anioCompraUpdate= new JButtonMe();
		this.jButtonid_anioCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioCompraUpdate.setText("U");
		this.jButtonid_anioCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioCompraUpdate"));



					
		this.jLabelid_mesCompra = new JLabelMe();
		this.jLabelid_mesCompra.setText(""+CompraConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesCompra.setToolTipText("Mes");
		this.jLabelid_mesCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_mesCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_mesCompra= new JComboBoxMe();
		jComboBoxid_mesCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesCompra.setEnabled(false);

		this.jButtonid_mesCompra= new JButtonMe();
		this.jButtonid_mesCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesCompra.setText("Buscar");
		this.jButtonid_mesCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesCompra"));

		this.jButtonid_mesCompraBusqueda= new JButtonMe();
		this.jButtonid_mesCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesCompraBusqueda.setText("U");
		this.jButtonid_mesCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesCompraBusqueda.setVisible(false);		}

		this.jButtonid_mesCompraUpdate= new JButtonMe();
		this.jButtonid_mesCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesCompraUpdate.setText("U");
		this.jButtonid_mesCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesCompraUpdate"));



					
		this.jLabelid_usuarioCompra = new JLabelMe();
		this.jLabelid_usuarioCompra.setText(""+CompraConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioCompra.setToolTipText("Usuario");
		this.jLabelid_usuarioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_usuarioCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_usuarioCompra= new JComboBoxMe();
		jComboBoxid_usuarioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioCompra.setEnabled(false);

		this.jButtonid_usuarioCompra= new JButtonMe();
		this.jButtonid_usuarioCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioCompra.setText("Buscar");
		this.jButtonid_usuarioCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCompra"));

		this.jButtonid_usuarioCompraBusqueda= new JButtonMe();
		this.jButtonid_usuarioCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCompraBusqueda.setText("U");
		this.jButtonid_usuarioCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioCompraBusqueda.setVisible(false);		}

		this.jButtonid_usuarioCompraUpdate= new JButtonMe();
		this.jButtonid_usuarioCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioCompraUpdate.setText("U");
		this.jButtonid_usuarioCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioCompraUpdate"));



					
		this.jLabelid_monedaCompra = new JLabelMe();
		this.jLabelid_monedaCompra.setText(""+CompraConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaCompra.setToolTipText("Moneda");
		this.jLabelid_monedaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_monedaCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_monedaCompra= new JComboBoxMe();
		jComboBoxid_monedaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaCompra= new JButtonMe();
		this.jButtonid_monedaCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaCompra.setText("Buscar");
		this.jButtonid_monedaCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaCompra"));

		this.jButtonid_monedaCompraBusqueda= new JButtonMe();
		this.jButtonid_monedaCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaCompraBusqueda.setText("U");
		this.jButtonid_monedaCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaCompraBusqueda.setVisible(false);		}

		this.jButtonid_monedaCompraUpdate= new JButtonMe();
		this.jButtonid_monedaCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaCompraUpdate.setText("U");
		this.jButtonid_monedaCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaCompraUpdate"));



					
		this.jLabelid_tipo_cambioCompra = new JLabelMe();
		this.jLabelid_tipo_cambioCompra.setText(""+CompraConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioCompra.setToolTipText("T Cambio");
		this.jLabelid_tipo_cambioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_tipo_cambioCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_tipo_cambioCompra= new JComboBoxMe();
		jComboBoxid_tipo_cambioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cambioCompra= new JButtonMe();
		this.jButtonid_tipo_cambioCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioCompra.setText("Buscar");
		this.jButtonid_tipo_cambioCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioCompra"));

		this.jButtonid_tipo_cambioCompraBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioCompraBusqueda.setText("U");
		this.jButtonid_tipo_cambioCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioCompraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioCompraUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioCompraUpdate.setText("U");
		this.jButtonid_tipo_cambioCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioCompraUpdate"));



					
		this.jLabelid_estado_inventarioCompra = new JLabelMe();
		this.jLabelid_estado_inventarioCompra.setText(""+CompraConstantesFunciones.LABEL_IDESTADOINVENTARIO+" : *");
		this.jLabelid_estado_inventarioCompra.setToolTipText("Estado");
		this.jLabelid_estado_inventarioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_inventarioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_inventarioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_inventarioCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_inventarioCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_inventarioCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDESTADOINVENTARIO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_estado_inventarioCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_estado_inventarioCompra= new JComboBoxMe();
		jComboBoxid_estado_inventarioCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_inventarioCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_inventarioCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_inventarioCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_inventarioCompra.setEnabled(false);

		this.jButtonid_estado_inventarioCompra= new JButtonMe();
		this.jButtonid_estado_inventarioCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_inventarioCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_inventarioCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_inventarioCompra.setText("Buscar");
		this.jButtonid_estado_inventarioCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_inventarioCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_inventarioCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_inventarioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_inventarioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_inventarioCompra"));

		this.jButtonid_estado_inventarioCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_inventarioCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_inventarioCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_inventarioCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_inventarioCompraBusqueda.setText("U");
		this.jButtonid_estado_inventarioCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_inventarioCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_inventarioCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_inventarioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_inventarioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_inventarioCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_inventarioCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_inventarioCompraUpdate= new JButtonMe();
		this.jButtonid_estado_inventarioCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_inventarioCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_inventarioCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_inventarioCompraUpdate.setText("U");
		this.jButtonid_estado_inventarioCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_inventarioCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_inventarioCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_inventarioCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_inventarioCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_inventarioCompraUpdate"));



					
		this.jLabelid_clienteCompra = new JLabelMe();
		this.jLabelid_clienteCompra.setText(""+CompraConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteCompra.setToolTipText("Proveedor");
		this.jLabelid_clienteCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_clienteCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_clienteCompra= new JComboBoxMe();
		jComboBoxid_clienteCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteCompra= new JButtonMe();
		this.jButtonid_clienteCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteCompra.setText("Buscar");
		this.jButtonid_clienteCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCompra"));

		this.jButtonid_clienteCompraBusqueda= new JButtonMe();
		this.jButtonid_clienteCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCompraBusqueda.setText("U");
		this.jButtonid_clienteCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteCompraBusqueda.setVisible(false);		}

		this.jButtonid_clienteCompraUpdate= new JButtonMe();
		this.jButtonid_clienteCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteCompraUpdate.setText("U");
		this.jButtonid_clienteCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteCompraUpdate"));



					
		this.jLabelid_formatoCompra = new JLabelMe();
		this.jLabelid_formatoCompra.setText(""+CompraConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoCompra.setToolTipText("Formato");
		this.jLabelid_formatoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_formatoCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_formatoCompra= new JComboBoxMe();
		jComboBoxid_formatoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoCompra= new JButtonMe();
		this.jButtonid_formatoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoCompra.setText("Buscar");
		this.jButtonid_formatoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoCompra"));

		this.jButtonid_formatoCompraBusqueda= new JButtonMe();
		this.jButtonid_formatoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoCompraBusqueda.setText("U");
		this.jButtonid_formatoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoCompraBusqueda.setVisible(false);		}

		this.jButtonid_formatoCompraUpdate= new JButtonMe();
		this.jButtonid_formatoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoCompraUpdate.setText("U");
		this.jButtonid_formatoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoCompraUpdate"));



					
		this.jLabelid_empleadoCompra = new JLabelMe();
		this.jLabelid_empleadoCompra.setText(""+CompraConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoCompra.setToolTipText("Empleado");
		this.jLabelid_empleadoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_empleadoCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_empleadoCompra= new JComboBoxMe();
		jComboBoxid_empleadoCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoCompra= new JButtonMe();
		this.jButtonid_empleadoCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoCompra.setText("Buscar");
		this.jButtonid_empleadoCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCompra"));

		this.jButtonid_empleadoCompraBusqueda= new JButtonMe();
		this.jButtonid_empleadoCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCompraBusqueda.setText("U");
		this.jButtonid_empleadoCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoCompraBusqueda.setVisible(false);		}

		this.jButtonid_empleadoCompraUpdate= new JButtonMe();
		this.jButtonid_empleadoCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoCompraUpdate.setText("U");
		this.jButtonid_empleadoCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoCompraUpdate"));



					
		this.jLabelid_transportistaCompra = new JLabelMe();
		this.jLabelid_transportistaCompra.setText(""+CompraConstantesFunciones.LABEL_IDTRANSPORTISTA+" :");
		this.jLabelid_transportistaCompra.setToolTipText("Transportista");
		this.jLabelid_transportistaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_transportistaCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_transportistaCompra= new JComboBoxMe();
		jComboBoxid_transportistaCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportistaCompra= new JButtonMe();
		this.jButtonid_transportistaCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaCompra.setText("Buscar");
		this.jButtonid_transportistaCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaCompra"));

		this.jButtonid_transportistaCompraBusqueda= new JButtonMe();
		this.jButtonid_transportistaCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaCompraBusqueda.setText("U");
		this.jButtonid_transportistaCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaCompraBusqueda.setVisible(false);		}

		this.jButtonid_transportistaCompraUpdate= new JButtonMe();
		this.jButtonid_transportistaCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaCompraUpdate.setText("U");
		this.jButtonid_transportistaCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaCompraUpdate"));



					
		this.jLabelid_orden_compraCompra = new JLabelMe();
		this.jLabelid_orden_compraCompra.setText(""+CompraConstantesFunciones.LABEL_IDORDENCOMPRA+" :");
		this.jLabelid_orden_compraCompra.setToolTipText("Orden Compra");
		this.jLabelid_orden_compraCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_compraCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_orden_compraCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_orden_compraCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_orden_compraCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_orden_compraCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDORDENCOMPRA);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_orden_compraCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_orden_compraCompra= new JComboBoxMe();
		jComboBoxid_orden_compraCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_orden_compraCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_orden_compraCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_orden_compraCompra= new JButtonMe();
		this.jButtonid_orden_compraCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_orden_compraCompra.setText("Buscar");
		this.jButtonid_orden_compraCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_orden_compraCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_orden_compraCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraCompra"));

		this.jButtonid_orden_compraCompraBusqueda= new JButtonMe();
		this.jButtonid_orden_compraCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_compraCompraBusqueda.setText("U");
		this.jButtonid_orden_compraCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_orden_compraCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_orden_compraCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_orden_compraCompraBusqueda.setVisible(false);		}

		this.jButtonid_orden_compraCompraUpdate= new JButtonMe();
		this.jButtonid_orden_compraCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_orden_compraCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_orden_compraCompraUpdate.setText("U");
		this.jButtonid_orden_compraCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_orden_compraCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_orden_compraCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraCompraUpdate"));


		jButtonid_orden_compraCompraArbol= new JButtonMe();
		jButtonid_orden_compraCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_orden_compraCompraArbol.setText("Arbol");
		jButtonid_orden_compraCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_orden_compraCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_orden_compraCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_orden_compraCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_orden_compraCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_orden_compraCompraArbol"));



					
		this.jLabelid_pedido_compraCompra = new JLabelMe();
		this.jLabelid_pedido_compraCompra.setText(""+CompraConstantesFunciones.LABEL_IDPEDIDOCOMPRA+" :");
		this.jLabelid_pedido_compraCompra.setToolTipText("Pedido Compra");
		this.jLabelid_pedido_compraCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedido_compraCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedido_compraCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_compraCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pedido_compraCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pedido_compraCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDPEDIDOCOMPRA);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_pedido_compraCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_pedido_compraCompra= new JComboBoxMe();
		jComboBoxid_pedido_compraCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compraCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compraCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_compraCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pedido_compraCompra= new JButtonMe();
		this.jButtonid_pedido_compraCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compraCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compraCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compraCompra.setText("Buscar");
		this.jButtonid_pedido_compraCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pedido_compraCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compraCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pedido_compraCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compraCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compraCompra"));

		this.jButtonid_pedido_compraCompraBusqueda= new JButtonMe();
		this.jButtonid_pedido_compraCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compraCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compraCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_compraCompraBusqueda.setText("U");
		this.jButtonid_pedido_compraCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pedido_compraCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compraCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pedido_compraCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compraCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compraCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pedido_compraCompraBusqueda.setVisible(false);		}

		this.jButtonid_pedido_compraCompraUpdate= new JButtonMe();
		this.jButtonid_pedido_compraCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compraCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compraCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_compraCompraUpdate.setText("U");
		this.jButtonid_pedido_compraCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pedido_compraCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compraCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pedido_compraCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compraCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compraCompraUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloCompra = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloCompra.setText(""+CompraConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloCompra.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_tipo_transaccion_moduloCompra= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloCompra.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloCompra= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloCompra.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloCompra"));

		this.jButtonid_tipo_transaccion_moduloCompraBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloCompraBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloCompraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloCompraUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloCompraUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloCompraUpdate"));



					
		this.jLabelid_asiento_contableCompra = new JLabelMe();
		this.jLabelid_asiento_contableCompra.setText(""+CompraConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableCompra.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableCompra.setToolTipText(CompraConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutCompra = new GridBagLayout();
		this.jPanelid_asiento_contableCompra.setLayout(this.gridaBagLayoutCompra);


		jComboBoxid_asiento_contableCompra= new JComboBoxMe();
		jComboBoxid_asiento_contableCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableCompra.setEnabled(false);

		this.jButtonid_asiento_contableCompra= new JButtonMe();
		this.jButtonid_asiento_contableCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableCompra.setText("Buscar");
		this.jButtonid_asiento_contableCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableCompra"));

		this.jButtonid_asiento_contableCompraBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableCompraBusqueda.setText("U");
		this.jButtonid_asiento_contableCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableCompraBusqueda"));

		if(this.compraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableCompraBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableCompraUpdate= new JButtonMe();
		this.jButtonid_asiento_contableCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableCompraUpdate.setText("U");
		this.jButtonid_asiento_contableCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableCompraUpdate"));



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
		//this.jInternalFrameDetalleCompra = new CompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutCompra= new GridBagLayout();
		

		
		String sToolTipCompra="";
		sToolTipCompra=CompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipCompra+="(Inventario.Compra)";
		}
		
		if(!this.compraSessionBean.getEsGuardarRelacionado()) {
			sToolTipCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoCompra = new JButtonMe();
		this.jButtonModificarCompra = new JButtonMe();
        this.jButtonActualizarCompra = new JButtonMe();
        this.jButtonEliminarCompra = new JButtonMe();
        this.jButtonCancelarCompra = new JButtonMe();
        this.jButtonGuardarCambiosCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaCompra = new JButtonMe();
		this.jButtonCerrarCompra = new JButtonMe();
		
		this.jScrollPanelDatosCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralCompra = new JScrollPane();
				
		
		
		this.jPanelCamposCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocoaCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Compra";
		
		if(!this.compraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposCompra.setName("jPanelCamposCompra"); 

		this.jPanelCamposOcultosCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosCompra.setName("jPanelCamposOcultosCompra"); 

        this.jPanelAccionesCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesCompra.setToolTipText("Acciones");
        this.jPanelAccionesCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalCompra.setName("jPanelCamposFintotalCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciogeneralCompra.setName("jPanelCamposFingeneralCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciocoaCompra.setName("jPanelCamposFincoaCompra");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocoaCompra, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoCompra.setText("Nuevo");
		this.jButtonModificarCompra.setText("Editar");
        this.jButtonActualizarCompra.setText("Actualizar");
        this.jButtonEliminarCompra.setText("Eliminar");
        this.jButtonCancelarCompra.setText("Cancelar");
        this.jButtonGuardarCambiosCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaCompra.setText("Guardar");
		this.jButtonCerrarCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoCompra,"nuevo_button","Nuevo",this.compraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarCompra,"modificar_button","Editar",this.compraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarCompra,"actualizar_button","Actualizar",this.compraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarCompra,"eliminar_button","Eliminar",this.compraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarCompra,"cancelar_button","Cancelar",this.compraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosCompra,"guardarcambios_button","Guardar",this.compraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaCompra,"guardarcambiostabla_button","Guardar",this.compraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarCompra,"cerrar_button","Salir",this.compraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoCompra.setToolTipText("Nuevo"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarCompra.setToolTipText("Editar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarCompra.setToolTipText("Actualizar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarCompra.setToolTipText("Eliminar)"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarCompra.setToolTipText("Cancelar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosCompra.setToolTipText("Guardar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaCompra.setToolTipText("Guardar"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarCompra.setToolTipText("Salir"+" "+CompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoCompra";
		inputMap = this.jButtonNuevoCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarCompra";
		inputMap = this.jButtonActualizarCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarCompra";
		inputMap = this.jButtonEliminarCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarCompra";
		inputMap = this.jButtonCancelarCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarCompra"));
		
		//CERRAR		
		sMapKey = "CerrarCompra";
		inputMap = this.jButtonCerrarCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaCompra";
		inputMap = this.jButtonGuardarCambiosTablaCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoCompra.setToolTipText("Nuevo Compra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarCompra.setToolTipText("Sin Cerrar Ventana Compra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesCompra.setText("Accion");
		this.jComboBoxTiposAccionesCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesCompra = new JLabelMe();
		
		this.jLabelAccionesCompra.setText("Acciones");		
		this.jLabelAccionesCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosCompra = new GridBagLayout();
		
		this.jPanelCamposCompra.setLayout(gridaBagLayoutCamposCompra);
		this.jPanelCamposOcultosCompra.setLayout(gridaBagLayoutCamposOcultosCompra);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalCompra= new GridBagLayout();
		this.jPanelCamposFintotalCompra.setLayout(gridaBagLayoutCamposFintotalCompra);

		GridBagLayout gridaBagLayoutCamposIniciogeneralCompra= new GridBagLayout();
		this.jPanelCamposIniciogeneralCompra.setLayout(gridaBagLayoutCamposIniciogeneralCompra);

		GridBagLayout gridaBagLayoutCamposIniciocoaCompra= new GridBagLayout();
		this.jPanelCamposIniciocoaCompra.setLayout(gridaBagLayoutCamposIniciocoaCompra);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidCompra.add(jLabelIdCompra, this.gridBagConstraintsCompra);



	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidCompra.add(jLabelidCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaCompra.add(jLabelid_empresaCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCompra.add(jButtonid_empresaCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaCompra.add(jButtonid_empresaCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaCompra.add(jComboBoxid_empresaCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalCompra.add(jLabelid_sucursalCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCompra.add(jButtonid_sucursalCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalCompra.add(jButtonid_sucursalCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalCompra.add(jComboBoxid_sucursalCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloCompra.add(jLabelid_moduloCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloCompra.add(jButtonid_moduloCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloCompra.add(jButtonid_moduloCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloCompra.add(jComboBoxid_moduloCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioCompra.add(jLabelid_ejercicioCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCompra.add(jButtonid_ejercicioCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioCompra.add(jButtonid_ejercicioCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioCompra.add(jComboBoxid_ejercicioCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoCompra.add(jLabelid_periodoCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoCompra.add(jButtonid_periodoCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoCompra.add(jButtonid_periodoCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoCompra.add(jComboBoxid_periodoCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioCompra.add(jLabelid_anioCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioCompra.add(jButtonid_anioCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioCompra.add(jButtonid_anioCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioCompra.add(jComboBoxid_anioCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesCompra.add(jLabelid_mesCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesCompra.add(jButtonid_mesCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesCompra.add(jButtonid_mesCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesCompra.add(jComboBoxid_mesCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioCompra.add(jLabelid_usuarioCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCompra.add(jButtonid_usuarioCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioCompra.add(jButtonid_usuarioCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioCompra.add(jComboBoxid_usuarioCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionCompra.add(jLabelfecha_emisionCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionCompra.add(jButtonfecha_emisionCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionCompra.add(jDateChooserfecha_emisionCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_entregaCompra.add(jLabelfecha_entregaCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaCompra.add(jButtonfecha_entregaCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_entregaCompra.add(jDateChooserfecha_entregaCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_secuencialCompra.add(jLabelnumero_secuencialCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialCompra.add(jButtonnumero_secuencialCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_secuencialCompra.add(jTextFieldnumero_secuencialCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaCompra.add(jLabelid_monedaCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaCompra.add(jButtonid_monedaCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaCompra.add(jButtonid_monedaCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaCompra.add(jComboBoxid_monedaCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_cambioCompra.add(jLabelid_tipo_cambioCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCompra = new GridBagConstraints();
	//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 2;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioCompra.add(jButtonid_tipo_cambioCompra, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioCompra.add(jButtonid_tipo_cambioCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 4;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioCompra.add(jButtonid_tipo_cambioCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_cambioCompra.add(jComboBoxid_tipo_cambioCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_inventarioCompra.add(jLabelid_estado_inventarioCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_inventarioCompra.add(jButtonid_estado_inventarioCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_inventarioCompra.add(jButtonid_estado_inventarioCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_inventarioCompra.add(jComboBoxid_estado_inventarioCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteCompra.add(jLabelid_clienteCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCompra = new GridBagConstraints();
	//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 2;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteCompra.add(jButtonid_clienteCompra, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCompra.add(jButtonid_clienteCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 4;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteCompra.add(jButtonid_clienteCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteCompra.add(jComboBoxid_clienteCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoCompra.add(jLabelid_formatoCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoCompra.add(jButtonid_formatoCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoCompra.add(jButtonid_formatoCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoCompra.add(jComboBoxid_formatoCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleadoCompra.add(jLabelid_empleadoCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCompra = new GridBagConstraints();
	//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 2;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoCompra.add(jButtonid_empleadoCompra, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCompra.add(jButtonid_empleadoCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 4;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoCompra.add(jButtonid_empleadoCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleadoCompra.add(jComboBoxid_empleadoCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_facturaCompra.add(jLabelnumero_facturaCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaCompra.add(jButtonnumero_facturaCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_facturaCompra.add(jTextFieldnumero_facturaCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transportistaCompra.add(jLabelid_transportistaCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaCompra.add(jButtonid_transportistaCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaCompra.add(jButtonid_transportistaCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transportistaCompra.add(jComboBoxid_transportistaCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionCompra.add(jLabeldescripcionCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionCompra.add(jButtondescripcionCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionCompra.add(jscrollPanedescripcionCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_orden_compraCompra.add(jLabelid_orden_compraCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCompra = new GridBagConstraints();
	//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 2;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_orden_compraCompra.add(jButtonid_orden_compraCompra, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCompra = new GridBagConstraints();
	//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 3;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_orden_compraCompra.add(jButtonid_orden_compraCompraArbol, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 4;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_compraCompra.add(jButtonid_orden_compraCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 5;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_orden_compraCompra.add(jButtonid_orden_compraCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_orden_compraCompra.add(jComboBoxid_orden_compraCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_pedido_compraCompra.add(jLabelid_pedido_compraCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCompra = new GridBagConstraints();
	//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 2;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_pedido_compraCompra.add(jButtonid_pedido_compraCompra, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_compraCompra.add(jButtonid_pedido_compraCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 4;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_compraCompra.add(jButtonid_pedido_compraCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_pedido_compraCompra.add(jComboBoxid_pedido_compraCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelautori_usuarioCompra.add(jLabelautori_usuarioCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelautori_usuarioCompra.add(jButtonautori_usuarioCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelautori_usuarioCompra.add(jTextFieldautori_usuarioCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfactura_inicialCompra.add(jLabelfactura_inicialCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfactura_inicialCompra.add(jButtonfactura_inicialCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfactura_inicialCompra.add(jTextFieldfactura_inicialCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfactura_finalCompra.add(jLabelfactura_finalCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfactura_finalCompra.add(jButtonfactura_finalCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfactura_finalCompra.add(jTextFieldfactura_finalCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelservicio_documentoCompra.add(jLabelservicio_documentoCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelservicio_documentoCompra.add(jButtonservicio_documentoCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelservicio_documentoCompra.add(jTextFieldservicio_documentoCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_valorCompra.add(jLabelfecha_valorCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_valorCompra.add(jButtonfecha_valorCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_valorCompra.add(jDateChooserfecha_valorCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelporcentaje_descuentoCompra.add(jLabelporcentaje_descuentoCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_descuentoCompra.add(jButtonporcentaje_descuentoCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelporcentaje_descuentoCompra.add(jTextFieldporcentaje_descuentoCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsumanCompra.add(jLabelsumanCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanCompra.add(jButtonsumanCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsumanCompra.add(jTextFieldsumanCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliceCompra.add(jLabeliceCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceCompra.add(jButtoniceCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliceCompra.add(jTextFieldiceCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_descuentoCompra.add(jLabelvalor_descuentoCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_descuentoCompra.add(jButtonvalor_descuentoCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_descuentoCompra.add(jTextFieldvalor_descuentoCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_descuentoCompra.add(jLabeltotal_descuentoCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoCompra.add(jButtontotal_descuentoCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_descuentoCompra.add(jTextFieldtotal_descuentoCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaCompra.add(jLabelivaCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaCompra.add(jButtonivaCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaCompra.add(jTextFieldivaCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelstockCompra.add(jLabelstockCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelstockCompra.add(jButtonstockCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelstockCompra.add(jTextFieldstockCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsub_totalCompra.add(jLabelsub_totalCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalCompra.add(jButtonsub_totalCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsub_totalCompra.add(jTextFieldsub_totalCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_otroCompra.add(jLabeltotal_otroCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_otroCompra.add(jButtontotal_otroCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_otroCompra.add(jTextFieldtotal_otroCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelultimo_costoCompra.add(jLabelultimo_costoCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelultimo_costoCompra.add(jButtonultimo_costoCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelultimo_costoCompra.add(jTextFieldultimo_costoCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_itemsCompra.add(jLabelnumero_itemsCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_itemsCompra.add(jButtonnumero_itemsCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_itemsCompra.add(jTextFieldnumero_itemsCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelretencionCompra.add(jLabelretencionCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencionCompra.add(jButtonretencionCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelretencionCompra.add(jTextFieldretencionCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalCompra.add(jLabeltotalCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalCompra.add(jButtontotalCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalCompra.add(jTextFieldtotalCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfleteCompra.add(jLabelfleteCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteCompra.add(jButtonfleteCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfleteCompra.add(jTextFieldfleteCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelimpuestoCompra.add(jLabelimpuestoCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuestoCompra.add(jButtonimpuestoCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelimpuestoCompra.add(jTextFieldimpuestoCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_transaccion_moduloCompra.add(jLabelid_tipo_transaccion_moduloCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloCompra.add(jButtonid_tipo_transaccion_moduloCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloCompra.add(jButtonid_tipo_transaccion_moduloCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_transaccion_moduloCompra.add(jComboBoxid_tipo_transaccion_moduloCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableCompra.add(jLabelid_asiento_contableCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsCompra = new GridBagConstraints();
	//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 2;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableCompra.add(jButtonid_asiento_contableCompra, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 3;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableCompra.add(jButtonid_asiento_contableCompraBusqueda, this.gridBagConstraintsCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 4;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableCompra.add(jButtonid_asiento_contableCompraUpdate, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableCompra.add(jComboBoxid_asiento_contableCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_comprobanteCompra.add(jLabelnumero_comprobanteCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteCompra.add(jButtonnumero_comprobanteCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_comprobanteCompra.add(jTextFieldnumero_comprobanteCompra, this.gridBagConstraintsCompra);


	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 0;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaCompra.add(jLabelfechaCompra, this.gridBagConstraintsCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsCompra = new GridBagConstraints();
		//this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = 2;
		this.gridBagConstraintsCompra.ipadx = 0;
		this.gridBagConstraintsCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaCompra.add(jButtonfechaCompraBusqueda, this.gridBagConstraintsCompra);
	}

	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsCompra.gridy = 0;
	this.gridBagConstraintsCompra.gridx = 1;
	this.gridBagConstraintsCompra.ipadx = 0;
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaCompra.add(jDateChooserfechaCompra, this.gridBagConstraintsCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelid_empresaCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelid_sucursalCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelid_moduloCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelid_ejercicioCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelid_periodoCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelid_anioCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelid_mesCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelid_usuarioCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelnumero_facturaCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelfleteCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelimpuestoCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelid_tipo_transaccion_moduloCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelid_asiento_contableCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelnumero_comprobanteCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposOcultosCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposOcultosCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosCompra.add(this.jPanelfechaCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposOcultosCompra % 3==0) {
		iXPanelCamposOcultosCompra=0;
		iYPanelCamposOcultosCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelidCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelfecha_emisionCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelfecha_entregaCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelnumero_secuencialCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelid_monedaCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelid_tipo_cambioCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelid_estado_inventarioCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelid_clienteCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelid_formatoCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelid_empleadoCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelid_transportistaCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPaneldescripcionCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelid_orden_compraCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciogeneralCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciogeneralCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralCompra.add(this.jPanelid_pedido_compraCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciogeneralCompra % 3==0) {
		iXPanelCamposIniciogeneralCompra=0;
		iYPanelCamposIniciogeneralCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciocoaCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciocoaCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocoaCompra.add(this.jPanelautori_usuarioCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciocoaCompra % 5==0) {
		iXPanelCamposIniciocoaCompra=0;
		iYPanelCamposIniciocoaCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciocoaCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciocoaCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocoaCompra.add(this.jPanelfactura_inicialCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciocoaCompra % 5==0) {
		iXPanelCamposIniciocoaCompra=0;
		iYPanelCamposIniciocoaCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciocoaCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciocoaCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocoaCompra.add(this.jPanelfactura_finalCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciocoaCompra % 5==0) {
		iXPanelCamposIniciocoaCompra=0;
		iYPanelCamposIniciocoaCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciocoaCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciocoaCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocoaCompra.add(this.jPanelservicio_documentoCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciocoaCompra % 5==0) {
		iXPanelCamposIniciocoaCompra=0;
		iYPanelCamposIniciocoaCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposIniciocoaCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposIniciocoaCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocoaCompra.add(this.jPanelfecha_valorCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposIniciocoaCompra % 5==0) {
		iXPanelCamposIniciocoaCompra=0;
		iYPanelCamposIniciocoaCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPanelporcentaje_descuentoCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPanelsumanCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPaneliceCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPanelvalor_descuentoCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPaneltotal_descuentoCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPanelivaCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPanelstockCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPanelsub_totalCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPaneltotal_otroCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPanelultimo_costoCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPanelnumero_itemsCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPanelretencionCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
	}
	this.gridBagConstraintsCompra = new GridBagConstraints();
	//NUM X EXTRA
	iXPanelCamposFintotalCompra+=2;
	this.gridBagConstraintsCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsCompra.gridy = iYPanelCamposFintotalCompra;
	this.gridBagConstraintsCompra.gridx = iXPanelCamposFintotalCompra++;
	this.gridBagConstraintsCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsCompra.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalCompra.add(this.jPaneltotalCompra, this.gridBagConstraintsCompra);



	if(iXPanelCamposFintotalCompra % 3==0) {
		iXPanelCamposFintotalCompra=0;
		iYPanelCamposFintotalCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesCompra= new GridBagLayout();
		this.jPanelAccionesCompra.setLayout(gridaBagLayoutAccionesCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioCompra= new GridBagLayout();
		this.jPanelAccionesFormularioCompra.setLayout(gridaBagLayoutAccionesFormularioCompra);
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCompra.add(this.jComboBoxTiposAccionesFormularioCompra, this.gridBagConstraintsCompra);

		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioCompra.add(this.jCheckBoxPostAccionNuevoCompra, this.gridBagConstraintsCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.compraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCompra.add(this.jCheckBoxPostAccionSinCerrarCompra, this.gridBagConstraintsCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.compraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.compraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioCompra.add(this.jCheckBoxPostAccionSinMensajeCompra, this.gridBagConstraintsCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesCompra.add(this.jButtonModificarCompra, this.gridBagConstraintsCompra);							

		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsCompra.gridy = 0;
		this.gridBagConstraintsCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesCompra.add(this.jButtonEliminarCompra, this.gridBagConstraintsCompra);
		
			
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = 0;		
		this.gridBagConstraintsCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesCompra.add(this.jButtonActualizarCompra, this.gridBagConstraintsCompra);


		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = 0;		
		this.gridBagConstraintsCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesCompra.add(this.jButtonGuardarCambiosCompra, this.gridBagConstraintsCompra);	
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = 0;		
		this.gridBagConstraintsCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesCompra.add(this.jButtonCancelarCompra, this.gridBagConstraintsCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.compraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsCompra = new GridBagConstraints();						
			this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsCompra.gridx = 0;		
			//this.gridBagConstraintsCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsCompra.gridx =0;
		this.gridBagConstraintsCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosCompra, this.gridBagConstraintsCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(CompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleCompra = new CompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			CompraModel compraModel=new CompraModel(this);
			
			//SI USARA CLASE INTERNA
			//CompraModel.CompraFocusTraversalPolicy compraFocusTraversalPolicy = compraModel.new CompraFocusTraversalPolicy(this);
			
			//compraFocusTraversalPolicy.setcompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(compraModel);
			
			
			this.jContentPaneDetalleCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleCompra = new GridBagLayout();	
			this.jContentPaneDetalleCompra.setLayout(gridaBagLayoutDetalleCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionCompra=   new JScrollPane(jContentPaneDetalleCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsCompra.gridx = 0;
	        
			this.jContentPaneDetalleCompra.add(jPanelCamposCompra, gridBagConstraintsCompra);
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsCompra.gridy = iGridyRelaciones++;
		this.gridBagConstraintsCompra.gridx = 0;

		this.jContentPaneDetalleCompra.add(jPanelCamposIniciogeneralCompra, gridBagConstraintsCompra);


		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsCompra.gridy = iGridyRelaciones++;
		this.gridBagConstraintsCompra.gridx = 0;

		this.jContentPaneDetalleCompra.add(jPanelCamposIniciocoaCompra, gridBagConstraintsCompra);
			
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
						&& compraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleCompra(this.puedeCargarPorParteDetalleCompra,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoInven(this.puedeCargarPorParteFormaPagoInven,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRetencionInven(this.puedeCargarPorParteRetencionInven,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(this.puedeCargarPorParteTransaccionLocal,false,-1);
					
					if(this.compraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsCompra= new GridBagConstraints();
						this.gridBagConstraintsCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsCompra.gridx = 0;
						this.jContentPaneDetalleCompra.add(this.jTabbedPaneRelacionesCompra, this.gridBagConstraintsCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesCompra.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleCompra(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoInven(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameRetencionInven(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameTransaccionLocal(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsCompra.gridy = iGridyRelaciones++;
		this.gridBagConstraintsCompra.gridx = 0;

		this.jContentPaneDetalleCompra.add(jPanelCamposFintotalCompra, gridBagConstraintsCompra);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsCompra = new GridBagConstraints();
					this.gridBagConstraintsCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsCompra.gridx = 0;
					
				
					this.jContentPaneDetalleCompra.add(jPanelCamposOcultosCompra, gridBagConstraintsCompra);
				
					this.jPanelCamposOcultosCompra.setVisible(true);
				}
			}					
			
			
			
			
			
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsCompra.gridy = iGridyRelaciones;//13;		
	        this.gridBagConstraintsCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleCompra.add(this.jPanelAccionesCompra, this.gridBagConstraintsCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionCompra=   new JScrollPane(this.jPanelCamposCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsCompra.gridx = 0;
			this.gridBagConstraintsCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionCompra, this.gridBagConstraintsCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioCompra, this.gridBagConstraintsCompra);			
			
			this.gridBagConstraintsCompra = new GridBagConstraints();
			this.gridBagConstraintsCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesCompra, this.gridBagConstraintsCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposCompra, this.gridBagConstraintsCompra);
			
			
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosCompra, this.gridBagConstraintsCompra);
		
			
		this.gridBagConstraintsCompra = new GridBagConstraints();
		this.gridBagConstraintsCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesCompra, this.gridBagConstraintsCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionCompra;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallecompraSessionBean=new DetalleCompraSessionBean();
		this.detallecompraSessionBean.setConGuardarRelaciones(false);
		this.detallecompraSessionBean.setEsGuardarRelacionado(true);

		this.detallecompraBeanSwingJInternalFrame=null;//new DetalleCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallecompraBeanSwingJInternalFramePopup=new DetalleCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallecompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallecompraSessionBean.getEsGuardarRelacionado()) {

				DetalleCompraJInternalFrame.STIPO_TAMANIO_GENERAL=CompraJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CompraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallecompraSessionBean.setEsGuardarRelacionado(true);

				this.detallecompraBeanSwingJInternalFrame=new DetalleCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallecompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallecompraBeanSwingJInternalFrame.setdetallecompraSessionBean(this.detallecompraSessionBean);

				//this.gridBagConstraintsCompra = new GridBagConstraints();
				//this.gridBagConstraintsCompra.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCompra.gridx = 0;
				//this.jContentPaneDetalleCompra.add(this.detallecompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCompra);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCompra.add("Detalle Compras",this.detallecompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCompra.setComponentAt(iIndexTab,this.detallecompraBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallecompraSessionBean.setEsGuardarRelacionado(false);
				this.detallecompraBeanSwingJInternalFrame=null;//new DetalleCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallecompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleCompra) {
					this.jTabbedPaneRelacionesCompra.add("Detalle Compras",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormaPagoInven(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formapagoinvenSessionBean=new FormaPagoInvenSessionBean();
		this.formapagoinvenSessionBean.setConGuardarRelaciones(false);
		this.formapagoinvenSessionBean.setEsGuardarRelacionado(true);

		this.formapagoinvenBeanSwingJInternalFrame=null;//new FormaPagoInvenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formapagoinvenBeanSwingJInternalFramePopup=new FormaPagoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formapagoinvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {

				FormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL=CompraJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CompraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagoinvenSessionBean.setEsGuardarRelacionado(true);

				this.formapagoinvenBeanSwingJInternalFrame=new FormaPagoInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagoinvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagoinvenBeanSwingJInternalFrame.setformapagoinvenSessionBean(this.formapagoinvenSessionBean);

				//this.gridBagConstraintsCompra = new GridBagConstraints();
				//this.gridBagConstraintsCompra.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCompra.gridx = 0;
				//this.jContentPaneDetalleCompra.add(this.formapagoinvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCompra);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCompra.add("Forma Pagoes",this.formapagoinvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCompra.setComponentAt(iIndexTab,this.formapagoinvenBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagoinvenSessionBean.setEsGuardarRelacionado(false);
				this.formapagoinvenBeanSwingJInternalFrame=null;//new FormaPagoInvenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagoinvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoInven) {
					this.jTabbedPaneRelacionesCompra.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameRetencionInven(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.retencioninvenSessionBean=new RetencionInvenSessionBean();
		this.retencioninvenSessionBean.setConGuardarRelaciones(false);
		this.retencioninvenSessionBean.setEsGuardarRelacionado(true);

		this.retencioninvenBeanSwingJInternalFrame=null;//new RetencionInvenBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.retencioninvenBeanSwingJInternalFramePopup=new RetencionInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.retencioninvenBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.retencioninvenSessionBean.getEsGuardarRelacionado()) {

				RetencionInvenJInternalFrame.STIPO_TAMANIO_GENERAL=CompraJInternalFrame.STIPO_TAMANIO_GENERAL;
				RetencionInvenJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CompraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.retencioninvenSessionBean.setEsGuardarRelacionado(true);

				this.retencioninvenBeanSwingJInternalFrame=new RetencionInvenBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.retencioninvenBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.retencioninvenBeanSwingJInternalFrame.setretencioninvenSessionBean(this.retencioninvenSessionBean);

				//this.gridBagConstraintsCompra = new GridBagConstraints();
				//this.gridBagConstraintsCompra.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCompra.gridx = 0;
				//this.jContentPaneDetalleCompra.add(this.retencioninvenBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCompra);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCompra.add("Retenciones",this.retencioninvenBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCompra.setComponentAt(iIndexTab,this.retencioninvenBeanSwingJInternalFrame.getContentPane());
				}

				//RetencionInvenJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.retencioninvenSessionBean.setEsGuardarRelacionado(false);
				this.retencioninvenBeanSwingJInternalFrame=null;//new RetencionInvenBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.retencioninvenSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteRetencionInven) {
					this.jTabbedPaneRelacionesCompra.add("Retenciones",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameTransaccionLocal(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.transaccionlocalSessionBean=new TransaccionLocalSessionBean();
		this.transaccionlocalSessionBean.setConGuardarRelaciones(false);
		this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

		this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.transaccionlocalBeanSwingJInternalFramePopup=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.transaccionlocalBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {

				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL=CompraJInternalFrame.STIPO_TAMANIO_GENERAL;
				TransaccionLocalJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=CompraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.transaccionlocalSessionBean.setEsGuardarRelacionado(true);

				this.transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.transaccionlocalBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.transaccionlocalBeanSwingJInternalFrame.settransaccionlocalSessionBean(this.transaccionlocalSessionBean);

				//this.gridBagConstraintsCompra = new GridBagConstraints();
				//this.gridBagConstraintsCompra.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsCompra.gridx = 0;
				//this.jContentPaneDetalleCompra.add(this.transaccionlocalBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsCompra);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesCompra.add("Transaccion Locales",this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesCompra.setComponentAt(iIndexTab,this.transaccionlocalBeanSwingJInternalFrame.getContentPane());
				}

				//TransaccionLocalJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.transaccionlocalSessionBean.setEsGuardarRelacionado(false);
				this.transaccionlocalBeanSwingJInternalFrame=null;//new TransaccionLocalBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.transaccionlocalSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteTransaccionLocal) {
					this.jTabbedPaneRelacionesCompra.add("Transaccion Locales",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarRetencionInvenBeanSwingJInternalFrame(List<Compra> compras,Compra compra,RetencionInvenBeanSwingJInternalFrame retencioninvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//retencioninvenBeanSwingJInternalFrame=new RetencionInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					retencioninvenBeanSwingJInternalFrame.getRetencionInvenLogic().setConnexion(this.compraLogic.getConnexion());

					retencioninvenBeanSwingJInternalFrame.setcomprasForeignKey(compras);
					retencioninvenBeanSwingJInternalFrame.setcompraForeignKey(compra);
					retencioninvenBeanSwingJInternalFrame.retencioninvenSessionBean.setisBusquedaDesdeForeignKeySesionCompra(true);
					retencioninvenBeanSwingJInternalFrame.retencioninvenSessionBean.setlidCompraActual(compra.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					retencioninvenBeanSwingJInternalFrame.cargarCombosForeignKeyRetencionInven(retencioninvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					retencioninvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaCompra(true);
					retencioninvenBeanSwingJInternalFrame.setid_compraFK_IdCompra(compra.getId());

					if(!this.conCargarFormDetalle) {
						retencioninvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					retencioninvenBeanSwingJInternalFrame.setSelectedItemCombosFrameCompraForeignKey(compra,1,false,true,true);
					retencioninvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					retencioninvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdCompra");
					retencioninvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCompra");
					retencioninvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaRetencionInven(true);
					retencioninvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesRetencionInven("n",retencioninvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, retencioninvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					retencioninvenBeanSwingJInternalFrame.setAutoscrolls(true);
					retencioninvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						retencioninvenBeanSwingJInternalFrame.actualizarEstadoPanelsRetencionInven("relacionado");
					} else {
						retencioninvenBeanSwingJInternalFrame.actualizarEstadoPanelsRetencionInven("no_relacionado");
					}

					retencioninvenBeanSwingJInternalFrame.getjButtonRecargarInformacionRetencionInven().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarTransaccionLocalBeanSwingJInternalFrame(List<Compra> compras,Compra compra,TransaccionLocalBeanSwingJInternalFrame transaccionlocalBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//transaccionlocalBeanSwingJInternalFrame=new TransaccionLocalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					transaccionlocalBeanSwingJInternalFrame.getTransaccionLocalLogic().setConnexion(this.compraLogic.getConnexion());

					transaccionlocalBeanSwingJInternalFrame.setcomprasForeignKey(compras);
					transaccionlocalBeanSwingJInternalFrame.setcompraForeignKey(compra);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setisBusquedaDesdeForeignKeySesionCompra(true);
					transaccionlocalBeanSwingJInternalFrame.transaccionlocalSessionBean.setlidCompraActual(compra.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					transaccionlocalBeanSwingJInternalFrame.cargarCombosForeignKeyTransaccionLocal(transaccionlocalBeanSwingJInternalFrame.isCargarCombosDependencia);
					transaccionlocalBeanSwingJInternalFrame.setVisibilidadBusquedasParaCompra(true);
					transaccionlocalBeanSwingJInternalFrame.setid_compraFK_IdCompra(compra.getId());

					if(!this.conCargarFormDetalle) {
						transaccionlocalBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					transaccionlocalBeanSwingJInternalFrame.setSelectedItemCombosFrameCompraForeignKey(compra,1,false,true,true);
					transaccionlocalBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					transaccionlocalBeanSwingJInternalFrame.procesarBusqueda("FK_IdCompra");
					transaccionlocalBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCompra");
					transaccionlocalBeanSwingJInternalFrame.inicializarActualizarBindingTablaTransaccionLocal(true);
					transaccionlocalBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesTransaccionLocal("n",transaccionlocalBeanSwingJInternalFrame.isGuardarCambiosEnLote, transaccionlocalBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					transaccionlocalBeanSwingJInternalFrame.setAutoscrolls(true);
					transaccionlocalBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("relacionado");
					} else {
						transaccionlocalBeanSwingJInternalFrame.actualizarEstadoPanelsTransaccionLocal("no_relacionado");
					}

					transaccionlocalBeanSwingJInternalFrame.getjButtonRecargarInformacionTransaccionLocal().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarFormaPagoInvenBeanSwingJInternalFrame(List<Compra> compras,Compra compra,FormaPagoInvenBeanSwingJInternalFrame formapagoinvenBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagoinvenBeanSwingJInternalFrame=new FormaPagoInvenBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagoinvenBeanSwingJInternalFrame.getFormaPagoInvenLogic().setConnexion(this.compraLogic.getConnexion());

					formapagoinvenBeanSwingJInternalFrame.setcomprasForeignKey(compras);
					formapagoinvenBeanSwingJInternalFrame.setcompraForeignKey(compra);
					formapagoinvenBeanSwingJInternalFrame.formapagoinvenSessionBean.setisBusquedaDesdeForeignKeySesionCompra(true);
					formapagoinvenBeanSwingJInternalFrame.formapagoinvenSessionBean.setlidCompraActual(compra.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagoinvenBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoInven(formapagoinvenBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagoinvenBeanSwingJInternalFrame.setVisibilidadBusquedasParaCompra(true);
					formapagoinvenBeanSwingJInternalFrame.setid_compraFK_IdCompra(compra.getId());

					if(!this.conCargarFormDetalle) {
						formapagoinvenBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagoinvenBeanSwingJInternalFrame.setSelectedItemCombosFrameCompraForeignKey(compra,1,false,true,true);
					formapagoinvenBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagoinvenBeanSwingJInternalFrame.procesarBusqueda("FK_IdCompra");
					formapagoinvenBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCompra");
					formapagoinvenBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoInven(true);
					formapagoinvenBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormaPagoInven("n",formapagoinvenBeanSwingJInternalFrame.isGuardarCambiosEnLote, formapagoinvenBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formapagoinvenBeanSwingJInternalFrame.setAutoscrolls(true);
					formapagoinvenBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formapagoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoInven("relacionado");
					} else {
						formapagoinvenBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoInven("no_relacionado");
					}

					formapagoinvenBeanSwingJInternalFrame.getjButtonRecargarInformacionFormaPagoInven().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleCompraBeanSwingJInternalFrame(List<Compra> compras,Compra compra,DetalleCompraBeanSwingJInternalFrame detallecompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallecompraBeanSwingJInternalFrame=new DetalleCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallecompraBeanSwingJInternalFrame.getDetalleCompraLogic().setConnexion(this.compraLogic.getConnexion());

					detallecompraBeanSwingJInternalFrame.setcomprasForeignKey(compras);
					detallecompraBeanSwingJInternalFrame.setcompraForeignKey(compra);
					detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.setisBusquedaDesdeForeignKeySesionCompra(true);
					detallecompraBeanSwingJInternalFrame.detallecompraSessionBean.setlidCompraActual(compra.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallecompraBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleCompra(detallecompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallecompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaCompra(true);
					detallecompraBeanSwingJInternalFrame.setid_compraFK_IdCompra(compra.getId());

					if(!this.conCargarFormDetalle) {
						detallecompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallecompraBeanSwingJInternalFrame.setSelectedItemCombosFrameCompraForeignKey(compra,1,false,true,true);
					detallecompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallecompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdCompra");
					detallecompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdCompra");
					detallecompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleCompra(true);
					detallecompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleCompra("n",detallecompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallecompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallecompraBeanSwingJInternalFrame.setAutoscrolls(true);
					detallecompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallecompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCompra("relacionado");
					} else {
						detallecompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleCompra("no_relacionado");
					}

					detallecompraBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleCompra().setVisible(false);

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
