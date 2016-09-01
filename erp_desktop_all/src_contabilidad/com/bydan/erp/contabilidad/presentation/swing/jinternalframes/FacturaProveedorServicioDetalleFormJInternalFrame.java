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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.contabilidad.util.FacturaProveedorServicioConstantesFunciones;

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
public class FacturaProveedorServicioDetalleFormJInternalFrame extends FacturaProveedorServicioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleFacturaProveedorServicio;
	
	protected JMenuBar jmenuBarDetalleFacturaProveedorServicio;
	
	protected JMenu jmenuDetalleFacturaProveedorServicio;
	protected JMenu jmenuDetalleArchivoFacturaProveedorServicio;
	protected JMenu jmenuDetalleAccionesFacturaProveedorServicio;
	protected JMenu jmenuDetalleDatosFacturaProveedorServicio;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutFacturaProveedorServicio;	
	protected GridBagConstraints gridBagConstraintsFacturaProveedorServicio;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected FacturaProveedorServicioBeanSwingJInternalFrameAdditional jInternalFrameDetalleFacturaProveedorServicio;		
	
	
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

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumento="";

	protected EmpleadoBeanSwingJInternalFrame empleadosolicitaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleadosolicita="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoTributarioBeanSwingJInternalFrame tipotributarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotributario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencionfuente1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencionfuente1="";

	protected TipoRetencionBeanSwingJInternalFrame tiporetencioniva1BeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tiporetencioniva1="";

	protected CuentaContableBeanSwingJInternalFrame cuentacontablecreditofiscalserviciosBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cuentacontablecreditofiscalservicios="";

	protected TipoMovimientoBeanSwingJInternalFrame tipomovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimiento="";

	protected TipoMovimientoModuloBeanSwingJInternalFrame tipomovimientomoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipomovimientomodulo="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";
	
	public FacturaProveedorServicioSessionBean facturaproveedorservicioSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public TipoDocumentoSessionBean tipodocumentoSessionBean;
	public EmpleadoSessionBean empleadosolicitaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoTributarioSessionBean tipotributarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoRetencionSessionBean tiporetencionfuente1SessionBean;
	public TipoRetencionSessionBean tiporetencioniva1SessionBean;
	public CuentaContableSessionBean cuentacontablecreditofiscalserviciosSessionBean;
	public TipoMovimientoSessionBean tipomovimientoSessionBean;
	public TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;	
	
	public FacturaProveedorServicioLogic facturaproveedorservicioLogic;
	
	public JScrollPane jScrollPanelDatosFacturaProveedorServicio;
	public JScrollPane jScrollPanelDatosEdicionFacturaProveedorServicio;
	public JScrollPane jScrollPanelDatosGeneralFacturaProveedorServicio;
	
	protected JPanel jPanelCamposFacturaProveedorServicio;    
	protected JPanel jPanelCamposOcultosFacturaProveedorServicio;    	
	protected JPanel jPanelAccionesFacturaProveedorServicio;
	protected JPanel jPanelAccionesFormularioFacturaProveedorServicio;
    
	
	
	protected Integer iXPanelCamposFacturaProveedorServicio=0;
	protected Integer iYPanelCamposFacturaProveedorServicio=0;
	
	protected Integer iXPanelCamposOcultosFacturaProveedorServicio=0;
	protected Integer iYPanelCamposOcultosFacturaProveedorServicio=0;
	
	

	protected JPanel jPanelCamposIniciogeneralFacturaProveedorServicio;
	protected Integer iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
	protected Integer iYPanelCamposIniciogeneralFacturaProveedorServicio=0;

	protected JPanel jPanelCamposIniciodatos_retencionFacturaProveedorServicio;
	protected Integer iXPanelCamposIniciodatos_retencionFacturaProveedorServicio=0;
	protected Integer iYPanelCamposIniciodatos_retencionFacturaProveedorServicio=0;

	protected JPanel jPanelCamposInicioanexos_ivaFacturaProveedorServicio;
	protected Integer iXPanelCamposInicioanexos_ivaFacturaProveedorServicio=0;
	protected Integer iYPanelCamposInicioanexos_ivaFacturaProveedorServicio=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoFacturaProveedorServicio;
	public JButton jButtonModificarFacturaProveedorServicio;
	public JButton jButtonActualizarFacturaProveedorServicio;
    public JButton jButtonEliminarFacturaProveedorServicio;
	public JButton jButtonCancelarFacturaProveedorServicio;
    public JButton jButtonGuardarCambiosFacturaProveedorServicio;
	public JButton jButtonGuardarCambiosTablaFacturaProveedorServicio;
	protected JButton jButtonCerrarFacturaProveedorServicio;
	
	
	protected JButton jButtonProcesarInformacionFacturaProveedorServicio;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoFacturaProveedorServicio;
	protected JCheckBox jCheckBoxPostAccionSinCerrarFacturaProveedorServicio;
	protected JCheckBox jCheckBoxPostAccionSinMensajeFacturaProveedorServicio;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarFacturaProveedorServicio;
	protected JButton jButtonModificarToolBarFacturaProveedorServicio;
	protected JButton jButtonActualizarToolBarFacturaProveedorServicio;
    protected JButton jButtonEliminarToolBarFacturaProveedorServicio;
	protected JButton jButtonCancelarToolBarFacturaProveedorServicio;
    protected JButton jButtonGuardarCambiosToolBarFacturaProveedorServicio;
	protected JButton jButtonGuardarCambiosTablaToolBarFacturaProveedorServicio;
	protected JButton jButtonMostrarOcultarTablaToolBarFacturaProveedorServicio;
	protected JButton jButtonCerrarToolBarFacturaProveedorServicio;
	
	protected JButton jButtonProcesarInformacionToolBarFacturaProveedorServicio;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoFacturaProveedorServicio;
	protected JMenuItem jMenuItemModificarFacturaProveedorServicio;
	protected JMenuItem jMenuItemActualizarFacturaProveedorServicio;
    protected JMenuItem jMenuItemEliminarFacturaProveedorServicio;
	protected JMenuItem jMenuItemCancelarFacturaProveedorServicio;
    protected JMenuItem jMenuItemGuardarCambiosFacturaProveedorServicio;
	protected JMenuItem jMenuItemGuardarCambiosTablaFacturaProveedorServicio;
	protected JMenuItem jMenuItemCerrarFacturaProveedorServicio;
	protected JMenuItem jMenuItemDetalleCerrarFacturaProveedorServicio;
	protected JMenuItem jMenuItemDetalleMostarOcultarFacturaProveedorServicio;
	
	protected JMenuItem jMenuItemProcesarInformacionFacturaProveedorServicio;
	protected JMenuItem jMenuItemNuevoGuardarCambiosFacturaProveedorServicio;
	protected JMenuItem jMenuItemMostrarOcultarFacturaProveedorServicio;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesFacturaProveedorServicio;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesFacturaProveedorServicio;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioFacturaProveedorServicio;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidFacturaProveedorServicio;
	public JLabel jLabelIdFacturaProveedorServicio;
	public JLabel jLabelidFacturaProveedorServicio;
	public JButton jButtonidFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaFacturaProveedorServicio;
	public JLabel jLabelnumero_facturaFacturaProveedorServicio;
	public JTextField jTextFieldnumero_facturaFacturaProveedorServicio;
	public JButton jButtonnumero_facturaFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelrucFacturaProveedorServicio;
	public JLabel jLabelrucFacturaProveedorServicio;
	public JTextField jTextFieldrucFacturaProveedorServicio;
	public JButton jButtonrucFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelplazoFacturaProveedorServicio;
	public JLabel jLabelplazoFacturaProveedorServicio;
	public JTextField jTextFieldplazoFacturaProveedorServicio;
	public JButton jButtonplazoFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelcon_riseFacturaProveedorServicio;
	public JLabel jLabelcon_riseFacturaProveedorServicio;
	public JCheckBox jCheckBoxcon_riseFacturaProveedorServicio;
	public JButton jButtoncon_riseFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionFacturaProveedorServicio;
	public JLabel jLabelfecha_emisionFacturaProveedorServicio;
	//public JFormattedTextField jDateChooserfecha_emisionFacturaProveedorServicio;

	public JDateChooser jDateChooserfecha_emisionFacturaProveedorServicio;
	public JButton jButtonfecha_emisionFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceFacturaProveedorServicio;
	public JLabel jLabelfecha_venceFacturaProveedorServicio;
	//public JFormattedTextField jDateChooserfecha_venceFacturaProveedorServicio;

	public JDateChooser jDateChooserfecha_venceFacturaProveedorServicio;
	public JButton jButtonfecha_venceFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPaneldetalleFacturaProveedorServicio;
	public JLabel jLabeldetalleFacturaProveedorServicio;
	public JTextArea jTextAreadetalleFacturaProveedorServicio;
	public JScrollPane jscrollPanedetalleFacturaProveedorServicio;
	public JButton jButtondetalleFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_retencionFacturaProveedorServicio;
	public JLabel jLabelnumero_retencionFacturaProveedorServicio;
	public JTextField jTextFieldnumero_retencionFacturaProveedorServicio;
	public JButton jButtonnumero_retencionFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorizacionFacturaProveedorServicio;
	public JLabel jLabelnumero_autorizacionFacturaProveedorServicio;
	public JTextField jTextFieldnumero_autorizacionFacturaProveedorServicio;
	public JButton jButtonnumero_autorizacionFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_serieFacturaProveedorServicio;
	public JLabel jLabelnumero_serieFacturaProveedorServicio;
	public JTextField jTextFieldnumero_serieFacturaProveedorServicio;
	public JButton jButtonnumero_serieFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_validezFacturaProveedorServicio;
	public JLabel jLabelfecha_validezFacturaProveedorServicio;
	//public JFormattedTextField jDateChooserfecha_validezFacturaProveedorServicio;

	public JDateChooser jDateChooserfecha_validezFacturaProveedorServicio;
	public JButton jButtonfecha_validezFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelanexo_factura_inicioFacturaProveedorServicio;
	public JLabel jLabelanexo_factura_inicioFacturaProveedorServicio;
	public JTextField jTextFieldanexo_factura_inicioFacturaProveedorServicio;
	public JButton jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelanexo_factura_finFacturaProveedorServicio;
	public JLabel jLabelanexo_factura_finFacturaProveedorServicio;
	public JTextField jTextFieldanexo_factura_finFacturaProveedorServicio;
	public JButton jButtonanexo_factura_finFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelvalor_servicios0FacturaProveedorServicio;
	public JLabel jLabelvalor_servicios0FacturaProveedorServicio;
	public JTextField jTextFieldvalor_servicios0FacturaProveedorServicio;
	public JButton jButtonvalor_servicios0FacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPaneltotal_ivaFacturaProveedorServicio;
	public JLabel jLabeltotal_ivaFacturaProveedorServicio;
	public JTextField jTextFieldtotal_ivaFacturaProveedorServicio;
	public JButton jButtontotal_ivaFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPaneliva_porcentajeFacturaProveedorServicio;
	public JLabel jLabeliva_porcentajeFacturaProveedorServicio;
	public JTextField jTextFieldiva_porcentajeFacturaProveedorServicio;
	public JButton jButtoniva_porcentajeFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPaneltotalFacturaProveedorServicio;
	public JLabel jLabeltotalFacturaProveedorServicio;
	public JTextField jTextFieldtotalFacturaProveedorServicio;
	public JButton jButtontotalFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_mayorFacturaProveedorServicio;
	public JLabel jLabelnumero_mayorFacturaProveedorServicio;
	public JTextField jTextFieldnumero_mayorFacturaProveedorServicio;
	public JButton jButtonnumero_mayorFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_asientoFacturaProveedorServicio;
	public JLabel jLabelcodigo_asientoFacturaProveedorServicio;
	public JTextField jTextFieldcodigo_asientoFacturaProveedorServicio;
	public JButton jButtoncodigo_asientoFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelanexo_numero_autorizacionFacturaProveedorServicio;
	public JLabel jLabelanexo_numero_autorizacionFacturaProveedorServicio;
	public JTextField jTextFieldanexo_numero_autorizacionFacturaProveedorServicio;
	public JButton jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelanexo_numeso_serieFacturaProveedorServicio;
	public JLabel jLabelanexo_numeso_serieFacturaProveedorServicio;
	public JTextField jTextFieldanexo_numeso_serieFacturaProveedorServicio;
	public JButton jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelanexo_fecha_validezFacturaProveedorServicio;
	public JLabel jLabelanexo_fecha_validezFacturaProveedorServicio;
	//public JFormattedTextField jDateChooseranexo_fecha_validezFacturaProveedorServicio;

	public JDateChooser jDateChooseranexo_fecha_validezFacturaProveedorServicio;
	public JButton jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionFacturaProveedorServicio;
	public JLabel jLabeldescripcionFacturaProveedorServicio;
	public JTextArea jTextAreadescripcionFacturaProveedorServicio;
	public JScrollPane jscrollPanedescripcionFacturaProveedorServicio;
	public JButton jButtondescripcionFacturaProveedorServicioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaFacturaProveedorServicio;
	public JLabel jLabelid_empresaFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaFacturaProveedorServicio;
	public JButton jButtonid_empresaFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_empresaFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_empresaFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalFacturaProveedorServicio;
	public JLabel jLabelid_sucursalFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalFacturaProveedorServicio;
	public JButton jButtonid_sucursalFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_sucursalFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioFacturaProveedorServicio;
	public JLabel jLabelid_ejercicioFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioFacturaProveedorServicio;
	public JButton jButtonid_ejercicioFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_ejercicioFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoFacturaProveedorServicio;
	public JLabel jLabelid_periodoFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoFacturaProveedorServicio;
	public JButton jButtonid_periodoFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_periodoFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_periodoFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_anioFacturaProveedorServicio;
	public JLabel jLabelid_anioFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioFacturaProveedorServicio;
	public JButton jButtonid_anioFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_anioFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_anioFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_mesFacturaProveedorServicio;
	public JLabel jLabelid_mesFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesFacturaProveedorServicio;
	public JButton jButtonid_mesFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_mesFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_mesFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloFacturaProveedorServicio;
	public JLabel jLabelid_moduloFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloFacturaProveedorServicio;
	public JButton jButtonid_moduloFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_moduloFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_moduloFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionFacturaProveedorServicio;
	public JLabel jLabelid_transaccionFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionFacturaProveedorServicio;
	public JButton jButtonid_transaccionFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_transaccionFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_transaccionFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaFacturaProveedorServicio;
	public JLabel jLabelid_facturaFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaFacturaProveedorServicio;
	public JButton jButtonid_facturaFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_facturaFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_facturaFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteFacturaProveedorServicio;
	public JLabel jLabelid_clienteFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteFacturaProveedorServicio;
	public JButton jButtonid_clienteFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_clienteFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_clienteFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documentoFacturaProveedorServicio;
	public JLabel jLabelid_tipo_documentoFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documentoFacturaProveedorServicio;
	public JButton jButtonid_tipo_documentoFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_documentoFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documentoFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_empleado_solicitaFacturaProveedorServicio;
	public JLabel jLabelid_empleado_solicitaFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleado_solicitaFacturaProveedorServicio;
	public JButton jButtonid_empleado_solicitaFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_empleado_solicitaFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoFacturaProveedorServicio;
	public JLabel jLabelid_empleadoFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoFacturaProveedorServicio;
	public JButton jButtonid_empleadoFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_empleadoFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_empleadoFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_tributarioFacturaProveedorServicio;
	public JLabel jLabelid_tipo_tributarioFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_tributarioFacturaProveedorServicio;
	public JButton jButtonid_tipo_tributarioFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaFacturaProveedorServicio;
	public JLabel jLabelid_monedaFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaFacturaProveedorServicio;
	public JButton jButtonid_monedaFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_monedaFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_monedaFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_fuente1FacturaProveedorServicio;
	public JLabel jLabelid_tipo_retencion_fuente1FacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio;
	public JButton jButtonid_tipo_retencion_fuente1FacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente1FacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_retencion_iva1FacturaProveedorServicio;
	public JLabel jLabelid_tipo_retencion_iva1FacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio;
	public JButton jButtonid_tipo_retencion_iva1FacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva1FacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio;
	public JLabel jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio;
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda= new JButtonMe();
	public JButton jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioArbol= new JButtonMe();

	public JPanel jPanelid_tipo_movimientoFacturaProveedorServicio;
	public JLabel jLabelid_tipo_movimientoFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimientoFacturaProveedorServicio;
	public JButton jButtonid_tipo_movimientoFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_movimiento_moduloFacturaProveedorServicio;
	public JLabel jLabelid_tipo_movimiento_moduloFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio;
	public JButton jButtonid_tipo_movimiento_moduloFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloFacturaProveedorServicio;
	public JLabel jLabelid_tipo_transaccion_moduloFacturaProveedorServicio;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio;
	public JButton jButtonid_tipo_transaccion_moduloFacturaProveedorServicio= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFacturaProveedorServicioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesFacturaProveedorServicio;
	
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
		
	public int iWidthFormulario=815;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=880;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public FacturaProveedorServicioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposFacturaProveedorServicio=new JPanel();
				this.jPanelAccionesFormularioFacturaProveedorServicio=new JPanel();
				this.jmenuBarDetalleFacturaProveedorServicio=new JMenuBar();
				this.jTtoolBarDetalleFacturaProveedorServicio=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorServicioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("FacturaProveedorServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public FacturaProveedorServicioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("FacturaProveedorServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorServicioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaProveedorServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorServicioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("FacturaProveedorServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public FacturaProveedorServicioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("FacturaProveedorServicio No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarFacturaProveedorServicio() {
		return this.jButtonActualizarToolBarFacturaProveedorServicio;
	}
	
	public JButton getjButtonEliminarToolBarFacturaProveedorServicio() {
		return this.jButtonEliminarToolBarFacturaProveedorServicio;
	}
	
	public JButton getjButtonCancelarToolBarFacturaProveedorServicio() {
		return this.jButtonCancelarToolBarFacturaProveedorServicio;
	}		
	
	public JButton getjButtonProcesarInformacionFacturaProveedorServicio() {
		return this.jButtonProcesarInformacionFacturaProveedorServicio;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionFacturaProveedorServicio)	{
		this.jButtonProcesarInformacionFacturaProveedorServicio = jButtonProcesarInformacionFacturaProveedorServicio;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFacturaProveedorServicio() {
		return this.jComboBoxTiposAccionesFacturaProveedorServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesFacturaProveedorServicio(
			JComboBox jComboBoxTiposRelacionesFacturaProveedorServicio) {
		this.jComboBoxTiposRelacionesFacturaProveedorServicio = jComboBoxTiposRelacionesFacturaProveedorServicio;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFacturaProveedorServicio(
			JComboBox jComboBoxTiposAccionesFacturaProveedorServicio) {
		this.jComboBoxTiposAccionesFacturaProveedorServicio = jComboBoxTiposAccionesFacturaProveedorServicio;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioFacturaProveedorServicio() {
		return this.jComboBoxTiposAccionesFormularioFacturaProveedorServicio;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioFacturaProveedorServicio(
			JComboBox jComboBoxTiposAccionesFormularioFacturaProveedorServicio) {
		this.jComboBoxTiposAccionesFormularioFacturaProveedorServicio = jComboBoxTiposAccionesFormularioFacturaProveedorServicio;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.facturaproveedorservicioSessionBean=new FacturaProveedorServicioSessionBean();
		
		this.facturaproveedorservicioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		FacturaProveedorServicioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		FacturaProveedorServicioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		FacturaProveedorServicioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Factura Proveedor MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {
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
	
		FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleFacturaProveedorServicio= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarFacturaProveedorServicio=new JButtonMe();
				this.jButtonModificarToolBarFacturaProveedorServicio=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarFacturaProveedorServicio,this.jTtoolBarDetalleFacturaProveedorServicio,
							"actualizar","actualizar","Actualizar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarFacturaProveedorServicio,this.jTtoolBarDetalleFacturaProveedorServicio,
							"eliminar","eliminar","Eliminar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarFacturaProveedorServicio,this.jTtoolBarDetalleFacturaProveedorServicio,
							"cancelar","cancelar","Cancelar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarFacturaProveedorServicio=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarFacturaProveedorServicio,this.jTtoolBarDetalleFacturaProveedorServicio,
							"guardarcambios","guardarcambios","Guardar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleFacturaProveedorServicio=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleFacturaProveedorServicio=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoFacturaProveedorServicio=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesFacturaProveedorServicio=new JMenuMe("Acciones");
		this.jmenuDetalleDatosFacturaProveedorServicio=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoFacturaProveedorServicio= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoFacturaProveedorServicio.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoFacturaProveedorServicio,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarFacturaProveedorServicio= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarFacturaProveedorServicio.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarFacturaProveedorServicio,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarFacturaProveedorServicio= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarFacturaProveedorServicio.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarFacturaProveedorServicio,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarFacturaProveedorServicio= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarFacturaProveedorServicio.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarFacturaProveedorServicio,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarFacturaProveedorServicio= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarFacturaProveedorServicio.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarFacturaProveedorServicio,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosFacturaProveedorServicio= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosFacturaProveedorServicio.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosFacturaProveedorServicio,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarFacturaProveedorServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarFacturaProveedorServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarFacturaProveedorServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarFacturaProveedorServicio= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarFacturaProveedorServicio.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarFacturaProveedorServicio,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarFacturaProveedorServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarFacturaProveedorServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarFacturaProveedorServicio,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarFacturaProveedorServicio= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarFacturaProveedorServicio.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarFacturaProveedorServicio,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoFacturaProveedorServicio.add(this.jMenuItemDetalleCerrarFacturaProveedorServicio);
		
		this.jmenuDetalleAccionesFacturaProveedorServicio.add(this.jMenuItemActualizarFacturaProveedorServicio);
		this.jmenuDetalleAccionesFacturaProveedorServicio.add(this.jMenuItemEliminarFacturaProveedorServicio);
		this.jmenuDetalleAccionesFacturaProveedorServicio.add(this.jMenuItemCancelarFacturaProveedorServicio);		
		
		//this.jmenuDetalleDatosFacturaProveedorServicio.add(this.jMenuItemDetalleAbrirOrderByFacturaProveedorServicio);				
		this.jmenuDetalleDatosFacturaProveedorServicio.add(this.jMenuItemDetalleMostarOcultarFacturaProveedorServicio);				
				
		//this.jmenuDetalleAccionesFacturaProveedorServicio.add(this.jMenuItemGuardarCambiosFacturaProveedorServicio);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleFacturaProveedorServicio.add(this.jmenuDetalleArchivoFacturaProveedorServicio);		
		this.jmenuBarDetalleFacturaProveedorServicio.add(this.jmenuDetalleAccionesFacturaProveedorServicio);		
		this.jmenuBarDetalleFacturaProveedorServicio.add(this.jmenuDetalleDatosFacturaProveedorServicio);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleFacturaProveedorServicio);				
	}
	
	
	public void inicializarElementosCamposFacturaProveedorServicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdFacturaProveedorServicio = new JLabelMe();
		jLabelIdFacturaProveedorServicio.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidFacturaProveedorServicio = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutFacturaProveedorServicio= new GridBagLayout();

		this.jPanelidFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);

		jLabelidFacturaProveedorServicio = new JLabel();
		jLabelidFacturaProveedorServicio.setText("Id");

		jLabelidFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_facturaFacturaProveedorServicio = new JLabelMe();
		this.jLabelnumero_facturaFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROFACTURA+" :");
		this.jLabelnumero_facturaFacturaProveedorServicio.setToolTipText("No Factura");
		this.jLabelnumero_facturaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelnumero_facturaFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldnumero_facturaFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldnumero_facturaFacturaProveedorServicio.setEnabled(false);
		jTextFieldnumero_facturaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonnumero_facturaFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonnumero_facturaFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelrucFacturaProveedorServicio = new JLabelMe();
		this.jLabelrucFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_RUC+" :");
		this.jLabelrucFacturaProveedorServicio.setToolTipText("Ruc");
		this.jLabelrucFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelrucFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelrucFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelrucFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelrucFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_RUC);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelrucFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldrucFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldrucFacturaProveedorServicio.setEnabled(false);
		jTextFieldrucFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldrucFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldrucFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonrucFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonrucFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonrucFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonrucFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonrucFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonrucFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonrucFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldrucFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldrucFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"rucFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonrucFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelplazoFacturaProveedorServicio = new JLabelMe();
		this.jLabelplazoFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_PLAZO+" : *");
		this.jLabelplazoFacturaProveedorServicio.setToolTipText("Plazo");
		this.jLabelplazoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplazoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelplazoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelplazoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelplazoFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelplazoFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_PLAZO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelplazoFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldplazoFacturaProveedorServicio= new JTextFieldMe();
		jTextFieldplazoFacturaProveedorServicio.setEnabled(false);
		jTextFieldplazoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplazoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldplazoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldplazoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldplazoFacturaProveedorServicio.setText("0");

		this.jButtonplazoFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonplazoFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplazoFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonplazoFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonplazoFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonplazoFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonplazoFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonplazoFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldplazoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldplazoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"plazoFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonplazoFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelcon_riseFacturaProveedorServicio = new JLabelMe();
		this.jLabelcon_riseFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_CONRISE+" : *");
		this.jLabelcon_riseFacturaProveedorServicio.setToolTipText("Con Rise");
		this.jLabelcon_riseFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_riseFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcon_riseFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcon_riseFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcon_riseFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcon_riseFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_CONRISE);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelcon_riseFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jCheckBoxcon_riseFacturaProveedorServicio= new JCheckBoxMe();
		jCheckBoxcon_riseFacturaProveedorServicio.setEnabled(false);

		jCheckBoxcon_riseFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_riseFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxcon_riseFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxcon_riseFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncon_riseFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtoncon_riseFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_riseFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncon_riseFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncon_riseFacturaProveedorServicioBusqueda.setText("U");
		this.jButtoncon_riseFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncon_riseFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncon_riseFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxcon_riseFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxcon_riseFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"con_riseFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncon_riseFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionFacturaProveedorServicio = new JLabelMe();
		this.jLabelfecha_emisionFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionFacturaProveedorServicio.setToolTipText("F. Emision");
		this.jLabelfecha_emisionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelfecha_emisionFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		//jFormattedTextFieldfecha_emisionFacturaProveedorServicio= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionFacturaProveedorServicio= new JDateChooser();
		jDateChooserfecha_emisionFacturaProveedorServicio.setEnabled(false);
		jDateChooserfecha_emisionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionFacturaProveedorServicio.setDate(new Date());
		jDateChooserfecha_emisionFacturaProveedorServicio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionFacturaProveedorServicio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonfecha_emisionFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonfecha_emisionFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_venceFacturaProveedorServicio = new JLabelMe();
		this.jLabelfecha_venceFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceFacturaProveedorServicio.setToolTipText("F. Vence");
		this.jLabelfecha_venceFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelfecha_venceFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		//jFormattedTextFieldfecha_venceFacturaProveedorServicio= new JFormattedTextFieldMe();

		jDateChooserfecha_venceFacturaProveedorServicio= new JDateChooser();
		jDateChooserfecha_venceFacturaProveedorServicio.setEnabled(false);
		jDateChooserfecha_venceFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceFacturaProveedorServicio.setDate(new Date());
		jDateChooserfecha_venceFacturaProveedorServicio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceFacturaProveedorServicio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonfecha_venceFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonfecha_venceFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabeldetalleFacturaProveedorServicio = new JLabelMe();
		this.jLabeldetalleFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_DETALLE+" :");
		this.jLabeldetalleFacturaProveedorServicio.setToolTipText("Detalle");
		this.jLabeldetalleFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldetalleFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldetalleFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldetalleFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldetalleFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_DETALLE);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPaneldetalleFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextAreadetalleFacturaProveedorServicio= new JTextAreaMe();
		jTextAreadetalleFacturaProveedorServicio.setEnabled(false);
		jTextAreadetalleFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadetalleFacturaProveedorServicio.setLineWrap(true);
		jTextAreadetalleFacturaProveedorServicio.setWrapStyleWord(true);
		jTextAreadetalleFacturaProveedorServicio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadetalleFacturaProveedorServicio.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadetalleFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedetalleFacturaProveedorServicio = new JScrollPane(jTextAreadetalleFacturaProveedorServicio);
		jscrollPanedetalleFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanedetalleFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));
		jscrollPanedetalleFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),70));

		this.jButtondetalleFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtondetalleFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondetalleFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondetalleFacturaProveedorServicioBusqueda.setText("U");
		this.jButtondetalleFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondetalleFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondetalleFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadetalleFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadetalleFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"detalleFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondetalleFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_retencionFacturaProveedorServicio = new JLabelMe();
		this.jLabelnumero_retencionFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_NUMERORETENCION+" :");
		this.jLabelnumero_retencionFacturaProveedorServicio.setToolTipText("No Retencion");
		this.jLabelnumero_retencionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_retencionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_retencionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_retencionFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_retencionFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_NUMERORETENCION);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelnumero_retencionFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldnumero_retencionFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldnumero_retencionFacturaProveedorServicio.setEnabled(false);
		jTextFieldnumero_retencionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_retencionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_retencionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_retencionFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonnumero_retencionFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_retencionFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_retencionFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonnumero_retencionFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_retencionFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_retencionFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_retencionFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_retencionFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_retencionFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_retencionFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorizacionFacturaProveedorServicio = new JLabelMe();
		this.jLabelnumero_autorizacionFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROAUTORIZACION+" :");
		this.jLabelnumero_autorizacionFacturaProveedorServicio.setToolTipText("No Autorizacion");
		this.jLabelnumero_autorizacionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorizacionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorizacionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorizacionFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorizacionFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROAUTORIZACION);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelnumero_autorizacionFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldnumero_autorizacionFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldnumero_autorizacionFacturaProveedorServicio.setEnabled(false);
		jTextFieldnumero_autorizacionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorizacionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorizacionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorizacionFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonnumero_autorizacionFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorizacionFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorizacionFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonnumero_autorizacionFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorizacionFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorizacionFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorizacionFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorizacionFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorizacionFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorizacionFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_serieFacturaProveedorServicio = new JLabelMe();
		this.jLabelnumero_serieFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROSERIE+" :");
		this.jLabelnumero_serieFacturaProveedorServicio.setToolTipText("No Serie");
		this.jLabelnumero_serieFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_serieFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_serieFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_serieFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_serieFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROSERIE);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelnumero_serieFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldnumero_serieFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldnumero_serieFacturaProveedorServicio.setEnabled(false);
		jTextFieldnumero_serieFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_serieFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_serieFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_serieFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonnumero_serieFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_serieFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_serieFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonnumero_serieFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_serieFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_serieFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_serieFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_serieFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_serieFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_serieFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_validezFacturaProveedorServicio = new JLabelMe();
		this.jLabelfecha_validezFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_FECHAVALIDEZ+" : *");
		this.jLabelfecha_validezFacturaProveedorServicio.setToolTipText("F. Validez");
		this.jLabelfecha_validezFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_validezFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_validezFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_validezFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_validezFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_validezFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_FECHAVALIDEZ);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelfecha_validezFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		//jFormattedTextFieldfecha_validezFacturaProveedorServicio= new JFormattedTextFieldMe();

		jDateChooserfecha_validezFacturaProveedorServicio= new JDateChooser();
		jDateChooserfecha_validezFacturaProveedorServicio.setEnabled(false);
		jDateChooserfecha_validezFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_validezFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_validezFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_validezFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_validezFacturaProveedorServicio.setDate(new Date());
		jDateChooserfecha_validezFacturaProveedorServicio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_validezFacturaProveedorServicio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_validezFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonfecha_validezFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_validezFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_validezFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_validezFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonfecha_validezFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_validezFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_validezFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_validezFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_validezFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_validezFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_validezFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelanexo_factura_inicioFacturaProveedorServicio = new JLabelMe();
		this.jLabelanexo_factura_inicioFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_ANEXOFACTURAINICIO+" :");
		this.jLabelanexo_factura_inicioFacturaProveedorServicio.setToolTipText("Fac Ini");
		this.jLabelanexo_factura_inicioFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_factura_inicioFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_factura_inicioFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanexo_factura_inicioFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanexo_factura_inicioFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanexo_factura_inicioFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_ANEXOFACTURAINICIO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelanexo_factura_inicioFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldanexo_factura_inicioFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldanexo_factura_inicioFacturaProveedorServicio.setEnabled(false);
		jTextFieldanexo_factura_inicioFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_factura_inicioFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_factura_inicioFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanexo_factura_inicioFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanexo_factura_inicioFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanexo_factura_inicioFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anexo_factura_inicioFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelanexo_factura_finFacturaProveedorServicio = new JLabelMe();
		this.jLabelanexo_factura_finFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_ANEXOFACTURAFIN+" :");
		this.jLabelanexo_factura_finFacturaProveedorServicio.setToolTipText("Fac Fin");
		this.jLabelanexo_factura_finFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_factura_finFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelanexo_factura_finFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelanexo_factura_finFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanexo_factura_finFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanexo_factura_finFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_ANEXOFACTURAFIN);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelanexo_factura_finFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldanexo_factura_finFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldanexo_factura_finFacturaProveedorServicio.setEnabled(false);
		jTextFieldanexo_factura_finFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_factura_finFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_factura_finFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanexo_factura_finFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonanexo_factura_finFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonanexo_factura_finFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_factura_finFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_factura_finFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanexo_factura_finFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonanexo_factura_finFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanexo_factura_finFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanexo_factura_finFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanexo_factura_finFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanexo_factura_finFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anexo_factura_finFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanexo_factura_finFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelvalor_servicios0FacturaProveedorServicio = new JLabelMe();
		this.jLabelvalor_servicios0FacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_VALORSERVICIOS0+" : *");
		this.jLabelvalor_servicios0FacturaProveedorServicio.setToolTipText("Valor Servicios0");
		this.jLabelvalor_servicios0FacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_servicios0FacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_servicios0FacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,20),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_servicios0FacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_servicios0FacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_servicios0FacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_VALORSERVICIOS0);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelvalor_servicios0FacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldvalor_servicios0FacturaProveedorServicio= new JTextFieldMe();
		jTextFieldvalor_servicios0FacturaProveedorServicio.setEnabled(false);
		jTextFieldvalor_servicios0FacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicios0FacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_servicios0FacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_servicios0FacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_servicios0FacturaProveedorServicio.setText("0.0");

		this.jButtonvalor_servicios0FacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonvalor_servicios0FacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicios0FacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_servicios0FacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_servicios0FacturaProveedorServicioBusqueda.setText("U");
		this.jButtonvalor_servicios0FacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_servicios0FacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_servicios0FacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_servicios0FacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_servicios0FacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_servicios0FacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_servicios0FacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabeltotal_ivaFacturaProveedorServicio = new JLabelMe();
		this.jLabeltotal_ivaFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_TOTALIVA+" : *");
		this.jLabeltotal_ivaFacturaProveedorServicio.setToolTipText("Total Iva");
		this.jLabeltotal_ivaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_ivaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_ivaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_ivaFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_ivaFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_TOTALIVA);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPaneltotal_ivaFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldtotal_ivaFacturaProveedorServicio= new JTextFieldMe();
		jTextFieldtotal_ivaFacturaProveedorServicio.setEnabled(false);
		jTextFieldtotal_ivaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_ivaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_ivaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_ivaFacturaProveedorServicio.setText("0.0");

		this.jButtontotal_ivaFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtontotal_ivaFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_ivaFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_ivaFacturaProveedorServicioBusqueda.setText("U");
		this.jButtontotal_ivaFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_ivaFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_ivaFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_ivaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_ivaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_ivaFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_ivaFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabeliva_porcentajeFacturaProveedorServicio = new JLabelMe();
		this.jLabeliva_porcentajeFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IVAPORCENTAJE+" : *");
		this.jLabeliva_porcentajeFacturaProveedorServicio.setToolTipText("Iva Porcentaje");
		this.jLabeliva_porcentajeFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_porcentajeFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliva_porcentajeFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliva_porcentajeFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliva_porcentajeFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliva_porcentajeFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IVAPORCENTAJE);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPaneliva_porcentajeFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldiva_porcentajeFacturaProveedorServicio= new JTextFieldMe();
		jTextFieldiva_porcentajeFacturaProveedorServicio.setEnabled(false);
		jTextFieldiva_porcentajeFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_porcentajeFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiva_porcentajeFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiva_porcentajeFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiva_porcentajeFacturaProveedorServicio.setText("0.0");

		this.jButtoniva_porcentajeFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtoniva_porcentajeFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_porcentajeFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniva_porcentajeFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniva_porcentajeFacturaProveedorServicioBusqueda.setText("U");
		this.jButtoniva_porcentajeFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniva_porcentajeFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniva_porcentajeFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiva_porcentajeFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiva_porcentajeFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iva_porcentajeFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniva_porcentajeFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabeltotalFacturaProveedorServicio = new JLabelMe();
		this.jLabeltotalFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalFacturaProveedorServicio.setToolTipText("Total");
		this.jLabeltotalFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,20),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPaneltotalFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldtotalFacturaProveedorServicio= new JTextFieldMe();
		jTextFieldtotalFacturaProveedorServicio.setEnabled(false);
		jTextFieldtotalFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalFacturaProveedorServicio.setText("0.0");

		this.jButtontotalFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtontotalFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalFacturaProveedorServicioBusqueda.setText("U");
		this.jButtontotalFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_mayorFacturaProveedorServicio = new JLabelMe();
		this.jLabelnumero_mayorFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROMAYOR+" :");
		this.jLabelnumero_mayorFacturaProveedorServicio.setToolTipText("Numero Mayor");
		this.jLabelnumero_mayorFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_mayorFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_mayorFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_mayorFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_mayorFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_NUMEROMAYOR);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelnumero_mayorFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldnumero_mayorFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldnumero_mayorFacturaProveedorServicio.setEnabled(false);
		jTextFieldnumero_mayorFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mayorFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_mayorFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_mayorFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_mayorFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonnumero_mayorFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_mayorFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_mayorFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonnumero_mayorFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_mayorFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_mayorFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_mayorFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_mayorFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_mayorFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_mayorFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_asientoFacturaProveedorServicio = new JLabelMe();
		this.jLabelcodigo_asientoFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_CODIGOASIENTO+" :");
		this.jLabelcodigo_asientoFacturaProveedorServicio.setToolTipText("Codigo Asiento");
		this.jLabelcodigo_asientoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_asientoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_asientoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_asientoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_asientoFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_asientoFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_CODIGOASIENTO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelcodigo_asientoFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldcodigo_asientoFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldcodigo_asientoFacturaProveedorServicio.setEnabled(false);
		jTextFieldcodigo_asientoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asientoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_asientoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_asientoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_asientoFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtoncodigo_asientoFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asientoFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_asientoFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_asientoFacturaProveedorServicioBusqueda.setText("U");
		this.jButtoncodigo_asientoFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_asientoFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_asientoFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_asientoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_asientoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_asientoFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_asientoFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelanexo_numero_autorizacionFacturaProveedorServicio = new JLabelMe();
		this.jLabelanexo_numero_autorizacionFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_ANEXONUMEROAUTORIZACION+" : *");
		this.jLabelanexo_numero_autorizacionFacturaProveedorServicio.setToolTipText("Anexo Numero Autorizacion");
		this.jLabelanexo_numero_autorizacionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,15),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelanexo_numero_autorizacionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,15),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelanexo_numero_autorizacionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,15),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelanexo_numero_autorizacionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanexo_numero_autorizacionFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanexo_numero_autorizacionFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_ANEXONUMEROAUTORIZACION);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelanexo_numero_autorizacionFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldanexo_numero_autorizacionFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldanexo_numero_autorizacionFacturaProveedorServicio.setEnabled(false);
		jTextFieldanexo_numero_autorizacionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_numero_autorizacionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_numero_autorizacionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanexo_numero_autorizacionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanexo_numero_autorizacionFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanexo_numero_autorizacionFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anexo_numero_autorizacionFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelanexo_numeso_serieFacturaProveedorServicio = new JLabelMe();
		this.jLabelanexo_numeso_serieFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_ANEXONUMESOSERIE+" : *");
		this.jLabelanexo_numeso_serieFacturaProveedorServicio.setToolTipText("Anexo Numeso Serie");
		this.jLabelanexo_numeso_serieFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelanexo_numeso_serieFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelanexo_numeso_serieFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelanexo_numeso_serieFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanexo_numeso_serieFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanexo_numeso_serieFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_ANEXONUMESOSERIE);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelanexo_numeso_serieFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextFieldanexo_numeso_serieFacturaProveedorServicio= new JTextFieldMe();

		jTextFieldanexo_numeso_serieFacturaProveedorServicio.setEnabled(false);
		jTextFieldanexo_numeso_serieFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_numeso_serieFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldanexo_numeso_serieFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldanexo_numeso_serieFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldanexo_numeso_serieFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldanexo_numeso_serieFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anexo_numeso_serieFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabelanexo_fecha_validezFacturaProveedorServicio = new JLabelMe();
		this.jLabelanexo_fecha_validezFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_ANEXOFECHAVALIDEZ+" : *");
		this.jLabelanexo_fecha_validezFacturaProveedorServicio.setToolTipText("Anexo Fecha Validez");
		this.jLabelanexo_fecha_validezFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelanexo_fecha_validezFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelanexo_fecha_validezFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelanexo_fecha_validezFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelanexo_fecha_validezFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelanexo_fecha_validezFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_ANEXOFECHAVALIDEZ);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelanexo_fecha_validezFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		//jFormattedTextFieldanexo_fecha_validezFacturaProveedorServicio= new JFormattedTextFieldMe();

		jDateChooseranexo_fecha_validezFacturaProveedorServicio= new JDateChooser();
		jDateChooseranexo_fecha_validezFacturaProveedorServicio.setEnabled(false);
		jDateChooseranexo_fecha_validezFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooseranexo_fecha_validezFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooseranexo_fecha_validezFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooseranexo_fecha_validezFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooseranexo_fecha_validezFacturaProveedorServicio.setDate(new Date());
		jDateChooseranexo_fecha_validezFacturaProveedorServicio.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldanexo_fecha_validezFacturaProveedorServicio.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooseranexo_fecha_validezFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooseranexo_fecha_validezFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"anexo_fecha_validezFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionFacturaProveedorServicio = new JLabelMe();
		this.jLabeldescripcionFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionFacturaProveedorServicio.setToolTipText("Descripcion");
		this.jLabeldescripcionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPaneldescripcionFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jTextAreadescripcionFacturaProveedorServicio= new JTextAreaMe();
		jTextAreadescripcionFacturaProveedorServicio.setEnabled(false);
		jTextAreadescripcionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionFacturaProveedorServicio.setLineWrap(true);
		jTextAreadescripcionFacturaProveedorServicio.setWrapStyleWord(true);
		jTextAreadescripcionFacturaProveedorServicio.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionFacturaProveedorServicio.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionFacturaProveedorServicio = new JScrollPane(jTextAreadescripcionFacturaProveedorServicio);
		jscrollPanedescripcionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtondescripcionFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionFacturaProveedorServicioBusqueda.setText("U");
		this.jButtondescripcionFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionFacturaProveedorServicioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysFacturaProveedorServicio() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_empresaFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaFacturaProveedorServicio.setToolTipText("Empresa");
		this.jLabelid_empresaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_empresaFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_empresaFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_empresaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_empresaFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_empresaFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_empresaFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaProveedorServicio"));

		this.jButtonid_empresaFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_empresaFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_empresaFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_empresaFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_empresaFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_empresaFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaFacturaProveedorServicioUpdate"));



					
		this.jLabelid_sucursalFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_sucursalFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalFacturaProveedorServicio.setToolTipText("Sucursal");
		this.jLabelid_sucursalFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_sucursalFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_sucursalFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_sucursalFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_sucursalFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_sucursalFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_sucursalFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaProveedorServicio"));

		this.jButtonid_sucursalFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_sucursalFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_sucursalFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_sucursalFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_sucursalFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalFacturaProveedorServicioUpdate"));



					
		this.jLabelid_ejercicioFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_ejercicioFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioFacturaProveedorServicio.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_ejercicioFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_ejercicioFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_ejercicioFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_ejercicioFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_ejercicioFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_ejercicioFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFacturaProveedorServicio"));

		this.jButtonid_ejercicioFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_ejercicioFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_ejercicioFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_ejercicioFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_ejercicioFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioFacturaProveedorServicioUpdate"));



					
		this.jLabelid_periodoFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_periodoFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoFacturaProveedorServicio.setToolTipText("Periodo");
		this.jLabelid_periodoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_periodoFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_periodoFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_periodoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_periodoFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_periodoFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_periodoFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFacturaProveedorServicio"));

		this.jButtonid_periodoFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_periodoFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_periodoFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_periodoFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_periodoFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_periodoFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoFacturaProveedorServicioUpdate"));



					
		this.jLabelid_anioFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_anioFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDANIO+" :");
		this.jLabelid_anioFacturaProveedorServicio.setToolTipText("Anio");
		this.jLabelid_anioFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_anioFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_anioFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_anioFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_anioFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_anioFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_anioFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFacturaProveedorServicio"));

		this.jButtonid_anioFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_anioFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_anioFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_anioFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_anioFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_anioFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioFacturaProveedorServicioUpdate"));



					
		this.jLabelid_mesFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_mesFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesFacturaProveedorServicio.setToolTipText("Mes");
		this.jLabelid_mesFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_mesFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_mesFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_mesFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_mesFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_mesFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_mesFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFacturaProveedorServicio"));

		this.jButtonid_mesFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_mesFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_mesFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_mesFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_mesFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_mesFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesFacturaProveedorServicioUpdate"));



					
		this.jLabelid_moduloFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_moduloFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloFacturaProveedorServicio.setToolTipText("Modulo");
		this.jLabelid_moduloFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_moduloFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_moduloFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_moduloFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_moduloFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_moduloFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_moduloFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFacturaProveedorServicio"));

		this.jButtonid_moduloFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_moduloFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_moduloFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_moduloFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_moduloFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_moduloFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloFacturaProveedorServicioUpdate"));



					
		this.jLabelid_transaccionFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_transaccionFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionFacturaProveedorServicio.setToolTipText("Comprobante");
		this.jLabelid_transaccionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_transaccionFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_transaccionFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_transaccionFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_transaccionFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_transaccionFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFacturaProveedorServicio"));

		this.jButtonid_transaccionFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_transaccionFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_transaccionFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_transaccionFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_transaccionFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_transaccionFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionFacturaProveedorServicioUpdate"));



					
		this.jLabelid_facturaFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_facturaFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDFACTURA+" :");
		this.jLabelid_facturaFacturaProveedorServicio.setToolTipText("Factura");
		this.jLabelid_facturaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_facturaFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_facturaFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_facturaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_facturaFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_facturaFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaFacturaProveedorServicio"));

		this.jButtonid_facturaFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_facturaFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_facturaFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_facturaFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_facturaFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_facturaFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaFacturaProveedorServicioUpdate"));



					
		this.jLabelid_clienteFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_clienteFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteFacturaProveedorServicio.setToolTipText("Proveedor");
		this.jLabelid_clienteFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_clienteFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_clienteFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_clienteFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_clienteFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_clienteFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaProveedorServicio"));

		this.jButtonid_clienteFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_clienteFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_clienteFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_clienteFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_clienteFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_clienteFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteFacturaProveedorServicioUpdate"));



					
		this.jLabelid_tipo_documentoFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_tipo_documentoFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPODOCUMENTO+" : *");
		this.jLabelid_tipo_documentoFacturaProveedorServicio.setToolTipText("T. Documento");
		this.jLabelid_tipo_documentoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_documentoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documentoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documentoFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documentoFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPODOCUMENTO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_tipo_documentoFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_tipo_documentoFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_documentoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documentoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documentoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documentoFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_tipo_documentoFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documentoFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_tipo_documentoFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documentoFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documentoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoFacturaProveedorServicio"));

		this.jButtonid_tipo_documentoFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_tipo_documentoFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_tipo_documentoFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documentoFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documentoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documentoFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documentoFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_tipo_documentoFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documentoFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documentoFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_tipo_documentoFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documentoFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documentoFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documentoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documentoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documentoFacturaProveedorServicioUpdate"));



					
		this.jLabelid_empleado_solicitaFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_empleado_solicitaFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDEMPLEADOSOLICITA+" : *");
		this.jLabelid_empleado_solicitaFacturaProveedorServicio.setToolTipText("Empl. Solicita");
		this.jLabelid_empleado_solicitaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleado_solicitaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleado_solicitaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleado_solicitaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleado_solicitaFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleado_solicitaFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDEMPLEADOSOLICITA);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_empleado_solicitaFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_empleado_solicitaFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_empleado_solicitaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_solicitaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleado_solicitaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleado_solicitaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleado_solicitaFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_empleado_solicitaFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_solicitaFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_solicitaFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleado_solicitaFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_empleado_solicitaFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleado_solicitaFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_solicitaFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleado_solicitaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_solicitaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_solicitaFacturaProveedorServicio"));

		this.jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleado_solicitaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_solicitaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_solicitaFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_empleado_solicitaFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_empleado_solicitaFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_solicitaFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleado_solicitaFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleado_solicitaFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_empleado_solicitaFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleado_solicitaFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleado_solicitaFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleado_solicitaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleado_solicitaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleado_solicitaFacturaProveedorServicioUpdate"));



					
		this.jLabelid_empleadoFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_empleadoFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoFacturaProveedorServicio.setToolTipText("Empl. Autoriza");
		this.jLabelid_empleadoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_empleadoFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_empleadoFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_empleadoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_empleadoFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_empleadoFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFacturaProveedorServicio"));

		this.jButtonid_empleadoFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_empleadoFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_empleadoFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_empleadoFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_empleadoFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_empleadoFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoFacturaProveedorServicioUpdate"));



					
		this.jLabelid_tipo_tributarioFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_tipo_tributarioFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPOTRIBUTARIO+" :");
		this.jLabelid_tipo_tributarioFacturaProveedorServicio.setToolTipText("T. Tributario");
		this.jLabelid_tipo_tributarioFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_tributarioFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_tributarioFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_tributarioFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_tributarioFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_tributarioFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPOTRIBUTARIO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_tipo_tributarioFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_tipo_tributarioFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_tributarioFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_tributarioFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_tributarioFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_tributarioFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_tipo_tributarioFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_tributarioFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_tipo_tributarioFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_tributarioFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_tributarioFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioFacturaProveedorServicio"));

		this.jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_tributarioFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_tributarioFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_tipo_tributarioFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_tributarioFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_tributarioFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_tipo_tributarioFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_tributarioFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_tributarioFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_tributarioFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_tributarioFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_tributarioFacturaProveedorServicioUpdate"));



					
		this.jLabelid_monedaFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_monedaFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaFacturaProveedorServicio.setToolTipText("Moneda");
		this.jLabelid_monedaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_monedaFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_monedaFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_monedaFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_monedaFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_monedaFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaFacturaProveedorServicio"));

		this.jButtonid_monedaFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_monedaFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_monedaFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_monedaFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_monedaFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_monedaFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaFacturaProveedorServicioUpdate"));



					
		this.jLabelid_tipo_retencion_fuente1FacturaProveedorServicio = new JLabelMe();
		this.jLabelid_tipo_retencion_fuente1FacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPORETENCIONFUENTE1+" : *");
		this.jLabelid_tipo_retencion_fuente1FacturaProveedorServicio.setToolTipText("Tipo Retencion Fuente1");
		this.jLabelid_tipo_retencion_fuente1FacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_fuente1FacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_retencion_fuente1FacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_fuente1FacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_fuente1FacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_fuente1FacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPORETENCIONFUENTE1);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_tipo_retencion_fuente1FacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio.setEnabled(false);

		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicio= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicio.setText("Buscar");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente1FacturaProveedorServicio"));

		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente1FacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_fuente1FacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_fuente1FacturaProveedorServicioUpdate"));



					
		this.jLabelid_tipo_retencion_iva1FacturaProveedorServicio = new JLabelMe();
		this.jLabelid_tipo_retencion_iva1FacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPORETENCIONIVA1+" : *");
		this.jLabelid_tipo_retencion_iva1FacturaProveedorServicio.setToolTipText("Tipo Retencion Iva1");
		this.jLabelid_tipo_retencion_iva1FacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_iva1FacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_retencion_iva1FacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,40),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_retencion_iva1FacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_retencion_iva1FacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_retencion_iva1FacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPORETENCIONIVA1);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_tipo_retencion_iva1FacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio.setEnabled(false);

		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicio= new JButtonMe();
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicio.setText("Buscar");
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva1FacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva1FacturaProveedorServicio"));

		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva1FacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_retencion_iva1FacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_retencion_iva1FacturaProveedorServicioUpdate"));



					
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCALSERVICIOS+" : *");
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setToolTipText("Idcuenta Contable Credito Fiscal Servicios");
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,100),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDCUENTACONTABLECREDITOFISCALSERVICIOS);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,70),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio"));

		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate"));


		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioArbol= new JButtonMe();
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioArbol.setText("Arbol");
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioArbol"));



					
		this.jLabelid_tipo_movimientoFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_tipo_movimientoFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO+" : *");
		this.jLabelid_tipo_movimientoFacturaProveedorServicio.setToolTipText("Tipo Movimiento");
		this.jLabelid_tipo_movimientoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_movimientoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimientoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimientoFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimientoFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPOMOVIMIENTO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_tipo_movimientoFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_tipo_movimientoFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_movimientoFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimientoFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimientoFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimientoFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_tipo_movimientoFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_tipo_movimientoFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimientoFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_tipo_movimientoFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimientoFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimientoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoFacturaProveedorServicio"));

		this.jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimientoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimientoFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_tipo_movimientoFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimientoFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimientoFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_tipo_movimientoFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimientoFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimientoFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimientoFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimientoFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimientoFacturaProveedorServicioUpdate"));



					
		this.jLabelid_tipo_movimiento_moduloFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_tipo_movimiento_moduloFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO+" : *");
		this.jLabelid_tipo_movimiento_moduloFacturaProveedorServicio.setToolTipText("Tipo Movimiento Modulo");
		this.jLabelid_tipo_movimiento_moduloFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_movimiento_moduloFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_movimiento_moduloFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_movimiento_moduloFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_movimiento_moduloFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPOMOVIMIENTOMODULO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_tipo_movimiento_moduloFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloFacturaProveedorServicio"));

		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_movimiento_moduloFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_movimiento_moduloFacturaProveedorServicioUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloFacturaProveedorServicio = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloFacturaProveedorServicio.setText(""+FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloFacturaProveedorServicio.setToolTipText("Tipo Comprobante");
		this.jLabelid_tipo_transaccion_moduloFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_transaccion_moduloFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_transaccion_moduloFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloFacturaProveedorServicio=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloFacturaProveedorServicio.setToolTipText(FacturaProveedorServicioConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloFacturaProveedorServicio.setLayout(this.gridaBagLayoutFacturaProveedorServicio);


		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicio= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicio.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicio.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicio.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicio.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicio.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicio.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicio,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFacturaProveedorServicio"));

		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFacturaProveedorServicioBusqueda"));

		if(this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloFacturaProveedorServicioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloFacturaProveedorServicioUpdate"));



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
		//this.jInternalFrameDetalleFacturaProveedorServicio = new FacturaProveedorServicioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Factura Proveedor DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutFacturaProveedorServicio= new GridBagLayout();
		

		
		String sToolTipFacturaProveedorServicio="";
		sToolTipFacturaProveedorServicio=FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipFacturaProveedorServicio+="(Contabilidad.FacturaProveedorServicio)";
		}
		
		if(!this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {
			sToolTipFacturaProveedorServicio+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoFacturaProveedorServicio = new JButtonMe();
		this.jButtonModificarFacturaProveedorServicio = new JButtonMe();
        this.jButtonActualizarFacturaProveedorServicio = new JButtonMe();
        this.jButtonEliminarFacturaProveedorServicio = new JButtonMe();
        this.jButtonCancelarFacturaProveedorServicio = new JButtonMe();
        this.jButtonGuardarCambiosFacturaProveedorServicio = new JButtonMe();
		this.jButtonGuardarCambiosTablaFacturaProveedorServicio = new JButtonMe();
		this.jButtonCerrarFacturaProveedorServicio = new JButtonMe();
		
		this.jScrollPanelDatosFacturaProveedorServicio = new JScrollPane();   
        this.jScrollPanelDatosEdicionFacturaProveedorServicio = new JScrollPane();
		this.jScrollPanelDatosGeneralFacturaProveedorServicio = new JScrollPane();
				
		
		
		this.jPanelCamposFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Factura Proveedor";
		
		if(!this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Factura Proveedors" + this.sPath));
		} else {
			this.jScrollPanelDatosFacturaProveedorServicio.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposFacturaProveedorServicio.setName("jPanelCamposFacturaProveedorServicio"); 

		this.jPanelCamposOcultosFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosFacturaProveedorServicio.setName("jPanelCamposOcultosFacturaProveedorServicio"); 

        this.jPanelAccionesFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesFacturaProveedorServicio.setToolTipText("Acciones");
        this.jPanelAccionesFacturaProveedorServicio.setName("Acciones"); 

		this.jPanelAccionesFormularioFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioFacturaProveedorServicio.setToolTipText("Acciones");
        this.jPanelAccionesFormularioFacturaProveedorServicio.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralFacturaProveedorServicio.setName("jPanelCamposFingeneralFacturaProveedorServicio");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Retencion"));
		this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio.setName("jPanelCamposFindatos_retencionFacturaProveedorServicio");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Anexos Iva"));
		this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.setName("jPanelCamposFinanexos_ivaFacturaProveedorServicio");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoFacturaProveedorServicio.setText("Nuevo");
		this.jButtonModificarFacturaProveedorServicio.setText("Editar");
        this.jButtonActualizarFacturaProveedorServicio.setText("Actualizar");
        this.jButtonEliminarFacturaProveedorServicio.setText("Eliminar");
        this.jButtonCancelarFacturaProveedorServicio.setText("Cancelar");
        this.jButtonGuardarCambiosFacturaProveedorServicio.setText("Guardar");
		this.jButtonGuardarCambiosTablaFacturaProveedorServicio.setText("Guardar");
		this.jButtonCerrarFacturaProveedorServicio.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoFacturaProveedorServicio,"nuevo_button","Nuevo",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarFacturaProveedorServicio,"modificar_button","Editar",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarFacturaProveedorServicio,"actualizar_button","Actualizar",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarFacturaProveedorServicio,"eliminar_button","Eliminar",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarFacturaProveedorServicio,"cancelar_button","Cancelar",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosFacturaProveedorServicio,"guardarcambios_button","Guardar",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaFacturaProveedorServicio,"guardarcambiostabla_button","Guardar",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarFacturaProveedorServicio,"cerrar_button","Salir",this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoFacturaProveedorServicio.setToolTipText("Nuevo"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarFacturaProveedorServicio.setToolTipText("Editar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarFacturaProveedorServicio.setToolTipText("Actualizar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarFacturaProveedorServicio.setToolTipText("Eliminar)"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarFacturaProveedorServicio.setToolTipText("Cancelar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosFacturaProveedorServicio.setToolTipText("Guardar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaFacturaProveedorServicio.setToolTipText("Guardar"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarFacturaProveedorServicio.setToolTipText("Salir"+" "+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoFacturaProveedorServicio";
		inputMap = this.jButtonNuevoFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoFacturaProveedorServicio.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoFacturaProveedorServicio"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarFacturaProveedorServicio";
		inputMap = this.jButtonActualizarFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarFacturaProveedorServicio"));
		
		//ELIMINAR
		sMapKey = "EliminarFacturaProveedorServicio";
		inputMap = this.jButtonEliminarFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarFacturaProveedorServicio"));
		
		//CANCELAR	
		sMapKey = "CancelarFacturaProveedorServicio";
		inputMap = this.jButtonCancelarFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarFacturaProveedorServicio"));
		
		//CERRAR		
		sMapKey = "CerrarFacturaProveedorServicio";
		inputMap = this.jButtonCerrarFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarFacturaProveedorServicio"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaFacturaProveedorServicio";
		inputMap = this.jButtonGuardarCambiosTablaFacturaProveedorServicio.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaFacturaProveedorServicio.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaFacturaProveedorServicio"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoFacturaProveedorServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoFacturaProveedorServicio.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoFacturaProveedorServicio.setToolTipText("Nuevo FacturaProveedorServicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarFacturaProveedorServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarFacturaProveedorServicio.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarFacturaProveedorServicio.setToolTipText("Sin Cerrar Ventana FacturaProveedorServicio");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeFacturaProveedorServicio = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeFacturaProveedorServicio.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeFacturaProveedorServicio.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFacturaProveedorServicio.setText("Accion");
		this.jComboBoxTiposAccionesFacturaProveedorServicio.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioFacturaProveedorServicio = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioFacturaProveedorServicio.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioFacturaProveedorServicio.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesFacturaProveedorServicio = new JLabelMe();
		
		this.jLabelAccionesFacturaProveedorServicio.setText("Acciones");		
		this.jLabelAccionesFacturaProveedorServicio.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaProveedorServicio.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesFacturaProveedorServicio.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposFacturaProveedorServicio();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysFacturaProveedorServicio();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesFacturaProveedorServicio=new JTabbedPane();
		this.jTabbedPaneRelacionesFacturaProveedorServicio.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesFacturaProveedorServicio,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesFacturaProveedorServicio.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaProveedorServicio.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesFacturaProveedorServicio.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioFacturaProveedorServicio.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaProveedorServicio.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioFacturaProveedorServicio.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioFacturaProveedorServicio, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposFacturaProveedorServicio = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosFacturaProveedorServicio = new GridBagLayout();
		
		this.jPanelCamposFacturaProveedorServicio.setLayout(gridaBagLayoutCamposFacturaProveedorServicio);
		this.jPanelCamposOcultosFacturaProveedorServicio.setLayout(gridaBagLayoutCamposOcultosFacturaProveedorServicio);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralFacturaProveedorServicio= new GridBagLayout();
		this.jPanelCamposIniciogeneralFacturaProveedorServicio.setLayout(gridaBagLayoutCamposIniciogeneralFacturaProveedorServicio);

		GridBagLayout gridaBagLayoutCamposIniciodatos_retencionFacturaProveedorServicio= new GridBagLayout();
		this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio.setLayout(gridaBagLayoutCamposIniciodatos_retencionFacturaProveedorServicio);

		GridBagLayout gridaBagLayoutCamposInicioanexos_ivaFacturaProveedorServicio= new GridBagLayout();
		this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.setLayout(gridaBagLayoutCamposInicioanexos_ivaFacturaProveedorServicio);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidFacturaProveedorServicio.add(jLabelIdFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidFacturaProveedorServicio.add(jLabelidFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaFacturaProveedorServicio.add(jLabelid_empresaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaProveedorServicio.add(jButtonid_empresaFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaFacturaProveedorServicio.add(jButtonid_empresaFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaFacturaProveedorServicio.add(jComboBoxid_empresaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalFacturaProveedorServicio.add(jLabelid_sucursalFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturaProveedorServicio.add(jButtonid_sucursalFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalFacturaProveedorServicio.add(jButtonid_sucursalFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalFacturaProveedorServicio.add(jComboBoxid_sucursalFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioFacturaProveedorServicio.add(jLabelid_ejercicioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFacturaProveedorServicio.add(jButtonid_ejercicioFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioFacturaProveedorServicio.add(jButtonid_ejercicioFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioFacturaProveedorServicio.add(jComboBoxid_ejercicioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoFacturaProveedorServicio.add(jLabelid_periodoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFacturaProveedorServicio.add(jButtonid_periodoFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoFacturaProveedorServicio.add(jButtonid_periodoFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoFacturaProveedorServicio.add(jComboBoxid_periodoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioFacturaProveedorServicio.add(jLabelid_anioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFacturaProveedorServicio.add(jButtonid_anioFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioFacturaProveedorServicio.add(jButtonid_anioFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioFacturaProveedorServicio.add(jComboBoxid_anioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesFacturaProveedorServicio.add(jLabelid_mesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFacturaProveedorServicio.add(jButtonid_mesFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesFacturaProveedorServicio.add(jButtonid_mesFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesFacturaProveedorServicio.add(jComboBoxid_mesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloFacturaProveedorServicio.add(jLabelid_moduloFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloFacturaProveedorServicio.add(jButtonid_moduloFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloFacturaProveedorServicio.add(jButtonid_moduloFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloFacturaProveedorServicio.add(jComboBoxid_moduloFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transaccionFacturaProveedorServicio.add(jLabelid_transaccionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionFacturaProveedorServicio.add(jButtonid_transaccionFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionFacturaProveedorServicio.add(jButtonid_transaccionFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transaccionFacturaProveedorServicio.add(jComboBoxid_transaccionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_facturaFacturaProveedorServicio.add(jLabelid_facturaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaFacturaProveedorServicio.add(jButtonid_facturaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaFacturaProveedorServicio.add(jButtonid_facturaFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 4;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaFacturaProveedorServicio.add(jButtonid_facturaFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_facturaFacturaProveedorServicio.add(jComboBoxid_facturaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_facturaFacturaProveedorServicio.add(jLabelnumero_facturaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaFacturaProveedorServicio.add(jButtonnumero_facturaFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_facturaFacturaProveedorServicio.add(jTextFieldnumero_facturaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteFacturaProveedorServicio.add(jLabelid_clienteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteFacturaProveedorServicio.add(jButtonid_clienteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturaProveedorServicio.add(jButtonid_clienteFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 4;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteFacturaProveedorServicio.add(jButtonid_clienteFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteFacturaProveedorServicio.add(jComboBoxid_clienteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelrucFacturaProveedorServicio.add(jLabelrucFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelrucFacturaProveedorServicio.add(jButtonrucFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelrucFacturaProveedorServicio.add(jTextFieldrucFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_documentoFacturaProveedorServicio.add(jLabelid_tipo_documentoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoFacturaProveedorServicio.add(jButtonid_tipo_documentoFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documentoFacturaProveedorServicio.add(jButtonid_tipo_documentoFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_documentoFacturaProveedorServicio.add(jComboBoxid_tipo_documentoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelplazoFacturaProveedorServicio.add(jLabelplazoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelplazoFacturaProveedorServicio.add(jButtonplazoFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelplazoFacturaProveedorServicio.add(jTextFieldplazoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcon_riseFacturaProveedorServicio.add(jLabelcon_riseFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcon_riseFacturaProveedorServicio.add(jButtoncon_riseFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcon_riseFacturaProveedorServicio.add(jCheckBoxcon_riseFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionFacturaProveedorServicio.add(jLabelfecha_emisionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionFacturaProveedorServicio.add(jButtonfecha_emisionFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionFacturaProveedorServicio.add(jDateChooserfecha_emisionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_venceFacturaProveedorServicio.add(jLabelfecha_venceFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceFacturaProveedorServicio.add(jButtonfecha_venceFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_venceFacturaProveedorServicio.add(jDateChooserfecha_venceFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleado_solicitaFacturaProveedorServicio.add(jLabelid_empleado_solicitaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleado_solicitaFacturaProveedorServicio.add(jButtonid_empleado_solicitaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_solicitaFacturaProveedorServicio.add(jButtonid_empleado_solicitaFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 4;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleado_solicitaFacturaProveedorServicio.add(jButtonid_empleado_solicitaFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleado_solicitaFacturaProveedorServicio.add(jComboBoxid_empleado_solicitaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleadoFacturaProveedorServicio.add(jLabelid_empleadoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoFacturaProveedorServicio.add(jButtonid_empleadoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoFacturaProveedorServicio.add(jButtonid_empleadoFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 4;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoFacturaProveedorServicio.add(jButtonid_empleadoFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleadoFacturaProveedorServicio.add(jComboBoxid_empleadoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldetalleFacturaProveedorServicio.add(jLabeldetalleFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPaneldetalleFacturaProveedorServicio.add(jButtondetalleFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldetalleFacturaProveedorServicio.add(jscrollPanedetalleFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_retencionFacturaProveedorServicio.add(jLabelnumero_retencionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_retencionFacturaProveedorServicio.add(jButtonnumero_retencionFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_retencionFacturaProveedorServicio.add(jTextFieldnumero_retencionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_autorizacionFacturaProveedorServicio.add(jLabelnumero_autorizacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorizacionFacturaProveedorServicio.add(jButtonnumero_autorizacionFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_autorizacionFacturaProveedorServicio.add(jTextFieldnumero_autorizacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_serieFacturaProveedorServicio.add(jLabelnumero_serieFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_serieFacturaProveedorServicio.add(jButtonnumero_serieFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_serieFacturaProveedorServicio.add(jTextFieldnumero_serieFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_tributarioFacturaProveedorServicio.add(jLabelid_tipo_tributarioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tributarioFacturaProveedorServicio.add(jButtonid_tipo_tributarioFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_tributarioFacturaProveedorServicio.add(jButtonid_tipo_tributarioFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_tributarioFacturaProveedorServicio.add(jComboBoxid_tipo_tributarioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_validezFacturaProveedorServicio.add(jLabelfecha_validezFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_validezFacturaProveedorServicio.add(jButtonfecha_validezFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_validezFacturaProveedorServicio.add(jDateChooserfecha_validezFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanexo_factura_inicioFacturaProveedorServicio.add(jLabelanexo_factura_inicioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelanexo_factura_inicioFacturaProveedorServicio.add(jButtonanexo_factura_inicioFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanexo_factura_inicioFacturaProveedorServicio.add(jTextFieldanexo_factura_inicioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanexo_factura_finFacturaProveedorServicio.add(jLabelanexo_factura_finFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelanexo_factura_finFacturaProveedorServicio.add(jButtonanexo_factura_finFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanexo_factura_finFacturaProveedorServicio.add(jTextFieldanexo_factura_finFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaFacturaProveedorServicio.add(jLabelid_monedaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaFacturaProveedorServicio.add(jButtonid_monedaFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaFacturaProveedorServicio.add(jButtonid_monedaFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaFacturaProveedorServicio.add(jComboBoxid_monedaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_servicios0FacturaProveedorServicio.add(jLabelvalor_servicios0FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_servicios0FacturaProveedorServicio.add(jButtonvalor_servicios0FacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_servicios0FacturaProveedorServicio.add(jTextFieldvalor_servicios0FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_ivaFacturaProveedorServicio.add(jLabeltotal_ivaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_ivaFacturaProveedorServicio.add(jButtontotal_ivaFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_ivaFacturaProveedorServicio.add(jTextFieldtotal_ivaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliva_porcentajeFacturaProveedorServicio.add(jLabeliva_porcentajeFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPaneliva_porcentajeFacturaProveedorServicio.add(jButtoniva_porcentajeFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliva_porcentajeFacturaProveedorServicio.add(jTextFieldiva_porcentajeFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalFacturaProveedorServicio.add(jLabeltotalFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalFacturaProveedorServicio.add(jButtontotalFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalFacturaProveedorServicio.add(jTextFieldtotalFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_mayorFacturaProveedorServicio.add(jLabelnumero_mayorFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_mayorFacturaProveedorServicio.add(jButtonnumero_mayorFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_mayorFacturaProveedorServicio.add(jTextFieldnumero_mayorFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcodigo_asientoFacturaProveedorServicio.add(jLabelcodigo_asientoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_asientoFacturaProveedorServicio.add(jButtoncodigo_asientoFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcodigo_asientoFacturaProveedorServicio.add(jTextFieldcodigo_asientoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencion_fuente1FacturaProveedorServicio.add(jLabelid_tipo_retencion_fuente1FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente1FacturaProveedorServicio.add(jButtonid_tipo_retencion_fuente1FacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_fuente1FacturaProveedorServicio.add(jButtonid_tipo_retencion_fuente1FacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencion_fuente1FacturaProveedorServicio.add(jComboBoxid_tipo_retencion_fuente1FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_retencion_iva1FacturaProveedorServicio.add(jLabelid_tipo_retencion_iva1FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva1FacturaProveedorServicio.add(jButtonid_tipo_retencion_iva1FacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_retencion_iva1FacturaProveedorServicio.add(jButtonid_tipo_retencion_iva1FacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_retencion_iva1FacturaProveedorServicio.add(jComboBoxid_tipo_retencion_iva1FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanexo_numero_autorizacionFacturaProveedorServicio.add(jLabelanexo_numero_autorizacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelanexo_numero_autorizacionFacturaProveedorServicio.add(jButtonanexo_numero_autorizacionFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanexo_numero_autorizacionFacturaProveedorServicio.add(jTextFieldanexo_numero_autorizacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanexo_numeso_serieFacturaProveedorServicio.add(jLabelanexo_numeso_serieFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelanexo_numeso_serieFacturaProveedorServicio.add(jButtonanexo_numeso_serieFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanexo_numeso_serieFacturaProveedorServicio.add(jTextFieldanexo_numeso_serieFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelanexo_fecha_validezFacturaProveedorServicio.add(jLabelanexo_fecha_validezFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelanexo_fecha_validezFacturaProveedorServicio.add(jButtonanexo_fecha_validezFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelanexo_fecha_validezFacturaProveedorServicio.add(jDateChooseranexo_fecha_validezFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.add(jLabelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.add(jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.add(jButtonid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio.add(jComboBoxid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionFacturaProveedorServicio.add(jLabeldescripcionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionFacturaProveedorServicio.add(jButtondescripcionFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionFacturaProveedorServicio.add(jscrollPanedescripcionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_movimientoFacturaProveedorServicio.add(jLabelid_tipo_movimientoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoFacturaProveedorServicio.add(jButtonid_tipo_movimientoFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimientoFacturaProveedorServicio.add(jButtonid_tipo_movimientoFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_movimientoFacturaProveedorServicio.add(jComboBoxid_tipo_movimientoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_movimiento_moduloFacturaProveedorServicio.add(jLabelid_tipo_movimiento_moduloFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloFacturaProveedorServicio.add(jButtonid_tipo_movimiento_moduloFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_movimiento_moduloFacturaProveedorServicio.add(jButtonid_tipo_movimiento_moduloFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_movimiento_moduloFacturaProveedorServicio.add(jComboBoxid_tipo_movimiento_moduloFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_transaccion_moduloFacturaProveedorServicio.add(jLabelid_tipo_transaccion_moduloFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 2;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloFacturaProveedorServicio.add(jButtonid_tipo_transaccion_moduloFacturaProveedorServicioBusqueda, this.gridBagConstraintsFacturaProveedorServicio);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		//this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 3;
		this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
		this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloFacturaProveedorServicio.add(jButtonid_tipo_transaccion_moduloFacturaProveedorServicioUpdate, this.gridBagConstraintsFacturaProveedorServicio);
	}

	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = 1;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_transaccion_moduloFacturaProveedorServicio.add(jComboBoxid_tipo_transaccion_moduloFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFacturaProveedorServicio.add(this.jPanelid_monedaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposFacturaProveedorServicio % 2==0) {
		iXPanelCamposFacturaProveedorServicio=0;
		iYPanelCamposFacturaProveedorServicio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_empresaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_sucursalFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_ejercicioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_periodoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_anioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_mesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_moduloFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelrucFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelvalor_servicios0FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPaneltotal_ivaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPaneliva_porcentajeFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPaneltotalFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelnumero_mayorFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelcodigo_asientoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_tipo_retencion_fuente1FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_tipo_retencion_iva1FacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelanexo_numero_autorizacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelanexo_numeso_serieFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelanexo_fecha_validezFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_cuenta_contable_credito_fiscal_serviciosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPaneldescripcionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_tipo_movimientoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_tipo_movimiento_moduloFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposOcultosFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposOcultosFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosFacturaProveedorServicio.add(this.jPanelid_tipo_transaccion_moduloFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposOcultosFacturaProveedorServicio % 2==0) {
		iXPanelCamposOcultosFacturaProveedorServicio=0;
		iYPanelCamposOcultosFacturaProveedorServicio++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelidFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelid_transaccionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelid_facturaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelnumero_facturaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelid_clienteFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelid_tipo_documentoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelplazoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelcon_riseFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelfecha_emisionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelfecha_venceFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelid_empleado_solicitaFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPanelid_empleadoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciogeneralFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciogeneralFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.gridBagConstraintsFacturaProveedorServicio.gridwidth = 2;

	this.jPanelCamposIniciogeneralFacturaProveedorServicio.add(this.jPaneldetalleFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciogeneralFacturaProveedorServicio % 2==0) {
		iXPanelCamposIniciogeneralFacturaProveedorServicio=0;
		iYPanelCamposIniciogeneralFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposIniciodatos_retencionFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposIniciodatos_retencionFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciodatos_retencionFacturaProveedorServicio.add(this.jPanelnumero_retencionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposIniciodatos_retencionFacturaProveedorServicio % 3==0) {
		iXPanelCamposIniciodatos_retencionFacturaProveedorServicio=0;
		iYPanelCamposIniciodatos_retencionFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.add(this.jPanelnumero_autorizacionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedorServicio % 2==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedorServicio=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.add(this.jPanelnumero_serieFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedorServicio % 2==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedorServicio=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.add(this.jPanelid_tipo_tributarioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedorServicio % 2==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedorServicio=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.add(this.jPanelfecha_validezFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedorServicio % 2==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedorServicio=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.add(this.jPanelanexo_factura_inicioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedorServicio % 2==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedorServicio=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	}
	this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsFacturaProveedorServicio.gridy = iYPanelCamposInicioanexos_ivaFacturaProveedorServicio;
	this.gridBagConstraintsFacturaProveedorServicio.gridx = iXPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
	this.gridBagConstraintsFacturaProveedorServicio.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsFacturaProveedorServicio.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposInicioanexos_ivaFacturaProveedorServicio.add(this.jPanelanexo_factura_finFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);



	if(iXPanelCamposInicioanexos_ivaFacturaProveedorServicio % 2==0) {
		iXPanelCamposInicioanexos_ivaFacturaProveedorServicio=0;
		iYPanelCamposInicioanexos_ivaFacturaProveedorServicio++;
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
			
		GridBagLayout gridaBagLayoutAccionesFacturaProveedorServicio= new GridBagLayout();
		this.jPanelAccionesFacturaProveedorServicio.setLayout(gridaBagLayoutAccionesFacturaProveedorServicio);
		
		GridBagLayout gridaBagLayoutAccionesFormularioFacturaProveedorServicio= new GridBagLayout();
		this.jPanelAccionesFormularioFacturaProveedorServicio.setLayout(gridaBagLayoutAccionesFormularioFacturaProveedorServicio);
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaProveedorServicio.add(this.jComboBoxTiposAccionesFormularioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioFacturaProveedorServicio.add(this.jCheckBoxPostAccionNuevoFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.facturaproveedorservicioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFacturaProveedorServicio.add(this.jCheckBoxPostAccionSinCerrarFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.facturaproveedorservicioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioFacturaProveedorServicio.add(this.jCheckBoxPostAccionSinMensajeFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccion++;
			
		this.jPanelAccionesFacturaProveedorServicio.add(this.jButtonModificarFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);							

		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;
		this.gridBagConstraintsFacturaProveedorServicio.gridx =iPosXAccion++;
			
		this.jPanelAccionesFacturaProveedorServicio.add(this.jButtonEliminarFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
			
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaProveedorServicio.add(this.jButtonActualizarFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);


		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = iPosXAccion++;
		
		this.jPanelAccionesFacturaProveedorServicio.add(this.jButtonGuardarCambiosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);	
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = 0;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx =iPosXAccion++;
		
		this.jPanelAccionesFacturaProveedorServicio.add(this.jButtonCancelarFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutFacturaProveedorServicio = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutFacturaProveedorServicio);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.facturaproveedorservicioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();						
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;
			this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;		
			//this.gridBagConstraintsFacturaProveedorServicio.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsFacturaProveedorServicio.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridyPrincipal++;
		this.gridBagConstraintsFacturaProveedorServicio.gridx =0;
		this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsFacturaProveedorServicio.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(FacturaProveedorServicioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleFacturaProveedorServicio = new FacturaProveedorServicioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Factura Proveedor DATOS");
			
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
		    
			FacturaProveedorServicioModel facturaproveedorservicioModel=new FacturaProveedorServicioModel(this);
			
			//SI USARA CLASE INTERNA
			//FacturaProveedorServicioModel.FacturaProveedorServicioFocusTraversalPolicy facturaproveedorservicioFocusTraversalPolicy = facturaproveedorservicioModel.new FacturaProveedorServicioFocusTraversalPolicy(this);
			
			//facturaproveedorservicioFocusTraversalPolicy.setfacturaproveedorservicioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(facturaproveedorservicioModel);
			
			
			this.jContentPaneDetalleFacturaProveedorServicio = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleFacturaProveedorServicio = new GridBagLayout();	
			this.jContentPaneDetalleFacturaProveedorServicio.setLayout(gridaBagLayoutDetalleFacturaProveedorServicio);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosFacturaProveedorServicio = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
				this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
					
				
				this.jContentPaneDetalleFacturaProveedorServicio.add(jTtoolBarDetalleFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);								
				
}
			
			this.jScrollPanelDatosEdicionFacturaProveedorServicio=   new JScrollPane(jContentPaneDetalleFacturaProveedorServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralFacturaProveedorServicio=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;

		this.jContentPaneDetalleFacturaProveedorServicio.add(jPanelCamposIniciogeneralFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);


		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;

		this.jContentPaneDetalleFacturaProveedorServicio.add(jPanelCamposIniciodatos_retencionFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);


		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyRelaciones++;
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;

		this.jContentPaneDetalleFacturaProveedorServicio.add(jPanelCamposInicioanexos_ivaFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);
			
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
						&& facturaproveedorservicioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.facturaproveedorservicioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsFacturaProveedorServicio= new GridBagConstraints();
						this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyRelaciones++;
						this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
						this.jContentPaneDetalleFacturaProveedorServicio.add(this.jTabbedPaneRelacionesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesFacturaProveedorServicio.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosFacturaProveedorServicio.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
					this.gridBagConstraintsFacturaProveedorServicio.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
					
				
					this.jContentPaneDetalleFacturaProveedorServicio.add(jPanelCamposOcultosFacturaProveedorServicio, gridBagConstraintsFacturaProveedorServicio);
				
					this.jPanelCamposOcultosFacturaProveedorServicio.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	        this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleFacturaProveedorServicio.add(this.jPanelAccionesFormularioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);							
			
			
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
	        this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
	        
			
			this.jContentPaneDetalleFacturaProveedorServicio.add(this.jPanelAccionesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionFacturaProveedorServicio);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionFacturaProveedorServicio=   new JScrollPane(this.jPanelCamposFacturaProveedorServicio,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionFacturaProveedorServicio.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaProveedorServicio.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionFacturaProveedorServicio.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
			this.gridBagConstraintsFacturaProveedorServicio.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsFacturaProveedorServicio.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsFacturaProveedorServicio.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);			
			
			this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
			this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
			
			
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		
			
		this.gridBagConstraintsFacturaProveedorServicio = new GridBagConstraints();
		this.gridBagConstraintsFacturaProveedorServicio.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsFacturaProveedorServicio.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesFacturaProveedorServicio, this.gridBagConstraintsFacturaProveedorServicio);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralFacturaProveedorServicio;//jContentPane;
		
		return jScrollPanelDatosEdicionFacturaProveedorServicio;
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
