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
import com.bydan.erp.facturacion.util.NotaCreditoSoliConstantesFunciones;

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
public class NotaCreditoSoliDetalleFormJInternalFrame extends NotaCreditoSoliBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNotaCreditoSoli;
	
	protected JMenuBar jmenuBarDetalleNotaCreditoSoli;
	
	protected JMenu jmenuDetalleNotaCreditoSoli;
	protected JMenu jmenuDetalleArchivoNotaCreditoSoli;
	protected JMenu jmenuDetalleAccionesNotaCreditoSoli;
	protected JMenu jmenuDetalleDatosNotaCreditoSoli;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNotaCreditoSoli;	
	protected GridBagConstraints gridBagConstraintsNotaCreditoSoli;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NotaCreditoSoliBeanSwingJInternalFrameAdditional jInternalFrameDetalleNotaCreditoSoli;		
	
	
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

	protected TipoNotaCreditoSoliBeanSwingJInternalFrame tiponotacreditosoliBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiponotacreditosoli="";

	protected ResponsableBeanSwingJInternalFrame responsableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsable="";

	protected EstadoNotaCreditoBeanSwingJInternalFrame estadonotacreditosoliBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadonotacreditosoli="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected TransporteBeanSwingJInternalFrame transporteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transporte="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";
	
	public NotaCreditoSoliSessionBean notacreditosoliSessionBean;
	
	

	public DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFrame=null;
	public DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetaNotaCreditoSoli=false;
	public DetaNotaCreditoSoliSessionBean detanotacreditosoliSessionBean;
	
	
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
	public TipoNotaCreditoSoliSessionBean tiponotacreditosoliSessionBean;
	public ResponsableSessionBean responsableSessionBean;
	public EstadoNotaCreditoSessionBean estadonotacreditosoliSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public TransporteSessionBean transporteSessionBean;
	public TransportistaSessionBean transportistaSessionBean;	
	
	public NotaCreditoSoliLogic notacreditosoliLogic;
	
	public JScrollPane jScrollPanelDatosNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosEdicionNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosGeneralNotaCreditoSoli;
	
	protected JPanel jPanelCamposNotaCreditoSoli;    
	protected JPanel jPanelCamposOcultosNotaCreditoSoli;    	
	protected JPanel jPanelAccionesNotaCreditoSoli;
	protected JPanel jPanelAccionesFormularioNotaCreditoSoli;
    
	
	
	protected Integer iXPanelCamposNotaCreditoSoli=0;
	protected Integer iYPanelCamposNotaCreditoSoli=0;
	
	protected Integer iXPanelCamposOcultosNotaCreditoSoli=0;
	protected Integer iYPanelCamposOcultosNotaCreditoSoli=0;
	
	

	protected JPanel jPanelCamposFintotalNotaCreditoSoli;
	protected Integer iXPanelCamposFintotalNotaCreditoSoli=0;
	protected Integer iYPanelCamposFintotalNotaCreditoSoli=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNotaCreditoSoli;
	public JButton jButtonModificarNotaCreditoSoli;
	public JButton jButtonActualizarNotaCreditoSoli;
    public JButton jButtonEliminarNotaCreditoSoli;
	public JButton jButtonCancelarNotaCreditoSoli;
    public JButton jButtonGuardarCambiosNotaCreditoSoli;
	public JButton jButtonGuardarCambiosTablaNotaCreditoSoli;
	protected JButton jButtonCerrarNotaCreditoSoli;
	
	
	protected JButton jButtonProcesarInformacionNotaCreditoSoli;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNotaCreditoSoli;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNotaCreditoSoli;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNotaCreditoSoli;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNotaCreditoSoli;
	protected JButton jButtonModificarToolBarNotaCreditoSoli;
	protected JButton jButtonActualizarToolBarNotaCreditoSoli;
    protected JButton jButtonEliminarToolBarNotaCreditoSoli;
	protected JButton jButtonCancelarToolBarNotaCreditoSoli;
    protected JButton jButtonGuardarCambiosToolBarNotaCreditoSoli;
	protected JButton jButtonGuardarCambiosTablaToolBarNotaCreditoSoli;
	protected JButton jButtonMostrarOcultarTablaToolBarNotaCreditoSoli;
	protected JButton jButtonCerrarToolBarNotaCreditoSoli;
	
	protected JButton jButtonProcesarInformacionToolBarNotaCreditoSoli;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNotaCreditoSoli;
	protected JMenuItem jMenuItemModificarNotaCreditoSoli;
	protected JMenuItem jMenuItemActualizarNotaCreditoSoli;
    protected JMenuItem jMenuItemEliminarNotaCreditoSoli;
	protected JMenuItem jMenuItemCancelarNotaCreditoSoli;
    protected JMenuItem jMenuItemGuardarCambiosNotaCreditoSoli;
	protected JMenuItem jMenuItemGuardarCambiosTablaNotaCreditoSoli;
	protected JMenuItem jMenuItemCerrarNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleCerrarNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleMostarOcultarNotaCreditoSoli;
	
	protected JMenuItem jMenuItemProcesarInformacionNotaCreditoSoli;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNotaCreditoSoli;
	protected JMenuItem jMenuItemMostrarOcultarNotaCreditoSoli;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNotaCreditoSoli;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNotaCreditoSoli;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNotaCreditoSoli;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNotaCreditoSoli;
	public JLabel jLabelIdNotaCreditoSoli;
	public JLabel jLabelidNotaCreditoSoli;
	public JButton jButtonidNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelcodigoNotaCreditoSoli;
	public JLabel jLabelcodigoNotaCreditoSoli;
	public JTextField jTextFieldcodigoNotaCreditoSoli;
	public JButton jButtoncodigoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelnumeroNotaCreditoSoli;
	public JLabel jLabelnumeroNotaCreditoSoli;
	public JTextField jTextFieldnumeroNotaCreditoSoli;
	public JButton jButtonnumeroNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionNotaCreditoSoli;
	public JLabel jLabelfecha_emisionNotaCreditoSoli;
	//public JFormattedTextField jDateChooserfecha_emisionNotaCreditoSoli;

	public JDateChooser jDateChooserfecha_emisionNotaCreditoSoli;
	public JButton jButtonfecha_emisionNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelnumero_diasNotaCreditoSoli;
	public JLabel jLabelnumero_diasNotaCreditoSoli;
	public JTextField jTextFieldnumero_diasNotaCreditoSoli;
	public JButton jButtonnumero_diasNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoNotaCreditoSoli;
	public JLabel jLabelfecha_vencimientoNotaCreditoSoli;
	//public JFormattedTextField jDateChooserfecha_vencimientoNotaCreditoSoli;

	public JDateChooser jDateChooserfecha_vencimientoNotaCreditoSoli;
	public JButton jButtonfecha_vencimientoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionNotaCreditoSoli;
	public JLabel jLabelcotizacionNotaCreditoSoli;
	public JTextField jTextFieldcotizacionNotaCreditoSoli;
	public JButton jButtoncotizacionNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneldireccionNotaCreditoSoli;
	public JLabel jLabeldireccionNotaCreditoSoli;
	public JTextArea jTextAreadireccionNotaCreditoSoli;
	public JScrollPane jscrollPanedireccionNotaCreditoSoli;
	public JButton jButtondireccionNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneltelefonoNotaCreditoSoli;
	public JLabel jLabeltelefonoNotaCreditoSoli;
	public JTextField jTextFieldtelefonoNotaCreditoSoli;
	public JButton jButtontelefonoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelrucNotaCreditoSoli;
	public JLabel jLabelrucNotaCreditoSoli;
	public JTextField jTextFieldrucNotaCreditoSoli;
	public JButton jButtonrucNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionNotaCreditoSoli;
	public JLabel jLabeldescripcionNotaCreditoSoli;
	public JTextArea jTextAreadescripcionNotaCreditoSoli;
	public JScrollPane jscrollPanedescripcionNotaCreditoSoli;
	public JButton jButtondescripcionNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelpenalizadoNotaCreditoSoli;
	public JLabel jLabelpenalizadoNotaCreditoSoli;
	public JCheckBox jCheckBoxpenalizadoNotaCreditoSoli;
	public JButton jButtonpenalizadoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_porcentajeNotaCreditoSoli;
	public JLabel jLabeldescuento_porcentajeNotaCreditoSoli;
	public JTextField jTextFielddescuento_porcentajeNotaCreditoSoli;
	public JButton jButtondescuento_porcentajeNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaNotaCreditoSoli;
	public JLabel jLabeltotal_ivaNotaCreditoSoli;
	public JTextField jTextFieldtotal_ivaNotaCreditoSoli;
	public JButton jButtontotal_ivaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelsumanNotaCreditoSoli;
	public JLabel jLabelsumanNotaCreditoSoli;
	public JTextField jTextFieldsumanNotaCreditoSoli;
	public JButton jButtonsumanNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorNotaCreditoSoli;
	public JLabel jLabeldescuento_valorNotaCreditoSoli;
	public JTextField jTextFielddescuento_valorNotaCreditoSoli;
	public JButton jButtondescuento_valorNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaNotaCreditoSoli;
	public JLabel jLabeltotal_sin_ivaNotaCreditoSoli;
	public JTextField jTextFieldtotal_sin_ivaNotaCreditoSoli;
	public JButton jButtontotal_sin_ivaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_generalNotaCreditoSoli;
	public JLabel jLabeldescuento_generalNotaCreditoSoli;
	public JTextField jTextFielddescuento_generalNotaCreditoSoli;
	public JButton jButtondescuento_generalNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelfleteNotaCreditoSoli;
	public JLabel jLabelfleteNotaCreditoSoli;
	public JTextField jTextFieldfleteNotaCreditoSoli;
	public JButton jButtonfleteNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneltotalNotaCreditoSoli;
	public JLabel jLabeltotalNotaCreditoSoli;
	public JTextField jTextFieldtotalNotaCreditoSoli;
	public JButton jButtontotalNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalNotaCreditoSoli;
	public JLabel jLabelsub_totalNotaCreditoSoli;
	public JTextField jTextFieldsub_totalNotaCreditoSoli;
	public JButton jButtonsub_totalNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelotroNotaCreditoSoli;
	public JLabel jLabelotroNotaCreditoSoli;
	public JTextField jTextFieldotroNotaCreditoSoli;
	public JButton jButtonotroNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelivaNotaCreditoSoli;
	public JLabel jLabelivaNotaCreditoSoli;
	public JTextField jTextFieldivaNotaCreditoSoli;
	public JButton jButtonivaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoNotaCreditoSoli;
	public JLabel jLabelfinanciamientoNotaCreditoSoli;
	public JTextField jTextFieldfinanciamientoNotaCreditoSoli;
	public JButton jButtonfinanciamientoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelotro_valorNotaCreditoSoli;
	public JLabel jLabelotro_valorNotaCreditoSoli;
	public JTextField jTextFieldotro_valorNotaCreditoSoli;
	public JButton jButtonotro_valorNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelretencionNotaCreditoSoli;
	public JLabel jLabelretencionNotaCreditoSoli;
	public JTextField jTextFieldretencionNotaCreditoSoli;
	public JButton jButtonretencionNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneliceNotaCreditoSoli;
	public JLabel jLabeliceNotaCreditoSoli;
	public JTextField jTextFieldiceNotaCreditoSoli;
	public JButton jButtoniceNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelfechaNotaCreditoSoli;
	public JLabel jLabelfechaNotaCreditoSoli;
	//public JFormattedTextField jDateChooserfechaNotaCreditoSoli;

	public JDateChooser jDateChooserfechaNotaCreditoSoli;
	public JButton jButtonfechaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelfecha_clienteNotaCreditoSoli;
	public JLabel jLabelfecha_clienteNotaCreditoSoli;
	//public JFormattedTextField jDateChooserfecha_clienteNotaCreditoSoli;

	public JDateChooser jDateChooserfecha_clienteNotaCreditoSoli;
	public JButton jButtonfecha_clienteNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelfecha_autorizacionNotaCreditoSoli;
	public JLabel jLabelfecha_autorizacionNotaCreditoSoli;
	//public JFormattedTextField jDateChooserfecha_autorizacionNotaCreditoSoli;

	public JDateChooser jDateChooserfecha_autorizacionNotaCreditoSoli;
	public JButton jButtonfecha_autorizacionNotaCreditoSoliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNotaCreditoSoli;
	public JLabel jLabelid_empresaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNotaCreditoSoli;
	public JButton jButtonid_empresaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_empresaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_empresaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalNotaCreditoSoli;
	public JLabel jLabelid_sucursalNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalNotaCreditoSoli;
	public JButton jButtonid_sucursalNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_sucursalNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_sucursalNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioNotaCreditoSoli;
	public JLabel jLabelid_ejercicioNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioNotaCreditoSoli;
	public JButton jButtonid_ejercicioNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_ejercicioNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoNotaCreditoSoli;
	public JLabel jLabelid_periodoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoNotaCreditoSoli;
	public JButton jButtonid_periodoNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_periodoNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_periodoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_anioNotaCreditoSoli;
	public JLabel jLabelid_anioNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioNotaCreditoSoli;
	public JButton jButtonid_anioNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_anioNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_anioNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_mesNotaCreditoSoli;
	public JLabel jLabelid_mesNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesNotaCreditoSoli;
	public JButton jButtonid_mesNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_mesNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_mesNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioNotaCreditoSoli;
	public JLabel jLabelid_usuarioNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioNotaCreditoSoli;
	public JButton jButtonid_usuarioNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_usuarioNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_usuarioNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaNotaCreditoSoli;
	public JLabel jLabelid_monedaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaNotaCreditoSoli;
	public JButton jButtonid_monedaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_monedaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_monedaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoNotaCreditoSoli;
	public JLabel jLabelid_empleadoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoNotaCreditoSoli;
	public JButton jButtonid_empleadoNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_empleadoNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_empleadoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoNotaCreditoSoli;
	public JLabel jLabelid_formatoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoNotaCreditoSoli;
	public JButton jButtonid_formatoNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_formatoNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_formatoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioNotaCreditoSoli;
	public JLabel jLabelid_tipo_precioNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioNotaCreditoSoli;
	public JButton jButtonid_tipo_precioNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_tipo_precioNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteNotaCreditoSoli;
	public JLabel jLabelid_clienteNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteNotaCreditoSoli;
	public JButton jButtonid_clienteNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_clienteNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_clienteNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaNotaCreditoSoli;
	public JLabel jLabelid_facturaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaNotaCreditoSoli;
	public JButton jButtonid_facturaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_facturaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_facturaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_nota_credito_soliNotaCreditoSoli;
	public JLabel jLabelid_tipo_nota_credito_soliNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli;
	public JButton jButtonid_tipo_nota_credito_soliNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_tipo_nota_credito_soliNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_responsableNotaCreditoSoli;
	public JLabel jLabelid_responsableNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsableNotaCreditoSoli;
	public JButton jButtonid_responsableNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_responsableNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_responsableNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_nota_creditoNotaCreditoSoli;
	public JLabel jLabelid_estado_nota_creditoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_nota_creditoNotaCreditoSoli;
	public JButton jButtonid_estado_nota_creditoNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_estado_nota_creditoNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoNotaCreditoSoli;
	public JLabel jLabelid_centro_costoNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoNotaCreditoSoli;
	public JButton jButtonid_centro_costoNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_centro_costoNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoNotaCreditoSoliBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoNotaCreditoSoliArbol= new JButtonMe();

	public JPanel jPanelid_vendedorNotaCreditoSoli;
	public JLabel jLabelid_vendedorNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorNotaCreditoSoli;
	public JButton jButtonid_vendedorNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_vendedorNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_vendedorNotaCreditoSoliBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorNotaCreditoSoliArbol= new JButtonMe();

	public JPanel jPanelid_tipo_cambioNotaCreditoSoli;
	public JLabel jLabelid_tipo_cambioNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioNotaCreditoSoli;
	public JButton jButtonid_tipo_cambioNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_tipo_cambioNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_transporteNotaCreditoSoli;
	public JLabel jLabelid_transporteNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transporteNotaCreditoSoli;
	public JButton jButtonid_transporteNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_transporteNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_transporteNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaNotaCreditoSoli;
	public JLabel jLabelid_transportistaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaNotaCreditoSoli;
	public JButton jButtonid_transportistaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_transportistaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_transportistaNotaCreditoSoliBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNotaCreditoSoli;
	
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
	public int iHeightFormulario=616;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NotaCreditoSoliDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNotaCreditoSoli=new JPanel();
				this.jPanelAccionesFormularioNotaCreditoSoli=new JPanel();
				this.jmenuBarDetalleNotaCreditoSoli=new JMenuBar();
				this.jTtoolBarDetalleNotaCreditoSoli=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoSoliDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NotaCreditoSoliDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoSoliDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoSoliDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoSoliDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNotaCreditoSoli() {
		return this.jButtonActualizarToolBarNotaCreditoSoli;
	}
	
	public JButton getjButtonEliminarToolBarNotaCreditoSoli() {
		return this.jButtonEliminarToolBarNotaCreditoSoli;
	}
	
	public JButton getjButtonCancelarToolBarNotaCreditoSoli() {
		return this.jButtonCancelarToolBarNotaCreditoSoli;
	}		
	
	public JButton getjButtonProcesarInformacionNotaCreditoSoli() {
		return this.jButtonProcesarInformacionNotaCreditoSoli;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNotaCreditoSoli)	{
		this.jButtonProcesarInformacionNotaCreditoSoli = jButtonProcesarInformacionNotaCreditoSoli;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNotaCreditoSoli() {
		return this.jComboBoxTiposAccionesNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNotaCreditoSoli(
			JComboBox jComboBoxTiposRelacionesNotaCreditoSoli) {
		this.jComboBoxTiposRelacionesNotaCreditoSoli = jComboBoxTiposRelacionesNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNotaCreditoSoli(
			JComboBox jComboBoxTiposAccionesNotaCreditoSoli) {
		this.jComboBoxTiposAccionesNotaCreditoSoli = jComboBoxTiposAccionesNotaCreditoSoli;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNotaCreditoSoli() {
		return this.jComboBoxTiposAccionesFormularioNotaCreditoSoli;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNotaCreditoSoli(
			JComboBox jComboBoxTiposAccionesFormularioNotaCreditoSoli) {
		this.jComboBoxTiposAccionesFormularioNotaCreditoSoli = jComboBoxTiposAccionesFormularioNotaCreditoSoli;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
		
		this.notacreditosoliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.notacreditosoliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.notacreditosoliSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detanotacreditosoliSessionBean=new DetaNotaCreditoSoliSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NotaCreditoSoliJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Solicitud Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 3550) {
			iWidth=3550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
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
	
		NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNotaCreditoSoli= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNotaCreditoSoli=new JButtonMe();
				this.jButtonModificarToolBarNotaCreditoSoli=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNotaCreditoSoli,this.jTtoolBarDetalleNotaCreditoSoli,
							"actualizar","actualizar","Actualizar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNotaCreditoSoli,this.jTtoolBarDetalleNotaCreditoSoli,
							"eliminar","eliminar","Eliminar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNotaCreditoSoli,this.jTtoolBarDetalleNotaCreditoSoli,
							"cancelar","cancelar","Cancelar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNotaCreditoSoli,this.jTtoolBarDetalleNotaCreditoSoli,
							"guardarcambios","guardarcambios","Guardar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNotaCreditoSoli=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNotaCreditoSoli=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNotaCreditoSoli=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNotaCreditoSoli=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNotaCreditoSoli=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNotaCreditoSoli= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNotaCreditoSoli.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNotaCreditoSoli,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNotaCreditoSoli= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNotaCreditoSoli.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNotaCreditoSoli,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNotaCreditoSoli= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNotaCreditoSoli.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNotaCreditoSoli,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNotaCreditoSoli= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNotaCreditoSoli.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNotaCreditoSoli,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNotaCreditoSoli= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNotaCreditoSoli.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNotaCreditoSoli,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNotaCreditoSoli= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNotaCreditoSoli.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNotaCreditoSoli,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNotaCreditoSoli= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNotaCreditoSoli.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNotaCreditoSoli,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNotaCreditoSoli= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNotaCreditoSoli.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNotaCreditoSoli,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNotaCreditoSoli.add(this.jMenuItemDetalleCerrarNotaCreditoSoli);
		
		this.jmenuDetalleAccionesNotaCreditoSoli.add(this.jMenuItemActualizarNotaCreditoSoli);
		this.jmenuDetalleAccionesNotaCreditoSoli.add(this.jMenuItemEliminarNotaCreditoSoli);
		this.jmenuDetalleAccionesNotaCreditoSoli.add(this.jMenuItemCancelarNotaCreditoSoli);		
		
		//this.jmenuDetalleDatosNotaCreditoSoli.add(this.jMenuItemDetalleAbrirOrderByNotaCreditoSoli);				
		this.jmenuDetalleDatosNotaCreditoSoli.add(this.jMenuItemDetalleMostarOcultarNotaCreditoSoli);				
				
		//this.jmenuDetalleAccionesNotaCreditoSoli.add(this.jMenuItemGuardarCambiosNotaCreditoSoli);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNotaCreditoSoli.add(this.jmenuDetalleArchivoNotaCreditoSoli);		
		this.jmenuBarDetalleNotaCreditoSoli.add(this.jmenuDetalleAccionesNotaCreditoSoli);		
		this.jmenuBarDetalleNotaCreditoSoli.add(this.jmenuDetalleDatosNotaCreditoSoli);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleNotaCreditoSoli.add(this.jmenuDetalleNotaCreditoSoli);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposNotaCreditoSoli() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNotaCreditoSoli = new JLabelMe();
		jLabelIdNotaCreditoSoli.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNotaCreditoSoli = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNotaCreditoSoli= new GridBagLayout();

		this.jPanelidNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);

		jLabelidNotaCreditoSoli = new JLabel();
		jLabelidNotaCreditoSoli.setText("Id");

		jLabelidNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoNotaCreditoSoli = new JLabelMe();
		this.jLabelcodigoNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoNotaCreditoSoli.setToolTipText("Numero");
		this.jLabelcodigoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelcodigoNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldcodigoNotaCreditoSoli= new JTextFieldMe();

		jTextFieldcodigoNotaCreditoSoli.setEnabled(false);
		jTextFieldcodigoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtoncodigoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoNotaCreditoSoliBusqueda.setText("U");
		this.jButtoncodigoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelnumeroNotaCreditoSoli = new JLabelMe();
		this.jLabelnumeroNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumeroNotaCreditoSoli.setToolTipText("Nro Preimpreso");
		this.jLabelnumeroNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelnumeroNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldnumeroNotaCreditoSoli= new JTextFieldMe();

		jTextFieldnumeroNotaCreditoSoli.setEnabled(false);
		jTextFieldnumeroNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonnumeroNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroNotaCreditoSoliBusqueda.setText("U");
		this.jButtonnumeroNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionNotaCreditoSoli = new JLabelMe();
		this.jLabelfecha_emisionNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionNotaCreditoSoli.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelfecha_emisionNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		//jFormattedTextFieldfecha_emisionNotaCreditoSoli= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionNotaCreditoSoli= new JDateChooser();
		jDateChooserfecha_emisionNotaCreditoSoli.setEnabled(false);
		jDateChooserfecha_emisionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionNotaCreditoSoli.setDate(new Date());
		jDateChooserfecha_emisionNotaCreditoSoli.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionNotaCreditoSoli.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonfecha_emisionNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionNotaCreditoSoliBusqueda.setText("U");
		this.jButtonfecha_emisionNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelnumero_diasNotaCreditoSoli = new JLabelMe();
		this.jLabelnumero_diasNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_NUMERODIAS+" : *");
		this.jLabelnumero_diasNotaCreditoSoli.setToolTipText("Dias");
		this.jLabelnumero_diasNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_diasNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_diasNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_diasNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_diasNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_NUMERODIAS);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelnumero_diasNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldnumero_diasNotaCreditoSoli= new JTextFieldMe();
		jTextFieldnumero_diasNotaCreditoSoli.setEnabled(false);
		jTextFieldnumero_diasNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_diasNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_diasNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_diasNotaCreditoSoli.setText("0");

		this.jButtonnumero_diasNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonnumero_diasNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_diasNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_diasNotaCreditoSoliBusqueda.setText("U");
		this.jButtonnumero_diasNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_diasNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_diasNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_diasNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_diasNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_diasNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_diasNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoNotaCreditoSoli = new JLabelMe();
		this.jLabelfecha_vencimientoNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoNotaCreditoSoli.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelfecha_vencimientoNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		//jFormattedTextFieldfecha_vencimientoNotaCreditoSoli= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoNotaCreditoSoli= new JDateChooser();
		jDateChooserfecha_vencimientoNotaCreditoSoli.setEnabled(false);
		jDateChooserfecha_vencimientoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoNotaCreditoSoli.setDate(new Date());
		jDateChooserfecha_vencimientoNotaCreditoSoli.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoNotaCreditoSoli.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoNotaCreditoSoliBusqueda.setText("U");
		this.jButtonfecha_vencimientoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionNotaCreditoSoli = new JLabelMe();
		this.jLabelcotizacionNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionNotaCreditoSoli.setToolTipText("Cotizacion");
		this.jLabelcotizacionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelcotizacionNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldcotizacionNotaCreditoSoli= new JTextFieldMe();
		jTextFieldcotizacionNotaCreditoSoli.setEnabled(false);
		jTextFieldcotizacionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionNotaCreditoSoli.setText("0.0");

		this.jButtoncotizacionNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtoncotizacionNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionNotaCreditoSoliBusqueda.setText("U");
		this.jButtoncotizacionNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeldireccionNotaCreditoSoli = new JLabelMe();
		this.jLabeldireccionNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_DIRECCION+" :");
		this.jLabeldireccionNotaCreditoSoli.setToolTipText("Direccion");
		this.jLabeldireccionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldireccionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccionNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccionNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_DIRECCION);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPaneldireccionNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextAreadireccionNotaCreditoSoli= new JTextAreaMe();
		jTextAreadireccionNotaCreditoSoli.setEnabled(false);
		jTextAreadireccionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccionNotaCreditoSoli.setLineWrap(true);
		jTextAreadireccionNotaCreditoSoli.setWrapStyleWord(true);
		jTextAreadireccionNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccionNotaCreditoSoli.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccionNotaCreditoSoli = new JScrollPane(jTextAreadireccionNotaCreditoSoli);
		jscrollPanedireccionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccionNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtondireccionNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccionNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccionNotaCreditoSoliBusqueda.setText("U");
		this.jButtondireccionNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccionNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccionNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccionNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccionNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccionNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccionNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeltelefonoNotaCreditoSoli = new JLabelMe();
		this.jLabeltelefonoNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_TELEFONO+" :");
		this.jLabeltelefonoNotaCreditoSoli.setToolTipText("Telefono");
		this.jLabeltelefonoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltelefonoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefonoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefonoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefonoNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_TELEFONO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPaneltelefonoNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldtelefonoNotaCreditoSoli= new JTextFieldMe();

		jTextFieldtelefonoNotaCreditoSoli.setEnabled(false);
		jTextFieldtelefonoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtelefonoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtelefonoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontelefonoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtontelefonoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefonoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefonoNotaCreditoSoliBusqueda.setText("U");
		this.jButtontelefonoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefonoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefonoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtelefonoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtelefonoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefonoNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefonoNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelrucNotaCreditoSoli = new JLabelMe();
		this.jLabelrucNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucNotaCreditoSoli.setToolTipText("Ruc");
		this.jLabelrucNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelrucNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldrucNotaCreditoSoli= new JTextFieldMe();

		jTextFieldrucNotaCreditoSoli.setEnabled(false);
		jTextFieldrucNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonrucNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucNotaCreditoSoliBusqueda.setText("U");
		this.jButtonrucNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionNotaCreditoSoli = new JLabelMe();
		this.jLabeldescripcionNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionNotaCreditoSoli.setToolTipText("Descripcion");
		this.jLabeldescripcionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPaneldescripcionNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextAreadescripcionNotaCreditoSoli= new JTextAreaMe();
		jTextAreadescripcionNotaCreditoSoli.setEnabled(false);
		jTextAreadescripcionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionNotaCreditoSoli.setLineWrap(true);
		jTextAreadescripcionNotaCreditoSoli.setWrapStyleWord(true);
		jTextAreadescripcionNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionNotaCreditoSoli.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionNotaCreditoSoli = new JScrollPane(jTextAreadescripcionNotaCreditoSoli);
		jscrollPanedescripcionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtondescripcionNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionNotaCreditoSoliBusqueda.setText("U");
		this.jButtondescripcionNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelpenalizadoNotaCreditoSoli = new JLabelMe();
		this.jLabelpenalizadoNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_PENALIZADO+" : *");
		this.jLabelpenalizadoNotaCreditoSoli.setToolTipText("Penalizado");
		this.jLabelpenalizadoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpenalizadoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpenalizadoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpenalizadoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpenalizadoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpenalizadoNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_PENALIZADO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelpenalizadoNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jCheckBoxpenalizadoNotaCreditoSoli= new JCheckBoxMe();
		jCheckBoxpenalizadoNotaCreditoSoli.setEnabled(false);

		jCheckBoxpenalizadoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpenalizadoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxpenalizadoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxpenalizadoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonpenalizadoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonpenalizadoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpenalizadoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpenalizadoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpenalizadoNotaCreditoSoliBusqueda.setText("U");
		this.jButtonpenalizadoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpenalizadoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpenalizadoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxpenalizadoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxpenalizadoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"penalizadoNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpenalizadoNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_porcentajeNotaCreditoSoli = new JLabelMe();
		this.jLabeldescuento_porcentajeNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_DESCUENTOPORCENTAJE+" : *");
		this.jLabeldescuento_porcentajeNotaCreditoSoli.setToolTipText("Dscto %");
		this.jLabeldescuento_porcentajeNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_porcentajeNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_porcentajeNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_porcentajeNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_porcentajeNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_DESCUENTOPORCENTAJE);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPaneldescuento_porcentajeNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFielddescuento_porcentajeNotaCreditoSoli= new JTextFieldMe();
		jTextFielddescuento_porcentajeNotaCreditoSoli.setEnabled(false);
		jTextFielddescuento_porcentajeNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_porcentajeNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_porcentajeNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_porcentajeNotaCreditoSoli.setText("0.0");

		this.jButtondescuento_porcentajeNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtondescuento_porcentajeNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_porcentajeNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_porcentajeNotaCreditoSoliBusqueda.setText("U");
		this.jButtondescuento_porcentajeNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_porcentajeNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_porcentajeNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_porcentajeNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_porcentajeNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_porcentajeNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_porcentajeNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaNotaCreditoSoli = new JLabelMe();
		this.jLabeltotal_ivaNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaNotaCreditoSoli.setToolTipText("Monto Con Iva");
		this.jLabeltotal_ivaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPaneltotal_ivaNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldtotal_ivaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldtotal_ivaNotaCreditoSoli.setEnabled(false);
		jTextFieldtotal_ivaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaNotaCreditoSoli.setText("0.0");

		this.jButtontotal_ivaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtontotal_ivaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaNotaCreditoSoliBusqueda.setText("U");
		this.jButtontotal_ivaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelsumanNotaCreditoSoli = new JLabelMe();
		this.jLabelsumanNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanNotaCreditoSoli.setToolTipText("Suman");
		this.jLabelsumanNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelsumanNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldsumanNotaCreditoSoli= new JTextFieldMe();
		jTextFieldsumanNotaCreditoSoli.setEnabled(false);
		jTextFieldsumanNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanNotaCreditoSoli.setText("0.0");

		this.jButtonsumanNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonsumanNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanNotaCreditoSoliBusqueda.setText("U");
		this.jButtonsumanNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorNotaCreditoSoli = new JLabelMe();
		this.jLabeldescuento_valorNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorNotaCreditoSoli.setToolTipText("Dsto Valor");
		this.jLabeldescuento_valorNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento_valorNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPaneldescuento_valorNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFielddescuento_valorNotaCreditoSoli= new JTextFieldMe();
		jTextFielddescuento_valorNotaCreditoSoli.setEnabled(false);
		jTextFielddescuento_valorNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorNotaCreditoSoli.setText("0.0");

		this.jButtondescuento_valorNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtondescuento_valorNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorNotaCreditoSoliBusqueda.setText("U");
		this.jButtondescuento_valorNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaNotaCreditoSoli = new JLabelMe();
		this.jLabeltotal_sin_ivaNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaNotaCreditoSoli.setToolTipText("Monto Sin Iva");
		this.jLabeltotal_sin_ivaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPaneltotal_sin_ivaNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldtotal_sin_ivaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldtotal_sin_ivaNotaCreditoSoli.setEnabled(false);
		jTextFieldtotal_sin_ivaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaNotaCreditoSoli.setText("0.0");

		this.jButtontotal_sin_ivaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaNotaCreditoSoliBusqueda.setText("U");
		this.jButtontotal_sin_ivaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_generalNotaCreditoSoli = new JLabelMe();
		this.jLabeldescuento_generalNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_DESCUENTOGENERAL+" : *");
		this.jLabeldescuento_generalNotaCreditoSoli.setToolTipText("Total Dscto General");
		this.jLabeldescuento_generalNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_generalNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_generalNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_generalNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_generalNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_generalNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_DESCUENTOGENERAL);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPaneldescuento_generalNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFielddescuento_generalNotaCreditoSoli= new JTextFieldMe();
		jTextFielddescuento_generalNotaCreditoSoli.setEnabled(false);
		jTextFielddescuento_generalNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_generalNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_generalNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_generalNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_generalNotaCreditoSoli.setText("0.0");

		this.jButtondescuento_generalNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtondescuento_generalNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_generalNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_generalNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_generalNotaCreditoSoliBusqueda.setText("U");
		this.jButtondescuento_generalNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_generalNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_generalNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_generalNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_generalNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_generalNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_generalNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelfleteNotaCreditoSoli = new JLabelMe();
		this.jLabelfleteNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteNotaCreditoSoli.setToolTipText("Flete");
		this.jLabelfleteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelfleteNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldfleteNotaCreditoSoli= new JTextFieldMe();
		jTextFieldfleteNotaCreditoSoli.setEnabled(false);
		jTextFieldfleteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteNotaCreditoSoli.setText("0.0");

		this.jButtonfleteNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonfleteNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteNotaCreditoSoliBusqueda.setText("U");
		this.jButtonfleteNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeltotalNotaCreditoSoli = new JLabelMe();
		this.jLabeltotalNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalNotaCreditoSoli.setToolTipText("Total");
		this.jLabeltotalNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPaneltotalNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldtotalNotaCreditoSoli= new JTextFieldMe();
		jTextFieldtotalNotaCreditoSoli.setEnabled(false);
		jTextFieldtotalNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalNotaCreditoSoli.setText("0.0");

		this.jButtontotalNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtontotalNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalNotaCreditoSoliBusqueda.setText("U");
		this.jButtontotalNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalNotaCreditoSoli = new JLabelMe();
		this.jLabelsub_totalNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalNotaCreditoSoli.setToolTipText("Sub Total");
		this.jLabelsub_totalNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelsub_totalNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldsub_totalNotaCreditoSoli= new JTextFieldMe();
		jTextFieldsub_totalNotaCreditoSoli.setEnabled(false);
		jTextFieldsub_totalNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalNotaCreditoSoli.setText("0.0");

		this.jButtonsub_totalNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonsub_totalNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalNotaCreditoSoliBusqueda.setText("U");
		this.jButtonsub_totalNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelotroNotaCreditoSoli = new JLabelMe();
		this.jLabelotroNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_OTRO+" : *");
		this.jLabelotroNotaCreditoSoli.setToolTipText("Otro");
		this.jLabelotroNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotroNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotroNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotroNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotroNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_OTRO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelotroNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldotroNotaCreditoSoli= new JTextFieldMe();
		jTextFieldotroNotaCreditoSoli.setEnabled(false);
		jTextFieldotroNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotroNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotroNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotroNotaCreditoSoli.setText("0.0");

		this.jButtonotroNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonotroNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotroNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotroNotaCreditoSoliBusqueda.setText("U");
		this.jButtonotroNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotroNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotroNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotroNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotroNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otroNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotroNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelivaNotaCreditoSoli = new JLabelMe();
		this.jLabelivaNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaNotaCreditoSoli.setToolTipText("Iva");
		this.jLabelivaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelivaNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldivaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldivaNotaCreditoSoli.setEnabled(false);
		jTextFieldivaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaNotaCreditoSoli.setText("0.0");

		this.jButtonivaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonivaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonivaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoNotaCreditoSoli = new JLabelMe();
		this.jLabelfinanciamientoNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoNotaCreditoSoli.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelfinanciamientoNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldfinanciamientoNotaCreditoSoli= new JTextFieldMe();
		jTextFieldfinanciamientoNotaCreditoSoli.setEnabled(false);
		jTextFieldfinanciamientoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoNotaCreditoSoli.setText("0.0");

		this.jButtonfinanciamientoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonfinanciamientoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoNotaCreditoSoliBusqueda.setText("U");
		this.jButtonfinanciamientoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelotro_valorNotaCreditoSoli = new JLabelMe();
		this.jLabelotro_valorNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_OTROVALOR+" : *");
		this.jLabelotro_valorNotaCreditoSoli.setToolTipText("Otro Valor");
		this.jLabelotro_valorNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotro_valorNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotro_valorNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotro_valorNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotro_valorNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotro_valorNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_OTROVALOR);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelotro_valorNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldotro_valorNotaCreditoSoli= new JTextFieldMe();
		jTextFieldotro_valorNotaCreditoSoli.setEnabled(false);
		jTextFieldotro_valorNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotro_valorNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotro_valorNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotro_valorNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotro_valorNotaCreditoSoli.setText("0.0");

		this.jButtonotro_valorNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonotro_valorNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotro_valorNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotro_valorNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotro_valorNotaCreditoSoliBusqueda.setText("U");
		this.jButtonotro_valorNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotro_valorNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotro_valorNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotro_valorNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotro_valorNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otro_valorNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotro_valorNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelretencionNotaCreditoSoli = new JLabelMe();
		this.jLabelretencionNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_RETENCION+" : *");
		this.jLabelretencionNotaCreditoSoli.setToolTipText("Retencion");
		this.jLabelretencionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencionNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencionNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_RETENCION);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelretencionNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldretencionNotaCreditoSoli= new JTextFieldMe();
		jTextFieldretencionNotaCreditoSoli.setEnabled(false);
		jTextFieldretencionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencionNotaCreditoSoli.setText("0.0");

		this.jButtonretencionNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonretencionNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencionNotaCreditoSoliBusqueda.setText("U");
		this.jButtonretencionNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencionNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencionNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencionNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencionNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencionNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencionNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeliceNotaCreditoSoli = new JLabelMe();
		this.jLabeliceNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceNotaCreditoSoli.setToolTipText("Ice");
		this.jLabeliceNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPaneliceNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jTextFieldiceNotaCreditoSoli= new JTextFieldMe();
		jTextFieldiceNotaCreditoSoli.setEnabled(false);
		jTextFieldiceNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceNotaCreditoSoli.setText("0.0");

		this.jButtoniceNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtoniceNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceNotaCreditoSoliBusqueda.setText("U");
		this.jButtoniceNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelfechaNotaCreditoSoli = new JLabelMe();
		this.jLabelfechaNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaNotaCreditoSoli.setToolTipText("Fecha");
		this.jLabelfechaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelfechaNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		//jFormattedTextFieldfechaNotaCreditoSoli= new JFormattedTextFieldMe();

		jDateChooserfechaNotaCreditoSoli= new JDateChooser();
		jDateChooserfechaNotaCreditoSoli.setEnabled(false);
		jDateChooserfechaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaNotaCreditoSoli.setDate(new Date());
		jDateChooserfechaNotaCreditoSoli.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaNotaCreditoSoli.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonfechaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonfechaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelfecha_clienteNotaCreditoSoli = new JLabelMe();
		this.jLabelfecha_clienteNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_FECHACLIENTE+" : *");
		this.jLabelfecha_clienteNotaCreditoSoli.setToolTipText("Fecha Cliente");
		this.jLabelfecha_clienteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_clienteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_clienteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_clienteNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_clienteNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_clienteNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_FECHACLIENTE);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelfecha_clienteNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		//jFormattedTextFieldfecha_clienteNotaCreditoSoli= new JFormattedTextFieldMe();

		jDateChooserfecha_clienteNotaCreditoSoli= new JDateChooser();
		jDateChooserfecha_clienteNotaCreditoSoli.setEnabled(false);
		jDateChooserfecha_clienteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_clienteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_clienteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_clienteNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_clienteNotaCreditoSoli.setDate(new Date());
		jDateChooserfecha_clienteNotaCreditoSoli.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_clienteNotaCreditoSoli.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_clienteNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonfecha_clienteNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_clienteNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_clienteNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_clienteNotaCreditoSoliBusqueda.setText("U");
		this.jButtonfecha_clienteNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_clienteNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_clienteNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_clienteNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_clienteNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_clienteNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_clienteNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelfecha_autorizacionNotaCreditoSoli = new JLabelMe();
		this.jLabelfecha_autorizacionNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_FECHAAUTORIZACION+" : *");
		this.jLabelfecha_autorizacionNotaCreditoSoli.setToolTipText("Fecha Autorizacion");
		this.jLabelfecha_autorizacionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_autorizacionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_autorizacionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_autorizacionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_autorizacionNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_autorizacionNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_FECHAAUTORIZACION);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelfecha_autorizacionNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		//jFormattedTextFieldfecha_autorizacionNotaCreditoSoli= new JFormattedTextFieldMe();

		jDateChooserfecha_autorizacionNotaCreditoSoli= new JDateChooser();
		jDateChooserfecha_autorizacionNotaCreditoSoli.setEnabled(false);
		jDateChooserfecha_autorizacionNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizacionNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_autorizacionNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_autorizacionNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_autorizacionNotaCreditoSoli.setDate(new Date());
		jDateChooserfecha_autorizacionNotaCreditoSoli.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_autorizacionNotaCreditoSoli.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_autorizacionNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonfecha_autorizacionNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizacionNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_autorizacionNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_autorizacionNotaCreditoSoliBusqueda.setText("U");
		this.jButtonfecha_autorizacionNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_autorizacionNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_autorizacionNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_autorizacionNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_autorizacionNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_autorizacionNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_autorizacionNotaCreditoSoliBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNotaCreditoSoli() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_empresaNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNotaCreditoSoli.setToolTipText("Empresa");
		this.jLabelid_empresaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_empresaNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_empresaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_empresaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNotaCreditoSoli.setEnabled(false);

		this.jButtonid_empresaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_empresaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_empresaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotaCreditoSoli"));

		this.jButtonid_empresaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_empresaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_empresaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_empresaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_empresaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_empresaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotaCreditoSoliUpdate"));



					
		this.jLabelid_sucursalNotaCreditoSoli = new JLabelMe();
		this.jLabelid_sucursalNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalNotaCreditoSoli.setToolTipText("Sucursal");
		this.jLabelid_sucursalNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_sucursalNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_sucursalNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_sucursalNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalNotaCreditoSoli.setEnabled(false);

		this.jButtonid_sucursalNotaCreditoSoli= new JButtonMe();
		this.jButtonid_sucursalNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNotaCreditoSoli.setText("Buscar");
		this.jButtonid_sucursalNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNotaCreditoSoli"));

		this.jButtonid_sucursalNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_sucursalNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_sucursalNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_sucursalNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_sucursalNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_sucursalNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNotaCreditoSoliUpdate"));



					
		this.jLabelid_ejercicioNotaCreditoSoli = new JLabelMe();
		this.jLabelid_ejercicioNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioNotaCreditoSoli.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_ejercicioNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_ejercicioNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_ejercicioNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioNotaCreditoSoli.setEnabled(false);

		this.jButtonid_ejercicioNotaCreditoSoli= new JButtonMe();
		this.jButtonid_ejercicioNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioNotaCreditoSoli.setText("Buscar");
		this.jButtonid_ejercicioNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioNotaCreditoSoli"));

		this.jButtonid_ejercicioNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_ejercicioNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_ejercicioNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_ejercicioNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_ejercicioNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioNotaCreditoSoliUpdate"));



					
		this.jLabelid_periodoNotaCreditoSoli = new JLabelMe();
		this.jLabelid_periodoNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoNotaCreditoSoli.setToolTipText("Periodo");
		this.jLabelid_periodoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_periodoNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_periodoNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_periodoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoNotaCreditoSoli.setEnabled(false);

		this.jButtonid_periodoNotaCreditoSoli= new JButtonMe();
		this.jButtonid_periodoNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoNotaCreditoSoli.setText("Buscar");
		this.jButtonid_periodoNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoNotaCreditoSoli"));

		this.jButtonid_periodoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_periodoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_periodoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_periodoNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_periodoNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_periodoNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoNotaCreditoSoliUpdate"));



					
		this.jLabelid_anioNotaCreditoSoli = new JLabelMe();
		this.jLabelid_anioNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioNotaCreditoSoli.setToolTipText("Anio");
		this.jLabelid_anioNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_anioNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_anioNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_anioNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioNotaCreditoSoli.setEnabled(false);

		this.jButtonid_anioNotaCreditoSoli= new JButtonMe();
		this.jButtonid_anioNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioNotaCreditoSoli.setText("Buscar");
		this.jButtonid_anioNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioNotaCreditoSoli"));

		this.jButtonid_anioNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_anioNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_anioNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_anioNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_anioNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_anioNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioNotaCreditoSoliUpdate"));



					
		this.jLabelid_mesNotaCreditoSoli = new JLabelMe();
		this.jLabelid_mesNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesNotaCreditoSoli.setToolTipText("Mes");
		this.jLabelid_mesNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_mesNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_mesNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_mesNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesNotaCreditoSoli.setEnabled(false);

		this.jButtonid_mesNotaCreditoSoli= new JButtonMe();
		this.jButtonid_mesNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesNotaCreditoSoli.setText("Buscar");
		this.jButtonid_mesNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesNotaCreditoSoli"));

		this.jButtonid_mesNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_mesNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_mesNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_mesNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_mesNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_mesNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesNotaCreditoSoliUpdate"));



					
		this.jLabelid_usuarioNotaCreditoSoli = new JLabelMe();
		this.jLabelid_usuarioNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioNotaCreditoSoli.setToolTipText("Usuario");
		this.jLabelid_usuarioNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_usuarioNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_usuarioNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_usuarioNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioNotaCreditoSoli.setEnabled(false);

		this.jButtonid_usuarioNotaCreditoSoli= new JButtonMe();
		this.jButtonid_usuarioNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNotaCreditoSoli.setText("Buscar");
		this.jButtonid_usuarioNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNotaCreditoSoli"));

		this.jButtonid_usuarioNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_usuarioNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_usuarioNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_usuarioNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_usuarioNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_usuarioNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNotaCreditoSoliUpdate"));



					
		this.jLabelid_monedaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_monedaNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaNotaCreditoSoli.setToolTipText("Moneda");
		this.jLabelid_monedaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_monedaNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_monedaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_monedaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_monedaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_monedaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaNotaCreditoSoli"));

		this.jButtonid_monedaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_monedaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_monedaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_monedaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_monedaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_monedaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaNotaCreditoSoliUpdate"));



					
		this.jLabelid_empleadoNotaCreditoSoli = new JLabelMe();
		this.jLabelid_empleadoNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoNotaCreditoSoli.setToolTipText("Empleado");
		this.jLabelid_empleadoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_empleadoNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_empleadoNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_empleadoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoNotaCreditoSoli= new JButtonMe();
		this.jButtonid_empleadoNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoNotaCreditoSoli.setText("Buscar");
		this.jButtonid_empleadoNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNotaCreditoSoli"));

		this.jButtonid_empleadoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_empleadoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_empleadoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_empleadoNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_empleadoNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_empleadoNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoNotaCreditoSoliUpdate"));



					
		this.jLabelid_formatoNotaCreditoSoli = new JLabelMe();
		this.jLabelid_formatoNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDFORMATO+" :");
		this.jLabelid_formatoNotaCreditoSoli.setToolTipText("Formato");
		this.jLabelid_formatoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_formatoNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_formatoNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_formatoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoNotaCreditoSoli= new JButtonMe();
		this.jButtonid_formatoNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoNotaCreditoSoli.setText("Buscar");
		this.jButtonid_formatoNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoNotaCreditoSoli"));

		this.jButtonid_formatoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_formatoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_formatoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_formatoNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_formatoNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_formatoNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoNotaCreditoSoliUpdate"));



					
		this.jLabelid_tipo_precioNotaCreditoSoli = new JLabelMe();
		this.jLabelid_tipo_precioNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioNotaCreditoSoli.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_tipo_precioNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_tipo_precioNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_tipo_precioNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioNotaCreditoSoli= new JButtonMe();
		this.jButtonid_tipo_precioNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioNotaCreditoSoli.setText("Buscar");
		this.jButtonid_tipo_precioNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioNotaCreditoSoli"));

		this.jButtonid_tipo_precioNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_tipo_precioNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_tipo_precioNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_tipo_precioNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioNotaCreditoSoliUpdate"));



					
		this.jLabelid_clienteNotaCreditoSoli = new JLabelMe();
		this.jLabelid_clienteNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteNotaCreditoSoli.setToolTipText("Cliente");
		this.jLabelid_clienteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_clienteNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_clienteNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_clienteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteNotaCreditoSoli= new JButtonMe();
		this.jButtonid_clienteNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNotaCreditoSoli.setText("Buscar");
		this.jButtonid_clienteNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNotaCreditoSoli"));

		this.jButtonid_clienteNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_clienteNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_clienteNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_clienteNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_clienteNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_clienteNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNotaCreditoSoliUpdate"));



					
		this.jLabelid_facturaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_facturaNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaNotaCreditoSoli.setToolTipText("Factura");
		this.jLabelid_facturaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_facturaNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_facturaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_facturaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_facturaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_facturaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaNotaCreditoSoli"));

		this.jButtonid_facturaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_facturaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_facturaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_facturaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_facturaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_facturaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaNotaCreditoSoliUpdate"));



					
		this.jLabelid_tipo_nota_credito_soliNotaCreditoSoli = new JLabelMe();
		this.jLabelid_tipo_nota_credito_soliNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDTIPONOTACREDITOSOLI+" : *");
		this.jLabelid_tipo_nota_credito_soliNotaCreditoSoli.setToolTipText("Tipo");
		this.jLabelid_tipo_nota_credito_soliNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_nota_credito_soliNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_nota_credito_soliNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_nota_credito_soliNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_nota_credito_soliNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_nota_credito_soliNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDTIPONOTACREDITOSOLI);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_tipo_nota_credito_soliNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoli= new JButtonMe();
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoli.setText("Buscar");
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nota_credito_soliNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nota_credito_soliNotaCreditoSoli"));

		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nota_credito_soliNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_nota_credito_soliNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_nota_credito_soliNotaCreditoSoliUpdate"));



					
		this.jLabelid_responsableNotaCreditoSoli = new JLabelMe();
		this.jLabelid_responsableNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDRESPONSABLE+" :");
		this.jLabelid_responsableNotaCreditoSoli.setToolTipText("Responsable");
		this.jLabelid_responsableNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsableNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsableNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_responsableNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_responsableNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_responsableNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDRESPONSABLE);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_responsableNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_responsableNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_responsableNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsableNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsableNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_responsableNotaCreditoSoli= new JButtonMe();
		this.jButtonid_responsableNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsableNotaCreditoSoli.setText("Buscar");
		this.jButtonid_responsableNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_responsableNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_responsableNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableNotaCreditoSoli"));

		this.jButtonid_responsableNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_responsableNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsableNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_responsableNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_responsableNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_responsableNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_responsableNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_responsableNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_responsableNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsableNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsableNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_responsableNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_responsableNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsableNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_responsableNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsableNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsableNotaCreditoSoliUpdate"));



					
		this.jLabelid_estado_nota_creditoNotaCreditoSoli = new JLabelMe();
		this.jLabelid_estado_nota_creditoNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDESTADONOTACREDITOSOLI+" : *");
		this.jLabelid_estado_nota_creditoNotaCreditoSoli.setToolTipText("Estado");
		this.jLabelid_estado_nota_creditoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_nota_creditoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_nota_creditoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_nota_creditoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_nota_creditoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_nota_creditoNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDESTADONOTACREDITOSOLI);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_estado_nota_creditoNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_estado_nota_creditoNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_estado_nota_creditoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_nota_creditoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_nota_creditoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_nota_creditoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_nota_creditoNotaCreditoSoli= new JButtonMe();
		this.jButtonid_estado_nota_creditoNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_nota_creditoNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_nota_creditoNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_nota_creditoNotaCreditoSoli.setText("Buscar");
		this.jButtonid_estado_nota_creditoNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_nota_creditoNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_nota_creditoNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_nota_creditoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_nota_creditoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_nota_creditoNotaCreditoSoli"));

		this.jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_nota_creditoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_nota_creditoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_nota_creditoNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_estado_nota_creditoNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_estado_nota_creditoNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_creditoNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_creditoNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_nota_creditoNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_estado_nota_creditoNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_nota_creditoNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_nota_creditoNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_nota_creditoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_nota_creditoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_nota_creditoNotaCreditoSoliUpdate"));



					
		this.jLabelid_centro_costoNotaCreditoSoli = new JLabelMe();
		this.jLabelid_centro_costoNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoNotaCreditoSoli.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_centro_costoNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_centro_costoNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_centro_costoNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_centro_costoNotaCreditoSoli.setEnabled(false);

		this.jButtonid_centro_costoNotaCreditoSoli= new JButtonMe();
		this.jButtonid_centro_costoNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoNotaCreditoSoli.setText("Buscar");
		this.jButtonid_centro_costoNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoNotaCreditoSoli"));

		this.jButtonid_centro_costoNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_centro_costoNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_centro_costoNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_centro_costoNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_centro_costoNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoNotaCreditoSoliUpdate"));


		jButtonid_centro_costoNotaCreditoSoliArbol= new JButtonMe();
		jButtonid_centro_costoNotaCreditoSoliArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoNotaCreditoSoliArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoNotaCreditoSoliArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoNotaCreditoSoliArbol.setText("Arbol");
		jButtonid_centro_costoNotaCreditoSoliArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoNotaCreditoSoliArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoNotaCreditoSoliArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoNotaCreditoSoliArbol"));



					
		this.jLabelid_vendedorNotaCreditoSoli = new JLabelMe();
		this.jLabelid_vendedorNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDVENDEDOR+" :");
		this.jLabelid_vendedorNotaCreditoSoli.setToolTipText("Vendedor");
		this.jLabelid_vendedorNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_vendedorNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_vendedorNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_vendedorNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_vendedorNotaCreditoSoli.setEnabled(false);

		this.jButtonid_vendedorNotaCreditoSoli= new JButtonMe();
		this.jButtonid_vendedorNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorNotaCreditoSoli.setText("Buscar");
		this.jButtonid_vendedorNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoSoli"));

		this.jButtonid_vendedorNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_vendedorNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_vendedorNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_vendedorNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_vendedorNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_vendedorNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoSoliUpdate"));


		jButtonid_vendedorNotaCreditoSoliArbol= new JButtonMe();
		jButtonid_vendedorNotaCreditoSoliArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorNotaCreditoSoliArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorNotaCreditoSoliArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorNotaCreditoSoliArbol.setText("Arbol");
		jButtonid_vendedorNotaCreditoSoliArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorNotaCreditoSoliArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoSoliArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoSoliArbol"));



					
		this.jLabelid_tipo_cambioNotaCreditoSoli = new JLabelMe();
		this.jLabelid_tipo_cambioNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDTIPOCAMBIO+" : *");
		this.jLabelid_tipo_cambioNotaCreditoSoli.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_tipo_cambioNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_tipo_cambioNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_tipo_cambioNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioNotaCreditoSoli.setEnabled(false);

		this.jButtonid_tipo_cambioNotaCreditoSoli= new JButtonMe();
		this.jButtonid_tipo_cambioNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioNotaCreditoSoli.setText("Buscar");
		this.jButtonid_tipo_cambioNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioNotaCreditoSoli"));

		this.jButtonid_tipo_cambioNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_tipo_cambioNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_tipo_cambioNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioNotaCreditoSoliUpdate"));



					
		this.jLabelid_transporteNotaCreditoSoli = new JLabelMe();
		this.jLabelid_transporteNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDTRANSPORTE+" :");
		this.jLabelid_transporteNotaCreditoSoli.setToolTipText("Transporte");
		this.jLabelid_transporteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transporteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transporteNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transporteNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transporteNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDTRANSPORTE);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_transporteNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_transporteNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_transporteNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transporteNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transporteNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_transporteNotaCreditoSoli.setEnabled(false);

		this.jButtonid_transporteNotaCreditoSoli= new JButtonMe();
		this.jButtonid_transporteNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transporteNotaCreditoSoli.setText("Buscar");
		this.jButtonid_transporteNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transporteNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transporteNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteNotaCreditoSoli"));

		this.jButtonid_transporteNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_transporteNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_transporteNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transporteNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transporteNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transporteNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_transporteNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_transporteNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transporteNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transporteNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_transporteNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transporteNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transporteNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transporteNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transporteNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transporteNotaCreditoSoliUpdate"));



					
		this.jLabelid_transportistaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_transportistaNotaCreditoSoli.setText(""+NotaCreditoSoliConstantesFunciones.LABEL_IDTRANSPORTISTA+" :");
		this.jLabelid_transportistaNotaCreditoSoli.setToolTipText("Transportista");
		this.jLabelid_transportistaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaNotaCreditoSoli.setToolTipText(NotaCreditoSoliConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_transportistaNotaCreditoSoli.setLayout(this.gridaBagLayoutNotaCreditoSoli);


		jComboBoxid_transportistaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_transportistaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_transportistaNotaCreditoSoli.setEnabled(false);

		this.jButtonid_transportistaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_transportistaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_transportistaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaNotaCreditoSoli"));

		this.jButtonid_transportistaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_transportistaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_transportistaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaNotaCreditoSoliBusqueda"));

		if(this.notacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_transportistaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_transportistaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_transportistaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaNotaCreditoSoliUpdate"));



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
		//this.jInternalFrameDetalleNotaCreditoSoli = new NotaCreditoSoliBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Solicitud Nota Credito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNotaCreditoSoli= new GridBagLayout();
		

		
		String sToolTipNotaCreditoSoli="";
		sToolTipNotaCreditoSoli=NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNotaCreditoSoli+="(Facturacion.NotaCreditoSoli)";
		}
		
		if(!this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
			sToolTipNotaCreditoSoli+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNotaCreditoSoli = new JButtonMe();
		this.jButtonModificarNotaCreditoSoli = new JButtonMe();
        this.jButtonActualizarNotaCreditoSoli = new JButtonMe();
        this.jButtonEliminarNotaCreditoSoli = new JButtonMe();
        this.jButtonCancelarNotaCreditoSoli = new JButtonMe();
        this.jButtonGuardarCambiosNotaCreditoSoli = new JButtonMe();
		this.jButtonGuardarCambiosTablaNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarNotaCreditoSoli = new JButtonMe();
		
		this.jScrollPanelDatosNotaCreditoSoli = new JScrollPane();   
        this.jScrollPanelDatosEdicionNotaCreditoSoli = new JScrollPane();
		this.jScrollPanelDatosGeneralNotaCreditoSoli = new JScrollPane();
				
		
		
		this.jPanelCamposNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Solicitud Nota Credito";
		
		if(!this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Solicitud Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposNotaCreditoSoli.setName("jPanelCamposNotaCreditoSoli"); 

		this.jPanelCamposOcultosNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNotaCreditoSoli.setName("jPanelCamposOcultosNotaCreditoSoli"); 

        this.jPanelAccionesNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNotaCreditoSoli.setToolTipText("Acciones");
        this.jPanelAccionesNotaCreditoSoli.setName("Acciones"); 

		this.jPanelAccionesFormularioNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNotaCreditoSoli.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNotaCreditoSoli.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalNotaCreditoSoli.setName("jPanelCamposFintotalNotaCreditoSoli");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNotaCreditoSoli.setText("Nuevo");
		this.jButtonModificarNotaCreditoSoli.setText("Editar");
        this.jButtonActualizarNotaCreditoSoli.setText("Actualizar");
        this.jButtonEliminarNotaCreditoSoli.setText("Eliminar");
        this.jButtonCancelarNotaCreditoSoli.setText("Cancelar");
        this.jButtonGuardarCambiosNotaCreditoSoli.setText("Guardar");
		this.jButtonGuardarCambiosTablaNotaCreditoSoli.setText("Guardar");
		this.jButtonCerrarNotaCreditoSoli.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNotaCreditoSoli,"nuevo_button","Nuevo",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNotaCreditoSoli,"modificar_button","Editar",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNotaCreditoSoli,"actualizar_button","Actualizar",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNotaCreditoSoli,"eliminar_button","Eliminar",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNotaCreditoSoli,"cancelar_button","Cancelar",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNotaCreditoSoli,"guardarcambios_button","Guardar",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNotaCreditoSoli,"guardarcambiostabla_button","Guardar",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNotaCreditoSoli,"cerrar_button","Salir",this.notacreditosoliSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNotaCreditoSoli.setToolTipText("Nuevo"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNotaCreditoSoli.setToolTipText("Editar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNotaCreditoSoli.setToolTipText("Actualizar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNotaCreditoSoli.setToolTipText("Eliminar)"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNotaCreditoSoli.setToolTipText("Cancelar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNotaCreditoSoli.setToolTipText("Guardar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNotaCreditoSoli.setToolTipText("Guardar"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNotaCreditoSoli.setToolTipText("Salir"+" "+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNotaCreditoSoli";
		inputMap = this.jButtonNuevoNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNotaCreditoSoli"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNotaCreditoSoli";
		inputMap = this.jButtonActualizarNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNotaCreditoSoli"));
		
		//ELIMINAR
		sMapKey = "EliminarNotaCreditoSoli";
		inputMap = this.jButtonEliminarNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNotaCreditoSoli"));
		
		//CANCELAR	
		sMapKey = "CancelarNotaCreditoSoli";
		inputMap = this.jButtonCancelarNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNotaCreditoSoli"));
		
		//CERRAR		
		sMapKey = "CerrarNotaCreditoSoli";
		inputMap = this.jButtonCerrarNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNotaCreditoSoli"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNotaCreditoSoli";
		inputMap = this.jButtonGuardarCambiosTablaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNotaCreditoSoli"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNotaCreditoSoli.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNotaCreditoSoli.setToolTipText("Nuevo NotaCreditoSoli");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNotaCreditoSoli.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNotaCreditoSoli.setToolTipText("Sin Cerrar Ventana NotaCreditoSoli");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNotaCreditoSoli.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNotaCreditoSoli.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposAccionesNotaCreditoSoli.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNotaCreditoSoli.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNotaCreditoSoli.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNotaCreditoSoli = new JLabelMe();
		
		this.jLabelAccionesNotaCreditoSoli.setText("Acciones");		
		this.jLabelAccionesNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNotaCreditoSoli();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNotaCreditoSoli();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNotaCreditoSoli=new JTabbedPane();
		this.jTabbedPaneRelacionesNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNotaCreditoSoli = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNotaCreditoSoli = new GridBagLayout();
		
		this.jPanelCamposNotaCreditoSoli.setLayout(gridaBagLayoutCamposNotaCreditoSoli);
		this.jPanelCamposOcultosNotaCreditoSoli.setLayout(gridaBagLayoutCamposOcultosNotaCreditoSoli);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalNotaCreditoSoli= new GridBagLayout();
		this.jPanelCamposFintotalNotaCreditoSoli.setLayout(gridaBagLayoutCamposFintotalNotaCreditoSoli);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidNotaCreditoSoli.add(jLabelIdNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidNotaCreditoSoli.add(jLabelidNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaNotaCreditoSoli.add(jLabelid_empresaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNotaCreditoSoli.add(jButtonid_empresaNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNotaCreditoSoli.add(jButtonid_empresaNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaNotaCreditoSoli.add(jComboBoxid_empresaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalNotaCreditoSoli.add(jLabelid_sucursalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNotaCreditoSoli.add(jButtonid_sucursalNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNotaCreditoSoli.add(jButtonid_sucursalNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalNotaCreditoSoli.add(jComboBoxid_sucursalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioNotaCreditoSoli.add(jLabelid_ejercicioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioNotaCreditoSoli.add(jButtonid_ejercicioNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioNotaCreditoSoli.add(jButtonid_ejercicioNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioNotaCreditoSoli.add(jComboBoxid_ejercicioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoNotaCreditoSoli.add(jLabelid_periodoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoNotaCreditoSoli.add(jButtonid_periodoNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoNotaCreditoSoli.add(jButtonid_periodoNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoNotaCreditoSoli.add(jComboBoxid_periodoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioNotaCreditoSoli.add(jLabelid_anioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioNotaCreditoSoli.add(jButtonid_anioNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioNotaCreditoSoli.add(jButtonid_anioNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioNotaCreditoSoli.add(jComboBoxid_anioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesNotaCreditoSoli.add(jLabelid_mesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesNotaCreditoSoli.add(jButtonid_mesNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesNotaCreditoSoli.add(jButtonid_mesNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesNotaCreditoSoli.add(jComboBoxid_mesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioNotaCreditoSoli.add(jLabelid_usuarioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioNotaCreditoSoli.add(jButtonid_usuarioNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioNotaCreditoSoli.add(jButtonid_usuarioNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioNotaCreditoSoli.add(jComboBoxid_usuarioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcodigoNotaCreditoSoli.add(jLabelcodigoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoNotaCreditoSoli.add(jButtoncodigoNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcodigoNotaCreditoSoli.add(jTextFieldcodigoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumeroNotaCreditoSoli.add(jLabelnumeroNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroNotaCreditoSoli.add(jButtonnumeroNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumeroNotaCreditoSoli.add(jTextFieldnumeroNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionNotaCreditoSoli.add(jLabelfecha_emisionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionNotaCreditoSoli.add(jButtonfecha_emisionNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionNotaCreditoSoli.add(jDateChooserfecha_emisionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_diasNotaCreditoSoli.add(jLabelnumero_diasNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_diasNotaCreditoSoli.add(jButtonnumero_diasNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_diasNotaCreditoSoli.add(jTextFieldnumero_diasNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_vencimientoNotaCreditoSoli.add(jLabelfecha_vencimientoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoNotaCreditoSoli.add(jButtonfecha_vencimientoNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_vencimientoNotaCreditoSoli.add(jDateChooserfecha_vencimientoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaNotaCreditoSoli.add(jLabelid_monedaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaNotaCreditoSoli.add(jButtonid_monedaNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaNotaCreditoSoli.add(jButtonid_monedaNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaNotaCreditoSoli.add(jComboBoxid_monedaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleadoNotaCreditoSoli.add(jLabelid_empleadoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoNotaCreditoSoli.add(jButtonid_empleadoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoNotaCreditoSoli.add(jButtonid_empleadoNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 4;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoNotaCreditoSoli.add(jButtonid_empleadoNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleadoNotaCreditoSoli.add(jComboBoxid_empleadoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcotizacionNotaCreditoSoli.add(jLabelcotizacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionNotaCreditoSoli.add(jButtoncotizacionNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcotizacionNotaCreditoSoli.add(jTextFieldcotizacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoNotaCreditoSoli.add(jLabelid_formatoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoNotaCreditoSoli.add(jButtonid_formatoNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoNotaCreditoSoli.add(jButtonid_formatoNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoNotaCreditoSoli.add(jComboBoxid_formatoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_precioNotaCreditoSoli.add(jLabelid_tipo_precioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioNotaCreditoSoli.add(jButtonid_tipo_precioNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioNotaCreditoSoli.add(jButtonid_tipo_precioNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_precioNotaCreditoSoli.add(jComboBoxid_tipo_precioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteNotaCreditoSoli.add(jLabelid_clienteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteNotaCreditoSoli.add(jButtonid_clienteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteNotaCreditoSoli.add(jButtonid_clienteNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 4;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteNotaCreditoSoli.add(jButtonid_clienteNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteNotaCreditoSoli.add(jComboBoxid_clienteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_facturaNotaCreditoSoli.add(jLabelid_facturaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaNotaCreditoSoli.add(jButtonid_facturaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaNotaCreditoSoli.add(jButtonid_facturaNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 4;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaNotaCreditoSoli.add(jButtonid_facturaNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_facturaNotaCreditoSoli.add(jComboBoxid_facturaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldireccionNotaCreditoSoli.add(jLabeldireccionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccionNotaCreditoSoli.add(jButtondireccionNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldireccionNotaCreditoSoli.add(jscrollPanedireccionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltelefonoNotaCreditoSoli.add(jLabeltelefonoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefonoNotaCreditoSoli.add(jButtontelefonoNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltelefonoNotaCreditoSoli.add(jTextFieldtelefonoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelrucNotaCreditoSoli.add(jLabelrucNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucNotaCreditoSoli.add(jButtonrucNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelrucNotaCreditoSoli.add(jTextFieldrucNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_nota_credito_soliNotaCreditoSoli.add(jLabelid_tipo_nota_credito_soliNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_nota_credito_soliNotaCreditoSoli.add(jButtonid_tipo_nota_credito_soliNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_nota_credito_soliNotaCreditoSoli.add(jButtonid_tipo_nota_credito_soliNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_nota_credito_soliNotaCreditoSoli.add(jComboBoxid_tipo_nota_credito_soliNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_responsableNotaCreditoSoli.add(jLabelid_responsableNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsableNotaCreditoSoli.add(jButtonid_responsableNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsableNotaCreditoSoli.add(jButtonid_responsableNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_responsableNotaCreditoSoli.add(jComboBoxid_responsableNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_nota_creditoNotaCreditoSoli.add(jLabelid_estado_nota_creditoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_nota_creditoNotaCreditoSoli.add(jButtonid_estado_nota_creditoNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_nota_creditoNotaCreditoSoli.add(jButtonid_estado_nota_creditoNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_nota_creditoNotaCreditoSoli.add(jComboBoxid_estado_nota_creditoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionNotaCreditoSoli.add(jLabeldescripcionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionNotaCreditoSoli.add(jButtondescripcionNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionNotaCreditoSoli.add(jscrollPanedescripcionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelpenalizadoNotaCreditoSoli.add(jLabelpenalizadoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelpenalizadoNotaCreditoSoli.add(jButtonpenalizadoNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelpenalizadoNotaCreditoSoli.add(jCheckBoxpenalizadoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuento_porcentajeNotaCreditoSoli.add(jLabeldescuento_porcentajeNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_porcentajeNotaCreditoSoli.add(jButtondescuento_porcentajeNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuento_porcentajeNotaCreditoSoli.add(jTextFielddescuento_porcentajeNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_ivaNotaCreditoSoli.add(jLabeltotal_ivaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaNotaCreditoSoli.add(jButtontotal_ivaNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_ivaNotaCreditoSoli.add(jTextFieldtotal_ivaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsumanNotaCreditoSoli.add(jLabelsumanNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanNotaCreditoSoli.add(jButtonsumanNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsumanNotaCreditoSoli.add(jTextFieldsumanNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuento_valorNotaCreditoSoli.add(jLabeldescuento_valorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorNotaCreditoSoli.add(jButtondescuento_valorNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuento_valorNotaCreditoSoli.add(jTextFielddescuento_valorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_sin_ivaNotaCreditoSoli.add(jLabeltotal_sin_ivaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaNotaCreditoSoli.add(jButtontotal_sin_ivaNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_sin_ivaNotaCreditoSoli.add(jTextFieldtotal_sin_ivaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuento_generalNotaCreditoSoli.add(jLabeldescuento_generalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_generalNotaCreditoSoli.add(jButtondescuento_generalNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuento_generalNotaCreditoSoli.add(jTextFielddescuento_generalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfleteNotaCreditoSoli.add(jLabelfleteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteNotaCreditoSoli.add(jButtonfleteNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfleteNotaCreditoSoli.add(jTextFieldfleteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalNotaCreditoSoli.add(jLabeltotalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalNotaCreditoSoli.add(jButtontotalNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalNotaCreditoSoli.add(jTextFieldtotalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsub_totalNotaCreditoSoli.add(jLabelsub_totalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalNotaCreditoSoli.add(jButtonsub_totalNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsub_totalNotaCreditoSoli.add(jTextFieldsub_totalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelotroNotaCreditoSoli.add(jLabelotroNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelotroNotaCreditoSoli.add(jButtonotroNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelotroNotaCreditoSoli.add(jTextFieldotroNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaNotaCreditoSoli.add(jLabelivaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaNotaCreditoSoli.add(jButtonivaNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaNotaCreditoSoli.add(jTextFieldivaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfinanciamientoNotaCreditoSoli.add(jLabelfinanciamientoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoNotaCreditoSoli.add(jButtonfinanciamientoNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfinanciamientoNotaCreditoSoli.add(jTextFieldfinanciamientoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelotro_valorNotaCreditoSoli.add(jLabelotro_valorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelotro_valorNotaCreditoSoli.add(jButtonotro_valorNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelotro_valorNotaCreditoSoli.add(jTextFieldotro_valorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelretencionNotaCreditoSoli.add(jLabelretencionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencionNotaCreditoSoli.add(jButtonretencionNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelretencionNotaCreditoSoli.add(jTextFieldretencionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliceNotaCreditoSoli.add(jLabeliceNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceNotaCreditoSoli.add(jButtoniceNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliceNotaCreditoSoli.add(jTextFieldiceNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaNotaCreditoSoli.add(jLabelfechaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaNotaCreditoSoli.add(jButtonfechaNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaNotaCreditoSoli.add(jDateChooserfechaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_centro_costoNotaCreditoSoli.add(jLabelid_centro_costoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoNotaCreditoSoli.add(jButtonid_centro_costoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoNotaCreditoSoli.add(jButtonid_centro_costoNotaCreditoSoliArbol, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 4;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoNotaCreditoSoli.add(jButtonid_centro_costoNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 5;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoNotaCreditoSoli.add(jButtonid_centro_costoNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_centro_costoNotaCreditoSoli.add(jComboBoxid_centro_costoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_vendedorNotaCreditoSoli.add(jLabelid_vendedorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorNotaCreditoSoli.add(jButtonid_vendedorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorNotaCreditoSoli.add(jButtonid_vendedorNotaCreditoSoliArbol, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 4;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorNotaCreditoSoli.add(jButtonid_vendedorNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 5;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorNotaCreditoSoli.add(jButtonid_vendedorNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_vendedorNotaCreditoSoli.add(jComboBoxid_vendedorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_cambioNotaCreditoSoli.add(jLabelid_tipo_cambioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioNotaCreditoSoli.add(jButtonid_tipo_cambioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioNotaCreditoSoli.add(jButtonid_tipo_cambioNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 4;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioNotaCreditoSoli.add(jButtonid_tipo_cambioNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_cambioNotaCreditoSoli.add(jComboBoxid_tipo_cambioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transporteNotaCreditoSoli.add(jLabelid_transporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteNotaCreditoSoli.add(jButtonid_transporteNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transporteNotaCreditoSoli.add(jButtonid_transporteNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transporteNotaCreditoSoli.add(jComboBoxid_transporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transportistaNotaCreditoSoli.add(jLabelid_transportistaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaNotaCreditoSoli.add(jButtonid_transportistaNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaNotaCreditoSoli.add(jButtonid_transportistaNotaCreditoSoliUpdate, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transportistaNotaCreditoSoli.add(jComboBoxid_transportistaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_clienteNotaCreditoSoli.add(jLabelfecha_clienteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_clienteNotaCreditoSoli.add(jButtonfecha_clienteNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_clienteNotaCreditoSoli.add(jDateChooserfecha_clienteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_autorizacionNotaCreditoSoli.add(jLabelfecha_autorizacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_autorizacionNotaCreditoSoli.add(jButtonfecha_autorizacionNotaCreditoSoliBusqueda, this.gridBagConstraintsNotaCreditoSoli);
	}

	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_autorizacionNotaCreditoSoli.add(jDateChooserfecha_autorizacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelidNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelcodigoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelnumeroNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelfecha_emisionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelnumero_diasNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelfecha_vencimientoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelid_monedaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelid_empleadoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelcotizacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelid_formatoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelid_tipo_precioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelid_clienteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelid_facturaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPaneldireccionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPaneltelefonoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelrucNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelid_tipo_nota_credito_soliNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelid_responsableNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelid_estado_nota_creditoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPaneldescripcionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoSoli.add(this.jPanelpenalizadoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposNotaCreditoSoli % 4==0) {
		iXPanelCamposNotaCreditoSoli=0;
		iYPanelCamposNotaCreditoSoli++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_empresaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_sucursalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_ejercicioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_periodoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_anioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_mesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_usuarioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelretencionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 3==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPaneliceNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 3==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelfechaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_centro_costoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_vendedorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_tipo_cambioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_transporteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelid_transportistaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelfecha_clienteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposOcultosNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposOcultosNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoSoli.add(this.jPanelfecha_autorizacionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposOcultosNotaCreditoSoli % 4==0) {
		iXPanelCamposOcultosNotaCreditoSoli=0;
		iYPanelCamposOcultosNotaCreditoSoli++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPaneldescuento_porcentajeNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPaneltotal_ivaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPanelsumanNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPaneldescuento_valorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPaneltotal_sin_ivaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPaneldescuento_generalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPanelfleteNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPaneltotalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPanelsub_totalNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPanelotroNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPanelivaNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPanelfinanciamientoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
	}
	this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoSoli.gridy = iYPanelCamposFintotalNotaCreditoSoli;
	this.gridBagConstraintsNotaCreditoSoli.gridx = iXPanelCamposFintotalNotaCreditoSoli++;
	this.gridBagConstraintsNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoSoli.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoSoli.add(this.jPanelotro_valorNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);



	if(iXPanelCamposFintotalNotaCreditoSoli % 3==0) {
		iXPanelCamposFintotalNotaCreditoSoli=0;
		iYPanelCamposFintotalNotaCreditoSoli++;
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
			
		GridBagLayout gridaBagLayoutAccionesNotaCreditoSoli= new GridBagLayout();
		this.jPanelAccionesNotaCreditoSoli.setLayout(gridaBagLayoutAccionesNotaCreditoSoli);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNotaCreditoSoli= new GridBagLayout();
		this.jPanelAccionesFormularioNotaCreditoSoli.setLayout(gridaBagLayoutAccionesFormularioNotaCreditoSoli);
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNotaCreditoSoli.add(this.jComboBoxTiposAccionesFormularioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNotaCreditoSoli.add(this.jCheckBoxPostAccionNuevoNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.notacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNotaCreditoSoli.add(this.jCheckBoxPostAccionSinCerrarNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.notacreditosoliSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.notacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNotaCreditoSoli.add(this.jCheckBoxPostAccionSinMensajeNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccion++;
			
		this.jPanelAccionesNotaCreditoSoli.add(this.jButtonModificarNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);							

		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsNotaCreditoSoli.gridx =iPosXAccion++;
			
		this.jPanelAccionesNotaCreditoSoli.add(this.jButtonEliminarNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
			
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccion++;
		
		this.jPanelAccionesNotaCreditoSoli.add(this.jButtonActualizarNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);


		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = iPosXAccion++;
		
		this.jPanelAccionesNotaCreditoSoli.add(this.jButtonGuardarCambiosNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);	
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = 0;		
		this.gridBagConstraintsNotaCreditoSoli.gridx =iPosXAccion++;
		
		this.jPanelAccionesNotaCreditoSoli.add(this.jButtonCancelarNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNotaCreditoSoli = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNotaCreditoSoli);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.notacreditosoliSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();						
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotaCreditoSoli.gridx = 0;		
			//this.gridBagConstraintsNotaCreditoSoli.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNotaCreditoSoli.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNotaCreditoSoli.gridx =0;
		this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNotaCreditoSoli.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*3);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNotaCreditoSoli = new NotaCreditoSoliBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Solicitud Nota Credito DATOS");
			
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
			
	        //this.setTitle("[FOR] - Solicitud Nota Credito DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Solicitud Nota Credito Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NotaCreditoSoliModel notacreditosoliModel=new NotaCreditoSoliModel(this);
			
			//SI USARA CLASE INTERNA
			//NotaCreditoSoliModel.NotaCreditoSoliFocusTraversalPolicy notacreditosoliFocusTraversalPolicy = notacreditosoliModel.new NotaCreditoSoliFocusTraversalPolicy(this);
			
			//notacreditosoliFocusTraversalPolicy.setnotacreditosoliJInternalFrame(this);
			
			this.setFocusTraversalPolicy(notacreditosoliModel);
			
			
			this.jContentPaneDetalleNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNotaCreditoSoli = new GridBagLayout();	
			this.jContentPaneDetalleNotaCreditoSoli.setLayout(gridaBagLayoutDetalleNotaCreditoSoli);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNotaCreditoSoli = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionNotaCreditoSoli=   new JScrollPane(jContentPaneDetalleNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNotaCreditoSoli=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	        
			this.jContentPaneDetalleNotaCreditoSoli.add(jPanelCamposNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);
			
			
			
			
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
						&& notacreditosoliSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(this.puedeCargarPorParteDetaNotaCreditoSoli,false,-1);
					
					if(this.notacreditosoliSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNotaCreditoSoli= new GridBagConstraints();
						this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
						this.jContentPaneDetalleNotaCreditoSoli.add(this.jTabbedPaneRelacionesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNotaCreditoSoli.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyRelaciones++;
		this.gridBagConstraintsNotaCreditoSoli.gridx = 0;

		this.jContentPaneDetalleNotaCreditoSoli.add(jPanelCamposFintotalNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNotaCreditoSoli.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
					this.gridBagConstraintsNotaCreditoSoli.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
					
				
					this.jContentPaneDetalleNotaCreditoSoli.add(jPanelCamposOcultosNotaCreditoSoli, gridBagConstraintsNotaCreditoSoli);
				
					this.jPanelCamposOcultosNotaCreditoSoli.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	        this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNotaCreditoSoli.add(this.jPanelAccionesFormularioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);							
			
			
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
	        
			
			this.jContentPaneDetalleNotaCreditoSoli.add(this.jPanelAccionesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNotaCreditoSoli);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNotaCreditoSoli=   new JScrollPane(this.jPanelCamposNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
			this.gridBagConstraintsNotaCreditoSoli.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNotaCreditoSoli.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);			
			
			this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoSoli.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
			
			
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		
			
		this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoSoli.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoSoli.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNotaCreditoSoli, this.gridBagConstraintsNotaCreditoSoli);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNotaCreditoSoli;//jContentPane;
		
		return jScrollPanelDatosEdicionNotaCreditoSoli;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetaNotaCreditoSoli(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detanotacreditosoliSessionBean=new DetaNotaCreditoSoliSessionBean();
		this.detanotacreditosoliSessionBean.setConGuardarRelaciones(false);
		this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(true);

		this.detanotacreditosoliBeanSwingJInternalFrame=null;//new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detanotacreditosoliBeanSwingJInternalFramePopup=new DetaNotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detanotacreditosoliBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {

				DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(true);

				this.detanotacreditosoliBeanSwingJInternalFrame=new DetaNotaCreditoSoliBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detanotacreditosoliBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detanotacreditosoliBeanSwingJInternalFrame.setdetanotacreditosoliSessionBean(this.detanotacreditosoliSessionBean);

				//this.gridBagConstraintsNotaCreditoSoli = new GridBagConstraints();
				//this.gridBagConstraintsNotaCreditoSoli.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNotaCreditoSoli.gridx = 0;
				//this.jContentPaneDetalleNotaCreditoSoli.add(this.detanotacreditosoliBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNotaCreditoSoli);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNotaCreditoSoli.add("Detalle  Solicitud Nota Credits",this.detanotacreditosoliBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNotaCreditoSoli.setComponentAt(iIndexTab,this.detanotacreditosoliBeanSwingJInternalFrame.getContentPane());
				}

				//DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(false);
				this.detanotacreditosoliBeanSwingJInternalFrame=null;//new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetaNotaCreditoSoli) {
					this.jTabbedPaneRelacionesNotaCreditoSoli.add("Detalle  Solicitud Nota Credits",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetaNotaCreditoSoliBeanSwingJInternalFrame(List<NotaCreditoSoli> notacreditosolis,NotaCreditoSoli notacreditosoli,DetaNotaCreditoSoliBeanSwingJInternalFrame detanotacreditosoliBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detanotacreditosoliBeanSwingJInternalFrame=new DetaNotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detanotacreditosoliBeanSwingJInternalFrame.getDetaNotaCreditoSoliLogic().setConnexion(this.notacreditosoliLogic.getConnexion());

					detanotacreditosoliBeanSwingJInternalFrame.setnotacreditosolisForeignKey(notacreditosolis);
					detanotacreditosoliBeanSwingJInternalFrame.setnotacreditosoliForeignKey(notacreditosoli);
					detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionNotaCreditoSoli(true);
					detanotacreditosoliBeanSwingJInternalFrame.detanotacreditosoliSessionBean.setlidNotaCreditoSoliActual(notacreditosoli.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detanotacreditosoliBeanSwingJInternalFrame.cargarCombosForeignKeyDetaNotaCreditoSoli(detanotacreditosoliBeanSwingJInternalFrame.isCargarCombosDependencia);
					detanotacreditosoliBeanSwingJInternalFrame.setVisibilidadBusquedasParaNotaCreditoSoli(true);
					detanotacreditosoliBeanSwingJInternalFrame.setid_nota_credito_soliFK_IdNotaCreditoSoli(notacreditosoli.getId());

					if(!this.conCargarFormDetalle) {
						detanotacreditosoliBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detanotacreditosoliBeanSwingJInternalFrame.setSelectedItemCombosFrameNotaCreditoSoliForeignKey(notacreditosoli,1,false,true,true);
					detanotacreditosoliBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detanotacreditosoliBeanSwingJInternalFrame.procesarBusqueda("FK_IdNotaCreditoSoli");
					detanotacreditosoliBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNotaCreditoSoli");
					detanotacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetaNotaCreditoSoli(true);
					detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetaNotaCreditoSoli("n",detanotacreditosoliBeanSwingJInternalFrame.isGuardarCambiosEnLote, detanotacreditosoliBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detanotacreditosoliBeanSwingJInternalFrame.setAutoscrolls(true);
					detanotacreditosoliBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsDetaNotaCreditoSoli("relacionado");
					} else {
						detanotacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsDetaNotaCreditoSoli("no_relacionado");
					}

					detanotacreditosoliBeanSwingJInternalFrame.getjButtonRecargarInformacionDetaNotaCreditoSoli().setVisible(false);

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
