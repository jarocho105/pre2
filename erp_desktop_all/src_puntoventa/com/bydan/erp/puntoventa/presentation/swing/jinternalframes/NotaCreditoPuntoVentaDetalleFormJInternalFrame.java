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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.puntoventa.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.util.NotaCreditoPuntoVentaConstantesFunciones;

import com.bydan.erp.puntoventa.business.logic.*;
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
public class NotaCreditoPuntoVentaDetalleFormJInternalFrame extends NotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNotaCreditoPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleNotaCreditoPuntoVenta;
	
	protected JMenu jmenuDetalleNotaCreditoPuntoVenta;
	protected JMenu jmenuDetalleArchivoNotaCreditoPuntoVenta;
	protected JMenu jmenuDetalleAccionesNotaCreditoPuntoVenta;
	protected JMenu jmenuDetalleDatosNotaCreditoPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNotaCreditoPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsNotaCreditoPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleNotaCreditoPuntoVenta;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_vendedor="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_caja="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected MesaBeanSwingJInternalFrame mesaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesa="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoFacturaPuntoVentaBeanSwingJInternalFrame tipofacturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofacturapuntoventa="";

	protected EstadoNotaCreditoBeanSwingJInternalFrame estadonotacreditopuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadonotacreditopuntoventa="";
	
	public NotaCreditoPuntoVentaSessionBean notacreditopuntoventaSessionBean;
	
	

	public DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame detallenotacreditopuntoventaBeanSwingJInternalFrame=null;
	public DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame detallenotacreditopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleNotaCreditoPuntoVenta=false;
	public DetalleNotaCreditoPuntoVentaSessionBean detallenotacreditopuntoventaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CajaSessionBean cajaSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public MesaSessionBean mesaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoFacturaPuntoVentaSessionBean tipofacturapuntoventaSessionBean;
	public EstadoNotaCreditoSessionBean estadonotacreditopuntoventaSessionBean;	
	
	public NotaCreditoPuntoVentaLogic notacreditopuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosNotaCreditoPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionNotaCreditoPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralNotaCreditoPuntoVenta;
	
	protected JPanel jPanelCamposNotaCreditoPuntoVenta;    
	protected JPanel jPanelCamposOcultosNotaCreditoPuntoVenta;    	
	protected JPanel jPanelAccionesNotaCreditoPuntoVenta;
	protected JPanel jPanelAccionesFormularioNotaCreditoPuntoVenta;
    
	
	
	protected Integer iXPanelCamposNotaCreditoPuntoVenta=0;
	protected Integer iYPanelCamposNotaCreditoPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosNotaCreditoPuntoVenta=0;
	protected Integer iYPanelCamposOcultosNotaCreditoPuntoVenta=0;
	
	

	protected JPanel jPanelCamposFintotalNotaCreditoPuntoVenta;
	protected Integer iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
	protected Integer iYPanelCamposFintotalNotaCreditoPuntoVenta=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNotaCreditoPuntoVenta;
	public JButton jButtonModificarNotaCreditoPuntoVenta;
	public JButton jButtonActualizarNotaCreditoPuntoVenta;
    public JButton jButtonEliminarNotaCreditoPuntoVenta;
	public JButton jButtonCancelarNotaCreditoPuntoVenta;
    public JButton jButtonGuardarCambiosNotaCreditoPuntoVenta;
	public JButton jButtonGuardarCambiosTablaNotaCreditoPuntoVenta;
	protected JButton jButtonCerrarNotaCreditoPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionNotaCreditoPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNotaCreditoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNotaCreditoPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNotaCreditoPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonModificarToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonActualizarToolBarNotaCreditoPuntoVenta;
    protected JButton jButtonEliminarToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonCancelarToolBarNotaCreditoPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarNotaCreditoPuntoVenta;
	protected JButton jButtonCerrarToolBarNotaCreditoPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarNotaCreditoPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemModificarNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemActualizarNotaCreditoPuntoVenta;
    protected JMenuItem jMenuItemEliminarNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemCancelarNotaCreditoPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemCerrarNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNotaCreditoPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarNotaCreditoPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNotaCreditoPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNotaCreditoPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNotaCreditoPuntoVenta;
	public JLabel jLabelIdNotaCreditoPuntoVenta;
	public JLabel jLabelidNotaCreditoPuntoVenta;
	public JButton jButtonidNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialNotaCreditoPuntoVenta;
	public JLabel jLabelnumero_secuencialNotaCreditoPuntoVenta;
	public JTextField jTextFieldnumero_secuencialNotaCreditoPuntoVenta;
	public JButton jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_clienteNotaCreditoPuntoVenta;
	public JLabel jLabelcodigo_clienteNotaCreditoPuntoVenta;
	public JTextField jTextFieldcodigo_clienteNotaCreditoPuntoVenta;
	public JButton jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteNotaCreditoPuntoVenta;
	public JLabel jLabelnombre_clienteNotaCreditoPuntoVenta;
	public JTextArea jTextAreanombre_clienteNotaCreditoPuntoVenta;
	public JScrollPane jscrollPanenombre_clienteNotaCreditoPuntoVenta;
	public JButton jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltarjeta_clienteNotaCreditoPuntoVenta;
	public JLabel jLabeltarjeta_clienteNotaCreditoPuntoVenta;
	public JTextField jTextFieldtarjeta_clienteNotaCreditoPuntoVenta;
	public JButton jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_clienteNotaCreditoPuntoVenta;
	public JLabel jLabeldireccion_clienteNotaCreditoPuntoVenta;
	public JTextArea jTextAreadireccion_clienteNotaCreditoPuntoVenta;
	public JScrollPane jscrollPanedireccion_clienteNotaCreditoPuntoVenta;
	public JButton jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_clienteNotaCreditoPuntoVenta;
	public JLabel jLabeltelefono_clienteNotaCreditoPuntoVenta;
	public JTextArea jTextAreatelefono_clienteNotaCreditoPuntoVenta;
	public JScrollPane jscrollPanetelefono_clienteNotaCreditoPuntoVenta;
	public JButton jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfechaNotaCreditoPuntoVenta;
	public JLabel jLabelfechaNotaCreditoPuntoVenta;
	//public JFormattedTextField jDateChooserfechaNotaCreditoPuntoVenta;

	public JDateChooser jDateChooserfechaNotaCreditoPuntoVenta;
	public JButton jButtonfechaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelhoraNotaCreditoPuntoVenta;
	public JLabel jLabelhoraNotaCreditoPuntoVenta;
	public JSpinner jSpinnerhoraNotaCreditoPuntoVenta= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhoraNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaNotaCreditoPuntoVenta;
	public JLabel jLabeltotal_ivaNotaCreditoPuntoVenta;
	public JTextField jTextFieldtotal_ivaNotaCreditoPuntoVenta;
	public JButton jButtontotal_ivaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaNotaCreditoPuntoVenta;
	public JLabel jLabeltotal_sin_ivaNotaCreditoPuntoVenta;
	public JTextField jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta;
	public JButton jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelivaNotaCreditoPuntoVenta;
	public JLabel jLabelivaNotaCreditoPuntoVenta;
	public JTextField jTextFieldivaNotaCreditoPuntoVenta;
	public JButton jButtonivaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoNotaCreditoPuntoVenta;
	public JLabel jLabeldescuentoNotaCreditoPuntoVenta;
	public JTextField jTextFielddescuentoNotaCreditoPuntoVenta;
	public JButton jButtondescuentoNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoNotaCreditoPuntoVenta;
	public JLabel jLabelfinanciamientoNotaCreditoPuntoVenta;
	public JTextField jTextFieldfinanciamientoNotaCreditoPuntoVenta;
	public JButton jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfleteNotaCreditoPuntoVenta;
	public JLabel jLabelfleteNotaCreditoPuntoVenta;
	public JTextField jTextFieldfleteNotaCreditoPuntoVenta;
	public JButton jButtonfleteNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneliceNotaCreditoPuntoVenta;
	public JLabel jLabeliceNotaCreditoPuntoVenta;
	public JTextField jTextFieldiceNotaCreditoPuntoVenta;
	public JButton jButtoniceNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelotrosNotaCreditoPuntoVenta;
	public JLabel jLabelotrosNotaCreditoPuntoVenta;
	public JTextField jTextFieldotrosNotaCreditoPuntoVenta;
	public JButton jButtonotrosNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalNotaCreditoPuntoVenta;
	public JLabel jLabelsub_totalNotaCreditoPuntoVenta;
	public JTextField jTextFieldsub_totalNotaCreditoPuntoVenta;
	public JButton jButtonsub_totalNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotalNotaCreditoPuntoVenta;
	public JLabel jLabeltotalNotaCreditoPuntoVenta;
	public JTextField jTextFieldtotalNotaCreditoPuntoVenta;
	public JButton jButtontotalNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNotaCreditoPuntoVenta;
	public JLabel jLabelid_empresaNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNotaCreditoPuntoVenta;
	public JButton jButtonid_empresaNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_empresaNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalNotaCreditoPuntoVenta;
	public JLabel jLabelid_sucursalNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalNotaCreditoPuntoVenta;
	public JButton jButtonid_sucursalNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_sucursalNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioNotaCreditoPuntoVenta;
	public JLabel jLabelid_usuarioNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioNotaCreditoPuntoVenta;
	public JButton jButtonid_usuarioNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_usuarioNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorNotaCreditoPuntoVenta;
	public JLabel jLabelid_vendedorNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorNotaCreditoPuntoVenta;
	public JButton jButtonid_vendedorNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_vendedorNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorNotaCreditoPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorNotaCreditoPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_clienteNotaCreditoPuntoVenta;
	public JLabel jLabelid_clienteNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteNotaCreditoPuntoVenta;
	public JButton jButtonid_clienteNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_clienteNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaNotaCreditoPuntoVenta;
	public JLabel jLabelid_cajaNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaNotaCreditoPuntoVenta;
	public JButton jButtonid_cajaNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_cajaNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_cajaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableNotaCreditoPuntoVenta;
	public JLabel jLabelid_asiento_contableNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableNotaCreditoPuntoVenta;
	public JButton jButtonid_asiento_contableNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_asiento_contableNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioNotaCreditoPuntoVenta;
	public JLabel jLabelid_tipo_precioNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioNotaCreditoPuntoVenta;
	public JButton jButtonid_tipo_precioNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_precioNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesaNotaCreditoPuntoVenta;
	public JLabel jLabelid_mesaNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesaNotaCreditoPuntoVenta;
	public JButton jButtonid_mesaNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_mesaNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_mesaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoNotaCreditoPuntoVenta;
	public JLabel jLabelid_formatoNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoNotaCreditoPuntoVenta;
	public JButton jButtonid_formatoNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_formatoNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_formatoNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta;
	public JLabel jLabelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta;
	public JButton jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta;
	public JLabel jLabelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta;
	public JButton jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta= new JButtonMe();
	public JButton jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNotaCreditoPuntoVenta;
	
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
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NotaCreditoPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNotaCreditoPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioNotaCreditoPuntoVenta=new JPanel();
				this.jmenuBarDetalleNotaCreditoPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleNotaCreditoPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NotaCreditoPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotaCreditoPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NotaCreditoPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNotaCreditoPuntoVenta() {
		return this.jButtonActualizarToolBarNotaCreditoPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarNotaCreditoPuntoVenta() {
		return this.jButtonEliminarToolBarNotaCreditoPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarNotaCreditoPuntoVenta() {
		return this.jButtonCancelarToolBarNotaCreditoPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionNotaCreditoPuntoVenta() {
		return this.jButtonProcesarInformacionNotaCreditoPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNotaCreditoPuntoVenta)	{
		this.jButtonProcesarInformacionNotaCreditoPuntoVenta = jButtonProcesarInformacionNotaCreditoPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposAccionesNotaCreditoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposRelacionesNotaCreditoPuntoVenta) {
		this.jComboBoxTiposRelacionesNotaCreditoPuntoVenta = jComboBoxTiposRelacionesNotaCreditoPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposAccionesNotaCreditoPuntoVenta) {
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta = jComboBoxTiposAccionesNotaCreditoPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta = jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
		
		this.notacreditopuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detallenotacreditopuntoventaSessionBean=new DetalleNotaCreditoPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NotaCreditoPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 2850) {
			iWidth=2850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNotaCreditoPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNotaCreditoPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarNotaCreditoPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNotaCreditoPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNotaCreditoPuntoVenta,this.jTtoolBarDetalleNotaCreditoPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNotaCreditoPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNotaCreditoPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNotaCreditoPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNotaCreditoPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNotaCreditoPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNotaCreditoPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNotaCreditoPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNotaCreditoPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNotaCreditoPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNotaCreditoPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNotaCreditoPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNotaCreditoPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNotaCreditoPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNotaCreditoPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNotaCreditoPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNotaCreditoPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNotaCreditoPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNotaCreditoPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNotaCreditoPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNotaCreditoPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNotaCreditoPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNotaCreditoPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNotaCreditoPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNotaCreditoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNotaCreditoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNotaCreditoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNotaCreditoPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNotaCreditoPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNotaCreditoPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNotaCreditoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNotaCreditoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNotaCreditoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNotaCreditoPuntoVenta.add(this.jMenuItemDetalleCerrarNotaCreditoPuntoVenta);
		
		this.jmenuDetalleAccionesNotaCreditoPuntoVenta.add(this.jMenuItemActualizarNotaCreditoPuntoVenta);
		this.jmenuDetalleAccionesNotaCreditoPuntoVenta.add(this.jMenuItemEliminarNotaCreditoPuntoVenta);
		this.jmenuDetalleAccionesNotaCreditoPuntoVenta.add(this.jMenuItemCancelarNotaCreditoPuntoVenta);		
		
		//this.jmenuDetalleDatosNotaCreditoPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByNotaCreditoPuntoVenta);				
		this.jmenuDetalleDatosNotaCreditoPuntoVenta.add(this.jMenuItemDetalleMostarOcultarNotaCreditoPuntoVenta);				
				
		//this.jmenuDetalleAccionesNotaCreditoPuntoVenta.add(this.jMenuItemGuardarCambiosNotaCreditoPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNotaCreditoPuntoVenta.add(this.jmenuDetalleArchivoNotaCreditoPuntoVenta);		
		this.jmenuBarDetalleNotaCreditoPuntoVenta.add(this.jmenuDetalleAccionesNotaCreditoPuntoVenta);		
		this.jmenuBarDetalleNotaCreditoPuntoVenta.add(this.jmenuDetalleDatosNotaCreditoPuntoVenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleNotaCreditoPuntoVenta.add(this.jmenuDetalleNotaCreditoPuntoVenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposNotaCreditoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNotaCreditoPuntoVenta = new JLabelMe();
		jLabelIdNotaCreditoPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNotaCreditoPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNotaCreditoPuntoVenta= new GridBagLayout();

		this.jPanelidNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);

		jLabelidNotaCreditoPuntoVenta = new JLabel();
		jLabelidNotaCreditoPuntoVenta.setText("Id");

		jLabelidNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_secuencialNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelnumero_secuencialNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialNotaCreditoPuntoVenta.setToolTipText("No Secuencial");
		this.jLabelnumero_secuencialNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelnumero_secuencialNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldnumero_secuencialNotaCreditoPuntoVenta= new JTextFieldMe();

		jTextFieldnumero_secuencialNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldnumero_secuencialNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_clienteNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelcodigo_clienteNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_CODIGOCLIENTE+" : *");
		this.jLabelcodigo_clienteNotaCreditoPuntoVenta.setToolTipText("Codigo Cliente");
		this.jLabelcodigo_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_clienteNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_clienteNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_CODIGOCLIENTE);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelcodigo_clienteNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldcodigo_clienteNotaCreditoPuntoVenta= new JTextFieldMe();

		jTextFieldcodigo_clienteNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldcodigo_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_clienteNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_clienteNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_clienteNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelnombre_clienteNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteNotaCreditoPuntoVenta.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelnombre_clienteNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextAreanombre_clienteNotaCreditoPuntoVenta= new JTextAreaMe();
		jTextAreanombre_clienteNotaCreditoPuntoVenta.setEnabled(false);
		jTextAreanombre_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteNotaCreditoPuntoVenta.setLineWrap(true);
		jTextAreanombre_clienteNotaCreditoPuntoVenta.setWrapStyleWord(true);
		jTextAreanombre_clienteNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteNotaCreditoPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteNotaCreditoPuntoVenta = new JScrollPane(jTextAreanombre_clienteNotaCreditoPuntoVenta);
		jscrollPanenombre_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltarjeta_clienteNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeltarjeta_clienteNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_TARJETACLIENTE+" :");
		this.jLabeltarjeta_clienteNotaCreditoPuntoVenta.setToolTipText("Tarjeta Cliente");
		this.jLabeltarjeta_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltarjeta_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltarjeta_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltarjeta_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltarjeta_clienteNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltarjeta_clienteNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_TARJETACLIENTE);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneltarjeta_clienteNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldtarjeta_clienteNotaCreditoPuntoVenta= new JTextFieldMe();

		jTextFieldtarjeta_clienteNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldtarjeta_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtarjeta_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtarjeta_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtarjeta_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtarjeta_clienteNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtarjeta_clienteNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tarjeta_clienteNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_clienteNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeldireccion_clienteNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_DIRECCIONCLIENTE+" :");
		this.jLabeldireccion_clienteNotaCreditoPuntoVenta.setToolTipText("Direccion Cliente");
		this.jLabeldireccion_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_clienteNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_clienteNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_DIRECCIONCLIENTE);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneldireccion_clienteNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextAreadireccion_clienteNotaCreditoPuntoVenta= new JTextAreaMe();
		jTextAreadireccion_clienteNotaCreditoPuntoVenta.setEnabled(false);
		jTextAreadireccion_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteNotaCreditoPuntoVenta.setLineWrap(true);
		jTextAreadireccion_clienteNotaCreditoPuntoVenta.setWrapStyleWord(true);
		jTextAreadireccion_clienteNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_clienteNotaCreditoPuntoVenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_clienteNotaCreditoPuntoVenta = new JScrollPane(jTextAreadireccion_clienteNotaCreditoPuntoVenta);
		jscrollPanedireccion_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccion_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccion_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_clienteNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_clienteNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_clienteNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_clienteNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeltelefono_clienteNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_TELEFONOCLIENTE+" :");
		this.jLabeltelefono_clienteNotaCreditoPuntoVenta.setToolTipText("Telefono Cliente");
		this.jLabeltelefono_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_clienteNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_clienteNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_TELEFONOCLIENTE);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneltelefono_clienteNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextAreatelefono_clienteNotaCreditoPuntoVenta= new JTextAreaMe();
		jTextAreatelefono_clienteNotaCreditoPuntoVenta.setEnabled(false);
		jTextAreatelefono_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clienteNotaCreditoPuntoVenta.setLineWrap(true);
		jTextAreatelefono_clienteNotaCreditoPuntoVenta.setWrapStyleWord(true);
		jTextAreatelefono_clienteNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_clienteNotaCreditoPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_clienteNotaCreditoPuntoVenta = new JScrollPane(jTextAreatelefono_clienteNotaCreditoPuntoVenta);
		jscrollPanetelefono_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetelefono_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetelefono_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_clienteNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_clienteNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_clienteNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfechaNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelfechaNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaNotaCreditoPuntoVenta.setToolTipText("Fecha");
		this.jLabelfechaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelfechaNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		//jFormattedTextFieldfechaNotaCreditoPuntoVenta= new JFormattedTextFieldMe();

		jDateChooserfechaNotaCreditoPuntoVenta= new JDateChooser();
		jDateChooserfechaNotaCreditoPuntoVenta.setEnabled(false);
		jDateChooserfechaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaNotaCreditoPuntoVenta.setDate(new Date());
		jDateChooserfechaNotaCreditoPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaNotaCreditoPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfechaNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonfechaNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelhoraNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelhoraNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_HORA+" : *");
		this.jLabelhoraNotaCreditoPuntoVenta.setToolTipText("Hora");
		this.jLabelhoraNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoraNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoraNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoraNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_HORA);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelhoraNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		//jFormattedTextFieldhoraNotaCreditoPuntoVenta= new JFormattedTextFieldMe();

		jSpinnerhoraNotaCreditoPuntoVenta= new JSpinner(new SpinnerDateModel());;
		jSpinnerhoraNotaCreditoPuntoVenta.setEnabled(false);
		JSpinner.DateEditor timeEditorhoraNotaCreditoPuntoVenta = new JSpinner.DateEditor(jSpinnerhoraNotaCreditoPuntoVenta, "HH:mm:ss");

		jSpinnerhoraNotaCreditoPuntoVenta.setEditor(timeEditorhoraNotaCreditoPuntoVenta);

		jSpinnerhoraNotaCreditoPuntoVenta.setValue(new Date());

		jSpinnerhoraNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhoraNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhoraNotaCreditoPuntoVenta.setValue(new Date());
		//jSpinnerhoraNotaCreditoPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhoraNotaCreditoPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhoraNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonhoraNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoraNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonhoraNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoraNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoraNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhoraNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhoraNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horaNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoraNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeltotal_ivaNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaNotaCreditoPuntoVenta.setToolTipText("Total Iva");
		this.jLabeltotal_ivaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneltotal_ivaNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldtotal_ivaNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldtotal_ivaNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldtotal_ivaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaNotaCreditoPuntoVenta.setText("0.0");

		this.jButtontotal_ivaNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotal_ivaNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtontotal_ivaNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeltotal_sin_ivaNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaNotaCreditoPuntoVenta.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneltotal_sin_ivaNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta.setText("0.0");

		this.jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelivaNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelivaNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaNotaCreditoPuntoVenta.setToolTipText("Iva");
		this.jLabelivaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelivaNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldivaNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldivaNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldivaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaNotaCreditoPuntoVenta.setText("0.0");

		this.jButtonivaNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonivaNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonivaNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeldescuentoNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoNotaCreditoPuntoVenta.setToolTipText("Descuento");
		this.jLabeldescuentoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneldescuentoNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFielddescuentoNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFielddescuentoNotaCreditoPuntoVenta.setEnabled(false);
		jTextFielddescuentoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoNotaCreditoPuntoVenta.setText("0.0");

		this.jButtondescuentoNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescuentoNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtondescuentoNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelfinanciamientoNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoNotaCreditoPuntoVenta.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelfinanciamientoNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldfinanciamientoNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldfinanciamientoNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldfinanciamientoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoNotaCreditoPuntoVenta.setText("0.0");

		this.jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfleteNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelfleteNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteNotaCreditoPuntoVenta.setToolTipText("Flete");
		this.jLabelfleteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelfleteNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldfleteNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldfleteNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldfleteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteNotaCreditoPuntoVenta.setText("0.0");

		this.jButtonfleteNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfleteNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonfleteNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeliceNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeliceNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceNotaCreditoPuntoVenta.setToolTipText("Ice");
		this.jLabeliceNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneliceNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldiceNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldiceNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldiceNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceNotaCreditoPuntoVenta.setText("0.0");

		this.jButtoniceNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtoniceNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtoniceNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelotrosNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelotrosNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_OTROS+" : *");
		this.jLabelotrosNotaCreditoPuntoVenta.setToolTipText("Otros");
		this.jLabelotrosNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotrosNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotrosNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotrosNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotrosNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotrosNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_OTROS);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelotrosNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldotrosNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldotrosNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldotrosNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotrosNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotrosNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotrosNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotrosNotaCreditoPuntoVenta.setText("0.0");

		this.jButtonotrosNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonotrosNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotrosNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotrosNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotrosNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonotrosNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotrosNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotrosNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotrosNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotrosNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otrosNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotrosNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelsub_totalNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalNotaCreditoPuntoVenta.setToolTipText("Sub Total");
		this.jLabelsub_totalNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelsub_totalNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldsub_totalNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldsub_totalNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldsub_totalNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalNotaCreditoPuntoVenta.setText("0.0");

		this.jButtonsub_totalNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonsub_totalNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonsub_totalNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotalNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabeltotalNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalNotaCreditoPuntoVenta.setToolTipText("Total");
		this.jLabeltotalNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPaneltotalNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jTextFieldtotalNotaCreditoPuntoVenta= new JTextFieldMe();
		jTextFieldtotalNotaCreditoPuntoVenta.setEnabled(false);
		jTextFieldtotalNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalNotaCreditoPuntoVenta.setText("0.0");

		this.jButtontotalNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotalNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtontotalNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalNotaCreditoPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNotaCreditoPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_empresaNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNotaCreditoPuntoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_empresaNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_empresaNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_empresaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNotaCreditoPuntoVenta.setEnabled(false);

		this.jButtonid_empresaNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_empresaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_empresaNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotaCreditoPuntoVenta"));

		this.jButtonid_empresaNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_empresaNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_empresaNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_sucursalNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_sucursalNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalNotaCreditoPuntoVenta.setToolTipText("Sucursal");
		this.jLabelid_sucursalNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_sucursalNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_sucursalNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_sucursalNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalNotaCreditoPuntoVenta.setEnabled(false);

		this.jButtonid_sucursalNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_sucursalNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_sucursalNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNotaCreditoPuntoVenta"));

		this.jButtonid_sucursalNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_sucursalNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_sucursalNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_sucursalNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_sucursalNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_usuarioNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_usuarioNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioNotaCreditoPuntoVenta.setToolTipText("Usuario");
		this.jLabelid_usuarioNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_usuarioNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_usuarioNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_usuarioNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioNotaCreditoPuntoVenta.setEnabled(false);

		this.jButtonid_usuarioNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_usuarioNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_usuarioNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNotaCreditoPuntoVenta"));

		this.jButtonid_usuarioNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_usuarioNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_usuarioNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_usuarioNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_usuarioNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_vendedorNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_vendedorNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorNotaCreditoPuntoVenta.setToolTipText("Vendedor");
		this.jLabelid_vendedorNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_vendedorNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_vendedorNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_vendedorNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_vendedorNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_vendedorNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoPuntoVenta"));

		this.jButtonid_vendedorNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_vendedorNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_vendedorNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_vendedorNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_vendedorNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_vendedorNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoPuntoVentaUpdate"));


		jButtonid_vendedorNotaCreditoPuntoVentaArbol= new JButtonMe();
		jButtonid_vendedorNotaCreditoPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorNotaCreditoPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorNotaCreditoPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorNotaCreditoPuntoVentaArbol.setText("Arbol");
		jButtonid_vendedorNotaCreditoPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorNotaCreditoPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorNotaCreditoPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorNotaCreditoPuntoVentaArbol"));



					
		this.jLabelid_clienteNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_clienteNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteNotaCreditoPuntoVenta.setToolTipText("Cliente");
		this.jLabelid_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_clienteNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_clienteNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_clienteNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_clienteNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNotaCreditoPuntoVenta"));

		this.jButtonid_clienteNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_clienteNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_clienteNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_clienteNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_clienteNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_clienteNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_cajaNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_cajaNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaNotaCreditoPuntoVenta.setToolTipText("Caja");
		this.jLabelid_cajaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_cajaNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_cajaNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_cajaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cajaNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_cajaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_cajaNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaNotaCreditoPuntoVenta"));

		this.jButtonid_cajaNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_cajaNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_cajaNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_cajaNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_cajaNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_cajaNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_asiento_contableNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_asiento_contableNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableNotaCreditoPuntoVenta.setToolTipText("Asiento C");
		this.jLabelid_asiento_contableNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_asiento_contableNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_asiento_contableNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_asiento_contableNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableNotaCreditoPuntoVenta.setEnabled(false);

		this.jButtonid_asiento_contableNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_asiento_contableNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_asiento_contableNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableNotaCreditoPuntoVenta"));

		this.jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_tipo_precioNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_tipo_precioNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioNotaCreditoPuntoVenta.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_tipo_precioNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_tipo_precioNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_precioNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_tipo_precioNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_tipo_precioNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioNotaCreditoPuntoVenta"));

		this.jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_mesaNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_mesaNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDMESA+" : *");
		this.jLabelid_mesaNotaCreditoPuntoVenta.setToolTipText("Mesa");
		this.jLabelid_mesaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesaNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDMESA);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_mesaNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_mesaNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_mesaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesaNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_mesaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_mesaNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesaNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaNotaCreditoPuntoVenta"));

		this.jButtonid_mesaNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_mesaNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesaNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_mesaNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesaNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesaNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_mesaNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_mesaNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesaNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_mesaNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesaNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_formatoNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_formatoNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoNotaCreditoPuntoVenta.setToolTipText("Formato");
		this.jLabelid_formatoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_formatoNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_formatoNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_formatoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_formatoNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_formatoNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoNotaCreditoPuntoVenta"));

		this.jButtonid_formatoNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_formatoNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_formatoNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_formatoNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_formatoNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_formatoNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDTIPOFACTURAPUNTOVENTA+" : *");
		this.jLabelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setToolTipText("Tipo");
		this.jLabelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDTIPOFACTURAPUNTOVENTA);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_factura_punto_ventaNotaCreditoPuntoVenta"));

		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate"));



					
		this.jLabelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta = new JLabelMe();
		this.jLabelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setText(""+NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDESTADONOTACREDITOPUNTOVENTA+" : *");
		this.jLabelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setToolTipText("Estado");
		this.jLabelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setToolTipText(NotaCreditoPuntoVentaConstantesFunciones.LABEL_IDESTADONOTACREDITOPUNTOVENTA);
		this.gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		this.jPanelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setLayout(this.gridaBagLayoutNotaCreditoPuntoVenta);


		jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta= new JComboBoxMe();
		jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta= new JButtonMe();
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setText("Buscar");
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta"));

		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda.setText("U");
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda"));

		if(this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate.setText("U");
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate"));



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
		//this.jInternalFrameDetalleNotaCreditoPuntoVenta = new NotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Nota Credito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNotaCreditoPuntoVenta= new GridBagLayout();
		

		
		String sToolTipNotaCreditoPuntoVenta="";
		sToolTipNotaCreditoPuntoVenta=NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNotaCreditoPuntoVenta+="(PuntoVenta.NotaCreditoPuntoVenta)";
		}
		
		if(!this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipNotaCreditoPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonModificarNotaCreditoPuntoVenta = new JButtonMe();
        this.jButtonActualizarNotaCreditoPuntoVenta = new JButtonMe();
        this.jButtonEliminarNotaCreditoPuntoVenta = new JButtonMe();
        this.jButtonCancelarNotaCreditoPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta = new JButtonMe();
		this.jButtonCerrarNotaCreditoPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosNotaCreditoPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Nota Credito";
		
		if(!this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposNotaCreditoPuntoVenta.setName("jPanelCamposNotaCreditoPuntoVenta"); 

		this.jPanelCamposOcultosNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNotaCreditoPuntoVenta.setName("jPanelCamposOcultosNotaCreditoPuntoVenta"); 

        this.jPanelAccionesNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNotaCreditoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesNotaCreditoPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioNotaCreditoPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNotaCreditoPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNotaCreditoPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalNotaCreditoPuntoVenta.setName("jPanelCamposFintotalNotaCreditoPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNotaCreditoPuntoVenta.setText("Nuevo");
		this.jButtonModificarNotaCreditoPuntoVenta.setText("Editar");
        this.jButtonActualizarNotaCreditoPuntoVenta.setText("Actualizar");
        this.jButtonEliminarNotaCreditoPuntoVenta.setText("Eliminar");
        this.jButtonCancelarNotaCreditoPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosNotaCreditoPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta.setText("Guardar");
		this.jButtonCerrarNotaCreditoPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNotaCreditoPuntoVenta,"nuevo_button","Nuevo",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNotaCreditoPuntoVenta,"modificar_button","Editar",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNotaCreditoPuntoVenta,"actualizar_button","Actualizar",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNotaCreditoPuntoVenta,"eliminar_button","Eliminar",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNotaCreditoPuntoVenta,"cancelar_button","Cancelar",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNotaCreditoPuntoVenta,"guardarcambios_button","Guardar",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta,"guardarcambiostabla_button","Guardar",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNotaCreditoPuntoVenta,"cerrar_button","Salir",this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNotaCreditoPuntoVenta.setToolTipText("Nuevo"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNotaCreditoPuntoVenta.setToolTipText("Editar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNotaCreditoPuntoVenta.setToolTipText("Actualizar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNotaCreditoPuntoVenta.setToolTipText("Eliminar)"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNotaCreditoPuntoVenta.setToolTipText("Cancelar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNotaCreditoPuntoVenta.setToolTipText("Guardar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta.setToolTipText("Guardar"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNotaCreditoPuntoVenta.setToolTipText("Salir"+" "+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNotaCreditoPuntoVenta";
		inputMap = this.jButtonNuevoNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNotaCreditoPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNotaCreditoPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNotaCreditoPuntoVenta";
		inputMap = this.jButtonActualizarNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNotaCreditoPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarNotaCreditoPuntoVenta";
		inputMap = this.jButtonEliminarNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNotaCreditoPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarNotaCreditoPuntoVenta";
		inputMap = this.jButtonCancelarNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNotaCreditoPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarNotaCreditoPuntoVenta";
		inputMap = this.jButtonCerrarNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNotaCreditoPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNotaCreditoPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNotaCreditoPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNotaCreditoPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNotaCreditoPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNotaCreditoPuntoVenta.setToolTipText("Nuevo NotaCreditoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNotaCreditoPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNotaCreditoPuntoVenta.setToolTipText("Sin Cerrar Ventana NotaCreditoPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNotaCreditoPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNotaCreditoPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNotaCreditoPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNotaCreditoPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNotaCreditoPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesNotaCreditoPuntoVenta.setText("Acciones");		
		this.jLabelAccionesNotaCreditoPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCreditoPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotaCreditoPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNotaCreditoPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNotaCreditoPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNotaCreditoPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesNotaCreditoPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNotaCreditoPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNotaCreditoPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNotaCreditoPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposNotaCreditoPuntoVenta.setLayout(gridaBagLayoutCamposNotaCreditoPuntoVenta);
		this.jPanelCamposOcultosNotaCreditoPuntoVenta.setLayout(gridaBagLayoutCamposOcultosNotaCreditoPuntoVenta);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalNotaCreditoPuntoVenta= new GridBagLayout();
		this.jPanelCamposFintotalNotaCreditoPuntoVenta.setLayout(gridaBagLayoutCamposFintotalNotaCreditoPuntoVenta);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidNotaCreditoPuntoVenta.add(jLabelIdNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidNotaCreditoPuntoVenta.add(jLabelidNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaNotaCreditoPuntoVenta.add(jLabelid_empresaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNotaCreditoPuntoVenta.add(jButtonid_empresaNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNotaCreditoPuntoVenta.add(jButtonid_empresaNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaNotaCreditoPuntoVenta.add(jComboBoxid_empresaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalNotaCreditoPuntoVenta.add(jLabelid_sucursalNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNotaCreditoPuntoVenta.add(jButtonid_sucursalNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalNotaCreditoPuntoVenta.add(jButtonid_sucursalNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalNotaCreditoPuntoVenta.add(jComboBoxid_sucursalNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioNotaCreditoPuntoVenta.add(jLabelid_usuarioNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioNotaCreditoPuntoVenta.add(jButtonid_usuarioNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioNotaCreditoPuntoVenta.add(jButtonid_usuarioNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioNotaCreditoPuntoVenta.add(jComboBoxid_usuarioNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_vendedorNotaCreditoPuntoVenta.add(jLabelid_vendedorNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorNotaCreditoPuntoVenta.add(jButtonid_vendedorNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorNotaCreditoPuntoVenta.add(jButtonid_vendedorNotaCreditoPuntoVentaArbol, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 4;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorNotaCreditoPuntoVenta.add(jButtonid_vendedorNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 5;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorNotaCreditoPuntoVenta.add(jButtonid_vendedorNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_vendedorNotaCreditoPuntoVenta.add(jComboBoxid_vendedorNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteNotaCreditoPuntoVenta.add(jLabelid_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteNotaCreditoPuntoVenta.add(jButtonid_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteNotaCreditoPuntoVenta.add(jButtonid_clienteNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 4;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteNotaCreditoPuntoVenta.add(jButtonid_clienteNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteNotaCreditoPuntoVenta.add(jComboBoxid_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cajaNotaCreditoPuntoVenta.add(jLabelid_cajaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaNotaCreditoPuntoVenta.add(jButtonid_cajaNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaNotaCreditoPuntoVenta.add(jButtonid_cajaNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cajaNotaCreditoPuntoVenta.add(jComboBoxid_cajaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableNotaCreditoPuntoVenta.add(jLabelid_asiento_contableNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableNotaCreditoPuntoVenta.add(jButtonid_asiento_contableNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableNotaCreditoPuntoVenta.add(jButtonid_asiento_contableNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 4;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableNotaCreditoPuntoVenta.add(jButtonid_asiento_contableNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableNotaCreditoPuntoVenta.add(jComboBoxid_asiento_contableNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_precioNotaCreditoPuntoVenta.add(jLabelid_tipo_precioNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioNotaCreditoPuntoVenta.add(jButtonid_tipo_precioNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioNotaCreditoPuntoVenta.add(jButtonid_tipo_precioNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_precioNotaCreditoPuntoVenta.add(jComboBoxid_tipo_precioNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesaNotaCreditoPuntoVenta.add(jLabelid_mesaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesaNotaCreditoPuntoVenta.add(jButtonid_mesaNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesaNotaCreditoPuntoVenta.add(jButtonid_mesaNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesaNotaCreditoPuntoVenta.add(jComboBoxid_mesaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoNotaCreditoPuntoVenta.add(jLabelid_formatoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoNotaCreditoPuntoVenta.add(jButtonid_formatoNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoNotaCreditoPuntoVenta.add(jButtonid_formatoNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoNotaCreditoPuntoVenta.add(jComboBoxid_formatoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.add(jLabelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.add(jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.add(jButtonid_tipo_factura_punto_ventaNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta.add(jComboBoxid_tipo_factura_punto_ventaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.add(jLabelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.add(jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 3;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.add(jButtonid_estado_nota_credito_punto_ventaNotaCreditoPuntoVentaUpdate, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta.add(jComboBoxid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_secuencialNotaCreditoPuntoVenta.add(jLabelnumero_secuencialNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialNotaCreditoPuntoVenta.add(jButtonnumero_secuencialNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_secuencialNotaCreditoPuntoVenta.add(jTextFieldnumero_secuencialNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcodigo_clienteNotaCreditoPuntoVenta.add(jLabelcodigo_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_clienteNotaCreditoPuntoVenta.add(jButtoncodigo_clienteNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcodigo_clienteNotaCreditoPuntoVenta.add(jTextFieldcodigo_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnombre_clienteNotaCreditoPuntoVenta.add(jLabelnombre_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteNotaCreditoPuntoVenta.add(jButtonnombre_clienteNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnombre_clienteNotaCreditoPuntoVenta.add(jscrollPanenombre_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltarjeta_clienteNotaCreditoPuntoVenta.add(jLabeltarjeta_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltarjeta_clienteNotaCreditoPuntoVenta.add(jButtontarjeta_clienteNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltarjeta_clienteNotaCreditoPuntoVenta.add(jTextFieldtarjeta_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldireccion_clienteNotaCreditoPuntoVenta.add(jLabeldireccion_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_clienteNotaCreditoPuntoVenta.add(jButtondireccion_clienteNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldireccion_clienteNotaCreditoPuntoVenta.add(jscrollPanedireccion_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltelefono_clienteNotaCreditoPuntoVenta.add(jLabeltelefono_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_clienteNotaCreditoPuntoVenta.add(jButtontelefono_clienteNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltelefono_clienteNotaCreditoPuntoVenta.add(jscrollPanetelefono_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaNotaCreditoPuntoVenta.add(jLabelfechaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaNotaCreditoPuntoVenta.add(jButtonfechaNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaNotaCreditoPuntoVenta.add(jDateChooserfechaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelhoraNotaCreditoPuntoVenta.add(jLabelhoraNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoraNotaCreditoPuntoVenta.add(jButtonhoraNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelhoraNotaCreditoPuntoVenta.add(jSpinnerhoraNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_ivaNotaCreditoPuntoVenta.add(jLabeltotal_ivaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaNotaCreditoPuntoVenta.add(jButtontotal_ivaNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_ivaNotaCreditoPuntoVenta.add(jTextFieldtotal_ivaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_sin_ivaNotaCreditoPuntoVenta.add(jLabeltotal_sin_ivaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaNotaCreditoPuntoVenta.add(jButtontotal_sin_ivaNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_sin_ivaNotaCreditoPuntoVenta.add(jTextFieldtotal_sin_ivaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaNotaCreditoPuntoVenta.add(jLabelivaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaNotaCreditoPuntoVenta.add(jButtonivaNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaNotaCreditoPuntoVenta.add(jTextFieldivaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuentoNotaCreditoPuntoVenta.add(jLabeldescuentoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoNotaCreditoPuntoVenta.add(jButtondescuentoNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuentoNotaCreditoPuntoVenta.add(jTextFielddescuentoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfinanciamientoNotaCreditoPuntoVenta.add(jLabelfinanciamientoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoNotaCreditoPuntoVenta.add(jButtonfinanciamientoNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfinanciamientoNotaCreditoPuntoVenta.add(jTextFieldfinanciamientoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfleteNotaCreditoPuntoVenta.add(jLabelfleteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteNotaCreditoPuntoVenta.add(jButtonfleteNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfleteNotaCreditoPuntoVenta.add(jTextFieldfleteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliceNotaCreditoPuntoVenta.add(jLabeliceNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceNotaCreditoPuntoVenta.add(jButtoniceNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliceNotaCreditoPuntoVenta.add(jTextFieldiceNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelotrosNotaCreditoPuntoVenta.add(jLabelotrosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelotrosNotaCreditoPuntoVenta.add(jButtonotrosNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelotrosNotaCreditoPuntoVenta.add(jTextFieldotrosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsub_totalNotaCreditoPuntoVenta.add(jLabelsub_totalNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalNotaCreditoPuntoVenta.add(jButtonsub_totalNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsub_totalNotaCreditoPuntoVenta.add(jTextFieldsub_totalNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalNotaCreditoPuntoVenta.add(jLabeltotalNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 2;
		this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalNotaCreditoPuntoVenta.add(jButtontotalNotaCreditoPuntoVentaBusqueda, this.gridBagConstraintsNotaCreditoPuntoVenta);
	}

	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 1;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalNotaCreditoPuntoVenta.add(jTextFieldtotalNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelidNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelid_vendedorNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelid_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelid_cajaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelid_tipo_precioNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelid_mesaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelid_formatoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelid_tipo_factura_punto_ventaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelid_estado_nota_credito_punto_ventaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelnumero_secuencialNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelcodigo_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelnombre_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPaneltarjeta_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPaneldireccion_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPaneltelefono_clienteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelfechaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposNotaCreditoPuntoVenta.add(this.jPanelhoraNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposNotaCreditoPuntoVenta=0;
		iYPanelCamposNotaCreditoPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposOcultosNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposOcultosNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoPuntoVenta.add(this.jPanelid_empresaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposOcultosNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposOcultosNotaCreditoPuntoVenta=0;
		iYPanelCamposOcultosNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposOcultosNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposOcultosNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoPuntoVenta.add(this.jPanelid_sucursalNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposOcultosNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposOcultosNotaCreditoPuntoVenta=0;
		iYPanelCamposOcultosNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposOcultosNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposOcultosNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoPuntoVenta.add(this.jPanelid_usuarioNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposOcultosNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposOcultosNotaCreditoPuntoVenta=0;
		iYPanelCamposOcultosNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposOcultosNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposOcultosNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosNotaCreditoPuntoVenta.add(this.jPanelid_asiento_contableNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposOcultosNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposOcultosNotaCreditoPuntoVenta=0;
		iYPanelCamposOcultosNotaCreditoPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposFintotalNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposFintotalNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoPuntoVenta.add(this.jPaneltotal_ivaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposFintotalNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
		iYPanelCamposFintotalNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposFintotalNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposFintotalNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoPuntoVenta.add(this.jPaneltotal_sin_ivaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposFintotalNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
		iYPanelCamposFintotalNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposFintotalNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposFintotalNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoPuntoVenta.add(this.jPanelivaNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposFintotalNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
		iYPanelCamposFintotalNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposFintotalNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposFintotalNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoPuntoVenta.add(this.jPaneldescuentoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposFintotalNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
		iYPanelCamposFintotalNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposFintotalNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposFintotalNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoPuntoVenta.add(this.jPanelfinanciamientoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposFintotalNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
		iYPanelCamposFintotalNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposFintotalNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposFintotalNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoPuntoVenta.add(this.jPanelfleteNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposFintotalNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
		iYPanelCamposFintotalNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposFintotalNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposFintotalNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoPuntoVenta.add(this.jPaneliceNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposFintotalNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
		iYPanelCamposFintotalNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposFintotalNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposFintotalNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoPuntoVenta.add(this.jPanelotrosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposFintotalNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
		iYPanelCamposFintotalNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposFintotalNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposFintotalNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoPuntoVenta.add(this.jPanelsub_totalNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposFintotalNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
		iYPanelCamposFintotalNotaCreditoPuntoVenta++;
	}
	this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iYPanelCamposFintotalNotaCreditoPuntoVenta;
	this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iXPanelCamposFintotalNotaCreditoPuntoVenta++;
	this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotaCreditoPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalNotaCreditoPuntoVenta.add(this.jPaneltotalNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);



	if(iXPanelCamposFintotalNotaCreditoPuntoVenta % 3==0) {
		iXPanelCamposFintotalNotaCreditoPuntoVenta=0;
		iYPanelCamposFintotalNotaCreditoPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesNotaCreditoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesNotaCreditoPuntoVenta.setLayout(gridaBagLayoutAccionesNotaCreditoPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNotaCreditoPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioNotaCreditoPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioNotaCreditoPuntoVenta);
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNotaCreditoPuntoVenta.add(this.jComboBoxTiposAccionesFormularioNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNotaCreditoPuntoVenta.add(this.jCheckBoxPostAccionNuevoNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.notacreditopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNotaCreditoPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.notacreditopuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioNotaCreditoPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesNotaCreditoPuntoVenta.add(this.jButtonModificarNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);							

		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesNotaCreditoPuntoVenta.add(this.jButtonEliminarNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
			
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesNotaCreditoPuntoVenta.add(this.jButtonActualizarNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);


		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesNotaCreditoPuntoVenta.add(this.jButtonGuardarCambiosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);	
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = 0;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesNotaCreditoPuntoVenta.add(this.jButtonCancelarNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNotaCreditoPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNotaCreditoPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.notacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsNotaCreditoPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNotaCreditoPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =0;
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNotaCreditoPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NotaCreditoPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNotaCreditoPuntoVenta = new NotaCreditoPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Nota Credito DATOS");
			
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
		    
			NotaCreditoPuntoVentaModel notacreditopuntoventaModel=new NotaCreditoPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//NotaCreditoPuntoVentaModel.NotaCreditoPuntoVentaFocusTraversalPolicy notacreditopuntoventaFocusTraversalPolicy = notacreditopuntoventaModel.new NotaCreditoPuntoVentaFocusTraversalPolicy(this);
			
			//notacreditopuntoventaFocusTraversalPolicy.setnotacreditopuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(notacreditopuntoventaModel);
			
			
			this.jContentPaneDetalleNotaCreditoPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNotaCreditoPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleNotaCreditoPuntoVenta.setLayout(gridaBagLayoutDetalleNotaCreditoPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNotaCreditoPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta=   new JScrollPane(jContentPaneDetalleNotaCreditoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleNotaCreditoPuntoVenta.add(jPanelCamposNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);
			
			
			
			
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
						&& notacreditopuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleNotaCreditoPuntoVenta(this.puedeCargarPorParteDetalleNotaCreditoPuntoVenta,false,-1);
					
					if(this.notacreditopuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNotaCreditoPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
						this.jContentPaneDetalleNotaCreditoPuntoVenta.add(this.jTabbedPaneRelacionesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNotaCreditoPuntoVenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleNotaCreditoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;

		this.jContentPaneDetalleNotaCreditoPuntoVenta.add(jPanelCamposFintotalNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNotaCreditoPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsNotaCreditoPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleNotaCreditoPuntoVenta.add(jPanelCamposOcultosNotaCreditoPuntoVenta, gridBagConstraintsNotaCreditoPuntoVenta);
				
					this.jPanelCamposOcultosNotaCreditoPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	        this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNotaCreditoPuntoVenta.add(this.jPanelAccionesFormularioNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);							
			
			
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleNotaCreditoPuntoVenta.add(this.jPanelAccionesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNotaCreditoPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta=   new JScrollPane(this.jPanelCamposNotaCreditoPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
			this.gridBagConstraintsNotaCreditoPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNotaCreditoPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNotaCreditoPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);			
			
			this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
			
			
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		
			
		this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNotaCreditoPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNotaCreditoPuntoVenta, this.gridBagConstraintsNotaCreditoPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNotaCreditoPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionNotaCreditoPuntoVenta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleNotaCreditoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallenotacreditopuntoventaSessionBean=new DetalleNotaCreditoPuntoVentaSessionBean();
		this.detallenotacreditopuntoventaSessionBean.setConGuardarRelaciones(false);
		this.detallenotacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.detallenotacreditopuntoventaBeanSwingJInternalFrame=null;//new DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallenotacreditopuntoventaBeanSwingJInternalFramePopup=new DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallenotacreditopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {

				DetalleNotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleNotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=NotaCreditoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallenotacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.detallenotacreditopuntoventaBeanSwingJInternalFrame=new DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallenotacreditopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallenotacreditopuntoventaBeanSwingJInternalFrame.setdetallenotacreditopuntoventaSessionBean(this.detallenotacreditopuntoventaSessionBean);

				//this.gridBagConstraintsNotaCreditoPuntoVenta = new GridBagConstraints();
				//this.gridBagConstraintsNotaCreditoPuntoVenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsNotaCreditoPuntoVenta.gridx = 0;
				//this.jContentPaneDetalleNotaCreditoPuntoVenta.add(this.detallenotacreditopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsNotaCreditoPuntoVenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesNotaCreditoPuntoVenta.add("Detalle Nota Creditos",this.detallenotacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesNotaCreditoPuntoVenta.setComponentAt(iIndexTab,this.detallenotacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleNotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallenotacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.detallenotacreditopuntoventaBeanSwingJInternalFrame=null;//new DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallenotacreditopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleNotaCreditoPuntoVenta) {
					this.jTabbedPaneRelacionesNotaCreditoPuntoVenta.add("Detalle Nota Creditos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame(List<NotaCreditoPuntoVenta> notacreditopuntoventas,NotaCreditoPuntoVenta notacreditopuntoventa,DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame detallenotacreditopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallenotacreditopuntoventaBeanSwingJInternalFrame=new DetalleNotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallenotacreditopuntoventaBeanSwingJInternalFrame.getDetalleNotaCreditoPuntoVentaLogic().setConnexion(this.notacreditopuntoventaLogic.getConnexion());

					detallenotacreditopuntoventaBeanSwingJInternalFrame.setnotacreditopuntoventasForeignKey(notacreditopuntoventas);
					detallenotacreditopuntoventaBeanSwingJInternalFrame.setnotacreditopuntoventaForeignKey(notacreditopuntoventa);
					detallenotacreditopuntoventaBeanSwingJInternalFrame.detallenotacreditopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionNotaCreditoPuntoVenta(true);
					detallenotacreditopuntoventaBeanSwingJInternalFrame.detallenotacreditopuntoventaSessionBean.setlidNotaCreditoPuntoVentaActual(notacreditopuntoventa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallenotacreditopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleNotaCreditoPuntoVenta(detallenotacreditopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallenotacreditopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaNotaCreditoPuntoVenta(true);
					detallenotacreditopuntoventaBeanSwingJInternalFrame.setid_factura_punto_ventaFK_IdNotaCreditoPuntoVenta(notacreditopuntoventa.getId());

					if(!this.conCargarFormDetalle) {
						detallenotacreditopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallenotacreditopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameNotaCreditoPuntoVentaForeignKey(notacreditopuntoventa,1,false,true,true);
					detallenotacreditopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallenotacreditopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdNotaCreditoPuntoVenta");
					detallenotacreditopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdNotaCreditoPuntoVenta");
					detallenotacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleNotaCreditoPuntoVenta(true);
					detallenotacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleNotaCreditoPuntoVenta("n",detallenotacreditopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallenotacreditopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallenotacreditopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					detallenotacreditopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallenotacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleNotaCreditoPuntoVenta("relacionado");
					} else {
						detallenotacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleNotaCreditoPuntoVenta("no_relacionado");
					}

					detallenotacreditopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleNotaCreditoPuntoVenta().setVisible(false);

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
