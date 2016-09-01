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
import com.bydan.erp.facturacion.util.NotaCreditoConstantesFunciones;

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
public class NotaCreditoDetalleFormJInternalFrame extends NotaCreditoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNotaCredito;
	
	protected JMenuBar jmenuBarDetalleNotaCredito;
	
	protected JMenu jmenuDetalleNotaCredito;
	protected JMenu jmenuDetalleArchivoNotaCredito;
	protected JMenu jmenuDetalleAccionesNotaCredito;
	protected JMenu jmenuDetalleDatosNotaCredito;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNotaCredito;	
	protected GridBagConstraints gridBagConstraintsNotaCredito;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NotaCreditoBeanSwingJInternalFrameAdditional jInternalFrameDetalleNotaCredito;		
	
	
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

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected EstadoNotaCreditoBeanSwingJInternalFrame estadonotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadonotacredito="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";
	
	public NotaCreditoSessionBean notacreditoSessionBean;
	
	

	public DetaNotaCreditoBeanSwingJInternalFrame detanotacreditoBeanSwingJInternalFrame=null;
	public DetaNotaCreditoBeanSwingJInternalFrame detanotacreditoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetaNotaCredito=false;
	public DetaNotaCreditoSessionBean detanotacreditoSessionBean;
	
	
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
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public EstadoNotaCreditoSessionBean estadonotacreditoSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public TransportistaSessionBean transportistaSessionBean;	
	
	public NotaCreditoLogic notacreditoLogic;
	
	public JScrollPane jScrollPanelDatosNotaCredito;
	public JScrollPane jScrollPanelDatosEdicionNotaCredito;
	public JScrollPane jScrollPanelDatosGeneralNotaCredito;
	
	protected JPanel jPanelCamposNotaCredito;    
	protected JPanel jPanelCamposOcultosNotaCredito;    	
	protected JPanel jPanelAccionesNotaCredito;
	protected JPanel jPanelAccionesFormularioNotaCredito;
    
	
	
	protected Integer iXPanelCamposNotaCredito=0;
	protected Integer iYPanelCamposNotaCredito=0;
	
	protected Integer iXPanelCamposOcultosNotaCredito=0;
	protected Integer iYPanelCamposOcultosNotaCredito=0;
	
	

	protected JPanel jPanelCamposFintotalNotaCredito;
	protected Integer iXPanelCamposFintotalNotaCredito=0;
	protected Integer iYPanelCamposFintotalNotaCredito=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNotaCredito;
	public JButton jButtonModificarNotaCredito;
	public JButton jButtonActualizarNotaCredito;
    public JButton jButtonEliminarNotaCredito;
	public JButton jButtonCancelarNotaCredito;
    public JButton jButtonGuardarCambiosNotaCredito;
	public JButton jButtonGuardarCambiosTablaNotaCredito;
	protected JButton jButtonCerrarNotaCredito;
	
	
	protected JButton jButtonProcesarInformacionNotaCredito;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNotaCredito;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNotaCredito;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNotaCredito;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNotaCredito;
	protected JButton jButtonModificarToolBarNotaCredito;
	protected JButton jButtonActualizarToolBarNotaCredito;
    protected JButton jButtonEliminarToolBarNotaCredito;
	protected JButton jButtonCancelarToolBarNotaCredito;
    protected JButton jButtonGuardarCambiosToolBarNotaCredito;
	protected JButton jButtonGuardarCambiosTablaToolBarNotaCredito;
	protected JButton jButtonMostrarOcultarTablaToolBarNotaCredito;
	protected JButton jButtonCerrarToolBarNotaCredito;
	
	protected JButton jButtonProcesarInformacionToolBarNotaCredito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNotaCredito;
	protected JMenuItem jMenuItemModificarNotaCredito;
	protected JMenuItem jMenuItemActualizarNotaCredito;
    protected JMenuItem jMenuItemEliminarNotaCredito;
	protected JMenuItem jMenuItemCancelarNotaCredito;
    protected JMenuItem jMenuItemGuardarCambiosNotaCredito;
	protected JMenuItem jMenuItemGuardarCambiosTablaNotaCredito;
	protected JMenuItem jMenuItemCerrarNotaCredito;
	protected JMenuItem jMenuItemDetalleCerrarNotaCredito;
	protected JMenuItem jMenuItemDetalleMostarOcultarNotaCredito;
	
	protected JMenuItem jMenuItemProcesarInformacionNotaCredito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNotaCredito;
	protected JMenuItem jMenuItemMostrarOcultarNotaCredito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNotaCredito;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNotaCredito;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNotaCredito;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNotaCredito;
	public JLabel jLabelIdNotaCredito;
	public JLabel jLabelidNotaCredito;
	public JButton jButtonidNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoNotaCredito;
	public JLabel jLabelcodigoNotaCredito;
	public JTextField jTextFieldcodigoNotaCredito;
	public JButton jButtoncodigoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelnumeroNotaCredito;
	public JLabel jLabelnumeroNotaCredito;
	public JTextField jTextFieldnumeroNotaCredito;
	public JButton jButtonnumeroNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionNotaCredito;
	public JLabel jLabelfecha_emisionNotaCredito;
	//public JFormattedTextField jDateChooserfecha_emisionNotaCredito;

	public JDateChooser jDateChooserfecha_emisionNotaCredito;
	public JButton jButtonfecha_emisionNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasNotaCredito;
	public JLabel jLabelnumero_diasNotaCredito;
	public JTextField jTextFieldnumero_diasNotaCredito;
	public JButton jButtonnumero_diasNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoNotaCredito;
	public JLabel jLabelfecha_vencimientoNotaCredito;
	//public JFormattedTextField jDateChooserfecha_vencimientoNotaCredito;

	public JDateChooser jDateChooserfecha_vencimientoNotaCredito;
	public JButton jButtonfecha_vencimientoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionNotaCredito;
	public JLabel jLabelcotizacionNotaCredito;
	public JTextField jTextFieldcotizacionNotaCredito;
	public JButton jButtoncotizacionNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneldireccionNotaCredito;
	public JLabel jLabeldireccionNotaCredito;
	public JTextArea jTextAreadireccionNotaCredito;
	public JScrollPane jscrollPanedireccionNotaCredito;
	public JButton jButtondireccionNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoNotaCredito;
	public JLabel jLabeltelefonoNotaCredito;
	public JTextField jTextFieldtelefonoNotaCredito;
	public JButton jButtontelefonoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelrucNotaCredito;
	public JLabel jLabelrucNotaCredito;
	public JTextField jTextFieldrucNotaCredito;
	public JButton jButtonrucNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionNotaCredito;
	public JLabel jLabeldescripcionNotaCredito;
	public JTextArea jTextAreadescripcionNotaCredito;
	public JScrollPane jscrollPanedescripcionNotaCredito;
	public JButton jButtondescripcionNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_porcentajeNotaCredito;
	public JLabel jLabeldescuento_porcentajeNotaCredito;
	public JTextField jTextFielddescuento_porcentajeNotaCredito;
	public JButton jButtondescuento_porcentajeNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaNotaCredito;
	public JLabel jLabeltotal_ivaNotaCredito;
	public JTextField jTextFieldtotal_ivaNotaCredito;
	public JButton jButtontotal_ivaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelsumanNotaCredito;
	public JLabel jLabelsumanNotaCredito;
	public JTextField jTextFieldsumanNotaCredito;
	public JButton jButtonsumanNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorNotaCredito;
	public JLabel jLabeldescuento_valorNotaCredito;
	public JTextField jTextFielddescuento_valorNotaCredito;
	public JButton jButtondescuento_valorNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaNotaCredito;
	public JLabel jLabeltotal_sin_ivaNotaCredito;
	public JTextField jTextFieldtotal_sin_ivaNotaCredito;
	public JButton jButtontotal_sin_ivaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoNotaCredito;
	public JLabel jLabeltotal_descuentoNotaCredito;
	public JTextField jTextFieldtotal_descuentoNotaCredito;
	public JButton jButtontotal_descuentoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelfleteNotaCredito;
	public JLabel jLabelfleteNotaCredito;
	public JTextField jTextFieldfleteNotaCredito;
	public JButton jButtonfleteNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneltotalNotaCredito;
	public JLabel jLabeltotalNotaCredito;
	public JTextField jTextFieldtotalNotaCredito;
	public JButton jButtontotalNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalNotaCredito;
	public JLabel jLabelsub_totalNotaCredito;
	public JTextField jTextFieldsub_totalNotaCredito;
	public JButton jButtonsub_totalNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelotroNotaCredito;
	public JLabel jLabelotroNotaCredito;
	public JTextField jTextFieldotroNotaCredito;
	public JButton jButtonotroNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelivaNotaCredito;
	public JLabel jLabelivaNotaCredito;
	public JTextField jTextFieldivaNotaCredito;
	public JButton jButtonivaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoNotaCredito;
	public JLabel jLabelfinanciamientoNotaCredito;
	public JTextField jTextFieldfinanciamientoNotaCredito;
	public JButton jButtonfinanciamientoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneliceNotaCredito;
	public JLabel jLabeliceNotaCredito;
	public JTextField jTextFieldiceNotaCredito;
	public JButton jButtoniceNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelotro_valorNotaCredito;
	public JLabel jLabelotro_valorNotaCredito;
	public JTextField jTextFieldotro_valorNotaCredito;
	public JButton jButtonotro_valorNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelretencionNotaCredito;
	public JLabel jLabelretencionNotaCredito;
	public JTextField jTextFieldretencionNotaCredito;
	public JButton jButtonretencionNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelfechaNotaCredito;
	public JLabel jLabelfechaNotaCredito;
	//public JFormattedTextField jDateChooserfechaNotaCredito;

	public JDateChooser jDateChooserfechaNotaCredito;
	public JButton jButtonfechaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneles_clienteNotaCredito;
	public JLabel jLabeles_clienteNotaCredito;
	public JCheckBox jCheckBoxes_clienteNotaCredito;
	public JButton jButtones_clienteNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_clienteNotaCredito;
	public JLabel jLabelfecha_clienteNotaCredito;
	//public JFormattedTextField jDateChooserfecha_clienteNotaCredito;

	public JDateChooser jDateChooserfecha_clienteNotaCredito;
	public JButton jButtonfecha_clienteNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_autorizacionNotaCredito;
	public JLabel jLabelfecha_autorizacionNotaCredito;
	//public JFormattedTextField jDateChooserfecha_autorizacionNotaCredito;

	public JDateChooser jDateChooserfecha_autorizacionNotaCredito;
	public JButton jButtonfecha_autorizacionNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNotaCredito;
	public JLabel jLabelid_empresaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNotaCredito;
	public JButton jButtonid_empresaNotaCredito= new JButtonMe();
	public JButton jButtonid_empresaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_empresaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalNotaCredito;
	public JLabel jLabelid_sucursalNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalNotaCredito;
	public JButton jButtonid_sucursalNotaCredito= new JButtonMe();
	public JButton jButtonid_sucursalNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioNotaCredito;
	public JLabel jLabelid_ejercicioNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioNotaCredito;
	public JButton jButtonid_ejercicioNotaCredito= new JButtonMe();
	public JButton jButtonid_ejercicioNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoNotaCredito;
	public JLabel jLabelid_periodoNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoNotaCredito;
	public JButton jButtonid_periodoNotaCredito= new JButtonMe();
	public JButton jButtonid_periodoNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_periodoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioNotaCredito;
	public JLabel jLabelid_anioNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioNotaCredito;
	public JButton jButtonid_anioNotaCredito= new JButtonMe();
	public JButton jButtonid_anioNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_anioNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesNotaCredito;
	public JLabel jLabelid_mesNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesNotaCredito;
	public JButton jButtonid_mesNotaCredito= new JButtonMe();
	public JButton jButtonid_mesNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_mesNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioNotaCredito;
	public JLabel jLabelid_usuarioNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioNotaCredito;
	public JButton jButtonid_usuarioNotaCredito= new JButtonMe();
	public JButton jButtonid_usuarioNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_usuarioNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaNotaCredito;
	public JLabel jLabelid_monedaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaNotaCredito;
	public JButton jButtonid_monedaNotaCredito= new JButtonMe();
	public JButton jButtonid_monedaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_monedaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoNotaCredito;
	public JLabel jLabelid_empleadoNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoNotaCredito;
	public JButton jButtonid_empleadoNotaCredito= new JButtonMe();
	public JButton jButtonid_empleadoNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_empleadoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoNotaCredito;
	public JLabel jLabelid_formatoNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoNotaCredito;
	public JButton jButtonid_formatoNotaCredito= new JButtonMe();
	public JButton jButtonid_formatoNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_formatoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioNotaCredito;
	public JLabel jLabelid_tipo_precioNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioNotaCredito;
	public JButton jButtonid_tipo_precioNotaCredito= new JButtonMe();
	public JButton jButtonid_tipo_precioNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteNotaCredito;
	public JLabel jLabelid_clienteNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteNotaCredito;
	public JButton jButtonid_clienteNotaCredito= new JButtonMe();
	public JButton jButtonid_clienteNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_clienteNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaNotaCredito;
	public JLabel jLabelid_facturaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaNotaCredito;
	public JButton jButtonid_facturaNotaCredito= new JButtonMe();
	public JButton jButtonid_facturaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_facturaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorNotaCredito;
	public JLabel jLabelid_vendedorNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorNotaCredito;
	public JButton jButtonid_vendedorNotaCredito= new JButtonMe();
	public JButton jButtonid_vendedorNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_vendedorNotaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorNotaCreditoArbol= new JButtonMe();

	public JPanel jPanelid_responsableNotaCredito;
	public JLabel jLabelid_responsableNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsableNotaCredito;
	public JButton jButtonid_responsableNotaCredito= new JButtonMe();
	public JButton jButtonid_responsableNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_responsableNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_nota_creditoNotaCredito;
	public JLabel jLabelid_estado_nota_creditoNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_nota_creditoNotaCredito;
	public JButton jButtonid_estado_nota_creditoNotaCredito= new JButtonMe();
	public JButton jButtonid_estado_nota_creditoNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_estado_nota_creditoNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoNotaCredito;
	public JLabel jLabelid_centro_costoNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoNotaCredito;
	public JButton jButtonid_centro_costoNotaCredito= new JButtonMe();
	public JButton jButtonid_centro_costoNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoNotaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoNotaCreditoArbol= new JButtonMe();

	public JPanel jPanelid_tipo_cambioNotaCredito;
	public JLabel jLabelid_tipo_cambioNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioNotaCredito;
	public JButton jButtonid_tipo_cambioNotaCredito= new JButtonMe();
	public JButton jButtonid_tipo_cambioNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_transporteNotaCredito;
	public JLabel jLabelid_transporteNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteNotaCredito;
	public JButton jButtonid_transporteNotaCredito= new JButtonMe();
	public JButton jButtonid_transporteNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_transporteNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaNotaCredito;
	public JLabel jLabelid_transportistaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaNotaCredito;
	public JButton jButtonid_transportistaNotaCredito= new JButtonMe();
	public JButton jButtonid_transportistaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_transportistaNotaCreditoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNotaCredito;
	
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
		
	public int iWidthFormulario=1180;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=784;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NotaCreditoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNotaCredito=new JPanel();
				this.jPanelAccionesFormularioNotaCredito=new JPanel();
				this.jmenuBarDetalleNotaCredito=new JMenuBar();
				this.jTtoolBarDetalleNotaCredito=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NotaCreditoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNotaCredito() {
		return this.jButtonActualizarToolBarNotaCredito;
	}
	
	public JButton getjButtonEliminarToolBarNotaCredito() {
		return this.jButtonEliminarToolBarNotaCredito;
	}
	
	public JButton getjButtonCancelarToolBarNotaCredito() {
		return this.jButtonCancelarToolBarNotaCredito;
	}		
	
	public JButton getjButtonProcesarInformacionNotaCredito() {
		return this.jButtonProcesarInformacionNotaCredito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNotaCredito)	{
		this.jButtonProcesarInformacionNotaCredito = jButtonProcesarInformacionNotaCredito;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNotaCredito() {
		return this.jComboBoxTiposAccionesNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNotaCredito(
			JComboBox jComboBoxTiposRelacionesNotaCredito) {
		this.jComboBoxTiposRelacionesNotaCredito = jComboBoxTiposRelacionesNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNotaCredito(
			JComboBox jComboBoxTiposAccionesNotaCredito) {
		this.jComboBoxTiposAccionesNotaCredito = jComboBoxTiposAccionesNotaCredito;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNotaCredito() {
		return this.jComboBoxTiposAccionesFormularioNotaCredito;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNotaCredito(
			JComboBox jComboBoxTiposAccionesFormularioNotaCredito) {
		this.jComboBoxTiposAccionesFormularioNotaCredito = jComboBoxTiposAccionesFormularioNotaCredito;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.notacreditoSessionBean=new NotaCreditoSessionBean();
		
		this.notacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.notacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.notacreditoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detanotacreditoSessionBean=new DetaNotaCreditoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NotaCreditoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 3550) {
			iWidth=3550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.notacreditoSessionBean.getEsGuardarRelacionado()) {
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
	
		NotaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNotaCredito= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNotaCredito=new JButtonMe();
				this.jButtonModificarToolBarNotaCredito=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNotaCredito,this.jTtoolBarDetalleNotaCredito,
							"actualizar","actualizar","Actualizar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNotaCredito,this.jTtoolBarDetalleNotaCredito,
							"eliminar","eliminar","Eliminar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNotaCredito,this.jTtoolBarDetalleNotaCredito,
							"cancelar","cancelar","Cancelar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNotaCredito,this.jTtoolBarDetalleNotaCredito,
							"guardarcambios","guardarcambios","Guardar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNotaCredito=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNotaCredito=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNotaCredito=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNotaCredito=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNotaCredito=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNotaCredito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNotaCredito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNotaCredito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNotaCredito= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNotaCredito.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNotaCredito,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNotaCredito= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNotaCredito.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNotaCredito,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNotaCredito= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNotaCredito.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNotaCredito,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNotaCredito= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNotaCredito.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNotaCredito,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNotaCredito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNotaCredito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNotaCredito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNotaCredito.add(this.jMenuItemDetalleCerrarNotaCredito);
		
		this.jmenuDetalleAccionesNotaCredito.add(this.jMenuItemActualizarNotaCredito);
		this.jmenuDetalleAccionesNotaCredito.add(this.jMenuItemEliminarNotaCredito);
		this.jmenuDetalleAccionesNotaCredito.add(this.jMenuItemCancelarNotaCredito);		
		
		//this.jmenuDetalleDatosNotaCredito.add(this.jMenuItemDetalleAbrirOrderByNotaCredito);				
		this.jmenuDetalleDatosNotaCredito.add(this.jMenuItemDetalleMostarOcultarNotaCredito);				
				
		//this.jmenuDetalleAccionesNotaCredito.add(this.jMenuItemGuardarCambiosNotaCredito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNotaCredito.add(this.jmenuDetalleArchivoNotaCredito);		
		this.jmenuBarDetalleNotaCredito.add(this.jmenuDetalleAccionesNotaCredito);		
		this.jmenuBarDetalleNotaCredito.add(this.jmenuDetalleDatosNotaCredito);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleNotaCredito.add(this.jmenuDetalleNotaCredito);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposNotaCredito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNotaCredito = new JLabelMe();
		jLabelIdNotaCredito.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNotaCredito = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNotaCredito= new GridBagLayout();

		this.jPanelidNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);

		jLabelidNotaCredito = new JLabel();
		jLabelidNotaCredito.setText("Id");

		jLabelidNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoNotaCredito = new JLabelMe();
		this.jLabelcodigoNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoNotaCredito.setToolTipText("Codigo");
		this.jLabelcodigoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelcodigoNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldcodigoNotaCredito= new JTextFieldMe();

		jTextFieldcodigoNotaCredito.setEnabled(false);
		jTextFieldcodigoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoNotaCreditoBusqueda= new JButtonMe();
		this.jButtoncodigoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoNotaCreditoBusqueda.setText("U");
		this.jButtoncodigoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelnumeroNotaCredito = new JLabelMe();
		this.jLabelnumeroNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_NUMEROPREIMPRESO+" :");
		this.jLabelnumeroNotaCredito.setToolTipText("Nro Preimpreso");
		this.jLabelnumeroNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelnumeroNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldnumeroNotaCredito= new JTextFieldMe();

		jTextFieldnumeroNotaCredito.setEnabled(false);
		jTextFieldnumeroNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroNotaCreditoBusqueda= new JButtonMe();
		this.jButtonnumeroNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroNotaCreditoBusqueda.setText("U");
		this.jButtonnumeroNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionNotaCredito = new JLabelMe();
		this.jLabelfecha_emisionNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionNotaCredito.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelfecha_emisionNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		//jFormattedTextFieldfecha_emisionNotaCredito= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionNotaCredito= new JDateChooser();
		jDateChooserfecha_emisionNotaCredito.setEnabled(false);
		jDateChooserfecha_emisionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionNotaCredito.setDate(new Date());
		jDateChooserfecha_emisionNotaCredito.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionNotaCredito.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionNotaCreditoBusqueda= new JButtonMe();
		this.jButtonfecha_emisionNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionNotaCreditoBusqueda.setText("U");
		this.jButtonfecha_emisionNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasNotaCredito = new JLabelMe();
		this.jLabelnumero_diasNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasNotaCredito.setToolTipText("Nro Dias");
		this.jLabelnumero_diasNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelnumero_diasNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldnumero_diasNotaCredito= new JTextFieldMe();
		jTextFieldnumero_diasNotaCredito.setEnabled(false);
		jTextFieldnumero_diasNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasNotaCredito.setText("0");

		this.jButtonnumero_diasNotaCreditoBusqueda= new JButtonMe();
		this.jButtonnumero_diasNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasNotaCreditoBusqueda.setText("U");
		this.jButtonnumero_diasNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoNotaCredito = new JLabelMe();
		this.jLabelfecha_vencimientoNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoNotaCredito.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelfecha_vencimientoNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		//jFormattedTextFieldfecha_vencimientoNotaCredito= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoNotaCredito= new JDateChooser();
		jDateChooserfecha_vencimientoNotaCredito.setEnabled(false);
		jDateChooserfecha_vencimientoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoNotaCredito.setDate(new Date());
		jDateChooserfecha_vencimientoNotaCredito.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoNotaCredito.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoNotaCreditoBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoNotaCreditoBusqueda.setText("U");
		this.jButtonfecha_vencimientoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionNotaCredito = new JLabelMe();
		this.jLabelcotizacionNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionNotaCredito.setToolTipText("Cotizacion");
		this.jLabelcotizacionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelcotizacionNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldcotizacionNotaCredito= new JTextFieldMe();
		jTextFieldcotizacionNotaCredito.setEnabled(false);
		jTextFieldcotizacionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionNotaCredito.setText("0.0");

		this.jButtoncotizacionNotaCreditoBusqueda= new JButtonMe();
		this.jButtoncotizacionNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionNotaCreditoBusqueda.setText("U");
		this.jButtoncotizacionNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeldireccionNotaCredito = new JLabelMe();
		this.jLabeldireccionNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionNotaCredito.setToolTipText("Direccion");
		this.jLabeldireccionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneldireccionNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextAreadireccionNotaCredito= new JTextAreaMe();
		jTextAreadireccionNotaCredito.setEnabled(false);
		jTextAreadireccionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionNotaCredito.setLineWrap(true);
		jTextAreadireccionNotaCredito.setWrapStyleWord(true);
		jTextAreadireccionNotaCredito.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionNotaCredito.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionNotaCredito = new JScrollPane(jTextAreadireccionNotaCredito);
		jscrollPanedireccionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccionNotaCreditoBusqueda= new JButtonMe();
		this.jButtondireccionNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionNotaCreditoBusqueda.setText("U");
		this.jButtondireccionNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoNotaCredito = new JLabelMe();
		this.jLabeltelefonoNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_TELEFONO+" :");
		this.jLabeltelefonoNotaCredito.setToolTipText("Telefono");
		this.jLabeltelefonoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneltelefonoNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldtelefonoNotaCredito= new JTextFieldMe();

		jTextFieldtelefonoNotaCredito.setEnabled(false);
		jTextFieldtelefonoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoNotaCreditoBusqueda= new JButtonMe();
		this.jButtontelefonoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoNotaCreditoBusqueda.setText("U");
		this.jButtontelefonoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelrucNotaCredito = new JLabelMe();
		this.jLabelrucNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucNotaCredito.setToolTipText("Ruc");
		this.jLabelrucNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelrucNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldrucNotaCredito= new JTextFieldMe();

		jTextFieldrucNotaCredito.setEnabled(false);
		jTextFieldrucNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucNotaCreditoBusqueda= new JButtonMe();
		this.jButtonrucNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucNotaCreditoBusqueda.setText("U");
		this.jButtonrucNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionNotaCredito = new JLabelMe();
		this.jLabeldescripcionNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionNotaCredito.setToolTipText("Descripcion");
		this.jLabeldescripcionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneldescripcionNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextAreadescripcionNotaCredito= new JTextAreaMe();
		jTextAreadescripcionNotaCredito.setEnabled(false);
		jTextAreadescripcionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNotaCredito.setLineWrap(true);
		jTextAreadescripcionNotaCredito.setWrapStyleWord(true);
		jTextAreadescripcionNotaCredito.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionNotaCredito.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionNotaCredito = new JScrollPane(jTextAreadescripcionNotaCredito);
		jscrollPanedescripcionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionNotaCreditoBusqueda= new JButtonMe();
		this.jButtondescripcionNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionNotaCreditoBusqueda.setText("U");
		this.jButtondescripcionNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_porcentajeNotaCredito = new JLabelMe();
		this.jLabeldescuento_porcentajeNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_DESCUENTOPORCENTAJE+" : *");
		this.jLabeldescuento_porcentajeNotaCredito.setToolTipText("Descuento %");
		this.jLabeldescuento_porcentajeNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_porcentajeNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_porcentajeNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_porcentajeNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_DESCUENTOPORCENTAJE);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneldescuento_porcentajeNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFielddescuento_porcentajeNotaCredito= new JTextFieldMe();
		jTextFielddescuento_porcentajeNotaCredito.setEnabled(false);
		jTextFielddescuento_porcentajeNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_porcentajeNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_porcentajeNotaCredito.setText("0.0");

		this.jButtondescuento_porcentajeNotaCreditoBusqueda= new JButtonMe();
		this.jButtondescuento_porcentajeNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_porcentajeNotaCreditoBusqueda.setText("U");
		this.jButtondescuento_porcentajeNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_porcentajeNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_porcentajeNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_porcentajeNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_porcentajeNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_porcentajeNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_porcentajeNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaNotaCredito = new JLabelMe();
		this.jLabeltotal_ivaNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaNotaCredito.setToolTipText("Monto Con Iva");
		this.jLabeltotal_ivaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneltotal_ivaNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldtotal_ivaNotaCredito= new JTextFieldMe();
		jTextFieldtotal_ivaNotaCredito.setEnabled(false);
		jTextFieldtotal_ivaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaNotaCredito.setText("0.0");

		this.jButtontotal_ivaNotaCreditoBusqueda= new JButtonMe();
		this.jButtontotal_ivaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaNotaCreditoBusqueda.setText("U");
		this.jButtontotal_ivaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelsumanNotaCredito = new JLabelMe();
		this.jLabelsumanNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanNotaCredito.setToolTipText("Suman");
		this.jLabelsumanNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelsumanNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldsumanNotaCredito= new JTextFieldMe();
		jTextFieldsumanNotaCredito.setEnabled(false);
		jTextFieldsumanNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanNotaCredito.setText("0.0");

		this.jButtonsumanNotaCreditoBusqueda= new JButtonMe();
		this.jButtonsumanNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanNotaCreditoBusqueda.setText("U");
		this.jButtonsumanNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorNotaCredito = new JLabelMe();
		this.jLabeldescuento_valorNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorNotaCredito.setToolTipText("Dscto Valor");
		this.jLabeldescuento_valorNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneldescuento_valorNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFielddescuento_valorNotaCredito= new JTextFieldMe();
		jTextFielddescuento_valorNotaCredito.setEnabled(false);
		jTextFielddescuento_valorNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorNotaCredito.setText("0.0");

		this.jButtondescuento_valorNotaCreditoBusqueda= new JButtonMe();
		this.jButtondescuento_valorNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorNotaCreditoBusqueda.setText("U");
		this.jButtondescuento_valorNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaNotaCredito = new JLabelMe();
		this.jLabeltotal_sin_ivaNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaNotaCredito.setToolTipText("Monto Sin Iva");
		this.jLabeltotal_sin_ivaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneltotal_sin_ivaNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldtotal_sin_ivaNotaCredito= new JTextFieldMe();
		jTextFieldtotal_sin_ivaNotaCredito.setEnabled(false);
		jTextFieldtotal_sin_ivaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaNotaCredito.setText("0.0");

		this.jButtontotal_sin_ivaNotaCreditoBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaNotaCreditoBusqueda.setText("U");
		this.jButtontotal_sin_ivaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoNotaCredito = new JLabelMe();
		this.jLabeltotal_descuentoNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoNotaCredito.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneltotal_descuentoNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldtotal_descuentoNotaCredito= new JTextFieldMe();
		jTextFieldtotal_descuentoNotaCredito.setEnabled(false);
		jTextFieldtotal_descuentoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoNotaCredito.setText("0.0");

		this.jButtontotal_descuentoNotaCreditoBusqueda= new JButtonMe();
		this.jButtontotal_descuentoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoNotaCreditoBusqueda.setText("U");
		this.jButtontotal_descuentoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelfleteNotaCredito = new JLabelMe();
		this.jLabelfleteNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteNotaCredito.setToolTipText("Flete");
		this.jLabelfleteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelfleteNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldfleteNotaCredito= new JTextFieldMe();
		jTextFieldfleteNotaCredito.setEnabled(false);
		jTextFieldfleteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteNotaCredito.setText("0.0");

		this.jButtonfleteNotaCreditoBusqueda= new JButtonMe();
		this.jButtonfleteNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteNotaCreditoBusqueda.setText("U");
		this.jButtonfleteNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeltotalNotaCredito = new JLabelMe();
		this.jLabeltotalNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalNotaCredito.setToolTipText("Total");
		this.jLabeltotalNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneltotalNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldtotalNotaCredito= new JTextFieldMe();
		jTextFieldtotalNotaCredito.setEnabled(false);
		jTextFieldtotalNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalNotaCredito.setText("0.0");

		this.jButtontotalNotaCreditoBusqueda= new JButtonMe();
		this.jButtontotalNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalNotaCreditoBusqueda.setText("U");
		this.jButtontotalNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalNotaCredito = new JLabelMe();
		this.jLabelsub_totalNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalNotaCredito.setToolTipText("Sub Total");
		this.jLabelsub_totalNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelsub_totalNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldsub_totalNotaCredito= new JTextFieldMe();
		jTextFieldsub_totalNotaCredito.setEnabled(false);
		jTextFieldsub_totalNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalNotaCredito.setText("0.0");

		this.jButtonsub_totalNotaCreditoBusqueda= new JButtonMe();
		this.jButtonsub_totalNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalNotaCreditoBusqueda.setText("U");
		this.jButtonsub_totalNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelotroNotaCredito = new JLabelMe();
		this.jLabelotroNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_OTRO+" : *");
		this.jLabelotroNotaCredito.setToolTipText("Otro");
		this.jLabelotroNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotroNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotroNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotroNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_OTRO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelotroNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldotroNotaCredito= new JTextFieldMe();
		jTextFieldotroNotaCredito.setEnabled(false);
		jTextFieldotroNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotroNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotroNotaCredito.setText("0.0");

		this.jButtonotroNotaCreditoBusqueda= new JButtonMe();
		this.jButtonotroNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotroNotaCreditoBusqueda.setText("U");
		this.jButtonotroNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotroNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotroNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotroNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotroNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otroNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotroNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelivaNotaCredito = new JLabelMe();
		this.jLabelivaNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaNotaCredito.setToolTipText("Iva");
		this.jLabelivaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelivaNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldivaNotaCredito= new JTextFieldMe();
		jTextFieldivaNotaCredito.setEnabled(false);
		jTextFieldivaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaNotaCredito.setText("0.0");

		this.jButtonivaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonivaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaNotaCreditoBusqueda.setText("U");
		this.jButtonivaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoNotaCredito = new JLabelMe();
		this.jLabelfinanciamientoNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoNotaCredito.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelfinanciamientoNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldfinanciamientoNotaCredito= new JTextFieldMe();
		jTextFieldfinanciamientoNotaCredito.setEnabled(false);
		jTextFieldfinanciamientoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoNotaCredito.setText("0.0");

		this.jButtonfinanciamientoNotaCreditoBusqueda= new JButtonMe();
		this.jButtonfinanciamientoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoNotaCreditoBusqueda.setText("U");
		this.jButtonfinanciamientoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeliceNotaCredito = new JLabelMe();
		this.jLabeliceNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceNotaCredito.setToolTipText("Ice");
		this.jLabeliceNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneliceNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldiceNotaCredito= new JTextFieldMe();
		jTextFieldiceNotaCredito.setEnabled(false);
		jTextFieldiceNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceNotaCredito.setText("0.0");

		this.jButtoniceNotaCreditoBusqueda= new JButtonMe();
		this.jButtoniceNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceNotaCreditoBusqueda.setText("U");
		this.jButtoniceNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelotro_valorNotaCredito = new JLabelMe();
		this.jLabelotro_valorNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_OTROVALOR+" : *");
		this.jLabelotro_valorNotaCredito.setToolTipText("Otro Valor");
		this.jLabelotro_valorNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotro_valorNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotro_valorNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotro_valorNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotro_valorNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotro_valorNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_OTROVALOR);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelotro_valorNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldotro_valorNotaCredito= new JTextFieldMe();
		jTextFieldotro_valorNotaCredito.setEnabled(false);
		jTextFieldotro_valorNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotro_valorNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotro_valorNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotro_valorNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotro_valorNotaCredito.setText("0.0");

		this.jButtonotro_valorNotaCreditoBusqueda= new JButtonMe();
		this.jButtonotro_valorNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotro_valorNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotro_valorNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotro_valorNotaCreditoBusqueda.setText("U");
		this.jButtonotro_valorNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotro_valorNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotro_valorNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotro_valorNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotro_valorNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otro_valorNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotro_valorNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelretencionNotaCredito = new JLabelMe();
		this.jLabelretencionNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_RETENCION+" : *");
		this.jLabelretencionNotaCredito.setToolTipText("Retencion");
		this.jLabelretencionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencionNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencionNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_RETENCION);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelretencionNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jTextFieldretencionNotaCredito= new JTextFieldMe();
		jTextFieldretencionNotaCredito.setEnabled(false);
		jTextFieldretencionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencionNotaCredito.setText("0.0");

		this.jButtonretencionNotaCreditoBusqueda= new JButtonMe();
		this.jButtonretencionNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencionNotaCreditoBusqueda.setText("U");
		this.jButtonretencionNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencionNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencionNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencionNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencionNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencionNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencionNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelfechaNotaCredito = new JLabelMe();
		this.jLabelfechaNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaNotaCredito.setToolTipText("Fecha");
		this.jLabelfechaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelfechaNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		//jFormattedTextFieldfechaNotaCredito= new JFormattedTextFieldMe();

		jDateChooserfechaNotaCredito= new JDateChooser();
		jDateChooserfechaNotaCredito.setEnabled(false);
		jDateChooserfechaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaNotaCredito.setDate(new Date());
		jDateChooserfechaNotaCredito.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaNotaCredito.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonfechaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaNotaCreditoBusqueda.setText("U");
		this.jButtonfechaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeles_clienteNotaCredito = new JLabelMe();
		this.jLabeles_clienteNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_ESCLIENTE+" : *");
		this.jLabeles_clienteNotaCredito.setToolTipText("Es Cliente");
		this.jLabeles_clienteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_clienteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeles_clienteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeles_clienteNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_clienteNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_clienteNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_ESCLIENTE);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPaneles_clienteNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jCheckBoxes_clienteNotaCredito= new JCheckBoxMe();
		jCheckBoxes_clienteNotaCredito.setEnabled(false);

		jCheckBoxes_clienteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_clienteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_clienteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_clienteNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_clienteNotaCreditoBusqueda= new JButtonMe();
		this.jButtones_clienteNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_clienteNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_clienteNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_clienteNotaCreditoBusqueda.setText("U");
		this.jButtones_clienteNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_clienteNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_clienteNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_clienteNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_clienteNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_clienteNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_clienteNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_clienteNotaCredito = new JLabelMe();
		this.jLabelfecha_clienteNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_FECHACLIENTE+" : *");
		this.jLabelfecha_clienteNotaCredito.setToolTipText("Fecha Cliente");
		this.jLabelfecha_clienteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_clienteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_clienteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_clienteNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_clienteNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_clienteNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_FECHACLIENTE);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelfecha_clienteNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		//jFormattedTextFieldfecha_clienteNotaCredito= new JFormattedTextFieldMe();

		jDateChooserfecha_clienteNotaCredito= new JDateChooser();
		jDateChooserfecha_clienteNotaCredito.setEnabled(false);
		jDateChooserfecha_clienteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_clienteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_clienteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_clienteNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_clienteNotaCredito.setDate(new Date());
		jDateChooserfecha_clienteNotaCredito.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_clienteNotaCredito.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_clienteNotaCreditoBusqueda= new JButtonMe();
		this.jButtonfecha_clienteNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_clienteNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_clienteNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_clienteNotaCreditoBusqueda.setText("U");
		this.jButtonfecha_clienteNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_clienteNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_clienteNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_clienteNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_clienteNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_clienteNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_clienteNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_autorizacionNotaCredito = new JLabelMe();
		this.jLabelfecha_autorizacionNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_FECHAAUTORIZACION+" : *");
		this.jLabelfecha_autorizacionNotaCredito.setToolTipText("Fecha Autorizacion");
		this.jLabelfecha_autorizacionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_autorizacionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_autorizacionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_autorizacionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_autorizacionNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_autorizacionNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_FECHAAUTORIZACION);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelfecha_autorizacionNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		//jFormattedTextFieldfecha_autorizacionNotaCredito= new JFormattedTextFieldMe();

		jDateChooserfecha_autorizacionNotaCredito= new JDateChooser();
		jDateChooserfecha_autorizacionNotaCredito.setEnabled(false);
		jDateChooserfecha_autorizacionNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizacionNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizacionNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_autorizacionNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_autorizacionNotaCredito.setDate(new Date());
		jDateChooserfecha_autorizacionNotaCredito.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_autorizacionNotaCredito.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_autorizacionNotaCreditoBusqueda= new JButtonMe();
		this.jButtonfecha_autorizacionNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizacionNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizacionNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_autorizacionNotaCreditoBusqueda.setText("U");
		this.jButtonfecha_autorizacionNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_autorizacionNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_autorizacionNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_autorizacionNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_autorizacionNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_autorizacionNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_autorizacionNotaCreditoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNotaCredito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNotaCredito = new JLabelMe();
		this.jLabelid_empresaNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNotaCredito.setToolTipText("Empresa");
		this.jLabelid_empresaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_empresaNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_empresaNotaCredito= new JComboBoxMe();
		jComboBoxid_empresaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNotaCredito.setEnabled(false);

		this.jButtonid_empresaNotaCredito= new JButtonMe();
		this.jButtonid_empresaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotaCredito.setText("Buscar");
		this.jButtonid_empresaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotaCredito"));

		this.jButtonid_empresaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_empresaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNotaCreditoBusqueda.setText("U");
		this.jButtonid_empresaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_empresaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_empresaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNotaCreditoUpdate.setText("U");
		this.jButtonid_empresaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotaCreditoUpdate"));



					
		this.jLabelid_sucursalNotaCredito = new JLabelMe();
		this.jLabelid_sucursalNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalNotaCredito.setToolTipText("Sucursal");
		this.jLabelid_sucursalNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_sucursalNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_sucursalNotaCredito= new JComboBoxMe();
		jComboBoxid_sucursalNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalNotaCredito.setEnabled(false);

		this.jButtonid_sucursalNotaCredito= new JButtonMe();
		this.jButtonid_sucursalNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNotaCredito.setText("Buscar");
		this.jButtonid_sucursalNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNotaCredito"));

		this.jButtonid_sucursalNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_sucursalNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNotaCreditoBusqueda.setText("U");
		this.jButtonid_sucursalNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_sucursalNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNotaCreditoUpdate.setText("U");
		this.jButtonid_sucursalNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNotaCreditoUpdate"));



					
		this.jLabelid_ejercicioNotaCredito = new JLabelMe();
		this.jLabelid_ejercicioNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioNotaCredito.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_ejercicioNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_ejercicioNotaCredito= new JComboBoxMe();
		jComboBoxid_ejercicioNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioNotaCredito.setEnabled(false);

		this.jButtonid_ejercicioNotaCredito= new JButtonMe();
		this.jButtonid_ejercicioNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioNotaCredito.setText("Buscar");
		this.jButtonid_ejercicioNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioNotaCredito"));

		this.jButtonid_ejercicioNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioNotaCreditoBusqueda.setText("U");
		this.jButtonid_ejercicioNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_ejercicioNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioNotaCreditoUpdate.setText("U");
		this.jButtonid_ejercicioNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioNotaCreditoUpdate"));



					
		this.jLabelid_periodoNotaCredito = new JLabelMe();
		this.jLabelid_periodoNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoNotaCredito.setToolTipText("Periodo");
		this.jLabelid_periodoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_periodoNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_periodoNotaCredito= new JComboBoxMe();
		jComboBoxid_periodoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoNotaCredito.setEnabled(false);

		this.jButtonid_periodoNotaCredito= new JButtonMe();
		this.jButtonid_periodoNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoNotaCredito.setText("Buscar");
		this.jButtonid_periodoNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoNotaCredito"));

		this.jButtonid_periodoNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_periodoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoNotaCreditoBusqueda.setText("U");
		this.jButtonid_periodoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_periodoNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_periodoNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoNotaCreditoUpdate.setText("U");
		this.jButtonid_periodoNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoNotaCreditoUpdate"));



					
		this.jLabelid_anioNotaCredito = new JLabelMe();
		this.jLabelid_anioNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioNotaCredito.setToolTipText("Anio");
		this.jLabelid_anioNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_anioNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_anioNotaCredito= new JComboBoxMe();
		jComboBoxid_anioNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioNotaCredito.setEnabled(false);

		this.jButtonid_anioNotaCredito= new JButtonMe();
		this.jButtonid_anioNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioNotaCredito.setText("Buscar");
		this.jButtonid_anioNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioNotaCredito"));

		this.jButtonid_anioNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_anioNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioNotaCreditoBusqueda.setText("U");
		this.jButtonid_anioNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_anioNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_anioNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioNotaCreditoUpdate.setText("U");
		this.jButtonid_anioNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioNotaCreditoUpdate"));



					
		this.jLabelid_mesNotaCredito = new JLabelMe();
		this.jLabelid_mesNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesNotaCredito.setToolTipText("Mes");
		this.jLabelid_mesNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_mesNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_mesNotaCredito= new JComboBoxMe();
		jComboBoxid_mesNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesNotaCredito.setEnabled(false);

		this.jButtonid_mesNotaCredito= new JButtonMe();
		this.jButtonid_mesNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesNotaCredito.setText("Buscar");
		this.jButtonid_mesNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesNotaCredito"));

		this.jButtonid_mesNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_mesNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesNotaCreditoBusqueda.setText("U");
		this.jButtonid_mesNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_mesNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_mesNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesNotaCreditoUpdate.setText("U");
		this.jButtonid_mesNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesNotaCreditoUpdate"));



					
		this.jLabelid_usuarioNotaCredito = new JLabelMe();
		this.jLabelid_usuarioNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioNotaCredito.setToolTipText("Usuario");
		this.jLabelid_usuarioNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_usuarioNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_usuarioNotaCredito= new JComboBoxMe();
		jComboBoxid_usuarioNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioNotaCredito.setEnabled(false);

		this.jButtonid_usuarioNotaCredito= new JButtonMe();
		this.jButtonid_usuarioNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNotaCredito.setText("Buscar");
		this.jButtonid_usuarioNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNotaCredito"));

		this.jButtonid_usuarioNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_usuarioNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioNotaCreditoBusqueda.setText("U");
		this.jButtonid_usuarioNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_usuarioNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_usuarioNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioNotaCreditoUpdate.setText("U");
		this.jButtonid_usuarioNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNotaCreditoUpdate"));



					
		this.jLabelid_monedaNotaCredito = new JLabelMe();
		this.jLabelid_monedaNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaNotaCredito.setToolTipText("Moneda");
		this.jLabelid_monedaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_monedaNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_monedaNotaCredito= new JComboBoxMe();
		jComboBoxid_monedaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaNotaCredito= new JButtonMe();
		this.jButtonid_monedaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaNotaCredito.setText("Buscar");
		this.jButtonid_monedaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaNotaCredito"));

		this.jButtonid_monedaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_monedaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaNotaCreditoBusqueda.setText("U");
		this.jButtonid_monedaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_monedaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_monedaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaNotaCreditoUpdate.setText("U");
		this.jButtonid_monedaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaNotaCreditoUpdate"));



					
		this.jLabelid_empleadoNotaCredito = new JLabelMe();
		this.jLabelid_empleadoNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoNotaCredito.setToolTipText("Empleado");
		this.jLabelid_empleadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_empleadoNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_empleadoNotaCredito= new JComboBoxMe();
		jComboBoxid_empleadoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoNotaCredito= new JButtonMe();
		this.jButtonid_empleadoNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNotaCredito.setText("Buscar");
		this.jButtonid_empleadoNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNotaCredito"));

		this.jButtonid_empleadoNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_empleadoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoNotaCreditoBusqueda.setText("U");
		this.jButtonid_empleadoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_empleadoNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_empleadoNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoNotaCreditoUpdate.setText("U");
		this.jButtonid_empleadoNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNotaCreditoUpdate"));



					
		this.jLabelid_formatoNotaCredito = new JLabelMe();
		this.jLabelid_formatoNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDFORMATO+" :");
		this.jLabelid_formatoNotaCredito.setToolTipText("Formato");
		this.jLabelid_formatoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_formatoNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_formatoNotaCredito= new JComboBoxMe();
		jComboBoxid_formatoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoNotaCredito= new JButtonMe();
		this.jButtonid_formatoNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoNotaCredito.setText("Buscar");
		this.jButtonid_formatoNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoNotaCredito"));

		this.jButtonid_formatoNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_formatoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoNotaCreditoBusqueda.setText("U");
		this.jButtonid_formatoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_formatoNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_formatoNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoNotaCreditoUpdate.setText("U");
		this.jButtonid_formatoNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoNotaCreditoUpdate"));



					
		this.jLabelid_tipo_precioNotaCredito = new JLabelMe();
		this.jLabelid_tipo_precioNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioNotaCredito.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_tipo_precioNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_tipo_precioNotaCredito= new JComboBoxMe();
		jComboBoxid_tipo_precioNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioNotaCredito= new JButtonMe();
		this.jButtonid_tipo_precioNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioNotaCredito.setText("Buscar");
		this.jButtonid_tipo_precioNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioNotaCredito"));

		this.jButtonid_tipo_precioNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioNotaCreditoBusqueda.setText("U");
		this.jButtonid_tipo_precioNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_tipo_precioNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioNotaCreditoUpdate.setText("U");
		this.jButtonid_tipo_precioNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioNotaCreditoUpdate"));



					
		this.jLabelid_clienteNotaCredito = new JLabelMe();
		this.jLabelid_clienteNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteNotaCredito.setToolTipText("Cliente");
		this.jLabelid_clienteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_clienteNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_clienteNotaCredito= new JComboBoxMe();
		jComboBoxid_clienteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteNotaCredito= new JButtonMe();
		this.jButtonid_clienteNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNotaCredito.setText("Buscar");
		this.jButtonid_clienteNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNotaCredito"));

		this.jButtonid_clienteNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_clienteNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteNotaCreditoBusqueda.setText("U");
		this.jButtonid_clienteNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_clienteNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_clienteNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteNotaCreditoUpdate.setText("U");
		this.jButtonid_clienteNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNotaCreditoUpdate"));



					
		this.jLabelid_facturaNotaCredito = new JLabelMe();
		this.jLabelid_facturaNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaNotaCredito.setToolTipText("Factura");
		this.jLabelid_facturaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_facturaNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_facturaNotaCredito= new JComboBoxMe();
		jComboBoxid_facturaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaNotaCredito= new JButtonMe();
		this.jButtonid_facturaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaNotaCredito.setText("Buscar");
		this.jButtonid_facturaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaNotaCredito"));

		this.jButtonid_facturaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_facturaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaNotaCreditoBusqueda.setText("U");
		this.jButtonid_facturaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_facturaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_facturaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaNotaCreditoUpdate.setText("U");
		this.jButtonid_facturaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaNotaCreditoUpdate"));



					
		this.jLabelid_vendedorNotaCredito = new JLabelMe();
		this.jLabelid_vendedorNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDVENDEDOR+" :");
		this.jLabelid_vendedorNotaCredito.setToolTipText("Vendedor");
		this.jLabelid_vendedorNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_vendedorNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_vendedorNotaCredito= new JComboBoxMe();
		jComboBoxid_vendedorNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorNotaCredito= new JButtonMe();
		this.jButtonid_vendedorNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorNotaCredito.setText("Buscar");
		this.jButtonid_vendedorNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCredito"));

		this.jButtonid_vendedorNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_vendedorNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorNotaCreditoBusqueda.setText("U");
		this.jButtonid_vendedorNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_vendedorNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_vendedorNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorNotaCreditoUpdate.setText("U");
		this.jButtonid_vendedorNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoUpdate"));


		jButtonid_vendedorNotaCreditoArbol= new JButtonMe();
		jButtonid_vendedorNotaCreditoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorNotaCreditoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorNotaCreditoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorNotaCreditoArbol.setText("Arbol");
		jButtonid_vendedorNotaCreditoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorNotaCreditoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoArbol"));



					
		this.jLabelid_responsableNotaCredito = new JLabelMe();
		this.jLabelid_responsableNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDRESPONSABLE+" :");
		this.jLabelid_responsableNotaCredito.setToolTipText("Responsable");
		this.jLabelid_responsableNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsableNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsableNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_responsableNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_responsableNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_responsableNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDRESPONSABLE);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_responsableNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_responsableNotaCredito= new JComboBoxMe();
		jComboBoxid_responsableNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsableNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_responsableNotaCredito= new JButtonMe();
		this.jButtonid_responsableNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableNotaCredito.setText("Buscar");
		this.jButtonid_responsableNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_responsableNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_responsableNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableNotaCredito"));

		this.jButtonid_responsableNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_responsableNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsableNotaCreditoBusqueda.setText("U");
		this.jButtonid_responsableNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_responsableNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_responsableNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_responsableNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_responsableNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_responsableNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsableNotaCreditoUpdate.setText("U");
		this.jButtonid_responsableNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_responsableNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_responsableNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableNotaCreditoUpdate"));



					
		this.jLabelid_estado_nota_creditoNotaCredito = new JLabelMe();
		this.jLabelid_estado_nota_creditoNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDESTADONOTACREDITO+" : *");
		this.jLabelid_estado_nota_creditoNotaCredito.setToolTipText("Estado");
		this.jLabelid_estado_nota_creditoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_nota_creditoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_nota_creditoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_nota_creditoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_nota_creditoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_nota_creditoNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDESTADONOTACREDITO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_estado_nota_creditoNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_estado_nota_creditoNotaCredito= new JComboBoxMe();
		jComboBoxid_estado_nota_creditoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_nota_creditoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_nota_creditoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_nota_creditoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_nota_creditoNotaCredito= new JButtonMe();
		this.jButtonid_estado_nota_creditoNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_nota_creditoNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_nota_creditoNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_nota_creditoNotaCredito.setText("Buscar");
		this.jButtonid_estado_nota_creditoNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_nota_creditoNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_nota_creditoNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_nota_creditoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_nota_creditoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_nota_creditoNotaCredito"));

		this.jButtonid_estado_nota_creditoNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_estado_nota_creditoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_creditoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_creditoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_nota_creditoNotaCreditoBusqueda.setText("U");
		this.jButtonid_estado_nota_creditoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_nota_creditoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_nota_creditoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_nota_creditoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_nota_creditoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_nota_creditoNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_nota_creditoNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_estado_nota_creditoNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_estado_nota_creditoNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_creditoNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_creditoNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_nota_creditoNotaCreditoUpdate.setText("U");
		this.jButtonid_estado_nota_creditoNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_nota_creditoNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_nota_creditoNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_nota_creditoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_nota_creditoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_nota_creditoNotaCreditoUpdate"));



					
		this.jLabelid_centro_costoNotaCredito = new JLabelMe();
		this.jLabelid_centro_costoNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoNotaCredito.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_centro_costoNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_centro_costoNotaCredito= new JComboBoxMe();
		jComboBoxid_centro_costoNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_centro_costoNotaCredito.setEnabled(false);

		this.jButtonid_centro_costoNotaCredito= new JButtonMe();
		this.jButtonid_centro_costoNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoNotaCredito.setText("Buscar");
		this.jButtonid_centro_costoNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoNotaCredito"));

		this.jButtonid_centro_costoNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoNotaCreditoBusqueda.setText("U");
		this.jButtonid_centro_costoNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_centro_costoNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoNotaCreditoUpdate.setText("U");
		this.jButtonid_centro_costoNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoNotaCreditoUpdate"));


		jButtonid_centro_costoNotaCreditoArbol= new JButtonMe();
		jButtonid_centro_costoNotaCreditoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoNotaCreditoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoNotaCreditoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoNotaCreditoArbol.setText("Arbol");
		jButtonid_centro_costoNotaCreditoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoNotaCreditoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoNotaCreditoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoNotaCreditoArbol"));



					
		this.jLabelid_tipo_cambioNotaCredito = new JLabelMe();
		this.jLabelid_tipo_cambioNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioNotaCredito.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_tipo_cambioNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_tipo_cambioNotaCredito= new JComboBoxMe();
		jComboBoxid_tipo_cambioNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioNotaCredito.setEnabled(false);

		this.jButtonid_tipo_cambioNotaCredito= new JButtonMe();
		this.jButtonid_tipo_cambioNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioNotaCredito.setText("Buscar");
		this.jButtonid_tipo_cambioNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioNotaCredito"));

		this.jButtonid_tipo_cambioNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioNotaCreditoBusqueda.setText("U");
		this.jButtonid_tipo_cambioNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioNotaCreditoUpdate.setText("U");
		this.jButtonid_tipo_cambioNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioNotaCreditoUpdate"));



					
		this.jLabelid_transporteNotaCredito = new JLabelMe();
		this.jLabelid_transporteNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDTRANSPORTE+" :");
		this.jLabelid_transporteNotaCredito.setToolTipText("Transporte");
		this.jLabelid_transporteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transporteNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transporteNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transporteNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDTRANSPORTE);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_transporteNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_transporteNotaCredito= new JComboBoxMe();
		jComboBoxid_transporteNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_transporteNotaCredito.setEnabled(false);

		this.jButtonid_transporteNotaCredito= new JButtonMe();
		this.jButtonid_transporteNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteNotaCredito.setText("Buscar");
		this.jButtonid_transporteNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transporteNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transporteNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteNotaCredito"));

		this.jButtonid_transporteNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_transporteNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteNotaCreditoBusqueda.setText("U");
		this.jButtonid_transporteNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transporteNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transporteNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transporteNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_transporteNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_transporteNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteNotaCreditoUpdate.setText("U");
		this.jButtonid_transporteNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transporteNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transporteNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteNotaCreditoUpdate"));



					
		this.jLabelid_transportistaNotaCredito = new JLabelMe();
		this.jLabelid_transportistaNotaCredito.setText(""+NotaCreditoConstantesFunciones.LABEL_IDTRANSPORTISTA+" :");
		this.jLabelid_transportistaNotaCredito.setToolTipText("Transportista");
		this.jLabelid_transportistaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaNotaCredito.setToolTipText(NotaCreditoConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutNotaCredito = new GridBagLayout();
		this.jPanelid_transportistaNotaCredito.setLayout(this.gridaBagLayoutNotaCredito);


		jComboBoxid_transportistaNotaCredito= new JComboBoxMe();
		jComboBoxid_transportistaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_transportistaNotaCredito.setEnabled(false);

		this.jButtonid_transportistaNotaCredito= new JButtonMe();
		this.jButtonid_transportistaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaNotaCredito.setText("Buscar");
		this.jButtonid_transportistaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaNotaCredito"));

		this.jButtonid_transportistaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_transportistaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaNotaCreditoBusqueda.setText("U");
		this.jButtonid_transportistaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaNotaCreditoBusqueda"));

		if(this.notacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_transportistaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_transportistaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaNotaCreditoUpdate.setText("U");
		this.jButtonid_transportistaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaNotaCreditoUpdate"));



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
		//this.jInternalFrameDetalleNotaCredito = new NotaCreditoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Nota Credito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNotaCredito= new GridBagLayout();
		

		
		String sToolTipNotaCredito="";
		sToolTipNotaCredito=NotaCreditoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNotaCredito+="(Facturacion.NotaCredito)";
		}
		
		if(!this.notacreditoSessionBean.getEsGuardarRelacionado()) {
			sToolTipNotaCredito+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNotaCredito = new JButtonMe();
		this.jButtonModificarNotaCredito = new JButtonMe();
        this.jButtonActualizarNotaCredito = new JButtonMe();
        this.jButtonEliminarNotaCredito = new JButtonMe();
        this.jButtonCancelarNotaCredito = new JButtonMe();
        this.jButtonGuardarCambiosNotaCredito = new JButtonMe();
		this.jButtonGuardarCambiosTablaNotaCredito = new JButtonMe();
		this.jButtonCerrarNotaCredito = new JButtonMe();
		
		this.jScrollPanelDatosNotaCredito = new JScrollPane();   
        this.jScrollPanelDatosEdicionNotaCredito = new JScrollPane();
		this.jScrollPanelDatosGeneralNotaCredito = new JScrollPane();
				
		
		
		this.jPanelCamposNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Nota Credito";
		
		if(!this.notacreditoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposNotaCredito.setName("jPanelCamposNotaCredito"); 

		this.jPanelCamposOcultosNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNotaCredito.setName("jPanelCamposOcultosNotaCredito"); 

        this.jPanelAccionesNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesNotaCredito.setName("Acciones"); 

		this.jPanelAccionesFormularioNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNotaCredito.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalNotaCredito.setName("jPanelCamposFintotalNotaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNotaCredito.setText("Nuevo");
		this.jButtonModificarNotaCredito.setText("Editar");
        this.jButtonActualizarNotaCredito.setText("Actualizar");
        this.jButtonEliminarNotaCredito.setText("Eliminar");
        this.jButtonCancelarNotaCredito.setText("Cancelar");
        this.jButtonGuardarCambiosNotaCredito.setText("Guardar");
		this.jButtonGuardarCambiosTablaNotaCredito.setText("Guardar");
		this.jButtonCerrarNotaCredito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNotaCredito,"nuevo_button","Nuevo",this.notacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNotaCredito,"modificar_button","Editar",this.notacreditoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNotaCredito,"actualizar_button","Actualizar",this.notacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNotaCredito,"eliminar_button","Eliminar",this.notacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNotaCredito,"cancelar_button","Cancelar",this.notacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNotaCredito,"guardarcambios_button","Guardar",this.notacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNotaCredito,"guardarcambiostabla_button","Guardar",this.notacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNotaCredito,"cerrar_button","Salir",this.notacreditoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNotaCredito.setToolTipText("Nuevo"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNotaCredito.setToolTipText("Editar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNotaCredito.setToolTipText("Actualizar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNotaCredito.setToolTipText("Eliminar)"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNotaCredito.setToolTipText("Cancelar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNotaCredito.setToolTipText("Guardar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNotaCredito.setToolTipText("Guardar"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNotaCredito.setToolTipText("Salir"+" "+NotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNotaCredito";
		inputMap = this.jButtonNuevoNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNotaCredito"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNotaCredito";
		inputMap = this.jButtonActualizarNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNotaCredito"));
		
		//ELIMINAR
		sMapKey = "EliminarNotaCredito";
		inputMap = this.jButtonEliminarNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNotaCredito"));
		
		//CANCELAR	
		sMapKey = "CancelarNotaCredito";
		inputMap = this.jButtonCancelarNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNotaCredito"));
		
		//CERRAR		
		sMapKey = "CerrarNotaCredito";
		inputMap = this.jButtonCerrarNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNotaCredito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNotaCredito";
		inputMap = this.jButtonGuardarCambiosTablaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNotaCredito"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNotaCredito.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNotaCredito.setToolTipText("Nuevo NotaCredito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNotaCredito.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNotaCredito.setToolTipText("Sin Cerrar Ventana NotaCredito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNotaCredito.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNotaCredito.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNotaCredito.setText("Accion");
		this.jComboBoxTiposAccionesNotaCredito.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNotaCredito.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNotaCredito.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNotaCredito = new JLabelMe();
		
		this.jLabelAccionesNotaCredito.setText("Acciones");		
		this.jLabelAccionesNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNotaCredito();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNotaCredito();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNotaCredito=new JTabbedPane();
		this.jTabbedPaneRelacionesNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNotaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNotaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNotaCredito.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNotaCredito = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNotaCredito = new GridBagLayout();
		
		this.jPanelCamposNotaCredito.setLayout(gridaBagLayoutCamposNotaCredito);
		this.jPanelCamposOcultosNotaCredito.setLayout(gridaBagLayoutCamposOcultosNotaCredito);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalNotaCredito= new GridBagLayout();
		this.jPanelCamposFintotalNotaCredito.setLayout(gridaBagLayoutCamposFintotalNotaCredito);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNotaCredito.add(jLabelIdNotaCredito, this.gridBagConstraintsNotaCredito);



	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNotaCredito.add(jLabelidNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNotaCredito.add(jLabelid_empresaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNotaCredito.add(jButtonid_empresaNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNotaCredito.add(jButtonid_empresaNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNotaCredito.add(jComboBoxid_empresaNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalNotaCredito.add(jLabelid_sucursalNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNotaCredito.add(jButtonid_sucursalNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNotaCredito.add(jButtonid_sucursalNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalNotaCredito.add(jComboBoxid_sucursalNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioNotaCredito.add(jLabelid_ejercicioNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioNotaCredito.add(jButtonid_ejercicioNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioNotaCredito.add(jButtonid_ejercicioNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioNotaCredito.add(jComboBoxid_ejercicioNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoNotaCredito.add(jLabelid_periodoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoNotaCredito.add(jButtonid_periodoNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoNotaCredito.add(jButtonid_periodoNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoNotaCredito.add(jComboBoxid_periodoNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioNotaCredito.add(jLabelid_anioNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioNotaCredito.add(jButtonid_anioNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioNotaCredito.add(jButtonid_anioNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioNotaCredito.add(jComboBoxid_anioNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesNotaCredito.add(jLabelid_mesNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesNotaCredito.add(jButtonid_mesNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesNotaCredito.add(jButtonid_mesNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesNotaCredito.add(jComboBoxid_mesNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioNotaCredito.add(jLabelid_usuarioNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioNotaCredito.add(jButtonid_usuarioNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioNotaCredito.add(jButtonid_usuarioNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioNotaCredito.add(jComboBoxid_usuarioNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoNotaCredito.add(jLabelcodigoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoNotaCredito.add(jButtoncodigoNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoNotaCredito.add(jTextFieldcodigoNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroNotaCredito.add(jLabelnumeroNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroNotaCredito.add(jButtonnumeroNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroNotaCredito.add(jTextFieldnumeroNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionNotaCredito.add(jLabelfecha_emisionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionNotaCredito.add(jButtonfecha_emisionNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionNotaCredito.add(jDateChooserfecha_emisionNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_diasNotaCredito.add(jLabelnumero_diasNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasNotaCredito.add(jButtonnumero_diasNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_diasNotaCredito.add(jTextFieldnumero_diasNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoNotaCredito.add(jLabelfecha_vencimientoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoNotaCredito.add(jButtonfecha_vencimientoNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoNotaCredito.add(jDateChooserfecha_vencimientoNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaNotaCredito.add(jLabelid_monedaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaNotaCredito.add(jButtonid_monedaNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaNotaCredito.add(jButtonid_monedaNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaNotaCredito.add(jComboBoxid_monedaNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcotizacionNotaCredito.add(jLabelcotizacionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionNotaCredito.add(jButtoncotizacionNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcotizacionNotaCredito.add(jTextFieldcotizacionNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoNotaCredito.add(jLabelid_empleadoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 2;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoNotaCredito.add(jButtonid_empleadoNotaCredito, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoNotaCredito.add(jButtonid_empleadoNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 4;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoNotaCredito.add(jButtonid_empleadoNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoNotaCredito.add(jComboBoxid_empleadoNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoNotaCredito.add(jLabelid_formatoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoNotaCredito.add(jButtonid_formatoNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoNotaCredito.add(jButtonid_formatoNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoNotaCredito.add(jComboBoxid_formatoNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_precioNotaCredito.add(jLabelid_tipo_precioNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioNotaCredito.add(jButtonid_tipo_precioNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioNotaCredito.add(jButtonid_tipo_precioNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_precioNotaCredito.add(jComboBoxid_tipo_precioNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteNotaCredito.add(jLabelid_clienteNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 2;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteNotaCredito.add(jButtonid_clienteNotaCredito, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteNotaCredito.add(jButtonid_clienteNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 4;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteNotaCredito.add(jButtonid_clienteNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteNotaCredito.add(jComboBoxid_clienteNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_facturaNotaCredito.add(jLabelid_facturaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 2;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaNotaCredito.add(jButtonid_facturaNotaCredito, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaNotaCredito.add(jButtonid_facturaNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 4;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaNotaCredito.add(jButtonid_facturaNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_facturaNotaCredito.add(jComboBoxid_facturaNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldireccionNotaCredito.add(jLabeldireccionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionNotaCredito.add(jButtondireccionNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldireccionNotaCredito.add(jscrollPanedireccionNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltelefonoNotaCredito.add(jLabeltelefonoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoNotaCredito.add(jButtontelefonoNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltelefonoNotaCredito.add(jTextFieldtelefonoNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelrucNotaCredito.add(jLabelrucNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucNotaCredito.add(jButtonrucNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelrucNotaCredito.add(jTextFieldrucNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_vendedorNotaCredito.add(jLabelid_vendedorNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 2;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorNotaCredito.add(jButtonid_vendedorNotaCredito, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 3;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorNotaCredito.add(jButtonid_vendedorNotaCreditoArbol, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 4;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorNotaCredito.add(jButtonid_vendedorNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 5;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorNotaCredito.add(jButtonid_vendedorNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_vendedorNotaCredito.add(jComboBoxid_vendedorNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_responsableNotaCredito.add(jLabelid_responsableNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsableNotaCredito.add(jButtonid_responsableNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsableNotaCredito.add(jButtonid_responsableNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_responsableNotaCredito.add(jComboBoxid_responsableNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_nota_creditoNotaCredito.add(jLabelid_estado_nota_creditoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_nota_creditoNotaCredito.add(jButtonid_estado_nota_creditoNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_nota_creditoNotaCredito.add(jButtonid_estado_nota_creditoNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_nota_creditoNotaCredito.add(jComboBoxid_estado_nota_creditoNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionNotaCredito.add(jLabeldescripcionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionNotaCredito.add(jButtondescripcionNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionNotaCredito.add(jscrollPanedescripcionNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_porcentajeNotaCredito.add(jLabeldescuento_porcentajeNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_porcentajeNotaCredito.add(jButtondescuento_porcentajeNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_porcentajeNotaCredito.add(jTextFielddescuento_porcentajeNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_ivaNotaCredito.add(jLabeltotal_ivaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaNotaCredito.add(jButtontotal_ivaNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_ivaNotaCredito.add(jTextFieldtotal_ivaNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsumanNotaCredito.add(jLabelsumanNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanNotaCredito.add(jButtonsumanNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsumanNotaCredito.add(jTextFieldsumanNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorNotaCredito.add(jLabeldescuento_valorNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorNotaCredito.add(jButtondescuento_valorNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorNotaCredito.add(jTextFielddescuento_valorNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_sin_ivaNotaCredito.add(jLabeltotal_sin_ivaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaNotaCredito.add(jButtontotal_sin_ivaNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_sin_ivaNotaCredito.add(jTextFieldtotal_sin_ivaNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_descuentoNotaCredito.add(jLabeltotal_descuentoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoNotaCredito.add(jButtontotal_descuentoNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_descuentoNotaCredito.add(jTextFieldtotal_descuentoNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfleteNotaCredito.add(jLabelfleteNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteNotaCredito.add(jButtonfleteNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfleteNotaCredito.add(jTextFieldfleteNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalNotaCredito.add(jLabeltotalNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalNotaCredito.add(jButtontotalNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalNotaCredito.add(jTextFieldtotalNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalNotaCredito.add(jLabelsub_totalNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalNotaCredito.add(jButtonsub_totalNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalNotaCredito.add(jTextFieldsub_totalNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotroNotaCredito.add(jLabelotroNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelotroNotaCredito.add(jButtonotroNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotroNotaCredito.add(jTextFieldotroNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaNotaCredito.add(jLabelivaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaNotaCredito.add(jButtonivaNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaNotaCredito.add(jTextFieldivaNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfinanciamientoNotaCredito.add(jLabelfinanciamientoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoNotaCredito.add(jButtonfinanciamientoNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfinanciamientoNotaCredito.add(jTextFieldfinanciamientoNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneliceNotaCredito.add(jLabeliceNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceNotaCredito.add(jButtoniceNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneliceNotaCredito.add(jTextFieldiceNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotro_valorNotaCredito.add(jLabelotro_valorNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelotro_valorNotaCredito.add(jButtonotro_valorNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotro_valorNotaCredito.add(jTextFieldotro_valorNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelretencionNotaCredito.add(jLabelretencionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencionNotaCredito.add(jButtonretencionNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelretencionNotaCredito.add(jTextFieldretencionNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaNotaCredito.add(jLabelfechaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaNotaCredito.add(jButtonfechaNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaNotaCredito.add(jDateChooserfechaNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_clienteNotaCredito.add(jLabeles_clienteNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_clienteNotaCredito.add(jButtones_clienteNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_clienteNotaCredito.add(jCheckBoxes_clienteNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoNotaCredito.add(jLabelid_centro_costoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 2;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoNotaCredito.add(jButtonid_centro_costoNotaCredito, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 3;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoNotaCredito.add(jButtonid_centro_costoNotaCreditoArbol, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 4;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoNotaCredito.add(jButtonid_centro_costoNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 5;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoNotaCredito.add(jButtonid_centro_costoNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoNotaCredito.add(jComboBoxid_centro_costoNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioNotaCredito.add(jLabelid_tipo_cambioNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 2;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioNotaCredito.add(jButtonid_tipo_cambioNotaCredito, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioNotaCredito.add(jButtonid_tipo_cambioNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 4;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioNotaCredito.add(jButtonid_tipo_cambioNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioNotaCredito.add(jComboBoxid_tipo_cambioNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transporteNotaCredito.add(jLabelid_transporteNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteNotaCredito.add(jButtonid_transporteNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteNotaCredito.add(jButtonid_transporteNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transporteNotaCredito.add(jComboBoxid_transporteNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transportistaNotaCredito.add(jLabelid_transportistaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaNotaCredito.add(jButtonid_transportistaNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 3;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaNotaCredito.add(jButtonid_transportistaNotaCreditoUpdate, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transportistaNotaCredito.add(jComboBoxid_transportistaNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_clienteNotaCredito.add(jLabelfecha_clienteNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_clienteNotaCredito.add(jButtonfecha_clienteNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_clienteNotaCredito.add(jDateChooserfecha_clienteNotaCredito, this.gridBagConstraintsNotaCredito);


	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 0;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_autorizacionNotaCredito.add(jLabelfecha_autorizacionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = 2;
		this.gridBagConstraintsNotaCredito.ipadx = 0;
		this.gridBagConstraintsNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_autorizacionNotaCredito.add(jButtonfecha_autorizacionNotaCreditoBusqueda, this.gridBagConstraintsNotaCredito);
	}

	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCredito.gridy = 0;
	this.gridBagConstraintsNotaCredito.gridx = 1;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_autorizacionNotaCredito.add(jDateChooserfecha_autorizacionNotaCredito, this.gridBagConstraintsNotaCredito);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelidNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelcodigoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelnumeroNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelfecha_emisionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelnumero_diasNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelfecha_vencimientoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelid_monedaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelcotizacionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelid_empleadoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelid_formatoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelid_tipo_precioNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelid_clienteNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelid_facturaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPaneldireccionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPaneltelefonoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelrucNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelid_vendedorNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelid_responsableNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPanelid_estado_nota_creditoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotaCredito.add(this.jPaneldescripcionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposNotaCredito % 3==0) {
		iXPanelCamposNotaCredito=0;
		iYPanelCamposNotaCredito++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_empresaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_sucursalNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_ejercicioNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_periodoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_anioNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_mesNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_usuarioNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelretencionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelfechaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPaneles_clienteNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_centro_costoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_tipo_cambioNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_transporteNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelid_transportistaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelfecha_clienteNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposOcultosNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposOcultosNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotaCredito.add(this.jPanelfecha_autorizacionNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposOcultosNotaCredito % 3==0) {
		iXPanelCamposOcultosNotaCredito=0;
		iYPanelCamposOcultosNotaCredito++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPaneldescuento_porcentajeNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPaneltotal_ivaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPanelsumanNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPaneldescuento_valorNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPaneltotal_sin_ivaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPaneltotal_descuentoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPanelfleteNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPaneltotalNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPanelsub_totalNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPanelotroNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPanelivaNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPanelfinanciamientoNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPaneliceNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
	}
	this.gridBagConstraintsNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCredito.gridy = iYPanelCamposFintotalNotaCredito;
	this.gridBagConstraintsNotaCredito.gridx = iXPanelCamposFintotalNotaCredito++;
	this.gridBagConstraintsNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposFintotalNotaCredito.add(this.jPanelotro_valorNotaCredito, this.gridBagConstraintsNotaCredito);



	if(iXPanelCamposFintotalNotaCredito % 3==0) {
		iXPanelCamposFintotalNotaCredito=0;
		iYPanelCamposFintotalNotaCredito++;
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
			
		GridBagLayout gridaBagLayoutAccionesNotaCredito= new GridBagLayout();
		this.jPanelAccionesNotaCredito.setLayout(gridaBagLayoutAccionesNotaCredito);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNotaCredito= new GridBagLayout();
		this.jPanelAccionesFormularioNotaCredito.setLayout(gridaBagLayoutAccionesFormularioNotaCredito);
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNotaCredito.add(this.jComboBoxTiposAccionesFormularioNotaCredito, this.gridBagConstraintsNotaCredito);

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNotaCredito.add(this.jCheckBoxPostAccionNuevoNotaCredito, this.gridBagConstraintsNotaCredito);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.notacreditoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNotaCredito.add(this.jCheckBoxPostAccionSinCerrarNotaCredito, this.gridBagConstraintsNotaCredito);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.notacreditoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.notacreditoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNotaCredito.add(this.jCheckBoxPostAccionSinMensajeNotaCredito, this.gridBagConstraintsNotaCredito);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx = iPosXAccion++;
			
		this.jPanelAccionesNotaCredito.add(this.jButtonModificarNotaCredito, this.gridBagConstraintsNotaCredito);							

		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCredito.gridy = 0;
		this.gridBagConstraintsNotaCredito.gridx =iPosXAccion++;
			
		this.jPanelAccionesNotaCredito.add(this.jButtonEliminarNotaCredito, this.gridBagConstraintsNotaCredito);
		
			
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = 0;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXAccion++;
		
		this.jPanelAccionesNotaCredito.add(this.jButtonActualizarNotaCredito, this.gridBagConstraintsNotaCredito);


		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = 0;		
		this.gridBagConstraintsNotaCredito.gridx = iPosXAccion++;
		
		this.jPanelAccionesNotaCredito.add(this.jButtonGuardarCambiosNotaCredito, this.gridBagConstraintsNotaCredito);	
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = 0;		
		this.gridBagConstraintsNotaCredito.gridx =iPosXAccion++;
		
		this.jPanelAccionesNotaCredito.add(this.jButtonCancelarNotaCredito, this.gridBagConstraintsNotaCredito);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNotaCredito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNotaCredito);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.notacreditoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();						
			this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotaCredito.gridx = 0;		
			//this.gridBagConstraintsNotaCredito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNotaCredito.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNotaCredito.gridx =0;
		this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNotaCredito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNotaCredito, this.gridBagConstraintsNotaCredito);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NotaCreditoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNotaCredito = new NotaCreditoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Nota Credito DATOS");
			
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
			
	        //this.setTitle("[FOR] - Nota Credito DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Nota Credito Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NotaCreditoModel notacreditoModel=new NotaCreditoModel(this);
			
			//SI USARA CLASE INTERNA
			//NotaCreditoModel.NotaCreditoFocusTraversalPolicy notacreditoFocusTraversalPolicy = notacreditoModel.new NotaCreditoFocusTraversalPolicy(this);
			
			//notacreditoFocusTraversalPolicy.setnotacreditoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(notacreditoModel);
			
			
			this.jContentPaneDetalleNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNotaCredito = new GridBagLayout();	
			this.jContentPaneDetalleNotaCredito.setLayout(gridaBagLayoutDetalleNotaCredito);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNotaCredito = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionNotaCredito=   new JScrollPane(jContentPaneDetalleNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNotaCredito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsNotaCredito.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNotaCredito.gridx = 0;
	        
			this.jContentPaneDetalleNotaCredito.add(jPanelCamposNotaCredito, gridBagConstraintsNotaCredito);
			
			
			
			
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
						&& notacreditoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetaNotaCredito(this.puedeCargarPorParteDetaNotaCredito,false,-1);
					
					if(this.notacreditoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNotaCredito= new GridBagConstraints();
						this.gridBagConstraintsNotaCredito.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNotaCredito.gridx = 0;
						this.jContentPaneDetalleNotaCredito.add(this.jTabbedPaneRelacionesNotaCredito, this.gridBagConstraintsNotaCredito);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNotaCredito.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetaNotaCredito(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsNotaCredito.gridy = iGridyRelaciones++;
		this.gridBagConstraintsNotaCredito.gridx = 0;

		this.jContentPaneDetalleNotaCredito.add(jPanelCamposFintotalNotaCredito, gridBagConstraintsNotaCredito);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNotaCredito.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNotaCredito = new GridBagConstraints();
					this.gridBagConstraintsNotaCredito.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNotaCredito.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNotaCredito.gridx = 0;
					
				
					this.jContentPaneDetalleNotaCredito.add(jPanelCamposOcultosNotaCredito, gridBagConstraintsNotaCredito);
				
					this.jPanelCamposOcultosNotaCredito.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsNotaCredito.gridx = 0;
	        this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNotaCredito.add(this.jPanelAccionesFormularioNotaCredito, this.gridBagConstraintsNotaCredito);							
			
			
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsNotaCredito.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsNotaCredito.gridx = 0;
	        
			
			this.jContentPaneDetalleNotaCredito.add(this.jPanelAccionesNotaCredito, this.gridBagConstraintsNotaCredito);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNotaCredito);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNotaCredito=   new JScrollPane(this.jPanelCamposNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNotaCredito.gridx = 0;
			this.gridBagConstraintsNotaCredito.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNotaCredito.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNotaCredito.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNotaCredito, this.gridBagConstraintsNotaCredito);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNotaCredito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNotaCredito, this.gridBagConstraintsNotaCredito);			
			
			this.gridBagConstraintsNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsNotaCredito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNotaCredito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNotaCredito, this.gridBagConstraintsNotaCredito);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNotaCredito, this.gridBagConstraintsNotaCredito);
			
			
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNotaCredito, this.gridBagConstraintsNotaCredito);
		
			
		this.gridBagConstraintsNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsNotaCredito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNotaCredito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNotaCredito, this.gridBagConstraintsNotaCredito);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNotaCredito;//jContentPane;
		
		return jScrollPanelDatosEdicionNotaCredito;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetaNotaCredito(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detanotacreditoSessionBean=new DetaNotaCreditoSessionBean();
		this.detanotacreditoSessionBean.setConGuardarRelaciones(false);
		this.detanotacreditoSessionBean.setEsGuardarRelacionado(true);

		this.detanotacreditoBeanSwingJInternalFrame=null;//new DetaNotaCreditoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detanotacreditoBeanSwingJInternalFramePopup=new DetaNotaCreditoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detanotacreditoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {

				DetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=NotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detanotacreditoSessionBean.setEsGuardarRelacionado(true);

				this.detanotacreditoBeanSwingJInternalFrame=new DetaNotaCreditoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detanotacreditoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detanotacreditoBeanSwingJInternalFrame.setdetanotacreditoSessionBean(this.detanotacreditoSessionBean);

				//this.gridBagConstraintsNotaCredito = new GridBagConstraints();
				//this.gridBagConstraintsNotaCredito.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNotaCredito.gridx = 0;
				//this.jContentPaneDetalleNotaCredito.add(this.detanotacreditoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNotaCredito);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNotaCredito.add("Deta Nota Creditos",this.detanotacreditoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNotaCredito.setComponentAt(iIndexTab,this.detanotacreditoBeanSwingJInternalFrame.getContentPane());
				}

				//DetaNotaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detanotacreditoSessionBean.setEsGuardarRelacionado(false);
				this.detanotacreditoBeanSwingJInternalFrame=null;//new DetaNotaCreditoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetaNotaCredito) {
					this.jTabbedPaneRelacionesNotaCredito.add("Deta Nota Creditos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetaNotaCreditoBeanSwingJInternalFrame(List<NotaCredito> notacreditos,NotaCredito notacredito,DetaNotaCreditoBeanSwingJInternalFrame detanotacreditoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detanotacreditoBeanSwingJInternalFrame=new DetaNotaCreditoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detanotacreditoBeanSwingJInternalFrame.getDetaNotaCreditoLogic().setConnexion(this.notacreditoLogic.getConnexion());

					detanotacreditoBeanSwingJInternalFrame.setnotacreditosForeignKey(notacreditos);
					detanotacreditoBeanSwingJInternalFrame.setnotacreditoForeignKey(notacredito);
					detanotacreditoBeanSwingJInternalFrame.detanotacreditoSessionBean.setisBusquedaDesdeForeignKeySesionNotaCredito(true);
					detanotacreditoBeanSwingJInternalFrame.detanotacreditoSessionBean.setlidNotaCreditoActual(notacredito.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detanotacreditoBeanSwingJInternalFrame.cargarCombosForeignKeyDetaNotaCredito(detanotacreditoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detanotacreditoBeanSwingJInternalFrame.setVisibilidadBusquedasParaNotaCredito(true);
					detanotacreditoBeanSwingJInternalFrame.setid_nota_creditoFK_IdNotaCredito(notacredito.getId());

					if(!this.conCargarFormDetalle) {
						detanotacreditoBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detanotacreditoBeanSwingJInternalFrame.setSelectedItemCombosFrameNotaCreditoForeignKey(notacredito,1,false,true,true);
					detanotacreditoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detanotacreditoBeanSwingJInternalFrame.procesarBusqueda("FK_IdNotaCredito");
					detanotacreditoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNotaCredito");
					detanotacreditoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaNotaCredito(true);
					detanotacreditoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetaNotaCredito("n",detanotacreditoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detanotacreditoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detanotacreditoBeanSwingJInternalFrame.setAutoscrolls(true);
					detanotacreditoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detanotacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsDetaNotaCredito("relacionado");
					} else {
						detanotacreditoBeanSwingJInternalFrame.actualizarEstadoPanelsDetaNotaCredito("no_relacionado");
					}

					detanotacreditoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetaNotaCredito().setVisible(false);

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
