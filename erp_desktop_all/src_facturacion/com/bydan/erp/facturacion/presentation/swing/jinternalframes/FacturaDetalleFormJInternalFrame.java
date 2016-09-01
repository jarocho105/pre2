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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.facturacion.util.FacturaConstantesFunciones;

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
public class FacturaDetalleFormJInternalFrame extends FacturaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFactura;
	
	protected JMenuBar jmenuBarDetalleFactura;
	
	protected JMenu jmenuDetalleFactura;
	protected JMenu jmenuDetalleArchivoFactura;
	protected JMenu jmenuDetalleAccionesFactura;
	protected JMenu jmenuDetalleDatosFactura;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFactura;	
	protected GridBagConstraints gridBagConstraintsFactura;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturaBeanSwingJInternalFrameAdditional jInternalFrameDetalleFactura;		
	
	
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

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected SubClienteBeanSwingJInternalFrame subclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_subcliente="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected TipoLlamadaBeanSwingJInternalFrame tipollamadaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipollamada="";

	protected TipoFacturaBeanSwingJInternalFrame tipofacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofactura="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedido="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected EstadoFisicoFacturaEmpresaBeanSwingJInternalFrame estadofisicofacturaempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadofisicofacturaempresa="";
	
	public FacturaSessionBean facturaSessionBean;
	
	

	public DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame=null;
	public DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetaFormaPago=false;
	public DetaFormaPagoSessionBean detaformapagoSessionBean;

	public DetalleFacturaBeanSwingJInternalFrame detallefacturaBeanSwingJInternalFrame=null;
	public DetalleFacturaBeanSwingJInternalFrame detallefacturaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleFactura=false;
	public DetalleFacturaSessionBean detallefacturaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public SubClienteSessionBean subclienteSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public TipoLlamadaSessionBean tipollamadaSessionBean;
	public TipoFacturaSessionBean tipofacturaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public PedidoSessionBean pedidoSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public EstadoFisicoFacturaEmpresaSessionBean estadofisicofacturaempresaSessionBean;	
	
	public FacturaLogic facturaLogic;
	
	public JScrollPane jScrollPanelDatosFactura;
	public JScrollPane jScrollPanelDatosEdicionFactura;
	public JScrollPane jScrollPanelDatosGeneralFactura;
	
	protected JPanel jPanelCamposFactura;    
	protected JPanel jPanelCamposOcultosFactura;    	
	protected JPanel jPanelAccionesFactura;
	protected JPanel jPanelAccionesFormularioFactura;
    
	
	
	protected Integer iXPanelCamposFactura=0;
	protected Integer iYPanelCamposFactura=0;
	
	protected Integer iXPanelCamposOcultosFactura=0;
	protected Integer iYPanelCamposOcultosFactura=0;
	
	

	protected JPanel jPanelCamposFintotalFactura;
	protected Integer iXPanelCamposFintotalFactura=0;
	protected Integer iYPanelCamposFintotalFactura=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFactura;
	public JButton jButtonModificarFactura;
	public JButton jButtonActualizarFactura;
    public JButton jButtonEliminarFactura;
	public JButton jButtonCancelarFactura;
    public JButton jButtonGuardarCambiosFactura;
	public JButton jButtonGuardarCambiosTablaFactura;
	protected JButton jButtonCerrarFactura;
	
	
	protected JButton jButtonProcesarInformacionFactura;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFactura;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFactura;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFactura;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFactura;
	protected JButton jButtonModificarToolBarFactura;
	protected JButton jButtonActualizarToolBarFactura;
    protected JButton jButtonEliminarToolBarFactura;
	protected JButton jButtonCancelarToolBarFactura;
    protected JButton jButtonGuardarCambiosToolBarFactura;
	protected JButton jButtonGuardarCambiosTablaToolBarFactura;
	protected JButton jButtonMostrarOcultarTablaToolBarFactura;
	protected JButton jButtonCerrarToolBarFactura;
	
	protected JButton jButtonProcesarInformacionToolBarFactura;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFactura;
	protected JMenuItem jMenuItemModificarFactura;
	protected JMenuItem jMenuItemActualizarFactura;
    protected JMenuItem jMenuItemEliminarFactura;
	protected JMenuItem jMenuItemCancelarFactura;
    protected JMenuItem jMenuItemGuardarCambiosFactura;
	protected JMenuItem jMenuItemGuardarCambiosTablaFactura;
	protected JMenuItem jMenuItemCerrarFactura;
	protected JMenuItem jMenuItemDetalleCerrarFactura;
	protected JMenuItem jMenuItemDetalleMostarOcultarFactura;
	
	protected JMenuItem jMenuItemProcesarInformacionFactura;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFactura;
	protected JMenuItem jMenuItemMostrarOcultarFactura;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFactura;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFactura;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFactura;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFactura;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFactura;
	public JLabel jLabelIdFactura;
	public JLabel jLabelidFactura;
	public JButton jButtonidFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoFactura;
	public JLabel jLabelnumero_pre_impresoFactura;
	public JTextField jTextFieldnumero_pre_impresoFactura;
	public JButton jButtonnumero_pre_impresoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionFactura;
	public JLabel jLabelfecha_emisionFactura;
	//public JFormattedTextField jDateChooserfecha_emisionFactura;

	public JDateChooser jDateChooserfecha_emisionFactura;
	public JButton jButtonfecha_emisionFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasFactura;
	public JLabel jLabelnumero_diasFactura;
	public JTextField jTextFieldnumero_diasFactura;
	public JButton jButtonnumero_diasFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoFactura;
	public JLabel jLabelfecha_vencimientoFactura;
	//public JFormattedTextField jDateChooserfecha_vencimientoFactura;

	public JDateChooser jDateChooserfecha_vencimientoFactura;
	public JButton jButtonfecha_vencimientoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionFactura;
	public JLabel jLabelcotizacionFactura;
	public JTextField jTextFieldcotizacionFactura;
	public JButton jButtoncotizacionFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldireccionFactura;
	public JLabel jLabeldireccionFactura;
	public JTextArea jTextAreadireccionFactura;
	public JScrollPane jscrollPanedireccionFactura;
	public JButton jButtondireccionFacturaBusqueda= new JButtonMe();

	public JPanel jPanelrucFactura;
	public JLabel jLabelrucFactura;
	public JTextField jTextFieldrucFactura;
	public JButton jButtonrucFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoFactura;
	public JLabel jLabeltelefonoFactura;
	public JTextField jTextFieldtelefonoFactura;
	public JButton jButtontelefonoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelordenFactura;
	public JLabel jLabelordenFactura;
	public JTextField jTextFieldordenFactura;
	public JButton jButtonordenFacturaBusqueda= new JButtonMe();

	public JPanel jPanelhora_inicioFactura;
	public JLabel jLabelhora_inicioFactura;
	public JSpinner jSpinnerhora_inicioFactura= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_inicioFacturaBusqueda= new JButtonMe();

	public JPanel jPanelhora_finFactura;
	public JLabel jLabelhora_finFactura;
	public JSpinner jSpinnerhora_finFactura= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhora_finFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionFactura;
	public JLabel jLabeldescripcionFactura;
	public JTextArea jTextAreadescripcionFactura;
	public JScrollPane jscrollPanedescripcionFactura;
	public JButton jButtondescripcionFacturaBusqueda= new JButtonMe();

	public JPanel jPanelcupoFactura;
	public JLabel jLabelcupoFactura;
	public JTextField jTextFieldcupoFactura;
	public JButton jButtoncupoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelsaldoFactura;
	public JLabel jLabelsaldoFactura;
	public JTextField jTextFieldsaldoFactura;
	public JButton jButtonsaldoFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldocumentosFactura;
	public JLabel jLabeldocumentosFactura;
	public JTextField jTextFielddocumentosFactura;
	public JButton jButtondocumentosFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldisponibleFactura;
	public JLabel jLabeldisponibleFactura;
	public JTextField jTextFielddisponibleFactura;
	public JButton jButtondisponibleFacturaBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_descuentoFactura;
	public JLabel jLabelporcentaje_descuentoFactura;
	public JTextField jTextFieldporcentaje_descuentoFactura;
	public JButton jButtonporcentaje_descuentoFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaFactura;
	public JLabel jLabeltotal_ivaFactura;
	public JTextField jTextFieldtotal_ivaFactura;
	public JButton jButtontotal_ivaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelsumanFactura;
	public JLabel jLabelsumanFactura;
	public JTextField jTextFieldsumanFactura;
	public JButton jButtonsumanFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorFactura;
	public JLabel jLabeldescuento_valorFactura;
	public JTextField jTextFielddescuento_valorFactura;
	public JButton jButtondescuento_valorFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaFactura;
	public JLabel jLabeltotal_sin_ivaFactura;
	public JTextField jTextFieldtotal_sin_ivaFactura;
	public JButton jButtontotal_sin_ivaFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoFactura;
	public JLabel jLabeltotal_descuentoFactura;
	public JTextField jTextFieldtotal_descuentoFactura;
	public JButton jButtontotal_descuentoFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_fleteFactura;
	public JLabel jLabeltotal_fleteFactura;
	public JTextField jTextFieldtotal_fleteFactura;
	public JButton jButtontotal_fleteFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltotalFactura;
	public JLabel jLabeltotalFactura;
	public JTextField jTextFieldtotalFactura;
	public JButton jButtontotalFacturaBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalFactura;
	public JLabel jLabelsub_totalFactura;
	public JTextField jTextFieldsub_totalFactura;
	public JButton jButtonsub_totalFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_otroFactura;
	public JLabel jLabeltotal_otroFactura;
	public JTextField jTextFieldtotal_otroFactura;
	public JButton jButtontotal_otroFacturaBusqueda= new JButtonMe();

	public JPanel jPanelultimo_costoFactura;
	public JLabel jLabelultimo_costoFactura;
	public JTextField jTextFieldultimo_costoFactura;
	public JButton jButtonultimo_costoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelivaFactura;
	public JLabel jLabelivaFactura;
	public JTextField jTextFieldivaFactura;
	public JButton jButtonivaFacturaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoFactura;
	public JLabel jLabeldescuentoFactura;
	public JTextField jTextFielddescuentoFactura;
	public JButton jButtondescuentoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoFactura;
	public JLabel jLabelfinanciamientoFactura;
	public JTextField jTextFieldfinanciamientoFactura;
	public JButton jButtonfinanciamientoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelmargen_utilidadFactura;
	public JLabel jLabelmargen_utilidadFactura;
	public JTextField jTextFieldmargen_utilidadFactura;
	public JButton jButtonmargen_utilidadFacturaBusqueda= new JButtonMe();

	public JPanel jPaneliceFactura;
	public JLabel jLabeliceFactura;
	public JTextField jTextFieldiceFactura;
	public JButton jButtoniceFacturaBusqueda= new JButtonMe();

	public JPanel jPanelanticipoFactura;
	public JLabel jLabelanticipoFactura;
	public JTextField jTextFieldanticipoFactura;
	public JButton jButtonanticipoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelotros_valoresFactura;
	public JLabel jLabelotros_valoresFactura;
	public JTextField jTextFieldotros_valoresFactura;
	public JButton jButtonotros_valoresFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_retencionFactura;
	public JLabel jLabeltotal_retencionFactura;
	public JTextField jTextFieldtotal_retencionFactura;
	public JButton jButtontotal_retencionFacturaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_consumo_especialFactura;
	public JLabel jLabeltotal_consumo_especialFactura;
	public JTextField jTextFieldtotal_consumo_especialFactura;
	public JButton jButtontotal_consumo_especialFacturaBusqueda= new JButtonMe();

	public JPanel jPanelretencionFactura;
	public JLabel jLabelretencionFactura;
	public JTextField jTextFieldretencionFactura;
	public JButton jButtonretencionFacturaBusqueda= new JButtonMe();

	public JPanel jPaneles_clienteFactura;
	public JLabel jLabeles_clienteFactura;
	public JCheckBox jCheckBoxes_clienteFactura;
	public JButton jButtones_clienteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfechaFactura;
	public JLabel jLabelfechaFactura;
	//public JFormattedTextField jDateChooserfechaFactura;

	public JDateChooser jDateChooserfechaFactura;
	public JButton jButtonfechaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_autorizacionFactura;
	public JLabel jLabelfecha_autorizacionFactura;
	//public JFormattedTextField jDateChooserfecha_autorizacionFactura;

	public JDateChooser jDateChooserfecha_autorizacionFactura;
	public JButton jButtonfecha_autorizacionFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_clienteFactura;
	public JLabel jLabelfecha_clienteFactura;
	//public JFormattedTextField jDateChooserfecha_clienteFactura;

	public JDateChooser jDateChooserfecha_clienteFactura;
	public JButton jButtonfecha_clienteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_documentoFactura;
	public JLabel jLabelnumero_documentoFactura;
	public JTextField jTextFieldnumero_documentoFactura;
	public JButton jButtonnumero_documentoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_dauFactura;
	public JLabel jLabelnumero_dauFactura;
	public JTextField jTextFieldnumero_dauFactura;
	public JButton jButtonnumero_dauFacturaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_referendoFactura;
	public JLabel jLabelnumero_referendoFactura;
	public JTextField jTextFieldnumero_referendoFactura;
	public JButton jButtonnumero_referendoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_referendoFactura;
	public JLabel jLabelfecha_referendoFactura;
	//public JFormattedTextField jDateChooserfecha_referendoFactura;

	public JDateChooser jDateChooserfecha_referendoFactura;
	public JButton jButtonfecha_referendoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelaforo_referendoFactura;
	public JLabel jLabelaforo_referendoFactura;
	public JTextField jTextFieldaforo_referendoFactura;
	public JButton jButtonaforo_referendoFacturaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFactura;
	public JLabel jLabelid_empresaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFactura;
	public JButton jButtonid_empresaFactura= new JButtonMe();
	public JButton jButtonid_empresaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFactura;
	public JLabel jLabelid_sucursalFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFactura;
	public JButton jButtonid_sucursalFactura= new JButtonMe();
	public JButton jButtonid_sucursalFacturaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioFactura;
	public JLabel jLabelid_ejercicioFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFactura;
	public JButton jButtonid_ejercicioFactura= new JButtonMe();
	public JButton jButtonid_ejercicioFacturaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoFactura;
	public JLabel jLabelid_periodoFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoFactura;
	public JButton jButtonid_periodoFactura= new JButtonMe();
	public JButton jButtonid_periodoFacturaUpdate= new JButtonMe();
	public JButton jButtonid_periodoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioFactura;
	public JLabel jLabelid_anioFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFactura;
	public JButton jButtonid_anioFactura= new JButtonMe();
	public JButton jButtonid_anioFacturaUpdate= new JButtonMe();
	public JButton jButtonid_anioFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesFactura;
	public JLabel jLabelid_mesFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFactura;
	public JButton jButtonid_mesFactura= new JButtonMe();
	public JButton jButtonid_mesFacturaUpdate= new JButtonMe();
	public JButton jButtonid_mesFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioFactura;
	public JLabel jLabelid_usuarioFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioFactura;
	public JButton jButtonid_usuarioFactura= new JButtonMe();
	public JButton jButtonid_usuarioFacturaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaFactura;
	public JLabel jLabelid_monedaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaFactura;
	public JButton jButtonid_monedaFactura= new JButtonMe();
	public JButton jButtonid_monedaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_monedaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoFactura;
	public JLabel jLabelid_empleadoFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFactura;
	public JButton jButtonid_empleadoFactura= new JButtonMe();
	public JButton jButtonid_empleadoFacturaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoFactura;
	public JLabel jLabelid_formatoFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFactura;
	public JButton jButtonid_formatoFactura= new JButtonMe();
	public JButton jButtonid_formatoFacturaUpdate= new JButtonMe();
	public JButton jButtonid_formatoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteFactura;
	public JLabel jLabelid_clienteFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFactura;
	public JButton jButtonid_clienteFactura= new JButtonMe();
	public JButton jButtonid_clienteFacturaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioFactura;
	public JLabel jLabelid_tipo_precioFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFactura;
	public JButton jButtonid_tipo_precioFactura= new JButtonMe();
	public JButton jButtonid_tipo_precioFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_sub_clienteFactura;
	public JLabel jLabelid_sub_clienteFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sub_clienteFactura;
	public JButton jButtonid_sub_clienteFactura= new JButtonMe();
	public JButton jButtonid_sub_clienteFacturaUpdate= new JButtonMe();
	public JButton jButtonid_sub_clienteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorFactura;
	public JLabel jLabelid_vendedorFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFactura;
	public JButton jButtonid_vendedorFactura= new JButtonMe();
	public JButton jButtonid_vendedorFacturaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFacturaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFacturaArbol= new JButtonMe();

	public JPanel jPanelid_transporteFactura;
	public JLabel jLabelid_transporteFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteFactura;
	public JButton jButtonid_transporteFactura= new JButtonMe();
	public JButton jButtonid_transporteFacturaUpdate= new JButtonMe();
	public JButton jButtonid_transporteFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaFactura;
	public JLabel jLabelid_transportistaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaFactura;
	public JButton jButtonid_transportistaFactura= new JButtonMe();
	public JButton jButtonid_transportistaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_transportistaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_llamadaFactura;
	public JLabel jLabelid_tipo_llamadaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_llamadaFactura;
	public JButton jButtonid_tipo_llamadaFactura= new JButtonMe();
	public JButton jButtonid_tipo_llamadaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_llamadaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_facturaFactura;
	public JLabel jLabelid_tipo_facturaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_facturaFactura;
	public JButton jButtonid_tipo_facturaFactura= new JButtonMe();
	public JButton jButtonid_tipo_facturaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_facturaFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioFactura;
	public JLabel jLabelid_tipo_cambioFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioFactura;
	public JButton jButtonid_tipo_cambioFactura= new JButtonMe();
	public JButton jButtonid_tipo_cambioFacturaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableFactura;
	public JLabel jLabelid_asiento_contableFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFactura;
	public JButton jButtonid_asiento_contableFactura= new JButtonMe();
	public JButton jButtonid_asiento_contableFacturaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_pedidoFactura;
	public JLabel jLabelid_pedidoFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedidoFactura;
	public JButton jButtonid_pedidoFactura= new JButtonMe();
	public JButton jButtonid_pedidoFacturaUpdate= new JButtonMe();
	public JButton jButtonid_pedidoFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_responsableFactura;
	public JLabel jLabelid_responsableFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsableFactura;
	public JButton jButtonid_responsableFactura= new JButtonMe();
	public JButton jButtonid_responsableFacturaUpdate= new JButtonMe();
	public JButton jButtonid_responsableFacturaBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_fisico_factura_empresaFactura;
	public JLabel jLabelid_estado_fisico_factura_empresaFactura;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_fisico_factura_empresaFactura;
	public JButton jButtonid_estado_fisico_factura_empresaFactura= new JButtonMe();
	public JButton jButtonid_estado_fisico_factura_empresaFacturaUpdate= new JButtonMe();
	public JButton jButtonid_estado_fisico_factura_empresaFacturaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFactura;
	
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
		
	public int iWidthFormulario=1415;//(screenSize.width-screenSize.width/2)+(250*3);
	public int iHeightFormulario=748;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FacturaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFactura=new JPanel();
				this.jPanelAccionesFormularioFactura=new JPanel();
				this.jmenuBarDetalleFactura=new JMenuBar();
				this.jTtoolBarDetalleFactura=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Factura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Factura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Factura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Factura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Factura No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFactura() {
		return this.jButtonActualizarToolBarFactura;
	}
	
	public JButton getjButtonEliminarToolBarFactura() {
		return this.jButtonEliminarToolBarFactura;
	}
	
	public JButton getjButtonCancelarToolBarFactura() {
		return this.jButtonCancelarToolBarFactura;
	}		
	
	public JButton getjButtonProcesarInformacionFactura() {
		return this.jButtonProcesarInformacionFactura;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFactura)	{
		this.jButtonProcesarInformacionFactura = jButtonProcesarInformacionFactura;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFactura() {
		return this.jComboBoxTiposAccionesFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFactura(
			JComboBox jComboBoxTiposRelacionesFactura) {
		this.jComboBoxTiposRelacionesFactura = jComboBoxTiposRelacionesFactura;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFactura(
			JComboBox jComboBoxTiposAccionesFactura) {
		this.jComboBoxTiposAccionesFactura = jComboBoxTiposAccionesFactura;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFactura() {
		return this.jComboBoxTiposAccionesFormularioFactura;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFactura(
			JComboBox jComboBoxTiposAccionesFormularioFactura) {
		this.jComboBoxTiposAccionesFormularioFactura = jComboBoxTiposAccionesFormularioFactura;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturaSessionBean=new FacturaSessionBean();
		
		this.facturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detaformapagoSessionBean=new DetaFormaPagoSessionBean();
		//this.detallefacturaSessionBean=new DetalleFacturaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura MANTENIMIENTO"));
		
		
		if(iWidth > 4750) {
			iWidth=4750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturaSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFactura= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFactura=new JButtonMe();
				this.jButtonModificarToolBarFactura=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFactura,this.jTtoolBarDetalleFactura,
							"actualizar","actualizar","Actualizar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFactura,this.jTtoolBarDetalleFactura,
							"eliminar","eliminar","Eliminar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFactura,this.jTtoolBarDetalleFactura,
							"cancelar","cancelar","Cancelar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFactura=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFactura,this.jTtoolBarDetalleFactura,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFactura,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFactura=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFactura=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFactura=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFactura=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFactura=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFactura= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFactura.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFactura,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFactura= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFactura.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFactura,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFactura= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFactura.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFactura,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFactura= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFactura.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFactura,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFactura= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFactura.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFactura,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFactura= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFactura.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFactura,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFactura= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFactura.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFactura,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFactura,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFactura= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFactura.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFactura,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFactura, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFactura.add(this.jMenuItemDetalleCerrarFactura);
		
		this.jmenuDetalleAccionesFactura.add(this.jMenuItemActualizarFactura);
		this.jmenuDetalleAccionesFactura.add(this.jMenuItemEliminarFactura);
		this.jmenuDetalleAccionesFactura.add(this.jMenuItemCancelarFactura);		
		
		//this.jmenuDetalleDatosFactura.add(this.jMenuItemDetalleAbrirOrderByFactura);				
		this.jmenuDetalleDatosFactura.add(this.jMenuItemDetalleMostarOcultarFactura);				
				
		//this.jmenuDetalleAccionesFactura.add(this.jMenuItemGuardarCambiosFactura);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFactura.add(this.jmenuDetalleArchivoFactura);		
		this.jmenuBarDetalleFactura.add(this.jmenuDetalleAccionesFactura);		
		this.jmenuBarDetalleFactura.add(this.jmenuDetalleDatosFactura);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFactura, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFactura.add(this.jmenuDetalleFactura);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFactura = new JLabelMe();
		jLabelIdFactura.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFactura = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFactura.setToolTipText(FacturaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFactura= new GridBagLayout();

		this.jPanelidFactura.setLayout(this.gridaBagLayoutFactura);

		jLabelidFactura = new JLabel();
		jLabelidFactura.setText("Id");

		jLabelidFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_pre_impresoFactura = new JLabelMe();
		this.jLabelnumero_pre_impresoFactura.setText(""+FacturaConstantesFunciones.LABEL_NUMEROPREIMPRESO+" :");
		this.jLabelnumero_pre_impresoFactura.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelnumero_pre_impresoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldnumero_pre_impresoFactura= new JTextFieldMe();

		jTextFieldnumero_pre_impresoFactura.setEnabled(false);
		jTextFieldnumero_pre_impresoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoFacturaBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoFacturaBusqueda.setText("U");
		this.jButtonnumero_pre_impresoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionFactura = new JLabelMe();
		this.jLabelfecha_emisionFactura.setText(""+FacturaConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionFactura.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionFactura.setToolTipText(FacturaConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelfecha_emisionFactura.setLayout(this.gridaBagLayoutFactura);


		//jFormattedTextFieldfecha_emisionFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionFactura= new JDateChooser();
		jDateChooserfecha_emisionFactura.setEnabled(false);
		jDateChooserfecha_emisionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionFactura.setDate(new Date());
		jDateChooserfecha_emisionFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_emisionFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionFacturaBusqueda.setText("U");
		this.jButtonfecha_emisionFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasFactura = new JLabelMe();
		this.jLabelnumero_diasFactura.setText(""+FacturaConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasFactura.setToolTipText("Numero Dia");
		this.jLabelnumero_diasFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasFactura.setToolTipText(FacturaConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelnumero_diasFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldnumero_diasFactura= new JTextFieldMe();
		jTextFieldnumero_diasFactura.setEnabled(false);
		jTextFieldnumero_diasFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasFactura.setText("0");

		this.jButtonnumero_diasFacturaBusqueda= new JButtonMe();
		this.jButtonnumero_diasFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasFacturaBusqueda.setText("U");
		this.jButtonnumero_diasFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoFactura = new JLabelMe();
		this.jLabelfecha_vencimientoFactura.setText(""+FacturaConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoFactura.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelfecha_vencimientoFactura.setLayout(this.gridaBagLayoutFactura);


		//jFormattedTextFieldfecha_vencimientoFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoFactura= new JDateChooser();
		jDateChooserfecha_vencimientoFactura.setEnabled(false);
		jDateChooserfecha_vencimientoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoFactura.setDate(new Date());
		jDateChooserfecha_vencimientoFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoFacturaBusqueda.setText("U");
		this.jButtonfecha_vencimientoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionFactura = new JLabelMe();
		this.jLabelcotizacionFactura.setText(""+FacturaConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionFactura.setToolTipText("Cotizacion");
		this.jLabelcotizacionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionFactura.setToolTipText(FacturaConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelcotizacionFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldcotizacionFactura= new JTextFieldMe();
		jTextFieldcotizacionFactura.setEnabled(false);
		jTextFieldcotizacionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionFactura.setText("0.0");

		this.jButtoncotizacionFacturaBusqueda= new JButtonMe();
		this.jButtoncotizacionFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionFacturaBusqueda.setText("U");
		this.jButtoncotizacionFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldireccionFactura = new JLabelMe();
		this.jLabeldireccionFactura.setText(""+FacturaConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionFactura.setToolTipText("Direccion");
		this.jLabeldireccionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionFactura.setToolTipText(FacturaConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneldireccionFactura.setLayout(this.gridaBagLayoutFactura);


		jTextAreadireccionFactura= new JTextAreaMe();
		jTextAreadireccionFactura.setEnabled(false);
		jTextAreadireccionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionFactura.setLineWrap(true);
		jTextAreadireccionFactura.setWrapStyleWord(true);
		jTextAreadireccionFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionFactura.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionFactura = new JScrollPane(jTextAreadireccionFactura);
		jscrollPanedireccionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccionFacturaBusqueda= new JButtonMe();
		this.jButtondireccionFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionFacturaBusqueda.setText("U");
		this.jButtondireccionFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionFacturaBusqueda.setVisible(false);		}


					
		this.jLabelrucFactura = new JLabelMe();
		this.jLabelrucFactura.setText(""+FacturaConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucFactura.setToolTipText("Ruc");
		this.jLabelrucFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucFactura.setToolTipText(FacturaConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelrucFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldrucFactura= new JTextFieldMe();

		jTextFieldrucFactura.setEnabled(false);
		jTextFieldrucFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucFacturaBusqueda= new JButtonMe();
		this.jButtonrucFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucFacturaBusqueda.setText("U");
		this.jButtonrucFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoFactura = new JLabelMe();
		this.jLabeltelefonoFactura.setText(""+FacturaConstantesFunciones.LABEL_TELEFONO+" :");
		this.jLabeltelefonoFactura.setToolTipText("Telefono");
		this.jLabeltelefonoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneltelefonoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldtelefonoFactura= new JTextFieldMe();

		jTextFieldtelefonoFactura.setEnabled(false);
		jTextFieldtelefonoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoFacturaBusqueda= new JButtonMe();
		this.jButtontelefonoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoFacturaBusqueda.setText("U");
		this.jButtontelefonoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelordenFactura = new JLabelMe();
		this.jLabelordenFactura.setText(""+FacturaConstantesFunciones.LABEL_ORDEN+" :");
		this.jLabelordenFactura.setToolTipText("Orden");
		this.jLabelordenFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelordenFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelordenFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelordenFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelordenFactura.setToolTipText(FacturaConstantesFunciones.LABEL_ORDEN);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelordenFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldordenFactura= new JTextFieldMe();

		jTextFieldordenFactura.setEnabled(false);
		jTextFieldordenFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldordenFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldordenFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonordenFacturaBusqueda= new JButtonMe();
		this.jButtonordenFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonordenFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonordenFacturaBusqueda.setText("U");
		this.jButtonordenFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonordenFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonordenFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldordenFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldordenFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ordenFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonordenFacturaBusqueda.setVisible(false);		}


					
		this.jLabelhora_inicioFactura = new JLabelMe();
		this.jLabelhora_inicioFactura.setText(""+FacturaConstantesFunciones.LABEL_HORAINICIO+" : *");
		this.jLabelhora_inicioFactura.setToolTipText("Hora Inicio");
		this.jLabelhora_inicioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_inicioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_inicioFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_inicioFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_inicioFactura.setToolTipText(FacturaConstantesFunciones.LABEL_HORAINICIO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelhora_inicioFactura.setLayout(this.gridaBagLayoutFactura);


		//jFormattedTextFieldhora_inicioFactura= new JFormattedTextFieldMe();

		jSpinnerhora_inicioFactura= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_inicioFactura.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_inicioFactura = new JSpinner.DateEditor(jSpinnerhora_inicioFactura, "HH:mm:ss");

		jSpinnerhora_inicioFactura.setEditor(timeEditorhora_inicioFactura);

		jSpinnerhora_inicioFactura.setValue(new Date());

		jSpinnerhora_inicioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_inicioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_inicioFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_inicioFactura.setValue(new Date());
		//jSpinnerhora_inicioFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_inicioFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_inicioFacturaBusqueda= new JButtonMe();
		this.jButtonhora_inicioFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_inicioFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_inicioFacturaBusqueda.setText("U");
		this.jButtonhora_inicioFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_inicioFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_inicioFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_inicioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_inicioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_inicioFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_inicioFacturaBusqueda.setVisible(false);		}


					
		this.jLabelhora_finFactura = new JLabelMe();
		this.jLabelhora_finFactura.setText(""+FacturaConstantesFunciones.LABEL_HORAFIN+" : *");
		this.jLabelhora_finFactura.setToolTipText("Hora Fin");
		this.jLabelhora_finFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhora_finFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhora_finFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhora_finFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhora_finFactura.setToolTipText(FacturaConstantesFunciones.LABEL_HORAFIN);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelhora_finFactura.setLayout(this.gridaBagLayoutFactura);


		//jFormattedTextFieldhora_finFactura= new JFormattedTextFieldMe();

		jSpinnerhora_finFactura= new JSpinner(new SpinnerDateModel());;
		jSpinnerhora_finFactura.setEnabled(false);
		JSpinner.DateEditor timeEditorhora_finFactura = new JSpinner.DateEditor(jSpinnerhora_finFactura, "HH:mm:ss");

		jSpinnerhora_finFactura.setEditor(timeEditorhora_finFactura);

		jSpinnerhora_finFactura.setValue(new Date());

		jSpinnerhora_finFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhora_finFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhora_finFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhora_finFactura.setValue(new Date());
		//jSpinnerhora_finFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhora_finFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhora_finFacturaBusqueda= new JButtonMe();
		this.jButtonhora_finFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhora_finFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhora_finFacturaBusqueda.setText("U");
		this.jButtonhora_finFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhora_finFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhora_finFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhora_finFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhora_finFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"hora_finFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhora_finFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionFactura = new JLabelMe();
		this.jLabeldescripcionFactura.setText(""+FacturaConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionFactura.setToolTipText("Descripcion");
		this.jLabeldescripcionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionFactura.setToolTipText(FacturaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneldescripcionFactura.setLayout(this.gridaBagLayoutFactura);


		jTextAreadescripcionFactura= new JTextAreaMe();
		jTextAreadescripcionFactura.setEnabled(false);
		jTextAreadescripcionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFactura.setLineWrap(true);
		jTextAreadescripcionFactura.setWrapStyleWord(true);
		jTextAreadescripcionFactura.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionFactura.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionFactura = new JScrollPane(jTextAreadescripcionFactura);
		jscrollPanedescripcionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionFacturaBusqueda= new JButtonMe();
		this.jButtondescripcionFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionFacturaBusqueda.setText("U");
		this.jButtondescripcionFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionFacturaBusqueda.setVisible(false);		}


					
		this.jLabelcupoFactura = new JLabelMe();
		this.jLabelcupoFactura.setText(""+FacturaConstantesFunciones.LABEL_CUPO+" : *");
		this.jLabelcupoFactura.setToolTipText("Cupo");
		this.jLabelcupoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcupoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcupoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcupoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcupoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcupoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_CUPO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelcupoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldcupoFactura= new JTextFieldMe();
		jTextFieldcupoFactura.setEnabled(false);
		jTextFieldcupoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcupoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcupoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcupoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcupoFactura.setText("0.0");

		this.jButtoncupoFacturaBusqueda= new JButtonMe();
		this.jButtoncupoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncupoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncupoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncupoFacturaBusqueda.setText("U");
		this.jButtoncupoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncupoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncupoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcupoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcupoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cupoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncupoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelsaldoFactura = new JLabelMe();
		this.jLabelsaldoFactura.setText(""+FacturaConstantesFunciones.LABEL_SALDO+" : *");
		this.jLabelsaldoFactura.setToolTipText("Saldo");
		this.jLabelsaldoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsaldoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsaldoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsaldoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsaldoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_SALDO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelsaldoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldsaldoFactura= new JTextFieldMe();
		jTextFieldsaldoFactura.setEnabled(false);
		jTextFieldsaldoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsaldoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsaldoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsaldoFactura.setText("0.0");

		this.jButtonsaldoFacturaBusqueda= new JButtonMe();
		this.jButtonsaldoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsaldoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsaldoFacturaBusqueda.setText("U");
		this.jButtonsaldoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsaldoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsaldoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsaldoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsaldoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"saldoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsaldoFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldocumentosFactura = new JLabelMe();
		this.jLabeldocumentosFactura.setText(""+FacturaConstantesFunciones.LABEL_DOCUMENTOS+" : *");
		this.jLabeldocumentosFactura.setToolTipText("Documentos");
		this.jLabeldocumentosFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldocumentosFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldocumentosFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldocumentosFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldocumentosFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldocumentosFactura.setToolTipText(FacturaConstantesFunciones.LABEL_DOCUMENTOS);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneldocumentosFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFielddocumentosFactura= new JTextFieldMe();
		jTextFielddocumentosFactura.setEnabled(false);
		jTextFielddocumentosFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddocumentosFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddocumentosFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddocumentosFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddocumentosFactura.setText("0.0");

		this.jButtondocumentosFacturaBusqueda= new JButtonMe();
		this.jButtondocumentosFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondocumentosFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondocumentosFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondocumentosFacturaBusqueda.setText("U");
		this.jButtondocumentosFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondocumentosFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondocumentosFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddocumentosFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddocumentosFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"documentosFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondocumentosFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldisponibleFactura = new JLabelMe();
		this.jLabeldisponibleFactura.setText(""+FacturaConstantesFunciones.LABEL_DISPONIBLE+" : *");
		this.jLabeldisponibleFactura.setToolTipText("Disponible");
		this.jLabeldisponibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponibleFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponibleFactura.setToolTipText(FacturaConstantesFunciones.LABEL_DISPONIBLE);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneldisponibleFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFielddisponibleFactura= new JTextFieldMe();
		jTextFielddisponibleFactura.setEnabled(false);
		jTextFielddisponibleFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponibleFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponibleFactura.setText("0.0");

		this.jButtondisponibleFacturaBusqueda= new JButtonMe();
		this.jButtondisponibleFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponibleFacturaBusqueda.setText("U");
		this.jButtondisponibleFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponibleFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponibleFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponibleFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponibleFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponibleFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponibleFacturaBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_descuentoFactura = new JLabelMe();
		this.jLabelporcentaje_descuentoFactura.setText(""+FacturaConstantesFunciones.LABEL_PORCENTAJEDESCUENTO+" : *");
		this.jLabelporcentaje_descuentoFactura.setToolTipText("% Descuento");
		this.jLabelporcentaje_descuentoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_descuentoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_descuentoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_descuentoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_PORCENTAJEDESCUENTO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelporcentaje_descuentoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldporcentaje_descuentoFactura= new JTextFieldMe();
		jTextFieldporcentaje_descuentoFactura.setEnabled(false);
		jTextFieldporcentaje_descuentoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_descuentoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_descuentoFactura.setText("0.0");

		this.jButtonporcentaje_descuentoFacturaBusqueda= new JButtonMe();
		this.jButtonporcentaje_descuentoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_descuentoFacturaBusqueda.setText("U");
		this.jButtonporcentaje_descuentoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_descuentoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_descuentoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_descuentoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_descuentoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_descuentoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_descuentoFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaFactura = new JLabelMe();
		this.jLabeltotal_ivaFactura.setText(""+FacturaConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaFactura.setToolTipText("Monto Con Iva");
		this.jLabeltotal_ivaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaFactura.setToolTipText(FacturaConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneltotal_ivaFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldtotal_ivaFactura= new JTextFieldMe();
		jTextFieldtotal_ivaFactura.setEnabled(false);
		jTextFieldtotal_ivaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaFactura.setText("0.0");

		this.jButtontotal_ivaFacturaBusqueda= new JButtonMe();
		this.jButtontotal_ivaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaFacturaBusqueda.setText("U");
		this.jButtontotal_ivaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaFacturaBusqueda.setVisible(false);		}


					
		this.jLabelsumanFactura = new JLabelMe();
		this.jLabelsumanFactura.setText(""+FacturaConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanFactura.setToolTipText("Suman");
		this.jLabelsumanFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanFactura.setToolTipText(FacturaConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelsumanFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldsumanFactura= new JTextFieldMe();
		jTextFieldsumanFactura.setEnabled(false);
		jTextFieldsumanFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanFactura.setText("0.0");

		this.jButtonsumanFacturaBusqueda= new JButtonMe();
		this.jButtonsumanFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanFacturaBusqueda.setText("U");
		this.jButtonsumanFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorFactura = new JLabelMe();
		this.jLabeldescuento_valorFactura.setText(""+FacturaConstantesFunciones.LABEL_DESCUENTOVALOR+" :");
		this.jLabeldescuento_valorFactura.setToolTipText("Descuento Valor");
		this.jLabeldescuento_valorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorFactura.setToolTipText(FacturaConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneldescuento_valorFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFielddescuento_valorFactura= new JTextFieldMe();
		jTextFielddescuento_valorFactura.setEnabled(false);
		jTextFielddescuento_valorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorFactura.setText("0.0");

		this.jButtondescuento_valorFacturaBusqueda= new JButtonMe();
		this.jButtondescuento_valorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorFacturaBusqueda.setText("U");
		this.jButtondescuento_valorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaFactura = new JLabelMe();
		this.jLabeltotal_sin_ivaFactura.setText(""+FacturaConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaFactura.setToolTipText("Monto Sin Iva");
		this.jLabeltotal_sin_ivaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaFactura.setToolTipText(FacturaConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneltotal_sin_ivaFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldtotal_sin_ivaFactura= new JTextFieldMe();
		jTextFieldtotal_sin_ivaFactura.setEnabled(false);
		jTextFieldtotal_sin_ivaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaFactura.setText("0.0");

		this.jButtontotal_sin_ivaFacturaBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaFacturaBusqueda.setText("U");
		this.jButtontotal_sin_ivaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoFactura = new JLabelMe();
		this.jLabeltotal_descuentoFactura.setText(""+FacturaConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoFactura.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneltotal_descuentoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldtotal_descuentoFactura= new JTextFieldMe();
		jTextFieldtotal_descuentoFactura.setEnabled(false);
		jTextFieldtotal_descuentoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoFactura.setText("0.0");

		this.jButtontotal_descuentoFacturaBusqueda= new JButtonMe();
		this.jButtontotal_descuentoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoFacturaBusqueda.setText("U");
		this.jButtontotal_descuentoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_fleteFactura = new JLabelMe();
		this.jLabeltotal_fleteFactura.setText(""+FacturaConstantesFunciones.LABEL_TOTALFLETE+" : *");
		this.jLabeltotal_fleteFactura.setToolTipText("Flete");
		this.jLabeltotal_fleteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_fleteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_fleteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_fleteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_fleteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_fleteFactura.setToolTipText(FacturaConstantesFunciones.LABEL_TOTALFLETE);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneltotal_fleteFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldtotal_fleteFactura= new JTextFieldMe();
		jTextFieldtotal_fleteFactura.setEnabled(false);
		jTextFieldtotal_fleteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_fleteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_fleteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_fleteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_fleteFactura.setText("0.0");

		this.jButtontotal_fleteFacturaBusqueda= new JButtonMe();
		this.jButtontotal_fleteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_fleteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_fleteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_fleteFacturaBusqueda.setText("U");
		this.jButtontotal_fleteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_fleteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_fleteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_fleteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_fleteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_fleteFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_fleteFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltotalFactura = new JLabelMe();
		this.jLabeltotalFactura.setText(""+FacturaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalFactura.setToolTipText("Total");
		this.jLabeltotalFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalFactura.setToolTipText(FacturaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneltotalFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldtotalFactura= new JTextFieldMe();
		jTextFieldtotalFactura.setEnabled(false);
		jTextFieldtotalFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalFactura.setText("0.0");

		this.jButtontotalFacturaBusqueda= new JButtonMe();
		this.jButtontotalFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalFacturaBusqueda.setText("U");
		this.jButtontotalFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalFacturaBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalFactura = new JLabelMe();
		this.jLabelsub_totalFactura.setText(""+FacturaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalFactura.setToolTipText("Sub Total");
		this.jLabelsub_totalFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalFactura.setToolTipText(FacturaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelsub_totalFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldsub_totalFactura= new JTextFieldMe();
		jTextFieldsub_totalFactura.setEnabled(false);
		jTextFieldsub_totalFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalFactura.setText("0.0");

		this.jButtonsub_totalFacturaBusqueda= new JButtonMe();
		this.jButtonsub_totalFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalFacturaBusqueda.setText("U");
		this.jButtonsub_totalFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_otroFactura = new JLabelMe();
		this.jLabeltotal_otroFactura.setText(""+FacturaConstantesFunciones.LABEL_TOTALOTRO+" : *");
		this.jLabeltotal_otroFactura.setToolTipText("Otros");
		this.jLabeltotal_otroFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_otroFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_otroFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_otroFactura.setToolTipText(FacturaConstantesFunciones.LABEL_TOTALOTRO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneltotal_otroFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldtotal_otroFactura= new JTextFieldMe();
		jTextFieldtotal_otroFactura.setEnabled(false);
		jTextFieldtotal_otroFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_otroFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_otroFactura.setText("0.0");

		this.jButtontotal_otroFacturaBusqueda= new JButtonMe();
		this.jButtontotal_otroFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_otroFacturaBusqueda.setText("U");
		this.jButtontotal_otroFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_otroFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_otroFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_otroFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_otroFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_otroFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_otroFacturaBusqueda.setVisible(false);		}


					
		this.jLabelultimo_costoFactura = new JLabelMe();
		this.jLabelultimo_costoFactura.setText(""+FacturaConstantesFunciones.LABEL_ULTIMOCOSTO+" : *");
		this.jLabelultimo_costoFactura.setToolTipText("Ultimo Costo");
		this.jLabelultimo_costoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelultimo_costoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelultimo_costoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelultimo_costoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_ULTIMOCOSTO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelultimo_costoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldultimo_costoFactura= new JTextFieldMe();
		jTextFieldultimo_costoFactura.setEnabled(false);
		jTextFieldultimo_costoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldultimo_costoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldultimo_costoFactura.setText("0.0");

		this.jButtonultimo_costoFacturaBusqueda= new JButtonMe();
		this.jButtonultimo_costoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonultimo_costoFacturaBusqueda.setText("U");
		this.jButtonultimo_costoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonultimo_costoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonultimo_costoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldultimo_costoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldultimo_costoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ultimo_costoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonultimo_costoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelivaFactura = new JLabelMe();
		this.jLabelivaFactura.setText(""+FacturaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaFactura.setToolTipText("Iva");
		this.jLabelivaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelivaFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldivaFactura= new JTextFieldMe();
		jTextFieldivaFactura.setEnabled(false);
		jTextFieldivaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaFactura.setText("0.0");

		this.jButtonivaFacturaBusqueda= new JButtonMe();
		this.jButtonivaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaFacturaBusqueda.setText("U");
		this.jButtonivaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaFacturaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoFactura = new JLabelMe();
		this.jLabeldescuentoFactura.setText(""+FacturaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoFactura.setToolTipText("Descuento");
		this.jLabeldescuentoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneldescuentoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFielddescuentoFactura= new JTextFieldMe();
		jTextFielddescuentoFactura.setEnabled(false);
		jTextFielddescuentoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoFactura.setText("0.0");

		this.jButtondescuentoFacturaBusqueda= new JButtonMe();
		this.jButtondescuentoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoFacturaBusqueda.setText("U");
		this.jButtondescuentoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoFactura = new JLabelMe();
		this.jLabelfinanciamientoFactura.setText(""+FacturaConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoFactura.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelfinanciamientoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldfinanciamientoFactura= new JTextFieldMe();
		jTextFieldfinanciamientoFactura.setEnabled(false);
		jTextFieldfinanciamientoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoFactura.setText("0.0");

		this.jButtonfinanciamientoFacturaBusqueda= new JButtonMe();
		this.jButtonfinanciamientoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoFacturaBusqueda.setText("U");
		this.jButtonfinanciamientoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelmargen_utilidadFactura = new JLabelMe();
		this.jLabelmargen_utilidadFactura.setText(""+FacturaConstantesFunciones.LABEL_MARGENUTILIDAD+" : *");
		this.jLabelmargen_utilidadFactura.setToolTipText("Margen Utilidad");
		this.jLabelmargen_utilidadFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmargen_utilidadFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmargen_utilidadFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmargen_utilidadFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmargen_utilidadFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmargen_utilidadFactura.setToolTipText(FacturaConstantesFunciones.LABEL_MARGENUTILIDAD);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelmargen_utilidadFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldmargen_utilidadFactura= new JTextFieldMe();
		jTextFieldmargen_utilidadFactura.setEnabled(false);
		jTextFieldmargen_utilidadFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmargen_utilidadFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmargen_utilidadFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmargen_utilidadFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmargen_utilidadFactura.setText("0.0");

		this.jButtonmargen_utilidadFacturaBusqueda= new JButtonMe();
		this.jButtonmargen_utilidadFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmargen_utilidadFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmargen_utilidadFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmargen_utilidadFacturaBusqueda.setText("U");
		this.jButtonmargen_utilidadFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmargen_utilidadFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmargen_utilidadFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmargen_utilidadFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmargen_utilidadFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"margen_utilidadFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmargen_utilidadFacturaBusqueda.setVisible(false);		}


					
		this.jLabeliceFactura = new JLabelMe();
		this.jLabeliceFactura.setText(""+FacturaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceFactura.setToolTipText("Ice");
		this.jLabeliceFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceFactura.setToolTipText(FacturaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneliceFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldiceFactura= new JTextFieldMe();
		jTextFieldiceFactura.setEnabled(false);
		jTextFieldiceFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceFactura.setText("0.0");

		this.jButtoniceFacturaBusqueda= new JButtonMe();
		this.jButtoniceFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceFacturaBusqueda.setText("U");
		this.jButtoniceFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceFacturaBusqueda.setVisible(false);		}


					
		this.jLabelanticipoFactura = new JLabelMe();
		this.jLabelanticipoFactura.setText(""+FacturaConstantesFunciones.LABEL_ANTICIPO+" : *");
		this.jLabelanticipoFactura.setToolTipText("Anticipo");
		this.jLabelanticipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanticipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanticipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanticipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanticipoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanticipoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_ANTICIPO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelanticipoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldanticipoFactura= new JTextFieldMe();
		jTextFieldanticipoFactura.setEnabled(false);
		jTextFieldanticipoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanticipoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanticipoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanticipoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldanticipoFactura.setText("0.0");

		this.jButtonanticipoFacturaBusqueda= new JButtonMe();
		this.jButtonanticipoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanticipoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanticipoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanticipoFacturaBusqueda.setText("U");
		this.jButtonanticipoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanticipoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanticipoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanticipoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanticipoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anticipoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanticipoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelotros_valoresFactura = new JLabelMe();
		this.jLabelotros_valoresFactura.setText(""+FacturaConstantesFunciones.LABEL_OTROSVALORES+" : *");
		this.jLabelotros_valoresFactura.setToolTipText("Otros Valores");
		this.jLabelotros_valoresFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotros_valoresFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotros_valoresFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotros_valoresFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotros_valoresFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotros_valoresFactura.setToolTipText(FacturaConstantesFunciones.LABEL_OTROSVALORES);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelotros_valoresFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldotros_valoresFactura= new JTextFieldMe();
		jTextFieldotros_valoresFactura.setEnabled(false);
		jTextFieldotros_valoresFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_valoresFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotros_valoresFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotros_valoresFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotros_valoresFactura.setText("0.0");

		this.jButtonotros_valoresFacturaBusqueda= new JButtonMe();
		this.jButtonotros_valoresFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_valoresFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotros_valoresFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotros_valoresFacturaBusqueda.setText("U");
		this.jButtonotros_valoresFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotros_valoresFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotros_valoresFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotros_valoresFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotros_valoresFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otros_valoresFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotros_valoresFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_retencionFactura = new JLabelMe();
		this.jLabeltotal_retencionFactura.setText(""+FacturaConstantesFunciones.LABEL_TOTALRETENCION+" : *");
		this.jLabeltotal_retencionFactura.setToolTipText("Total Retencion");
		this.jLabeltotal_retencionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_retencionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_retencionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_retencionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_retencionFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_retencionFactura.setToolTipText(FacturaConstantesFunciones.LABEL_TOTALRETENCION);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneltotal_retencionFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldtotal_retencionFactura= new JTextFieldMe();
		jTextFieldtotal_retencionFactura.setEnabled(false);
		jTextFieldtotal_retencionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_retencionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_retencionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_retencionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_retencionFactura.setText("0.0");

		this.jButtontotal_retencionFacturaBusqueda= new JButtonMe();
		this.jButtontotal_retencionFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_retencionFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_retencionFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_retencionFacturaBusqueda.setText("U");
		this.jButtontotal_retencionFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_retencionFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_retencionFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_retencionFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_retencionFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_retencionFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_retencionFacturaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_consumo_especialFactura = new JLabelMe();
		this.jLabeltotal_consumo_especialFactura.setText(""+FacturaConstantesFunciones.LABEL_TOTALCONSUMOESPECIAL+" : *");
		this.jLabeltotal_consumo_especialFactura.setToolTipText("Total Consumo Especial");
		this.jLabeltotal_consumo_especialFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_consumo_especialFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabeltotal_consumo_especialFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_consumo_especialFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_consumo_especialFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_consumo_especialFactura.setToolTipText(FacturaConstantesFunciones.LABEL_TOTALCONSUMOESPECIAL);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneltotal_consumo_especialFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldtotal_consumo_especialFactura= new JTextFieldMe();
		jTextFieldtotal_consumo_especialFactura.setEnabled(false);
		jTextFieldtotal_consumo_especialFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_consumo_especialFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_consumo_especialFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_consumo_especialFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_consumo_especialFactura.setText("0.0");

		this.jButtontotal_consumo_especialFacturaBusqueda= new JButtonMe();
		this.jButtontotal_consumo_especialFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_consumo_especialFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_consumo_especialFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_consumo_especialFacturaBusqueda.setText("U");
		this.jButtontotal_consumo_especialFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_consumo_especialFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_consumo_especialFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_consumo_especialFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_consumo_especialFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_consumo_especialFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_consumo_especialFacturaBusqueda.setVisible(false);		}


					
		this.jLabelretencionFactura = new JLabelMe();
		this.jLabelretencionFactura.setText(""+FacturaConstantesFunciones.LABEL_RETENCION+" : *");
		this.jLabelretencionFactura.setToolTipText("Retencion");
		this.jLabelretencionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencionFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencionFactura.setToolTipText(FacturaConstantesFunciones.LABEL_RETENCION);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelretencionFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldretencionFactura= new JTextFieldMe();
		jTextFieldretencionFactura.setEnabled(false);
		jTextFieldretencionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencionFactura.setText("0.0");

		this.jButtonretencionFacturaBusqueda= new JButtonMe();
		this.jButtonretencionFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencionFacturaBusqueda.setText("U");
		this.jButtonretencionFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencionFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencionFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencionFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencionFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencionFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencionFacturaBusqueda.setVisible(false);		}


					
		this.jLabeles_clienteFactura = new JLabelMe();
		this.jLabeles_clienteFactura.setText(""+FacturaConstantesFunciones.LABEL_ESCLIENTE+" : *");
		this.jLabeles_clienteFactura.setToolTipText("Es Cliente");
		this.jLabeles_clienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_clienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_clienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_clienteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_clienteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_clienteFactura.setToolTipText(FacturaConstantesFunciones.LABEL_ESCLIENTE);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPaneles_clienteFactura.setLayout(this.gridaBagLayoutFactura);


		jCheckBoxes_clienteFactura= new JCheckBoxMe();
		jCheckBoxes_clienteFactura.setEnabled(false);

		jCheckBoxes_clienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_clienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_clienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_clienteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_clienteFacturaBusqueda= new JButtonMe();
		this.jButtones_clienteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_clienteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_clienteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_clienteFacturaBusqueda.setText("U");
		this.jButtones_clienteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_clienteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_clienteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_clienteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_clienteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_clienteFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_clienteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfechaFactura = new JLabelMe();
		this.jLabelfechaFactura.setText(""+FacturaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaFactura.setToolTipText("Fecha");
		this.jLabelfechaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaFactura.setToolTipText(FacturaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelfechaFactura.setLayout(this.gridaBagLayoutFactura);


		//jFormattedTextFieldfechaFactura= new JFormattedTextFieldMe();

		jDateChooserfechaFactura= new JDateChooser();
		jDateChooserfechaFactura.setEnabled(false);
		jDateChooserfechaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaFactura.setDate(new Date());
		jDateChooserfechaFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaFacturaBusqueda= new JButtonMe();
		this.jButtonfechaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaFacturaBusqueda.setText("U");
		this.jButtonfechaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_autorizacionFactura = new JLabelMe();
		this.jLabelfecha_autorizacionFactura.setText(""+FacturaConstantesFunciones.LABEL_FECHAAUTORIZACION+" : *");
		this.jLabelfecha_autorizacionFactura.setToolTipText("Fecha Autorizacion");
		this.jLabelfecha_autorizacionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_autorizacionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_autorizacionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_autorizacionFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_autorizacionFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_autorizacionFactura.setToolTipText(FacturaConstantesFunciones.LABEL_FECHAAUTORIZACION);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelfecha_autorizacionFactura.setLayout(this.gridaBagLayoutFactura);


		//jFormattedTextFieldfecha_autorizacionFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_autorizacionFactura= new JDateChooser();
		jDateChooserfecha_autorizacionFactura.setEnabled(false);
		jDateChooserfecha_autorizacionFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizacionFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizacionFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_autorizacionFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_autorizacionFactura.setDate(new Date());
		jDateChooserfecha_autorizacionFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_autorizacionFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_autorizacionFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_autorizacionFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizacionFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizacionFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_autorizacionFacturaBusqueda.setText("U");
		this.jButtonfecha_autorizacionFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_autorizacionFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_autorizacionFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_autorizacionFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_autorizacionFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_autorizacionFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_autorizacionFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_clienteFactura = new JLabelMe();
		this.jLabelfecha_clienteFactura.setText(""+FacturaConstantesFunciones.LABEL_FECHACLIENTE+" : *");
		this.jLabelfecha_clienteFactura.setToolTipText("Fecha Cliente");
		this.jLabelfecha_clienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_clienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_clienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_clienteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_clienteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_clienteFactura.setToolTipText(FacturaConstantesFunciones.LABEL_FECHACLIENTE);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelfecha_clienteFactura.setLayout(this.gridaBagLayoutFactura);


		//jFormattedTextFieldfecha_clienteFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_clienteFactura= new JDateChooser();
		jDateChooserfecha_clienteFactura.setEnabled(false);
		jDateChooserfecha_clienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_clienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_clienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_clienteFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_clienteFactura.setDate(new Date());
		jDateChooserfecha_clienteFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_clienteFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_clienteFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_clienteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_clienteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_clienteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_clienteFacturaBusqueda.setText("U");
		this.jButtonfecha_clienteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_clienteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_clienteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_clienteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_clienteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_clienteFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_clienteFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_documentoFactura = new JLabelMe();
		this.jLabelnumero_documentoFactura.setText(""+FacturaConstantesFunciones.LABEL_NUMERODOCUMENTO+" :");
		this.jLabelnumero_documentoFactura.setToolTipText("Numero Documento");
		this.jLabelnumero_documentoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_documentoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_documentoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_documentoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_documentoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_NUMERODOCUMENTO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelnumero_documentoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldnumero_documentoFactura= new JTextFieldMe();

		jTextFieldnumero_documentoFactura.setEnabled(false);
		jTextFieldnumero_documentoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_documentoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_documentoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_documentoFacturaBusqueda= new JButtonMe();
		this.jButtonnumero_documentoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_documentoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_documentoFacturaBusqueda.setText("U");
		this.jButtonnumero_documentoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_documentoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_documentoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_documentoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_documentoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_documentoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_documentoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_dauFactura = new JLabelMe();
		this.jLabelnumero_dauFactura.setText(""+FacturaConstantesFunciones.LABEL_NUMERODAU+" :");
		this.jLabelnumero_dauFactura.setToolTipText("Numero Dau");
		this.jLabelnumero_dauFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_dauFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_dauFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_dauFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_dauFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_dauFactura.setToolTipText(FacturaConstantesFunciones.LABEL_NUMERODAU);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelnumero_dauFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldnumero_dauFactura= new JTextFieldMe();

		jTextFieldnumero_dauFactura.setEnabled(false);
		jTextFieldnumero_dauFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_dauFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_dauFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_dauFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_dauFacturaBusqueda= new JButtonMe();
		this.jButtonnumero_dauFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_dauFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_dauFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_dauFacturaBusqueda.setText("U");
		this.jButtonnumero_dauFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_dauFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_dauFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_dauFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_dauFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_dauFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_dauFacturaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_referendoFactura = new JLabelMe();
		this.jLabelnumero_referendoFactura.setText(""+FacturaConstantesFunciones.LABEL_NUMEROREFERENDO+" :");
		this.jLabelnumero_referendoFactura.setToolTipText("Numero Referendo");
		this.jLabelnumero_referendoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_referendoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_referendoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_referendoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_referendoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_referendoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_NUMEROREFERENDO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelnumero_referendoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldnumero_referendoFactura= new JTextFieldMe();

		jTextFieldnumero_referendoFactura.setEnabled(false);
		jTextFieldnumero_referendoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_referendoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_referendoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_referendoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_referendoFacturaBusqueda= new JButtonMe();
		this.jButtonnumero_referendoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_referendoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_referendoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_referendoFacturaBusqueda.setText("U");
		this.jButtonnumero_referendoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_referendoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_referendoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_referendoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_referendoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_referendoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_referendoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_referendoFactura = new JLabelMe();
		this.jLabelfecha_referendoFactura.setText(""+FacturaConstantesFunciones.LABEL_FECHAREFERENDO+" : *");
		this.jLabelfecha_referendoFactura.setToolTipText("Fecha Referendo");
		this.jLabelfecha_referendoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_referendoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_referendoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_referendoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_referendoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_referendoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_FECHAREFERENDO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelfecha_referendoFactura.setLayout(this.gridaBagLayoutFactura);


		//jFormattedTextFieldfecha_referendoFactura= new JFormattedTextFieldMe();

		jDateChooserfecha_referendoFactura= new JDateChooser();
		jDateChooserfecha_referendoFactura.setEnabled(false);
		jDateChooserfecha_referendoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_referendoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_referendoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_referendoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_referendoFactura.setDate(new Date());
		jDateChooserfecha_referendoFactura.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_referendoFactura.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_referendoFacturaBusqueda= new JButtonMe();
		this.jButtonfecha_referendoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_referendoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_referendoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_referendoFacturaBusqueda.setText("U");
		this.jButtonfecha_referendoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_referendoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_referendoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_referendoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_referendoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_referendoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_referendoFacturaBusqueda.setVisible(false);		}


					
		this.jLabelaforo_referendoFactura = new JLabelMe();
		this.jLabelaforo_referendoFactura.setText(""+FacturaConstantesFunciones.LABEL_AFOROREFERENDO+" :");
		this.jLabelaforo_referendoFactura.setToolTipText("Aforo Referendo");
		this.jLabelaforo_referendoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelaforo_referendoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelaforo_referendoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelaforo_referendoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaforo_referendoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaforo_referendoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_AFOROREFERENDO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelaforo_referendoFactura.setLayout(this.gridaBagLayoutFactura);


		jTextFieldaforo_referendoFactura= new JTextFieldMe();

		jTextFieldaforo_referendoFactura.setEnabled(false);
		jTextFieldaforo_referendoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaforo_referendoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaforo_referendoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldaforo_referendoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonaforo_referendoFacturaBusqueda= new JButtonMe();
		this.jButtonaforo_referendoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaforo_referendoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaforo_referendoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaforo_referendoFacturaBusqueda.setText("U");
		this.jButtonaforo_referendoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaforo_referendoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaforo_referendoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldaforo_referendoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldaforo_referendoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"aforo_referendoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaforo_referendoFacturaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFactura() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFactura = new JLabelMe();
		this.jLabelid_empresaFactura.setText(""+FacturaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFactura.setToolTipText("Empresa");
		this.jLabelid_empresaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_empresaFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_empresaFactura= new JComboBoxMe();
		jComboBoxid_empresaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFactura.setEnabled(false);

		this.jButtonid_empresaFactura= new JButtonMe();
		this.jButtonid_empresaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFactura.setText("Buscar");
		this.jButtonid_empresaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFactura"));

		this.jButtonid_empresaFacturaBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaBusqueda.setText("U");
		this.jButtonid_empresaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturaUpdate= new JButtonMe();
		this.jButtonid_empresaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaUpdate.setText("U");
		this.jButtonid_empresaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaUpdate"));



					
		this.jLabelid_sucursalFactura = new JLabelMe();
		this.jLabelid_sucursalFactura.setText(""+FacturaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFactura.setToolTipText("Sucursal");
		this.jLabelid_sucursalFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_sucursalFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_sucursalFactura= new JComboBoxMe();
		jComboBoxid_sucursalFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFactura.setEnabled(false);

		this.jButtonid_sucursalFactura= new JButtonMe();
		this.jButtonid_sucursalFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFactura.setText("Buscar");
		this.jButtonid_sucursalFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFactura"));

		this.jButtonid_sucursalFacturaBusqueda= new JButtonMe();
		this.jButtonid_sucursalFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaBusqueda.setText("U");
		this.jButtonid_sucursalFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFacturaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFacturaUpdate= new JButtonMe();
		this.jButtonid_sucursalFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaUpdate.setText("U");
		this.jButtonid_sucursalFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaUpdate"));



					
		this.jLabelid_ejercicioFactura = new JLabelMe();
		this.jLabelid_ejercicioFactura.setText(""+FacturaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioFactura.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_ejercicioFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_ejercicioFactura= new JComboBoxMe();
		jComboBoxid_ejercicioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioFactura.setEnabled(false);

		this.jButtonid_ejercicioFactura= new JButtonMe();
		this.jButtonid_ejercicioFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFactura.setText("Buscar");
		this.jButtonid_ejercicioFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFactura"));

		this.jButtonid_ejercicioFacturaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFacturaBusqueda.setText("U");
		this.jButtonid_ejercicioFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioFacturaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioFacturaUpdate= new JButtonMe();
		this.jButtonid_ejercicioFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFacturaUpdate.setText("U");
		this.jButtonid_ejercicioFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFacturaUpdate"));



					
		this.jLabelid_periodoFactura = new JLabelMe();
		this.jLabelid_periodoFactura.setText(""+FacturaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoFactura.setToolTipText("Periodo");
		this.jLabelid_periodoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_periodoFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_periodoFactura= new JComboBoxMe();
		jComboBoxid_periodoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoFactura.setEnabled(false);

		this.jButtonid_periodoFactura= new JButtonMe();
		this.jButtonid_periodoFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFactura.setText("Buscar");
		this.jButtonid_periodoFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFactura"));

		this.jButtonid_periodoFacturaBusqueda= new JButtonMe();
		this.jButtonid_periodoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFacturaBusqueda.setText("U");
		this.jButtonid_periodoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoFacturaBusqueda.setVisible(false);		}

		this.jButtonid_periodoFacturaUpdate= new JButtonMe();
		this.jButtonid_periodoFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFacturaUpdate.setText("U");
		this.jButtonid_periodoFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFacturaUpdate"));



					
		this.jLabelid_anioFactura = new JLabelMe();
		this.jLabelid_anioFactura.setText(""+FacturaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioFactura.setToolTipText("Anio");
		this.jLabelid_anioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_anioFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_anioFactura= new JComboBoxMe();
		jComboBoxid_anioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioFactura.setEnabled(false);

		this.jButtonid_anioFactura= new JButtonMe();
		this.jButtonid_anioFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFactura.setText("Buscar");
		this.jButtonid_anioFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFactura"));

		this.jButtonid_anioFacturaBusqueda= new JButtonMe();
		this.jButtonid_anioFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFacturaBusqueda.setText("U");
		this.jButtonid_anioFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioFacturaBusqueda.setVisible(false);		}

		this.jButtonid_anioFacturaUpdate= new JButtonMe();
		this.jButtonid_anioFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFacturaUpdate.setText("U");
		this.jButtonid_anioFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFacturaUpdate"));



					
		this.jLabelid_mesFactura = new JLabelMe();
		this.jLabelid_mesFactura.setText(""+FacturaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesFactura.setToolTipText("Mes");
		this.jLabelid_mesFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_mesFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_mesFactura= new JComboBoxMe();
		jComboBoxid_mesFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesFactura.setEnabled(false);

		this.jButtonid_mesFactura= new JButtonMe();
		this.jButtonid_mesFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFactura.setText("Buscar");
		this.jButtonid_mesFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFactura"));

		this.jButtonid_mesFacturaBusqueda= new JButtonMe();
		this.jButtonid_mesFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFacturaBusqueda.setText("U");
		this.jButtonid_mesFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesFacturaBusqueda.setVisible(false);		}

		this.jButtonid_mesFacturaUpdate= new JButtonMe();
		this.jButtonid_mesFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFacturaUpdate.setText("U");
		this.jButtonid_mesFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFacturaUpdate"));



					
		this.jLabelid_usuarioFactura = new JLabelMe();
		this.jLabelid_usuarioFactura.setText(""+FacturaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioFactura.setToolTipText("Usuario");
		this.jLabelid_usuarioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_usuarioFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_usuarioFactura= new JComboBoxMe();
		jComboBoxid_usuarioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioFactura.setEnabled(false);

		this.jButtonid_usuarioFactura= new JButtonMe();
		this.jButtonid_usuarioFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioFactura.setText("Buscar");
		this.jButtonid_usuarioFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioFactura"));

		this.jButtonid_usuarioFacturaBusqueda= new JButtonMe();
		this.jButtonid_usuarioFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioFacturaBusqueda.setText("U");
		this.jButtonid_usuarioFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioFacturaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioFacturaUpdate= new JButtonMe();
		this.jButtonid_usuarioFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioFacturaUpdate.setText("U");
		this.jButtonid_usuarioFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioFacturaUpdate"));



					
		this.jLabelid_monedaFactura = new JLabelMe();
		this.jLabelid_monedaFactura.setText(""+FacturaConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaFactura.setToolTipText("Moneda");
		this.jLabelid_monedaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_monedaFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_monedaFactura= new JComboBoxMe();
		jComboBoxid_monedaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaFactura= new JButtonMe();
		this.jButtonid_monedaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaFactura.setText("Buscar");
		this.jButtonid_monedaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaFactura"));

		this.jButtonid_monedaFacturaBusqueda= new JButtonMe();
		this.jButtonid_monedaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaFacturaBusqueda.setText("U");
		this.jButtonid_monedaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_monedaFacturaUpdate= new JButtonMe();
		this.jButtonid_monedaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaFacturaUpdate.setText("U");
		this.jButtonid_monedaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaFacturaUpdate"));



					
		this.jLabelid_empleadoFactura = new JLabelMe();
		this.jLabelid_empleadoFactura.setText(""+FacturaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoFactura.setToolTipText("Empleado");
		this.jLabelid_empleadoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_empleadoFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_empleadoFactura= new JComboBoxMe();
		jComboBoxid_empleadoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoFactura= new JButtonMe();
		this.jButtonid_empleadoFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFactura.setText("Buscar");
		this.jButtonid_empleadoFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFactura"));

		this.jButtonid_empleadoFacturaBusqueda= new JButtonMe();
		this.jButtonid_empleadoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoFacturaBusqueda.setText("U");
		this.jButtonid_empleadoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoFacturaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoFacturaUpdate= new JButtonMe();
		this.jButtonid_empleadoFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoFacturaUpdate.setText("U");
		this.jButtonid_empleadoFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFacturaUpdate"));



					
		this.jLabelid_formatoFactura = new JLabelMe();
		this.jLabelid_formatoFactura.setText(""+FacturaConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoFactura.setToolTipText("Formato");
		this.jLabelid_formatoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_formatoFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_formatoFactura= new JComboBoxMe();
		jComboBoxid_formatoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoFactura= new JButtonMe();
		this.jButtonid_formatoFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoFactura.setText("Buscar");
		this.jButtonid_formatoFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoFactura"));

		this.jButtonid_formatoFacturaBusqueda= new JButtonMe();
		this.jButtonid_formatoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoFacturaBusqueda.setText("U");
		this.jButtonid_formatoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoFacturaBusqueda.setVisible(false);		}

		this.jButtonid_formatoFacturaUpdate= new JButtonMe();
		this.jButtonid_formatoFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoFacturaUpdate.setText("U");
		this.jButtonid_formatoFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoFacturaUpdate"));



					
		this.jLabelid_clienteFactura = new JLabelMe();
		this.jLabelid_clienteFactura.setText(""+FacturaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteFactura.setToolTipText("Cliente");
		this.jLabelid_clienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_clienteFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_clienteFactura= new JComboBoxMe();
		jComboBoxid_clienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteFactura= new JButtonMe();
		this.jButtonid_clienteFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFactura.setText("Buscar");
		this.jButtonid_clienteFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFactura"));

		this.jButtonid_clienteFacturaBusqueda= new JButtonMe();
		this.jButtonid_clienteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturaBusqueda.setText("U");
		this.jButtonid_clienteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteFacturaBusqueda.setVisible(false);		}

		this.jButtonid_clienteFacturaUpdate= new JButtonMe();
		this.jButtonid_clienteFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturaUpdate.setText("U");
		this.jButtonid_clienteFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaUpdate"));



					
		this.jLabelid_tipo_precioFactura = new JLabelMe();
		this.jLabelid_tipo_precioFactura.setText(""+FacturaConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioFactura.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_tipo_precioFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_tipo_precioFactura= new JComboBoxMe();
		jComboBoxid_tipo_precioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioFactura= new JButtonMe();
		this.jButtonid_tipo_precioFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioFactura.setText("Buscar");
		this.jButtonid_tipo_precioFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioFactura"));

		this.jButtonid_tipo_precioFacturaBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioFacturaBusqueda.setText("U");
		this.jButtonid_tipo_precioFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioFacturaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioFacturaUpdate= new JButtonMe();
		this.jButtonid_tipo_precioFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioFacturaUpdate.setText("U");
		this.jButtonid_tipo_precioFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioFacturaUpdate"));



					
		this.jLabelid_sub_clienteFactura = new JLabelMe();
		this.jLabelid_sub_clienteFactura.setText(""+FacturaConstantesFunciones.LABEL_IDSUBCLIENTE+" :");
		this.jLabelid_sub_clienteFactura.setToolTipText("Contacto");
		this.jLabelid_sub_clienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sub_clienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sub_clienteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sub_clienteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sub_clienteFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDSUBCLIENTE);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_sub_clienteFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_sub_clienteFactura= new JComboBoxMe();
		jComboBoxid_sub_clienteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sub_clienteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sub_clienteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_sub_clienteFactura= new JButtonMe();
		this.jButtonid_sub_clienteFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sub_clienteFactura.setText("Buscar");
		this.jButtonid_sub_clienteFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sub_clienteFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sub_clienteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteFactura"));

		this.jButtonid_sub_clienteFacturaBusqueda= new JButtonMe();
		this.jButtonid_sub_clienteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clienteFacturaBusqueda.setText("U");
		this.jButtonid_sub_clienteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sub_clienteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sub_clienteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sub_clienteFacturaBusqueda.setVisible(false);		}

		this.jButtonid_sub_clienteFacturaUpdate= new JButtonMe();
		this.jButtonid_sub_clienteFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sub_clienteFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sub_clienteFacturaUpdate.setText("U");
		this.jButtonid_sub_clienteFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sub_clienteFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sub_clienteFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sub_clienteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sub_clienteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sub_clienteFacturaUpdate"));



					
		this.jLabelid_vendedorFactura = new JLabelMe();
		this.jLabelid_vendedorFactura.setText(""+FacturaConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorFactura.setToolTipText("Vendedor");
		this.jLabelid_vendedorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_vendedorFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_vendedorFactura= new JComboBoxMe();
		jComboBoxid_vendedorFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorFactura= new JButtonMe();
		this.jButtonid_vendedorFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorFactura.setText("Buscar");
		this.jButtonid_vendedorFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFactura"));

		this.jButtonid_vendedorFacturaBusqueda= new JButtonMe();
		this.jButtonid_vendedorFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorFacturaBusqueda.setText("U");
		this.jButtonid_vendedorFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorFacturaBusqueda.setVisible(false);		}

		this.jButtonid_vendedorFacturaUpdate= new JButtonMe();
		this.jButtonid_vendedorFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorFacturaUpdate.setText("U");
		this.jButtonid_vendedorFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFacturaUpdate"));


		jButtonid_vendedorFacturaArbol= new JButtonMe();
		jButtonid_vendedorFacturaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorFacturaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorFacturaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorFacturaArbol.setText("Arbol");
		jButtonid_vendedorFacturaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorFacturaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFacturaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFacturaArbol"));



					
		this.jLabelid_transporteFactura = new JLabelMe();
		this.jLabelid_transporteFactura.setText(""+FacturaConstantesFunciones.LABEL_IDTRANSPORTE+" :");
		this.jLabelid_transporteFactura.setToolTipText("Transporte");
		this.jLabelid_transporteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transporteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transporteFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transporteFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDTRANSPORTE);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_transporteFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_transporteFactura= new JComboBoxMe();
		jComboBoxid_transporteFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transporteFactura= new JButtonMe();
		this.jButtonid_transporteFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteFactura.setText("Buscar");
		this.jButtonid_transporteFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transporteFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transporteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteFactura"));

		this.jButtonid_transporteFacturaBusqueda= new JButtonMe();
		this.jButtonid_transporteFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteFacturaBusqueda.setText("U");
		this.jButtonid_transporteFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transporteFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transporteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transporteFacturaBusqueda.setVisible(false);		}

		this.jButtonid_transporteFacturaUpdate= new JButtonMe();
		this.jButtonid_transporteFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteFacturaUpdate.setText("U");
		this.jButtonid_transporteFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transporteFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transporteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteFacturaUpdate"));



					
		this.jLabelid_transportistaFactura = new JLabelMe();
		this.jLabelid_transportistaFactura.setText(""+FacturaConstantesFunciones.LABEL_IDTRANSPORTISTA+" :");
		this.jLabelid_transportistaFactura.setToolTipText("Transportista");
		this.jLabelid_transportistaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_transportistaFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_transportistaFactura= new JComboBoxMe();
		jComboBoxid_transportistaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportistaFactura= new JButtonMe();
		this.jButtonid_transportistaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaFactura.setText("Buscar");
		this.jButtonid_transportistaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaFactura"));

		this.jButtonid_transportistaFacturaBusqueda= new JButtonMe();
		this.jButtonid_transportistaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaFacturaBusqueda.setText("U");
		this.jButtonid_transportistaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_transportistaFacturaUpdate= new JButtonMe();
		this.jButtonid_transportistaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaFacturaUpdate.setText("U");
		this.jButtonid_transportistaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaFacturaUpdate"));



					
		this.jLabelid_tipo_llamadaFactura = new JLabelMe();
		this.jLabelid_tipo_llamadaFactura.setText(""+FacturaConstantesFunciones.LABEL_IDTIPOLLAMADA+" : *");
		this.jLabelid_tipo_llamadaFactura.setToolTipText("Tipo Llamada");
		this.jLabelid_tipo_llamadaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_llamadaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_llamadaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_llamadaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_llamadaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_llamadaFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDTIPOLLAMADA);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_tipo_llamadaFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_tipo_llamadaFactura= new JComboBoxMe();
		jComboBoxid_tipo_llamadaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_llamadaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_llamadaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_llamadaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_llamadaFactura= new JButtonMe();
		this.jButtonid_tipo_llamadaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_llamadaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_llamadaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_llamadaFactura.setText("Buscar");
		this.jButtonid_tipo_llamadaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_llamadaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_llamadaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_llamadaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_llamadaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_llamadaFactura"));

		this.jButtonid_tipo_llamadaFacturaBusqueda= new JButtonMe();
		this.jButtonid_tipo_llamadaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_llamadaFacturaBusqueda.setText("U");
		this.jButtonid_tipo_llamadaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_llamadaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_llamadaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_llamadaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_llamadaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_llamadaFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_llamadaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_llamadaFacturaUpdate= new JButtonMe();
		this.jButtonid_tipo_llamadaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_llamadaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_llamadaFacturaUpdate.setText("U");
		this.jButtonid_tipo_llamadaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_llamadaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_llamadaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_llamadaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_llamadaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_llamadaFacturaUpdate"));



					
		this.jLabelid_tipo_facturaFactura = new JLabelMe();
		this.jLabelid_tipo_facturaFactura.setText(""+FacturaConstantesFunciones.LABEL_IDTIPOFACTURA+" : *");
		this.jLabelid_tipo_facturaFactura.setToolTipText("Tipo Factura");
		this.jLabelid_tipo_facturaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_facturaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_facturaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_facturaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_facturaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_facturaFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDTIPOFACTURA);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_tipo_facturaFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_tipo_facturaFactura= new JComboBoxMe();
		jComboBoxid_tipo_facturaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_facturaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_facturaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_facturaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_facturaFactura= new JButtonMe();
		this.jButtonid_tipo_facturaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_facturaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_facturaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_facturaFactura.setText("Buscar");
		this.jButtonid_tipo_facturaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_facturaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_facturaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_facturaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_facturaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_facturaFactura"));

		this.jButtonid_tipo_facturaFacturaBusqueda= new JButtonMe();
		this.jButtonid_tipo_facturaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_facturaFacturaBusqueda.setText("U");
		this.jButtonid_tipo_facturaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_facturaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_facturaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_facturaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_facturaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_facturaFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_facturaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_facturaFacturaUpdate= new JButtonMe();
		this.jButtonid_tipo_facturaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_facturaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_facturaFacturaUpdate.setText("U");
		this.jButtonid_tipo_facturaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_facturaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_facturaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_facturaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_facturaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_facturaFacturaUpdate"));



					
		this.jLabelid_tipo_cambioFactura = new JLabelMe();
		this.jLabelid_tipo_cambioFactura.setText(""+FacturaConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioFactura.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_tipo_cambioFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_tipo_cambioFactura= new JComboBoxMe();
		jComboBoxid_tipo_cambioFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioFactura.setEnabled(false);

		this.jButtonid_tipo_cambioFactura= new JButtonMe();
		this.jButtonid_tipo_cambioFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioFactura.setText("Buscar");
		this.jButtonid_tipo_cambioFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioFactura"));

		this.jButtonid_tipo_cambioFacturaBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioFacturaBusqueda.setText("U");
		this.jButtonid_tipo_cambioFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioFacturaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioFacturaUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioFacturaUpdate.setText("U");
		this.jButtonid_tipo_cambioFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioFacturaUpdate"));



					
		this.jLabelid_asiento_contableFactura = new JLabelMe();
		this.jLabelid_asiento_contableFactura.setText(""+FacturaConstantesFunciones.LABEL_IDASIENTOCONTABLE+" :");
		this.jLabelid_asiento_contableFactura.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_asiento_contableFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_asiento_contableFactura= new JComboBoxMe();
		jComboBoxid_asiento_contableFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableFactura.setEnabled(false);

		this.jButtonid_asiento_contableFactura= new JButtonMe();
		this.jButtonid_asiento_contableFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableFactura.setText("Buscar");
		this.jButtonid_asiento_contableFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableFactura"));

		this.jButtonid_asiento_contableFacturaBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableFacturaBusqueda.setText("U");
		this.jButtonid_asiento_contableFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableFacturaBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableFacturaUpdate= new JButtonMe();
		this.jButtonid_asiento_contableFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableFacturaUpdate.setText("U");
		this.jButtonid_asiento_contableFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableFacturaUpdate"));



					
		this.jLabelid_pedidoFactura = new JLabelMe();
		this.jLabelid_pedidoFactura.setText(""+FacturaConstantesFunciones.LABEL_IDPEDIDO+" :");
		this.jLabelid_pedidoFactura.setToolTipText("Idpedido");
		this.jLabelid_pedidoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedidoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_pedidoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pedidoFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pedidoFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pedidoFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDPEDIDO);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_pedidoFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_pedidoFactura= new JComboBoxMe();
		jComboBoxid_pedidoFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedidoFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedidoFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_pedidoFactura.setEnabled(false);

		this.jButtonid_pedidoFactura= new JButtonMe();
		this.jButtonid_pedidoFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedidoFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedidoFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedidoFactura.setText("Buscar");
		this.jButtonid_pedidoFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pedidoFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedidoFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pedidoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedidoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedidoFactura"));

		this.jButtonid_pedidoFacturaBusqueda= new JButtonMe();
		this.jButtonid_pedidoFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedidoFacturaBusqueda.setText("U");
		this.jButtonid_pedidoFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pedidoFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedidoFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pedidoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedidoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedidoFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pedidoFacturaBusqueda.setVisible(false);		}

		this.jButtonid_pedidoFacturaUpdate= new JButtonMe();
		this.jButtonid_pedidoFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedidoFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedidoFacturaUpdate.setText("U");
		this.jButtonid_pedidoFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pedidoFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedidoFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pedidoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedidoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedidoFacturaUpdate"));



					
		this.jLabelid_responsableFactura = new JLabelMe();
		this.jLabelid_responsableFactura.setText(""+FacturaConstantesFunciones.LABEL_IDRESPONSABLE+" :");
		this.jLabelid_responsableFactura.setToolTipText("Responsable");
		this.jLabelid_responsableFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsableFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsableFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_responsableFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_responsableFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_responsableFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDRESPONSABLE);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_responsableFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_responsableFactura= new JComboBoxMe();
		jComboBoxid_responsableFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsableFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_responsableFactura.setEnabled(false);

		this.jButtonid_responsableFactura= new JButtonMe();
		this.jButtonid_responsableFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableFactura.setText("Buscar");
		this.jButtonid_responsableFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_responsableFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_responsableFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableFactura"));

		this.jButtonid_responsableFacturaBusqueda= new JButtonMe();
		this.jButtonid_responsableFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsableFacturaBusqueda.setText("U");
		this.jButtonid_responsableFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_responsableFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_responsableFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_responsableFacturaBusqueda.setVisible(false);		}

		this.jButtonid_responsableFacturaUpdate= new JButtonMe();
		this.jButtonid_responsableFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsableFacturaUpdate.setText("U");
		this.jButtonid_responsableFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_responsableFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_responsableFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableFacturaUpdate"));



					
		this.jLabelid_estado_fisico_factura_empresaFactura = new JLabelMe();
		this.jLabelid_estado_fisico_factura_empresaFactura.setText(""+FacturaConstantesFunciones.LABEL_IDESTADOFISICOFACTURAEMPRESA+" :");
		this.jLabelid_estado_fisico_factura_empresaFactura.setToolTipText("Estado Fisico");
		this.jLabelid_estado_fisico_factura_empresaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_fisico_factura_empresaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_fisico_factura_empresaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_fisico_factura_empresaFactura,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_fisico_factura_empresaFactura=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_fisico_factura_empresaFactura.setToolTipText(FacturaConstantesFunciones.LABEL_IDESTADOFISICOFACTURAEMPRESA);
		this.gridaBagLayoutFactura = new GridBagLayout();
		this.jPanelid_estado_fisico_factura_empresaFactura.setLayout(this.gridaBagLayoutFactura);


		jComboBoxid_estado_fisico_factura_empresaFactura= new JComboBoxMe();
		jComboBoxid_estado_fisico_factura_empresaFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_fisico_factura_empresaFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_fisico_factura_empresaFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_fisico_factura_empresaFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_fisico_factura_empresaFactura.setEnabled(false);

		this.jButtonid_estado_fisico_factura_empresaFactura= new JButtonMe();
		this.jButtonid_estado_fisico_factura_empresaFactura.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_fisico_factura_empresaFactura.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_fisico_factura_empresaFactura.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_fisico_factura_empresaFactura.setText("Buscar");
		this.jButtonid_estado_fisico_factura_empresaFactura.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_fisico_factura_empresaFactura.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_fisico_factura_empresaFactura,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_fisico_factura_empresaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_fisico_factura_empresaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_fisico_factura_empresaFactura"));

		this.jButtonid_estado_fisico_factura_empresaFacturaBusqueda= new JButtonMe();
		this.jButtonid_estado_fisico_factura_empresaFacturaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_fisico_factura_empresaFacturaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_fisico_factura_empresaFacturaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_fisico_factura_empresaFacturaBusqueda.setText("U");
		this.jButtonid_estado_fisico_factura_empresaFacturaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_fisico_factura_empresaFacturaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_fisico_factura_empresaFacturaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_fisico_factura_empresaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_fisico_factura_empresaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_fisico_factura_empresaFacturaBusqueda"));

		if(this.facturaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_fisico_factura_empresaFacturaBusqueda.setVisible(false);		}

		this.jButtonid_estado_fisico_factura_empresaFacturaUpdate= new JButtonMe();
		this.jButtonid_estado_fisico_factura_empresaFacturaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_fisico_factura_empresaFacturaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_fisico_factura_empresaFacturaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_fisico_factura_empresaFacturaUpdate.setText("U");
		this.jButtonid_estado_fisico_factura_empresaFacturaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_fisico_factura_empresaFacturaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_fisico_factura_empresaFacturaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_fisico_factura_empresaFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_fisico_factura_empresaFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_fisico_factura_empresaFacturaUpdate"));



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
		//this.jInternalFrameDetalleFactura = new FacturaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Factura DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFactura= new GridBagLayout();
		

		
		String sToolTipFactura="";
		sToolTipFactura=FacturaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFactura+="(Facturacion.Factura)";
		}
		
		if(!this.facturaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFactura+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFactura = new JButtonMe();
		this.jButtonModificarFactura = new JButtonMe();
        this.jButtonActualizarFactura = new JButtonMe();
        this.jButtonEliminarFactura = new JButtonMe();
        this.jButtonCancelarFactura = new JButtonMe();
        this.jButtonGuardarCambiosFactura = new JButtonMe();
		this.jButtonGuardarCambiosTablaFactura = new JButtonMe();
		this.jButtonCerrarFactura = new JButtonMe();
		
		this.jScrollPanelDatosFactura = new JScrollPane();   
        this.jScrollPanelDatosEdicionFactura = new JScrollPane();
		this.jScrollPanelDatosGeneralFactura = new JScrollPane();
				
		
		
		this.jPanelCamposFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Factura";
		
		if(!this.facturaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Facturas" + this.sPath));
		} else {
			this.jScrollPanelDatosFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposFactura.setName("jPanelCamposFactura"); 

		this.jPanelCamposOcultosFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFactura.setName("jPanelCamposOcultosFactura"); 

        this.jPanelAccionesFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFactura.setToolTipText("Acciones");
        this.jPanelAccionesFactura.setName("Acciones"); 

		this.jPanelAccionesFormularioFactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFactura.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFactura.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFactura, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFactura, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalFactura.setName("jPanelCamposFintotalFactura");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalFactura, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFactura.setText("Nuevo");
		this.jButtonModificarFactura.setText("Editar");
        this.jButtonActualizarFactura.setText("Actualizar");
        this.jButtonEliminarFactura.setText("Eliminar");
        this.jButtonCancelarFactura.setText("Cancelar");
        this.jButtonGuardarCambiosFactura.setText("Guardar");
		this.jButtonGuardarCambiosTablaFactura.setText("Guardar");
		this.jButtonCerrarFactura.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFactura,"nuevo_button","Nuevo",this.facturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFactura,"modificar_button","Editar",this.facturaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFactura,"actualizar_button","Actualizar",this.facturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFactura,"eliminar_button","Eliminar",this.facturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFactura,"cancelar_button","Cancelar",this.facturaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFactura,"guardarcambios_button","Guardar",this.facturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFactura,"guardarcambiostabla_button","Guardar",this.facturaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFactura,"cerrar_button","Salir",this.facturaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFactura, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFactura, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFactura.setToolTipText("Nuevo"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFactura.setToolTipText("Editar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFactura.setToolTipText("Actualizar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFactura.setToolTipText("Eliminar)"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFactura.setToolTipText("Cancelar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFactura.setToolTipText("Guardar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFactura.setToolTipText("Guardar"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFactura.setToolTipText("Salir"+" "+FacturaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFactura";
		inputMap = this.jButtonNuevoFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFactura.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFactura"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFactura";
		inputMap = this.jButtonActualizarFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFactura"));
		
		//ELIMINAR
		sMapKey = "EliminarFactura";
		inputMap = this.jButtonEliminarFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFactura"));
		
		//CANCELAR	
		sMapKey = "CancelarFactura";
		inputMap = this.jButtonCancelarFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFactura"));
		
		//CERRAR		
		sMapKey = "CerrarFactura";
		inputMap = this.jButtonCerrarFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFactura"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFactura";
		inputMap = this.jButtonGuardarCambiosTablaFactura.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFactura.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFactura"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFactura.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFactura.setToolTipText("Nuevo Factura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFactura.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFactura.setToolTipText("Sin Cerrar Ventana Factura");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFactura, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFactura = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFactura.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFactura.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFactura, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFactura.setText("Accion");
		this.jComboBoxTiposAccionesFactura.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFactura = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFactura.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFactura.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFactura = new JLabelMe();
		
		this.jLabelAccionesFactura.setText("Acciones");		
		this.jLabelAccionesFactura.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFactura.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFactura.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFactura();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFactura();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFactura=new JTabbedPane();
		this.jTabbedPaneRelacionesFactura.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFactura,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFactura.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFactura.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFactura.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFactura, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFactura.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFactura.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFactura.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFactura, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFactura = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFactura = new GridBagLayout();
		
		this.jPanelCamposFactura.setLayout(gridaBagLayoutCamposFactura);
		this.jPanelCamposOcultosFactura.setLayout(gridaBagLayoutCamposOcultosFactura);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalFactura= new GridBagLayout();
		this.jPanelCamposFintotalFactura.setLayout(gridaBagLayoutCamposFintotalFactura);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidFactura.add(jLabelIdFactura, this.gridBagConstraintsFactura);



	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidFactura.add(jLabelidFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaFactura.add(jLabelid_empresaFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFactura.add(jButtonid_empresaFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFactura.add(jButtonid_empresaFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaFactura.add(jComboBoxid_empresaFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalFactura.add(jLabelid_sucursalFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFactura.add(jButtonid_sucursalFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFactura.add(jButtonid_sucursalFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalFactura.add(jComboBoxid_sucursalFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioFactura.add(jLabelid_ejercicioFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFactura.add(jButtonid_ejercicioFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFactura.add(jButtonid_ejercicioFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioFactura.add(jComboBoxid_ejercicioFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoFactura.add(jLabelid_periodoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFactura.add(jButtonid_periodoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFactura.add(jButtonid_periodoFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoFactura.add(jComboBoxid_periodoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioFactura.add(jLabelid_anioFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFactura.add(jButtonid_anioFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFactura.add(jButtonid_anioFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioFactura.add(jComboBoxid_anioFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesFactura.add(jLabelid_mesFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFactura.add(jButtonid_mesFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFactura.add(jButtonid_mesFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesFactura.add(jComboBoxid_mesFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioFactura.add(jLabelid_usuarioFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioFactura.add(jButtonid_usuarioFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioFactura.add(jButtonid_usuarioFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioFactura.add(jComboBoxid_usuarioFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoFactura.add(jLabelnumero_pre_impresoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoFactura.add(jButtonnumero_pre_impresoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoFactura.add(jTextFieldnumero_pre_impresoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionFactura.add(jLabelfecha_emisionFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionFactura.add(jButtonfecha_emisionFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionFactura.add(jDateChooserfecha_emisionFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasFactura.add(jLabelnumero_diasFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasFactura.add(jButtonnumero_diasFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasFactura.add(jTextFieldnumero_diasFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoFactura.add(jLabelfecha_vencimientoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoFactura.add(jButtonfecha_vencimientoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoFactura.add(jDateChooserfecha_vencimientoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaFactura.add(jLabelid_monedaFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaFactura.add(jButtonid_monedaFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaFactura.add(jButtonid_monedaFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaFactura.add(jComboBoxid_monedaFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcotizacionFactura.add(jLabelcotizacionFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionFactura.add(jButtoncotizacionFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcotizacionFactura.add(jTextFieldcotizacionFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoFactura.add(jLabelid_empleadoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFactura = new GridBagConstraints();
	//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 2;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoFactura.add(jButtonid_empleadoFactura, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoFactura.add(jButtonid_empleadoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 4;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoFactura.add(jButtonid_empleadoFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoFactura.add(jComboBoxid_empleadoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoFactura.add(jLabelid_formatoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoFactura.add(jButtonid_formatoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoFactura.add(jButtonid_formatoFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoFactura.add(jComboBoxid_formatoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionFactura.add(jLabeldireccionFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionFactura.add(jButtondireccionFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionFactura.add(jscrollPanedireccionFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucFactura.add(jLabelrucFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucFactura.add(jButtonrucFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucFactura.add(jTextFieldrucFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteFactura.add(jLabelid_clienteFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFactura = new GridBagConstraints();
	//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 2;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteFactura.add(jButtonid_clienteFactura, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFactura.add(jButtonid_clienteFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 4;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFactura.add(jButtonid_clienteFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteFactura.add(jComboBoxid_clienteFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioFactura.add(jLabelid_tipo_precioFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioFactura.add(jButtonid_tipo_precioFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioFactura.add(jButtonid_tipo_precioFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioFactura.add(jComboBoxid_tipo_precioFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoFactura.add(jLabeltelefonoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoFactura.add(jButtontelefonoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoFactura.add(jTextFieldtelefonoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sub_clienteFactura.add(jLabelid_sub_clienteFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clienteFactura.add(jButtonid_sub_clienteFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sub_clienteFactura.add(jButtonid_sub_clienteFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sub_clienteFactura.add(jComboBoxid_sub_clienteFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorFactura.add(jLabelid_vendedorFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFactura = new GridBagConstraints();
	//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 2;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorFactura.add(jButtonid_vendedorFactura, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFactura = new GridBagConstraints();
	//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 3;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorFactura.add(jButtonid_vendedorFacturaArbol, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 4;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorFactura.add(jButtonid_vendedorFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 5;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorFactura.add(jButtonid_vendedorFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorFactura.add(jComboBoxid_vendedorFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transporteFactura.add(jLabelid_transporteFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteFactura.add(jButtonid_transporteFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteFactura.add(jButtonid_transporteFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transporteFactura.add(jComboBoxid_transporteFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transportistaFactura.add(jLabelid_transportistaFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaFactura.add(jButtonid_transportistaFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaFactura.add(jButtonid_transportistaFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transportistaFactura.add(jComboBoxid_transportistaFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelordenFactura.add(jLabelordenFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelordenFactura.add(jButtonordenFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelordenFactura.add(jTextFieldordenFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_llamadaFactura.add(jLabelid_tipo_llamadaFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_llamadaFactura.add(jButtonid_tipo_llamadaFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_llamadaFactura.add(jButtonid_tipo_llamadaFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_llamadaFactura.add(jComboBoxid_tipo_llamadaFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_inicioFactura.add(jLabelhora_inicioFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_inicioFactura.add(jButtonhora_inicioFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_inicioFactura.add(jSpinnerhora_inicioFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelhora_finFactura.add(jLabelhora_finFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelhora_finFactura.add(jButtonhora_finFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelhora_finFactura.add(jSpinnerhora_finFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_facturaFactura.add(jLabelid_tipo_facturaFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_facturaFactura.add(jButtonid_tipo_facturaFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_facturaFactura.add(jButtonid_tipo_facturaFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_facturaFactura.add(jComboBoxid_tipo_facturaFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionFactura.add(jLabeldescripcionFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionFactura.add(jButtondescripcionFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionFactura.add(jscrollPanedescripcionFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcupoFactura.add(jLabelcupoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelcupoFactura.add(jButtoncupoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcupoFactura.add(jTextFieldcupoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsaldoFactura.add(jLabelsaldoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelsaldoFactura.add(jButtonsaldoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsaldoFactura.add(jTextFieldsaldoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldocumentosFactura.add(jLabeldocumentosFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldocumentosFactura.add(jButtondocumentosFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldocumentosFactura.add(jTextFielddocumentosFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponibleFactura.add(jLabeldisponibleFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponibleFactura.add(jButtondisponibleFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponibleFactura.add(jTextFielddisponibleFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_descuentoFactura.add(jLabelporcentaje_descuentoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_descuentoFactura.add(jButtonporcentaje_descuentoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_descuentoFactura.add(jTextFieldporcentaje_descuentoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaFactura.add(jLabeltotal_ivaFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaFactura.add(jButtontotal_ivaFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaFactura.add(jTextFieldtotal_ivaFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsumanFactura.add(jLabelsumanFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanFactura.add(jButtonsumanFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsumanFactura.add(jTextFieldsumanFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorFactura.add(jLabeldescuento_valorFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorFactura.add(jButtondescuento_valorFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorFactura.add(jTextFielddescuento_valorFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaFactura.add(jLabeltotal_sin_ivaFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaFactura.add(jButtontotal_sin_ivaFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaFactura.add(jTextFieldtotal_sin_ivaFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_descuentoFactura.add(jLabeltotal_descuentoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoFactura.add(jButtontotal_descuentoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_descuentoFactura.add(jTextFieldtotal_descuentoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_fleteFactura.add(jLabeltotal_fleteFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_fleteFactura.add(jButtontotal_fleteFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_fleteFactura.add(jTextFieldtotal_fleteFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalFactura.add(jLabeltotalFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalFactura.add(jButtontotalFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalFactura.add(jTextFieldtotalFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalFactura.add(jLabelsub_totalFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalFactura.add(jButtonsub_totalFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalFactura.add(jTextFieldsub_totalFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_otroFactura.add(jLabeltotal_otroFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_otroFactura.add(jButtontotal_otroFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_otroFactura.add(jTextFieldtotal_otroFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelultimo_costoFactura.add(jLabelultimo_costoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelultimo_costoFactura.add(jButtonultimo_costoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelultimo_costoFactura.add(jTextFieldultimo_costoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaFactura.add(jLabelivaFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaFactura.add(jButtonivaFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaFactura.add(jTextFieldivaFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoFactura.add(jLabeldescuentoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoFactura.add(jButtondescuentoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoFactura.add(jTextFielddescuentoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoFactura.add(jLabelfinanciamientoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoFactura.add(jButtonfinanciamientoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoFactura.add(jTextFieldfinanciamientoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmargen_utilidadFactura.add(jLabelmargen_utilidadFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelmargen_utilidadFactura.add(jButtonmargen_utilidadFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmargen_utilidadFactura.add(jTextFieldmargen_utilidadFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceFactura.add(jLabeliceFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceFactura.add(jButtoniceFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceFactura.add(jTextFieldiceFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelanticipoFactura.add(jLabelanticipoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelanticipoFactura.add(jButtonanticipoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelanticipoFactura.add(jTextFieldanticipoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotros_valoresFactura.add(jLabelotros_valoresFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelotros_valoresFactura.add(jButtonotros_valoresFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotros_valoresFactura.add(jTextFieldotros_valoresFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_retencionFactura.add(jLabeltotal_retencionFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_retencionFactura.add(jButtontotal_retencionFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_retencionFactura.add(jTextFieldtotal_retencionFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_consumo_especialFactura.add(jLabeltotal_consumo_especialFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_consumo_especialFactura.add(jButtontotal_consumo_especialFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_consumo_especialFactura.add(jTextFieldtotal_consumo_especialFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelretencionFactura.add(jLabelretencionFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencionFactura.add(jButtonretencionFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelretencionFactura.add(jTextFieldretencionFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioFactura.add(jLabelid_tipo_cambioFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFactura = new GridBagConstraints();
	//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 2;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioFactura.add(jButtonid_tipo_cambioFactura, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioFactura.add(jButtonid_tipo_cambioFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 4;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioFactura.add(jButtonid_tipo_cambioFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioFactura.add(jComboBoxid_tipo_cambioFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_clienteFactura.add(jLabeles_clienteFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_clienteFactura.add(jButtones_clienteFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_clienteFactura.add(jCheckBoxes_clienteFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_asiento_contableFactura.add(jLabelid_asiento_contableFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFactura = new GridBagConstraints();
	//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 2;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableFactura.add(jButtonid_asiento_contableFactura, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableFactura.add(jButtonid_asiento_contableFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 4;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableFactura.add(jButtonid_asiento_contableFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_asiento_contableFactura.add(jComboBoxid_asiento_contableFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pedidoFactura.add(jLabelid_pedidoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedidoFactura.add(jButtonid_pedidoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedidoFactura.add(jButtonid_pedidoFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pedidoFactura.add(jComboBoxid_pedidoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_responsableFactura.add(jLabelid_responsableFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsableFactura.add(jButtonid_responsableFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsableFactura.add(jButtonid_responsableFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_responsableFactura.add(jComboBoxid_responsableFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_fisico_factura_empresaFactura.add(jLabelid_estado_fisico_factura_empresaFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_fisico_factura_empresaFactura.add(jButtonid_estado_fisico_factura_empresaFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 3;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_fisico_factura_empresaFactura.add(jButtonid_estado_fisico_factura_empresaFacturaUpdate, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_fisico_factura_empresaFactura.add(jComboBoxid_estado_fisico_factura_empresaFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaFactura.add(jLabelfechaFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaFactura.add(jButtonfechaFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaFactura.add(jDateChooserfechaFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_autorizacionFactura.add(jLabelfecha_autorizacionFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_autorizacionFactura.add(jButtonfecha_autorizacionFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_autorizacionFactura.add(jDateChooserfecha_autorizacionFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_clienteFactura.add(jLabelfecha_clienteFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_clienteFactura.add(jButtonfecha_clienteFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_clienteFactura.add(jDateChooserfecha_clienteFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_documentoFactura.add(jLabelnumero_documentoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_documentoFactura.add(jButtonnumero_documentoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_documentoFactura.add(jTextFieldnumero_documentoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_dauFactura.add(jLabelnumero_dauFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_dauFactura.add(jButtonnumero_dauFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_dauFactura.add(jTextFieldnumero_dauFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_referendoFactura.add(jLabelnumero_referendoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_referendoFactura.add(jButtonnumero_referendoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_referendoFactura.add(jTextFieldnumero_referendoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_referendoFactura.add(jLabelfecha_referendoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_referendoFactura.add(jButtonfecha_referendoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_referendoFactura.add(jDateChooserfecha_referendoFactura, this.gridBagConstraintsFactura);


	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 0;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaforo_referendoFactura.add(jLabelaforo_referendoFactura, this.gridBagConstraintsFactura);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFactura = new GridBagConstraints();
		//this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = 2;
		this.gridBagConstraintsFactura.ipadx = 0;
		this.gridBagConstraintsFactura.insets = new Insets(0, 0, 0, 0);
		this.jPanelaforo_referendoFactura.add(jButtonaforo_referendoFacturaBusqueda, this.gridBagConstraintsFactura);
	}

	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFactura.gridy = 0;
	this.gridBagConstraintsFactura.gridx = 1;
	this.gridBagConstraintsFactura.ipadx = 0;
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaforo_referendoFactura.add(jTextFieldaforo_referendoFactura, this.gridBagConstraintsFactura);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelidFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelnumero_pre_impresoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelfecha_emisionFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelnumero_diasFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelfecha_vencimientoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_monedaFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelcotizacionFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_empleadoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_formatoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPaneldireccionFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelrucFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_clienteFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_tipo_precioFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPaneltelefonoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_sub_clienteFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_vendedorFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_transporteFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_transportistaFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelordenFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_tipo_llamadaFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelhora_inicioFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelhora_finFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelid_tipo_facturaFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPaneldescripcionFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelcupoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPanelsaldoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPaneldocumentosFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFactura.add(this.jPaneldisponibleFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFactura % 4==0) {
		iXPanelCamposFactura=0;
		iYPanelCamposFactura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_empresaFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_sucursalFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_ejercicioFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_periodoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_anioFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_mesFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_usuarioFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPaneltotal_retencionFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPaneltotal_consumo_especialFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelretencionFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_tipo_cambioFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPaneles_clienteFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_asiento_contableFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_pedidoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_responsableFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelid_estado_fisico_factura_empresaFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelfechaFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelfecha_autorizacionFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelfecha_clienteFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelnumero_documentoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelnumero_dauFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelnumero_referendoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelfecha_referendoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposOcultosFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposOcultosFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosFactura.add(this.jPanelaforo_referendoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposOcultosFactura % 4==0) {
		iXPanelCamposOcultosFactura=0;
		iYPanelCamposOcultosFactura++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPanelporcentaje_descuentoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPaneltotal_ivaFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPanelsumanFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPaneldescuento_valorFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPaneltotal_sin_ivaFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPaneltotal_descuentoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPaneltotal_fleteFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPaneltotalFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPanelsub_totalFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPaneltotal_otroFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPanelultimo_costoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPanelivaFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPaneldescuentoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPanelfinanciamientoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPanelmargen_utilidadFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPaneliceFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPanelanticipoFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
	}
	this.gridBagConstraintsFactura = new GridBagConstraints();
	this.gridBagConstraintsFactura.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFactura.gridy = iYPanelCamposFintotalFactura;
	this.gridBagConstraintsFactura.gridx = iXPanelCamposFintotalFactura++;
	this.gridBagConstraintsFactura.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFactura.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalFactura.add(this.jPanelotros_valoresFactura, this.gridBagConstraintsFactura);



	if(iXPanelCamposFintotalFactura % 3==0) {
		iXPanelCamposFintotalFactura=0;
		iYPanelCamposFintotalFactura++;
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
			
		GridBagLayout gridaBagLayoutAccionesFactura= new GridBagLayout();
		this.jPanelAccionesFactura.setLayout(gridaBagLayoutAccionesFactura);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFactura= new GridBagLayout();
		this.jPanelAccionesFormularioFactura.setLayout(gridaBagLayoutAccionesFormularioFactura);
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFactura.add(this.jComboBoxTiposAccionesFormularioFactura, this.gridBagConstraintsFactura);

		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFactura.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFactura.add(this.jCheckBoxPostAccionNuevoFactura, this.gridBagConstraintsFactura);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.facturaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFactura.add(this.jCheckBoxPostAccionSinCerrarFactura, this.gridBagConstraintsFactura);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.facturaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.facturaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFactura.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFactura.add(this.jCheckBoxPostAccionSinMensajeFactura, this.gridBagConstraintsFactura);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx = iPosXAccion++;
			
		this.jPanelAccionesFactura.add(this.jButtonModificarFactura, this.gridBagConstraintsFactura);							

		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFactura.gridy = 0;
		this.gridBagConstraintsFactura.gridx =iPosXAccion++;
			
		this.jPanelAccionesFactura.add(this.jButtonEliminarFactura, this.gridBagConstraintsFactura);
		
			
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = 0;		
		this.gridBagConstraintsFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesFactura.add(this.jButtonActualizarFactura, this.gridBagConstraintsFactura);


		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = 0;		
		this.gridBagConstraintsFactura.gridx = iPosXAccion++;
		
		this.jPanelAccionesFactura.add(this.jButtonGuardarCambiosFactura, this.gridBagConstraintsFactura);	
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = 0;		
		this.gridBagConstraintsFactura.gridx =iPosXAccion++;
		
		this.jPanelAccionesFactura.add(this.jButtonCancelarFactura, this.gridBagConstraintsFactura);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFactura = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFactura);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFactura = new GridBagConstraints();						
			this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFactura.gridx = 0;		
			//this.gridBagConstraintsFactura.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFactura.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFactura.gridx =0;
		this.gridBagConstraintsFactura.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFactura.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFactura, this.gridBagConstraintsFactura);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFactura = new FacturaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Factura DATOS");
			
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
			
	        //this.setTitle("[FOR] - Factura DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factura Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturaModel facturaModel=new FacturaModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturaModel.FacturaFocusTraversalPolicy facturaFocusTraversalPolicy = facturaModel.new FacturaFocusTraversalPolicy(this);
			
			//facturaFocusTraversalPolicy.setfacturaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturaModel);
			
			
			this.jContentPaneDetalleFactura = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFactura = new GridBagLayout();	
			this.jContentPaneDetalleFactura.setLayout(gridaBagLayoutDetalleFactura);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFactura = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionFactura=   new JScrollPane(jContentPaneDetalleFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFactura=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsFactura.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFactura.gridx = 0;
	        
			this.jContentPaneDetalleFactura.add(jPanelCamposFactura, gridBagConstraintsFactura);
			
			
			
			
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
						&& facturaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleFactura(this.puedeCargarPorParteDetalleFactura,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetaFormaPago(this.puedeCargarPorParteDetaFormaPago,false,-1);
					
					if(this.facturaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFactura= new GridBagConstraints();
						this.gridBagConstraintsFactura.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFactura.gridx = 0;
						this.jContentPaneDetalleFactura.add(this.jTabbedPaneRelacionesFactura, this.gridBagConstraintsFactura);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFactura.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleFactura(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameDetaFormaPago(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFactura.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFactura.gridx = 0;

		this.jContentPaneDetalleFactura.add(jPanelCamposFintotalFactura, gridBagConstraintsFactura);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFactura.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFactura = new GridBagConstraints();
					this.gridBagConstraintsFactura.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFactura.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFactura.gridx = 0;
					
				
					this.jContentPaneDetalleFactura.add(jPanelCamposOcultosFactura, gridBagConstraintsFactura);
				
					this.jPanelCamposOcultosFactura.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsFactura.gridx = 0;
	        this.gridBagConstraintsFactura.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFactura.add(this.jPanelAccionesFormularioFactura, this.gridBagConstraintsFactura);							
			
			
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsFactura.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsFactura.gridx = 0;
	        
			
			this.jContentPaneDetalleFactura.add(this.jPanelAccionesFactura, this.gridBagConstraintsFactura);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFactura);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFactura=   new JScrollPane(this.jPanelCamposFactura,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFactura.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFactura.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFactura.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFactura.gridx = 0;
			this.gridBagConstraintsFactura.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFactura.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFactura.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFactura, this.gridBagConstraintsFactura);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFactura, this.gridBagConstraintsFactura);			
			
			this.gridBagConstraintsFactura = new GridBagConstraints();
			this.gridBagConstraintsFactura.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFactura.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFactura, this.gridBagConstraintsFactura);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFactura, this.gridBagConstraintsFactura);
			
			
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFactura.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFactura, this.gridBagConstraintsFactura);
		
			
		this.gridBagConstraintsFactura = new GridBagConstraints();
		this.gridBagConstraintsFactura.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFactura.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFactura, this.gridBagConstraintsFactura);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFactura;//jContentPane;
		
		return jScrollPanelDatosEdicionFactura;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleFactura(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallefacturaSessionBean=new DetalleFacturaSessionBean();
		this.detallefacturaSessionBean.setConGuardarRelaciones(false);
		this.detallefacturaSessionBean.setEsGuardarRelacionado(true);

		this.detallefacturaBeanSwingJInternalFrame=null;//new DetalleFacturaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallefacturaBeanSwingJInternalFramePopup=new DetalleFacturaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallefacturaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallefacturaSessionBean.getEsGuardarRelacionado()) {

				DetalleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL=FacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleFacturaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FacturaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallefacturaSessionBean.setEsGuardarRelacionado(true);

				this.detallefacturaBeanSwingJInternalFrame=new DetalleFacturaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallefacturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallefacturaBeanSwingJInternalFrame.setdetallefacturaSessionBean(this.detallefacturaSessionBean);

				//this.gridBagConstraintsFactura = new GridBagConstraints();
				//this.gridBagConstraintsFactura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFactura.gridx = 0;
				//this.jContentPaneDetalleFactura.add(this.detallefacturaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFactura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFactura.add("Detalle Facturas",this.detallefacturaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFactura.setComponentAt(iIndexTab,this.detallefacturaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleFacturaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallefacturaSessionBean.setEsGuardarRelacionado(false);
				this.detallefacturaBeanSwingJInternalFrame=null;//new DetalleFacturaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallefacturaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleFactura) {
					this.jTabbedPaneRelacionesFactura.add("Detalle Facturas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameDetaFormaPago(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detaformapagoSessionBean=new DetaFormaPagoSessionBean();
		this.detaformapagoSessionBean.setConGuardarRelaciones(false);
		this.detaformapagoSessionBean.setEsGuardarRelacionado(true);

		this.detaformapagoBeanSwingJInternalFrame=null;//new DetaFormaPagoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detaformapagoBeanSwingJInternalFramePopup=new DetaFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detaformapagoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detaformapagoSessionBean.getEsGuardarRelacionado()) {

				DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL=FacturaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetaFormaPagoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FacturaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detaformapagoSessionBean.setEsGuardarRelacionado(true);

				this.detaformapagoBeanSwingJInternalFrame=new DetaFormaPagoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detaformapagoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detaformapagoBeanSwingJInternalFrame.setdetaformapagoSessionBean(this.detaformapagoSessionBean);

				//this.gridBagConstraintsFactura = new GridBagConstraints();
				//this.gridBagConstraintsFactura.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFactura.gridx = 0;
				//this.jContentPaneDetalleFactura.add(this.detaformapagoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFactura);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFactura.add("Deta Forma Pagos",this.detaformapagoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFactura.setComponentAt(iIndexTab,this.detaformapagoBeanSwingJInternalFrame.getContentPane());
				}

				//DetaFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detaformapagoSessionBean.setEsGuardarRelacionado(false);
				this.detaformapagoBeanSwingJInternalFrame=null;//new DetaFormaPagoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detaformapagoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetaFormaPago) {
					this.jTabbedPaneRelacionesFactura.add("Deta Forma Pagos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetaFormaPagoBeanSwingJInternalFrame(List<Factura> facturas,Factura factura,DetaFormaPagoBeanSwingJInternalFrame detaformapagoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detaformapagoBeanSwingJInternalFrame=new DetaFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detaformapagoBeanSwingJInternalFrame.getDetaFormaPagoLogic().setConnexion(this.facturaLogic.getConnexion());

					detaformapagoBeanSwingJInternalFrame.setfacturasForeignKey(facturas);
					detaformapagoBeanSwingJInternalFrame.setfacturaForeignKey(factura);
					detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.setisBusquedaDesdeForeignKeySesionFactura(true);
					detaformapagoBeanSwingJInternalFrame.detaformapagoSessionBean.setlidFacturaActual(factura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detaformapagoBeanSwingJInternalFrame.cargarCombosForeignKeyDetaFormaPago(detaformapagoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detaformapagoBeanSwingJInternalFrame.setVisibilidadBusquedasParaFactura(true);
					detaformapagoBeanSwingJInternalFrame.setid_facturaFK_IdFactura(factura.getId());

					if(!this.conCargarFormDetalle) {
						detaformapagoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detaformapagoBeanSwingJInternalFrame.setSelectedItemCombosFrameFacturaForeignKey(factura,1,false,true,true);
					detaformapagoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detaformapagoBeanSwingJInternalFrame.procesarBusqueda("FK_IdFactura");
					detaformapagoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFactura");
					detaformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaFormaPago(true);
					detaformapagoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetaFormaPago("n",detaformapagoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detaformapagoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detaformapagoBeanSwingJInternalFrame.setAutoscrolls(true);
					detaformapagoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detaformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsDetaFormaPago("relacionado");
					} else {
						detaformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsDetaFormaPago("no_relacionado");
					}

					detaformapagoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetaFormaPago().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleFacturaBeanSwingJInternalFrame(List<Factura> facturas,Factura factura,DetalleFacturaBeanSwingJInternalFrame detallefacturaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallefacturaBeanSwingJInternalFrame=new DetalleFacturaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallefacturaBeanSwingJInternalFrame.getDetalleFacturaLogic().setConnexion(this.facturaLogic.getConnexion());

					detallefacturaBeanSwingJInternalFrame.setfacturasForeignKey(facturas);
					detallefacturaBeanSwingJInternalFrame.setfacturaForeignKey(factura);
					detallefacturaBeanSwingJInternalFrame.detallefacturaSessionBean.setisBusquedaDesdeForeignKeySesionFactura(true);
					detallefacturaBeanSwingJInternalFrame.detallefacturaSessionBean.setlidFacturaActual(factura.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallefacturaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleFactura(detallefacturaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallefacturaBeanSwingJInternalFrame.setVisibilidadBusquedasParaFactura(true);
					detallefacturaBeanSwingJInternalFrame.setid_facturaFK_IdFactura(factura.getId());

					if(!this.conCargarFormDetalle) {
						detallefacturaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallefacturaBeanSwingJInternalFrame.setSelectedItemCombosFrameFacturaForeignKey(factura,1,false,true,true);
					detallefacturaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallefacturaBeanSwingJInternalFrame.procesarBusqueda("FK_IdFactura");
					detallefacturaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFactura");
					detallefacturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleFactura(true);
					detallefacturaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleFactura("n",detallefacturaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallefacturaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallefacturaBeanSwingJInternalFrame.setAutoscrolls(true);
					detallefacturaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallefacturaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFactura("relacionado");
					} else {
						detallefacturaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFactura("no_relacionado");
					}

					detallefacturaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleFactura().setVisible(false);

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
