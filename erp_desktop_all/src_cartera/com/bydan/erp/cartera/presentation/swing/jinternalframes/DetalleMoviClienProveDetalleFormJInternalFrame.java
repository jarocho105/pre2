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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.cartera.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.DetalleMoviClienProveConstantesFunciones;

import com.bydan.erp.cartera.business.logic.*;
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
public class DetalleMoviClienProveDetalleFormJInternalFrame extends DetalleMoviClienProveBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleDetalleMoviClienProve;
	
	protected JMenuBar jmenuBarDetalleDetalleMoviClienProve;
	
	protected JMenu jmenuDetalleDetalleMoviClienProve;
	protected JMenu jmenuDetalleArchivoDetalleMoviClienProve;
	protected JMenu jmenuDetalleAccionesDetalleMoviClienProve;
	protected JMenu jmenuDetalleDatosDetalleMoviClienProve;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleMoviClienProve;	
	protected GridBagConstraints gridBagConstraintsDetalleMoviClienProve;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleMoviClienProveBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleMoviClienProve;		
	
	
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

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected SucursalBeanSwingJInternalFrame sucursalmovimientoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursalmovimiento="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected EstadoDetalleClienteBeanSwingJInternalFrame estadodetalleclienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetallecliente="";
	
	public DetalleMoviClienProveSessionBean detallemoviclienproveSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public SucursalSessionBean sucursalmovimientoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public EstadoDetalleClienteSessionBean estadodetalleclienteSessionBean;	
	
	public DetalleMoviClienProveLogic detallemoviclienproveLogic;
	
	public JScrollPane jScrollPanelDatosDetalleMoviClienProve;
	public JScrollPane jScrollPanelDatosEdicionDetalleMoviClienProve;
	public JScrollPane jScrollPanelDatosGeneralDetalleMoviClienProve;
	
	protected JPanel jPanelCamposDetalleMoviClienProve;    
	protected JPanel jPanelCamposOcultosDetalleMoviClienProve;    	
	protected JPanel jPanelAccionesDetalleMoviClienProve;
	protected JPanel jPanelAccionesFormularioDetalleMoviClienProve;
    
	
	
	protected Integer iXPanelCamposDetalleMoviClienProve=0;
	protected Integer iYPanelCamposDetalleMoviClienProve=0;
	
	protected Integer iXPanelCamposOcultosDetalleMoviClienProve=0;
	protected Integer iYPanelCamposOcultosDetalleMoviClienProve=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleMoviClienProve;
	public JButton jButtonModificarDetalleMoviClienProve;
	public JButton jButtonActualizarDetalleMoviClienProve;
    public JButton jButtonEliminarDetalleMoviClienProve;
	public JButton jButtonCancelarDetalleMoviClienProve;
    public JButton jButtonGuardarCambiosDetalleMoviClienProve;
	public JButton jButtonGuardarCambiosTablaDetalleMoviClienProve;
	protected JButton jButtonCerrarDetalleMoviClienProve;
	
	/*
	protected JButton jButtonProcesarInformacionDetalleMoviClienProve;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleMoviClienProve;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleMoviClienProve;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleMoviClienProve;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleMoviClienProve;
	protected JButton jButtonModificarToolBarDetalleMoviClienProve;
	protected JButton jButtonActualizarToolBarDetalleMoviClienProve;
    protected JButton jButtonEliminarToolBarDetalleMoviClienProve;
	protected JButton jButtonCancelarToolBarDetalleMoviClienProve;
    protected JButton jButtonGuardarCambiosToolBarDetalleMoviClienProve;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleMoviClienProve;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleMoviClienProve;
	protected JButton jButtonCerrarToolBarDetalleMoviClienProve;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleMoviClienProve;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleMoviClienProve;
	protected JMenuItem jMenuItemModificarDetalleMoviClienProve;
	protected JMenuItem jMenuItemActualizarDetalleMoviClienProve;
    protected JMenuItem jMenuItemEliminarDetalleMoviClienProve;
	protected JMenuItem jMenuItemCancelarDetalleMoviClienProve;
    protected JMenuItem jMenuItemGuardarCambiosDetalleMoviClienProve;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleMoviClienProve;
	protected JMenuItem jMenuItemCerrarDetalleMoviClienProve;
	protected JMenuItem jMenuItemDetalleCerrarDetalleMoviClienProve;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleMoviClienProve;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleMoviClienProve;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleMoviClienProve;
	protected JMenuItem jMenuItemMostrarOcultarDetalleMoviClienProve;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleMoviClienProve;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleMoviClienProve;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleMoviClienProve;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleMoviClienProve;
	public JLabel jLabelIdDetalleMoviClienProve;
	public JLabel jLabelidDetalleMoviClienProve;
	public JButton jButtonidDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelfecha_venceDetalleMoviClienProve;
	public JLabel jLabelfecha_venceDetalleMoviClienProve;
	//public JFormattedTextField jDateChooserfecha_venceDetalleMoviClienProve;

	public JDateChooser jDateChooserfecha_venceDetalleMoviClienProve;
	public JButton jButtonfecha_venceDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaDetalleMoviClienProve;
	public JLabel jLabelnumero_facturaDetalleMoviClienProve;
	public JTextField jTextFieldnumero_facturaDetalleMoviClienProve;
	public JButton jButtonnumero_facturaDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_localDetalleMoviClienProve;
	public JLabel jLabeldebito_mone_localDetalleMoviClienProve;
	public JTextField jTextFielddebito_mone_localDetalleMoviClienProve;
	public JButton jButtondebito_mone_localDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_localDetalleMoviClienProve;
	public JLabel jLabelcredito_mone_localDetalleMoviClienProve;
	public JTextField jTextFieldcredito_mone_localDetalleMoviClienProve;
	public JButton jButtoncredito_mone_localDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPaneldebito_mone_extraDetalleMoviClienProve;
	public JLabel jLabeldebito_mone_extraDetalleMoviClienProve;
	public JTextField jTextFielddebito_mone_extraDetalleMoviClienProve;
	public JButton jButtondebito_mone_extraDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelcredito_mone_extraDetalleMoviClienProve;
	public JLabel jLabelcredito_mone_extraDetalleMoviClienProve;
	public JTextField jTextFieldcredito_mone_extraDetalleMoviClienProve;
	public JButton jButtoncredito_mone_extraDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelcotizacionDetalleMoviClienProve;
	public JLabel jLabelcotizacionDetalleMoviClienProve;
	public JTextField jTextFieldcotizacionDetalleMoviClienProve;
	public JButton jButtoncotizacionDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleMoviClienProve;
	public JLabel jLabeldescripcionDetalleMoviClienProve;
	public JTextArea jTextAreadescripcionDetalleMoviClienProve;
	public JScrollPane jscrollPanedescripcionDetalleMoviClienProve;
	public JButton jButtondescripcionDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionDetalleMoviClienProve;
	public JLabel jLabelfecha_emisionDetalleMoviClienProve;
	//public JFormattedTextField jDateChooserfecha_emisionDetalleMoviClienProve;

	public JDateChooser jDateChooserfecha_emisionDetalleMoviClienProve;
	public JButton jButtonfecha_emisionDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelmonto_mone_localDetalleMoviClienProve;
	public JLabel jLabelmonto_mone_localDetalleMoviClienProve;
	public JTextField jTextFieldmonto_mone_localDetalleMoviClienProve;
	public JButton jButtonmonto_mone_localDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelmonto_mone_extraDetalleMoviClienProve;
	public JLabel jLabelmonto_mone_extraDetalleMoviClienProve;
	public JTextField jTextFieldmonto_mone_extraDetalleMoviClienProve;
	public JButton jButtonmonto_mone_extraDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteDetalleMoviClienProve;
	public JLabel jLabelnumero_comprobanteDetalleMoviClienProve;
	public JTextField jTextFieldnumero_comprobanteDetalleMoviClienProve;
	public JButton jButtonnumero_comprobanteDetalleMoviClienProveBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleMoviClienProve;
	public JLabel jLabelid_empresaDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleMoviClienProve;
	public JButton jButtonid_empresaDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_empresaDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleMoviClienProve;
	public JLabel jLabelid_sucursalDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleMoviClienProve;
	public JButton jButtonid_sucursalDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_sucursalDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleMoviClienProve;
	public JLabel jLabelid_ejercicioDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleMoviClienProve;
	public JButton jButtonid_ejercicioDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleMoviClienProve;
	public JLabel jLabelid_periodoDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleMoviClienProve;
	public JButton jButtonid_periodoDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_periodoDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleMoviClienProve;
	public JLabel jLabelid_anioDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleMoviClienProve;
	public JButton jButtonid_anioDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_anioDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleMoviClienProve;
	public JLabel jLabelid_mesDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleMoviClienProve;
	public JButton jButtonid_mesDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_mesDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloDetalleMoviClienProve;
	public JLabel jLabelid_moduloDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloDetalleMoviClienProve;
	public JButton jButtonid_moduloDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_moduloDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_moduloDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableDetalleMoviClienProve;
	public JLabel jLabelid_asiento_contableDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableDetalleMoviClienProve;
	public JButton jButtonid_asiento_contableDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteDetalleMoviClienProve;
	public JLabel jLabelid_clienteDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteDetalleMoviClienProve;
	public JButton jButtonid_clienteDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_clienteDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_clienteDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaDetalleMoviClienProve;
	public JLabel jLabelid_facturaDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaDetalleMoviClienProve;
	public JButton jButtonid_facturaDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_facturaDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_facturaDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionDetalleMoviClienProve;
	public JLabel jLabelid_transaccionDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionDetalleMoviClienProve;
	public JButton jButtonid_transaccionDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_transaccionDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_transaccionDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaDetalleMoviClienProve;
	public JLabel jLabelid_monedaDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaDetalleMoviClienProve;
	public JButton jButtonid_monedaDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_monedaDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_monedaDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursal_movimientoDetalleMoviClienProve;
	public JLabel jLabelid_sucursal_movimientoDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursal_movimientoDetalleMoviClienProve;
	public JButton jButtonid_sucursal_movimientoDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_sucursal_movimientoDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloDetalleMoviClienProve;
	public JLabel jLabelid_tipo_transaccion_moduloDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve;
	public JButton jButtonid_tipo_transaccion_moduloDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_detalle_clienteDetalleMoviClienProve;
	public JLabel jLabelid_estado_detalle_clienteDetalleMoviClienProve;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_clienteDetalleMoviClienProve;
	public JButton jButtonid_estado_detalle_clienteDetalleMoviClienProve= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteDetalleMoviClienProveUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleMoviClienProve;
	
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
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=440;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleMoviClienProveDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleMoviClienProve=new JPanel();
				this.jPanelAccionesFormularioDetalleMoviClienProve=new JPanel();
				this.jmenuBarDetalleDetalleMoviClienProve=new JMenuBar();
				this.jTtoolBarDetalleDetalleMoviClienProve=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMoviClienProveDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleMoviClienProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleMoviClienProveDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleMoviClienProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMoviClienProveDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMoviClienProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMoviClienProveDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleMoviClienProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleMoviClienProveDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleMoviClienProve No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	/*
	public JButton getjButtonActualizarToolBarDetalleMoviClienProve() {
		return this.jButtonActualizarToolBarDetalleMoviClienProve;
	}
	
	public JButton getjButtonEliminarToolBarDetalleMoviClienProve() {
		return this.jButtonEliminarToolBarDetalleMoviClienProve;
	}
	
	public JButton getjButtonCancelarToolBarDetalleMoviClienProve() {
		return this.jButtonCancelarToolBarDetalleMoviClienProve;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleMoviClienProve() {
		return this.jButtonProcesarInformacionDetalleMoviClienProve;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleMoviClienProve)	{
		this.jButtonProcesarInformacionDetalleMoviClienProve = jButtonProcesarInformacionDetalleMoviClienProve;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleMoviClienProve() {
		return this.jComboBoxTiposAccionesDetalleMoviClienProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleMoviClienProve(
			JComboBox jComboBoxTiposRelacionesDetalleMoviClienProve) {
		this.jComboBoxTiposRelacionesDetalleMoviClienProve = jComboBoxTiposRelacionesDetalleMoviClienProve;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleMoviClienProve(
			JComboBox jComboBoxTiposAccionesDetalleMoviClienProve) {
		this.jComboBoxTiposAccionesDetalleMoviClienProve = jComboBoxTiposAccionesDetalleMoviClienProve;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleMoviClienProve() {
		return this.jComboBoxTiposAccionesFormularioDetalleMoviClienProve;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleMoviClienProve(
			JComboBox jComboBoxTiposAccionesFormularioDetalleMoviClienProve) {
		this.jComboBoxTiposAccionesFormularioDetalleMoviClienProve = jComboBoxTiposAccionesFormularioDetalleMoviClienProve;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallemoviclienproveSessionBean=new DetalleMoviClienProveSessionBean();
		
		this.detallemoviclienproveSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallemoviclienproveSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallemoviclienproveSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleMoviClienProveJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleMoviClienProveJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleMoviClienProveJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Cliente MANTENIMIENTO"));
		
		
		if(iWidth > 1450) {
			iWidth=1450;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleMoviClienProveJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleMoviClienProve= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleMoviClienProve=new JButtonMe();
				this.jButtonModificarToolBarDetalleMoviClienProve=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleMoviClienProve,this.jTtoolBarDetalleDetalleMoviClienProve,
							"actualizar","actualizar","Actualizar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleMoviClienProve,this.jTtoolBarDetalleDetalleMoviClienProve,
							"eliminar","eliminar","Eliminar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleMoviClienProve,this.jTtoolBarDetalleDetalleMoviClienProve,
							"cancelar","cancelar","Cancelar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleMoviClienProve=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleMoviClienProve,this.jTtoolBarDetalleDetalleMoviClienProve,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleMoviClienProve=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleMoviClienProve=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleMoviClienProve=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleMoviClienProve=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleMoviClienProve=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleMoviClienProve= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleMoviClienProve.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleMoviClienProve,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleMoviClienProve= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleMoviClienProve.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleMoviClienProve,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleMoviClienProve= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleMoviClienProve.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleMoviClienProve,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleMoviClienProve= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleMoviClienProve.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleMoviClienProve,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleMoviClienProve= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleMoviClienProve.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleMoviClienProve,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleMoviClienProve= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleMoviClienProve.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleMoviClienProve,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleMoviClienProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleMoviClienProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleMoviClienProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleMoviClienProve= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleMoviClienProve.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleMoviClienProve,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleMoviClienProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleMoviClienProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleMoviClienProve,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleMoviClienProve= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleMoviClienProve.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleMoviClienProve,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleMoviClienProve.add(this.jMenuItemDetalleCerrarDetalleMoviClienProve);
		
		this.jmenuDetalleAccionesDetalleMoviClienProve.add(this.jMenuItemActualizarDetalleMoviClienProve);
		this.jmenuDetalleAccionesDetalleMoviClienProve.add(this.jMenuItemEliminarDetalleMoviClienProve);
		this.jmenuDetalleAccionesDetalleMoviClienProve.add(this.jMenuItemCancelarDetalleMoviClienProve);		
		
		//this.jmenuDetalleDatosDetalleMoviClienProve.add(this.jMenuItemDetalleAbrirOrderByDetalleMoviClienProve);				
		this.jmenuDetalleDatosDetalleMoviClienProve.add(this.jMenuItemDetalleMostarOcultarDetalleMoviClienProve);				
				
		//this.jmenuDetalleAccionesDetalleMoviClienProve.add(this.jMenuItemGuardarCambiosDetalleMoviClienProve);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleMoviClienProve.add(this.jmenuDetalleArchivoDetalleMoviClienProve);		
		this.jmenuBarDetalleDetalleMoviClienProve.add(this.jmenuDetalleAccionesDetalleMoviClienProve);		
		this.jmenuBarDetalleDetalleMoviClienProve.add(this.jmenuDetalleDatosDetalleMoviClienProve);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleMoviClienProve);				
	}
	*/
	
	public void inicializarElementosCamposDetalleMoviClienProve() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleMoviClienProve = new JLabelMe();
		jLabelIdDetalleMoviClienProve.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleMoviClienProve = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleMoviClienProve= new GridBagLayout();

		this.jPanelidDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);

		jLabelidDetalleMoviClienProve = new JLabel();
		jLabelidDetalleMoviClienProve.setText("Id");

		jLabelidDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_venceDetalleMoviClienProve = new JLabelMe();
		this.jLabelfecha_venceDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_FECHAVENCE+" : *");
		this.jLabelfecha_venceDetalleMoviClienProve.setToolTipText("Fecha Vence");
		this.jLabelfecha_venceDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_venceDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_venceDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_venceDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_venceDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_FECHAVENCE);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelfecha_venceDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		//jFormattedTextFieldfecha_venceDetalleMoviClienProve= new JFormattedTextFieldMe();

		jDateChooserfecha_venceDetalleMoviClienProve= new JDateChooser();
		jDateChooserfecha_venceDetalleMoviClienProve.setEnabled(false);
		jDateChooserfecha_venceDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_venceDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_venceDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_venceDetalleMoviClienProve.setDate(new Date());
		jDateChooserfecha_venceDetalleMoviClienProve.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_venceDetalleMoviClienProve.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_venceDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonfecha_venceDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_venceDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_venceDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonfecha_venceDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_venceDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_venceDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_venceDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_venceDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_venceDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_venceDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaDetalleMoviClienProve = new JLabelMe();
		this.jLabelnumero_facturaDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_NUMEROFACTURA+" :");
		this.jLabelnumero_facturaDetalleMoviClienProve.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelnumero_facturaDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jTextFieldnumero_facturaDetalleMoviClienProve= new JTextFieldMe();

		jTextFieldnumero_facturaDetalleMoviClienProve.setEnabled(false);
		jTextFieldnumero_facturaDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonnumero_facturaDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonnumero_facturaDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_localDetalleMoviClienProve = new JLabelMe();
		this.jLabeldebito_mone_localDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_DEBITOMONELOCAL+" : *");
		this.jLabeldebito_mone_localDetalleMoviClienProve.setToolTipText("Debito Local");
		this.jLabeldebito_mone_localDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_mone_localDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_mone_localDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_localDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_localDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_localDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_DEBITOMONELOCAL);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPaneldebito_mone_localDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jTextFielddebito_mone_localDetalleMoviClienProve= new JTextFieldMe();
		jTextFielddebito_mone_localDetalleMoviClienProve.setEnabled(false);
		jTextFielddebito_mone_localDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_localDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_localDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_localDetalleMoviClienProve.setText("0.0");

		this.jButtondebito_mone_localDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtondebito_mone_localDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_localDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_localDetalleMoviClienProveBusqueda.setText("U");
		this.jButtondebito_mone_localDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_localDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_localDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_localDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_localDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_localDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_localDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_localDetalleMoviClienProve = new JLabelMe();
		this.jLabelcredito_mone_localDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_CREDITOMONELOCAL+" : *");
		this.jLabelcredito_mone_localDetalleMoviClienProve.setToolTipText("Credito Local");
		this.jLabelcredito_mone_localDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_mone_localDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_mone_localDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_localDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_localDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_localDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_CREDITOMONELOCAL);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelcredito_mone_localDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jTextFieldcredito_mone_localDetalleMoviClienProve= new JTextFieldMe();
		jTextFieldcredito_mone_localDetalleMoviClienProve.setEnabled(false);
		jTextFieldcredito_mone_localDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_localDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_localDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_localDetalleMoviClienProve.setText("0.0");

		this.jButtoncredito_mone_localDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtoncredito_mone_localDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_localDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_localDetalleMoviClienProveBusqueda.setText("U");
		this.jButtoncredito_mone_localDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_localDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_localDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_localDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_localDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_localDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_localDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabeldebito_mone_extraDetalleMoviClienProve = new JLabelMe();
		this.jLabeldebito_mone_extraDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_DEBITOMONEEXTRA+" : *");
		this.jLabeldebito_mone_extraDetalleMoviClienProve.setToolTipText("Debito Extra");
		this.jLabeldebito_mone_extraDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_mone_extraDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldebito_mone_extraDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldebito_mone_extraDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldebito_mone_extraDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldebito_mone_extraDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_DEBITOMONEEXTRA);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPaneldebito_mone_extraDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jTextFielddebito_mone_extraDetalleMoviClienProve= new JTextFieldMe();
		jTextFielddebito_mone_extraDetalleMoviClienProve.setEnabled(false);
		jTextFielddebito_mone_extraDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddebito_mone_extraDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddebito_mone_extraDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddebito_mone_extraDetalleMoviClienProve.setText("0.0");

		this.jButtondebito_mone_extraDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtondebito_mone_extraDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondebito_mone_extraDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondebito_mone_extraDetalleMoviClienProveBusqueda.setText("U");
		this.jButtondebito_mone_extraDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondebito_mone_extraDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondebito_mone_extraDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddebito_mone_extraDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddebito_mone_extraDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"debito_mone_extraDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondebito_mone_extraDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabelcredito_mone_extraDetalleMoviClienProve = new JLabelMe();
		this.jLabelcredito_mone_extraDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_CREDITOMONEEXTRA+" : *");
		this.jLabelcredito_mone_extraDetalleMoviClienProve.setToolTipText("Credito Extra");
		this.jLabelcredito_mone_extraDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_mone_extraDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcredito_mone_extraDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcredito_mone_extraDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcredito_mone_extraDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcredito_mone_extraDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_CREDITOMONEEXTRA);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelcredito_mone_extraDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jTextFieldcredito_mone_extraDetalleMoviClienProve= new JTextFieldMe();
		jTextFieldcredito_mone_extraDetalleMoviClienProve.setEnabled(false);
		jTextFieldcredito_mone_extraDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcredito_mone_extraDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcredito_mone_extraDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcredito_mone_extraDetalleMoviClienProve.setText("0.0");

		this.jButtoncredito_mone_extraDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtoncredito_mone_extraDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncredito_mone_extraDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncredito_mone_extraDetalleMoviClienProveBusqueda.setText("U");
		this.jButtoncredito_mone_extraDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncredito_mone_extraDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncredito_mone_extraDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcredito_mone_extraDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcredito_mone_extraDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"credito_mone_extraDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncredito_mone_extraDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabelcotizacionDetalleMoviClienProve = new JLabelMe();
		this.jLabelcotizacionDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_COTIZACION+" : *");
		this.jLabelcotizacionDetalleMoviClienProve.setToolTipText("Cotizacion");
		this.jLabelcotizacionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcotizacionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcotizacionDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcotizacionDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcotizacionDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_COTIZACION);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelcotizacionDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jTextFieldcotizacionDetalleMoviClienProve= new JTextFieldMe();
		jTextFieldcotizacionDetalleMoviClienProve.setEnabled(false);
		jTextFieldcotizacionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcotizacionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcotizacionDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcotizacionDetalleMoviClienProve.setText("0.0");

		this.jButtoncotizacionDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtoncotizacionDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncotizacionDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncotizacionDetalleMoviClienProveBusqueda.setText("U");
		this.jButtoncotizacionDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncotizacionDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncotizacionDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcotizacionDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcotizacionDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cotizacionDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncotizacionDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleMoviClienProve = new JLabelMe();
		this.jLabeldescripcionDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleMoviClienProve.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPaneldescripcionDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jTextAreadescripcionDetalleMoviClienProve= new JTextAreaMe();
		jTextAreadescripcionDetalleMoviClienProve.setEnabled(false);
		jTextAreadescripcionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleMoviClienProve.setLineWrap(true);
		jTextAreadescripcionDetalleMoviClienProve.setWrapStyleWord(true);
		jTextAreadescripcionDetalleMoviClienProve.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleMoviClienProve.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleMoviClienProve = new JScrollPane(jTextAreadescripcionDetalleMoviClienProve);
		jscrollPanedescripcionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,300),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleMoviClienProveBusqueda.setText("U");
		this.jButtondescripcionDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionDetalleMoviClienProve = new JLabelMe();
		this.jLabelfecha_emisionDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionDetalleMoviClienProve.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelfecha_emisionDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		//jFormattedTextFieldfecha_emisionDetalleMoviClienProve= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionDetalleMoviClienProve= new JDateChooser();
		jDateChooserfecha_emisionDetalleMoviClienProve.setEnabled(false);
		jDateChooserfecha_emisionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionDetalleMoviClienProve.setDate(new Date());
		jDateChooserfecha_emisionDetalleMoviClienProve.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionDetalleMoviClienProve.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonfecha_emisionDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonfecha_emisionDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabelmonto_mone_localDetalleMoviClienProve = new JLabelMe();
		this.jLabelmonto_mone_localDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_MONTOMONELOCAL+" : *");
		this.jLabelmonto_mone_localDetalleMoviClienProve.setToolTipText("Monto Mone Local");
		this.jLabelmonto_mone_localDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_localDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_localDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_mone_localDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_mone_localDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_mone_localDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_MONTOMONELOCAL);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelmonto_mone_localDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jTextFieldmonto_mone_localDetalleMoviClienProve= new JTextFieldMe();
		jTextFieldmonto_mone_localDetalleMoviClienProve.setEnabled(false);
		jTextFieldmonto_mone_localDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_localDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_localDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_mone_localDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_mone_localDetalleMoviClienProve.setText("0.0");

		this.jButtonmonto_mone_localDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonmonto_mone_localDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_localDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_localDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_mone_localDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonmonto_mone_localDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_mone_localDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_mone_localDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_mone_localDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_mone_localDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_mone_localDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_mone_localDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabelmonto_mone_extraDetalleMoviClienProve = new JLabelMe();
		this.jLabelmonto_mone_extraDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_MONTOMONEEXTRA+" : *");
		this.jLabelmonto_mone_extraDetalleMoviClienProve.setToolTipText("Monto Mone Extra");
		this.jLabelmonto_mone_extraDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_extraDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmonto_mone_extraDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmonto_mone_extraDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmonto_mone_extraDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmonto_mone_extraDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_MONTOMONEEXTRA);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelmonto_mone_extraDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jTextFieldmonto_mone_extraDetalleMoviClienProve= new JTextFieldMe();
		jTextFieldmonto_mone_extraDetalleMoviClienProve.setEnabled(false);
		jTextFieldmonto_mone_extraDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_extraDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmonto_mone_extraDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmonto_mone_extraDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmonto_mone_extraDetalleMoviClienProve.setText("0.0");

		this.jButtonmonto_mone_extraDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonmonto_mone_extraDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_extraDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmonto_mone_extraDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmonto_mone_extraDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonmonto_mone_extraDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmonto_mone_extraDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmonto_mone_extraDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmonto_mone_extraDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmonto_mone_extraDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"monto_mone_extraDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmonto_mone_extraDetalleMoviClienProveBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteDetalleMoviClienProve = new JLabelMe();
		this.jLabelnumero_comprobanteDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" : *");
		this.jLabelnumero_comprobanteDetalleMoviClienProve.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelnumero_comprobanteDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jTextFieldnumero_comprobanteDetalleMoviClienProve= new JTextFieldMe();

		jTextFieldnumero_comprobanteDetalleMoviClienProve.setEnabled(false);
		jTextFieldnumero_comprobanteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonnumero_comprobanteDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteDetalleMoviClienProveBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleMoviClienProve() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_empresaDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleMoviClienProve.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_empresaDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_empresaDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_empresaDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleMoviClienProve.setEnabled(false);

		this.jButtonid_empresaDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_empresaDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_empresaDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleMoviClienProve"));

		this.jButtonid_empresaDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_empresaDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_empresaDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleMoviClienProveUpdate"));



					
		this.jLabelid_sucursalDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_sucursalDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleMoviClienProve.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_sucursalDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_sucursalDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_sucursalDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleMoviClienProve.setEnabled(false);

		this.jButtonid_sucursalDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_sucursalDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_sucursalDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleMoviClienProve"));

		this.jButtonid_sucursalDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_sucursalDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_sucursalDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleMoviClienProveUpdate"));



					
		this.jLabelid_ejercicioDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_ejercicioDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleMoviClienProve.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_ejercicioDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_ejercicioDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleMoviClienProve.setEnabled(false);

		this.jButtonid_ejercicioDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_ejercicioDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_ejercicioDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleMoviClienProve"));

		this.jButtonid_ejercicioDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_ejercicioDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleMoviClienProveUpdate"));



					
		this.jLabelid_periodoDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_periodoDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleMoviClienProve.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_periodoDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_periodoDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_periodoDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleMoviClienProve.setEnabled(false);

		this.jButtonid_periodoDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_periodoDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_periodoDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleMoviClienProve"));

		this.jButtonid_periodoDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_periodoDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_periodoDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleMoviClienProveUpdate"));



					
		this.jLabelid_anioDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_anioDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleMoviClienProve.setToolTipText("Anio");
		this.jLabelid_anioDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_anioDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_anioDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_anioDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleMoviClienProve.setEnabled(false);

		this.jButtonid_anioDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_anioDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_anioDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleMoviClienProve"));

		this.jButtonid_anioDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_anioDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_anioDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_anioDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleMoviClienProveUpdate"));



					
		this.jLabelid_mesDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_mesDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleMoviClienProve.setToolTipText("Mes");
		this.jLabelid_mesDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_mesDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_mesDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_mesDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleMoviClienProve.setEnabled(false);

		this.jButtonid_mesDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_mesDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_mesDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleMoviClienProve"));

		this.jButtonid_mesDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_mesDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_mesDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_mesDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleMoviClienProveUpdate"));



					
		this.jLabelid_moduloDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_moduloDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloDetalleMoviClienProve.setToolTipText("Modulo");
		this.jLabelid_moduloDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_moduloDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_moduloDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_moduloDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloDetalleMoviClienProve.setEnabled(false);

		this.jButtonid_moduloDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_moduloDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_moduloDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleMoviClienProve"));

		this.jButtonid_moduloDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_moduloDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_moduloDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_moduloDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_moduloDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_moduloDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleMoviClienProveUpdate"));



					
		this.jLabelid_asiento_contableDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_asiento_contableDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableDetalleMoviClienProve.setToolTipText("Asiento C.");
		this.jLabelid_asiento_contableDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_asiento_contableDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_asiento_contableDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_asiento_contableDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_asiento_contableDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_asiento_contableDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_asiento_contableDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_asiento_contableDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleMoviClienProve"));

		this.jButtonid_asiento_contableDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_asiento_contableDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_asiento_contableDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_asiento_contableDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableDetalleMoviClienProveUpdate"));



					
		this.jLabelid_clienteDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_clienteDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteDetalleMoviClienProve.setToolTipText("Cliente/Prove");
		this.jLabelid_clienteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_clienteDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_clienteDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_clienteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_clienteDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_clienteDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleMoviClienProve"));

		this.jButtonid_clienteDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_clienteDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_clienteDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_clienteDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_clienteDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_clienteDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteDetalleMoviClienProveUpdate"));



					
		this.jLabelid_facturaDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_facturaDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDFACTURA+" :");
		this.jLabelid_facturaDetalleMoviClienProve.setToolTipText("Factura");
		this.jLabelid_facturaDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_facturaDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_facturaDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_facturaDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_facturaDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_facturaDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_facturaDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleMoviClienProve"));

		this.jButtonid_facturaDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_facturaDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_facturaDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_facturaDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_facturaDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_facturaDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaDetalleMoviClienProveUpdate"));



					
		this.jLabelid_transaccionDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_transaccionDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionDetalleMoviClienProve.setToolTipText("Tipo");
		this.jLabelid_transaccionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_transaccionDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_transaccionDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_transaccionDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_transaccionDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_transaccionDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleMoviClienProve"));

		this.jButtonid_transaccionDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_transaccionDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_transaccionDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_transaccionDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_transaccionDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_transaccionDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionDetalleMoviClienProveUpdate"));



					
		this.jLabelid_monedaDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_monedaDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaDetalleMoviClienProve.setToolTipText("Moneda");
		this.jLabelid_monedaDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_monedaDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_monedaDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_monedaDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_monedaDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_monedaDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDetalleMoviClienProve"));

		this.jButtonid_monedaDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_monedaDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_monedaDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_monedaDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_monedaDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_monedaDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaDetalleMoviClienProveUpdate"));



					
		this.jLabelid_sucursal_movimientoDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_sucursal_movimientoDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDSUCURSALMOVIMIENTO+" : *");
		this.jLabelid_sucursal_movimientoDetalleMoviClienProve.setToolTipText("Sucursal Movimiento");
		this.jLabelid_sucursal_movimientoDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_movimientoDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_sucursal_movimientoDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursal_movimientoDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursal_movimientoDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursal_movimientoDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDSUCURSALMOVIMIENTO);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_sucursal_movimientoDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_sucursal_movimientoDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_sucursal_movimientoDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_movimientoDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursal_movimientoDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursal_movimientoDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursal_movimientoDetalleMoviClienProve.setEnabled(false);

		this.jButtonid_sucursal_movimientoDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_sucursal_movimientoDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_movimientoDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_movimientoDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursal_movimientoDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_sucursal_movimientoDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursal_movimientoDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_movimientoDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursal_movimientoDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_movimientoDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_movimientoDetalleMoviClienProve"));

		this.jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursal_movimientoDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_movimientoDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_movimientoDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_sucursal_movimientoDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursal_movimientoDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursal_movimientoDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursal_movimientoDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursal_movimientoDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursal_movimientoDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursal_movimientoDetalleMoviClienProveUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloDetalleMoviClienProve.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleMoviClienProve"));

		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleMoviClienProveUpdate"));



					
		this.jLabelid_estado_detalle_clienteDetalleMoviClienProve = new JLabelMe();
		this.jLabelid_estado_detalle_clienteDetalleMoviClienProve.setText(""+DetalleMoviClienProveConstantesFunciones.LABEL_IDESTADODETALLECLIENTE+" : *");
		this.jLabelid_estado_detalle_clienteDetalleMoviClienProve.setToolTipText("Estado Detalle Cliente");
		this.jLabelid_estado_detalle_clienteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_detalle_clienteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_estado_detalle_clienteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-30),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_clienteDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_clienteDetalleMoviClienProve=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_clienteDetalleMoviClienProve.setToolTipText(DetalleMoviClienProveConstantesFunciones.LABEL_IDESTADODETALLECLIENTE);
		this.gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		this.jPanelid_estado_detalle_clienteDetalleMoviClienProve.setLayout(this.gridaBagLayoutDetalleMoviClienProve);


		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve= new JComboBoxMe();
		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_clienteDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve.setEnabled(false);

		this.jButtonid_estado_detalle_clienteDetalleMoviClienProve= new JButtonMe();
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProve.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProve.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProve.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProve.setText("Buscar");
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProve.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProve.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_clienteDetalleMoviClienProve,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_clienteDetalleMoviClienProve"));

		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda.setText("U");
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_clienteDetalleMoviClienProveBusqueda"));

		if(this.detallemoviclienproveSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_clienteDetalleMoviClienProveUpdate.setText("U");
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_clienteDetalleMoviClienProveUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_clienteDetalleMoviClienProveUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_clienteDetalleMoviClienProve.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_clienteDetalleMoviClienProveUpdate"));



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
		
		/*
		this.inicializarToolBar();		
		*/
		
		//CARGAR MENUS
		//this.jInternalFrameDetalleDetalleMoviClienProve = new DetalleMoviClienProveBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Cliente DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleMoviClienProve= new GridBagLayout();
		

		
		String sToolTipDetalleMoviClienProve="";
		sToolTipDetalleMoviClienProve=DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleMoviClienProve+="(Cartera.DetalleMoviClienProve)";
		}
		
		if(!this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleMoviClienProve+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleMoviClienProve = new JButtonMe();
		this.jButtonModificarDetalleMoviClienProve = new JButtonMe();
        this.jButtonActualizarDetalleMoviClienProve = new JButtonMe();
        this.jButtonEliminarDetalleMoviClienProve = new JButtonMe();
        this.jButtonCancelarDetalleMoviClienProve = new JButtonMe();
        this.jButtonGuardarCambiosDetalleMoviClienProve = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleMoviClienProve = new JButtonMe();
		this.jButtonCerrarDetalleMoviClienProve = new JButtonMe();
		
		this.jScrollPanelDatosDetalleMoviClienProve = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleMoviClienProve = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleMoviClienProve = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Cliente";
		
		if(!this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Clientes" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleMoviClienProve.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleMoviClienProve.setName("jPanelCamposDetalleMoviClienProve"); 

		this.jPanelCamposOcultosDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleMoviClienProve.setName("jPanelCamposOcultosDetalleMoviClienProve"); 

        this.jPanelAccionesDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleMoviClienProve.setToolTipText("Acciones");
        this.jPanelAccionesDetalleMoviClienProve.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleMoviClienProve.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleMoviClienProve.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleMoviClienProve.setText("Nuevo");
		this.jButtonModificarDetalleMoviClienProve.setText("Editar");
        this.jButtonActualizarDetalleMoviClienProve.setText("Actualizar");
        this.jButtonEliminarDetalleMoviClienProve.setText("Eliminar");
        this.jButtonCancelarDetalleMoviClienProve.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleMoviClienProve.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleMoviClienProve.setText("Guardar");
		this.jButtonCerrarDetalleMoviClienProve.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleMoviClienProve,"nuevo_button","Nuevo",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleMoviClienProve,"modificar_button","Editar",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleMoviClienProve,"actualizar_button","Actualizar",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleMoviClienProve,"eliminar_button","Eliminar",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleMoviClienProve,"cancelar_button","Cancelar",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleMoviClienProve,"guardarcambios_button","Guardar",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleMoviClienProve,"guardarcambiostabla_button","Guardar",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleMoviClienProve,"cerrar_button","Salir",this.detallemoviclienproveSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleMoviClienProve.setToolTipText("Nuevo"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleMoviClienProve.setToolTipText("Editar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleMoviClienProve.setToolTipText("Actualizar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleMoviClienProve.setToolTipText("Eliminar)"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleMoviClienProve.setToolTipText("Cancelar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleMoviClienProve.setToolTipText("Guardar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleMoviClienProve.setToolTipText("Guardar"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleMoviClienProve.setToolTipText("Salir"+" "+DetalleMoviClienProveConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleMoviClienProve";
		inputMap = this.jButtonNuevoDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleMoviClienProve.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleMoviClienProve"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleMoviClienProve";
		inputMap = this.jButtonActualizarDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleMoviClienProve"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleMoviClienProve";
		inputMap = this.jButtonEliminarDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleMoviClienProve"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleMoviClienProve";
		inputMap = this.jButtonCancelarDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleMoviClienProve"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleMoviClienProve";
		inputMap = this.jButtonCerrarDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleMoviClienProve"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleMoviClienProve";
		inputMap = this.jButtonGuardarCambiosTablaDetalleMoviClienProve.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleMoviClienProve.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleMoviClienProve"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleMoviClienProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleMoviClienProve.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleMoviClienProve.setToolTipText("Nuevo DetalleMoviClienProve");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleMoviClienProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleMoviClienProve.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleMoviClienProve.setToolTipText("Sin Cerrar Ventana DetalleMoviClienProve");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleMoviClienProve = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleMoviClienProve.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleMoviClienProve.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleMoviClienProve.setText("Accion");
		this.jComboBoxTiposAccionesDetalleMoviClienProve.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioDetalleMoviClienProve = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleMoviClienProve.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleMoviClienProve.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleMoviClienProve = new JLabelMe();
		
		this.jLabelAccionesDetalleMoviClienProve.setText("Acciones");		
		this.jLabelAccionesDetalleMoviClienProve.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMoviClienProve.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleMoviClienProve.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleMoviClienProve();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleMoviClienProve();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleMoviClienProve=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleMoviClienProve.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleMoviClienProve,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesDetalleMoviClienProve.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMoviClienProve.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleMoviClienProve.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioDetalleMoviClienProve.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleMoviClienProve.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleMoviClienProve.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleMoviClienProve, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleMoviClienProve = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleMoviClienProve = new GridBagLayout();
		
		this.jPanelCamposDetalleMoviClienProve.setLayout(gridaBagLayoutCamposDetalleMoviClienProve);
		this.jPanelCamposOcultosDetalleMoviClienProve.setLayout(gridaBagLayoutCamposOcultosDetalleMoviClienProve);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidDetalleMoviClienProve.add(jLabelIdDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidDetalleMoviClienProve.add(jLabelidDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaDetalleMoviClienProve.add(jLabelid_empresaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleMoviClienProve.add(jButtonid_empresaDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleMoviClienProve.add(jButtonid_empresaDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaDetalleMoviClienProve.add(jComboBoxid_empresaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalDetalleMoviClienProve.add(jLabelid_sucursalDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleMoviClienProve.add(jButtonid_sucursalDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleMoviClienProve.add(jButtonid_sucursalDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalDetalleMoviClienProve.add(jComboBoxid_sucursalDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioDetalleMoviClienProve.add(jLabelid_ejercicioDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleMoviClienProve.add(jButtonid_ejercicioDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleMoviClienProve.add(jButtonid_ejercicioDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioDetalleMoviClienProve.add(jComboBoxid_ejercicioDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoDetalleMoviClienProve.add(jLabelid_periodoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleMoviClienProve.add(jButtonid_periodoDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleMoviClienProve.add(jButtonid_periodoDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoDetalleMoviClienProve.add(jComboBoxid_periodoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioDetalleMoviClienProve.add(jLabelid_anioDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleMoviClienProve.add(jButtonid_anioDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleMoviClienProve.add(jButtonid_anioDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioDetalleMoviClienProve.add(jComboBoxid_anioDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesDetalleMoviClienProve.add(jLabelid_mesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleMoviClienProve.add(jButtonid_mesDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleMoviClienProve.add(jButtonid_mesDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesDetalleMoviClienProve.add(jComboBoxid_mesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloDetalleMoviClienProve.add(jLabelid_moduloDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleMoviClienProve.add(jButtonid_moduloDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleMoviClienProve.add(jButtonid_moduloDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloDetalleMoviClienProve.add(jComboBoxid_moduloDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableDetalleMoviClienProve.add(jLabelid_asiento_contableDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableDetalleMoviClienProve.add(jButtonid_asiento_contableDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleMoviClienProve.add(jButtonid_asiento_contableDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 4;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableDetalleMoviClienProve.add(jButtonid_asiento_contableDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableDetalleMoviClienProve.add(jComboBoxid_asiento_contableDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_venceDetalleMoviClienProve.add(jLabelfecha_venceDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_venceDetalleMoviClienProve.add(jButtonfecha_venceDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_venceDetalleMoviClienProve.add(jDateChooserfecha_venceDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_clienteDetalleMoviClienProve.add(jLabelid_clienteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteDetalleMoviClienProve.add(jButtonid_clienteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleMoviClienProve.add(jButtonid_clienteDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 4;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteDetalleMoviClienProve.add(jButtonid_clienteDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_clienteDetalleMoviClienProve.add(jComboBoxid_clienteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_facturaDetalleMoviClienProve.add(jLabelid_facturaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaDetalleMoviClienProve.add(jButtonid_facturaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetalleMoviClienProve.add(jButtonid_facturaDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 4;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaDetalleMoviClienProve.add(jButtonid_facturaDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_facturaDetalleMoviClienProve.add(jComboBoxid_facturaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_facturaDetalleMoviClienProve.add(jLabelnumero_facturaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaDetalleMoviClienProve.add(jButtonnumero_facturaDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_facturaDetalleMoviClienProve.add(jTextFieldnumero_facturaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transaccionDetalleMoviClienProve.add(jLabelid_transaccionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionDetalleMoviClienProve.add(jButtonid_transaccionDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionDetalleMoviClienProve.add(jButtonid_transaccionDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transaccionDetalleMoviClienProve.add(jComboBoxid_transaccionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldebito_mone_localDetalleMoviClienProve.add(jLabeldebito_mone_localDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_localDetalleMoviClienProve.add(jButtondebito_mone_localDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldebito_mone_localDetalleMoviClienProve.add(jTextFielddebito_mone_localDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcredito_mone_localDetalleMoviClienProve.add(jLabelcredito_mone_localDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_localDetalleMoviClienProve.add(jButtoncredito_mone_localDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcredito_mone_localDetalleMoviClienProve.add(jTextFieldcredito_mone_localDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldebito_mone_extraDetalleMoviClienProve.add(jLabeldebito_mone_extraDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPaneldebito_mone_extraDetalleMoviClienProve.add(jButtondebito_mone_extraDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldebito_mone_extraDetalleMoviClienProve.add(jTextFielddebito_mone_extraDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcredito_mone_extraDetalleMoviClienProve.add(jLabelcredito_mone_extraDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelcredito_mone_extraDetalleMoviClienProve.add(jButtoncredito_mone_extraDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcredito_mone_extraDetalleMoviClienProve.add(jTextFieldcredito_mone_extraDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaDetalleMoviClienProve.add(jLabelid_monedaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaDetalleMoviClienProve.add(jButtonid_monedaDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaDetalleMoviClienProve.add(jButtonid_monedaDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaDetalleMoviClienProve.add(jComboBoxid_monedaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelcotizacionDetalleMoviClienProve.add(jLabelcotizacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelcotizacionDetalleMoviClienProve.add(jButtoncotizacionDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelcotizacionDetalleMoviClienProve.add(jTextFieldcotizacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionDetalleMoviClienProve.add(jLabeldescripcionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleMoviClienProve.add(jButtondescripcionDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionDetalleMoviClienProve.add(jscrollPanedescripcionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursal_movimientoDetalleMoviClienProve.add(jLabelid_sucursal_movimientoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_movimientoDetalleMoviClienProve.add(jButtonid_sucursal_movimientoDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursal_movimientoDetalleMoviClienProve.add(jButtonid_sucursal_movimientoDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursal_movimientoDetalleMoviClienProve.add(jComboBoxid_sucursal_movimientoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_transaccion_moduloDetalleMoviClienProve.add(jLabelid_tipo_transaccion_moduloDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDetalleMoviClienProve.add(jButtonid_tipo_transaccion_moduloDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDetalleMoviClienProve.add(jButtonid_tipo_transaccion_moduloDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_transaccion_moduloDetalleMoviClienProve.add(jComboBoxid_tipo_transaccion_moduloDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_detalle_clienteDetalleMoviClienProve.add(jLabelid_estado_detalle_clienteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_clienteDetalleMoviClienProve.add(jButtonid_estado_detalle_clienteDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 3;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_clienteDetalleMoviClienProve.add(jButtonid_estado_detalle_clienteDetalleMoviClienProveUpdate, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_detalle_clienteDetalleMoviClienProve.add(jComboBoxid_estado_detalle_clienteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionDetalleMoviClienProve.add(jLabelfecha_emisionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionDetalleMoviClienProve.add(jButtonfecha_emisionDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionDetalleMoviClienProve.add(jDateChooserfecha_emisionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_mone_localDetalleMoviClienProve.add(jLabelmonto_mone_localDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_mone_localDetalleMoviClienProve.add(jButtonmonto_mone_localDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_mone_localDetalleMoviClienProve.add(jTextFieldmonto_mone_localDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelmonto_mone_extraDetalleMoviClienProve.add(jLabelmonto_mone_extraDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelmonto_mone_extraDetalleMoviClienProve.add(jButtonmonto_mone_extraDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelmonto_mone_extraDetalleMoviClienProve.add(jTextFieldmonto_mone_extraDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_comprobanteDetalleMoviClienProve.add(jLabelnumero_comprobanteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		//this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 2;
		this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
		this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteDetalleMoviClienProve.add(jButtonnumero_comprobanteDetalleMoviClienProveBusqueda, this.gridBagConstraintsDetalleMoviClienProve);
	}

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = 1;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_comprobanteDetalleMoviClienProve.add(jTextFieldnumero_comprobanteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPanelidDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPanelid_asiento_contableDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPanelfecha_venceDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPanelid_clienteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPanelid_facturaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPanelid_transaccionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPaneldebito_mone_localDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPanelcredito_mone_localDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPaneldebito_mone_extraDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPanelcredito_mone_extraDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPanelid_monedaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposDetalleMoviClienProve.add(this.jPanelcotizacionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}

	iXPanelCamposDetalleMoviClienProve=0;
	iYPanelCamposDetalleMoviClienProve++;

	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.gridBagConstraintsDetalleMoviClienProve.gridwidth = 3;

	this.jPanelCamposDetalleMoviClienProve.add(this.jPaneldescripcionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposDetalleMoviClienProve % 2==0) {
		iXPanelCamposDetalleMoviClienProve=0;
		iYPanelCamposDetalleMoviClienProve++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelid_empresaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelid_sucursalDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelid_ejercicioDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelid_periodoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelid_anioDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelid_mesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelid_moduloDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelnumero_facturaDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelid_sucursal_movimientoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelid_tipo_transaccion_moduloDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelid_estado_detalle_clienteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelfecha_emisionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelmonto_mone_localDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelmonto_mone_extraDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
	}
	this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleMoviClienProve.gridy = iYPanelCamposOcultosDetalleMoviClienProve;
	this.gridBagConstraintsDetalleMoviClienProve.gridx = iXPanelCamposOcultosDetalleMoviClienProve++;
	this.gridBagConstraintsDetalleMoviClienProve.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleMoviClienProve.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosDetalleMoviClienProve.add(this.jPanelnumero_comprobanteDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);



	if(iXPanelCamposOcultosDetalleMoviClienProve % 2==0) {
		iXPanelCamposOcultosDetalleMoviClienProve=0;
		iYPanelCamposOcultosDetalleMoviClienProve++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleMoviClienProve= new GridBagLayout();
		this.jPanelAccionesDetalleMoviClienProve.setLayout(gridaBagLayoutAccionesDetalleMoviClienProve);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleMoviClienProve= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleMoviClienProve.setLayout(gridaBagLayoutAccionesFormularioDetalleMoviClienProve);
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleMoviClienProve.add(this.jComboBoxTiposAccionesFormularioDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleMoviClienProve.add(this.jCheckBoxPostAccionNuevoDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallemoviclienproveSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleMoviClienProve.add(this.jCheckBoxPostAccionSinCerrarDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallemoviclienproveSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleMoviClienProve.add(this.jCheckBoxPostAccionSinMensajeDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleMoviClienProve.add(this.jButtonModificarDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);							

		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;
		this.gridBagConstraintsDetalleMoviClienProve.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleMoviClienProve.add(this.jButtonEliminarDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
			
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleMoviClienProve.add(this.jButtonActualizarDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);


		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleMoviClienProve.add(this.jButtonGuardarCambiosDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);	
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = 0;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleMoviClienProve.add(this.jButtonCancelarDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleMoviClienProve = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleMoviClienProve);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallemoviclienproveSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();						
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;		
			//this.gridBagConstraintsDetalleMoviClienProve.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleMoviClienProve.ipadx = 100;
				
			*/
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleMoviClienProve.gridx =0;
		this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleMoviClienProve.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleMoviClienProveJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleMoviClienProve = new DetalleMoviClienProveBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Cliente DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Cliente DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Cliente Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleMoviClienProveModel detallemoviclienproveModel=new DetalleMoviClienProveModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleMoviClienProveModel.DetalleMoviClienProveFocusTraversalPolicy detallemoviclienproveFocusTraversalPolicy = detallemoviclienproveModel.new DetalleMoviClienProveFocusTraversalPolicy(this);
			
			//detallemoviclienproveFocusTraversalPolicy.setdetallemoviclienproveJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallemoviclienproveModel);
			
			
			this.jContentPaneDetalleDetalleMoviClienProve = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleMoviClienProve = new GridBagLayout();	
			this.jContentPaneDetalleDetalleMoviClienProve.setLayout(gridaBagLayoutDetalleDetalleMoviClienProve);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleMoviClienProve = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
				this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleMoviClienProve.add(jTtoolBarDetalleDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);								
				*/
}
			
			this.jScrollPanelDatosEdicionDetalleMoviClienProve=   new JScrollPane(jContentPaneDetalleDetalleMoviClienProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleMoviClienProve=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	        
			this.jContentPaneDetalleDetalleMoviClienProve.add(jPanelCamposDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);
			
			
			
			
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
						&& detallemoviclienproveSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallemoviclienproveSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleMoviClienProve= new GridBagConstraints();
						this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
						this.jContentPaneDetalleDetalleMoviClienProve.add(this.jTabbedPaneRelacionesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleMoviClienProve.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleMoviClienProve.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
					this.gridBagConstraintsDetalleMoviClienProve.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleMoviClienProve.add(jPanelCamposOcultosDetalleMoviClienProve, gridBagConstraintsDetalleMoviClienProve);
				
					this.jPanelCamposOcultosDetalleMoviClienProve.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	        this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleMoviClienProve.add(this.jPanelAccionesFormularioDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);							
			
			
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
	        this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleMoviClienProve.add(this.jPanelAccionesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleMoviClienProve);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleMoviClienProve=   new JScrollPane(this.jPanelCamposDetalleMoviClienProve,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleMoviClienProve.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMoviClienProve.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleMoviClienProve.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
			this.gridBagConstraintsDetalleMoviClienProve.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleMoviClienProve.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleMoviClienProve.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);			
			
			this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
			this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
			
			
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		
			
		this.gridBagConstraintsDetalleMoviClienProve = new GridBagConstraints();
		this.gridBagConstraintsDetalleMoviClienProve.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleMoviClienProve.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleMoviClienProve, this.gridBagConstraintsDetalleMoviClienProve);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleMoviClienProve;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleMoviClienProve;
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
