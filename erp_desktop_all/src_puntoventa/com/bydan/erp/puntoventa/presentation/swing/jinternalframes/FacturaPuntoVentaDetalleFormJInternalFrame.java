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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.puntoventa.util.FacturaPuntoVentaConstantesFunciones;

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
public class FacturaPuntoVentaDetalleFormJInternalFrame extends FacturaPuntoVentaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturaPuntoVenta;
	
	protected JMenuBar jmenuBarDetalleFacturaPuntoVenta;
	
	protected JMenu jmenuDetalleFacturaPuntoVenta;
	protected JMenu jmenuDetalleArchivoFacturaPuntoVenta;
	protected JMenu jmenuDetalleAccionesFacturaPuntoVenta;
	protected JMenu jmenuDetalleDatosFacturaPuntoVenta;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaPuntoVenta;	
	protected GridBagConstraints gridBagConstraintsFacturaPuntoVenta;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturaPuntoVentaBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturaPuntoVenta;		
	
	
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

	protected TipoPrecioBeanSwingJInternalFrame tipoprecioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoprecio="";

	protected MesaBeanSwingJInternalFrame mesaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mesa="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoFacturaPuntoVentaBeanSwingJInternalFrame tipofacturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipofacturapuntoventa="";

	protected EstadoFacturaPuntoVentaBeanSwingJInternalFrame estadofacturapuntoventaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadofacturapuntoventa="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public FacturaPuntoVentaSessionBean facturapuntoventaSessionBean;
	
	

	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame=null;
	public FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteFormaPagoPuntoVenta=false;
	public FormaPagoPuntoVentaSessionBean formapagopuntoventaSessionBean;

	public DetalleFacturaPuntoVentaBeanSwingJInternalFrame detallefacturapuntoventaBeanSwingJInternalFrame=null;
	public DetalleFacturaPuntoVentaBeanSwingJInternalFrame detallefacturapuntoventaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleFacturaPuntoVenta=false;
	public DetalleFacturaPuntoVentaSessionBean detallefacturapuntoventaSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public VendedorSessionBean vendedorSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public CajaSessionBean cajaSessionBean;
	public TipoPrecioSessionBean tipoprecioSessionBean;
	public MesaSessionBean mesaSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoFacturaPuntoVentaSessionBean tipofacturapuntoventaSessionBean;
	public EstadoFacturaPuntoVentaSessionBean estadofacturapuntoventaSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;	
	
	public FacturaPuntoVentaLogic facturapuntoventaLogic;
	
	public JScrollPane jScrollPanelDatosFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosEdicionFacturaPuntoVenta;
	public JScrollPane jScrollPanelDatosGeneralFacturaPuntoVenta;
	
	protected JPanel jPanelCamposFacturaPuntoVenta;    
	protected JPanel jPanelCamposOcultosFacturaPuntoVenta;    	
	protected JPanel jPanelAccionesFacturaPuntoVenta;
	protected JPanel jPanelAccionesFormularioFacturaPuntoVenta;
    
	
	
	protected Integer iXPanelCamposFacturaPuntoVenta=0;
	protected Integer iYPanelCamposFacturaPuntoVenta=0;
	
	protected Integer iXPanelCamposOcultosFacturaPuntoVenta=0;
	protected Integer iYPanelCamposOcultosFacturaPuntoVenta=0;
	
	

	protected JPanel jPanelCamposFintotalFacturaPuntoVenta;
	protected Integer iXPanelCamposFintotalFacturaPuntoVenta=0;
	protected Integer iYPanelCamposFintotalFacturaPuntoVenta=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturaPuntoVenta;
	public JButton jButtonModificarFacturaPuntoVenta;
	public JButton jButtonActualizarFacturaPuntoVenta;
    public JButton jButtonEliminarFacturaPuntoVenta;
	public JButton jButtonCancelarFacturaPuntoVenta;
    public JButton jButtonGuardarCambiosFacturaPuntoVenta;
	public JButton jButtonGuardarCambiosTablaFacturaPuntoVenta;
	protected JButton jButtonCerrarFacturaPuntoVenta;
	
	
	protected JButton jButtonProcesarInformacionFacturaPuntoVenta;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturaPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturaPuntoVenta;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturaPuntoVenta;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaPuntoVenta;
	protected JButton jButtonModificarToolBarFacturaPuntoVenta;
	protected JButton jButtonActualizarToolBarFacturaPuntoVenta;
    protected JButton jButtonEliminarToolBarFacturaPuntoVenta;
	protected JButton jButtonCancelarToolBarFacturaPuntoVenta;
    protected JButton jButtonGuardarCambiosToolBarFacturaPuntoVenta;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturaPuntoVenta;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaPuntoVenta;
	protected JButton jButtonCerrarToolBarFacturaPuntoVenta;
	
	protected JButton jButtonProcesarInformacionToolBarFacturaPuntoVenta;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaPuntoVenta;
	protected JMenuItem jMenuItemModificarFacturaPuntoVenta;
	protected JMenuItem jMenuItemActualizarFacturaPuntoVenta;
    protected JMenuItem jMenuItemEliminarFacturaPuntoVenta;
	protected JMenuItem jMenuItemCancelarFacturaPuntoVenta;
    protected JMenuItem jMenuItemGuardarCambiosFacturaPuntoVenta;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaPuntoVenta;
	protected JMenuItem jMenuItemCerrarFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleCerrarFacturaPuntoVenta;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaPuntoVenta;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturaPuntoVenta;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaPuntoVenta;
	protected JMenuItem jMenuItemMostrarOcultarFacturaPuntoVenta;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaPuntoVenta;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaPuntoVenta;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturaPuntoVenta;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturaPuntoVenta;
	public JLabel jLabelIdFacturaPuntoVenta;
	public JLabel jLabelidFacturaPuntoVenta;
	public JButton jButtonidFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialFacturaPuntoVenta;
	public JLabel jLabelnumero_secuencialFacturaPuntoVenta;
	public JTextField jTextFieldnumero_secuencialFacturaPuntoVenta;
	public JButton jButtonnumero_secuencialFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_clienteFacturaPuntoVenta;
	public JLabel jLabelcodigo_clienteFacturaPuntoVenta;
	public JTextField jTextFieldcodigo_clienteFacturaPuntoVenta;
	public JButton jButtoncodigo_clienteFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clienteFacturaPuntoVenta;
	public JLabel jLabelnombre_clienteFacturaPuntoVenta;
	public JTextArea jTextAreanombre_clienteFacturaPuntoVenta;
	public JScrollPane jscrollPanenombre_clienteFacturaPuntoVenta;
	public JButton jButtonnombre_clienteFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltarjeta_clienteFacturaPuntoVenta;
	public JLabel jLabeltarjeta_clienteFacturaPuntoVenta;
	public JTextField jTextFieldtarjeta_clienteFacturaPuntoVenta;
	public JButton jButtontarjeta_clienteFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldireccion_clienteFacturaPuntoVenta;
	public JLabel jLabeldireccion_clienteFacturaPuntoVenta;
	public JTextArea jTextAreadireccion_clienteFacturaPuntoVenta;
	public JScrollPane jscrollPanedireccion_clienteFacturaPuntoVenta;
	public JButton jButtondireccion_clienteFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltelefono_clienteFacturaPuntoVenta;
	public JLabel jLabeltelefono_clienteFacturaPuntoVenta;
	public JTextArea jTextAreatelefono_clienteFacturaPuntoVenta;
	public JScrollPane jscrollPanetelefono_clienteFacturaPuntoVenta;
	public JButton jButtontelefono_clienteFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfechaFacturaPuntoVenta;
	public JLabel jLabelfechaFacturaPuntoVenta;
	//public JFormattedTextField jDateChooserfechaFacturaPuntoVenta;

	public JDateChooser jDateChooserfechaFacturaPuntoVenta;
	public JButton jButtonfechaFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelhoraFacturaPuntoVenta;
	public JLabel jLabelhoraFacturaPuntoVenta;
	public JSpinner jSpinnerhoraFacturaPuntoVenta= new JSpinner(new SpinnerDateModel());;
	public JButton jButtonhoraFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaFacturaPuntoVenta;
	public JLabel jLabeltotal_ivaFacturaPuntoVenta;
	public JTextField jTextFieldtotal_ivaFacturaPuntoVenta;
	public JButton jButtontotal_ivaFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_sin_ivaFacturaPuntoVenta;
	public JLabel jLabeltotal_sin_ivaFacturaPuntoVenta;
	public JTextField jTextFieldtotal_sin_ivaFacturaPuntoVenta;
	public JButton jButtontotal_sin_ivaFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelivaFacturaPuntoVenta;
	public JLabel jLabelivaFacturaPuntoVenta;
	public JTextField jTextFieldivaFacturaPuntoVenta;
	public JButton jButtonivaFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoFacturaPuntoVenta;
	public JLabel jLabeldescuentoFacturaPuntoVenta;
	public JTextField jTextFielddescuentoFacturaPuntoVenta;
	public JButton jButtondescuentoFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfinanciamientoFacturaPuntoVenta;
	public JLabel jLabelfinanciamientoFacturaPuntoVenta;
	public JTextField jTextFieldfinanciamientoFacturaPuntoVenta;
	public JButton jButtonfinanciamientoFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelfleteFacturaPuntoVenta;
	public JLabel jLabelfleteFacturaPuntoVenta;
	public JTextField jTextFieldfleteFacturaPuntoVenta;
	public JButton jButtonfleteFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneliceFacturaPuntoVenta;
	public JLabel jLabeliceFacturaPuntoVenta;
	public JTextField jTextFieldiceFacturaPuntoVenta;
	public JButton jButtoniceFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelotrosFacturaPuntoVenta;
	public JLabel jLabelotrosFacturaPuntoVenta;
	public JTextField jTextFieldotrosFacturaPuntoVenta;
	public JButton jButtonotrosFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalFacturaPuntoVenta;
	public JLabel jLabelsub_totalFacturaPuntoVenta;
	public JTextField jTextFieldsub_totalFacturaPuntoVenta;
	public JButton jButtonsub_totalFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPaneltotalFacturaPuntoVenta;
	public JLabel jLabeltotalFacturaPuntoVenta;
	public JTextField jTextFieldtotalFacturaPuntoVenta;
	public JButton jButtontotalFacturaPuntoVentaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFacturaPuntoVenta;
	public JLabel jLabelid_empresaFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturaPuntoVenta;
	public JButton jButtonid_empresaFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_empresaFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFacturaPuntoVenta;
	public JLabel jLabelid_sucursalFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFacturaPuntoVenta;
	public JButton jButtonid_sucursalFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_sucursalFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioFacturaPuntoVenta;
	public JLabel jLabelid_usuarioFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioFacturaPuntoVenta;
	public JButton jButtonid_usuarioFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_usuarioFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_vendedorFacturaPuntoVenta;
	public JLabel jLabelid_vendedorFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_vendedorFacturaPuntoVenta;
	public JButton jButtonid_vendedorFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_vendedorFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_vendedorFacturaPuntoVentaBusqueda= new JButtonMe();
	public JButton jButtonid_vendedorFacturaPuntoVentaArbol= new JButtonMe();

	public JPanel jPanelid_clienteFacturaPuntoVenta;
	public JLabel jLabelid_clienteFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFacturaPuntoVenta;
	public JButton jButtonid_clienteFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_clienteFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_clienteFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_cajaFacturaPuntoVenta;
	public JLabel jLabelid_cajaFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cajaFacturaPuntoVenta;
	public JButton jButtonid_cajaFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_cajaFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_cajaFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_precioFacturaPuntoVenta;
	public JLabel jLabelid_tipo_precioFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_precioFacturaPuntoVenta;
	public JButton jButtonid_tipo_precioFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_precioFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_precioFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesaFacturaPuntoVenta;
	public JLabel jLabelid_mesaFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesaFacturaPuntoVenta;
	public JButton jButtonid_mesaFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_mesaFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_mesaFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoFacturaPuntoVenta;
	public JLabel jLabelid_formatoFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoFacturaPuntoVenta;
	public JButton jButtonid_formatoFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_formatoFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_formatoFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_factura_punto_ventaFacturaPuntoVenta;
	public JLabel jLabelid_tipo_factura_punto_ventaFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta;
	public JButton jButtonid_tipo_factura_punto_ventaFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_factura_punto_ventaFacturaPuntoVenta;
	public JLabel jLabelid_estado_factura_punto_ventaFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta;
	public JButton jButtonid_estado_factura_punto_ventaFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_estado_factura_punto_ventaFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableFacturaPuntoVenta;
	public JLabel jLabelid_asiento_contableFacturaPuntoVenta;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableFacturaPuntoVenta;
	public JButton jButtonid_asiento_contableFacturaPuntoVenta= new JButtonMe();
	public JButton jButtonid_asiento_contableFacturaPuntoVentaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableFacturaPuntoVentaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturaPuntoVenta;
	
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
	
	public FacturaPuntoVentaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturaPuntoVenta=new JPanel();
				this.jPanelAccionesFormularioFacturaPuntoVenta=new JPanel();
				this.jmenuBarDetalleFacturaPuntoVenta=new JMenuBar();
				this.jTtoolBarDetalleFacturaPuntoVenta=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaPuntoVentaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturaPuntoVentaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaPuntoVentaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaPuntoVentaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaPuntoVentaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaPuntoVenta No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturaPuntoVenta() {
		return this.jButtonActualizarToolBarFacturaPuntoVenta;
	}
	
	public JButton getjButtonEliminarToolBarFacturaPuntoVenta() {
		return this.jButtonEliminarToolBarFacturaPuntoVenta;
	}
	
	public JButton getjButtonCancelarToolBarFacturaPuntoVenta() {
		return this.jButtonCancelarToolBarFacturaPuntoVenta;
	}		
	
	public JButton getjButtonProcesarInformacionFacturaPuntoVenta() {
		return this.jButtonProcesarInformacionFacturaPuntoVenta;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaPuntoVenta)	{
		this.jButtonProcesarInformacionFacturaPuntoVenta = jButtonProcesarInformacionFacturaPuntoVenta;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaPuntoVenta(
			JComboBox jComboBoxTiposRelacionesFacturaPuntoVenta) {
		this.jComboBoxTiposRelacionesFacturaPuntoVenta = jComboBoxTiposRelacionesFacturaPuntoVenta;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesFacturaPuntoVenta = jComboBoxTiposAccionesFacturaPuntoVenta;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturaPuntoVenta() {
		return this.jComboBoxTiposAccionesFormularioFacturaPuntoVenta;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturaPuntoVenta(
			JComboBox jComboBoxTiposAccionesFormularioFacturaPuntoVenta) {
		this.jComboBoxTiposAccionesFormularioFacturaPuntoVenta = jComboBoxTiposAccionesFormularioFacturaPuntoVenta;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturapuntoventaSessionBean=new FacturaPuntoVentaSessionBean();
		
		this.facturapuntoventaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturapuntoventaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturapuntoventaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		//this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaPuntoVentaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Punto Venta MANTENIMIENTO"));
		
		
		if(iWidth > 2850) {
			iWidth=2850;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturaPuntoVenta= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturaPuntoVenta=new JButtonMe();
				this.jButtonModificarToolBarFacturaPuntoVenta=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"actualizar","actualizar","Actualizar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"eliminar","eliminar","Eliminar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"cancelar","cancelar","Cancelar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturaPuntoVenta=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturaPuntoVenta,this.jTtoolBarDetalleFacturaPuntoVenta,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturaPuntoVenta=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturaPuntoVenta=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturaPuntoVenta=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturaPuntoVenta=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturaPuntoVenta=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaPuntoVenta= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaPuntoVenta.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaPuntoVenta,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturaPuntoVenta= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturaPuntoVenta.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturaPuntoVenta,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturaPuntoVenta= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturaPuntoVenta.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturaPuntoVenta,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturaPuntoVenta= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturaPuntoVenta.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturaPuntoVenta,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturaPuntoVenta= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturaPuntoVenta.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturaPuntoVenta,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturaPuntoVenta= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaPuntoVenta.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaPuntoVenta,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturaPuntoVenta= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturaPuntoVenta.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturaPuntoVenta,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaPuntoVenta= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaPuntoVenta.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaPuntoVenta,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturaPuntoVenta.add(this.jMenuItemDetalleCerrarFacturaPuntoVenta);
		
		this.jmenuDetalleAccionesFacturaPuntoVenta.add(this.jMenuItemActualizarFacturaPuntoVenta);
		this.jmenuDetalleAccionesFacturaPuntoVenta.add(this.jMenuItemEliminarFacturaPuntoVenta);
		this.jmenuDetalleAccionesFacturaPuntoVenta.add(this.jMenuItemCancelarFacturaPuntoVenta);		
		
		//this.jmenuDetalleDatosFacturaPuntoVenta.add(this.jMenuItemDetalleAbrirOrderByFacturaPuntoVenta);				
		this.jmenuDetalleDatosFacturaPuntoVenta.add(this.jMenuItemDetalleMostarOcultarFacturaPuntoVenta);				
				
		//this.jmenuDetalleAccionesFacturaPuntoVenta.add(this.jMenuItemGuardarCambiosFacturaPuntoVenta);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturaPuntoVenta.add(this.jmenuDetalleArchivoFacturaPuntoVenta);		
		this.jmenuBarDetalleFacturaPuntoVenta.add(this.jmenuDetalleAccionesFacturaPuntoVenta);		
		this.jmenuBarDetalleFacturaPuntoVenta.add(this.jmenuDetalleDatosFacturaPuntoVenta);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFacturaPuntoVenta.add(this.jmenuDetalleFacturaPuntoVenta);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposFacturaPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturaPuntoVenta = new JLabelMe();
		jLabelIdFacturaPuntoVenta.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturaPuntoVenta = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturaPuntoVenta= new GridBagLayout();

		this.jPanelidFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);

		jLabelidFacturaPuntoVenta = new JLabel();
		jLabelidFacturaPuntoVenta.setText("Id");

		jLabelidFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_secuencialFacturaPuntoVenta = new JLabelMe();
		this.jLabelnumero_secuencialFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialFacturaPuntoVenta.setToolTipText("No Secuencial");
		this.jLabelnumero_secuencialFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelnumero_secuencialFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldnumero_secuencialFacturaPuntoVenta= new JTextFieldMe();

		jTextFieldnumero_secuencialFacturaPuntoVenta.setEnabled(false);
		jTextFieldnumero_secuencialFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonnumero_secuencialFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_clienteFacturaPuntoVenta = new JLabelMe();
		this.jLabelcodigo_clienteFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_CODIGOCLIENTE+" : *");
		this.jLabelcodigo_clienteFacturaPuntoVenta.setToolTipText("Codigo Cliente");
		this.jLabelcodigo_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_clienteFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_clienteFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_CODIGOCLIENTE);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelcodigo_clienteFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldcodigo_clienteFacturaPuntoVenta= new JTextFieldMe();

		jTextFieldcodigo_clienteFacturaPuntoVenta.setEnabled(false);
		jTextFieldcodigo_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_clienteFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtoncodigo_clienteFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_clienteFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_clienteFacturaPuntoVentaBusqueda.setText("U");
		this.jButtoncodigo_clienteFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_clienteFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_clienteFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_clienteFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_clienteFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_clienteFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_clienteFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clienteFacturaPuntoVenta = new JLabelMe();
		this.jLabelnombre_clienteFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clienteFacturaPuntoVenta.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clienteFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clienteFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelnombre_clienteFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextAreanombre_clienteFacturaPuntoVenta= new JTextAreaMe();
		jTextAreanombre_clienteFacturaPuntoVenta.setEnabled(false);
		jTextAreanombre_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clienteFacturaPuntoVenta.setLineWrap(true);
		jTextAreanombre_clienteFacturaPuntoVenta.setWrapStyleWord(true);
		jTextAreanombre_clienteFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clienteFacturaPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clienteFacturaPuntoVenta = new JScrollPane(jTextAreanombre_clienteFacturaPuntoVenta);
		jscrollPanenombre_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanenombre_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonnombre_clienteFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonnombre_clienteFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clienteFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clienteFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonnombre_clienteFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clienteFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clienteFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clienteFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clienteFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clienteFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clienteFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltarjeta_clienteFacturaPuntoVenta = new JLabelMe();
		this.jLabeltarjeta_clienteFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_TARJETACLIENTE+" :");
		this.jLabeltarjeta_clienteFacturaPuntoVenta.setToolTipText("Tarjeta Cliente");
		this.jLabeltarjeta_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltarjeta_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltarjeta_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltarjeta_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltarjeta_clienteFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltarjeta_clienteFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_TARJETACLIENTE);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPaneltarjeta_clienteFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldtarjeta_clienteFacturaPuntoVenta= new JTextFieldMe();

		jTextFieldtarjeta_clienteFacturaPuntoVenta.setEnabled(false);
		jTextFieldtarjeta_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtarjeta_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtarjeta_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtarjeta_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontarjeta_clienteFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtontarjeta_clienteFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjeta_clienteFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontarjeta_clienteFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontarjeta_clienteFacturaPuntoVentaBusqueda.setText("U");
		this.jButtontarjeta_clienteFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontarjeta_clienteFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontarjeta_clienteFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtarjeta_clienteFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtarjeta_clienteFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tarjeta_clienteFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontarjeta_clienteFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldireccion_clienteFacturaPuntoVenta = new JLabelMe();
		this.jLabeldireccion_clienteFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_DIRECCIONCLIENTE+" :");
		this.jLabeldireccion_clienteFacturaPuntoVenta.setToolTipText("Direccion Cliente");
		this.jLabeldireccion_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldireccion_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldireccion_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldireccion_clienteFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldireccion_clienteFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_DIRECCIONCLIENTE);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPaneldireccion_clienteFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextAreadireccion_clienteFacturaPuntoVenta= new JTextAreaMe();
		jTextAreadireccion_clienteFacturaPuntoVenta.setEnabled(false);
		jTextAreadireccion_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadireccion_clienteFacturaPuntoVenta.setLineWrap(true);
		jTextAreadireccion_clienteFacturaPuntoVenta.setWrapStyleWord(true);
		jTextAreadireccion_clienteFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadireccion_clienteFacturaPuntoVenta.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadireccion_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedireccion_clienteFacturaPuntoVenta = new JScrollPane(jTextAreadireccion_clienteFacturaPuntoVenta);
		jscrollPanedireccion_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccion_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedireccion_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondireccion_clienteFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtondireccion_clienteFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clienteFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondireccion_clienteFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondireccion_clienteFacturaPuntoVentaBusqueda.setText("U");
		this.jButtondireccion_clienteFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondireccion_clienteFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondireccion_clienteFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadireccion_clienteFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadireccion_clienteFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"direccion_clienteFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondireccion_clienteFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltelefono_clienteFacturaPuntoVenta = new JLabelMe();
		this.jLabeltelefono_clienteFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_TELEFONOCLIENTE+" :");
		this.jLabeltelefono_clienteFacturaPuntoVenta.setToolTipText("Telefono Cliente");
		this.jLabeltelefono_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltelefono_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltelefono_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltelefono_clienteFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltelefono_clienteFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_TELEFONOCLIENTE);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPaneltelefono_clienteFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextAreatelefono_clienteFacturaPuntoVenta= new JTextAreaMe();
		jTextAreatelefono_clienteFacturaPuntoVenta.setEnabled(false);
		jTextAreatelefono_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreatelefono_clienteFacturaPuntoVenta.setLineWrap(true);
		jTextAreatelefono_clienteFacturaPuntoVenta.setWrapStyleWord(true);
		jTextAreatelefono_clienteFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreatelefono_clienteFacturaPuntoVenta.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreatelefono_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanetelefono_clienteFacturaPuntoVenta = new JScrollPane(jTextAreatelefono_clienteFacturaPuntoVenta);
		jscrollPanetelefono_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetelefono_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanetelefono_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtontelefono_clienteFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtontelefono_clienteFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clienteFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontelefono_clienteFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontelefono_clienteFacturaPuntoVentaBusqueda.setText("U");
		this.jButtontelefono_clienteFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontelefono_clienteFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontelefono_clienteFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreatelefono_clienteFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreatelefono_clienteFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"telefono_clienteFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontelefono_clienteFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfechaFacturaPuntoVenta = new JLabelMe();
		this.jLabelfechaFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaFacturaPuntoVenta.setToolTipText("Fecha");
		this.jLabelfechaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelfechaFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		//jFormattedTextFieldfechaFacturaPuntoVenta= new JFormattedTextFieldMe();

		jDateChooserfechaFacturaPuntoVenta= new JDateChooser();
		jDateChooserfechaFacturaPuntoVenta.setEnabled(false);
		jDateChooserfechaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaFacturaPuntoVenta.setDate(new Date());
		jDateChooserfechaFacturaPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaFacturaPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfechaFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonfechaFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelhoraFacturaPuntoVenta = new JLabelMe();
		this.jLabelhoraFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_HORA+" : *");
		this.jLabelhoraFacturaPuntoVenta.setToolTipText("Hora");
		this.jLabelhoraFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelhoraFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelhoraFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelhoraFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelhoraFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_HORA);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelhoraFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		//jFormattedTextFieldhoraFacturaPuntoVenta= new JFormattedTextFieldMe();

		jSpinnerhoraFacturaPuntoVenta= new JSpinner(new SpinnerDateModel());;
		jSpinnerhoraFacturaPuntoVenta.setEnabled(false);
		JSpinner.DateEditor timeEditorhoraFacturaPuntoVenta = new JSpinner.DateEditor(jSpinnerhoraFacturaPuntoVenta, "HH:mm:ss");

		jSpinnerhoraFacturaPuntoVenta.setEditor(timeEditorhoraFacturaPuntoVenta);

		jSpinnerhoraFacturaPuntoVenta.setValue(new Date());

		jSpinnerhoraFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jSpinnerhoraFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldHora(jSpinnerhoraFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jSpinnerhoraFacturaPuntoVenta.setValue(new Date());
		//jSpinnerhoraFacturaPuntoVenta.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldhoraFacturaPuntoVenta.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonhoraFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonhoraFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonhoraFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonhoraFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonhoraFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonhoraFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonhoraFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jSpinnerhoraFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jSpinnerhoraFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"horaFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonhoraFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaFacturaPuntoVenta = new JLabelMe();
		this.jLabeltotal_ivaFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaFacturaPuntoVenta.setToolTipText("Total Iva");
		this.jLabeltotal_ivaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPaneltotal_ivaFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldtotal_ivaFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldtotal_ivaFacturaPuntoVenta.setEnabled(false);
		jTextFieldtotal_ivaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaFacturaPuntoVenta.setText("0.0");

		this.jButtontotal_ivaFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotal_ivaFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaFacturaPuntoVentaBusqueda.setText("U");
		this.jButtontotal_ivaFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_sin_ivaFacturaPuntoVenta = new JLabelMe();
		this.jLabeltotal_sin_ivaFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA+" : *");
		this.jLabeltotal_sin_ivaFacturaPuntoVenta.setToolTipText("Total Sin Iva");
		this.jLabeltotal_sin_ivaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_sin_ivaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_sin_ivaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_sin_ivaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_sin_ivaFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_TOTALSINIVA);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPaneltotal_sin_ivaFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldtotal_sin_ivaFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldtotal_sin_ivaFacturaPuntoVenta.setEnabled(false);
		jTextFieldtotal_sin_ivaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_sin_ivaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_sin_ivaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_sin_ivaFacturaPuntoVenta.setText("0.0");

		this.jButtontotal_sin_ivaFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotal_sin_ivaFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_sin_ivaFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_sin_ivaFacturaPuntoVentaBusqueda.setText("U");
		this.jButtontotal_sin_ivaFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_sin_ivaFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_sin_ivaFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_sin_ivaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_sin_ivaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_sin_ivaFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_sin_ivaFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelivaFacturaPuntoVenta = new JLabelMe();
		this.jLabelivaFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaFacturaPuntoVenta.setToolTipText("Iva");
		this.jLabelivaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelivaFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldivaFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldivaFacturaPuntoVenta.setEnabled(false);
		jTextFieldivaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaFacturaPuntoVenta.setText("0.0");

		this.jButtonivaFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonivaFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonivaFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoFacturaPuntoVenta = new JLabelMe();
		this.jLabeldescuentoFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoFacturaPuntoVenta.setToolTipText("Descuento");
		this.jLabeldescuentoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPaneldescuentoFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFielddescuentoFacturaPuntoVenta= new JTextFieldMe();
		jTextFielddescuentoFacturaPuntoVenta.setEnabled(false);
		jTextFielddescuentoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoFacturaPuntoVenta.setText("0.0");

		this.jButtondescuentoFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtondescuentoFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoFacturaPuntoVentaBusqueda.setText("U");
		this.jButtondescuentoFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfinanciamientoFacturaPuntoVenta = new JLabelMe();
		this.jLabelfinanciamientoFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_FINANCIAMIENTO+" : *");
		this.jLabelfinanciamientoFacturaPuntoVenta.setToolTipText("Financiamiento");
		this.jLabelfinanciamientoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfinanciamientoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfinanciamientoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfinanciamientoFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfinanciamientoFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_FINANCIAMIENTO);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelfinanciamientoFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldfinanciamientoFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldfinanciamientoFacturaPuntoVenta.setEnabled(false);
		jTextFieldfinanciamientoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfinanciamientoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfinanciamientoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfinanciamientoFacturaPuntoVenta.setText("0.0");

		this.jButtonfinanciamientoFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfinanciamientoFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfinanciamientoFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfinanciamientoFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonfinanciamientoFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfinanciamientoFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfinanciamientoFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfinanciamientoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfinanciamientoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"financiamientoFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfinanciamientoFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelfleteFacturaPuntoVenta = new JLabelMe();
		this.jLabelfleteFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteFacturaPuntoVenta.setToolTipText("Flete");
		this.jLabelfleteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelfleteFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldfleteFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldfleteFacturaPuntoVenta.setEnabled(false);
		jTextFieldfleteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteFacturaPuntoVenta.setText("0.0");

		this.jButtonfleteFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonfleteFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonfleteFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeliceFacturaPuntoVenta = new JLabelMe();
		this.jLabeliceFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceFacturaPuntoVenta.setToolTipText("Ice");
		this.jLabeliceFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPaneliceFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldiceFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldiceFacturaPuntoVenta.setEnabled(false);
		jTextFieldiceFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceFacturaPuntoVenta.setText("0.0");

		this.jButtoniceFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtoniceFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceFacturaPuntoVentaBusqueda.setText("U");
		this.jButtoniceFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelotrosFacturaPuntoVenta = new JLabelMe();
		this.jLabelotrosFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_OTROS+" : *");
		this.jLabelotrosFacturaPuntoVenta.setToolTipText("Otros");
		this.jLabelotrosFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotrosFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotrosFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotrosFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotrosFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotrosFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_OTROS);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelotrosFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldotrosFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldotrosFacturaPuntoVenta.setEnabled(false);
		jTextFieldotrosFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotrosFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotrosFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotrosFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotrosFacturaPuntoVenta.setText("0.0");

		this.jButtonotrosFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonotrosFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotrosFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotrosFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotrosFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonotrosFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotrosFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotrosFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotrosFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotrosFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otrosFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotrosFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalFacturaPuntoVenta = new JLabelMe();
		this.jLabelsub_totalFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalFacturaPuntoVenta.setToolTipText("Sub Total");
		this.jLabelsub_totalFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelsub_totalFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldsub_totalFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldsub_totalFacturaPuntoVenta.setEnabled(false);
		jTextFieldsub_totalFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalFacturaPuntoVenta.setText("0.0");

		this.jButtonsub_totalFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonsub_totalFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonsub_totalFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalFacturaPuntoVentaBusqueda.setVisible(false);		}


					
		this.jLabeltotalFacturaPuntoVenta = new JLabelMe();
		this.jLabeltotalFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalFacturaPuntoVenta.setToolTipText("Total");
		this.jLabeltotalFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPaneltotalFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jTextFieldtotalFacturaPuntoVenta= new JTextFieldMe();
		jTextFieldtotalFacturaPuntoVenta.setEnabled(false);
		jTextFieldtotalFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalFacturaPuntoVenta.setText("0.0");

		this.jButtontotalFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtontotalFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalFacturaPuntoVentaBusqueda.setText("U");
		this.jButtontotalFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalFacturaPuntoVentaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturaPuntoVenta() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_empresaFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturaPuntoVenta.setToolTipText("Empresa");
		this.jLabelid_empresaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_empresaFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_empresaFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_empresaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturaPuntoVenta.setEnabled(false);

		this.jButtonid_empresaFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_empresaFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_empresaFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaPuntoVenta"));

		this.jButtonid_empresaFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_empresaFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_empresaFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_empresaFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaPuntoVentaUpdate"));



					
		this.jLabelid_sucursalFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_sucursalFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFacturaPuntoVenta.setToolTipText("Sucursal");
		this.jLabelid_sucursalFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_sucursalFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_sucursalFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_sucursalFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFacturaPuntoVenta.setEnabled(false);

		this.jButtonid_sucursalFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_sucursalFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_sucursalFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaPuntoVenta"));

		this.jButtonid_sucursalFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_sucursalFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_sucursalFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_sucursalFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_sucursalFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaPuntoVentaUpdate"));



					
		this.jLabelid_usuarioFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_usuarioFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioFacturaPuntoVenta.setToolTipText("Usuario");
		this.jLabelid_usuarioFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_usuarioFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_usuarioFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_usuarioFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioFacturaPuntoVenta.setEnabled(false);

		this.jButtonid_usuarioFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_usuarioFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_usuarioFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioFacturaPuntoVenta"));

		this.jButtonid_usuarioFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_usuarioFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_usuarioFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_usuarioFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_usuarioFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioFacturaPuntoVentaUpdate"));



					
		this.jLabelid_vendedorFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_vendedorFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDVENDEDOR+" : *");
		this.jLabelid_vendedorFacturaPuntoVenta.setToolTipText("Vendedor");
		this.jLabelid_vendedorFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_vendedorFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_vendedorFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_vendedorFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_vendedorFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDVENDEDOR);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_vendedorFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_vendedorFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_vendedorFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_vendedorFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_vendedorFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_vendedorFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_vendedorFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_vendedorFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_vendedorFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_vendedorFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_vendedorFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFacturaPuntoVenta"));

		this.jButtonid_vendedorFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_vendedorFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_vendedorFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_vendedorFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_vendedorFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_vendedorFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_vendedorFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_vendedorFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_vendedorFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_vendedorFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_vendedorFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_vendedorFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_vendedorFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFacturaPuntoVentaUpdate"));


		jButtonid_vendedorFacturaPuntoVentaArbol= new JButtonMe();
		jButtonid_vendedorFacturaPuntoVentaArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorFacturaPuntoVentaArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorFacturaPuntoVentaArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_vendedorFacturaPuntoVentaArbol.setText("Arbol");
		jButtonid_vendedorFacturaPuntoVentaArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_vendedorFacturaPuntoVentaArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_vendedorFacturaPuntoVentaArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_vendedorFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_vendedorFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_vendedorFacturaPuntoVentaArbol"));



					
		this.jLabelid_clienteFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_clienteFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteFacturaPuntoVenta.setToolTipText("Cliente");
		this.jLabelid_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_clienteFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_clienteFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_clienteFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_clienteFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaPuntoVenta"));

		this.jButtonid_clienteFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_clienteFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_clienteFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_clienteFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_clienteFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_clienteFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaPuntoVentaUpdate"));



					
		this.jLabelid_cajaFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_cajaFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDCAJA+" : *");
		this.jLabelid_cajaFacturaPuntoVenta.setToolTipText("Caja");
		this.jLabelid_cajaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cajaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cajaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cajaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cajaFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDCAJA);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_cajaFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_cajaFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_cajaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cajaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cajaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cajaFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_cajaFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cajaFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_cajaFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cajaFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cajaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaFacturaPuntoVenta"));

		this.jButtonid_cajaFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_cajaFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_cajaFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cajaFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cajaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cajaFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_cajaFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_cajaFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cajaFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cajaFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_cajaFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cajaFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cajaFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cajaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cajaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cajaFacturaPuntoVentaUpdate"));



					
		this.jLabelid_tipo_precioFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_tipo_precioFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDTIPOPRECIO+" : *");
		this.jLabelid_tipo_precioFacturaPuntoVenta.setToolTipText("Tipo Precio");
		this.jLabelid_tipo_precioFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_precioFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_precioFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_precioFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_precioFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDTIPOPRECIO);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_tipo_precioFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_tipo_precioFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_precioFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_precioFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_precioFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_precioFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_tipo_precioFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_precioFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_tipo_precioFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_precioFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_precioFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioFacturaPuntoVenta"));

		this.jButtonid_tipo_precioFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_precioFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_tipo_precioFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_precioFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_precioFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_precioFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_precioFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_tipo_precioFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_precioFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_precioFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_tipo_precioFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_precioFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_precioFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_precioFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_precioFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_precioFacturaPuntoVentaUpdate"));



					
		this.jLabelid_mesaFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_mesaFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDMESA+" : *");
		this.jLabelid_mesaFacturaPuntoVenta.setToolTipText("Mesa");
		this.jLabelid_mesaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesaFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDMESA);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_mesaFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_mesaFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_mesaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_mesaFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_mesaFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesaFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_mesaFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesaFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaFacturaPuntoVenta"));

		this.jButtonid_mesaFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_mesaFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesaFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_mesaFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesaFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesaFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_mesaFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_mesaFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesaFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesaFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_mesaFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesaFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesaFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesaFacturaPuntoVentaUpdate"));



					
		this.jLabelid_formatoFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_formatoFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoFacturaPuntoVenta.setToolTipText("Formato");
		this.jLabelid_formatoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_formatoFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_formatoFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_formatoFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_formatoFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_formatoFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoFacturaPuntoVenta"));

		this.jButtonid_formatoFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_formatoFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_formatoFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_formatoFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_formatoFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_formatoFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoFacturaPuntoVentaUpdate"));



					
		this.jLabelid_tipo_factura_punto_ventaFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_tipo_factura_punto_ventaFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDTIPOFACTURAPUNTOVENTA+" : *");
		this.jLabelid_tipo_factura_punto_ventaFacturaPuntoVenta.setToolTipText("Tipo");
		this.jLabelid_tipo_factura_punto_ventaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_factura_punto_ventaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_factura_punto_ventaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_factura_punto_ventaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_factura_punto_ventaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_factura_punto_ventaFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDTIPOFACTURAPUNTOVENTA);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_tipo_factura_punto_ventaFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_factura_punto_ventaFacturaPuntoVenta"));

		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_factura_punto_ventaFacturaPuntoVentaUpdate"));



					
		this.jLabelid_estado_factura_punto_ventaFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_estado_factura_punto_ventaFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDESTADOFACTURAPUNTOVENTA+" : *");
		this.jLabelid_estado_factura_punto_ventaFacturaPuntoVenta.setToolTipText("Estado");
		this.jLabelid_estado_factura_punto_ventaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_factura_punto_ventaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_factura_punto_ventaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_factura_punto_ventaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_factura_punto_ventaFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_factura_punto_ventaFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDESTADOFACTURAPUNTOVENTA);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_estado_factura_punto_ventaFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_factura_punto_ventaFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_factura_punto_ventaFacturaPuntoVenta"));

		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_factura_punto_ventaFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_factura_punto_ventaFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_factura_punto_ventaFacturaPuntoVentaUpdate"));



					
		this.jLabelid_asiento_contableFacturaPuntoVenta = new JLabelMe();
		this.jLabelid_asiento_contableFacturaPuntoVenta.setText(""+FacturaPuntoVentaConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableFacturaPuntoVenta.setToolTipText("Asiento C");
		this.jLabelid_asiento_contableFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableFacturaPuntoVenta=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableFacturaPuntoVenta.setToolTipText(FacturaPuntoVentaConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		this.jPanelid_asiento_contableFacturaPuntoVenta.setLayout(this.gridaBagLayoutFacturaPuntoVenta);


		jComboBoxid_asiento_contableFacturaPuntoVenta= new JComboBoxMe();
		jComboBoxid_asiento_contableFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableFacturaPuntoVenta.setEnabled(false);

		this.jButtonid_asiento_contableFacturaPuntoVenta= new JButtonMe();
		this.jButtonid_asiento_contableFacturaPuntoVenta.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableFacturaPuntoVenta.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableFacturaPuntoVenta.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableFacturaPuntoVenta.setText("Buscar");
		this.jButtonid_asiento_contableFacturaPuntoVenta.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableFacturaPuntoVenta.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableFacturaPuntoVenta,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableFacturaPuntoVenta"));

		this.jButtonid_asiento_contableFacturaPuntoVentaBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableFacturaPuntoVentaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFacturaPuntoVentaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFacturaPuntoVentaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableFacturaPuntoVentaBusqueda.setText("U");
		this.jButtonid_asiento_contableFacturaPuntoVentaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableFacturaPuntoVentaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableFacturaPuntoVentaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableFacturaPuntoVentaBusqueda"));

		if(this.facturapuntoventaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableFacturaPuntoVentaBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableFacturaPuntoVentaUpdate= new JButtonMe();
		this.jButtonid_asiento_contableFacturaPuntoVentaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFacturaPuntoVentaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableFacturaPuntoVentaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableFacturaPuntoVentaUpdate.setText("U");
		this.jButtonid_asiento_contableFacturaPuntoVentaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableFacturaPuntoVentaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableFacturaPuntoVentaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableFacturaPuntoVenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableFacturaPuntoVenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableFacturaPuntoVentaUpdate"));



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
		//this.jInternalFrameDetalleFacturaPuntoVenta = new FacturaPuntoVentaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Factura Punto Venta DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaPuntoVenta= new GridBagLayout();
		

		
		String sToolTipFacturaPuntoVenta="";
		sToolTipFacturaPuntoVenta=FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaPuntoVenta+="(PuntoVenta.FacturaPuntoVenta)";
		}
		
		if(!this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaPuntoVenta+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturaPuntoVenta = new JButtonMe();
		this.jButtonModificarFacturaPuntoVenta = new JButtonMe();
        this.jButtonActualizarFacturaPuntoVenta = new JButtonMe();
        this.jButtonEliminarFacturaPuntoVenta = new JButtonMe();
        this.jButtonCancelarFacturaPuntoVenta = new JButtonMe();
        this.jButtonGuardarCambiosFacturaPuntoVenta = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturaPuntoVenta = new JButtonMe();
		this.jButtonCerrarFacturaPuntoVenta = new JButtonMe();
		
		this.jScrollPanelDatosFacturaPuntoVenta = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturaPuntoVenta = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturaPuntoVenta = new JScrollPane();
				
		
		
		this.jPanelCamposFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Factura Punto Venta";
		
		if(!this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Punto Ventas" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposFacturaPuntoVenta.setName("jPanelCamposFacturaPuntoVenta"); 

		this.jPanelCamposOcultosFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturaPuntoVenta.setName("jPanelCamposOcultosFacturaPuntoVenta"); 

        this.jPanelAccionesFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFacturaPuntoVenta.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturaPuntoVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturaPuntoVenta.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturaPuntoVenta.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalFacturaPuntoVenta.setName("jPanelCamposFintotalFacturaPuntoVenta");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturaPuntoVenta.setText("Nuevo");
		this.jButtonModificarFacturaPuntoVenta.setText("Editar");
        this.jButtonActualizarFacturaPuntoVenta.setText("Actualizar");
        this.jButtonEliminarFacturaPuntoVenta.setText("Eliminar");
        this.jButtonCancelarFacturaPuntoVenta.setText("Cancelar");
        this.jButtonGuardarCambiosFacturaPuntoVenta.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturaPuntoVenta.setText("Guardar");
		this.jButtonCerrarFacturaPuntoVenta.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaPuntoVenta,"nuevo_button","Nuevo",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturaPuntoVenta,"modificar_button","Editar",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturaPuntoVenta,"actualizar_button","Actualizar",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturaPuntoVenta,"eliminar_button","Eliminar",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturaPuntoVenta,"cancelar_button","Cancelar",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturaPuntoVenta,"guardarcambios_button","Guardar",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaPuntoVenta,"guardarcambiostabla_button","Guardar",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaPuntoVenta,"cerrar_button","Salir",this.facturapuntoventaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturaPuntoVenta.setToolTipText("Nuevo"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturaPuntoVenta.setToolTipText("Editar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturaPuntoVenta.setToolTipText("Actualizar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturaPuntoVenta.setToolTipText("Eliminar)"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturaPuntoVenta.setToolTipText("Cancelar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturaPuntoVenta.setToolTipText("Guardar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturaPuntoVenta.setToolTipText("Guardar"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaPuntoVenta.setToolTipText("Salir"+" "+FacturaPuntoVentaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaPuntoVenta";
		inputMap = this.jButtonNuevoFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaPuntoVenta.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaPuntoVenta"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturaPuntoVenta";
		inputMap = this.jButtonActualizarFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturaPuntoVenta"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturaPuntoVenta";
		inputMap = this.jButtonEliminarFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturaPuntoVenta"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturaPuntoVenta";
		inputMap = this.jButtonCancelarFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturaPuntoVenta"));
		
		//CERRAR		
		sMapKey = "CerrarFacturaPuntoVenta";
		inputMap = this.jButtonCerrarFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaPuntoVenta"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaPuntoVenta";
		inputMap = this.jButtonGuardarCambiosTablaFacturaPuntoVenta.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaPuntoVenta.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaPuntoVenta"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturaPuntoVenta.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturaPuntoVenta.setToolTipText("Nuevo FacturaPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturaPuntoVenta.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturaPuntoVenta.setToolTipText("Sin Cerrar Ventana FacturaPuntoVenta");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturaPuntoVenta = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturaPuntoVenta.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturaPuntoVenta.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaPuntoVenta.setText("Accion");
		this.jComboBoxTiposAccionesFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturaPuntoVenta = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturaPuntoVenta.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturaPuntoVenta.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturaPuntoVenta = new JLabelMe();
		
		this.jLabelAccionesFacturaPuntoVenta.setText("Acciones");		
		this.jLabelAccionesFacturaPuntoVenta.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaPuntoVenta.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaPuntoVenta.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturaPuntoVenta();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturaPuntoVenta();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturaPuntoVenta=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturaPuntoVenta.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturaPuntoVenta,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturaPuntoVenta.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaPuntoVenta.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaPuntoVenta.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturaPuntoVenta, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturaPuntoVenta = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturaPuntoVenta = new GridBagLayout();
		
		this.jPanelCamposFacturaPuntoVenta.setLayout(gridaBagLayoutCamposFacturaPuntoVenta);
		this.jPanelCamposOcultosFacturaPuntoVenta.setLayout(gridaBagLayoutCamposOcultosFacturaPuntoVenta);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalFacturaPuntoVenta= new GridBagLayout();
		this.jPanelCamposFintotalFacturaPuntoVenta.setLayout(gridaBagLayoutCamposFintotalFacturaPuntoVenta);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidFacturaPuntoVenta.add(jLabelIdFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidFacturaPuntoVenta.add(jLabelidFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaFacturaPuntoVenta.add(jLabelid_empresaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaPuntoVenta.add(jButtonid_empresaFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaPuntoVenta.add(jButtonid_empresaFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaFacturaPuntoVenta.add(jComboBoxid_empresaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalFacturaPuntoVenta.add(jLabelid_sucursalFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturaPuntoVenta.add(jButtonid_sucursalFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturaPuntoVenta.add(jButtonid_sucursalFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalFacturaPuntoVenta.add(jComboBoxid_sucursalFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioFacturaPuntoVenta.add(jLabelid_usuarioFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioFacturaPuntoVenta.add(jButtonid_usuarioFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioFacturaPuntoVenta.add(jButtonid_usuarioFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioFacturaPuntoVenta.add(jComboBoxid_usuarioFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_vendedorFacturaPuntoVenta.add(jLabelid_vendedorFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorFacturaPuntoVenta.add(jButtonid_vendedorFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_vendedorFacturaPuntoVenta.add(jButtonid_vendedorFacturaPuntoVentaArbol, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 4;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorFacturaPuntoVenta.add(jButtonid_vendedorFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 5;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_vendedorFacturaPuntoVenta.add(jButtonid_vendedorFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_vendedorFacturaPuntoVenta.add(jComboBoxid_vendedorFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteFacturaPuntoVenta.add(jLabelid_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteFacturaPuntoVenta.add(jButtonid_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturaPuntoVenta.add(jButtonid_clienteFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 4;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturaPuntoVenta.add(jButtonid_clienteFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteFacturaPuntoVenta.add(jComboBoxid_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cajaFacturaPuntoVenta.add(jLabelid_cajaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaFacturaPuntoVenta.add(jButtonid_cajaFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cajaFacturaPuntoVenta.add(jButtonid_cajaFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cajaFacturaPuntoVenta.add(jComboBoxid_cajaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_precioFacturaPuntoVenta.add(jLabelid_tipo_precioFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioFacturaPuntoVenta.add(jButtonid_tipo_precioFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_precioFacturaPuntoVenta.add(jButtonid_tipo_precioFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_precioFacturaPuntoVenta.add(jComboBoxid_tipo_precioFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesaFacturaPuntoVenta.add(jLabelid_mesaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesaFacturaPuntoVenta.add(jButtonid_mesaFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesaFacturaPuntoVenta.add(jButtonid_mesaFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesaFacturaPuntoVenta.add(jComboBoxid_mesaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoFacturaPuntoVenta.add(jLabelid_formatoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoFacturaPuntoVenta.add(jButtonid_formatoFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoFacturaPuntoVenta.add(jButtonid_formatoFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoFacturaPuntoVenta.add(jComboBoxid_formatoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_factura_punto_ventaFacturaPuntoVenta.add(jLabelid_tipo_factura_punto_ventaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_factura_punto_ventaFacturaPuntoVenta.add(jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_factura_punto_ventaFacturaPuntoVenta.add(jButtonid_tipo_factura_punto_ventaFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_factura_punto_ventaFacturaPuntoVenta.add(jComboBoxid_tipo_factura_punto_ventaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_factura_punto_ventaFacturaPuntoVenta.add(jLabelid_estado_factura_punto_ventaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_factura_punto_ventaFacturaPuntoVenta.add(jButtonid_estado_factura_punto_ventaFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_factura_punto_ventaFacturaPuntoVenta.add(jButtonid_estado_factura_punto_ventaFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_factura_punto_ventaFacturaPuntoVenta.add(jComboBoxid_estado_factura_punto_ventaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableFacturaPuntoVenta.add(jLabelid_asiento_contableFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableFacturaPuntoVenta.add(jButtonid_asiento_contableFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 3;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableFacturaPuntoVenta.add(jButtonid_asiento_contableFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 4;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableFacturaPuntoVenta.add(jButtonid_asiento_contableFacturaPuntoVentaUpdate, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableFacturaPuntoVenta.add(jComboBoxid_asiento_contableFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_secuencialFacturaPuntoVenta.add(jLabelnumero_secuencialFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialFacturaPuntoVenta.add(jButtonnumero_secuencialFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_secuencialFacturaPuntoVenta.add(jTextFieldnumero_secuencialFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcodigo_clienteFacturaPuntoVenta.add(jLabelcodigo_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_clienteFacturaPuntoVenta.add(jButtoncodigo_clienteFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcodigo_clienteFacturaPuntoVenta.add(jTextFieldcodigo_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnombre_clienteFacturaPuntoVenta.add(jLabelnombre_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clienteFacturaPuntoVenta.add(jButtonnombre_clienteFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnombre_clienteFacturaPuntoVenta.add(jscrollPanenombre_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltarjeta_clienteFacturaPuntoVenta.add(jLabeltarjeta_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltarjeta_clienteFacturaPuntoVenta.add(jButtontarjeta_clienteFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltarjeta_clienteFacturaPuntoVenta.add(jTextFieldtarjeta_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldireccion_clienteFacturaPuntoVenta.add(jLabeldireccion_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldireccion_clienteFacturaPuntoVenta.add(jButtondireccion_clienteFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldireccion_clienteFacturaPuntoVenta.add(jscrollPanedireccion_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltelefono_clienteFacturaPuntoVenta.add(jLabeltelefono_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltelefono_clienteFacturaPuntoVenta.add(jButtontelefono_clienteFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltelefono_clienteFacturaPuntoVenta.add(jscrollPanetelefono_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaFacturaPuntoVenta.add(jLabelfechaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaFacturaPuntoVenta.add(jButtonfechaFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaFacturaPuntoVenta.add(jDateChooserfechaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelhoraFacturaPuntoVenta.add(jLabelhoraFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelhoraFacturaPuntoVenta.add(jButtonhoraFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelhoraFacturaPuntoVenta.add(jSpinnerhoraFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_ivaFacturaPuntoVenta.add(jLabeltotal_ivaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaFacturaPuntoVenta.add(jButtontotal_ivaFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_ivaFacturaPuntoVenta.add(jTextFieldtotal_ivaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_sin_ivaFacturaPuntoVenta.add(jLabeltotal_sin_ivaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_sin_ivaFacturaPuntoVenta.add(jButtontotal_sin_ivaFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_sin_ivaFacturaPuntoVenta.add(jTextFieldtotal_sin_ivaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaFacturaPuntoVenta.add(jLabelivaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaFacturaPuntoVenta.add(jButtonivaFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaFacturaPuntoVenta.add(jTextFieldivaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescuentoFacturaPuntoVenta.add(jLabeldescuentoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoFacturaPuntoVenta.add(jButtondescuentoFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescuentoFacturaPuntoVenta.add(jTextFielddescuentoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfinanciamientoFacturaPuntoVenta.add(jLabelfinanciamientoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfinanciamientoFacturaPuntoVenta.add(jButtonfinanciamientoFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfinanciamientoFacturaPuntoVenta.add(jTextFieldfinanciamientoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfleteFacturaPuntoVenta.add(jLabelfleteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteFacturaPuntoVenta.add(jButtonfleteFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfleteFacturaPuntoVenta.add(jTextFieldfleteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliceFacturaPuntoVenta.add(jLabeliceFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceFacturaPuntoVenta.add(jButtoniceFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliceFacturaPuntoVenta.add(jTextFieldiceFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelotrosFacturaPuntoVenta.add(jLabelotrosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelotrosFacturaPuntoVenta.add(jButtonotrosFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelotrosFacturaPuntoVenta.add(jTextFieldotrosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsub_totalFacturaPuntoVenta.add(jLabelsub_totalFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalFacturaPuntoVenta.add(jButtonsub_totalFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsub_totalFacturaPuntoVenta.add(jTextFieldsub_totalFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalFacturaPuntoVenta.add(jLabeltotalFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		//this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 2;
		this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
		this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalFacturaPuntoVenta.add(jButtontotalFacturaPuntoVentaBusqueda, this.gridBagConstraintsFacturaPuntoVenta);
	}

	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = 1;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalFacturaPuntoVenta.add(jTextFieldtotalFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelidFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelid_vendedorFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelid_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelid_cajaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelid_tipo_precioFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelid_mesaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelid_formatoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelid_tipo_factura_punto_ventaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelid_estado_factura_punto_ventaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelnumero_secuencialFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelcodigo_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelnombre_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPaneltarjeta_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPaneldireccion_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPaneltelefono_clienteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelfechaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaPuntoVenta.add(this.jPanelhoraFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFacturaPuntoVenta % 3==0) {
		iXPanelCamposFacturaPuntoVenta=0;
		iYPanelCamposFacturaPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposOcultosFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposOcultosFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaPuntoVenta.add(this.jPanelid_empresaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposOcultosFacturaPuntoVenta % 3==0) {
		iXPanelCamposOcultosFacturaPuntoVenta=0;
		iYPanelCamposOcultosFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposOcultosFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposOcultosFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaPuntoVenta.add(this.jPanelid_sucursalFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposOcultosFacturaPuntoVenta % 3==0) {
		iXPanelCamposOcultosFacturaPuntoVenta=0;
		iYPanelCamposOcultosFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposOcultosFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposOcultosFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaPuntoVenta.add(this.jPanelid_usuarioFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposOcultosFacturaPuntoVenta % 3==0) {
		iXPanelCamposOcultosFacturaPuntoVenta=0;
		iYPanelCamposOcultosFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposOcultosFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposOcultosFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaPuntoVenta.add(this.jPanelid_asiento_contableFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposOcultosFacturaPuntoVenta % 3==0) {
		iXPanelCamposOcultosFacturaPuntoVenta=0;
		iYPanelCamposOcultosFacturaPuntoVenta++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFintotalFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFintotalFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalFacturaPuntoVenta.add(this.jPaneltotal_ivaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFintotalFacturaPuntoVenta % 3==0) {
		iXPanelCamposFintotalFacturaPuntoVenta=0;
		iYPanelCamposFintotalFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFintotalFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFintotalFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalFacturaPuntoVenta.add(this.jPaneltotal_sin_ivaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFintotalFacturaPuntoVenta % 3==0) {
		iXPanelCamposFintotalFacturaPuntoVenta=0;
		iYPanelCamposFintotalFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFintotalFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFintotalFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalFacturaPuntoVenta.add(this.jPanelivaFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFintotalFacturaPuntoVenta % 3==0) {
		iXPanelCamposFintotalFacturaPuntoVenta=0;
		iYPanelCamposFintotalFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFintotalFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFintotalFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalFacturaPuntoVenta.add(this.jPaneldescuentoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFintotalFacturaPuntoVenta % 3==0) {
		iXPanelCamposFintotalFacturaPuntoVenta=0;
		iYPanelCamposFintotalFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFintotalFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFintotalFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalFacturaPuntoVenta.add(this.jPanelfinanciamientoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFintotalFacturaPuntoVenta % 3==0) {
		iXPanelCamposFintotalFacturaPuntoVenta=0;
		iYPanelCamposFintotalFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFintotalFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFintotalFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalFacturaPuntoVenta.add(this.jPanelfleteFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFintotalFacturaPuntoVenta % 3==0) {
		iXPanelCamposFintotalFacturaPuntoVenta=0;
		iYPanelCamposFintotalFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFintotalFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFintotalFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalFacturaPuntoVenta.add(this.jPaneliceFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFintotalFacturaPuntoVenta % 3==0) {
		iXPanelCamposFintotalFacturaPuntoVenta=0;
		iYPanelCamposFintotalFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFintotalFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFintotalFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalFacturaPuntoVenta.add(this.jPanelotrosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFintotalFacturaPuntoVenta % 3==0) {
		iXPanelCamposFintotalFacturaPuntoVenta=0;
		iYPanelCamposFintotalFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFintotalFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFintotalFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalFacturaPuntoVenta.add(this.jPanelsub_totalFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFintotalFacturaPuntoVenta % 3==0) {
		iXPanelCamposFintotalFacturaPuntoVenta=0;
		iYPanelCamposFintotalFacturaPuntoVenta++;
	}
	this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
	this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaPuntoVenta.gridy = iYPanelCamposFintotalFacturaPuntoVenta;
	this.gridBagConstraintsFacturaPuntoVenta.gridx = iXPanelCamposFintotalFacturaPuntoVenta++;
	this.gridBagConstraintsFacturaPuntoVenta.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaPuntoVenta.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalFacturaPuntoVenta.add(this.jPaneltotalFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);



	if(iXPanelCamposFintotalFacturaPuntoVenta % 3==0) {
		iXPanelCamposFintotalFacturaPuntoVenta=0;
		iYPanelCamposFintotalFacturaPuntoVenta++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesFacturaPuntoVenta);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturaPuntoVenta= new GridBagLayout();
		this.jPanelAccionesFormularioFacturaPuntoVenta.setLayout(gridaBagLayoutAccionesFormularioFacturaPuntoVenta);
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaPuntoVenta.add(this.jComboBoxTiposAccionesFormularioFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaPuntoVenta.add(this.jCheckBoxPostAccionNuevoFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.facturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFacturaPuntoVenta.add(this.jCheckBoxPostAccionSinCerrarFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.facturapuntoventaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.facturapuntoventaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFacturaPuntoVenta.add(this.jCheckBoxPostAccionSinMensajeFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturaPuntoVenta.add(this.jButtonModificarFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);							

		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;
		this.gridBagConstraintsFacturaPuntoVenta.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturaPuntoVenta.add(this.jButtonEliminarFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
			
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaPuntoVenta.add(this.jButtonActualizarFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);


		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaPuntoVenta.add(this.jButtonGuardarCambiosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);	
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = 0;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturaPuntoVenta.add(this.jButtonCancelarFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaPuntoVenta = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaPuntoVenta);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturapuntoventaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();						
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;		
			//this.gridBagConstraintsFacturaPuntoVenta.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaPuntoVenta.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaPuntoVenta.gridx =0;
		this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaPuntoVenta.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturaPuntoVentaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturaPuntoVenta = new FacturaPuntoVentaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Factura Punto Venta DATOS");
			
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
			
	        //this.setTitle("[FOR] - Factura Punto Venta DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factura Punto Venta Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturaPuntoVentaModel facturapuntoventaModel=new FacturaPuntoVentaModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturaPuntoVentaModel.FacturaPuntoVentaFocusTraversalPolicy facturapuntoventaFocusTraversalPolicy = facturapuntoventaModel.new FacturaPuntoVentaFocusTraversalPolicy(this);
			
			//facturapuntoventaFocusTraversalPolicy.setfacturapuntoventaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturapuntoventaModel);
			
			
			this.jContentPaneDetalleFacturaPuntoVenta = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturaPuntoVenta = new GridBagLayout();	
			this.jContentPaneDetalleFacturaPuntoVenta.setLayout(gridaBagLayoutDetalleFacturaPuntoVenta);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaPuntoVenta = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionFacturaPuntoVenta=   new JScrollPane(jContentPaneDetalleFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturaPuntoVenta=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	        
			this.jContentPaneDetalleFacturaPuntoVenta.add(jPanelCamposFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);
			
			
			
			
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
						&& facturapuntoventaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleFacturaPuntoVenta(this.puedeCargarPorParteDetalleFacturaPuntoVenta,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(this.puedeCargarPorParteFormaPagoPuntoVenta,false,-1);
					
					if(this.facturapuntoventaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturaPuntoVenta= new GridBagConstraints();
						this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
						this.jContentPaneDetalleFacturaPuntoVenta.add(this.jTabbedPaneRelacionesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturaPuntoVenta.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleFacturaPuntoVenta(true,false,-1);
					this.cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;

		this.jContentPaneDetalleFacturaPuntoVenta.add(jPanelCamposFintotalFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturaPuntoVenta.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
					this.gridBagConstraintsFacturaPuntoVenta.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
					
				
					this.jContentPaneDetalleFacturaPuntoVenta.add(jPanelCamposOcultosFacturaPuntoVenta, gridBagConstraintsFacturaPuntoVenta);
				
					this.jPanelCamposOcultosFacturaPuntoVenta.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyRelaciones++;//7;		
	        this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	        this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturaPuntoVenta.add(this.jPanelAccionesFormularioFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);							
			
			
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyRelaciones;//7;		
	        this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturaPuntoVenta.add(this.jPanelAccionesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturaPuntoVenta);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturaPuntoVenta=   new JScrollPane(this.jPanelCamposFacturaPuntoVenta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaPuntoVenta.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaPuntoVenta.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaPuntoVenta.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
			this.gridBagConstraintsFacturaPuntoVenta.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturaPuntoVenta.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturaPuntoVenta.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);			
			
			this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
			this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
			
			
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		
			
		this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
		this.gridBagConstraintsFacturaPuntoVenta.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaPuntoVenta.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaPuntoVenta, this.gridBagConstraintsFacturaPuntoVenta);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturaPuntoVenta;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturaPuntoVenta;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleFacturaPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallefacturapuntoventaSessionBean=new DetalleFacturaPuntoVentaSessionBean();
		this.detallefacturapuntoventaSessionBean.setConGuardarRelaciones(false);
		this.detallefacturapuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.detallefacturapuntoventaBeanSwingJInternalFrame=null;//new DetalleFacturaPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallefacturapuntoventaBeanSwingJInternalFramePopup=new DetalleFacturaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallefacturapuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {

				DetalleFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleFacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallefacturapuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.detallefacturapuntoventaBeanSwingJInternalFrame=new DetalleFacturaPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallefacturapuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallefacturapuntoventaBeanSwingJInternalFrame.setdetallefacturapuntoventaSessionBean(this.detallefacturapuntoventaSessionBean);

				//this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
				//this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
				//this.jContentPaneDetalleFacturaPuntoVenta.add(this.detallefacturapuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFacturaPuntoVenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFacturaPuntoVenta.add("Detalle Facturas",this.detallefacturapuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFacturaPuntoVenta.setComponentAt(iIndexTab,this.detallefacturapuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleFacturaPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallefacturapuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.detallefacturapuntoventaBeanSwingJInternalFrame=null;//new DetalleFacturaPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallefacturapuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleFacturaPuntoVenta) {
					this.jTabbedPaneRelacionesFacturaPuntoVenta.add("Detalle Facturas",new JPanel());
				}
			}
		}
	}

	public void cargarSessionConBeanSwingJInternalFrameFormaPagoPuntoVenta(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.formapagopuntoventaSessionBean=new FormaPagoPuntoVentaSessionBean();
		this.formapagopuntoventaSessionBean.setConGuardarRelaciones(false);
		this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

		this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.formapagopuntoventaBeanSwingJInternalFramePopup=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.formapagopuntoventaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {

				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL=FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;
				FormaPagoPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FacturaPuntoVentaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(true);

				this.formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.formapagopuntoventaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.formapagopuntoventaBeanSwingJInternalFrame.setformapagopuntoventaSessionBean(this.formapagopuntoventaSessionBean);

				//this.gridBagConstraintsFacturaPuntoVenta = new GridBagConstraints();
				//this.gridBagConstraintsFacturaPuntoVenta.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFacturaPuntoVenta.gridx = 0;
				//this.jContentPaneDetalleFacturaPuntoVenta.add(this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFacturaPuntoVenta);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFacturaPuntoVenta.add("Forma Pagoes",this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFacturaPuntoVenta.setComponentAt(iIndexTab,this.formapagopuntoventaBeanSwingJInternalFrame.getContentPane());
				}

				//FormaPagoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.formapagopuntoventaSessionBean.setEsGuardarRelacionado(false);
				this.formapagopuntoventaBeanSwingJInternalFrame=null;//new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.formapagopuntoventaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteFormaPagoPuntoVenta) {
					this.jTabbedPaneRelacionesFacturaPuntoVenta.add("Forma Pagoes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarFormaPagoPuntoVentaBeanSwingJInternalFrame(List<FacturaPuntoVenta> facturapuntoventas,FacturaPuntoVenta facturapuntoventa,FormaPagoPuntoVentaBeanSwingJInternalFrame formapagopuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//formapagopuntoventaBeanSwingJInternalFrame=new FormaPagoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					formapagopuntoventaBeanSwingJInternalFrame.getFormaPagoPuntoVentaLogic().setConnexion(this.facturapuntoventaLogic.getConnexion());

					formapagopuntoventaBeanSwingJInternalFrame.setfacturapuntoventasForeignKey(facturapuntoventas);
					formapagopuntoventaBeanSwingJInternalFrame.setfacturapuntoventaForeignKey(facturapuntoventa);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionFacturaPuntoVenta(true);
					formapagopuntoventaBeanSwingJInternalFrame.formapagopuntoventaSessionBean.setlidFacturaPuntoVentaActual(facturapuntoventa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					formapagopuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyFormaPagoPuntoVenta(formapagopuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					formapagopuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaFacturaPuntoVenta(true);
					formapagopuntoventaBeanSwingJInternalFrame.setid_factura_punto_ventaFK_IdFacturaPuntoVenta(facturapuntoventa.getId());

					if(!this.conCargarFormDetalle) {
						formapagopuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					formapagopuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameFacturaPuntoVentaForeignKey(facturapuntoventa,1,false,true,true);
					formapagopuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					formapagopuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdFacturaPuntoVenta");
					formapagopuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFacturaPuntoVenta");
					formapagopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormaPagoPuntoVenta(true);
					formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesFormaPagoPuntoVenta("n",formapagopuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, formapagopuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					formapagopuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					formapagopuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("relacionado");
					} else {
						formapagopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsFormaPagoPuntoVenta("no_relacionado");
					}

					formapagopuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionFormaPagoPuntoVenta().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
		}

		public void cargarDetalleFacturaPuntoVentaBeanSwingJInternalFrame(List<FacturaPuntoVenta> facturapuntoventas,FacturaPuntoVenta facturapuntoventa,DetalleFacturaPuntoVentaBeanSwingJInternalFrame detallefacturapuntoventaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallefacturapuntoventaBeanSwingJInternalFrame=new DetalleFacturaPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallefacturapuntoventaBeanSwingJInternalFrame.getDetalleFacturaPuntoVentaLogic().setConnexion(this.facturapuntoventaLogic.getConnexion());

					detallefacturapuntoventaBeanSwingJInternalFrame.setfacturapuntoventasForeignKey(facturapuntoventas);
					detallefacturapuntoventaBeanSwingJInternalFrame.setfacturapuntoventaForeignKey(facturapuntoventa);
					detallefacturapuntoventaBeanSwingJInternalFrame.detallefacturapuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionFacturaPuntoVenta(true);
					detallefacturapuntoventaBeanSwingJInternalFrame.detallefacturapuntoventaSessionBean.setlidFacturaPuntoVentaActual(facturapuntoventa.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallefacturapuntoventaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleFacturaPuntoVenta(detallefacturapuntoventaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallefacturapuntoventaBeanSwingJInternalFrame.setVisibilidadBusquedasParaFacturaPuntoVenta(true);
					detallefacturapuntoventaBeanSwingJInternalFrame.setid_factura_punto_ventaFK_IdFacturaPuntoVenta(facturapuntoventa.getId());

					if(!this.conCargarFormDetalle) {
						detallefacturapuntoventaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallefacturapuntoventaBeanSwingJInternalFrame.setSelectedItemCombosFrameFacturaPuntoVentaForeignKey(facturapuntoventa,1,false,true,true);
					detallefacturapuntoventaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallefacturapuntoventaBeanSwingJInternalFrame.procesarBusqueda("FK_IdFacturaPuntoVenta");
					detallefacturapuntoventaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFacturaPuntoVenta");
					detallefacturapuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleFacturaPuntoVenta(true);
					detallefacturapuntoventaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleFacturaPuntoVenta("n",detallefacturapuntoventaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallefacturapuntoventaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallefacturapuntoventaBeanSwingJInternalFrame.setAutoscrolls(true);
					detallefacturapuntoventaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallefacturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFacturaPuntoVenta("relacionado");
					} else {
						detallefacturapuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFacturaPuntoVenta("no_relacionado");
					}

					detallefacturapuntoventaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleFacturaPuntoVenta().setVisible(false);

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
