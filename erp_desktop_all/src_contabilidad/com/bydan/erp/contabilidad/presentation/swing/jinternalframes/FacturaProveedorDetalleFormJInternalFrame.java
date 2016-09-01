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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.FacturaProveedorConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class FacturaProveedorDetalleFormJInternalFrame extends FacturaProveedorBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturaProveedor;
	
	protected JMenuBar jmenuBarDetalleFacturaProveedor;
	
	protected JMenu jmenuDetalleFacturaProveedor;
	protected JMenu jmenuDetalleArchivoFacturaProveedor;
	protected JMenu jmenuDetalleAccionesFacturaProveedor;
	protected JMenu jmenuDetalleDatosFacturaProveedor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaProveedor;	
	protected GridBagConstraints gridBagConstraintsFacturaProveedor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturaProveedorBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturaProveedor;		
	
	
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

	protected PlantillaFacturaBeanSwingJInternalFrame plantillafacturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_plantillafactura="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected EmpleadoBeanSwingJInternalFrame empleadosolicitaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadosolicita="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuente1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuente1="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuente2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuente2="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencioniva1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva1="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencioniva2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva2="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofiscalbienesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofiscalbienes="";

	protected ResponsableFondoBeanSwingJInternalFrame responsablefondoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_responsablefondo="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofiscalserviciosBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofiscalservicios="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablegastoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablegasto="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablegasto2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablegasto2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofinBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofin="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofin2BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofin2="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecredito="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";
	
	public FacturaProveedorSessionBean facturaproveedorSessionBean;
	
	

	public DetalleFacturaProveedorBeanSwingJInternalFrame detallefacturaproveedorBeanSwingJInternalFrame=null;
	public DetalleFacturaProveedorBeanSwingJInternalFrame detallefacturaproveedorBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleFacturaProveedor=false;
	public DetalleFacturaProveedorSessionBean detallefacturaproveedorSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public PlantillaFacturaSessionBean plantillafacturaSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public EmpleadoSessionBean empleadosolicitaSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoRetencionSessionBean tiporetencionfuente1SessionBean;
	public TipoRetencionSessionBean tiporetencionfuente2SessionBean;
	public TipoRetencionSessionBean tiporetencioniva1SessionBean;
	public TipoRetencionSessionBean tiporetencioniva2SessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public CuentaContableSessionBean cuentacontablecreditofiscalbienesSessionBean;
	public ResponsableFondoSessionBean responsablefondoSessionBean;
	public CuentaContableSessionBean cuentacontablecreditofiscalserviciosSessionBean;
	public CuentaContableSessionBean cuentacontablegastoSessionBean;
	public CuentaContableSessionBean cuentacontablegasto2SessionBean;
	public CuentaContableSessionBean cuentacontablecreditofinSessionBean;
	public CuentaContableSessionBean cuentacontablecreditofin2SessionBean;
	public CuentaContableSessionBean cuentacontablecreditoSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;	
	
	public FacturaProveedorLogic facturaproveedorLogic;
	
	public JScrollPane jScrollPanelDatosFacturaProveedor;
	public JScrollPane jScrollPanelDatosEdicionFacturaProveedor;
	public JScrollPane jScrollPanelDatosGeneralFacturaProveedor;
	
	protected JPanel jPanelCamposFacturaProveedor;    
	protected JPanel jPanelCamposOcultosFacturaProveedor;    	
	protected JPanel jPanelAccionesFacturaProveedor;
	protected JPanel jPanelAccionesFormularioFacturaProveedor;
    
	
	
	protected Integer iXPanelCamposFacturaProveedor=0;
	protected Integer iYPanelCamposFacturaProveedor=0;
	
	protected Integer iXPanelCamposOcultosFacturaProveedor=0;
	protected Integer iYPanelCamposOcultosFacturaProveedor=0;
	
	

	protected JPanel jPanelCamposIniciogeneralFacturaProveedor;
	protected Integer iXPanelCamposIniciogeneralFacturaProveedor=0;
	protected Integer iYPanelCamposIniciogeneralFacturaProveedor=0;

	protected JPanel jPanelCamposIniciodatos_facturaFacturaProveedor;
	protected Integer iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
	protected Integer iYPanelCamposIniciodatos_facturaFacturaProveedor=0;

	protected JPanel jPanelCamposIniciodatos_retencion_0FacturaProveedor;
	protected Integer iXPanelCamposIniciodatos_retencion_0FacturaProveedor=0;
	protected Integer iYPanelCamposIniciodatos_retencion_0FacturaProveedor=0;

	protected JPanel jPanelCamposIniciodatos_retencionFacturaProveedor;
	protected Integer iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
	protected Integer iYPanelCamposIniciodatos_retencionFacturaProveedor=0;

	protected JPanel jPanelCamposInicioanexos_ivaFacturaProveedor;
	protected Integer iXPanelCamposInicioanexos_ivaFacturaProveedor=0;
	protected Integer iYPanelCamposInicioanexos_ivaFacturaProveedor=0;

	protected JPanel jPanelCamposIniciocuentas_contablesFacturaProveedor;
	protected Integer iXPanelCamposIniciocuentas_contablesFacturaProveedor=0;
	protected Integer iYPanelCamposIniciocuentas_contablesFacturaProveedor=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturaProveedor;
	public JButton jButtonModificarFacturaProveedor;
	public JButton jButtonActualizarFacturaProveedor;
    public JButton jButtonEliminarFacturaProveedor;
	public JButton jButtonCancelarFacturaProveedor;
    public JButton jButtonGuardarCambiosFacturaProveedor;
	public JButton jButtonGuardarCambiosTablaFacturaProveedor;
	protected JButton jButtonCerrarFacturaProveedor;
	
	
	protected JButton jButtonProcesarInformacionFacturaProveedor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturaProveedor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturaProveedor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturaProveedor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaProveedor;
	protected JButton jButtonModificarToolBarFacturaProveedor;
	protected JButton jButtonActualizarToolBarFacturaProveedor;
    protected JButton jButtonEliminarToolBarFacturaProveedor;
	protected JButton jButtonCancelarToolBarFacturaProveedor;
    protected JButton jButtonGuardarCambiosToolBarFacturaProveedor;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturaProveedor;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaProveedor;
	protected JButton jButtonCerrarToolBarFacturaProveedor;
	
	protected JButton jButtonProcesarInformacionToolBarFacturaProveedor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaProveedor;
	protected JMenuItem jMenuItemModificarFacturaProveedor;
	protected JMenuItem jMenuItemActualizarFacturaProveedor;
    protected JMenuItem jMenuItemEliminarFacturaProveedor;
	protected JMenuItem jMenuItemCancelarFacturaProveedor;
    protected JMenuItem jMenuItemGuardarCambiosFacturaProveedor;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaProveedor;
	protected JMenuItem jMenuItemCerrarFacturaProveedor;
	protected JMenuItem jMenuItemDetalleCerrarFacturaProveedor;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaProveedor;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturaProveedor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaProveedor;
	protected JMenuItem jMenuItemMostrarOcultarFacturaProveedor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaProveedor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaProveedor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaProveedor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturaProveedor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturaProveedor;
	public JLabel jLabelIdFacturaProveedor;
	public JLabel jLabelidFacturaProveedor;
	public JButton jButtonidFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelplazoFacturaProveedor;
	public JLabel jLabelplazoFacturaProveedor;
	public JTextField jTextFieldplazoFacturaProveedor;
	public JButton jButtonplazoFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaFacturaProveedor;
	public JLabel jLabelnumero_facturaFacturaProveedor;
	public JTextField jTextFieldnumero_facturaFacturaProveedor;
	public JButton jButtonnumero_facturaFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionFacturaProveedor;
	public JLabel jLabelfecha_emisionFacturaProveedor;
	//public JFormattedTextField jDateChooserfecha_emisionFacturaProveedor;

	public JDateChooser jDateChooserfecha_emisionFacturaProveedor;
	public JButton jButtonfecha_emisionFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelrucFacturaProveedor;
	public JLabel jLabelrucFacturaProveedor;
	public JTextField jTextFieldrucFacturaProveedor;
	public JButton jButtonrucFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceFacturaProveedor;
	public JLabel jLabelfecha_venceFacturaProveedor;
	//public JFormattedTextField jDateChooserfecha_venceFacturaProveedor;

	public JDateChooser jDateChooserfecha_venceFacturaProveedor;
	public JButton jButtonfecha_venceFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcon_activosFacturaProveedor;
	public JLabel jLabelcon_activosFacturaProveedor;
	public JCheckBox jCheckBoxcon_activosFacturaProveedor;
	public JButton jButtoncon_activosFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcon_riseFacturaProveedor;
	public JLabel jLabelcon_riseFacturaProveedor;
	public JCheckBox jCheckBoxcon_riseFacturaProveedor;
	public JButton jButtoncon_riseFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcon_sitiosFacturaProveedor;
	public JLabel jLabelcon_sitiosFacturaProveedor;
	public JCheckBox jCheckBoxcon_sitiosFacturaProveedor;
	public JButton jButtoncon_sitiosFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneldetalleFacturaProveedor;
	public JLabel jLabeldetalleFacturaProveedor;
	public JTextArea jTextAreadetalleFacturaProveedor;
	public JScrollPane jscrollPanedetalleFacturaProveedor;
	public JButton jButtondetalleFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelvalor_bienes12FacturaProveedor;
	public JLabel jLabelvalor_bienes12FacturaProveedor;
	public JTextField jTextFieldvalor_bienes12FacturaProveedor;
	public JButton jButtonvalor_bienes12FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelvalor_servicios12FacturaProveedor;
	public JLabel jLabelvalor_servicios12FacturaProveedor;
	public JTextField jTextFieldvalor_servicios12FacturaProveedor;
	public JButton jButtonvalor_servicios12FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneltotal_valor12FacturaProveedor;
	public JLabel jLabeltotal_valor12FacturaProveedor;
	public JTextField jTextFieldtotal_valor12FacturaProveedor;
	public JButton jButtontotal_valor12FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelvalor_bienes0FacturaProveedor;
	public JLabel jLabelvalor_bienes0FacturaProveedor;
	public JTextField jTextFieldvalor_bienes0FacturaProveedor;
	public JButton jButtonvalor_bienes0FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelvalor_servicios0FacturaProveedor;
	public JLabel jLabelvalor_servicios0FacturaProveedor;
	public JTextField jTextFieldvalor_servicios0FacturaProveedor;
	public JButton jButtonvalor_servicios0FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneltotal_valor0FacturaProveedor;
	public JLabel jLabeltotal_valor0FacturaProveedor;
	public JTextField jTextFieldtotal_valor0FacturaProveedor;
	public JButton jButtontotal_valor0FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelbienes_iceFacturaProveedor;
	public JLabel jLabelbienes_iceFacturaProveedor;
	public JTextField jTextFieldbienes_iceFacturaProveedor;
	public JButton jButtonbienes_iceFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelservicios_iceFacturaProveedor;
	public JLabel jLabelservicios_iceFacturaProveedor;
	public JTextField jTextFieldservicios_iceFacturaProveedor;
	public JButton jButtonservicios_iceFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneltotal_iceFacturaProveedor;
	public JLabel jLabeltotal_iceFacturaProveedor;
	public JTextField jTextFieldtotal_iceFacturaProveedor;
	public JButton jButtontotal_iceFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelbienes_ivaFacturaProveedor;
	public JLabel jLabelbienes_ivaFacturaProveedor;
	public JTextField jTextFieldbienes_ivaFacturaProveedor;
	public JButton jButtonbienes_ivaFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelservicios_ivaFacturaProveedor;
	public JLabel jLabelservicios_ivaFacturaProveedor;
	public JTextField jTextFieldservicios_ivaFacturaProveedor;
	public JButton jButtonservicios_ivaFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaFacturaProveedor;
	public JLabel jLabeltotal_ivaFacturaProveedor;
	public JTextField jTextFieldtotal_ivaFacturaProveedor;
	public JButton jButtontotal_ivaFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneliva_porcentajeFacturaProveedor;
	public JLabel jLabeliva_porcentajeFacturaProveedor;
	public JTextField jTextFieldiva_porcentajeFacturaProveedor;
	public JButton jButtoniva_porcentajeFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneltotalFacturaProveedor;
	public JLabel jLabeltotalFacturaProveedor;
	public JTextField jTextFieldtotalFacturaProveedor;
	public JButton jButtontotalFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcon_monto_objeto_ivaFacturaProveedor;
	public JLabel jLabelcon_monto_objeto_ivaFacturaProveedor;
	public JCheckBox jCheckBoxcon_monto_objeto_ivaFacturaProveedor;
	public JButton jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionFacturaProveedor;
	public JLabel jLabelnumero_retencionFacturaProveedor;
	public JTextField jTextFieldnumero_retencionFacturaProveedor;
	public JButton jButtonnumero_retencionFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serieFacturaProveedor;
	public JLabel jLabelnumero_serieFacturaProveedor;
	public JTextField jTextFieldnumero_serieFacturaProveedor;
	public JButton jButtonnumero_serieFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionFacturaProveedor;
	public JLabel jLabelnumero_autorizacionFacturaProveedor;
	public JTextField jTextFieldnumero_autorizacionFacturaProveedor;
	public JButton jButtonnumero_autorizacionFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelfecha_validezFacturaProveedor;
	public JLabel jLabelfecha_validezFacturaProveedor;
	//public JFormattedTextField jDateChooserfecha_validezFacturaProveedor;

	public JDateChooser jDateChooserfecha_validezFacturaProveedor;
	public JButton jButtonfecha_validezFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_fuente1_porcentajeFacturaProveedor;
	public JLabel jLabelret_fuente1_porcentajeFacturaProveedor;
	public JTextField jTextFieldret_fuente1_porcentajeFacturaProveedor;
	public JButton jButtonret_fuente1_porcentajeFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_fuente1_baseFacturaProveedor;
	public JLabel jLabelret_fuente1_baseFacturaProveedor;
	public JTextField jTextFieldret_fuente1_baseFacturaProveedor;
	public JButton jButtonret_fuente1_baseFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_fuente1_retenidoFacturaProveedor;
	public JLabel jLabelret_fuente1_retenidoFacturaProveedor;
	public JTextField jTextFieldret_fuente1_retenidoFacturaProveedor;
	public JButton jButtonret_fuente1_retenidoFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_fuente2_porcentajeFacturaProveedor;
	public JLabel jLabelret_fuente2_porcentajeFacturaProveedor;
	public JTextField jTextFieldret_fuente2_porcentajeFacturaProveedor;
	public JButton jButtonret_fuente2_porcentajeFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_fuente2_baseFacturaProveedor;
	public JLabel jLabelret_fuente2_baseFacturaProveedor;
	public JTextField jTextFieldret_fuente2_baseFacturaProveedor;
	public JButton jButtonret_fuente2_baseFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_fuente2_retenidoFacturaProveedor;
	public JLabel jLabelret_fuente2_retenidoFacturaProveedor;
	public JTextField jTextFieldret_fuente2_retenidoFacturaProveedor;
	public JButton jButtonret_fuente2_retenidoFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_iva_bien_porcentajeFacturaProveedor;
	public JLabel jLabelret_iva_bien_porcentajeFacturaProveedor;
	public JTextField jTextFieldret_iva_bien_porcentajeFacturaProveedor;
	public JButton jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_iva_bien_baseFacturaProveedor;
	public JLabel jLabelret_iva_bien_baseFacturaProveedor;
	public JTextField jTextFieldret_iva_bien_baseFacturaProveedor;
	public JButton jButtonret_iva_bien_baseFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_iva_bien_retenidoFacturaProveedor;
	public JLabel jLabelret_iva_bien_retenidoFacturaProveedor;
	public JTextField jTextFieldret_iva_bien_retenidoFacturaProveedor;
	public JButton jButtonret_iva_bien_retenidoFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_iva_servicio_porcentajeFacturaProveedor;
	public JLabel jLabelret_iva_servicio_porcentajeFacturaProveedor;
	public JTextField jTextFieldret_iva_servicio_porcentajeFacturaProveedor;
	public JButton jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_iva_servicio_baseFacturaProveedor;
	public JLabel jLabelret_iva_servicio_baseFacturaProveedor;
	public JTextField jTextFieldret_iva_servicio_baseFacturaProveedor;
	public JButton jButtonret_iva_servicio_baseFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelret_iva_servicio_retenidoFacturaProveedor;
	public JLabel jLabelret_iva_servicio_retenidoFacturaProveedor;
	public JTextField jTextFieldret_iva_servicio_retenidoFacturaProveedor;
	public JButton jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelanexo_numero_autorizacionFacturaProveedor;
	public JLabel jLabelanexo_numero_autorizacionFacturaProveedor;
	public JTextField jTextFieldanexo_numero_autorizacionFacturaProveedor;
	public JButton jButtonanexo_numero_autorizacionFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelanexo_numeso_serieFacturaProveedor;
	public JLabel jLabelanexo_numeso_serieFacturaProveedor;
	public JTextField jTextFieldanexo_numeso_serieFacturaProveedor;
	public JButton jButtonanexo_numeso_serieFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelanexo_fecha_validezFacturaProveedor;
	public JLabel jLabelanexo_fecha_validezFacturaProveedor;
	//public JFormattedTextField jDateChooseranexo_fecha_validezFacturaProveedor;

	public JDateChooser jDateChooseranexo_fecha_validezFacturaProveedor;
	public JButton jButtonanexo_fecha_validezFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelanexo_factura_inicioFacturaProveedor;
	public JLabel jLabelanexo_factura_inicioFacturaProveedor;
	public JTextField jTextFieldanexo_factura_inicioFacturaProveedor;
	public JButton jButtonanexo_factura_inicioFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelanexo_factura_finFacturaProveedor;
	public JLabel jLabelanexo_factura_finFacturaProveedor;
	public JTextField jTextFieldanexo_factura_finFacturaProveedor;
	public JButton jButtonanexo_factura_finFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelsecuencialFacturaProveedor;
	public JLabel jLabelsecuencialFacturaProveedor;
	public JTextField jTextFieldsecuencialFacturaProveedor;
	public JButton jButtonsecuencialFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelgasto_valorFacturaProveedor;
	public JLabel jLabelgasto_valorFacturaProveedor;
	public JTextField jTextFieldgasto_valorFacturaProveedor;
	public JButton jButtongasto_valorFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelgasto_valor2FacturaProveedor;
	public JLabel jLabelgasto_valor2FacturaProveedor;
	public JTextField jTextFieldgasto_valor2FacturaProveedor;
	public JButton jButtongasto_valor2FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelgasto_nombreFacturaProveedor;
	public JLabel jLabelgasto_nombreFacturaProveedor;
	public JTextField jTextFieldgasto_nombreFacturaProveedor;
	public JButton jButtongasto_nombreFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelgasto_nombre2FacturaProveedor;
	public JLabel jLabelgasto_nombre2FacturaProveedor;
	public JTextField jTextFieldgasto_nombre2FacturaProveedor;
	public JButton jButtongasto_nombre2FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionFacturaProveedor;
	public JLabel jLabeldescripcionFacturaProveedor;
	public JTextArea jTextAreadescripcionFacturaProveedor;
	public JScrollPane jscrollPanedescripcionFacturaProveedor;
	public JButton jButtondescripcionFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorFacturaProveedor;
	public JLabel jLabelnumero_mayorFacturaProveedor;
	public JTextField jTextFieldnumero_mayorFacturaProveedor;
	public JButton jButtonnumero_mayorFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_asientoFacturaProveedor;
	public JLabel jLabelcodigo_asientoFacturaProveedor;
	public JTextField jTextFieldcodigo_asientoFacturaProveedor;
	public JButton jButtoncodigo_asientoFacturaProveedorBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFacturaProveedor;
	public JLabel jLabelid_empresaFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturaProveedor;
	public JButton jButtonid_empresaFacturaProveedor= new JButtonMe();
	public JButton jButtonid_empresaFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFacturaProveedor;
	public JLabel jLabelid_sucursalFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFacturaProveedor;
	public JButton jButtonid_sucursalFacturaProveedor= new JButtonMe();
	public JButton jButtonid_sucursalFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioFacturaProveedor;
	public JLabel jLabelid_ejercicioFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFacturaProveedor;
	public JButton jButtonid_ejercicioFacturaProveedor= new JButtonMe();
	public JButton jButtonid_ejercicioFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoFacturaProveedor;
	public JLabel jLabelid_periodoFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoFacturaProveedor;
	public JButton jButtonid_periodoFacturaProveedor= new JButtonMe();
	public JButton jButtonid_periodoFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_periodoFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_anioFacturaProveedor;
	public JLabel jLabelid_anioFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFacturaProveedor;
	public JButton jButtonid_anioFacturaProveedor= new JButtonMe();
	public JButton jButtonid_anioFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_anioFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_mesFacturaProveedor;
	public JLabel jLabelid_mesFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFacturaProveedor;
	public JButton jButtonid_mesFacturaProveedor= new JButtonMe();
	public JButton jButtonid_mesFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_mesFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloFacturaProveedor;
	public JLabel jLabelid_moduloFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFacturaProveedor;
	public JButton jButtonid_moduloFacturaProveedor= new JButtonMe();
	public JButton jButtonid_moduloFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_moduloFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_plantilla_facturaFacturaProveedor;
	public JLabel jLabelid_plantilla_facturaFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_plantilla_facturaFacturaProveedor;
	public JButton jButtonid_plantilla_facturaFacturaProveedor= new JButtonMe();
	public JButton jButtonid_plantilla_facturaFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_plantilla_facturaFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documentoFacturaProveedor;
	public JLabel jLabelid_tipo_documentoFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoFacturaProveedor;
	public JButton jButtonid_tipo_documentoFacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_documentoFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaFacturaProveedor;
	public JLabel jLabelid_facturaFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFacturaProveedor;
	public JButton jButtonid_facturaFacturaProveedor= new JButtonMe();
	public JButton jButtonid_facturaFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_facturaFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionFacturaProveedor;
	public JLabel jLabelid_transaccionFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFacturaProveedor;
	public JButton jButtonid_transaccionFacturaProveedor= new JButtonMe();
	public JButton jButtonid_transaccionFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteFacturaProveedor;
	public JLabel jLabelid_clienteFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFacturaProveedor;
	public JButton jButtonid_clienteFacturaProveedor= new JButtonMe();
	public JButton jButtonid_clienteFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_clienteFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_solicitaFacturaProveedor;
	public JLabel jLabelid_empleado_solicitaFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_solicitaFacturaProveedor;
	public JButton jButtonid_empleado_solicitaFacturaProveedor= new JButtonMe();
	public JButton jButtonid_empleado_solicitaFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_empleado_solicitaFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaFacturaProveedor;
	public JLabel jLabelid_monedaFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaFacturaProveedor;
	public JButton jButtonid_monedaFacturaProveedor= new JButtonMe();
	public JButton jButtonid_monedaFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_monedaFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoFacturaProveedor;
	public JLabel jLabelid_empleadoFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFacturaProveedor;
	public JButton jButtonid_empleadoFacturaProveedor= new JButtonMe();
	public JButton jButtonid_empleadoFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_fuente1FacturaProveedor;
	public JLabel jLabelid_tipo_retencion_fuente1FacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente1FacturaProveedor;
	public JButton jButtonid_tipo_retencion_fuente1FacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente1FacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_fuente2FacturaProveedor;
	public JLabel jLabelid_tipo_retencion_fuente2FacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente2FacturaProveedor;
	public JButton jButtonid_tipo_retencion_fuente2FacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente2FacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva1FacturaProveedor;
	public JLabel jLabelid_tipo_retencion_iva1FacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva1FacturaProveedor;
	public JButton jButtonid_tipo_retencion_iva1FacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva1FacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva2FacturaProveedor;
	public JLabel jLabelid_tipo_retencion_iva2FacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva2FacturaProveedor;
	public JButton jButtonid_tipo_retencion_iva2FacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva2FacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_tributarioFacturaProveedor;
	public JLabel jLabelid_tipo_tributarioFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tributarioFacturaProveedor;
	public JButton jButtonid_tipo_tributarioFacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor;
	public JLabel jLabelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor;
	public JButton jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorArbol= new JButtonMe();

	public JPanel jPanelid_responsable_fondoFacturaProveedor;
	public JLabel jLabelid_responsable_fondoFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_responsable_fondoFacturaProveedor;
	public JButton jButtonid_responsable_fondoFacturaProveedor= new JButtonMe();
	public JButton jButtonid_responsable_fondoFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_responsable_fondoFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor;
	public JLabel jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor;
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_gastoFacturaProveedor;
	public JLabel jLabelid_cuenta_contable_gastoFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_gastoFacturaProveedor;
	public JButton jButtonid_cuenta_contable_gastoFacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gastoFacturaProveedorArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_gasto2FacturaProveedor;
	public JLabel jLabelid_cuenta_contable_gasto2FacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_gasto2FacturaProveedor;
	public JButton jButtonid_cuenta_contable_gasto2FacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gasto2FacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_gasto2FacturaProveedorArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_credito_finFacturaProveedor;
	public JLabel jLabelid_cuenta_contable_credito_finFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_finFacturaProveedor;
	public JButton jButtonid_cuenta_contable_credito_finFacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_finFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_finFacturaProveedorArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_credito_fin2FacturaProveedor;
	public JLabel jLabelid_cuenta_contable_credito_fin2FacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor;
	public JButton jButtonid_cuenta_contable_credito_fin2FacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fin2FacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fin2FacturaProveedorArbol= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_creditoFacturaProveedor;
	public JLabel jLabelid_cuenta_contable_creditoFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_creditoFacturaProveedor;
	public JButton jButtonid_cuenta_contable_creditoFacturaProveedor= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_creditoFacturaProveedorArbol= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoFacturaProveedor;
	public JLabel jLabelid_tipo_movimientoFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFacturaProveedor;
	public JButton jButtonid_tipo_movimientoFacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimiento_moduloFacturaProveedor;
	public JLabel jLabelid_tipo_movimiento_moduloFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloFacturaProveedor;
	public JButton jButtonid_tipo_movimiento_moduloFacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloFacturaProveedor;
	public JLabel jLabelid_tipo_transaccion_moduloFacturaProveedor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFacturaProveedor;
	public JButton jButtonid_tipo_transaccion_moduloFacturaProveedor= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFacturaProveedorUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturaProveedor;
	
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
	public int iHeightFormulario=1327;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FacturaProveedorDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturaProveedor=new JPanel();
				this.jPanelAccionesFormularioFacturaProveedor=new JPanel();
				this.jmenuBarDetalleFacturaProveedor=new JMenuBar();
				this.jTtoolBarDetalleFacturaProveedor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturaProveedorDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaProveedor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturaProveedor() {
		return this.jButtonActualizarToolBarFacturaProveedor;
	}
	
	public JButton getjButtonEliminarToolBarFacturaProveedor() {
		return this.jButtonEliminarToolBarFacturaProveedor;
	}
	
	public JButton getjButtonCancelarToolBarFacturaProveedor() {
		return this.jButtonCancelarToolBarFacturaProveedor;
	}		
	
	public JButton getjButtonProcesarInformacionFacturaProveedor() {
		return this.jButtonProcesarInformacionFacturaProveedor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaProveedor)	{
		this.jButtonProcesarInformacionFacturaProveedor = jButtonProcesarInformacionFacturaProveedor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaProveedor() {
		return this.jComboBoxTiposAccionesFacturaProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaProveedor(
			JComboBox jComboBoxTiposRelacionesFacturaProveedor) {
		this.jComboBoxTiposRelacionesFacturaProveedor = jComboBoxTiposRelacionesFacturaProveedor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaProveedor(
			JComboBox jComboBoxTiposAccionesFacturaProveedor) {
		this.jComboBoxTiposAccionesFacturaProveedor = jComboBoxTiposAccionesFacturaProveedor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturaProveedor() {
		return this.jComboBoxTiposAccionesFormularioFacturaProveedor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturaProveedor(
			JComboBox jComboBoxTiposAccionesFormularioFacturaProveedor) {
		this.jComboBoxTiposAccionesFormularioFacturaProveedor = jComboBoxTiposAccionesFormularioFacturaProveedor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturaproveedorSessionBean=new FacturaProveedorSessionBean();
		
		this.facturaproveedorSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaproveedorSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturaproveedorSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detallefacturaproveedorSessionBean=new DetalleFacturaProveedorSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaProveedorJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 6650) {
			iWidth=6650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturaProveedor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturaProveedor=new JButtonMe();
				this.jButtonModificarToolBarFacturaProveedor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"actualizar","actualizar","Actualizar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"eliminar","eliminar","Eliminar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"cancelar","cancelar","Cancelar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturaProveedor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturaProveedor,this.jTtoolBarDetalleFacturaProveedor,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturaProveedor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturaProveedor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturaProveedor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturaProveedor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturaProveedor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaProveedor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaProveedor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaProveedor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturaProveedor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturaProveedor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturaProveedor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturaProveedor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturaProveedor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturaProveedor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturaProveedor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturaProveedor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturaProveedor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturaProveedor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturaProveedor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturaProveedor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturaProveedor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaProveedor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaProveedor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturaProveedor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturaProveedor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturaProveedor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaProveedor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaProveedor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaProveedor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaProveedor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturaProveedor.add(this.jMenuItemDetalleCerrarFacturaProveedor);
		
		this.jmenuDetalleAccionesFacturaProveedor.add(this.jMenuItemActualizarFacturaProveedor);
		this.jmenuDetalleAccionesFacturaProveedor.add(this.jMenuItemEliminarFacturaProveedor);
		this.jmenuDetalleAccionesFacturaProveedor.add(this.jMenuItemCancelarFacturaProveedor);		
		
		//this.jmenuDetalleDatosFacturaProveedor.add(this.jMenuItemDetalleAbrirOrderByFacturaProveedor);				
		this.jmenuDetalleDatosFacturaProveedor.add(this.jMenuItemDetalleMostarOcultarFacturaProveedor);				
				
		//this.jmenuDetalleAccionesFacturaProveedor.add(this.jMenuItemGuardarCambiosFacturaProveedor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturaProveedor.add(this.jmenuDetalleArchivoFacturaProveedor);		
		this.jmenuBarDetalleFacturaProveedor.add(this.jmenuDetalleAccionesFacturaProveedor);		
		this.jmenuBarDetalleFacturaProveedor.add(this.jmenuDetalleDatosFacturaProveedor);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleFacturaProveedor.add(this.jmenuDetalleFacturaProveedor);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturaProveedor);				
	}
	
	
	public void inicializarElementosCamposFacturaProveedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturaProveedor = new JLabelMe();
		jLabelIdFacturaProveedor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturaProveedor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturaProveedor= new GridBagLayout();

		this.jPanelidFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);

		jLabelidFacturaProveedor = new JLabel();
		jLabelidFacturaProveedor.setText("Id");

		jLabelidFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelplazoFacturaProveedor = new JLabelMe();
		this.jLabelplazoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_PLAZO+" : *");
		this.jLabelplazoFacturaProveedor.setToolTipText("Plazo");
		this.jLabelplazoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplazoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplazoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelplazoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelplazoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelplazoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_PLAZO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelplazoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldplazoFacturaProveedor= new JTextFieldMe();
		jTextFieldplazoFacturaProveedor.setEnabled(false);
		jTextFieldplazoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplazoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplazoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldplazoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldplazoFacturaProveedor.setText("0");

		this.jButtonplazoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonplazoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplazoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplazoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonplazoFacturaProveedorBusqueda.setText("U");
		this.jButtonplazoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonplazoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonplazoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldplazoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldplazoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"plazoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonplazoFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaFacturaProveedor = new JLabelMe();
		this.jLabelnumero_facturaFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_NUMEROFACTURA+" :");
		this.jLabelnumero_facturaFacturaProveedor.setToolTipText("No Factura");
		this.jLabelnumero_facturaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelnumero_facturaFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldnumero_facturaFacturaProveedor= new JTextFieldMe();

		jTextFieldnumero_facturaFacturaProveedor.setEnabled(false);
		jTextFieldnumero_facturaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonnumero_facturaFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaFacturaProveedorBusqueda.setText("U");
		this.jButtonnumero_facturaFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionFacturaProveedor = new JLabelMe();
		this.jLabelfecha_emisionFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionFacturaProveedor.setToolTipText("F. Emision");
		this.jLabelfecha_emisionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelfecha_emisionFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		//jFormattedTextFieldfecha_emisionFacturaProveedor= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionFacturaProveedor= new JDateChooser();
		jDateChooserfecha_emisionFacturaProveedor.setEnabled(false);
		jDateChooserfecha_emisionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionFacturaProveedor.setDate(new Date());
		jDateChooserfecha_emisionFacturaProveedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionFacturaProveedor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonfecha_emisionFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionFacturaProveedorBusqueda.setText("U");
		this.jButtonfecha_emisionFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelrucFacturaProveedor = new JLabelMe();
		this.jLabelrucFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucFacturaProveedor.setToolTipText("Ruc");
		this.jLabelrucFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelrucFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldrucFacturaProveedor= new JTextFieldMe();

		jTextFieldrucFacturaProveedor.setEnabled(false);
		jTextFieldrucFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonrucFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucFacturaProveedorBusqueda.setText("U");
		this.jButtonrucFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venceFacturaProveedor = new JLabelMe();
		this.jLabelfecha_venceFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceFacturaProveedor.setToolTipText("F. Vence");
		this.jLabelfecha_venceFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelfecha_venceFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		//jFormattedTextFieldfecha_venceFacturaProveedor= new JFormattedTextFieldMe();

		jDateChooserfecha_venceFacturaProveedor= new JDateChooser();
		jDateChooserfecha_venceFacturaProveedor.setEnabled(false);
		jDateChooserfecha_venceFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceFacturaProveedor.setDate(new Date());
		jDateChooserfecha_venceFacturaProveedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceFacturaProveedor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonfecha_venceFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceFacturaProveedorBusqueda.setText("U");
		this.jButtonfecha_venceFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcon_activosFacturaProveedor = new JLabelMe();
		this.jLabelcon_activosFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_CONACTIVOS+" : *");
		this.jLabelcon_activosFacturaProveedor.setToolTipText("Activos");
		this.jLabelcon_activosFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_activosFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_activosFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_activosFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_activosFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_activosFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_CONACTIVOS);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelcon_activosFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jCheckBoxcon_activosFacturaProveedor= new JCheckBoxMe();
		jCheckBoxcon_activosFacturaProveedor.setEnabled(false);

		jCheckBoxcon_activosFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_activosFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_activosFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_activosFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_activosFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoncon_activosFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_activosFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_activosFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_activosFacturaProveedorBusqueda.setText("U");
		this.jButtoncon_activosFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_activosFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_activosFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_activosFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_activosFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_activosFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_activosFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcon_riseFacturaProveedor = new JLabelMe();
		this.jLabelcon_riseFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_CONRISE+" : *");
		this.jLabelcon_riseFacturaProveedor.setToolTipText("Rise");
		this.jLabelcon_riseFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_riseFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_riseFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_riseFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_riseFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_riseFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_CONRISE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelcon_riseFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jCheckBoxcon_riseFacturaProveedor= new JCheckBoxMe();
		jCheckBoxcon_riseFacturaProveedor.setEnabled(false);

		jCheckBoxcon_riseFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_riseFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_riseFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_riseFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_riseFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoncon_riseFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_riseFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_riseFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_riseFacturaProveedorBusqueda.setText("U");
		this.jButtoncon_riseFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_riseFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_riseFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_riseFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_riseFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_riseFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_riseFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcon_sitiosFacturaProveedor = new JLabelMe();
		this.jLabelcon_sitiosFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_CONSITIOS+" : *");
		this.jLabelcon_sitiosFacturaProveedor.setToolTipText("Sitios");
		this.jLabelcon_sitiosFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_sitiosFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_sitiosFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_sitiosFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_sitiosFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_sitiosFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_CONSITIOS);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelcon_sitiosFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jCheckBoxcon_sitiosFacturaProveedor= new JCheckBoxMe();
		jCheckBoxcon_sitiosFacturaProveedor.setEnabled(false);

		jCheckBoxcon_sitiosFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_sitiosFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_sitiosFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_sitiosFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_sitiosFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoncon_sitiosFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_sitiosFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_sitiosFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_sitiosFacturaProveedorBusqueda.setText("U");
		this.jButtoncon_sitiosFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_sitiosFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_sitiosFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_sitiosFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_sitiosFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_sitiosFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_sitiosFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeldetalleFacturaProveedor = new JLabelMe();
		this.jLabeldetalleFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_DETALLE+" : *");
		this.jLabeldetalleFacturaProveedor.setToolTipText("Detalle");
		this.jLabeldetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPaneldetalleFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextAreadetalleFacturaProveedor= new JTextAreaMe();
		jTextAreadetalleFacturaProveedor.setEnabled(false);
		jTextAreadetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleFacturaProveedor.setLineWrap(true);
		jTextAreadetalleFacturaProveedor.setWrapStyleWord(true);
		jTextAreadetalleFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleFacturaProveedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleFacturaProveedor = new JScrollPane(jTextAreadetalleFacturaProveedor);
		jscrollPanedetalleFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35));
		jscrollPanedetalleFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35));
		jscrollPanedetalleFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35));

		this.jButtondetalleFacturaProveedorBusqueda= new JButtonMe();
		this.jButtondetalleFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleFacturaProveedorBusqueda.setText("U");
		this.jButtondetalleFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelvalor_bienes12FacturaProveedor = new JLabelMe();
		this.jLabelvalor_bienes12FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_VALORBIENES12+" : *");
		this.jLabelvalor_bienes12FacturaProveedor.setToolTipText("Valor12% B");
		this.jLabelvalor_bienes12FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_bienes12FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_bienes12FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_bienes12FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_bienes12FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_bienes12FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_VALORBIENES12);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelvalor_bienes12FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldvalor_bienes12FacturaProveedor= new JTextFieldMe();
		jTextFieldvalor_bienes12FacturaProveedor.setEnabled(false);
		jTextFieldvalor_bienes12FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_bienes12FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_bienes12FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_bienes12FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_bienes12FacturaProveedor.setText("0.0");

		this.jButtonvalor_bienes12FacturaProveedorBusqueda= new JButtonMe();
		this.jButtonvalor_bienes12FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_bienes12FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_bienes12FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_bienes12FacturaProveedorBusqueda.setText("U");
		this.jButtonvalor_bienes12FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_bienes12FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_bienes12FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_bienes12FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_bienes12FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_bienes12FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_bienes12FacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelvalor_servicios12FacturaProveedor = new JLabelMe();
		this.jLabelvalor_servicios12FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_VALORSERVICIOS12+" : *");
		this.jLabelvalor_servicios12FacturaProveedor.setToolTipText("Valor 12% S");
		this.jLabelvalor_servicios12FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_servicios12FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_servicios12FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_servicios12FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_servicios12FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_servicios12FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_VALORSERVICIOS12);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelvalor_servicios12FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldvalor_servicios12FacturaProveedor= new JTextFieldMe();
		jTextFieldvalor_servicios12FacturaProveedor.setEnabled(false);
		jTextFieldvalor_servicios12FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicios12FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicios12FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_servicios12FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_servicios12FacturaProveedor.setText("0.0");

		this.jButtonvalor_servicios12FacturaProveedorBusqueda= new JButtonMe();
		this.jButtonvalor_servicios12FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicios12FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicios12FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_servicios12FacturaProveedorBusqueda.setText("U");
		this.jButtonvalor_servicios12FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_servicios12FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_servicios12FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_servicios12FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_servicios12FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_servicios12FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_servicios12FacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeltotal_valor12FacturaProveedor = new JLabelMe();
		this.jLabeltotal_valor12FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_TOTALVALOR12+" : *");
		this.jLabeltotal_valor12FacturaProveedor.setToolTipText("Total 12%");
		this.jLabeltotal_valor12FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_valor12FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_valor12FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_valor12FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_valor12FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_valor12FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_TOTALVALOR12);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPaneltotal_valor12FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldtotal_valor12FacturaProveedor= new JTextFieldMe();
		jTextFieldtotal_valor12FacturaProveedor.setEnabled(false);
		jTextFieldtotal_valor12FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_valor12FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_valor12FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_valor12FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_valor12FacturaProveedor.setText("0.0");

		this.jButtontotal_valor12FacturaProveedorBusqueda= new JButtonMe();
		this.jButtontotal_valor12FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_valor12FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_valor12FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_valor12FacturaProveedorBusqueda.setText("U");
		this.jButtontotal_valor12FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_valor12FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_valor12FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_valor12FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_valor12FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_valor12FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_valor12FacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelvalor_bienes0FacturaProveedor = new JLabelMe();
		this.jLabelvalor_bienes0FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_VALORBIENES0+" : *");
		this.jLabelvalor_bienes0FacturaProveedor.setToolTipText("Valor 0% B");
		this.jLabelvalor_bienes0FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_bienes0FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_bienes0FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_bienes0FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_bienes0FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_bienes0FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_VALORBIENES0);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelvalor_bienes0FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldvalor_bienes0FacturaProveedor= new JTextFieldMe();
		jTextFieldvalor_bienes0FacturaProveedor.setEnabled(false);
		jTextFieldvalor_bienes0FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_bienes0FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_bienes0FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_bienes0FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_bienes0FacturaProveedor.setText("0.0");

		this.jButtonvalor_bienes0FacturaProveedorBusqueda= new JButtonMe();
		this.jButtonvalor_bienes0FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_bienes0FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_bienes0FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_bienes0FacturaProveedorBusqueda.setText("U");
		this.jButtonvalor_bienes0FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_bienes0FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_bienes0FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_bienes0FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_bienes0FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_bienes0FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_bienes0FacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelvalor_servicios0FacturaProveedor = new JLabelMe();
		this.jLabelvalor_servicios0FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_VALORSERVICIOS0+" : *");
		this.jLabelvalor_servicios0FacturaProveedor.setToolTipText("Valor 0% S");
		this.jLabelvalor_servicios0FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_servicios0FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalor_servicios0FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_servicios0FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_servicios0FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_servicios0FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_VALORSERVICIOS0);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelvalor_servicios0FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldvalor_servicios0FacturaProveedor= new JTextFieldMe();
		jTextFieldvalor_servicios0FacturaProveedor.setEnabled(false);
		jTextFieldvalor_servicios0FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicios0FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicios0FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_servicios0FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_servicios0FacturaProveedor.setText("0.0");

		this.jButtonvalor_servicios0FacturaProveedorBusqueda= new JButtonMe();
		this.jButtonvalor_servicios0FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicios0FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicios0FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_servicios0FacturaProveedorBusqueda.setText("U");
		this.jButtonvalor_servicios0FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_servicios0FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_servicios0FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_servicios0FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_servicios0FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_servicios0FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_servicios0FacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeltotal_valor0FacturaProveedor = new JLabelMe();
		this.jLabeltotal_valor0FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_TOTALVALOR0+" : *");
		this.jLabeltotal_valor0FacturaProveedor.setToolTipText("Total 0%");
		this.jLabeltotal_valor0FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_valor0FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_valor0FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_valor0FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_valor0FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_valor0FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_TOTALVALOR0);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPaneltotal_valor0FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldtotal_valor0FacturaProveedor= new JTextFieldMe();
		jTextFieldtotal_valor0FacturaProveedor.setEnabled(false);
		jTextFieldtotal_valor0FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_valor0FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_valor0FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_valor0FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_valor0FacturaProveedor.setText("0.0");

		this.jButtontotal_valor0FacturaProveedorBusqueda= new JButtonMe();
		this.jButtontotal_valor0FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_valor0FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_valor0FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_valor0FacturaProveedorBusqueda.setText("U");
		this.jButtontotal_valor0FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_valor0FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_valor0FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_valor0FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_valor0FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_valor0FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_valor0FacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelbienes_iceFacturaProveedor = new JLabelMe();
		this.jLabelbienes_iceFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_BIENESICE+" : *");
		this.jLabelbienes_iceFacturaProveedor.setToolTipText("ICE B.");
		this.jLabelbienes_iceFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_iceFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_iceFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbienes_iceFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbienes_iceFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbienes_iceFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_BIENESICE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelbienes_iceFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldbienes_iceFacturaProveedor= new JTextFieldMe();
		jTextFieldbienes_iceFacturaProveedor.setEnabled(false);
		jTextFieldbienes_iceFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_iceFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_iceFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbienes_iceFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbienes_iceFacturaProveedor.setText("0.0");

		this.jButtonbienes_iceFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonbienes_iceFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_iceFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_iceFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbienes_iceFacturaProveedorBusqueda.setText("U");
		this.jButtonbienes_iceFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbienes_iceFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbienes_iceFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbienes_iceFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbienes_iceFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bienes_iceFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbienes_iceFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelservicios_iceFacturaProveedor = new JLabelMe();
		this.jLabelservicios_iceFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_SERVICIOSICE+" : *");
		this.jLabelservicios_iceFacturaProveedor.setToolTipText("ICE S.");
		this.jLabelservicios_iceFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelservicios_iceFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelservicios_iceFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelservicios_iceFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelservicios_iceFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelservicios_iceFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_SERVICIOSICE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelservicios_iceFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldservicios_iceFacturaProveedor= new JTextFieldMe();
		jTextFieldservicios_iceFacturaProveedor.setEnabled(false);
		jTextFieldservicios_iceFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_iceFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_iceFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldservicios_iceFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldservicios_iceFacturaProveedor.setText("0.0");

		this.jButtonservicios_iceFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonservicios_iceFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_iceFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_iceFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonservicios_iceFacturaProveedorBusqueda.setText("U");
		this.jButtonservicios_iceFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonservicios_iceFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonservicios_iceFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldservicios_iceFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldservicios_iceFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"servicios_iceFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonservicios_iceFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeltotal_iceFacturaProveedor = new JLabelMe();
		this.jLabeltotal_iceFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_TOTALICE+" : *");
		this.jLabeltotal_iceFacturaProveedor.setToolTipText("Total ICE");
		this.jLabeltotal_iceFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_iceFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_iceFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_iceFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_iceFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_iceFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_TOTALICE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPaneltotal_iceFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldtotal_iceFacturaProveedor= new JTextFieldMe();
		jTextFieldtotal_iceFacturaProveedor.setEnabled(false);
		jTextFieldtotal_iceFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_iceFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_iceFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_iceFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_iceFacturaProveedor.setText("0.0");

		this.jButtontotal_iceFacturaProveedorBusqueda= new JButtonMe();
		this.jButtontotal_iceFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_iceFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_iceFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_iceFacturaProveedorBusqueda.setText("U");
		this.jButtontotal_iceFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_iceFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_iceFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_iceFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_iceFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_iceFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_iceFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelbienes_ivaFacturaProveedor = new JLabelMe();
		this.jLabelbienes_ivaFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_BIENESIVA+" : *");
		this.jLabelbienes_ivaFacturaProveedor.setToolTipText("IVA B.");
		this.jLabelbienes_ivaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_ivaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelbienes_ivaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelbienes_ivaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelbienes_ivaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelbienes_ivaFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_BIENESIVA);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelbienes_ivaFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldbienes_ivaFacturaProveedor= new JTextFieldMe();
		jTextFieldbienes_ivaFacturaProveedor.setEnabled(false);
		jTextFieldbienes_ivaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_ivaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldbienes_ivaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldbienes_ivaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldbienes_ivaFacturaProveedor.setText("0.0");

		this.jButtonbienes_ivaFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonbienes_ivaFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_ivaFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonbienes_ivaFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonbienes_ivaFacturaProveedorBusqueda.setText("U");
		this.jButtonbienes_ivaFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonbienes_ivaFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonbienes_ivaFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldbienes_ivaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldbienes_ivaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"bienes_ivaFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonbienes_ivaFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelservicios_ivaFacturaProveedor = new JLabelMe();
		this.jLabelservicios_ivaFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_SERVICIOSIVA+" : *");
		this.jLabelservicios_ivaFacturaProveedor.setToolTipText("IVA S.");
		this.jLabelservicios_ivaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelservicios_ivaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelservicios_ivaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelservicios_ivaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelservicios_ivaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelservicios_ivaFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_SERVICIOSIVA);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelservicios_ivaFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldservicios_ivaFacturaProveedor= new JTextFieldMe();
		jTextFieldservicios_ivaFacturaProveedor.setEnabled(false);
		jTextFieldservicios_ivaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_ivaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldservicios_ivaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldservicios_ivaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldservicios_ivaFacturaProveedor.setText("0.0");

		this.jButtonservicios_ivaFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonservicios_ivaFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_ivaFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonservicios_ivaFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonservicios_ivaFacturaProveedorBusqueda.setText("U");
		this.jButtonservicios_ivaFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonservicios_ivaFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonservicios_ivaFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldservicios_ivaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldservicios_ivaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"servicios_ivaFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonservicios_ivaFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaFacturaProveedor = new JLabelMe();
		this.jLabeltotal_ivaFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaFacturaProveedor.setToolTipText("Total IVA");
		this.jLabeltotal_ivaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPaneltotal_ivaFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldtotal_ivaFacturaProveedor= new JTextFieldMe();
		jTextFieldtotal_ivaFacturaProveedor.setEnabled(false);
		jTextFieldtotal_ivaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaFacturaProveedor.setText("0.0");

		this.jButtontotal_ivaFacturaProveedorBusqueda= new JButtonMe();
		this.jButtontotal_ivaFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaFacturaProveedorBusqueda.setText("U");
		this.jButtontotal_ivaFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeliva_porcentajeFacturaProveedor = new JLabelMe();
		this.jLabeliva_porcentajeFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IVAPORCENTAJE+" : *");
		this.jLabeliva_porcentajeFacturaProveedor.setToolTipText("IVA %");
		this.jLabeliva_porcentajeFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_porcentajeFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_porcentajeFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_porcentajeFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_porcentajeFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_porcentajeFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IVAPORCENTAJE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPaneliva_porcentajeFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldiva_porcentajeFacturaProveedor= new JTextFieldMe();
		jTextFieldiva_porcentajeFacturaProveedor.setEnabled(false);
		jTextFieldiva_porcentajeFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_porcentajeFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_porcentajeFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_porcentajeFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_porcentajeFacturaProveedor.setText("0.0");

		this.jButtoniva_porcentajeFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoniva_porcentajeFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_porcentajeFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_porcentajeFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_porcentajeFacturaProveedorBusqueda.setText("U");
		this.jButtoniva_porcentajeFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_porcentajeFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_porcentajeFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_porcentajeFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_porcentajeFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_porcentajeFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_porcentajeFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeltotalFacturaProveedor = new JLabelMe();
		this.jLabeltotalFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalFacturaProveedor.setToolTipText("Total");
		this.jLabeltotalFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPaneltotalFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldtotalFacturaProveedor= new JTextFieldMe();
		jTextFieldtotalFacturaProveedor.setEnabled(false);
		jTextFieldtotalFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalFacturaProveedor.setText("0.0");

		this.jButtontotalFacturaProveedorBusqueda= new JButtonMe();
		this.jButtontotalFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalFacturaProveedorBusqueda.setText("U");
		this.jButtontotalFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcon_monto_objeto_ivaFacturaProveedor = new JLabelMe();
		this.jLabelcon_monto_objeto_ivaFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_CONMONTOOBJETOIVA+" : *");
		this.jLabelcon_monto_objeto_ivaFacturaProveedor.setToolTipText("Monto Sin Iva");
		this.jLabelcon_monto_objeto_ivaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_monto_objeto_ivaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_monto_objeto_ivaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_monto_objeto_ivaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_monto_objeto_ivaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_monto_objeto_ivaFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_CONMONTOOBJETOIVA);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelcon_monto_objeto_ivaFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jCheckBoxcon_monto_objeto_ivaFacturaProveedor= new JCheckBoxMe();
		jCheckBoxcon_monto_objeto_ivaFacturaProveedor.setEnabled(false);

		jCheckBoxcon_monto_objeto_ivaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_monto_objeto_ivaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_monto_objeto_ivaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_monto_objeto_ivaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda.setText("U");
		this.jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_monto_objeto_ivaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_monto_objeto_ivaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_monto_objeto_ivaFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionFacturaProveedor = new JLabelMe();
		this.jLabelnumero_retencionFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_NUMERORETENCION+" : *");
		this.jLabelnumero_retencionFacturaProveedor.setToolTipText("No Retencion");
		this.jLabelnumero_retencionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelnumero_retencionFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldnumero_retencionFacturaProveedor= new JTextFieldMe();

		jTextFieldnumero_retencionFacturaProveedor.setEnabled(false);
		jTextFieldnumero_retencionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencionFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonnumero_retencionFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionFacturaProveedorBusqueda.setText("U");
		this.jButtonnumero_retencionFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serieFacturaProveedor = new JLabelMe();
		this.jLabelnumero_serieFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_NUMEROSERIE+" : *");
		this.jLabelnumero_serieFacturaProveedor.setToolTipText("No Serie");
		this.jLabelnumero_serieFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelnumero_serieFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldnumero_serieFacturaProveedor= new JTextFieldMe();

		jTextFieldnumero_serieFacturaProveedor.setEnabled(false);
		jTextFieldnumero_serieFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serieFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonnumero_serieFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieFacturaProveedorBusqueda.setText("U");
		this.jButtonnumero_serieFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionFacturaProveedor = new JLabelMe();
		this.jLabelnumero_autorizacionFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_NUMEROAUTORIZACION+" : *");
		this.jLabelnumero_autorizacionFacturaProveedor.setToolTipText("No Autori.");
		this.jLabelnumero_autorizacionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_autorizacionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_autorizacionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelnumero_autorizacionFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldnumero_autorizacionFacturaProveedor= new JTextFieldMe();

		jTextFieldnumero_autorizacionFacturaProveedor.setEnabled(false);
		jTextFieldnumero_autorizacionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionFacturaProveedorBusqueda.setText("U");
		this.jButtonnumero_autorizacionFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelfecha_validezFacturaProveedor = new JLabelMe();
		this.jLabelfecha_validezFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_FECHAVALIDEZ+" : *");
		this.jLabelfecha_validezFacturaProveedor.setToolTipText("F. Validez");
		this.jLabelfecha_validezFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_validezFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_validezFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_validezFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_validezFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_validezFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_FECHAVALIDEZ);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelfecha_validezFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		//jFormattedTextFieldfecha_validezFacturaProveedor= new JFormattedTextFieldMe();

		jDateChooserfecha_validezFacturaProveedor= new JDateChooser();
		jDateChooserfecha_validezFacturaProveedor.setEnabled(false);
		jDateChooserfecha_validezFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_validezFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_validezFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_validezFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_validezFacturaProveedor.setDate(new Date());
		jDateChooserfecha_validezFacturaProveedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_validezFacturaProveedor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_validezFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonfecha_validezFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_validezFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_validezFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_validezFacturaProveedorBusqueda.setText("U");
		this.jButtonfecha_validezFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_validezFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_validezFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_validezFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_validezFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_validezFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_validezFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_fuente1_porcentajeFacturaProveedor = new JLabelMe();
		this.jLabelret_fuente1_porcentajeFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETFUENTE1PORCENTAJE+" : *");
		this.jLabelret_fuente1_porcentajeFacturaProveedor.setToolTipText("% F1");
		this.jLabelret_fuente1_porcentajeFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_fuente1_porcentajeFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_fuente1_porcentajeFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelret_fuente1_porcentajeFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_fuente1_porcentajeFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_fuente1_porcentajeFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETFUENTE1PORCENTAJE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_fuente1_porcentajeFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_fuente1_porcentajeFacturaProveedor= new JTextFieldMe();
		jTextFieldret_fuente1_porcentajeFacturaProveedor.setEnabled(false);
		jTextFieldret_fuente1_porcentajeFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente1_porcentajeFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente1_porcentajeFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_fuente1_porcentajeFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_fuente1_porcentajeFacturaProveedor.setText("0.0");

		this.jButtonret_fuente1_porcentajeFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_fuente1_porcentajeFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente1_porcentajeFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente1_porcentajeFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_fuente1_porcentajeFacturaProveedorBusqueda.setText("U");
		this.jButtonret_fuente1_porcentajeFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_fuente1_porcentajeFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_fuente1_porcentajeFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_fuente1_porcentajeFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_fuente1_porcentajeFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_fuente1_porcentajeFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_fuente1_porcentajeFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_fuente1_baseFacturaProveedor = new JLabelMe();
		this.jLabelret_fuente1_baseFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETFUENTE1BASE+" : *");
		this.jLabelret_fuente1_baseFacturaProveedor.setToolTipText("Base F1");
		this.jLabelret_fuente1_baseFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_fuente1_baseFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_fuente1_baseFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelret_fuente1_baseFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_fuente1_baseFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_fuente1_baseFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETFUENTE1BASE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_fuente1_baseFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_fuente1_baseFacturaProveedor= new JTextFieldMe();
		jTextFieldret_fuente1_baseFacturaProveedor.setEnabled(false);
		jTextFieldret_fuente1_baseFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente1_baseFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente1_baseFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_fuente1_baseFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_fuente1_baseFacturaProveedor.setText("0.0");

		this.jButtonret_fuente1_baseFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_fuente1_baseFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente1_baseFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente1_baseFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_fuente1_baseFacturaProveedorBusqueda.setText("U");
		this.jButtonret_fuente1_baseFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_fuente1_baseFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_fuente1_baseFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_fuente1_baseFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_fuente1_baseFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_fuente1_baseFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_fuente1_baseFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_fuente1_retenidoFacturaProveedor = new JLabelMe();
		this.jLabelret_fuente1_retenidoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETFUENTE1RETENIDO+" : *");
		this.jLabelret_fuente1_retenidoFacturaProveedor.setToolTipText("Val Retenido F1");
		this.jLabelret_fuente1_retenidoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_fuente1_retenidoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_fuente1_retenidoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_fuente1_retenidoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_fuente1_retenidoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_fuente1_retenidoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETFUENTE1RETENIDO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_fuente1_retenidoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_fuente1_retenidoFacturaProveedor= new JTextFieldMe();
		jTextFieldret_fuente1_retenidoFacturaProveedor.setEnabled(false);
		jTextFieldret_fuente1_retenidoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente1_retenidoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente1_retenidoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_fuente1_retenidoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_fuente1_retenidoFacturaProveedor.setText("0.0");

		this.jButtonret_fuente1_retenidoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_fuente1_retenidoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente1_retenidoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente1_retenidoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_fuente1_retenidoFacturaProveedorBusqueda.setText("U");
		this.jButtonret_fuente1_retenidoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_fuente1_retenidoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_fuente1_retenidoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_fuente1_retenidoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_fuente1_retenidoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_fuente1_retenidoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_fuente1_retenidoFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_fuente2_porcentajeFacturaProveedor = new JLabelMe();
		this.jLabelret_fuente2_porcentajeFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETFUENTE2PORCENTAJE+" : *");
		this.jLabelret_fuente2_porcentajeFacturaProveedor.setToolTipText("% F2");
		this.jLabelret_fuente2_porcentajeFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_fuente2_porcentajeFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_fuente2_porcentajeFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelret_fuente2_porcentajeFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_fuente2_porcentajeFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_fuente2_porcentajeFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETFUENTE2PORCENTAJE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_fuente2_porcentajeFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_fuente2_porcentajeFacturaProveedor= new JTextFieldMe();
		jTextFieldret_fuente2_porcentajeFacturaProveedor.setEnabled(false);
		jTextFieldret_fuente2_porcentajeFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente2_porcentajeFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente2_porcentajeFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_fuente2_porcentajeFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_fuente2_porcentajeFacturaProveedor.setText("0.0");

		this.jButtonret_fuente2_porcentajeFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_fuente2_porcentajeFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente2_porcentajeFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente2_porcentajeFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_fuente2_porcentajeFacturaProveedorBusqueda.setText("U");
		this.jButtonret_fuente2_porcentajeFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_fuente2_porcentajeFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_fuente2_porcentajeFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_fuente2_porcentajeFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_fuente2_porcentajeFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_fuente2_porcentajeFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_fuente2_porcentajeFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_fuente2_baseFacturaProveedor = new JLabelMe();
		this.jLabelret_fuente2_baseFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETFUENTE2BASE+" : *");
		this.jLabelret_fuente2_baseFacturaProveedor.setToolTipText("Base F2");
		this.jLabelret_fuente2_baseFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_fuente2_baseFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_fuente2_baseFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelret_fuente2_baseFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_fuente2_baseFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_fuente2_baseFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETFUENTE2BASE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_fuente2_baseFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_fuente2_baseFacturaProveedor= new JTextFieldMe();
		jTextFieldret_fuente2_baseFacturaProveedor.setEnabled(false);
		jTextFieldret_fuente2_baseFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente2_baseFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente2_baseFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_fuente2_baseFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_fuente2_baseFacturaProveedor.setText("0.0");

		this.jButtonret_fuente2_baseFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_fuente2_baseFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente2_baseFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente2_baseFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_fuente2_baseFacturaProveedorBusqueda.setText("U");
		this.jButtonret_fuente2_baseFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_fuente2_baseFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_fuente2_baseFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_fuente2_baseFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_fuente2_baseFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_fuente2_baseFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_fuente2_baseFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_fuente2_retenidoFacturaProveedor = new JLabelMe();
		this.jLabelret_fuente2_retenidoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETFUENTE2RETENIDO+" : *");
		this.jLabelret_fuente2_retenidoFacturaProveedor.setToolTipText("Val Retenido F2");
		this.jLabelret_fuente2_retenidoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_fuente2_retenidoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_fuente2_retenidoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_fuente2_retenidoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_fuente2_retenidoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_fuente2_retenidoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETFUENTE2RETENIDO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_fuente2_retenidoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_fuente2_retenidoFacturaProveedor= new JTextFieldMe();
		jTextFieldret_fuente2_retenidoFacturaProveedor.setEnabled(false);
		jTextFieldret_fuente2_retenidoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente2_retenidoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_fuente2_retenidoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_fuente2_retenidoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_fuente2_retenidoFacturaProveedor.setText("0.0");

		this.jButtonret_fuente2_retenidoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_fuente2_retenidoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente2_retenidoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_fuente2_retenidoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_fuente2_retenidoFacturaProveedorBusqueda.setText("U");
		this.jButtonret_fuente2_retenidoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_fuente2_retenidoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_fuente2_retenidoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_fuente2_retenidoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_fuente2_retenidoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_fuente2_retenidoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_fuente2_retenidoFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_iva_bien_porcentajeFacturaProveedor = new JLabelMe();
		this.jLabelret_iva_bien_porcentajeFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETIVABIENPORCENTAJE+" : *");
		this.jLabelret_iva_bien_porcentajeFacturaProveedor.setToolTipText("% IB");
		this.jLabelret_iva_bien_porcentajeFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_iva_bien_porcentajeFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_iva_bien_porcentajeFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelret_iva_bien_porcentajeFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_iva_bien_porcentajeFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_iva_bien_porcentajeFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETIVABIENPORCENTAJE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_iva_bien_porcentajeFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_iva_bien_porcentajeFacturaProveedor= new JTextFieldMe();
		jTextFieldret_iva_bien_porcentajeFacturaProveedor.setEnabled(false);
		jTextFieldret_iva_bien_porcentajeFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_bien_porcentajeFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_bien_porcentajeFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_iva_bien_porcentajeFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_iva_bien_porcentajeFacturaProveedor.setText("0.0");

		this.jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda.setText("U");
		this.jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_iva_bien_porcentajeFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_iva_bien_porcentajeFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_iva_bien_porcentajeFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_iva_bien_baseFacturaProveedor = new JLabelMe();
		this.jLabelret_iva_bien_baseFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETIVABIENBASE+" : *");
		this.jLabelret_iva_bien_baseFacturaProveedor.setToolTipText("Base IB");
		this.jLabelret_iva_bien_baseFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_iva_bien_baseFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_iva_bien_baseFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelret_iva_bien_baseFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_iva_bien_baseFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_iva_bien_baseFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETIVABIENBASE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_iva_bien_baseFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_iva_bien_baseFacturaProveedor= new JTextFieldMe();
		jTextFieldret_iva_bien_baseFacturaProveedor.setEnabled(false);
		jTextFieldret_iva_bien_baseFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_bien_baseFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_bien_baseFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_iva_bien_baseFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_iva_bien_baseFacturaProveedor.setText("0.0");

		this.jButtonret_iva_bien_baseFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_iva_bien_baseFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_bien_baseFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_bien_baseFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_iva_bien_baseFacturaProveedorBusqueda.setText("U");
		this.jButtonret_iva_bien_baseFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_iva_bien_baseFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_iva_bien_baseFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_iva_bien_baseFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_iva_bien_baseFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_iva_bien_baseFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_iva_bien_baseFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_iva_bien_retenidoFacturaProveedor = new JLabelMe();
		this.jLabelret_iva_bien_retenidoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETIVABIENRETENIDO+" : *");
		this.jLabelret_iva_bien_retenidoFacturaProveedor.setToolTipText("Val Retenido IB");
		this.jLabelret_iva_bien_retenidoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_iva_bien_retenidoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_iva_bien_retenidoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_iva_bien_retenidoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_iva_bien_retenidoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_iva_bien_retenidoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETIVABIENRETENIDO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_iva_bien_retenidoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_iva_bien_retenidoFacturaProveedor= new JTextFieldMe();
		jTextFieldret_iva_bien_retenidoFacturaProveedor.setEnabled(false);
		jTextFieldret_iva_bien_retenidoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_bien_retenidoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_bien_retenidoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_iva_bien_retenidoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_iva_bien_retenidoFacturaProveedor.setText("0.0");

		this.jButtonret_iva_bien_retenidoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_iva_bien_retenidoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_bien_retenidoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_bien_retenidoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_iva_bien_retenidoFacturaProveedorBusqueda.setText("U");
		this.jButtonret_iva_bien_retenidoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_iva_bien_retenidoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_iva_bien_retenidoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_iva_bien_retenidoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_iva_bien_retenidoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_iva_bien_retenidoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_iva_bien_retenidoFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_iva_servicio_porcentajeFacturaProveedor = new JLabelMe();
		this.jLabelret_iva_servicio_porcentajeFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETIVASERVICIOPORCENTAJE+" : *");
		this.jLabelret_iva_servicio_porcentajeFacturaProveedor.setToolTipText("% IS");
		this.jLabelret_iva_servicio_porcentajeFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_iva_servicio_porcentajeFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_iva_servicio_porcentajeFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelret_iva_servicio_porcentajeFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_iva_servicio_porcentajeFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_iva_servicio_porcentajeFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETIVASERVICIOPORCENTAJE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_iva_servicio_porcentajeFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_iva_servicio_porcentajeFacturaProveedor= new JTextFieldMe();
		jTextFieldret_iva_servicio_porcentajeFacturaProveedor.setEnabled(false);
		jTextFieldret_iva_servicio_porcentajeFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_servicio_porcentajeFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_servicio_porcentajeFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_iva_servicio_porcentajeFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_iva_servicio_porcentajeFacturaProveedor.setText("0.0");

		this.jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda.setText("U");
		this.jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_iva_servicio_porcentajeFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_iva_servicio_porcentajeFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_iva_servicio_porcentajeFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_iva_servicio_baseFacturaProveedor = new JLabelMe();
		this.jLabelret_iva_servicio_baseFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETIVASERVICIOBASE+" : *");
		this.jLabelret_iva_servicio_baseFacturaProveedor.setToolTipText("Base IS");
		this.jLabelret_iva_servicio_baseFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_iva_servicio_baseFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelret_iva_servicio_baseFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-50),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelret_iva_servicio_baseFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_iva_servicio_baseFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_iva_servicio_baseFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETIVASERVICIOBASE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_iva_servicio_baseFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_iva_servicio_baseFacturaProveedor= new JTextFieldMe();
		jTextFieldret_iva_servicio_baseFacturaProveedor.setEnabled(false);
		jTextFieldret_iva_servicio_baseFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_servicio_baseFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_servicio_baseFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_iva_servicio_baseFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_iva_servicio_baseFacturaProveedor.setText("0.0");

		this.jButtonret_iva_servicio_baseFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_iva_servicio_baseFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_servicio_baseFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_servicio_baseFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_iva_servicio_baseFacturaProveedorBusqueda.setText("U");
		this.jButtonret_iva_servicio_baseFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_iva_servicio_baseFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_iva_servicio_baseFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_iva_servicio_baseFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_iva_servicio_baseFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_iva_servicio_baseFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_iva_servicio_baseFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelret_iva_servicio_retenidoFacturaProveedor = new JLabelMe();
		this.jLabelret_iva_servicio_retenidoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_RETIVASERVICIORETENIDO+" : *");
		this.jLabelret_iva_servicio_retenidoFacturaProveedor.setToolTipText("Val Retenido IS");
		this.jLabelret_iva_servicio_retenidoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_iva_servicio_retenidoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelret_iva_servicio_retenidoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,-40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelret_iva_servicio_retenidoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelret_iva_servicio_retenidoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelret_iva_servicio_retenidoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_RETIVASERVICIORETENIDO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelret_iva_servicio_retenidoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldret_iva_servicio_retenidoFacturaProveedor= new JTextFieldMe();
		jTextFieldret_iva_servicio_retenidoFacturaProveedor.setEnabled(false);
		jTextFieldret_iva_servicio_retenidoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_servicio_retenidoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldret_iva_servicio_retenidoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldret_iva_servicio_retenidoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldret_iva_servicio_retenidoFacturaProveedor.setText("0.0");

		this.jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda.setText("U");
		this.jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldret_iva_servicio_retenidoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldret_iva_servicio_retenidoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ret_iva_servicio_retenidoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelanexo_numero_autorizacionFacturaProveedor = new JLabelMe();
		this.jLabelanexo_numero_autorizacionFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_ANEXONUMEROAUTORIZACION+" : *");
		this.jLabelanexo_numero_autorizacionFacturaProveedor.setToolTipText("No Autori");
		this.jLabelanexo_numero_autorizacionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,15),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_numero_autorizacionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,15),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_numero_autorizacionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,15),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanexo_numero_autorizacionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanexo_numero_autorizacionFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanexo_numero_autorizacionFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_ANEXONUMEROAUTORIZACION);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelanexo_numero_autorizacionFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldanexo_numero_autorizacionFacturaProveedor= new JTextFieldMe();

		jTextFieldanexo_numero_autorizacionFacturaProveedor.setEnabled(false);
		jTextFieldanexo_numero_autorizacionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_numero_autorizacionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_numero_autorizacionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanexo_numero_autorizacionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonanexo_numero_autorizacionFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonanexo_numero_autorizacionFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_numero_autorizacionFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_numero_autorizacionFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanexo_numero_autorizacionFacturaProveedorBusqueda.setText("U");
		this.jButtonanexo_numero_autorizacionFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanexo_numero_autorizacionFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanexo_numero_autorizacionFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanexo_numero_autorizacionFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanexo_numero_autorizacionFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anexo_numero_autorizacionFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanexo_numero_autorizacionFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelanexo_numeso_serieFacturaProveedor = new JLabelMe();
		this.jLabelanexo_numeso_serieFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_ANEXONUMESOSERIE+" : *");
		this.jLabelanexo_numeso_serieFacturaProveedor.setToolTipText("No Serie.");
		this.jLabelanexo_numeso_serieFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_numeso_serieFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_numeso_serieFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanexo_numeso_serieFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanexo_numeso_serieFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanexo_numeso_serieFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_ANEXONUMESOSERIE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelanexo_numeso_serieFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldanexo_numeso_serieFacturaProveedor= new JTextFieldMe();

		jTextFieldanexo_numeso_serieFacturaProveedor.setEnabled(false);
		jTextFieldanexo_numeso_serieFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_numeso_serieFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_numeso_serieFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanexo_numeso_serieFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonanexo_numeso_serieFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonanexo_numeso_serieFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_numeso_serieFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_numeso_serieFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanexo_numeso_serieFacturaProveedorBusqueda.setText("U");
		this.jButtonanexo_numeso_serieFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanexo_numeso_serieFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanexo_numeso_serieFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanexo_numeso_serieFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanexo_numeso_serieFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anexo_numeso_serieFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanexo_numeso_serieFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelanexo_fecha_validezFacturaProveedor = new JLabelMe();
		this.jLabelanexo_fecha_validezFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_ANEXOFECHAVALIDEZ+" : *");
		this.jLabelanexo_fecha_validezFacturaProveedor.setToolTipText("F. Validez.");
		this.jLabelanexo_fecha_validezFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_fecha_validezFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_fecha_validezFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanexo_fecha_validezFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanexo_fecha_validezFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanexo_fecha_validezFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_ANEXOFECHAVALIDEZ);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelanexo_fecha_validezFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		//jFormattedTextFieldanexo_fecha_validezFacturaProveedor= new JFormattedTextFieldMe();

		jDateChooseranexo_fecha_validezFacturaProveedor= new JDateChooser();
		jDateChooseranexo_fecha_validezFacturaProveedor.setEnabled(false);
		jDateChooseranexo_fecha_validezFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooseranexo_fecha_validezFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooseranexo_fecha_validezFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooseranexo_fecha_validezFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooseranexo_fecha_validezFacturaProveedor.setDate(new Date());
		jDateChooseranexo_fecha_validezFacturaProveedor.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldanexo_fecha_validezFacturaProveedor.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonanexo_fecha_validezFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonanexo_fecha_validezFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_fecha_validezFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_fecha_validezFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanexo_fecha_validezFacturaProveedorBusqueda.setText("U");
		this.jButtonanexo_fecha_validezFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanexo_fecha_validezFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanexo_fecha_validezFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooseranexo_fecha_validezFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooseranexo_fecha_validezFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anexo_fecha_validezFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanexo_fecha_validezFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelanexo_factura_inicioFacturaProveedor = new JLabelMe();
		this.jLabelanexo_factura_inicioFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_ANEXOFACTURAINICIO+" : *");
		this.jLabelanexo_factura_inicioFacturaProveedor.setToolTipText("Fac Ini");
		this.jLabelanexo_factura_inicioFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,15),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_factura_inicioFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,15),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_factura_inicioFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,15),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanexo_factura_inicioFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanexo_factura_inicioFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanexo_factura_inicioFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_ANEXOFACTURAINICIO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelanexo_factura_inicioFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldanexo_factura_inicioFacturaProveedor= new JTextFieldMe();

		jTextFieldanexo_factura_inicioFacturaProveedor.setEnabled(false);
		jTextFieldanexo_factura_inicioFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_factura_inicioFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_factura_inicioFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanexo_factura_inicioFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonanexo_factura_inicioFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonanexo_factura_inicioFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_factura_inicioFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_factura_inicioFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanexo_factura_inicioFacturaProveedorBusqueda.setText("U");
		this.jButtonanexo_factura_inicioFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanexo_factura_inicioFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanexo_factura_inicioFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanexo_factura_inicioFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanexo_factura_inicioFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anexo_factura_inicioFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanexo_factura_inicioFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelanexo_factura_finFacturaProveedor = new JLabelMe();
		this.jLabelanexo_factura_finFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_ANEXOFACTURAFIN+" : *");
		this.jLabelanexo_factura_finFacturaProveedor.setToolTipText("Fac Fin");
		this.jLabelanexo_factura_finFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,15),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_factura_finFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,15),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_factura_finFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,15),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanexo_factura_finFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanexo_factura_finFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanexo_factura_finFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_ANEXOFACTURAFIN);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelanexo_factura_finFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldanexo_factura_finFacturaProveedor= new JTextFieldMe();

		jTextFieldanexo_factura_finFacturaProveedor.setEnabled(false);
		jTextFieldanexo_factura_finFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_factura_finFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_factura_finFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanexo_factura_finFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonanexo_factura_finFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonanexo_factura_finFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_factura_finFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_factura_finFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanexo_factura_finFacturaProveedorBusqueda.setText("U");
		this.jButtonanexo_factura_finFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanexo_factura_finFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanexo_factura_finFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanexo_factura_finFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanexo_factura_finFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anexo_factura_finFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanexo_factura_finFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelsecuencialFacturaProveedor = new JLabelMe();
		this.jLabelsecuencialFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_SECUENCIAL+" : *");
		this.jLabelsecuencialFacturaProveedor.setToolTipText("Secuencial");
		this.jLabelsecuencialFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsecuencialFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsecuencialFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsecuencialFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsecuencialFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_SECUENCIAL);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelsecuencialFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldsecuencialFacturaProveedor= new JTextFieldMe();

		jTextFieldsecuencialFacturaProveedor.setEnabled(false);
		jTextFieldsecuencialFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsecuencialFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsecuencialFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonsecuencialFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonsecuencialFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsecuencialFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsecuencialFacturaProveedorBusqueda.setText("U");
		this.jButtonsecuencialFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsecuencialFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsecuencialFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsecuencialFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsecuencialFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"secuencialFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsecuencialFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelgasto_valorFacturaProveedor = new JLabelMe();
		this.jLabelgasto_valorFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_GASTOVALOR+" : *");
		this.jLabelgasto_valorFacturaProveedor.setToolTipText("Valor 1");
		this.jLabelgasto_valorFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_valorFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_valorFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgasto_valorFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgasto_valorFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgasto_valorFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_GASTOVALOR);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelgasto_valorFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldgasto_valorFacturaProveedor= new JTextFieldMe();
		jTextFieldgasto_valorFacturaProveedor.setEnabled(false);
		jTextFieldgasto_valorFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_valorFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_valorFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgasto_valorFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgasto_valorFacturaProveedor.setText("0.0");

		this.jButtongasto_valorFacturaProveedorBusqueda= new JButtonMe();
		this.jButtongasto_valorFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_valorFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_valorFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongasto_valorFacturaProveedorBusqueda.setText("U");
		this.jButtongasto_valorFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongasto_valorFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongasto_valorFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgasto_valorFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgasto_valorFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gasto_valorFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongasto_valorFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelgasto_valor2FacturaProveedor = new JLabelMe();
		this.jLabelgasto_valor2FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_GASTOVALOR2+" : *");
		this.jLabelgasto_valor2FacturaProveedor.setToolTipText("Valor 2");
		this.jLabelgasto_valor2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_valor2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_valor2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgasto_valor2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgasto_valor2FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgasto_valor2FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_GASTOVALOR2);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelgasto_valor2FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldgasto_valor2FacturaProveedor= new JTextFieldMe();
		jTextFieldgasto_valor2FacturaProveedor.setEnabled(false);
		jTextFieldgasto_valor2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_valor2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_valor2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgasto_valor2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgasto_valor2FacturaProveedor.setText("0.0");

		this.jButtongasto_valor2FacturaProveedorBusqueda= new JButtonMe();
		this.jButtongasto_valor2FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_valor2FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_valor2FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongasto_valor2FacturaProveedorBusqueda.setText("U");
		this.jButtongasto_valor2FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongasto_valor2FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongasto_valor2FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgasto_valor2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgasto_valor2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gasto_valor2FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongasto_valor2FacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelgasto_nombreFacturaProveedor = new JLabelMe();
		this.jLabelgasto_nombreFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_GASTONOMBRE+" :");
		this.jLabelgasto_nombreFacturaProveedor.setToolTipText("Gasto Nombre");
		this.jLabelgasto_nombreFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_nombreFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_nombreFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgasto_nombreFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgasto_nombreFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgasto_nombreFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_GASTONOMBRE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelgasto_nombreFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldgasto_nombreFacturaProveedor= new JTextFieldMe();

		jTextFieldgasto_nombreFacturaProveedor.setEnabled(false);
		jTextFieldgasto_nombreFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_nombreFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_nombreFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgasto_nombreFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtongasto_nombreFacturaProveedorBusqueda= new JButtonMe();
		this.jButtongasto_nombreFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_nombreFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_nombreFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongasto_nombreFacturaProveedorBusqueda.setText("U");
		this.jButtongasto_nombreFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongasto_nombreFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongasto_nombreFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgasto_nombreFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgasto_nombreFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gasto_nombreFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongasto_nombreFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelgasto_nombre2FacturaProveedor = new JLabelMe();
		this.jLabelgasto_nombre2FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_GASTONOMBRE2+" :");
		this.jLabelgasto_nombre2FacturaProveedor.setToolTipText("Gasto Nombre2");
		this.jLabelgasto_nombre2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_nombre2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgasto_nombre2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgasto_nombre2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgasto_nombre2FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgasto_nombre2FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_GASTONOMBRE2);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelgasto_nombre2FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldgasto_nombre2FacturaProveedor= new JTextFieldMe();

		jTextFieldgasto_nombre2FacturaProveedor.setEnabled(false);
		jTextFieldgasto_nombre2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_nombre2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgasto_nombre2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgasto_nombre2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtongasto_nombre2FacturaProveedorBusqueda= new JButtonMe();
		this.jButtongasto_nombre2FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_nombre2FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongasto_nombre2FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongasto_nombre2FacturaProveedorBusqueda.setText("U");
		this.jButtongasto_nombre2FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongasto_nombre2FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongasto_nombre2FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgasto_nombre2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgasto_nombre2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"gasto_nombre2FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongasto_nombre2FacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionFacturaProveedor = new JLabelMe();
		this.jLabeldescripcionFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionFacturaProveedor.setToolTipText("Descripcion");
		this.jLabeldescripcionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPaneldescripcionFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextAreadescripcionFacturaProveedor= new JTextAreaMe();
		jTextAreadescripcionFacturaProveedor.setEnabled(false);
		jTextAreadescripcionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFacturaProveedor.setLineWrap(true);
		jTextAreadescripcionFacturaProveedor.setWrapStyleWord(true);
		jTextAreadescripcionFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionFacturaProveedor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionFacturaProveedor = new JScrollPane(jTextAreadescripcionFacturaProveedor);
		jscrollPanedescripcionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionFacturaProveedorBusqueda= new JButtonMe();
		this.jButtondescripcionFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionFacturaProveedorBusqueda.setText("U");
		this.jButtondescripcionFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorFacturaProveedor = new JLabelMe();
		this.jLabelnumero_mayorFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_NUMEROMAYOR+" :");
		this.jLabelnumero_mayorFacturaProveedor.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelnumero_mayorFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldnumero_mayorFacturaProveedor= new JTextFieldMe();

		jTextFieldnumero_mayorFacturaProveedor.setEnabled(false);
		jTextFieldnumero_mayorFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mayorFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mayorFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_mayorFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_mayorFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonnumero_mayorFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorFacturaProveedorBusqueda.setText("U");
		this.jButtonnumero_mayorFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_mayorFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_mayorFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorFacturaProveedorBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_asientoFacturaProveedor = new JLabelMe();
		this.jLabelcodigo_asientoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_CODIGOASIENTO+" :");
		this.jLabelcodigo_asientoFacturaProveedor.setToolTipText("Codigo Asiento");
		this.jLabelcodigo_asientoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_asientoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_asientoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_asientoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_asientoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_asientoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_CODIGOASIENTO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelcodigo_asientoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jTextFieldcodigo_asientoFacturaProveedor= new JTextFieldMe();

		jTextFieldcodigo_asientoFacturaProveedor.setEnabled(false);
		jTextFieldcodigo_asientoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asientoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asientoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_asientoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_asientoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtoncodigo_asientoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asientoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asientoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_asientoFacturaProveedorBusqueda.setText("U");
		this.jButtoncodigo_asientoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_asientoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_asientoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_asientoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_asientoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_asientoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_asientoFacturaProveedorBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturaProveedor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFacturaProveedor = new JLabelMe();
		this.jLabelid_empresaFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturaProveedor.setToolTipText("Empresa");
		this.jLabelid_empresaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_empresaFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_empresaFacturaProveedor= new JComboBoxMe();
		jComboBoxid_empresaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturaProveedor.setEnabled(false);

		this.jButtonid_empresaFacturaProveedor= new JButtonMe();
		this.jButtonid_empresaFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaProveedor.setText("Buscar");
		this.jButtonid_empresaFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaProveedor"));

		this.jButtonid_empresaFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaProveedorBusqueda.setText("U");
		this.jButtonid_empresaFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_empresaFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaProveedorUpdate.setText("U");
		this.jButtonid_empresaFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaProveedorUpdate"));



					
		this.jLabelid_sucursalFacturaProveedor = new JLabelMe();
		this.jLabelid_sucursalFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFacturaProveedor.setToolTipText("Sucursal");
		this.jLabelid_sucursalFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_sucursalFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_sucursalFacturaProveedor= new JComboBoxMe();
		jComboBoxid_sucursalFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFacturaProveedor.setEnabled(false);

		this.jButtonid_sucursalFacturaProveedor= new JButtonMe();
		this.jButtonid_sucursalFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaProveedor.setText("Buscar");
		this.jButtonid_sucursalFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaProveedor"));

		this.jButtonid_sucursalFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_sucursalFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaProveedorBusqueda.setText("U");
		this.jButtonid_sucursalFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_sucursalFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaProveedorUpdate.setText("U");
		this.jButtonid_sucursalFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaProveedorUpdate"));



					
		this.jLabelid_ejercicioFacturaProveedor = new JLabelMe();
		this.jLabelid_ejercicioFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioFacturaProveedor.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_ejercicioFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_ejercicioFacturaProveedor= new JComboBoxMe();
		jComboBoxid_ejercicioFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioFacturaProveedor.setEnabled(false);

		this.jButtonid_ejercicioFacturaProveedor= new JButtonMe();
		this.jButtonid_ejercicioFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFacturaProveedor.setText("Buscar");
		this.jButtonid_ejercicioFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFacturaProveedor"));

		this.jButtonid_ejercicioFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_ejercicioFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFacturaProveedorBusqueda.setText("U");
		this.jButtonid_ejercicioFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_ejercicioFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFacturaProveedorUpdate.setText("U");
		this.jButtonid_ejercicioFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFacturaProveedorUpdate"));



					
		this.jLabelid_periodoFacturaProveedor = new JLabelMe();
		this.jLabelid_periodoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoFacturaProveedor.setToolTipText("Periodo");
		this.jLabelid_periodoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_periodoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_periodoFacturaProveedor= new JComboBoxMe();
		jComboBoxid_periodoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoFacturaProveedor.setEnabled(false);

		this.jButtonid_periodoFacturaProveedor= new JButtonMe();
		this.jButtonid_periodoFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFacturaProveedor.setText("Buscar");
		this.jButtonid_periodoFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFacturaProveedor"));

		this.jButtonid_periodoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_periodoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFacturaProveedorBusqueda.setText("U");
		this.jButtonid_periodoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_periodoFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_periodoFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFacturaProveedorUpdate.setText("U");
		this.jButtonid_periodoFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFacturaProveedorUpdate"));



					
		this.jLabelid_anioFacturaProveedor = new JLabelMe();
		this.jLabelid_anioFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDANIO+" :");
		this.jLabelid_anioFacturaProveedor.setToolTipText("Anio");
		this.jLabelid_anioFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_anioFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_anioFacturaProveedor= new JComboBoxMe();
		jComboBoxid_anioFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioFacturaProveedor.setEnabled(false);

		this.jButtonid_anioFacturaProveedor= new JButtonMe();
		this.jButtonid_anioFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFacturaProveedor.setText("Buscar");
		this.jButtonid_anioFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFacturaProveedor"));

		this.jButtonid_anioFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_anioFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFacturaProveedorBusqueda.setText("U");
		this.jButtonid_anioFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_anioFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_anioFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFacturaProveedorUpdate.setText("U");
		this.jButtonid_anioFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFacturaProveedorUpdate"));



					
		this.jLabelid_mesFacturaProveedor = new JLabelMe();
		this.jLabelid_mesFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesFacturaProveedor.setToolTipText("Mes");
		this.jLabelid_mesFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_mesFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_mesFacturaProveedor= new JComboBoxMe();
		jComboBoxid_mesFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesFacturaProveedor.setEnabled(false);

		this.jButtonid_mesFacturaProveedor= new JButtonMe();
		this.jButtonid_mesFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFacturaProveedor.setText("Buscar");
		this.jButtonid_mesFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFacturaProveedor"));

		this.jButtonid_mesFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_mesFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFacturaProveedorBusqueda.setText("U");
		this.jButtonid_mesFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_mesFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_mesFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFacturaProveedorUpdate.setText("U");
		this.jButtonid_mesFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFacturaProveedorUpdate"));



					
		this.jLabelid_moduloFacturaProveedor = new JLabelMe();
		this.jLabelid_moduloFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloFacturaProveedor.setToolTipText("Modulo");
		this.jLabelid_moduloFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_moduloFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_moduloFacturaProveedor= new JComboBoxMe();
		jComboBoxid_moduloFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloFacturaProveedor.setEnabled(false);

		this.jButtonid_moduloFacturaProveedor= new JButtonMe();
		this.jButtonid_moduloFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFacturaProveedor.setText("Buscar");
		this.jButtonid_moduloFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFacturaProveedor"));

		this.jButtonid_moduloFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_moduloFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloFacturaProveedorBusqueda.setText("U");
		this.jButtonid_moduloFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_moduloFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_moduloFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloFacturaProveedorUpdate.setText("U");
		this.jButtonid_moduloFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFacturaProveedorUpdate"));



					
		this.jLabelid_plantilla_facturaFacturaProveedor = new JLabelMe();
		this.jLabelid_plantilla_facturaFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDPLANTILLAFACTURA+" : *");
		this.jLabelid_plantilla_facturaFacturaProveedor.setToolTipText("Plantilla Factura");
		this.jLabelid_plantilla_facturaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_plantilla_facturaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_plantilla_facturaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_plantilla_facturaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_plantilla_facturaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_plantilla_facturaFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDPLANTILLAFACTURA);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_plantilla_facturaFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_plantilla_facturaFacturaProveedor= new JComboBoxMe();
		jComboBoxid_plantilla_facturaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_plantilla_facturaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_plantilla_facturaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_plantilla_facturaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_plantilla_facturaFacturaProveedor= new JButtonMe();
		this.jButtonid_plantilla_facturaFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_plantilla_facturaFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_plantilla_facturaFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_plantilla_facturaFacturaProveedor.setText("Buscar");
		this.jButtonid_plantilla_facturaFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_plantilla_facturaFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_plantilla_facturaFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_plantilla_facturaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_plantilla_facturaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_plantilla_facturaFacturaProveedor"));

		this.jButtonid_plantilla_facturaFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_plantilla_facturaFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_plantilla_facturaFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_plantilla_facturaFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_plantilla_facturaFacturaProveedorBusqueda.setText("U");
		this.jButtonid_plantilla_facturaFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_plantilla_facturaFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_plantilla_facturaFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_plantilla_facturaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_plantilla_facturaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_plantilla_facturaFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_plantilla_facturaFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_plantilla_facturaFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_plantilla_facturaFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_plantilla_facturaFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_plantilla_facturaFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_plantilla_facturaFacturaProveedorUpdate.setText("U");
		this.jButtonid_plantilla_facturaFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_plantilla_facturaFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_plantilla_facturaFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_plantilla_facturaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_plantilla_facturaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_plantilla_facturaFacturaProveedorUpdate"));



					
		this.jLabelid_tipo_documentoFacturaProveedor = new JLabelMe();
		this.jLabelid_tipo_documentoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoFacturaProveedor.setToolTipText("T. Documento");
		this.jLabelid_tipo_documentoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_tipo_documentoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_tipo_documentoFacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_documentoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoFacturaProveedor= new JButtonMe();
		this.jButtonid_tipo_documentoFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoFacturaProveedor.setText("Buscar");
		this.jButtonid_tipo_documentoFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoFacturaProveedor"));

		this.jButtonid_tipo_documentoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoFacturaProveedorBusqueda.setText("U");
		this.jButtonid_tipo_documentoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoFacturaProveedorUpdate.setText("U");
		this.jButtonid_tipo_documentoFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoFacturaProveedorUpdate"));



					
		this.jLabelid_facturaFacturaProveedor = new JLabelMe();
		this.jLabelid_facturaFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDFACTURA+" : *");
		this.jLabelid_facturaFacturaProveedor.setToolTipText("Factura");
		this.jLabelid_facturaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_facturaFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_facturaFacturaProveedor= new JComboBoxMe();
		jComboBoxid_facturaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaFacturaProveedor= new JButtonMe();
		this.jButtonid_facturaFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaFacturaProveedor.setText("Buscar");
		this.jButtonid_facturaFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaFacturaProveedor"));

		this.jButtonid_facturaFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_facturaFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaFacturaProveedorBusqueda.setText("U");
		this.jButtonid_facturaFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_facturaFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_facturaFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaFacturaProveedorUpdate.setText("U");
		this.jButtonid_facturaFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaFacturaProveedorUpdate"));



					
		this.jLabelid_transaccionFacturaProveedor = new JLabelMe();
		this.jLabelid_transaccionFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionFacturaProveedor.setToolTipText("T.Comprobante");
		this.jLabelid_transaccionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_transaccionFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_transaccionFacturaProveedor= new JComboBoxMe();
		jComboBoxid_transaccionFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionFacturaProveedor= new JButtonMe();
		this.jButtonid_transaccionFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFacturaProveedor.setText("Buscar");
		this.jButtonid_transaccionFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFacturaProveedor"));

		this.jButtonid_transaccionFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_transaccionFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionFacturaProveedorBusqueda.setText("U");
		this.jButtonid_transaccionFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_transaccionFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_transaccionFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionFacturaProveedorUpdate.setText("U");
		this.jButtonid_transaccionFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFacturaProveedorUpdate"));



					
		this.jLabelid_clienteFacturaProveedor = new JLabelMe();
		this.jLabelid_clienteFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteFacturaProveedor.setToolTipText("Proveedor");
		this.jLabelid_clienteFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_clienteFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_clienteFacturaProveedor= new JComboBoxMe();
		jComboBoxid_clienteFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteFacturaProveedor= new JButtonMe();
		this.jButtonid_clienteFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaProveedor.setText("Buscar");
		this.jButtonid_clienteFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaProveedor"));

		this.jButtonid_clienteFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_clienteFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturaProveedorBusqueda.setText("U");
		this.jButtonid_clienteFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_clienteFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_clienteFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturaProveedorUpdate.setText("U");
		this.jButtonid_clienteFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaProveedorUpdate"));



					
		this.jLabelid_empleado_solicitaFacturaProveedor = new JLabelMe();
		this.jLabelid_empleado_solicitaFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDEMPLEADOSOLICITA+" : *");
		this.jLabelid_empleado_solicitaFacturaProveedor.setToolTipText("Empl.Solicita");
		this.jLabelid_empleado_solicitaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleado_solicitaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleado_solicitaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_solicitaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_solicitaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_solicitaFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDEMPLEADOSOLICITA);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_empleado_solicitaFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_empleado_solicitaFacturaProveedor= new JComboBoxMe();
		jComboBoxid_empleado_solicitaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_solicitaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_solicitaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_solicitaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_solicitaFacturaProveedor= new JButtonMe();
		this.jButtonid_empleado_solicitaFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_solicitaFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_solicitaFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_solicitaFacturaProveedor.setText("Buscar");
		this.jButtonid_empleado_solicitaFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_solicitaFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_solicitaFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_solicitaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_solicitaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_solicitaFacturaProveedor"));

		this.jButtonid_empleado_solicitaFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_empleado_solicitaFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_solicitaFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_solicitaFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_solicitaFacturaProveedorBusqueda.setText("U");
		this.jButtonid_empleado_solicitaFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_solicitaFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_solicitaFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_solicitaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_solicitaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_solicitaFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_solicitaFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_empleado_solicitaFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_empleado_solicitaFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_solicitaFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_solicitaFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_solicitaFacturaProveedorUpdate.setText("U");
		this.jButtonid_empleado_solicitaFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_solicitaFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_solicitaFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_solicitaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_solicitaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_solicitaFacturaProveedorUpdate"));



					
		this.jLabelid_monedaFacturaProveedor = new JLabelMe();
		this.jLabelid_monedaFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaFacturaProveedor.setToolTipText("Moneda");
		this.jLabelid_monedaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_monedaFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_monedaFacturaProveedor= new JComboBoxMe();
		jComboBoxid_monedaFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaFacturaProveedor= new JButtonMe();
		this.jButtonid_monedaFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaFacturaProveedor.setText("Buscar");
		this.jButtonid_monedaFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaFacturaProveedor"));

		this.jButtonid_monedaFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_monedaFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaFacturaProveedorBusqueda.setText("U");
		this.jButtonid_monedaFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_monedaFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_monedaFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaFacturaProveedorUpdate.setText("U");
		this.jButtonid_monedaFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaFacturaProveedorUpdate"));



					
		this.jLabelid_empleadoFacturaProveedor = new JLabelMe();
		this.jLabelid_empleadoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoFacturaProveedor.setToolTipText("Empl.Autoriza");
		this.jLabelid_empleadoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_empleadoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_empleadoFacturaProveedor= new JComboBoxMe();
		jComboBoxid_empleadoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoFacturaProveedor= new JButtonMe();
		this.jButtonid_empleadoFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFacturaProveedor.setText("Buscar");
		this.jButtonid_empleadoFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFacturaProveedor"));

		this.jButtonid_empleadoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_empleadoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoFacturaProveedorBusqueda.setText("U");
		this.jButtonid_empleadoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_empleadoFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_empleadoFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoFacturaProveedorUpdate.setText("U");
		this.jButtonid_empleadoFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFacturaProveedorUpdate"));



					
		this.jLabelid_tipo_retencion_fuente1FacturaProveedor = new JLabelMe();
		this.jLabelid_tipo_retencion_fuente1FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONFUENTE1+" : *");
		this.jLabelid_tipo_retencion_fuente1FacturaProveedor.setToolTipText("Ret. Fuente 1");
		this.jLabelid_tipo_retencion_fuente1FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_fuente1FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_fuente1FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente1FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_fuente1FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_fuente1FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONFUENTE1);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_tipo_retencion_fuente1FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_tipo_retencion_fuente1FacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente1FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente1FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente1FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente1FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_fuente1FacturaProveedor= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente1FacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedor.setText("Buscar");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente1FacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_fuente1FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente1FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente1FacturaProveedor"));

		this.jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda.setText("U");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_fuente1FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente1FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente1FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_fuente1FacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente1FacturaProveedorUpdate.setText("U");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente1FacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_fuente1FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente1FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente1FacturaProveedorUpdate"));



					
		this.jLabelid_tipo_retencion_fuente2FacturaProveedor = new JLabelMe();
		this.jLabelid_tipo_retencion_fuente2FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONFUENTE2+" : *");
		this.jLabelid_tipo_retencion_fuente2FacturaProveedor.setToolTipText("Ret Fuente 2");
		this.jLabelid_tipo_retencion_fuente2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_fuente2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_fuente2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_fuente2FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_fuente2FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONFUENTE2);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_tipo_retencion_fuente2FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_tipo_retencion_fuente2FacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_fuente2FacturaProveedor= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente2FacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente2FacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente2FacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente2FacturaProveedor.setText("Buscar");
		this.jButtonid_tipo_retencion_fuente2FacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_fuente2FacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente2FacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_fuente2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente2FacturaProveedor"));

		this.jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda.setText("U");
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_fuente2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente2FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_fuente2FacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente2FacturaProveedorUpdate.setText("U");
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_fuente2FacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente2FacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_fuente2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente2FacturaProveedorUpdate"));



					
		this.jLabelid_tipo_retencion_iva1FacturaProveedor = new JLabelMe();
		this.jLabelid_tipo_retencion_iva1FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONIVA1+" : *");
		this.jLabelid_tipo_retencion_iva1FacturaProveedor.setToolTipText("Ret Iva B.");
		this.jLabelid_tipo_retencion_iva1FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_iva1FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_iva1FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva1FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva1FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva1FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONIVA1);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva1FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_tipo_retencion_iva1FacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva1FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva1FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva1FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva1FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_iva1FacturaProveedor= new JButtonMe();
		this.jButtonid_tipo_retencion_iva1FacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva1FacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva1FacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva1FacturaProveedor.setText("Buscar");
		this.jButtonid_tipo_retencion_iva1FacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva1FacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva1FacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva1FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva1FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva1FacturaProveedor"));

		this.jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda.setText("U");
		this.jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva1FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva1FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva1FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva1FacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_iva1FacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva1FacturaProveedorUpdate.setText("U");
		this.jButtonid_tipo_retencion_iva1FacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva1FacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva1FacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva1FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva1FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva1FacturaProveedorUpdate"));



					
		this.jLabelid_tipo_retencion_iva2FacturaProveedor = new JLabelMe();
		this.jLabelid_tipo_retencion_iva2FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONIVA2+" : *");
		this.jLabelid_tipo_retencion_iva2FacturaProveedor.setToolTipText("Ret Iva S.");
		this.jLabelid_tipo_retencion_iva2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_iva2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_retencion_iva2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva2FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva2FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDTIPORETENCIONIVA2);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva2FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_tipo_retencion_iva2FacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_retencion_iva2FacturaProveedor= new JButtonMe();
		this.jButtonid_tipo_retencion_iva2FacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva2FacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva2FacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva2FacturaProveedor.setText("Buscar");
		this.jButtonid_tipo_retencion_iva2FacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva2FacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva2FacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva2FacturaProveedor"));

		this.jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda.setText("U");
		this.jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva2FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva2FacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_iva2FacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva2FacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva2FacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva2FacturaProveedorUpdate.setText("U");
		this.jButtonid_tipo_retencion_iva2FacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva2FacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva2FacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva2FacturaProveedorUpdate"));



					
		this.jLabelid_tipo_tributarioFacturaProveedor = new JLabelMe();
		this.jLabelid_tipo_tributarioFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDTIPOTRIBUTARIO+" : *");
		this.jLabelid_tipo_tributarioFacturaProveedor.setToolTipText("Sustento Trib.");
		this.jLabelid_tipo_tributarioFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_tributarioFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_tributarioFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tributarioFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_tributarioFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_tributarioFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDTIPOTRIBUTARIO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_tipo_tributarioFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_tipo_tributarioFacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_tributarioFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tributarioFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_tributarioFacturaProveedor= new JButtonMe();
		this.jButtonid_tipo_tributarioFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioFacturaProveedor.setText("Buscar");
		this.jButtonid_tipo_tributarioFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_tributarioFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_tributarioFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioFacturaProveedor"));

		this.jButtonid_tipo_tributarioFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_tipo_tributarioFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tributarioFacturaProveedorBusqueda.setText("U");
		this.jButtonid_tipo_tributarioFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_tributarioFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_tributarioFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_tributarioFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_tributarioFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_tipo_tributarioFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tributarioFacturaProveedorUpdate.setText("U");
		this.jButtonid_tipo_tributarioFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_tributarioFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_tributarioFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioFacturaProveedorUpdate"));



					
		this.jLabelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor = new JLabelMe();
		this.jLabelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCALBIENES+" : *");
		this.jLabelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setToolTipText("Credito Fiscal Bienes");
		this.jLabelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCALBIENES);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedor= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setText("Buscar");
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_bienesFacturaProveedor"));

		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda.setText("U");
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate.setText("U");
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate"));


		jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorArbol= new JButtonMe();
		jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorArbol.setText("Arbol");
		jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_bienesFacturaProveedorArbol"));



					
		this.jLabelid_responsable_fondoFacturaProveedor = new JLabelMe();
		this.jLabelid_responsable_fondoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDRESPONSABLEFONDO+" : *");
		this.jLabelid_responsable_fondoFacturaProveedor.setToolTipText("Responsable");
		this.jLabelid_responsable_fondoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsable_fondoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_responsable_fondoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_responsable_fondoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_responsable_fondoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_responsable_fondoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDRESPONSABLEFONDO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_responsable_fondoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_responsable_fondoFacturaProveedor= new JComboBoxMe();
		jComboBoxid_responsable_fondoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsable_fondoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_responsable_fondoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_responsable_fondoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_responsable_fondoFacturaProveedor= new JButtonMe();
		this.jButtonid_responsable_fondoFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsable_fondoFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsable_fondoFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_responsable_fondoFacturaProveedor.setText("Buscar");
		this.jButtonid_responsable_fondoFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_responsable_fondoFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsable_fondoFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_responsable_fondoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsable_fondoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsable_fondoFacturaProveedor"));

		this.jButtonid_responsable_fondoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_responsable_fondoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsable_fondoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsable_fondoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsable_fondoFacturaProveedorBusqueda.setText("U");
		this.jButtonid_responsable_fondoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_responsable_fondoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsable_fondoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_responsable_fondoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsable_fondoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsable_fondoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_responsable_fondoFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_responsable_fondoFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_responsable_fondoFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsable_fondoFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_responsable_fondoFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_responsable_fondoFacturaProveedorUpdate.setText("U");
		this.jButtonid_responsable_fondoFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_responsable_fondoFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_responsable_fondoFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_responsable_fondoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_responsable_fondoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_responsable_fondoFacturaProveedorUpdate"));



					
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor = new JLabelMe();
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCALSERVICIOS+" : *");
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setToolTipText("Credito Fiscal Servicios");
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCALSERVICIOS);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setText("Buscar");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_serviciosFacturaProveedor"));

		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda.setText("U");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate.setText("U");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate"));


		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorArbol= new JButtonMe();
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorArbol.setText("Arbol");
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_serviciosFacturaProveedorArbol"));



					
		this.jLabelid_cuenta_contable_gastoFacturaProveedor = new JLabelMe();
		this.jLabelid_cuenta_contable_gastoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO+" : *");
		this.jLabelid_cuenta_contable_gastoFacturaProveedor.setToolTipText("C. Gasto");
		this.jLabelid_cuenta_contable_gastoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_gastoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_gastoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_gastoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_gastoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_gastoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_cuenta_contable_gastoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_cuenta_contable_gastoFacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_gastoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_gastoFacturaProveedor= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gastoFacturaProveedor.setText("Buscar");
		this.jButtonid_cuenta_contable_gastoFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_gastoFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoFacturaProveedor"));

		this.jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda.setText("U");
		this.jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_gastoFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_gastoFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gastoFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_gastoFacturaProveedorUpdate.setText("U");
		this.jButtonid_cuenta_contable_gastoFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_gastoFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoFacturaProveedorUpdate"));


		jButtonid_cuenta_contable_gastoFacturaProveedorArbol= new JButtonMe();
		jButtonid_cuenta_contable_gastoFacturaProveedorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoFacturaProveedorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoFacturaProveedorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gastoFacturaProveedorArbol.setText("Arbol");
		jButtonid_cuenta_contable_gastoFacturaProveedorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_gastoFacturaProveedorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gastoFacturaProveedorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gastoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gastoFacturaProveedorArbol"));



					
		this.jLabelid_cuenta_contable_gasto2FacturaProveedor = new JLabelMe();
		this.jLabelid_cuenta_contable_gasto2FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO2+" : *");
		this.jLabelid_cuenta_contable_gasto2FacturaProveedor.setToolTipText("C. Gasto 2");
		this.jLabelid_cuenta_contable_gasto2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_gasto2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_cuenta_contable_gasto2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,100),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_gasto2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_gasto2FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_gasto2FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLEGASTO2);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_cuenta_contable_gasto2FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_cuenta_contable_gasto2FacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_gasto2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_cuenta_contable_gasto2FacturaProveedor= new JButtonMe();
		this.jButtonid_cuenta_contable_gasto2FacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gasto2FacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gasto2FacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_gasto2FacturaProveedor.setText("Buscar");
		this.jButtonid_cuenta_contable_gasto2FacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_gasto2FacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gasto2FacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gasto2FacturaProveedor"));

		this.jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda.setText("U");
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gasto2FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_gasto2FacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_gasto2FacturaProveedorUpdate.setText("U");
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_gasto2FacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gasto2FacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gasto2FacturaProveedorUpdate"));


		jButtonid_cuenta_contable_gasto2FacturaProveedorArbol= new JButtonMe();
		jButtonid_cuenta_contable_gasto2FacturaProveedorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gasto2FacturaProveedorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gasto2FacturaProveedorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_gasto2FacturaProveedorArbol.setText("Arbol");
		jButtonid_cuenta_contable_gasto2FacturaProveedorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_gasto2FacturaProveedorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_gasto2FacturaProveedorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_gasto2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_gasto2FacturaProveedorArbol"));



					
		this.jLabelid_cuenta_contable_credito_finFacturaProveedor = new JLabelMe();
		this.jLabelid_cuenta_contable_credito_finFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFIN+" : *");
		this.jLabelid_cuenta_contable_credito_finFacturaProveedor.setToolTipText("Cuenta Contable Credito Fin");
		this.jLabelid_cuenta_contable_credito_finFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_finFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_finFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_finFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_credito_finFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_credito_finFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFIN);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_cuenta_contable_credito_finFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_cuenta_contable_credito_finFacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_finFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.setEnabled(false);

		this.jButtonid_cuenta_contable_credito_finFacturaProveedor= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_finFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_finFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_finFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_finFacturaProveedor.setText("Buscar");
		this.jButtonid_cuenta_contable_credito_finFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_credito_finFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_finFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_finFacturaProveedor"));

		this.jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda.setText("U");
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_finFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_credito_finFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_finFacturaProveedorUpdate.setText("U");
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_credito_finFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_finFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_finFacturaProveedorUpdate"));


		jButtonid_cuenta_contable_credito_finFacturaProveedorArbol= new JButtonMe();
		jButtonid_cuenta_contable_credito_finFacturaProveedorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_finFacturaProveedorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_finFacturaProveedorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_finFacturaProveedorArbol.setText("Arbol");
		jButtonid_cuenta_contable_credito_finFacturaProveedorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_credito_finFacturaProveedorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_finFacturaProveedorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_finFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_finFacturaProveedorArbol"));



					
		this.jLabelid_cuenta_contable_credito_fin2FacturaProveedor = new JLabelMe();
		this.jLabelid_cuenta_contable_credito_fin2FacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFIN2+" : *");
		this.jLabelid_cuenta_contable_credito_fin2FacturaProveedor.setToolTipText("Cuenta Contable Credito Fin 2");
		this.jLabelid_cuenta_contable_credito_fin2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_fin2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_fin2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_fin2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_credito_fin2FacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_credito_fin2FacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFIN2);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_cuenta_contable_credito_fin2FacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.setEnabled(false);

		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedor= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedor.setText("Buscar");
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fin2FacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fin2FacturaProveedor"));

		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda.setText("U");
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fin2FacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorUpdate.setText("U");
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fin2FacturaProveedorUpdate"));


		jButtonid_cuenta_contable_credito_fin2FacturaProveedorArbol= new JButtonMe();
		jButtonid_cuenta_contable_credito_fin2FacturaProveedorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fin2FacturaProveedorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fin2FacturaProveedorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fin2FacturaProveedorArbol.setText("Arbol");
		jButtonid_cuenta_contable_credito_fin2FacturaProveedorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_credito_fin2FacturaProveedorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fin2FacturaProveedorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fin2FacturaProveedorArbol"));



					
		this.jLabelid_cuenta_contable_creditoFacturaProveedor = new JLabelMe();
		this.jLabelid_cuenta_contable_creditoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO+" : *");
		this.jLabelid_cuenta_contable_creditoFacturaProveedor.setToolTipText("Cuenta Contable Credito");
		this.jLabelid_cuenta_contable_creditoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_creditoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_creditoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_creditoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_creditoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDCUENTACONTABLECREDITO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_cuenta_contable_creditoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_cuenta_contable_creditoFacturaProveedor= new JComboBoxMe();
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_creditoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.setEnabled(false);

		this.jButtonid_cuenta_contable_creditoFacturaProveedor= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_creditoFacturaProveedor.setText("Buscar");
		this.jButtonid_cuenta_contable_creditoFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_creditoFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoFacturaProveedor"));

		this.jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda.setText("U");
		this.jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_creditoFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_creditoFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_creditoFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_creditoFacturaProveedorUpdate.setText("U");
		this.jButtonid_cuenta_contable_creditoFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_creditoFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoFacturaProveedorUpdate"));


		jButtonid_cuenta_contable_creditoFacturaProveedorArbol= new JButtonMe();
		jButtonid_cuenta_contable_creditoFacturaProveedorArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoFacturaProveedorArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoFacturaProveedorArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_creditoFacturaProveedorArbol.setText("Arbol");
		jButtonid_cuenta_contable_creditoFacturaProveedorArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_creditoFacturaProveedorArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_creditoFacturaProveedorArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_creditoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_creditoFacturaProveedorArbol"));



					
		this.jLabelid_tipo_movimientoFacturaProveedor = new JLabelMe();
		this.jLabelid_tipo_movimientoFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoFacturaProveedor.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_tipo_movimientoFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_tipo_movimientoFacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimientoFacturaProveedor.setEnabled(false);

		this.jButtonid_tipo_movimientoFacturaProveedor= new JButtonMe();
		this.jButtonid_tipo_movimientoFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoFacturaProveedor.setText("Buscar");
		this.jButtonid_tipo_movimientoFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoFacturaProveedor"));

		this.jButtonid_tipo_movimientoFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoFacturaProveedorBusqueda.setText("U");
		this.jButtonid_tipo_movimientoFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoFacturaProveedorUpdate.setText("U");
		this.jButtonid_tipo_movimientoFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoFacturaProveedorUpdate"));



					
		this.jLabelid_tipo_movimiento_moduloFacturaProveedor = new JLabelMe();
		this.jLabelid_tipo_movimiento_moduloFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO+" : *");
		this.jLabelid_tipo_movimiento_moduloFacturaProveedor.setToolTipText("Tipo Movimiento Modulo");
		this.jLabelid_tipo_movimiento_moduloFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,10),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimiento_moduloFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimiento_moduloFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_tipo_movimiento_moduloFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_tipo_movimiento_moduloFacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimiento_moduloFacturaProveedor.setEnabled(false);

		this.jButtonid_tipo_movimiento_moduloFacturaProveedor= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedor.setText("Buscar");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimiento_moduloFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloFacturaProveedor"));

		this.jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda.setText("U");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimiento_moduloFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimiento_moduloFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloFacturaProveedorUpdate.setText("U");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimiento_moduloFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloFacturaProveedorUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloFacturaProveedor = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloFacturaProveedor.setText(""+FacturaProveedorConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloFacturaProveedor.setToolTipText("Tipo Comprobante");
		this.jLabelid_tipo_transaccion_moduloFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_transaccion_moduloFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_transaccion_moduloFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloFacturaProveedor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloFacturaProveedor.setToolTipText(FacturaProveedorConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutFacturaProveedor = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloFacturaProveedor.setLayout(this.gridaBagLayoutFacturaProveedor);


		jComboBoxid_tipo_transaccion_moduloFacturaProveedor= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloFacturaProveedor.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloFacturaProveedor= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFacturaProveedor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedor.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFacturaProveedor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFacturaProveedor"));

		this.jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFacturaProveedorBusqueda"));

		if(this.facturaproveedorSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloFacturaProveedorUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloFacturaProveedorUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFacturaProveedorUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloFacturaProveedor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFacturaProveedor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFacturaProveedorUpdate"));



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
		//this.jInternalFrameDetalleFacturaProveedor = new FacturaProveedorBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Factura Proveedor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaProveedor= new GridBagLayout();
		

		
		String sToolTipFacturaProveedor="";
		sToolTipFacturaProveedor=FacturaProveedorConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaProveedor+="(Contabilidad.FacturaProveedor)";
		}
		
		if(!this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaProveedor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturaProveedor = new JButtonMe();
		this.jButtonModificarFacturaProveedor = new JButtonMe();
        this.jButtonActualizarFacturaProveedor = new JButtonMe();
        this.jButtonEliminarFacturaProveedor = new JButtonMe();
        this.jButtonCancelarFacturaProveedor = new JButtonMe();
        this.jButtonGuardarCambiosFacturaProveedor = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturaProveedor = new JButtonMe();
		this.jButtonCerrarFacturaProveedor = new JButtonMe();
		
		this.jScrollPanelDatosFacturaProveedor = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturaProveedor = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturaProveedor = new JScrollPane();
				
		
		
		this.jPanelCamposFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatos_facturaFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatos_retencion_0FacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatos_retencionFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioanexos_ivaFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciocuentas_contablesFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Factura Proveedor";
		
		if(!this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposFacturaProveedor.setName("jPanelCamposFacturaProveedor"); 

		this.jPanelCamposOcultosFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturaProveedor.setName("jPanelCamposOcultosFacturaProveedor"); 

        this.jPanelAccionesFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaProveedor.setToolTipText("Acciones");
        this.jPanelAccionesFacturaProveedor.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturaProveedor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturaProveedor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralFacturaProveedor.setName("jPanelCamposFingeneralFacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatos_facturaFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura"));
		this.jPanelCamposIniciodatos_facturaFacturaProveedor.setName("jPanelCamposFindatos_facturaFacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatos_facturaFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatos_retencion_0FacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion 0"));
		this.jPanelCamposIniciodatos_retencion_0FacturaProveedor.setName("jPanelCamposFindatos_retencion_0FacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatos_retencion_0FacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatos_retencionFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion"));
		this.jPanelCamposIniciodatos_retencionFacturaProveedor.setName("jPanelCamposFindatos_retencionFacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatos_retencionFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioanexos_ivaFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Anexos Iva"));
		this.jPanelCamposInicioanexos_ivaFacturaProveedor.setName("jPanelCamposFinanexos_ivaFacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioanexos_ivaFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciocuentas_contablesFacturaProveedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuentas Contables"));
		this.jPanelCamposIniciocuentas_contablesFacturaProveedor.setName("jPanelCamposFincuentas_contablesFacturaProveedor");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciocuentas_contablesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturaProveedor.setText("Nuevo");
		this.jButtonModificarFacturaProveedor.setText("Editar");
        this.jButtonActualizarFacturaProveedor.setText("Actualizar");
        this.jButtonEliminarFacturaProveedor.setText("Eliminar");
        this.jButtonCancelarFacturaProveedor.setText("Cancelar");
        this.jButtonGuardarCambiosFacturaProveedor.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturaProveedor.setText("Guardar");
		this.jButtonCerrarFacturaProveedor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaProveedor,"nuevo_button","Nuevo",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturaProveedor,"modificar_button","Editar",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturaProveedor,"actualizar_button","Actualizar",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturaProveedor,"eliminar_button","Eliminar",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturaProveedor,"cancelar_button","Cancelar",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturaProveedor,"guardarcambios_button","Guardar",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaProveedor,"guardarcambiostabla_button","Guardar",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaProveedor,"cerrar_button","Salir",this.facturaproveedorSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturaProveedor.setToolTipText("Nuevo"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturaProveedor.setToolTipText("Editar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturaProveedor.setToolTipText("Actualizar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturaProveedor.setToolTipText("Eliminar)"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturaProveedor.setToolTipText("Cancelar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturaProveedor.setToolTipText("Guardar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturaProveedor.setToolTipText("Guardar"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaProveedor.setToolTipText("Salir"+" "+FacturaProveedorConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaProveedor";
		inputMap = this.jButtonNuevoFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaProveedor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaProveedor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturaProveedor";
		inputMap = this.jButtonActualizarFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturaProveedor"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturaProveedor";
		inputMap = this.jButtonEliminarFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturaProveedor"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturaProveedor";
		inputMap = this.jButtonCancelarFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturaProveedor"));
		
		//CERRAR		
		sMapKey = "CerrarFacturaProveedor";
		inputMap = this.jButtonCerrarFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaProveedor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaProveedor";
		inputMap = this.jButtonGuardarCambiosTablaFacturaProveedor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaProveedor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaProveedor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturaProveedor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturaProveedor.setToolTipText("Nuevo FacturaProveedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturaProveedor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturaProveedor.setToolTipText("Sin Cerrar Ventana FacturaProveedor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturaProveedor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturaProveedor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturaProveedor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaProveedor.setText("Accion");
		this.jComboBoxTiposAccionesFacturaProveedor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturaProveedor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturaProveedor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturaProveedor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturaProveedor = new JLabelMe();
		
		this.jLabelAccionesFacturaProveedor.setText("Acciones");		
		this.jLabelAccionesFacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturaProveedor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturaProveedor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturaProveedor=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturaProveedor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturaProveedor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturaProveedor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaProveedor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaProveedor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaProveedor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturaProveedor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaProveedor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaProveedor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturaProveedor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturaProveedor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturaProveedor = new GridBagLayout();
		
		this.jPanelCamposFacturaProveedor.setLayout(gridaBagLayoutCamposFacturaProveedor);
		this.jPanelCamposOcultosFacturaProveedor.setLayout(gridaBagLayoutCamposOcultosFacturaProveedor);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralFacturaProveedor= new GridBagLayout();
		this.jPanelCamposIniciogeneralFacturaProveedor.setLayout(gridaBagLayoutCamposIniciogeneralFacturaProveedor);

		GridBagLayout gridaBagLayoutCamposIniciodatos_facturaFacturaProveedor= new GridBagLayout();
		this.jPanelCamposIniciodatos_facturaFacturaProveedor.setLayout(gridaBagLayoutCamposIniciodatos_facturaFacturaProveedor);

		GridBagLayout gridaBagLayoutCamposIniciodatos_retencion_0FacturaProveedor= new GridBagLayout();
		this.jPanelCamposIniciodatos_retencion_0FacturaProveedor.setLayout(gridaBagLayoutCamposIniciodatos_retencion_0FacturaProveedor);

		GridBagLayout gridaBagLayoutCamposIniciodatos_retencionFacturaProveedor= new GridBagLayout();
		this.jPanelCamposIniciodatos_retencionFacturaProveedor.setLayout(gridaBagLayoutCamposIniciodatos_retencionFacturaProveedor);

		GridBagLayout gridaBagLayoutCamposInicioanexos_ivaFacturaProveedor= new GridBagLayout();
		this.jPanelCamposInicioanexos_ivaFacturaProveedor.setLayout(gridaBagLayoutCamposInicioanexos_ivaFacturaProveedor);

		GridBagLayout gridaBagLayoutCamposIniciocuentas_contablesFacturaProveedor= new GridBagLayout();
		this.jPanelCamposIniciocuentas_contablesFacturaProveedor.setLayout(gridaBagLayoutCamposIniciocuentas_contablesFacturaProveedor);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidFacturaProveedor.add(jLabelIdFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidFacturaProveedor.add(jLabelidFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaFacturaProveedor.add(jLabelid_empresaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaProveedor.add(jButtonid_empresaFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaProveedor.add(jButtonid_empresaFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaFacturaProveedor.add(jComboBoxid_empresaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalFacturaProveedor.add(jLabelid_sucursalFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturaProveedor.add(jButtonid_sucursalFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturaProveedor.add(jButtonid_sucursalFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalFacturaProveedor.add(jComboBoxid_sucursalFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioFacturaProveedor.add(jLabelid_ejercicioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFacturaProveedor.add(jButtonid_ejercicioFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFacturaProveedor.add(jButtonid_ejercicioFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioFacturaProveedor.add(jComboBoxid_ejercicioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoFacturaProveedor.add(jLabelid_periodoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFacturaProveedor.add(jButtonid_periodoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFacturaProveedor.add(jButtonid_periodoFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoFacturaProveedor.add(jComboBoxid_periodoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioFacturaProveedor.add(jLabelid_anioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFacturaProveedor.add(jButtonid_anioFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFacturaProveedor.add(jButtonid_anioFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioFacturaProveedor.add(jComboBoxid_anioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesFacturaProveedor.add(jLabelid_mesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFacturaProveedor.add(jButtonid_mesFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFacturaProveedor.add(jButtonid_mesFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesFacturaProveedor.add(jComboBoxid_mesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloFacturaProveedor.add(jLabelid_moduloFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloFacturaProveedor.add(jButtonid_moduloFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloFacturaProveedor.add(jButtonid_moduloFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloFacturaProveedor.add(jComboBoxid_moduloFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_plantilla_facturaFacturaProveedor.add(jLabelid_plantilla_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 2;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_plantilla_facturaFacturaProveedor.add(jButtonid_plantilla_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_plantilla_facturaFacturaProveedor.add(jButtonid_plantilla_facturaFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 4;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_plantilla_facturaFacturaProveedor.add(jButtonid_plantilla_facturaFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_plantilla_facturaFacturaProveedor.add(jComboBoxid_plantilla_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_documentoFacturaProveedor.add(jLabelid_tipo_documentoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoFacturaProveedor.add(jButtonid_tipo_documentoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoFacturaProveedor.add(jButtonid_tipo_documentoFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_documentoFacturaProveedor.add(jComboBoxid_tipo_documentoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelplazoFacturaProveedor.add(jLabelplazoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelplazoFacturaProveedor.add(jButtonplazoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelplazoFacturaProveedor.add(jTextFieldplazoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_facturaFacturaProveedor.add(jLabelid_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 2;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaFacturaProveedor.add(jButtonid_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaFacturaProveedor.add(jButtonid_facturaFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 4;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaFacturaProveedor.add(jButtonid_facturaFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_facturaFacturaProveedor.add(jComboBoxid_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_facturaFacturaProveedor.add(jLabelnumero_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaFacturaProveedor.add(jButtonnumero_facturaFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_facturaFacturaProveedor.add(jTextFieldnumero_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transaccionFacturaProveedor.add(jLabelid_transaccionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionFacturaProveedor.add(jButtonid_transaccionFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionFacturaProveedor.add(jButtonid_transaccionFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transaccionFacturaProveedor.add(jComboBoxid_transaccionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionFacturaProveedor.add(jLabelfecha_emisionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionFacturaProveedor.add(jButtonfecha_emisionFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionFacturaProveedor.add(jDateChooserfecha_emisionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteFacturaProveedor.add(jLabelid_clienteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 2;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteFacturaProveedor.add(jButtonid_clienteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturaProveedor.add(jButtonid_clienteFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 4;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturaProveedor.add(jButtonid_clienteFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteFacturaProveedor.add(jComboBoxid_clienteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelrucFacturaProveedor.add(jLabelrucFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucFacturaProveedor.add(jButtonrucFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelrucFacturaProveedor.add(jTextFieldrucFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleado_solicitaFacturaProveedor.add(jLabelid_empleado_solicitaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 2;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleado_solicitaFacturaProveedor.add(jButtonid_empleado_solicitaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_solicitaFacturaProveedor.add(jButtonid_empleado_solicitaFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 4;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_solicitaFacturaProveedor.add(jButtonid_empleado_solicitaFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleado_solicitaFacturaProveedor.add(jComboBoxid_empleado_solicitaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_venceFacturaProveedor.add(jLabelfecha_venceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceFacturaProveedor.add(jButtonfecha_venceFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_venceFacturaProveedor.add(jDateChooserfecha_venceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaFacturaProveedor.add(jLabelid_monedaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaFacturaProveedor.add(jButtonid_monedaFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaFacturaProveedor.add(jButtonid_monedaFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaFacturaProveedor.add(jComboBoxid_monedaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleadoFacturaProveedor.add(jLabelid_empleadoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 2;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoFacturaProveedor.add(jButtonid_empleadoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoFacturaProveedor.add(jButtonid_empleadoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 4;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoFacturaProveedor.add(jButtonid_empleadoFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleadoFacturaProveedor.add(jComboBoxid_empleadoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_activosFacturaProveedor.add(jLabelcon_activosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_activosFacturaProveedor.add(jButtoncon_activosFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_activosFacturaProveedor.add(jCheckBoxcon_activosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_riseFacturaProveedor.add(jLabelcon_riseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_riseFacturaProveedor.add(jButtoncon_riseFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_riseFacturaProveedor.add(jCheckBoxcon_riseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_sitiosFacturaProveedor.add(jLabelcon_sitiosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_sitiosFacturaProveedor.add(jButtoncon_sitiosFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_sitiosFacturaProveedor.add(jCheckBoxcon_sitiosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldetalleFacturaProveedor.add(jLabeldetalleFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleFacturaProveedor.add(jButtondetalleFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldetalleFacturaProveedor.add(jscrollPanedetalleFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_bienes12FacturaProveedor.add(jLabelvalor_bienes12FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_bienes12FacturaProveedor.add(jButtonvalor_bienes12FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_bienes12FacturaProveedor.add(jTextFieldvalor_bienes12FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_servicios12FacturaProveedor.add(jLabelvalor_servicios12FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_servicios12FacturaProveedor.add(jButtonvalor_servicios12FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_servicios12FacturaProveedor.add(jTextFieldvalor_servicios12FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_valor12FacturaProveedor.add(jLabeltotal_valor12FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_valor12FacturaProveedor.add(jButtontotal_valor12FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_valor12FacturaProveedor.add(jTextFieldtotal_valor12FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_bienes0FacturaProveedor.add(jLabelvalor_bienes0FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_bienes0FacturaProveedor.add(jButtonvalor_bienes0FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_bienes0FacturaProveedor.add(jTextFieldvalor_bienes0FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_servicios0FacturaProveedor.add(jLabelvalor_servicios0FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_servicios0FacturaProveedor.add(jButtonvalor_servicios0FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_servicios0FacturaProveedor.add(jTextFieldvalor_servicios0FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_valor0FacturaProveedor.add(jLabeltotal_valor0FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_valor0FacturaProveedor.add(jButtontotal_valor0FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_valor0FacturaProveedor.add(jTextFieldtotal_valor0FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbienes_iceFacturaProveedor.add(jLabelbienes_iceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelbienes_iceFacturaProveedor.add(jButtonbienes_iceFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbienes_iceFacturaProveedor.add(jTextFieldbienes_iceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelservicios_iceFacturaProveedor.add(jLabelservicios_iceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelservicios_iceFacturaProveedor.add(jButtonservicios_iceFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelservicios_iceFacturaProveedor.add(jTextFieldservicios_iceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_iceFacturaProveedor.add(jLabeltotal_iceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_iceFacturaProveedor.add(jButtontotal_iceFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_iceFacturaProveedor.add(jTextFieldtotal_iceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelbienes_ivaFacturaProveedor.add(jLabelbienes_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelbienes_ivaFacturaProveedor.add(jButtonbienes_ivaFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelbienes_ivaFacturaProveedor.add(jTextFieldbienes_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelservicios_ivaFacturaProveedor.add(jLabelservicios_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelservicios_ivaFacturaProveedor.add(jButtonservicios_ivaFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelservicios_ivaFacturaProveedor.add(jTextFieldservicios_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_ivaFacturaProveedor.add(jLabeltotal_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaFacturaProveedor.add(jButtontotal_ivaFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_ivaFacturaProveedor.add(jTextFieldtotal_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliva_porcentajeFacturaProveedor.add(jLabeliva_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_porcentajeFacturaProveedor.add(jButtoniva_porcentajeFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliva_porcentajeFacturaProveedor.add(jTextFieldiva_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalFacturaProveedor.add(jLabeltotalFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalFacturaProveedor.add(jButtontotalFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalFacturaProveedor.add(jTextFieldtotalFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_monto_objeto_ivaFacturaProveedor.add(jLabelcon_monto_objeto_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_monto_objeto_ivaFacturaProveedor.add(jButtoncon_monto_objeto_ivaFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_monto_objeto_ivaFacturaProveedor.add(jCheckBoxcon_monto_objeto_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_retencionFacturaProveedor.add(jLabelnumero_retencionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionFacturaProveedor.add(jButtonnumero_retencionFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_retencionFacturaProveedor.add(jTextFieldnumero_retencionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_serieFacturaProveedor.add(jLabelnumero_serieFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieFacturaProveedor.add(jButtonnumero_serieFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_serieFacturaProveedor.add(jTextFieldnumero_serieFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_autorizacionFacturaProveedor.add(jLabelnumero_autorizacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionFacturaProveedor.add(jButtonnumero_autorizacionFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_autorizacionFacturaProveedor.add(jTextFieldnumero_autorizacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_validezFacturaProveedor.add(jLabelfecha_validezFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_validezFacturaProveedor.add(jButtonfecha_validezFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_validezFacturaProveedor.add(jDateChooserfecha_validezFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencion_fuente1FacturaProveedor.add(jLabelid_tipo_retencion_fuente1FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente1FacturaProveedor.add(jButtonid_tipo_retencion_fuente1FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente1FacturaProveedor.add(jButtonid_tipo_retencion_fuente1FacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencion_fuente1FacturaProveedor.add(jComboBoxid_tipo_retencion_fuente1FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_fuente1_porcentajeFacturaProveedor.add(jLabelret_fuente1_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_fuente1_porcentajeFacturaProveedor.add(jButtonret_fuente1_porcentajeFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_fuente1_porcentajeFacturaProveedor.add(jTextFieldret_fuente1_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_fuente1_baseFacturaProveedor.add(jLabelret_fuente1_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_fuente1_baseFacturaProveedor.add(jButtonret_fuente1_baseFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_fuente1_baseFacturaProveedor.add(jTextFieldret_fuente1_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_fuente1_retenidoFacturaProveedor.add(jLabelret_fuente1_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_fuente1_retenidoFacturaProveedor.add(jButtonret_fuente1_retenidoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_fuente1_retenidoFacturaProveedor.add(jTextFieldret_fuente1_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencion_fuente2FacturaProveedor.add(jLabelid_tipo_retencion_fuente2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente2FacturaProveedor.add(jButtonid_tipo_retencion_fuente2FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente2FacturaProveedor.add(jButtonid_tipo_retencion_fuente2FacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencion_fuente2FacturaProveedor.add(jComboBoxid_tipo_retencion_fuente2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_fuente2_porcentajeFacturaProveedor.add(jLabelret_fuente2_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_fuente2_porcentajeFacturaProveedor.add(jButtonret_fuente2_porcentajeFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_fuente2_porcentajeFacturaProveedor.add(jTextFieldret_fuente2_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_fuente2_baseFacturaProveedor.add(jLabelret_fuente2_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_fuente2_baseFacturaProveedor.add(jButtonret_fuente2_baseFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_fuente2_baseFacturaProveedor.add(jTextFieldret_fuente2_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_fuente2_retenidoFacturaProveedor.add(jLabelret_fuente2_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_fuente2_retenidoFacturaProveedor.add(jButtonret_fuente2_retenidoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_fuente2_retenidoFacturaProveedor.add(jTextFieldret_fuente2_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencion_iva1FacturaProveedor.add(jLabelid_tipo_retencion_iva1FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva1FacturaProveedor.add(jButtonid_tipo_retencion_iva1FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva1FacturaProveedor.add(jButtonid_tipo_retencion_iva1FacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencion_iva1FacturaProveedor.add(jComboBoxid_tipo_retencion_iva1FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_iva_bien_porcentajeFacturaProveedor.add(jLabelret_iva_bien_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_iva_bien_porcentajeFacturaProveedor.add(jButtonret_iva_bien_porcentajeFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_iva_bien_porcentajeFacturaProveedor.add(jTextFieldret_iva_bien_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_iva_bien_baseFacturaProveedor.add(jLabelret_iva_bien_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_iva_bien_baseFacturaProveedor.add(jButtonret_iva_bien_baseFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_iva_bien_baseFacturaProveedor.add(jTextFieldret_iva_bien_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_iva_bien_retenidoFacturaProveedor.add(jLabelret_iva_bien_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_iva_bien_retenidoFacturaProveedor.add(jButtonret_iva_bien_retenidoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_iva_bien_retenidoFacturaProveedor.add(jTextFieldret_iva_bien_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencion_iva2FacturaProveedor.add(jLabelid_tipo_retencion_iva2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva2FacturaProveedor.add(jButtonid_tipo_retencion_iva2FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva2FacturaProveedor.add(jButtonid_tipo_retencion_iva2FacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencion_iva2FacturaProveedor.add(jComboBoxid_tipo_retencion_iva2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_iva_servicio_porcentajeFacturaProveedor.add(jLabelret_iva_servicio_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_iva_servicio_porcentajeFacturaProveedor.add(jButtonret_iva_servicio_porcentajeFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_iva_servicio_porcentajeFacturaProveedor.add(jTextFieldret_iva_servicio_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_iva_servicio_baseFacturaProveedor.add(jLabelret_iva_servicio_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_iva_servicio_baseFacturaProveedor.add(jButtonret_iva_servicio_baseFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_iva_servicio_baseFacturaProveedor.add(jTextFieldret_iva_servicio_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelret_iva_servicio_retenidoFacturaProveedor.add(jLabelret_iva_servicio_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelret_iva_servicio_retenidoFacturaProveedor.add(jButtonret_iva_servicio_retenidoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelret_iva_servicio_retenidoFacturaProveedor.add(jTextFieldret_iva_servicio_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanexo_numero_autorizacionFacturaProveedor.add(jLabelanexo_numero_autorizacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelanexo_numero_autorizacionFacturaProveedor.add(jButtonanexo_numero_autorizacionFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanexo_numero_autorizacionFacturaProveedor.add(jTextFieldanexo_numero_autorizacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanexo_numeso_serieFacturaProveedor.add(jLabelanexo_numeso_serieFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelanexo_numeso_serieFacturaProveedor.add(jButtonanexo_numeso_serieFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanexo_numeso_serieFacturaProveedor.add(jTextFieldanexo_numeso_serieFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanexo_fecha_validezFacturaProveedor.add(jLabelanexo_fecha_validezFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelanexo_fecha_validezFacturaProveedor.add(jButtonanexo_fecha_validezFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanexo_fecha_validezFacturaProveedor.add(jDateChooseranexo_fecha_validezFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_tributarioFacturaProveedor.add(jLabelid_tipo_tributarioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tributarioFacturaProveedor.add(jButtonid_tipo_tributarioFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tributarioFacturaProveedor.add(jButtonid_tipo_tributarioFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_tributarioFacturaProveedor.add(jComboBoxid_tipo_tributarioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanexo_factura_inicioFacturaProveedor.add(jLabelanexo_factura_inicioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelanexo_factura_inicioFacturaProveedor.add(jButtonanexo_factura_inicioFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanexo_factura_inicioFacturaProveedor.add(jTextFieldanexo_factura_inicioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanexo_factura_finFacturaProveedor.add(jLabelanexo_factura_finFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelanexo_factura_finFacturaProveedor.add(jButtonanexo_factura_finFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanexo_factura_finFacturaProveedor.add(jTextFieldanexo_factura_finFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.add(jLabelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.add(jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.add(jButtonid_cuenta_contable_credito_fiscal_bienesFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor.add(jComboBoxid_cuenta_contable_credito_fiscal_bienesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_responsable_fondoFacturaProveedor.add(jLabelid_responsable_fondoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsable_fondoFacturaProveedor.add(jButtonid_responsable_fondoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_responsable_fondoFacturaProveedor.add(jButtonid_responsable_fondoFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_responsable_fondoFacturaProveedor.add(jComboBoxid_responsable_fondoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.add(jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.add(jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.add(jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor.add(jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsecuencialFacturaProveedor.add(jLabelsecuencialFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelsecuencialFacturaProveedor.add(jButtonsecuencialFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsecuencialFacturaProveedor.add(jTextFieldsecuencialFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contable_gastoFacturaProveedor.add(jLabelid_cuenta_contable_gastoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 2;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_gastoFacturaProveedor.add(jButtonid_cuenta_contable_gastoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 3;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_gastoFacturaProveedor.add(jButtonid_cuenta_contable_gastoFacturaProveedorArbol, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 4;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_gastoFacturaProveedor.add(jButtonid_cuenta_contable_gastoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 5;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_gastoFacturaProveedor.add(jButtonid_cuenta_contable_gastoFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contable_gastoFacturaProveedor.add(jComboBoxid_cuenta_contable_gastoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelgasto_valorFacturaProveedor.add(jLabelgasto_valorFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelgasto_valorFacturaProveedor.add(jButtongasto_valorFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelgasto_valorFacturaProveedor.add(jTextFieldgasto_valorFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contable_gasto2FacturaProveedor.add(jLabelid_cuenta_contable_gasto2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_gasto2FacturaProveedor.add(jButtonid_cuenta_contable_gasto2FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_gasto2FacturaProveedor.add(jButtonid_cuenta_contable_gasto2FacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contable_gasto2FacturaProveedor.add(jComboBoxid_cuenta_contable_gasto2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelgasto_valor2FacturaProveedor.add(jLabelgasto_valor2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelgasto_valor2FacturaProveedor.add(jButtongasto_valor2FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelgasto_valor2FacturaProveedor.add(jTextFieldgasto_valor2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelgasto_nombreFacturaProveedor.add(jLabelgasto_nombreFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelgasto_nombreFacturaProveedor.add(jButtongasto_nombreFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelgasto_nombreFacturaProveedor.add(jTextFieldgasto_nombreFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelgasto_nombre2FacturaProveedor.add(jLabelgasto_nombre2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelgasto_nombre2FacturaProveedor.add(jButtongasto_nombre2FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelgasto_nombre2FacturaProveedor.add(jTextFieldgasto_nombre2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contable_credito_finFacturaProveedor.add(jLabelid_cuenta_contable_credito_finFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 2;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_credito_finFacturaProveedor.add(jButtonid_cuenta_contable_credito_finFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 3;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_credito_finFacturaProveedor.add(jButtonid_cuenta_contable_credito_finFacturaProveedorArbol, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 4;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_finFacturaProveedor.add(jButtonid_cuenta_contable_credito_finFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 5;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_finFacturaProveedor.add(jButtonid_cuenta_contable_credito_finFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contable_credito_finFacturaProveedor.add(jComboBoxid_cuenta_contable_credito_finFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contable_credito_fin2FacturaProveedor.add(jLabelid_cuenta_contable_credito_fin2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 2;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_credito_fin2FacturaProveedor.add(jButtonid_cuenta_contable_credito_fin2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 3;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_credito_fin2FacturaProveedor.add(jButtonid_cuenta_contable_credito_fin2FacturaProveedorArbol, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 4;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_fin2FacturaProveedor.add(jButtonid_cuenta_contable_credito_fin2FacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 5;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_fin2FacturaProveedor.add(jButtonid_cuenta_contable_credito_fin2FacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contable_credito_fin2FacturaProveedor.add(jComboBoxid_cuenta_contable_credito_fin2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contable_creditoFacturaProveedor.add(jLabelid_cuenta_contable_creditoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 2;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoFacturaProveedor.add(jButtonid_cuenta_contable_creditoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 3;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_cuenta_contable_creditoFacturaProveedor.add(jButtonid_cuenta_contable_creditoFacturaProveedorArbol, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 4;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoFacturaProveedor.add(jButtonid_cuenta_contable_creditoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 5;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_creditoFacturaProveedor.add(jButtonid_cuenta_contable_creditoFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contable_creditoFacturaProveedor.add(jComboBoxid_cuenta_contable_creditoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionFacturaProveedor.add(jLabeldescripcionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionFacturaProveedor.add(jButtondescripcionFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionFacturaProveedor.add(jscrollPanedescripcionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_movimientoFacturaProveedor.add(jLabelid_tipo_movimientoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoFacturaProveedor.add(jButtonid_tipo_movimientoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoFacturaProveedor.add(jButtonid_tipo_movimientoFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_movimientoFacturaProveedor.add(jComboBoxid_tipo_movimientoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_movimiento_moduloFacturaProveedor.add(jLabelid_tipo_movimiento_moduloFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloFacturaProveedor.add(jButtonid_tipo_movimiento_moduloFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloFacturaProveedor.add(jButtonid_tipo_movimiento_moduloFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_movimiento_moduloFacturaProveedor.add(jComboBoxid_tipo_movimiento_moduloFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_transaccion_moduloFacturaProveedor.add(jLabelid_tipo_transaccion_moduloFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloFacturaProveedor.add(jButtonid_tipo_transaccion_moduloFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 3;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloFacturaProveedor.add(jButtonid_tipo_transaccion_moduloFacturaProveedorUpdate, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_transaccion_moduloFacturaProveedor.add(jComboBoxid_tipo_transaccion_moduloFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_mayorFacturaProveedor.add(jLabelnumero_mayorFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorFacturaProveedor.add(jButtonnumero_mayorFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_mayorFacturaProveedor.add(jTextFieldnumero_mayorFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 0;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcodigo_asientoFacturaProveedor.add(jLabelcodigo_asientoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = 2;
		this.gridBagConstraintsFacturaProveedor.ipadx = 0;
		this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_asientoFacturaProveedor.add(jButtoncodigo_asientoFacturaProveedorBusqueda, this.gridBagConstraintsFacturaProveedor);
	}

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedor.gridy = 0;
	this.gridBagConstraintsFacturaProveedor.gridx = 1;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcodigo_asientoFacturaProveedor.add(jTextFieldcodigo_asientoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_empresaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_sucursalFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_ejercicioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_periodoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_anioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_mesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_moduloFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelnumero_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelrucFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelgasto_nombreFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelgasto_nombre2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_cuenta_contable_credito_finFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_cuenta_contable_credito_fin2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_cuenta_contable_creditoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPaneldescripcionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_tipo_movimientoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_tipo_movimiento_moduloFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelid_tipo_transaccion_moduloFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelnumero_mayorFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposOcultosFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposOcultosFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedor.add(this.jPanelcodigo_asientoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposOcultosFacturaProveedor % 3==0) {
		iXPanelCamposOcultosFacturaProveedor=0;
		iYPanelCamposOcultosFacturaProveedor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelidFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelid_plantilla_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelid_tipo_documentoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelplazoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelid_facturaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelid_transaccionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelfecha_emisionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelid_clienteFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelid_empleado_solicitaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelfecha_venceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelid_monedaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelid_empleadoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelcon_activosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelcon_riseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPanelcon_sitiosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciogeneralFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciogeneralFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.gridBagConstraintsFacturaProveedor.gridwidth = 2;

	this.jPanelCamposIniciogeneralFacturaProveedor.add(this.jPaneldetalleFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciogeneralFacturaProveedor % 3==0) {
		iXPanelCamposIniciogeneralFacturaProveedor=0;
		iYPanelCamposIniciogeneralFacturaProveedor++;
	}

	iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
	iYPanelCamposIniciodatos_facturaFacturaProveedor++;


	if(!iXPanelCamposIniciodatos_facturaFacturaProveedor.equals(0)) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}

	JLabelMe jLabelTitulovalor_bienes12FacturaProveedor = new JLabelMe();
	jLabelTitulovalor_bienes12FacturaProveedor.setText("                           Bienes                      -                 Servicios                        -                  Totales");
	jLabelTitulovalor_bienes12FacturaProveedor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulovalor_bienes12FacturaProveedor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));
	jLabelTitulovalor_bienes12FacturaProveedor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL));

	FuncionesSwing.setFormatoLabelTituloGrupo(jLabelTitulovalor_bienes12FacturaProveedor);

	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	this.gridBagConstraintsFacturaProveedor.gridwidth = 5;
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(jLabelTitulovalor_bienes12FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}

	if(!iXPanelCamposIniciodatos_facturaFacturaProveedor.equals(0)) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}


	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPanelvalor_bienes12FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPanelvalor_servicios12FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPaneltotal_valor12FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPanelvalor_bienes0FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPanelvalor_servicios0FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPaneltotal_valor0FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPanelbienes_iceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPanelservicios_iceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPaneltotal_iceFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPanelbienes_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPanelservicios_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPaneltotal_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPaneliva_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPaneltotalFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_facturaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_facturaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_facturaFacturaProveedor.add(this.jPanelcon_monto_objeto_ivaFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_facturaFacturaProveedor % 3==0) {
		iXPanelCamposIniciodatos_facturaFacturaProveedor=0;
		iYPanelCamposIniciodatos_facturaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencion_0FacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencion_0FacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencion_0FacturaProveedor.add(this.jPanelnumero_retencionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencion_0FacturaProveedor % 1==0) {
		iXPanelCamposIniciodatos_retencion_0FacturaProveedor=0;
		iYPanelCamposIniciodatos_retencion_0FacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencion_0FacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencion_0FacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencion_0FacturaProveedor.add(this.jPanelnumero_serieFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencion_0FacturaProveedor % 1==0) {
		iXPanelCamposIniciodatos_retencion_0FacturaProveedor=0;
		iYPanelCamposIniciodatos_retencion_0FacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencion_0FacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencion_0FacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencion_0FacturaProveedor.add(this.jPanelnumero_autorizacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencion_0FacturaProveedor % 1==0) {
		iXPanelCamposIniciodatos_retencion_0FacturaProveedor=0;
		iYPanelCamposIniciodatos_retencion_0FacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencion_0FacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencion_0FacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencion_0FacturaProveedor.add(this.jPanelfecha_validezFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencion_0FacturaProveedor % 1==0) {
		iXPanelCamposIniciodatos_retencion_0FacturaProveedor=0;
		iYPanelCamposIniciodatos_retencion_0FacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelid_tipo_retencion_fuente1FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_fuente1_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_fuente1_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_fuente1_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelid_tipo_retencion_fuente2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_fuente2_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_fuente2_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_fuente2_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelid_tipo_retencion_iva1FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_iva_bien_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_iva_bien_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_iva_bien_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelid_tipo_retencion_iva2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_iva_servicio_porcentajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_iva_servicio_baseFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedor.add(this.jPanelret_iva_servicio_retenidoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedor % 4==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedor=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedor.add(this.jPanelanexo_numero_autorizacionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedor % 1==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedor=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedor.add(this.jPanelanexo_numeso_serieFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedor % 1==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedor=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedor.add(this.jPanelanexo_fecha_validezFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedor % 1==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedor=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedor.add(this.jPanelid_tipo_tributarioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedor % 1==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedor=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedor.add(this.jPanelanexo_factura_inicioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedor % 1==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedor=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedor.add(this.jPanelanexo_factura_finFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedor % 1==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedor=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciocuentas_contablesFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciocuentas_contablesFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocuentas_contablesFacturaProveedor.add(this.jPanelid_cuenta_contable_credito_fiscal_bienesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciocuentas_contablesFacturaProveedor % 2==0) {
		iXPanelCamposIniciocuentas_contablesFacturaProveedor=0;
		iYPanelCamposIniciocuentas_contablesFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciocuentas_contablesFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciocuentas_contablesFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocuentas_contablesFacturaProveedor.add(this.jPanelid_responsable_fondoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciocuentas_contablesFacturaProveedor % 2==0) {
		iXPanelCamposIniciocuentas_contablesFacturaProveedor=0;
		iYPanelCamposIniciocuentas_contablesFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciocuentas_contablesFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciocuentas_contablesFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocuentas_contablesFacturaProveedor.add(this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciocuentas_contablesFacturaProveedor % 2==0) {
		iXPanelCamposIniciocuentas_contablesFacturaProveedor=0;
		iYPanelCamposIniciocuentas_contablesFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciocuentas_contablesFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciocuentas_contablesFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocuentas_contablesFacturaProveedor.add(this.jPanelsecuencialFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciocuentas_contablesFacturaProveedor % 2==0) {
		iXPanelCamposIniciocuentas_contablesFacturaProveedor=0;
		iYPanelCamposIniciocuentas_contablesFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciocuentas_contablesFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciocuentas_contablesFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocuentas_contablesFacturaProveedor.add(this.jPanelid_cuenta_contable_gastoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciocuentas_contablesFacturaProveedor % 2==0) {
		iXPanelCamposIniciocuentas_contablesFacturaProveedor=0;
		iYPanelCamposIniciocuentas_contablesFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciocuentas_contablesFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciocuentas_contablesFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocuentas_contablesFacturaProveedor.add(this.jPanelgasto_valorFacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciocuentas_contablesFacturaProveedor % 2==0) {
		iXPanelCamposIniciocuentas_contablesFacturaProveedor=0;
		iYPanelCamposIniciocuentas_contablesFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciocuentas_contablesFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciocuentas_contablesFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocuentas_contablesFacturaProveedor.add(this.jPanelid_cuenta_contable_gasto2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciocuentas_contablesFacturaProveedor % 2==0) {
		iXPanelCamposIniciocuentas_contablesFacturaProveedor=0;
		iYPanelCamposIniciocuentas_contablesFacturaProveedor++;
	}
	this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedor.gridy = iYPanelCamposIniciocuentas_contablesFacturaProveedor;
	this.gridBagConstraintsFacturaProveedor.gridx = iXPanelCamposIniciocuentas_contablesFacturaProveedor++;
	this.gridBagConstraintsFacturaProveedor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedor.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciocuentas_contablesFacturaProveedor.add(this.jPanelgasto_valor2FacturaProveedor, this.gridBagConstraintsFacturaProveedor);



	if(iXPanelCamposIniciocuentas_contablesFacturaProveedor % 2==0) {
		iXPanelCamposIniciocuentas_contablesFacturaProveedor=0;
		iYPanelCamposIniciocuentas_contablesFacturaProveedor++;
	}
		
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
			
		GridBagLayout gridaBagLayoutAccionesFacturaProveedor= new GridBagLayout();
		this.jPanelAccionesFacturaProveedor.setLayout(gridaBagLayoutAccionesFacturaProveedor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturaProveedor= new GridBagLayout();
		this.jPanelAccionesFormularioFacturaProveedor.setLayout(gridaBagLayoutAccionesFormularioFacturaProveedor);
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaProveedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaProveedor.add(this.jComboBoxTiposAccionesFormularioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaProveedor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaProveedor.add(this.jCheckBoxPostAccionNuevoFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.facturaproveedorSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFacturaProveedor.add(this.jCheckBoxPostAccionSinCerrarFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.facturaproveedorSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.facturaproveedorSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFacturaProveedor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFacturaProveedor.add(this.jCheckBoxPostAccionSinMensajeFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturaProveedor.add(this.jButtonModificarFacturaProveedor, this.gridBagConstraintsFacturaProveedor);							

		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedor.gridy = 0;
		this.gridBagConstraintsFacturaProveedor.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturaProveedor.add(this.jButtonEliminarFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
			
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = 0;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaProveedor.add(this.jButtonActualizarFacturaProveedor, this.gridBagConstraintsFacturaProveedor);


		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = 0;		
		this.gridBagConstraintsFacturaProveedor.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaProveedor.add(this.jButtonGuardarCambiosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);	
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = 0;		
		this.gridBagConstraintsFacturaProveedor.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturaProveedor.add(this.jButtonCancelarFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaProveedor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaProveedor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturaproveedorSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();						
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaProveedor.gridx = 0;		
			//this.gridBagConstraintsFacturaProveedor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaProveedor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaProveedor.gridx =0;
		this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaProveedor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturaProveedorJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturaProveedor = new FacturaProveedorBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Factura Proveedor DATOS");
			
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
			
	        //this.setTitle("[FOR] - Factura Proveedor DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Factura Proveedor Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			FacturaProveedorModel facturaproveedorModel=new FacturaProveedorModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturaProveedorModel.FacturaProveedorFocusTraversalPolicy facturaproveedorFocusTraversalPolicy = facturaproveedorModel.new FacturaProveedorFocusTraversalPolicy(this);
			
			//facturaproveedorFocusTraversalPolicy.setfacturaproveedorJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturaproveedorModel);
			
			
			this.jContentPaneDetalleFacturaProveedor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturaProveedor = new GridBagLayout();	
			this.jContentPaneDetalleFacturaProveedor.setLayout(gridaBagLayoutDetalleFacturaProveedor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaProveedor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
				this.gridBagConstraintsFacturaProveedor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturaProveedor.gridx = 0;
					
				this.gridBagConstraintsFacturaProveedor.gridwidth=2;
				
				this.jContentPaneDetalleFacturaProveedor.add(jTtoolBarDetalleFacturaProveedor, gridBagConstraintsFacturaProveedor);								
				
}
			
			this.jScrollPanelDatosEdicionFacturaProveedor=   new JScrollPane(jContentPaneDetalleFacturaProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturaProveedor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFacturaProveedor.gridy = 1;
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
		this.gridBagConstraintsFacturaProveedor.gridwidth = 3;
		iGridyRelaciones = 1;
		iGridyRelaciones++;

		this.jContentPaneDetalleFacturaProveedor.add(jPanelCamposIniciogeneralFacturaProveedor, gridBagConstraintsFacturaProveedor);


		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFacturaProveedor.gridy = 2;
		this.gridBagConstraintsFacturaProveedor.gridx = 1;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleFacturaProveedor.add(jPanelCamposIniciodatos_facturaFacturaProveedor, gridBagConstraintsFacturaProveedor);


		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFacturaProveedor.gridy = 3;
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
		iGridyRelaciones = 3;
		iGridyRelaciones++;

		this.jContentPaneDetalleFacturaProveedor.add(jPanelCamposIniciodatos_retencion_0FacturaProveedor, gridBagConstraintsFacturaProveedor);


		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFacturaProveedor.gridy = 3;
		this.gridBagConstraintsFacturaProveedor.gridx = 1;
		iGridyRelaciones = 3;
		iGridyRelaciones++;

		this.jContentPaneDetalleFacturaProveedor.add(jPanelCamposIniciodatos_retencionFacturaProveedor, gridBagConstraintsFacturaProveedor);


		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFacturaProveedor.gridy = 2;
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleFacturaProveedor.add(jPanelCamposInicioanexos_ivaFacturaProveedor, gridBagConstraintsFacturaProveedor);


		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFacturaProveedor.gridy = 4;
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
		this.gridBagConstraintsFacturaProveedor.gridwidth = 2;
		iGridyRelaciones = 4;
		iGridyRelaciones++;

		this.jContentPaneDetalleFacturaProveedor.add(jPanelCamposIniciocuentas_contablesFacturaProveedor, gridBagConstraintsFacturaProveedor);
			
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
						&& facturaproveedorSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleFacturaProveedor(this.puedeCargarPorParteDetalleFacturaProveedor,false,-1);
					
					if(this.facturaproveedorSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturaProveedor= new GridBagConstraints();
						this.gridBagConstraintsFacturaProveedor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturaProveedor.gridx = 0;
						this.jContentPaneDetalleFacturaProveedor.add(this.jTabbedPaneRelacionesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturaProveedor.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleFacturaProveedor(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturaProveedor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
					this.gridBagConstraintsFacturaProveedor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturaProveedor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturaProveedor.gridx = 0;
					
					this.gridBagConstraintsFacturaProveedor.gridwidth=2;
				
					this.jContentPaneDetalleFacturaProveedor.add(jPanelCamposOcultosFacturaProveedor, gridBagConstraintsFacturaProveedor);
				
					this.jPanelCamposOcultosFacturaProveedor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsFacturaProveedor.gridx = 0;
	        this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.CENTER;//WEST;
			
			this.gridBagConstraintsFacturaProveedor.gridwidth=2;
			
			
			this.jContentPaneDetalleFacturaProveedor.add(this.jPanelAccionesFormularioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);							
			
			
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsFacturaProveedor.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsFacturaProveedor.gridx = 0;
	        
			this.gridBagConstraintsFacturaProveedor.gridwidth=2;
			
			this.jContentPaneDetalleFacturaProveedor.add(this.jPanelAccionesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturaProveedor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturaProveedor=   new JScrollPane(this.jPanelCamposFacturaProveedor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaProveedor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaProveedor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaProveedor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturaProveedor.gridx = 0;
			this.gridBagConstraintsFacturaProveedor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturaProveedor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturaProveedor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaProveedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturaProveedor, this.gridBagConstraintsFacturaProveedor);			
			
			this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaProveedor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
			
			
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		
			
		this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaProveedor, this.gridBagConstraintsFacturaProveedor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturaProveedor;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturaProveedor;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleFacturaProveedor(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallefacturaproveedorSessionBean=new DetalleFacturaProveedorSessionBean();
		this.detallefacturaproveedorSessionBean.setConGuardarRelaciones(false);
		this.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(true);

		this.detallefacturaproveedorBeanSwingJInternalFrame=null;//new DetalleFacturaProveedorBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallefacturaproveedorBeanSwingJInternalFramePopup=new DetalleFacturaProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallefacturaproveedorBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {

				DetalleFacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL=FacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleFacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=FacturaProveedorJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(true);

				this.detallefacturaproveedorBeanSwingJInternalFrame=new DetalleFacturaProveedorBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallefacturaproveedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallefacturaproveedorBeanSwingJInternalFrame.setdetallefacturaproveedorSessionBean(this.detallefacturaproveedorSessionBean);

				//this.gridBagConstraintsFacturaProveedor = new GridBagConstraints();
				//this.gridBagConstraintsFacturaProveedor.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsFacturaProveedor.gridx = 0;
				//this.jContentPaneDetalleFacturaProveedor.add(this.detallefacturaproveedorBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsFacturaProveedor);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesFacturaProveedor.add("Detalle Factura Proveedores",this.detallefacturaproveedorBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesFacturaProveedor.setComponentAt(iIndexTab,this.detallefacturaproveedorBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleFacturaProveedorJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallefacturaproveedorSessionBean.setEsGuardarRelacionado(false);
				this.detallefacturaproveedorBeanSwingJInternalFrame=null;//new DetalleFacturaProveedorBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallefacturaproveedorSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleFacturaProveedor) {
					this.jTabbedPaneRelacionesFacturaProveedor.add("Detalle Factura Proveedores",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleFacturaProveedorBeanSwingJInternalFrame(List<FacturaProveedor> facturaproveedors,FacturaProveedor facturaproveedor,DetalleFacturaProveedorBeanSwingJInternalFrame detallefacturaproveedorBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallefacturaproveedorBeanSwingJInternalFrame=new DetalleFacturaProveedorBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallefacturaproveedorBeanSwingJInternalFrame.getDetalleFacturaProveedorLogic().setConnexion(this.facturaproveedorLogic.getConnexion());

					detallefacturaproveedorBeanSwingJInternalFrame.setfacturaproveedorsForeignKey(facturaproveedors);
					detallefacturaproveedorBeanSwingJInternalFrame.setfacturaproveedorForeignKey(facturaproveedor);
					detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.setisBusquedaDesdeForeignKeySesionFacturaProveedor(true);
					detallefacturaproveedorBeanSwingJInternalFrame.detallefacturaproveedorSessionBean.setlidFacturaProveedorActual(facturaproveedor.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallefacturaproveedorBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleFacturaProveedor(detallefacturaproveedorBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallefacturaproveedorBeanSwingJInternalFrame.setVisibilidadBusquedasParaFacturaProveedor(true);
					detallefacturaproveedorBeanSwingJInternalFrame.setid_factura_proveedorFK_IdFacturaProveedor(facturaproveedor.getId());

					if(!this.conCargarFormDetalle) {
						detallefacturaproveedorBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallefacturaproveedorBeanSwingJInternalFrame.setSelectedItemCombosFrameFacturaProveedorForeignKey(facturaproveedor,1,false,true,true);
					detallefacturaproveedorBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallefacturaproveedorBeanSwingJInternalFrame.procesarBusqueda("FK_IdFacturaProveedor");
					detallefacturaproveedorBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdFacturaProveedor");
					detallefacturaproveedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleFacturaProveedor(true);
					detallefacturaproveedorBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleFacturaProveedor("n",detallefacturaproveedorBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallefacturaproveedorBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallefacturaproveedorBeanSwingJInternalFrame.setAutoscrolls(true);
					detallefacturaproveedorBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallefacturaproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFacturaProveedor("relacionado");
					} else {
						detallefacturaproveedorBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFacturaProveedor("no_relacionado");
					}

					detallefacturaproveedorBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleFacturaProveedor().setVisible(false);

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
