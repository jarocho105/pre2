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
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.MovimientoInventarioConstantesFunciones;

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
public class MovimientoInventarioDetalleFormJInternalFrame extends MovimientoInventarioBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleMovimientoInventario;
	
	protected JMenuBar jmenuBarDetalleMovimientoInventario;
	
	protected JMenu jmenuDetalleMovimientoInventario;
	protected JMenu jmenuDetalleArchivoMovimientoInventario;
	protected JMenu jmenuDetalleAccionesMovimientoInventario;
	protected JMenu jmenuDetalleDatosMovimientoInventario;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutMovimientoInventario;	
	protected GridBagConstraints gridBagConstraintsMovimientoInventario;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected MovimientoInventarioBeanSwingJInternalFrameAdditional jInternalFrameDetalleMovimientoInventario;		
	
	
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

	protected TransaccionBeanSwingJInternalFrame transaccionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transaccion="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";

	protected EstadoMovimientoInventarioBeanSwingJInternalFrame estadomovimientoinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadomovimientoinventario="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_factura="";

	protected GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_guiaremision="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected CompraBeanSwingJInternalFrame compraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_compra="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public MovimientoInventarioSessionBean movimientoinventarioSessionBean;
	
	

	public DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame=null;
	public DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleMovimientoInventario=false;
	public DetalleMovimientoInventarioSessionBean detallemovimientoinventarioSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public TransaccionSessionBean transaccionSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;
	public EstadoMovimientoInventarioSessionBean estadomovimientoinventarioSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public FacturaSessionBean facturaSessionBean;
	public GuiaRemisionSessionBean guiaremisionSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public CompraSessionBean compraSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;	
	
	public MovimientoInventarioLogic movimientoinventarioLogic;
	
	public JScrollPane jScrollPanelDatosMovimientoInventario;
	public JScrollPane jScrollPanelDatosEdicionMovimientoInventario;
	public JScrollPane jScrollPanelDatosGeneralMovimientoInventario;
	
	protected JPanel jPanelCamposMovimientoInventario;    
	protected JPanel jPanelCamposOcultosMovimientoInventario;    	
	protected JPanel jPanelAccionesMovimientoInventario;
	protected JPanel jPanelAccionesFormularioMovimientoInventario;
    
	
	
	protected Integer iXPanelCamposMovimientoInventario=0;
	protected Integer iYPanelCamposMovimientoInventario=0;
	
	protected Integer iXPanelCamposOcultosMovimientoInventario=0;
	protected Integer iYPanelCamposOcultosMovimientoInventario=0;
	
	

	protected JPanel jPanelCamposFintotalMovimientoInventario;
	protected Integer iXPanelCamposFintotalMovimientoInventario=0;
	protected Integer iYPanelCamposFintotalMovimientoInventario=0;

	protected JPanel jPanelCamposIniciogeneralMovimientoInventario;
	protected Integer iXPanelCamposIniciogeneralMovimientoInventario=0;
	protected Integer iYPanelCamposIniciogeneralMovimientoInventario=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoMovimientoInventario;
	public JButton jButtonModificarMovimientoInventario;
	public JButton jButtonActualizarMovimientoInventario;
    public JButton jButtonEliminarMovimientoInventario;
	public JButton jButtonCancelarMovimientoInventario;
    public JButton jButtonGuardarCambiosMovimientoInventario;
	public JButton jButtonGuardarCambiosTablaMovimientoInventario;
	protected JButton jButtonCerrarMovimientoInventario;
	
	
	protected JButton jButtonProcesarInformacionMovimientoInventario;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoMovimientoInventario;
	protected JCheckBox jCheckBoxPostAccionSinCerrarMovimientoInventario;
	protected JCheckBox jCheckBoxPostAccionSinMensajeMovimientoInventario;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarMovimientoInventario;
	protected JButton jButtonModificarToolBarMovimientoInventario;
	protected JButton jButtonActualizarToolBarMovimientoInventario;
    protected JButton jButtonEliminarToolBarMovimientoInventario;
	protected JButton jButtonCancelarToolBarMovimientoInventario;
    protected JButton jButtonGuardarCambiosToolBarMovimientoInventario;
	protected JButton jButtonGuardarCambiosTablaToolBarMovimientoInventario;
	protected JButton jButtonMostrarOcultarTablaToolBarMovimientoInventario;
	protected JButton jButtonCerrarToolBarMovimientoInventario;
	
	protected JButton jButtonProcesarInformacionToolBarMovimientoInventario;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoMovimientoInventario;
	protected JMenuItem jMenuItemModificarMovimientoInventario;
	protected JMenuItem jMenuItemActualizarMovimientoInventario;
    protected JMenuItem jMenuItemEliminarMovimientoInventario;
	protected JMenuItem jMenuItemCancelarMovimientoInventario;
    protected JMenuItem jMenuItemGuardarCambiosMovimientoInventario;
	protected JMenuItem jMenuItemGuardarCambiosTablaMovimientoInventario;
	protected JMenuItem jMenuItemCerrarMovimientoInventario;
	protected JMenuItem jMenuItemDetalleCerrarMovimientoInventario;
	protected JMenuItem jMenuItemDetalleMostarOcultarMovimientoInventario;
	
	protected JMenuItem jMenuItemProcesarInformacionMovimientoInventario;
	protected JMenuItem jMenuItemNuevoGuardarCambiosMovimientoInventario;
	protected JMenuItem jMenuItemMostrarOcultarMovimientoInventario;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesMovimientoInventario;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesMovimientoInventario;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesMovimientoInventario;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioMovimientoInventario;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidMovimientoInventario;
	public JLabel jLabelIdMovimientoInventario;
	public JLabel jLabelidMovimientoInventario;
	public JButton jButtonidMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionMovimientoInventario;
	public JLabel jLabelfecha_emisionMovimientoInventario;
	//public JFormattedTextField jDateChooserfecha_emisionMovimientoInventario;

	public JDateChooser jDateChooserfecha_emisionMovimientoInventario;
	public JButton jButtonfecha_emisionMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaMovimientoInventario;
	public JLabel jLabelfecha_entregaMovimientoInventario;
	//public JFormattedTextField jDateChooserfecha_entregaMovimientoInventario;

	public JDateChooser jDateChooserfecha_entregaMovimientoInventario;
	public JButton jButtonfecha_entregaMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialMovimientoInventario;
	public JLabel jLabelnumero_secuencialMovimientoInventario;
	public JTextField jTextFieldnumero_secuencialMovimientoInventario;
	public JButton jButtonnumero_secuencialMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaMovimientoInventario;
	public JLabel jLabelnumero_facturaMovimientoInventario;
	public JTextField jTextFieldnumero_facturaMovimientoInventario;
	public JButton jButtonnumero_facturaMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionMovimientoInventario;
	public JLabel jLabeldescripcionMovimientoInventario;
	public JTextArea jTextAreadescripcionMovimientoInventario;
	public JScrollPane jscrollPanedescripcionMovimientoInventario;
	public JButton jButtondescripcionMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_descuentoMovimientoInventario;
	public JLabel jLabelporcentaje_descuentoMovimientoInventario;
	public JTextField jTextFieldporcentaje_descuentoMovimientoInventario;
	public JButton jButtonporcentaje_descuentoMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelsumanMovimientoInventario;
	public JLabel jLabelsumanMovimientoInventario;
	public JTextField jTextFieldsumanMovimientoInventario;
	public JButton jButtonsumanMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneliceMovimientoInventario;
	public JLabel jLabeliceMovimientoInventario;
	public JTextField jTextFieldiceMovimientoInventario;
	public JButton jButtoniceMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelvalor_descuentoMovimientoInventario;
	public JLabel jLabelvalor_descuentoMovimientoInventario;
	public JTextField jTextFieldvalor_descuentoMovimientoInventario;
	public JButton jButtonvalor_descuentoMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoMovimientoInventario;
	public JLabel jLabeltotal_descuentoMovimientoInventario;
	public JTextField jTextFieldtotal_descuentoMovimientoInventario;
	public JButton jButtontotal_descuentoMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelivaMovimientoInventario;
	public JLabel jLabelivaMovimientoInventario;
	public JTextField jTextFieldivaMovimientoInventario;
	public JButton jButtonivaMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelstockMovimientoInventario;
	public JLabel jLabelstockMovimientoInventario;
	public JTextField jTextFieldstockMovimientoInventario;
	public JButton jButtonstockMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalMovimientoInventario;
	public JLabel jLabelsub_totalMovimientoInventario;
	public JTextField jTextFieldsub_totalMovimientoInventario;
	public JButton jButtonsub_totalMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneltotal_otroMovimientoInventario;
	public JLabel jLabeltotal_otroMovimientoInventario;
	public JTextField jTextFieldtotal_otroMovimientoInventario;
	public JButton jButtontotal_otroMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelultimo_costoMovimientoInventario;
	public JLabel jLabelultimo_costoMovimientoInventario;
	public JTextField jTextFieldultimo_costoMovimientoInventario;
	public JButton jButtonultimo_costoMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_itemsMovimientoInventario;
	public JLabel jLabelnumero_itemsMovimientoInventario;
	public JTextField jTextFieldnumero_itemsMovimientoInventario;
	public JButton jButtonnumero_itemsMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelretencionMovimientoInventario;
	public JLabel jLabelretencionMovimientoInventario;
	public JTextField jTextFieldretencionMovimientoInventario;
	public JButton jButtonretencionMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneltotalMovimientoInventario;
	public JLabel jLabeltotalMovimientoInventario;
	public JTextField jTextFieldtotalMovimientoInventario;
	public JButton jButtontotalMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelfleteMovimientoInventario;
	public JLabel jLabelfleteMovimientoInventario;
	public JTextField jTextFieldfleteMovimientoInventario;
	public JButton jButtonfleteMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelimpuestoMovimientoInventario;
	public JLabel jLabelimpuestoMovimientoInventario;
	public JTextField jTextFieldimpuestoMovimientoInventario;
	public JButton jButtonimpuestoMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelgenerico_idMovimientoInventario;
	public JLabel jLabelgenerico_idMovimientoInventario;
	public JTextField jTextFieldgenerico_idMovimientoInventario;
	public JButton jButtongenerico_idMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPaneltipo_idMovimientoInventario;
	public JLabel jLabeltipo_idMovimientoInventario;
	public JTextField jTextFieldtipo_idMovimientoInventario;
	public JButton jButtontipo_idMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteMovimientoInventario;
	public JLabel jLabelnumero_comprobanteMovimientoInventario;
	public JTextField jTextFieldnumero_comprobanteMovimientoInventario;
	public JButton jButtonnumero_comprobanteMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelfechaMovimientoInventario;
	public JLabel jLabelfechaMovimientoInventario;
	//public JFormattedTextField jDateChooserfechaMovimientoInventario;

	public JDateChooser jDateChooserfechaMovimientoInventario;
	public JButton jButtonfechaMovimientoInventarioBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaMovimientoInventario;
	public JLabel jLabelid_empresaMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaMovimientoInventario;
	public JButton jButtonid_empresaMovimientoInventario= new JButtonMe();
	public JButton jButtonid_empresaMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_empresaMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalMovimientoInventario;
	public JLabel jLabelid_sucursalMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalMovimientoInventario;
	public JButton jButtonid_sucursalMovimientoInventario= new JButtonMe();
	public JButton jButtonid_sucursalMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_sucursalMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloMovimientoInventario;
	public JLabel jLabelid_moduloMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloMovimientoInventario;
	public JButton jButtonid_moduloMovimientoInventario= new JButtonMe();
	public JButton jButtonid_moduloMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_moduloMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioMovimientoInventario;
	public JLabel jLabelid_ejercicioMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioMovimientoInventario;
	public JButton jButtonid_ejercicioMovimientoInventario= new JButtonMe();
	public JButton jButtonid_ejercicioMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoMovimientoInventario;
	public JLabel jLabelid_periodoMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoMovimientoInventario;
	public JButton jButtonid_periodoMovimientoInventario= new JButtonMe();
	public JButton jButtonid_periodoMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_periodoMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_anioMovimientoInventario;
	public JLabel jLabelid_anioMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioMovimientoInventario;
	public JButton jButtonid_anioMovimientoInventario= new JButtonMe();
	public JButton jButtonid_anioMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_anioMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_mesMovimientoInventario;
	public JLabel jLabelid_mesMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesMovimientoInventario;
	public JButton jButtonid_mesMovimientoInventario= new JButtonMe();
	public JButton jButtonid_mesMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_mesMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioMovimientoInventario;
	public JLabel jLabelid_usuarioMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioMovimientoInventario;
	public JButton jButtonid_usuarioMovimientoInventario= new JButtonMe();
	public JButton jButtonid_usuarioMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_usuarioMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_transaccionMovimientoInventario;
	public JLabel jLabelid_transaccionMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transaccionMovimientoInventario;
	public JButton jButtonid_transaccionMovimientoInventario= new JButtonMe();
	public JButton jButtonid_transaccionMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_transaccionMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaMovimientoInventario;
	public JLabel jLabelid_monedaMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaMovimientoInventario;
	public JButton jButtonid_monedaMovimientoInventario= new JButtonMe();
	public JButton jButtonid_monedaMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_monedaMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioMovimientoInventario;
	public JLabel jLabelid_tipo_cambioMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioMovimientoInventario;
	public JButton jButtonid_tipo_cambioMovimientoInventario= new JButtonMe();
	public JButton jButtonid_tipo_cambioMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_movimiento_inventarioMovimientoInventario;
	public JLabel jLabelid_estado_movimiento_inventarioMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_movimiento_inventarioMovimientoInventario;
	public JButton jButtonid_estado_movimiento_inventarioMovimientoInventario= new JButtonMe();
	public JButton jButtonid_estado_movimiento_inventarioMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoMovimientoInventario;
	public JLabel jLabelid_empleadoMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoMovimientoInventario;
	public JButton jButtonid_empleadoMovimientoInventario= new JButtonMe();
	public JButton jButtonid_empleadoMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_empleadoMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoMovimientoInventario;
	public JLabel jLabelid_formatoMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoMovimientoInventario;
	public JButton jButtonid_formatoMovimientoInventario= new JButtonMe();
	public JButton jButtonid_formatoMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_formatoMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_facturaMovimientoInventario;
	public JLabel jLabelid_facturaMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_facturaMovimientoInventario;
	public JButton jButtonid_facturaMovimientoInventario= new JButtonMe();
	public JButton jButtonid_facturaMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_facturaMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_guia_remisionMovimientoInventario;
	public JLabel jLabelid_guia_remisionMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_guia_remisionMovimientoInventario;
	public JButton jButtonid_guia_remisionMovimientoInventario= new JButtonMe();
	public JButton jButtonid_guia_remisionMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_guia_remisionMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaMovimientoInventario;
	public JLabel jLabelid_transportistaMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaMovimientoInventario;
	public JButton jButtonid_transportistaMovimientoInventario= new JButtonMe();
	public JButton jButtonid_transportistaMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_transportistaMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloMovimientoInventario;
	public JLabel jLabelid_tipo_transaccion_moduloMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloMovimientoInventario;
	public JButton jButtonid_tipo_transaccion_moduloMovimientoInventario= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_compraMovimientoInventario;
	public JLabel jLabelid_compraMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_compraMovimientoInventario;
	public JButton jButtonid_compraMovimientoInventario= new JButtonMe();
	public JButton jButtonid_compraMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_compraMovimientoInventarioBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableMovimientoInventario;
	public JLabel jLabelid_asiento_contableMovimientoInventario;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableMovimientoInventario;
	public JButton jButtonid_asiento_contableMovimientoInventario= new JButtonMe();
	public JButton jButtonid_asiento_contableMovimientoInventarioUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableMovimientoInventarioBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesMovimientoInventario;
	
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
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=535;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public MovimientoInventarioDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposMovimientoInventario=new JPanel();
				this.jPanelAccionesFormularioMovimientoInventario=new JPanel();
				this.jmenuBarDetalleMovimientoInventario=new JMenuBar();
				this.jTtoolBarDetalleMovimientoInventario=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoInventarioDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("MovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public MovimientoInventarioDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("MovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoInventarioDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoInventarioDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("MovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public MovimientoInventarioDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("MovimientoInventario No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarMovimientoInventario() {
		return this.jButtonActualizarToolBarMovimientoInventario;
	}
	
	public JButton getjButtonEliminarToolBarMovimientoInventario() {
		return this.jButtonEliminarToolBarMovimientoInventario;
	}
	
	public JButton getjButtonCancelarToolBarMovimientoInventario() {
		return this.jButtonCancelarToolBarMovimientoInventario;
	}		
	
	public JButton getjButtonProcesarInformacionMovimientoInventario() {
		return this.jButtonProcesarInformacionMovimientoInventario;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionMovimientoInventario)	{
		this.jButtonProcesarInformacionMovimientoInventario = jButtonProcesarInformacionMovimientoInventario;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesMovimientoInventario() {
		return this.jComboBoxTiposAccionesMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesMovimientoInventario(
			JComboBox jComboBoxTiposRelacionesMovimientoInventario) {
		this.jComboBoxTiposRelacionesMovimientoInventario = jComboBoxTiposRelacionesMovimientoInventario;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesMovimientoInventario(
			JComboBox jComboBoxTiposAccionesMovimientoInventario) {
		this.jComboBoxTiposAccionesMovimientoInventario = jComboBoxTiposAccionesMovimientoInventario;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioMovimientoInventario() {
		return this.jComboBoxTiposAccionesFormularioMovimientoInventario;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioMovimientoInventario(
			JComboBox jComboBoxTiposAccionesFormularioMovimientoInventario) {
		this.jComboBoxTiposAccionesFormularioMovimientoInventario = jComboBoxTiposAccionesFormularioMovimientoInventario;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.movimientoinventarioSessionBean=new MovimientoInventarioSessionBean();
		
		this.movimientoinventarioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.movimientoinventarioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.movimientoinventarioSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		MovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		MovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		MovimientoInventarioJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Movimiento Inventario MANTENIMIENTO"));
		
		
		if(iWidth > 2650) {
			iWidth=2650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {
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
	
		MovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleMovimientoInventario= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarMovimientoInventario=new JButtonMe();
				this.jButtonModificarToolBarMovimientoInventario=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"actualizar","actualizar","Actualizar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"eliminar","eliminar","Eliminar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"cancelar","cancelar","Cancelar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarMovimientoInventario=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarMovimientoInventario,this.jTtoolBarDetalleMovimientoInventario,
							"guardarcambios","guardarcambios","Guardar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleMovimientoInventario=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleMovimientoInventario=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoMovimientoInventario=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesMovimientoInventario=new JMenuMe("Acciones");
		this.jmenuDetalleDatosMovimientoInventario=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoMovimientoInventario= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoMovimientoInventario.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoMovimientoInventario,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarMovimientoInventario= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarMovimientoInventario.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarMovimientoInventario,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarMovimientoInventario= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarMovimientoInventario.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarMovimientoInventario,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarMovimientoInventario= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarMovimientoInventario.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarMovimientoInventario,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarMovimientoInventario= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarMovimientoInventario.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarMovimientoInventario,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosMovimientoInventario= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosMovimientoInventario.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosMovimientoInventario,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarMovimientoInventario= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarMovimientoInventario.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarMovimientoInventario,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarMovimientoInventario= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarMovimientoInventario.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarMovimientoInventario,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoMovimientoInventario.add(this.jMenuItemDetalleCerrarMovimientoInventario);
		
		this.jmenuDetalleAccionesMovimientoInventario.add(this.jMenuItemActualizarMovimientoInventario);
		this.jmenuDetalleAccionesMovimientoInventario.add(this.jMenuItemEliminarMovimientoInventario);
		this.jmenuDetalleAccionesMovimientoInventario.add(this.jMenuItemCancelarMovimientoInventario);		
		
		//this.jmenuDetalleDatosMovimientoInventario.add(this.jMenuItemDetalleAbrirOrderByMovimientoInventario);				
		this.jmenuDetalleDatosMovimientoInventario.add(this.jMenuItemDetalleMostarOcultarMovimientoInventario);				
				
		//this.jmenuDetalleAccionesMovimientoInventario.add(this.jMenuItemGuardarCambiosMovimientoInventario);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleMovimientoInventario.add(this.jmenuDetalleArchivoMovimientoInventario);		
		this.jmenuBarDetalleMovimientoInventario.add(this.jmenuDetalleAccionesMovimientoInventario);		
		this.jmenuBarDetalleMovimientoInventario.add(this.jmenuDetalleDatosMovimientoInventario);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleMovimientoInventario.add(this.jmenuDetalleMovimientoInventario);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposMovimientoInventario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdMovimientoInventario = new JLabelMe();
		jLabelIdMovimientoInventario.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidMovimientoInventario = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutMovimientoInventario= new GridBagLayout();

		this.jPanelidMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);

		jLabelidMovimientoInventario = new JLabel();
		jLabelidMovimientoInventario.setText("Id");

		jLabelidMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emisionMovimientoInventario = new JLabelMe();
		this.jLabelfecha_emisionMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionMovimientoInventario.setToolTipText("F Emision");
		this.jLabelfecha_emisionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelfecha_emisionMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		//jFormattedTextFieldfecha_emisionMovimientoInventario= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionMovimientoInventario= new JDateChooser();
		jDateChooserfecha_emisionMovimientoInventario.setEnabled(false);
		jDateChooserfecha_emisionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionMovimientoInventario.setDate(new Date());
		jDateChooserfecha_emisionMovimientoInventario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionMovimientoInventario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonfecha_emisionMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionMovimientoInventarioBusqueda.setText("U");
		this.jButtonfecha_emisionMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaMovimientoInventario = new JLabelMe();
		this.jLabelfecha_entregaMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaMovimientoInventario.setToolTipText("F Entrega");
		this.jLabelfecha_entregaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelfecha_entregaMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		//jFormattedTextFieldfecha_entregaMovimientoInventario= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaMovimientoInventario= new JDateChooser();
		jDateChooserfecha_entregaMovimientoInventario.setEnabled(false);
		jDateChooserfecha_entregaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaMovimientoInventario.setDate(new Date());
		jDateChooserfecha_entregaMovimientoInventario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaMovimientoInventario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonfecha_entregaMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaMovimientoInventarioBusqueda.setText("U");
		this.jButtonfecha_entregaMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_secuencialMovimientoInventario = new JLabelMe();
		this.jLabelnumero_secuencialMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialMovimientoInventario.setToolTipText("No Secuencial");
		this.jLabelnumero_secuencialMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelnumero_secuencialMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldnumero_secuencialMovimientoInventario= new JTextFieldMe();

		jTextFieldnumero_secuencialMovimientoInventario.setEnabled(false);
		jTextFieldnumero_secuencialMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_secuencialMovimientoInventario.setEnabled(false);
		this.jButtonnumero_secuencialMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialMovimientoInventarioBusqueda.setText("U");
		this.jButtonnumero_secuencialMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaMovimientoInventario = new JLabelMe();
		this.jLabelnumero_facturaMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_NUMEROFACTURA+" :");
		this.jLabelnumero_facturaMovimientoInventario.setToolTipText("No Factura");
		this.jLabelnumero_facturaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelnumero_facturaMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldnumero_facturaMovimientoInventario= new JTextFieldMe();

		jTextFieldnumero_facturaMovimientoInventario.setEnabled(false);
		jTextFieldnumero_facturaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonnumero_facturaMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaMovimientoInventarioBusqueda.setText("U");
		this.jButtonnumero_facturaMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionMovimientoInventario = new JLabelMe();
		this.jLabeldescripcionMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionMovimientoInventario.setToolTipText("Descripcion");
		this.jLabeldescripcionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPaneldescripcionMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextAreadescripcionMovimientoInventario= new JTextAreaMe();
		jTextAreadescripcionMovimientoInventario.setEnabled(false);
		jTextAreadescripcionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionMovimientoInventario.setLineWrap(true);
		jTextAreadescripcionMovimientoInventario.setWrapStyleWord(true);
		jTextAreadescripcionMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionMovimientoInventario.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionMovimientoInventario = new JScrollPane(jTextAreadescripcionMovimientoInventario);
		jscrollPanedescripcionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtondescripcionMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionMovimientoInventarioBusqueda.setText("U");
		this.jButtondescripcionMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_descuentoMovimientoInventario = new JLabelMe();
		this.jLabelporcentaje_descuentoMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_PORCENTAJEDESCUENTO+" : *");
		this.jLabelporcentaje_descuentoMovimientoInventario.setToolTipText("Descuento %");
		this.jLabelporcentaje_descuentoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_descuentoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_descuentoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_descuentoMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_PORCENTAJEDESCUENTO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelporcentaje_descuentoMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldporcentaje_descuentoMovimientoInventario= new JTextFieldMe();
		jTextFieldporcentaje_descuentoMovimientoInventario.setEnabled(false);
		jTextFieldporcentaje_descuentoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_descuentoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_descuentoMovimientoInventario.setText("0.0");

		this.jButtonporcentaje_descuentoMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonporcentaje_descuentoMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_descuentoMovimientoInventarioBusqueda.setText("U");
		this.jButtonporcentaje_descuentoMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_descuentoMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_descuentoMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_descuentoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_descuentoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_descuentoMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_descuentoMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelsumanMovimientoInventario = new JLabelMe();
		this.jLabelsumanMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanMovimientoInventario.setToolTipText("Suman");
		this.jLabelsumanMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelsumanMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldsumanMovimientoInventario= new JTextFieldMe();
		jTextFieldsumanMovimientoInventario.setEnabled(false);
		jTextFieldsumanMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanMovimientoInventario.setText("0.0");

		this.jButtonsumanMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonsumanMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanMovimientoInventarioBusqueda.setText("U");
		this.jButtonsumanMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeliceMovimientoInventario = new JLabelMe();
		this.jLabeliceMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceMovimientoInventario.setToolTipText("Ice");
		this.jLabeliceMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPaneliceMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldiceMovimientoInventario= new JTextFieldMe();
		jTextFieldiceMovimientoInventario.setEnabled(false);
		jTextFieldiceMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceMovimientoInventario.setText("0.0");

		this.jButtoniceMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtoniceMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceMovimientoInventarioBusqueda.setText("U");
		this.jButtoniceMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelvalor_descuentoMovimientoInventario = new JLabelMe();
		this.jLabelvalor_descuentoMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_VALORDESCUENTO+" : *");
		this.jLabelvalor_descuentoMovimientoInventario.setToolTipText("Descuento Valor");
		this.jLabelvalor_descuentoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_descuentoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_descuentoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_descuentoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_descuentoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_descuentoMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_VALORDESCUENTO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelvalor_descuentoMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldvalor_descuentoMovimientoInventario= new JTextFieldMe();
		jTextFieldvalor_descuentoMovimientoInventario.setEnabled(false);
		jTextFieldvalor_descuentoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_descuentoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_descuentoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_descuentoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_descuentoMovimientoInventario.setText("0.0");

		this.jButtonvalor_descuentoMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonvalor_descuentoMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_descuentoMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_descuentoMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_descuentoMovimientoInventarioBusqueda.setText("U");
		this.jButtonvalor_descuentoMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_descuentoMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_descuentoMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_descuentoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_descuentoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_descuentoMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_descuentoMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoMovimientoInventario = new JLabelMe();
		this.jLabeltotal_descuentoMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoMovimientoInventario.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPaneltotal_descuentoMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldtotal_descuentoMovimientoInventario= new JTextFieldMe();
		jTextFieldtotal_descuentoMovimientoInventario.setEnabled(false);
		jTextFieldtotal_descuentoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoMovimientoInventario.setText("0.0");

		this.jButtontotal_descuentoMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtontotal_descuentoMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoMovimientoInventarioBusqueda.setText("U");
		this.jButtontotal_descuentoMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelivaMovimientoInventario = new JLabelMe();
		this.jLabelivaMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaMovimientoInventario.setToolTipText("Iva");
		this.jLabelivaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelivaMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldivaMovimientoInventario= new JTextFieldMe();
		jTextFieldivaMovimientoInventario.setEnabled(false);
		jTextFieldivaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaMovimientoInventario.setText("0.0");

		this.jButtonivaMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonivaMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaMovimientoInventarioBusqueda.setText("U");
		this.jButtonivaMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelstockMovimientoInventario = new JLabelMe();
		this.jLabelstockMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_STOCK+" : *");
		this.jLabelstockMovimientoInventario.setToolTipText("Stock");
		this.jLabelstockMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstockMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstockMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstockMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstockMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstockMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_STOCK);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelstockMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldstockMovimientoInventario= new JTextFieldMe();
		jTextFieldstockMovimientoInventario.setEnabled(false);
		jTextFieldstockMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstockMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstockMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstockMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstockMovimientoInventario.setText("0.0");

		this.jButtonstockMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonstockMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstockMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstockMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstockMovimientoInventarioBusqueda.setText("U");
		this.jButtonstockMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstockMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstockMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstockMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstockMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stockMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstockMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalMovimientoInventario = new JLabelMe();
		this.jLabelsub_totalMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalMovimientoInventario.setToolTipText("Sub Total");
		this.jLabelsub_totalMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelsub_totalMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldsub_totalMovimientoInventario= new JTextFieldMe();
		jTextFieldsub_totalMovimientoInventario.setEnabled(false);
		jTextFieldsub_totalMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalMovimientoInventario.setText("0.0");

		this.jButtonsub_totalMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonsub_totalMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalMovimientoInventarioBusqueda.setText("U");
		this.jButtonsub_totalMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeltotal_otroMovimientoInventario = new JLabelMe();
		this.jLabeltotal_otroMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_TOTALOTRO+" : *");
		this.jLabeltotal_otroMovimientoInventario.setToolTipText("Total Otro");
		this.jLabeltotal_otroMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_otroMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_otroMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_otroMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_TOTALOTRO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPaneltotal_otroMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldtotal_otroMovimientoInventario= new JTextFieldMe();
		jTextFieldtotal_otroMovimientoInventario.setEnabled(false);
		jTextFieldtotal_otroMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_otroMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_otroMovimientoInventario.setText("0.0");

		this.jButtontotal_otroMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtontotal_otroMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_otroMovimientoInventarioBusqueda.setText("U");
		this.jButtontotal_otroMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_otroMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_otroMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_otroMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_otroMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_otroMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_otroMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelultimo_costoMovimientoInventario = new JLabelMe();
		this.jLabelultimo_costoMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_ULTIMOCOSTO+" : *");
		this.jLabelultimo_costoMovimientoInventario.setToolTipText("Ultimo Costo");
		this.jLabelultimo_costoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelultimo_costoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelultimo_costoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelultimo_costoMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_ULTIMOCOSTO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelultimo_costoMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldultimo_costoMovimientoInventario= new JTextFieldMe();
		jTextFieldultimo_costoMovimientoInventario.setEnabled(false);
		jTextFieldultimo_costoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldultimo_costoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldultimo_costoMovimientoInventario.setText("0.0");

		this.jButtonultimo_costoMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonultimo_costoMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonultimo_costoMovimientoInventarioBusqueda.setText("U");
		this.jButtonultimo_costoMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonultimo_costoMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonultimo_costoMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldultimo_costoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldultimo_costoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ultimo_costoMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonultimo_costoMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_itemsMovimientoInventario = new JLabelMe();
		this.jLabelnumero_itemsMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_NUMEROITEMS+" : *");
		this.jLabelnumero_itemsMovimientoInventario.setToolTipText("No Items");
		this.jLabelnumero_itemsMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_itemsMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_itemsMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_itemsMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_itemsMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_itemsMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_NUMEROITEMS);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelnumero_itemsMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldnumero_itemsMovimientoInventario= new JTextFieldMe();
		jTextFieldnumero_itemsMovimientoInventario.setEnabled(false);
		jTextFieldnumero_itemsMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_itemsMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_itemsMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_itemsMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_itemsMovimientoInventario.setText("0");

		this.jButtonnumero_itemsMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonnumero_itemsMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_itemsMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_itemsMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_itemsMovimientoInventarioBusqueda.setText("U");
		this.jButtonnumero_itemsMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_itemsMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_itemsMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_itemsMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_itemsMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_itemsMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_itemsMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelretencionMovimientoInventario = new JLabelMe();
		this.jLabelretencionMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_RETENCION+" : *");
		this.jLabelretencionMovimientoInventario.setToolTipText("Retencion");
		this.jLabelretencionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencionMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencionMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_RETENCION);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelretencionMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldretencionMovimientoInventario= new JTextFieldMe();
		jTextFieldretencionMovimientoInventario.setEnabled(false);
		jTextFieldretencionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencionMovimientoInventario.setText("0.0");

		this.jButtonretencionMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonretencionMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencionMovimientoInventarioBusqueda.setText("U");
		this.jButtonretencionMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencionMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencionMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencionMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencionMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencionMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencionMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeltotalMovimientoInventario = new JLabelMe();
		this.jLabeltotalMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalMovimientoInventario.setToolTipText("Total");
		this.jLabeltotalMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPaneltotalMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldtotalMovimientoInventario= new JTextFieldMe();
		jTextFieldtotalMovimientoInventario.setEnabled(false);
		jTextFieldtotalMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalMovimientoInventario.setText("0.0");

		this.jButtontotalMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtontotalMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalMovimientoInventarioBusqueda.setText("U");
		this.jButtontotalMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelfleteMovimientoInventario = new JLabelMe();
		this.jLabelfleteMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteMovimientoInventario.setToolTipText("Flete");
		this.jLabelfleteMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelfleteMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldfleteMovimientoInventario= new JTextFieldMe();
		jTextFieldfleteMovimientoInventario.setEnabled(false);
		jTextFieldfleteMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteMovimientoInventario.setText("0.0");

		this.jButtonfleteMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonfleteMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteMovimientoInventarioBusqueda.setText("U");
		this.jButtonfleteMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelimpuestoMovimientoInventario = new JLabelMe();
		this.jLabelimpuestoMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IMPUESTO+" : *");
		this.jLabelimpuestoMovimientoInventario.setToolTipText("Impuesto");
		this.jLabelimpuestoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuestoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuestoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuestoMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IMPUESTO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelimpuestoMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldimpuestoMovimientoInventario= new JTextFieldMe();
		jTextFieldimpuestoMovimientoInventario.setEnabled(false);
		jTextFieldimpuestoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuestoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuestoMovimientoInventario.setText("0.0");

		this.jButtonimpuestoMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonimpuestoMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuestoMovimientoInventarioBusqueda.setText("U");
		this.jButtonimpuestoMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuestoMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuestoMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuestoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuestoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuestoMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuestoMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelgenerico_idMovimientoInventario = new JLabelMe();
		this.jLabelgenerico_idMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_GENERICOID+" :");
		this.jLabelgenerico_idMovimientoInventario.setToolTipText("Generico Id");
		this.jLabelgenerico_idMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgenerico_idMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelgenerico_idMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelgenerico_idMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelgenerico_idMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelgenerico_idMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_GENERICOID);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelgenerico_idMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldgenerico_idMovimientoInventario= new JTextFieldMe();
		jTextFieldgenerico_idMovimientoInventario.setEnabled(false);
		jTextFieldgenerico_idMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgenerico_idMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldgenerico_idMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldgenerico_idMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldgenerico_idMovimientoInventario.setText("0");

		this.jButtongenerico_idMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtongenerico_idMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongenerico_idMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtongenerico_idMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtongenerico_idMovimientoInventarioBusqueda.setText("U");
		this.jButtongenerico_idMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtongenerico_idMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtongenerico_idMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldgenerico_idMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldgenerico_idMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"generico_idMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtongenerico_idMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabeltipo_idMovimientoInventario = new JLabelMe();
		this.jLabeltipo_idMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_TIPOID+" :");
		this.jLabeltipo_idMovimientoInventario.setToolTipText("Tipo Id");
		this.jLabeltipo_idMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_idMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltipo_idMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltipo_idMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltipo_idMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltipo_idMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_TIPOID);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPaneltipo_idMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldtipo_idMovimientoInventario= new JTextFieldMe();

		jTextFieldtipo_idMovimientoInventario.setEnabled(false);
		jTextFieldtipo_idMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipo_idMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtipo_idMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtipo_idMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtontipo_idMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtontipo_idMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_idMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontipo_idMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontipo_idMovimientoInventarioBusqueda.setText("U");
		this.jButtontipo_idMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontipo_idMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontipo_idMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtipo_idMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtipo_idMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"tipo_idMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontipo_idMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteMovimientoInventario = new JLabelMe();
		this.jLabelnumero_comprobanteMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" :");
		this.jLabelnumero_comprobanteMovimientoInventario.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelnumero_comprobanteMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jTextFieldnumero_comprobanteMovimientoInventario= new JTextFieldMe();

		jTextFieldnumero_comprobanteMovimientoInventario.setEnabled(false);
		jTextFieldnumero_comprobanteMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteMovimientoInventarioBusqueda.setText("U");
		this.jButtonnumero_comprobanteMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteMovimientoInventarioBusqueda.setVisible(false);		}


					
		this.jLabelfechaMovimientoInventario = new JLabelMe();
		this.jLabelfechaMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaMovimientoInventario.setToolTipText("Fecha");
		this.jLabelfechaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelfechaMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		//jFormattedTextFieldfechaMovimientoInventario= new JFormattedTextFieldMe();

		jDateChooserfechaMovimientoInventario= new JDateChooser();
		jDateChooserfechaMovimientoInventario.setEnabled(false);
		jDateChooserfechaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaMovimientoInventario.setDate(new Date());
		jDateChooserfechaMovimientoInventario.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaMovimientoInventario.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonfechaMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaMovimientoInventarioBusqueda.setText("U");
		this.jButtonfechaMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaMovimientoInventarioBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysMovimientoInventario() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaMovimientoInventario = new JLabelMe();
		this.jLabelid_empresaMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaMovimientoInventario.setToolTipText("Empresa");
		this.jLabelid_empresaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_empresaMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_empresaMovimientoInventario= new JComboBoxMe();
		jComboBoxid_empresaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaMovimientoInventario.setEnabled(false);

		this.jButtonid_empresaMovimientoInventario= new JButtonMe();
		this.jButtonid_empresaMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaMovimientoInventario.setText("Buscar");
		this.jButtonid_empresaMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientoInventario"));

		this.jButtonid_empresaMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_empresaMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_empresaMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_empresaMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_empresaMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaMovimientoInventarioUpdate.setText("U");
		this.jButtonid_empresaMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaMovimientoInventarioUpdate"));



					
		this.jLabelid_sucursalMovimientoInventario = new JLabelMe();
		this.jLabelid_sucursalMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalMovimientoInventario.setToolTipText("Sucursal");
		this.jLabelid_sucursalMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_sucursalMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_sucursalMovimientoInventario= new JComboBoxMe();
		jComboBoxid_sucursalMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalMovimientoInventario.setEnabled(false);

		this.jButtonid_sucursalMovimientoInventario= new JButtonMe();
		this.jButtonid_sucursalMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalMovimientoInventario.setText("Buscar");
		this.jButtonid_sucursalMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientoInventario"));

		this.jButtonid_sucursalMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_sucursalMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_sucursalMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_sucursalMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_sucursalMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalMovimientoInventarioUpdate.setText("U");
		this.jButtonid_sucursalMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalMovimientoInventarioUpdate"));



					
		this.jLabelid_moduloMovimientoInventario = new JLabelMe();
		this.jLabelid_moduloMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloMovimientoInventario.setToolTipText("Modulo");
		this.jLabelid_moduloMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_moduloMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_moduloMovimientoInventario= new JComboBoxMe();
		jComboBoxid_moduloMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloMovimientoInventario.setEnabled(false);

		this.jButtonid_moduloMovimientoInventario= new JButtonMe();
		this.jButtonid_moduloMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloMovimientoInventario.setText("Buscar");
		this.jButtonid_moduloMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloMovimientoInventario"));

		this.jButtonid_moduloMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_moduloMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_moduloMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_moduloMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_moduloMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloMovimientoInventarioUpdate.setText("U");
		this.jButtonid_moduloMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloMovimientoInventarioUpdate"));



					
		this.jLabelid_ejercicioMovimientoInventario = new JLabelMe();
		this.jLabelid_ejercicioMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioMovimientoInventario.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_ejercicioMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_ejercicioMovimientoInventario= new JComboBoxMe();
		jComboBoxid_ejercicioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioMovimientoInventario.setEnabled(false);

		this.jButtonid_ejercicioMovimientoInventario= new JButtonMe();
		this.jButtonid_ejercicioMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioMovimientoInventario.setText("Buscar");
		this.jButtonid_ejercicioMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioMovimientoInventario"));

		this.jButtonid_ejercicioMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_ejercicioMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_ejercicioMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_ejercicioMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioMovimientoInventarioUpdate.setText("U");
		this.jButtonid_ejercicioMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioMovimientoInventarioUpdate"));



					
		this.jLabelid_periodoMovimientoInventario = new JLabelMe();
		this.jLabelid_periodoMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoMovimientoInventario.setToolTipText("Periodo");
		this.jLabelid_periodoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_periodoMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_periodoMovimientoInventario= new JComboBoxMe();
		jComboBoxid_periodoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoMovimientoInventario.setEnabled(false);

		this.jButtonid_periodoMovimientoInventario= new JButtonMe();
		this.jButtonid_periodoMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoMovimientoInventario.setText("Buscar");
		this.jButtonid_periodoMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoMovimientoInventario"));

		this.jButtonid_periodoMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_periodoMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_periodoMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_periodoMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_periodoMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoMovimientoInventarioUpdate.setText("U");
		this.jButtonid_periodoMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoMovimientoInventarioUpdate"));



					
		this.jLabelid_anioMovimientoInventario = new JLabelMe();
		this.jLabelid_anioMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioMovimientoInventario.setToolTipText("Anio");
		this.jLabelid_anioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_anioMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_anioMovimientoInventario= new JComboBoxMe();
		jComboBoxid_anioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioMovimientoInventario.setEnabled(false);

		this.jButtonid_anioMovimientoInventario= new JButtonMe();
		this.jButtonid_anioMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioMovimientoInventario.setText("Buscar");
		this.jButtonid_anioMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioMovimientoInventario"));

		this.jButtonid_anioMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_anioMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_anioMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_anioMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_anioMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioMovimientoInventarioUpdate.setText("U");
		this.jButtonid_anioMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioMovimientoInventarioUpdate"));



					
		this.jLabelid_mesMovimientoInventario = new JLabelMe();
		this.jLabelid_mesMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesMovimientoInventario.setToolTipText("Mes");
		this.jLabelid_mesMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_mesMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_mesMovimientoInventario= new JComboBoxMe();
		jComboBoxid_mesMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesMovimientoInventario.setEnabled(false);

		this.jButtonid_mesMovimientoInventario= new JButtonMe();
		this.jButtonid_mesMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesMovimientoInventario.setText("Buscar");
		this.jButtonid_mesMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesMovimientoInventario"));

		this.jButtonid_mesMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_mesMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_mesMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_mesMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_mesMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesMovimientoInventarioUpdate.setText("U");
		this.jButtonid_mesMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesMovimientoInventarioUpdate"));



					
		this.jLabelid_usuarioMovimientoInventario = new JLabelMe();
		this.jLabelid_usuarioMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioMovimientoInventario.setToolTipText("Usuario");
		this.jLabelid_usuarioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_usuarioMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_usuarioMovimientoInventario= new JComboBoxMe();
		jComboBoxid_usuarioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioMovimientoInventario.setEnabled(false);

		this.jButtonid_usuarioMovimientoInventario= new JButtonMe();
		this.jButtonid_usuarioMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioMovimientoInventario.setText("Buscar");
		this.jButtonid_usuarioMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioMovimientoInventario"));

		this.jButtonid_usuarioMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_usuarioMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_usuarioMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_usuarioMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_usuarioMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioMovimientoInventarioUpdate.setText("U");
		this.jButtonid_usuarioMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioMovimientoInventarioUpdate"));



					
		this.jLabelid_transaccionMovimientoInventario = new JLabelMe();
		this.jLabelid_transaccionMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDTRANSACCION+" : *");
		this.jLabelid_transaccionMovimientoInventario.setToolTipText("Tipo");
		this.jLabelid_transaccionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transaccionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transaccionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transaccionMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transaccionMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDTRANSACCION);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_transaccionMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_transaccionMovimientoInventario= new JComboBoxMe();
		jComboBoxid_transaccionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transaccionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transaccionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transaccionMovimientoInventario= new JButtonMe();
		this.jButtonid_transaccionMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transaccionMovimientoInventario.setText("Buscar");
		this.jButtonid_transaccionMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transaccionMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transaccionMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionMovimientoInventario"));

		this.jButtonid_transaccionMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_transaccionMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_transaccionMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transaccionMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transaccionMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transaccionMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_transaccionMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_transaccionMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transaccionMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transaccionMovimientoInventarioUpdate.setText("U");
		this.jButtonid_transaccionMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transaccionMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transaccionMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transaccionMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transaccionMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transaccionMovimientoInventarioUpdate"));



					
		this.jLabelid_monedaMovimientoInventario = new JLabelMe();
		this.jLabelid_monedaMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaMovimientoInventario.setToolTipText("Moneda");
		this.jLabelid_monedaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_monedaMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_monedaMovimientoInventario= new JComboBoxMe();
		jComboBoxid_monedaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaMovimientoInventario= new JButtonMe();
		this.jButtonid_monedaMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaMovimientoInventario.setText("Buscar");
		this.jButtonid_monedaMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaMovimientoInventario"));

		this.jButtonid_monedaMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_monedaMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_monedaMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_monedaMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_monedaMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaMovimientoInventarioUpdate.setText("U");
		this.jButtonid_monedaMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaMovimientoInventarioUpdate"));



					
		this.jLabelid_tipo_cambioMovimientoInventario = new JLabelMe();
		this.jLabelid_tipo_cambioMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioMovimientoInventario.setToolTipText("T Cambio");
		this.jLabelid_tipo_cambioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_tipo_cambioMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_tipo_cambioMovimientoInventario= new JComboBoxMe();
		jComboBoxid_tipo_cambioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cambioMovimientoInventario= new JButtonMe();
		this.jButtonid_tipo_cambioMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioMovimientoInventario.setText("Buscar");
		this.jButtonid_tipo_cambioMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioMovimientoInventario"));

		this.jButtonid_tipo_cambioMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_tipo_cambioMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioMovimientoInventarioUpdate.setText("U");
		this.jButtonid_tipo_cambioMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioMovimientoInventarioUpdate"));



					
		this.jLabelid_estado_movimiento_inventarioMovimientoInventario = new JLabelMe();
		this.jLabelid_estado_movimiento_inventarioMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDESTADOMOVIMIENTOINVENTARIO+" : *");
		this.jLabelid_estado_movimiento_inventarioMovimientoInventario.setToolTipText("Estado");
		this.jLabelid_estado_movimiento_inventarioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_movimiento_inventarioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_movimiento_inventarioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_movimiento_inventarioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_movimiento_inventarioMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_movimiento_inventarioMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDESTADOMOVIMIENTOINVENTARIO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_estado_movimiento_inventarioMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_estado_movimiento_inventarioMovimientoInventario= new JComboBoxMe();
		jComboBoxid_estado_movimiento_inventarioMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_movimiento_inventarioMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_movimiento_inventarioMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_movimiento_inventarioMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_movimiento_inventarioMovimientoInventario.setEnabled(false);

		this.jButtonid_estado_movimiento_inventarioMovimientoInventario= new JButtonMe();
		this.jButtonid_estado_movimiento_inventarioMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_movimiento_inventarioMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_movimiento_inventarioMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_movimiento_inventarioMovimientoInventario.setText("Buscar");
		this.jButtonid_estado_movimiento_inventarioMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_movimiento_inventarioMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_movimiento_inventarioMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_movimiento_inventarioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_movimiento_inventarioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_movimiento_inventarioMovimientoInventario"));

		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_movimiento_inventarioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_movimiento_inventarioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_movimiento_inventarioMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_movimiento_inventarioMovimientoInventarioUpdate.setText("U");
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_movimiento_inventarioMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_movimiento_inventarioMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_movimiento_inventarioMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_movimiento_inventarioMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_movimiento_inventarioMovimientoInventarioUpdate"));



					
		this.jLabelid_empleadoMovimientoInventario = new JLabelMe();
		this.jLabelid_empleadoMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoMovimientoInventario.setToolTipText("Empleado");
		this.jLabelid_empleadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_empleadoMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_empleadoMovimientoInventario= new JComboBoxMe();
		jComboBoxid_empleadoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoMovimientoInventario= new JButtonMe();
		this.jButtonid_empleadoMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoMovimientoInventario.setText("Buscar");
		this.jButtonid_empleadoMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoMovimientoInventario"));

		this.jButtonid_empleadoMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_empleadoMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_empleadoMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_empleadoMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_empleadoMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoMovimientoInventarioUpdate.setText("U");
		this.jButtonid_empleadoMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoMovimientoInventarioUpdate"));



					
		this.jLabelid_formatoMovimientoInventario = new JLabelMe();
		this.jLabelid_formatoMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoMovimientoInventario.setToolTipText("Formato");
		this.jLabelid_formatoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_formatoMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_formatoMovimientoInventario= new JComboBoxMe();
		jComboBoxid_formatoMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoMovimientoInventario= new JButtonMe();
		this.jButtonid_formatoMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoMovimientoInventario.setText("Buscar");
		this.jButtonid_formatoMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoMovimientoInventario"));

		this.jButtonid_formatoMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_formatoMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_formatoMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_formatoMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_formatoMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoMovimientoInventarioUpdate.setText("U");
		this.jButtonid_formatoMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoMovimientoInventarioUpdate"));



					
		this.jLabelid_facturaMovimientoInventario = new JLabelMe();
		this.jLabelid_facturaMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDFACTURA+" :");
		this.jLabelid_facturaMovimientoInventario.setToolTipText("Factura");
		this.jLabelid_facturaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_facturaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_facturaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_facturaMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_facturaMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDFACTURA);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_facturaMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_facturaMovimientoInventario= new JComboBoxMe();
		jComboBoxid_facturaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_facturaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_facturaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_facturaMovimientoInventario.setEnabled(false);

		this.jButtonid_facturaMovimientoInventario= new JButtonMe();
		this.jButtonid_facturaMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_facturaMovimientoInventario.setText("Buscar");
		this.jButtonid_facturaMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_facturaMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_facturaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaMovimientoInventario"));

		this.jButtonid_facturaMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_facturaMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_facturaMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_facturaMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_facturaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_facturaMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_facturaMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_facturaMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_facturaMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_facturaMovimientoInventarioUpdate.setText("U");
		this.jButtonid_facturaMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_facturaMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_facturaMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_facturaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_facturaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_facturaMovimientoInventarioUpdate"));



					
		this.jLabelid_guia_remisionMovimientoInventario = new JLabelMe();
		this.jLabelid_guia_remisionMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDGUIAREMISION+" :");
		this.jLabelid_guia_remisionMovimientoInventario.setToolTipText("Guia Remision");
		this.jLabelid_guia_remisionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_guia_remisionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_guia_remisionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_guia_remisionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_guia_remisionMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_guia_remisionMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDGUIAREMISION);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_guia_remisionMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_guia_remisionMovimientoInventario= new JComboBoxMe();
		jComboBoxid_guia_remisionMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_guia_remisionMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_guia_remisionMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_guia_remisionMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_guia_remisionMovimientoInventario.setEnabled(false);

		this.jButtonid_guia_remisionMovimientoInventario= new JButtonMe();
		this.jButtonid_guia_remisionMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_guia_remisionMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_guia_remisionMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_guia_remisionMovimientoInventario.setText("Buscar");
		this.jButtonid_guia_remisionMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_guia_remisionMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_guia_remisionMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_guia_remisionMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_guia_remisionMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_guia_remisionMovimientoInventario"));

		this.jButtonid_guia_remisionMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_guia_remisionMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_guia_remisionMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_guia_remisionMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_guia_remisionMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_guia_remisionMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_guia_remisionMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_guia_remisionMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_guia_remisionMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_guia_remisionMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_guia_remisionMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_guia_remisionMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_guia_remisionMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_guia_remisionMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_guia_remisionMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_guia_remisionMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_guia_remisionMovimientoInventarioUpdate.setText("U");
		this.jButtonid_guia_remisionMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_guia_remisionMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_guia_remisionMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_guia_remisionMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_guia_remisionMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_guia_remisionMovimientoInventarioUpdate"));



					
		this.jLabelid_transportistaMovimientoInventario = new JLabelMe();
		this.jLabelid_transportistaMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDTRANSPORTISTA+" :");
		this.jLabelid_transportistaMovimientoInventario.setToolTipText("Transportista");
		this.jLabelid_transportistaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_transportistaMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_transportistaMovimientoInventario= new JComboBoxMe();
		jComboBoxid_transportistaMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportistaMovimientoInventario= new JButtonMe();
		this.jButtonid_transportistaMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaMovimientoInventario.setText("Buscar");
		this.jButtonid_transportistaMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaMovimientoInventario"));

		this.jButtonid_transportistaMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_transportistaMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_transportistaMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_transportistaMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_transportistaMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaMovimientoInventarioUpdate.setText("U");
		this.jButtonid_transportistaMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaMovimientoInventarioUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloMovimientoInventario = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloMovimientoInventario.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_tipo_transaccion_moduloMovimientoInventario= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloMovimientoInventario.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloMovimientoInventario= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloMovimientoInventario.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloMovimientoInventario"));

		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloMovimientoInventarioUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloMovimientoInventarioUpdate"));



					
		this.jLabelid_compraMovimientoInventario = new JLabelMe();
		this.jLabelid_compraMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDCOMPRA+" :");
		this.jLabelid_compraMovimientoInventario.setToolTipText("Compra");
		this.jLabelid_compraMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_compraMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_compraMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_compraMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_compraMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_compraMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDCOMPRA);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_compraMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_compraMovimientoInventario= new JComboBoxMe();
		jComboBoxid_compraMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_compraMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_compraMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_compraMovimientoInventario.setEnabled(false);

		this.jButtonid_compraMovimientoInventario= new JButtonMe();
		this.jButtonid_compraMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_compraMovimientoInventario.setText("Buscar");
		this.jButtonid_compraMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_compraMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_compraMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraMovimientoInventario"));

		this.jButtonid_compraMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_compraMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_compraMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_compraMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_compraMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_compraMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_compraMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_compraMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_compraMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_compraMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_compraMovimientoInventarioUpdate.setText("U");
		this.jButtonid_compraMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_compraMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_compraMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_compraMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_compraMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_compraMovimientoInventarioUpdate"));



					
		this.jLabelid_asiento_contableMovimientoInventario = new JLabelMe();
		this.jLabelid_asiento_contableMovimientoInventario.setText(""+MovimientoInventarioConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableMovimientoInventario.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableMovimientoInventario=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableMovimientoInventario.setToolTipText(MovimientoInventarioConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutMovimientoInventario = new GridBagLayout();
		this.jPanelid_asiento_contableMovimientoInventario.setLayout(this.gridaBagLayoutMovimientoInventario);


		jComboBoxid_asiento_contableMovimientoInventario= new JComboBoxMe();
		jComboBoxid_asiento_contableMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableMovimientoInventario.setEnabled(false);

		this.jButtonid_asiento_contableMovimientoInventario= new JButtonMe();
		this.jButtonid_asiento_contableMovimientoInventario.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableMovimientoInventario.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableMovimientoInventario.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableMovimientoInventario.setText("Buscar");
		this.jButtonid_asiento_contableMovimientoInventario.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableMovimientoInventario.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableMovimientoInventario,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableMovimientoInventario"));

		this.jButtonid_asiento_contableMovimientoInventarioBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableMovimientoInventarioBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableMovimientoInventarioBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableMovimientoInventarioBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableMovimientoInventarioBusqueda.setText("U");
		this.jButtonid_asiento_contableMovimientoInventarioBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableMovimientoInventarioBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableMovimientoInventarioBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableMovimientoInventarioBusqueda"));

		if(this.movimientoinventarioSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableMovimientoInventarioBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableMovimientoInventarioUpdate= new JButtonMe();
		this.jButtonid_asiento_contableMovimientoInventarioUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableMovimientoInventarioUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableMovimientoInventarioUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableMovimientoInventarioUpdate.setText("U");
		this.jButtonid_asiento_contableMovimientoInventarioUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableMovimientoInventarioUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableMovimientoInventarioUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableMovimientoInventario.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableMovimientoInventario.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableMovimientoInventarioUpdate"));



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
		//this.jInternalFrameDetalleMovimientoInventario = new MovimientoInventarioBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Movimiento Inventario DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutMovimientoInventario= new GridBagLayout();
		

		
		String sToolTipMovimientoInventario="";
		sToolTipMovimientoInventario=MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipMovimientoInventario+="(Inventario.MovimientoInventario)";
		}
		
		if(!this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			sToolTipMovimientoInventario+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoMovimientoInventario = new JButtonMe();
		this.jButtonModificarMovimientoInventario = new JButtonMe();
        this.jButtonActualizarMovimientoInventario = new JButtonMe();
        this.jButtonEliminarMovimientoInventario = new JButtonMe();
        this.jButtonCancelarMovimientoInventario = new JButtonMe();
        this.jButtonGuardarCambiosMovimientoInventario = new JButtonMe();
		this.jButtonGuardarCambiosTablaMovimientoInventario = new JButtonMe();
		this.jButtonCerrarMovimientoInventario = new JButtonMe();
		
		this.jScrollPanelDatosMovimientoInventario = new JScrollPane();   
        this.jScrollPanelDatosEdicionMovimientoInventario = new JScrollPane();
		this.jScrollPanelDatosGeneralMovimientoInventario = new JScrollPane();
				
		
		
		this.jPanelCamposMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Movimiento Inventario";
		
		if(!this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Movimiento Inventarios" + this.sPath));
		} else {
			this.jScrollPanelDatosMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposMovimientoInventario.setName("jPanelCamposMovimientoInventario"); 

		this.jPanelCamposOcultosMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosMovimientoInventario.setName("jPanelCamposOcultosMovimientoInventario"); 

        this.jPanelAccionesMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesMovimientoInventario.setName("Acciones"); 

		this.jPanelAccionesFormularioMovimientoInventario.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioMovimientoInventario.setToolTipText("Acciones");
        this.jPanelAccionesFormularioMovimientoInventario.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalMovimientoInventario.setName("jPanelCamposFintotalMovimientoInventario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciogeneralMovimientoInventario.setName("jPanelCamposFingeneralMovimientoInventario");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoMovimientoInventario.setText("Nuevo");
		this.jButtonModificarMovimientoInventario.setText("Editar");
        this.jButtonActualizarMovimientoInventario.setText("Actualizar");
        this.jButtonEliminarMovimientoInventario.setText("Eliminar");
        this.jButtonCancelarMovimientoInventario.setText("Cancelar");
        this.jButtonGuardarCambiosMovimientoInventario.setText("Guardar");
		this.jButtonGuardarCambiosTablaMovimientoInventario.setText("Guardar");
		this.jButtonCerrarMovimientoInventario.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoMovimientoInventario,"nuevo_button","Nuevo",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarMovimientoInventario,"modificar_button","Editar",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarMovimientoInventario,"actualizar_button","Actualizar",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarMovimientoInventario,"eliminar_button","Eliminar",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarMovimientoInventario,"cancelar_button","Cancelar",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosMovimientoInventario,"guardarcambios_button","Guardar",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaMovimientoInventario,"guardarcambiostabla_button","Guardar",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarMovimientoInventario,"cerrar_button","Salir",this.movimientoinventarioSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoMovimientoInventario.setToolTipText("Nuevo"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarMovimientoInventario.setToolTipText("Editar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarMovimientoInventario.setToolTipText("Actualizar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarMovimientoInventario.setToolTipText("Eliminar)"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarMovimientoInventario.setToolTipText("Cancelar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosMovimientoInventario.setToolTipText("Guardar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaMovimientoInventario.setToolTipText("Guardar"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarMovimientoInventario.setToolTipText("Salir"+" "+MovimientoInventarioConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoMovimientoInventario";
		inputMap = this.jButtonNuevoMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoMovimientoInventario.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoMovimientoInventario"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarMovimientoInventario";
		inputMap = this.jButtonActualizarMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarMovimientoInventario"));
		
		//ELIMINAR
		sMapKey = "EliminarMovimientoInventario";
		inputMap = this.jButtonEliminarMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarMovimientoInventario"));
		
		//CANCELAR	
		sMapKey = "CancelarMovimientoInventario";
		inputMap = this.jButtonCancelarMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarMovimientoInventario"));
		
		//CERRAR		
		sMapKey = "CerrarMovimientoInventario";
		inputMap = this.jButtonCerrarMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarMovimientoInventario"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaMovimientoInventario";
		inputMap = this.jButtonGuardarCambiosTablaMovimientoInventario.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaMovimientoInventario.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaMovimientoInventario"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoMovimientoInventario.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoMovimientoInventario.setToolTipText("Nuevo MovimientoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarMovimientoInventario.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarMovimientoInventario.setToolTipText("Sin Cerrar Ventana MovimientoInventario");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeMovimientoInventario = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeMovimientoInventario.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeMovimientoInventario.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesMovimientoInventario.setText("Accion");
		this.jComboBoxTiposAccionesMovimientoInventario.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioMovimientoInventario = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioMovimientoInventario.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioMovimientoInventario.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesMovimientoInventario = new JLabelMe();
		
		this.jLabelAccionesMovimientoInventario.setText("Acciones");		
		this.jLabelAccionesMovimientoInventario.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientoInventario.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesMovimientoInventario.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposMovimientoInventario();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysMovimientoInventario();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesMovimientoInventario=new JTabbedPane();
		this.jTabbedPaneRelacionesMovimientoInventario.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesMovimientoInventario,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesMovimientoInventario.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientoInventario.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesMovimientoInventario.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesMovimientoInventario, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioMovimientoInventario.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMovimientoInventario.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioMovimientoInventario.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioMovimientoInventario, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposMovimientoInventario = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosMovimientoInventario = new GridBagLayout();
		
		this.jPanelCamposMovimientoInventario.setLayout(gridaBagLayoutCamposMovimientoInventario);
		this.jPanelCamposOcultosMovimientoInventario.setLayout(gridaBagLayoutCamposOcultosMovimientoInventario);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalMovimientoInventario= new GridBagLayout();
		this.jPanelCamposFintotalMovimientoInventario.setLayout(gridaBagLayoutCamposFintotalMovimientoInventario);

		GridBagLayout gridaBagLayoutCamposIniciogeneralMovimientoInventario= new GridBagLayout();
		this.jPanelCamposIniciogeneralMovimientoInventario.setLayout(gridaBagLayoutCamposIniciogeneralMovimientoInventario);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidMovimientoInventario.add(jLabelIdMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidMovimientoInventario.add(jLabelidMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaMovimientoInventario.add(jLabelid_empresaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMovimientoInventario.add(jButtonid_empresaMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaMovimientoInventario.add(jButtonid_empresaMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaMovimientoInventario.add(jComboBoxid_empresaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalMovimientoInventario.add(jLabelid_sucursalMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMovimientoInventario.add(jButtonid_sucursalMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalMovimientoInventario.add(jButtonid_sucursalMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalMovimientoInventario.add(jComboBoxid_sucursalMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloMovimientoInventario.add(jLabelid_moduloMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloMovimientoInventario.add(jButtonid_moduloMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloMovimientoInventario.add(jButtonid_moduloMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloMovimientoInventario.add(jComboBoxid_moduloMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioMovimientoInventario.add(jLabelid_ejercicioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioMovimientoInventario.add(jButtonid_ejercicioMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioMovimientoInventario.add(jButtonid_ejercicioMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioMovimientoInventario.add(jComboBoxid_ejercicioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoMovimientoInventario.add(jLabelid_periodoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoMovimientoInventario.add(jButtonid_periodoMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoMovimientoInventario.add(jButtonid_periodoMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoMovimientoInventario.add(jComboBoxid_periodoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioMovimientoInventario.add(jLabelid_anioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioMovimientoInventario.add(jButtonid_anioMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioMovimientoInventario.add(jButtonid_anioMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioMovimientoInventario.add(jComboBoxid_anioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesMovimientoInventario.add(jLabelid_mesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesMovimientoInventario.add(jButtonid_mesMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesMovimientoInventario.add(jButtonid_mesMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesMovimientoInventario.add(jComboBoxid_mesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioMovimientoInventario.add(jLabelid_usuarioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioMovimientoInventario.add(jButtonid_usuarioMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioMovimientoInventario.add(jButtonid_usuarioMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioMovimientoInventario.add(jComboBoxid_usuarioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transaccionMovimientoInventario.add(jLabelid_transaccionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionMovimientoInventario.add(jButtonid_transaccionMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transaccionMovimientoInventario.add(jButtonid_transaccionMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transaccionMovimientoInventario.add(jComboBoxid_transaccionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionMovimientoInventario.add(jLabelfecha_emisionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionMovimientoInventario.add(jButtonfecha_emisionMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionMovimientoInventario.add(jDateChooserfecha_emisionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_entregaMovimientoInventario.add(jLabelfecha_entregaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaMovimientoInventario.add(jButtonfecha_entregaMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_entregaMovimientoInventario.add(jDateChooserfecha_entregaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_secuencialMovimientoInventario.add(jLabelnumero_secuencialMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialMovimientoInventario.add(jButtonnumero_secuencialMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_secuencialMovimientoInventario.add(jTextFieldnumero_secuencialMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaMovimientoInventario.add(jLabelid_monedaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaMovimientoInventario.add(jButtonid_monedaMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaMovimientoInventario.add(jButtonid_monedaMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaMovimientoInventario.add(jComboBoxid_monedaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_cambioMovimientoInventario.add(jLabelid_tipo_cambioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 2;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioMovimientoInventario.add(jButtonid_tipo_cambioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioMovimientoInventario.add(jButtonid_tipo_cambioMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 4;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioMovimientoInventario.add(jButtonid_tipo_cambioMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_cambioMovimientoInventario.add(jComboBoxid_tipo_cambioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_movimiento_inventarioMovimientoInventario.add(jLabelid_estado_movimiento_inventarioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_movimiento_inventarioMovimientoInventario.add(jButtonid_estado_movimiento_inventarioMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_movimiento_inventarioMovimientoInventario.add(jButtonid_estado_movimiento_inventarioMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_movimiento_inventarioMovimientoInventario.add(jComboBoxid_estado_movimiento_inventarioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleadoMovimientoInventario.add(jLabelid_empleadoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 2;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoMovimientoInventario.add(jButtonid_empleadoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoMovimientoInventario.add(jButtonid_empleadoMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 4;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoMovimientoInventario.add(jButtonid_empleadoMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleadoMovimientoInventario.add(jComboBoxid_empleadoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoMovimientoInventario.add(jLabelid_formatoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoMovimientoInventario.add(jButtonid_formatoMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoMovimientoInventario.add(jButtonid_formatoMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoMovimientoInventario.add(jComboBoxid_formatoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_facturaMovimientoInventario.add(jLabelid_facturaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 2;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_facturaMovimientoInventario.add(jButtonid_facturaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaMovimientoInventario.add(jButtonid_facturaMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 4;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_facturaMovimientoInventario.add(jButtonid_facturaMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_facturaMovimientoInventario.add(jComboBoxid_facturaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_facturaMovimientoInventario.add(jLabelnumero_facturaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaMovimientoInventario.add(jButtonnumero_facturaMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_facturaMovimientoInventario.add(jTextFieldnumero_facturaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_guia_remisionMovimientoInventario.add(jLabelid_guia_remisionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_guia_remisionMovimientoInventario.add(jButtonid_guia_remisionMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_guia_remisionMovimientoInventario.add(jButtonid_guia_remisionMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_guia_remisionMovimientoInventario.add(jComboBoxid_guia_remisionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transportistaMovimientoInventario.add(jLabelid_transportistaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaMovimientoInventario.add(jButtonid_transportistaMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaMovimientoInventario.add(jButtonid_transportistaMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transportistaMovimientoInventario.add(jComboBoxid_transportistaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionMovimientoInventario.add(jLabeldescripcionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionMovimientoInventario.add(jButtondescripcionMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionMovimientoInventario.add(jscrollPanedescripcionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelporcentaje_descuentoMovimientoInventario.add(jLabelporcentaje_descuentoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_descuentoMovimientoInventario.add(jButtonporcentaje_descuentoMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelporcentaje_descuentoMovimientoInventario.add(jTextFieldporcentaje_descuentoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsumanMovimientoInventario.add(jLabelsumanMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanMovimientoInventario.add(jButtonsumanMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsumanMovimientoInventario.add(jTextFieldsumanMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliceMovimientoInventario.add(jLabeliceMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceMovimientoInventario.add(jButtoniceMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliceMovimientoInventario.add(jTextFieldiceMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_descuentoMovimientoInventario.add(jLabelvalor_descuentoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_descuentoMovimientoInventario.add(jButtonvalor_descuentoMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_descuentoMovimientoInventario.add(jTextFieldvalor_descuentoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_descuentoMovimientoInventario.add(jLabeltotal_descuentoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoMovimientoInventario.add(jButtontotal_descuentoMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_descuentoMovimientoInventario.add(jTextFieldtotal_descuentoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaMovimientoInventario.add(jLabelivaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaMovimientoInventario.add(jButtonivaMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaMovimientoInventario.add(jTextFieldivaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelstockMovimientoInventario.add(jLabelstockMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelstockMovimientoInventario.add(jButtonstockMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelstockMovimientoInventario.add(jTextFieldstockMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsub_totalMovimientoInventario.add(jLabelsub_totalMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalMovimientoInventario.add(jButtonsub_totalMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsub_totalMovimientoInventario.add(jTextFieldsub_totalMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_otroMovimientoInventario.add(jLabeltotal_otroMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_otroMovimientoInventario.add(jButtontotal_otroMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_otroMovimientoInventario.add(jTextFieldtotal_otroMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelultimo_costoMovimientoInventario.add(jLabelultimo_costoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelultimo_costoMovimientoInventario.add(jButtonultimo_costoMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelultimo_costoMovimientoInventario.add(jTextFieldultimo_costoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_itemsMovimientoInventario.add(jLabelnumero_itemsMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_itemsMovimientoInventario.add(jButtonnumero_itemsMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_itemsMovimientoInventario.add(jTextFieldnumero_itemsMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelretencionMovimientoInventario.add(jLabelretencionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencionMovimientoInventario.add(jButtonretencionMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelretencionMovimientoInventario.add(jTextFieldretencionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalMovimientoInventario.add(jLabeltotalMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalMovimientoInventario.add(jButtontotalMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalMovimientoInventario.add(jTextFieldtotalMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfleteMovimientoInventario.add(jLabelfleteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteMovimientoInventario.add(jButtonfleteMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfleteMovimientoInventario.add(jTextFieldfleteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelimpuestoMovimientoInventario.add(jLabelimpuestoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuestoMovimientoInventario.add(jButtonimpuestoMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelimpuestoMovimientoInventario.add(jTextFieldimpuestoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_transaccion_moduloMovimientoInventario.add(jLabelid_tipo_transaccion_moduloMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloMovimientoInventario.add(jButtonid_tipo_transaccion_moduloMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloMovimientoInventario.add(jButtonid_tipo_transaccion_moduloMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_transaccion_moduloMovimientoInventario.add(jComboBoxid_tipo_transaccion_moduloMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_compraMovimientoInventario.add(jLabelid_compraMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_compraMovimientoInventario.add(jButtonid_compraMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_compraMovimientoInventario.add(jButtonid_compraMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_compraMovimientoInventario.add(jComboBoxid_compraMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableMovimientoInventario.add(jLabelid_asiento_contableMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 2;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableMovimientoInventario.add(jButtonid_asiento_contableMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 3;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableMovimientoInventario.add(jButtonid_asiento_contableMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 4;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableMovimientoInventario.add(jButtonid_asiento_contableMovimientoInventarioUpdate, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableMovimientoInventario.add(jComboBoxid_asiento_contableMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelgenerico_idMovimientoInventario.add(jLabelgenerico_idMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelgenerico_idMovimientoInventario.add(jButtongenerico_idMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelgenerico_idMovimientoInventario.add(jTextFieldgenerico_idMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltipo_idMovimientoInventario.add(jLabeltipo_idMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPaneltipo_idMovimientoInventario.add(jButtontipo_idMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltipo_idMovimientoInventario.add(jTextFieldtipo_idMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_comprobanteMovimientoInventario.add(jLabelnumero_comprobanteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteMovimientoInventario.add(jButtonnumero_comprobanteMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_comprobanteMovimientoInventario.add(jTextFieldnumero_comprobanteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 0;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaMovimientoInventario.add(jLabelfechaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		//this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = 2;
		this.gridBagConstraintsMovimientoInventario.ipadx = 0;
		this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaMovimientoInventario.add(jButtonfechaMovimientoInventarioBusqueda, this.gridBagConstraintsMovimientoInventario);
	}

	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsMovimientoInventario.gridy = 0;
	this.gridBagConstraintsMovimientoInventario.gridx = 1;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaMovimientoInventario.add(jDateChooserfechaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_empresaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_sucursalMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_moduloMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_ejercicioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_periodoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_anioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_mesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_usuarioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_facturaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelnumero_facturaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_guia_remisionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelfleteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelimpuestoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_tipo_transaccion_moduloMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_compraMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelid_asiento_contableMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelgenerico_idMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPaneltipo_idMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelnumero_comprobanteMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposOcultosMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposOcultosMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosMovimientoInventario.add(this.jPanelfechaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposOcultosMovimientoInventario % 3==0) {
		iXPanelCamposOcultosMovimientoInventario=0;
		iYPanelCamposOcultosMovimientoInventario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelidMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelid_transaccionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelfecha_emisionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelfecha_entregaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelnumero_secuencialMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelid_monedaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelid_tipo_cambioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelid_estado_movimiento_inventarioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelid_empleadoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelid_formatoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPanelid_transportistaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposIniciogeneralMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposIniciogeneralMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralMovimientoInventario.add(this.jPaneldescripcionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposIniciogeneralMovimientoInventario % 3==0) {
		iXPanelCamposIniciogeneralMovimientoInventario=0;
		iYPanelCamposIniciogeneralMovimientoInventario++;
	}
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPanelporcentaje_descuentoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPanelsumanMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPaneliceMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPanelvalor_descuentoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPaneltotal_descuentoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPanelivaMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPanelstockMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPanelsub_totalMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPaneltotal_otroMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPanelultimo_costoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPanelnumero_itemsMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPanelretencionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
	}
	this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
	//NUM X EXTRA
	iXPanelCamposFintotalMovimientoInventario+=2;
	this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsMovimientoInventario.gridy = iYPanelCamposFintotalMovimientoInventario;
	this.gridBagConstraintsMovimientoInventario.gridx = iXPanelCamposFintotalMovimientoInventario++;
	this.gridBagConstraintsMovimientoInventario.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsMovimientoInventario.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalMovimientoInventario.add(this.jPaneltotalMovimientoInventario, this.gridBagConstraintsMovimientoInventario);



	if(iXPanelCamposFintotalMovimientoInventario % 3==0) {
		iXPanelCamposFintotalMovimientoInventario=0;
		iYPanelCamposFintotalMovimientoInventario++;
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
			
		GridBagLayout gridaBagLayoutAccionesMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesMovimientoInventario.setLayout(gridaBagLayoutAccionesMovimientoInventario);
		
		GridBagLayout gridaBagLayoutAccionesFormularioMovimientoInventario= new GridBagLayout();
		this.jPanelAccionesFormularioMovimientoInventario.setLayout(gridaBagLayoutAccionesFormularioMovimientoInventario);
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMovimientoInventario.add(this.jComboBoxTiposAccionesFormularioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioMovimientoInventario.add(this.jCheckBoxPostAccionNuevoMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.movimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMovimientoInventario.add(this.jCheckBoxPostAccionSinCerrarMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.movimientoinventarioSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.movimientoinventarioSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsMovimientoInventario.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioMovimientoInventario.add(this.jCheckBoxPostAccionSinMensajeMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccion++;
			
		this.jPanelAccionesMovimientoInventario.add(this.jButtonModificarMovimientoInventario, this.gridBagConstraintsMovimientoInventario);							

		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsMovimientoInventario.gridy = 0;
		this.gridBagConstraintsMovimientoInventario.gridx =iPosXAccion++;
			
		this.jPanelAccionesMovimientoInventario.add(this.jButtonEliminarMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
			
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesMovimientoInventario.add(this.jButtonActualizarMovimientoInventario, this.gridBagConstraintsMovimientoInventario);


		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsMovimientoInventario.gridx = iPosXAccion++;
		
		this.jPanelAccionesMovimientoInventario.add(this.jButtonGuardarCambiosMovimientoInventario, this.gridBagConstraintsMovimientoInventario);	
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = 0;		
		this.gridBagConstraintsMovimientoInventario.gridx =iPosXAccion++;
		
		this.jPanelAccionesMovimientoInventario.add(this.jButtonCancelarMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutMovimientoInventario = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutMovimientoInventario);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.movimientoinventarioSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();						
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;
			this.gridBagConstraintsMovimientoInventario.gridx = 0;		
			//this.gridBagConstraintsMovimientoInventario.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsMovimientoInventario.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy =iGridyPrincipal++;
		this.gridBagConstraintsMovimientoInventario.gridx =0;
		this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsMovimientoInventario.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(MovimientoInventarioJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleMovimientoInventario = new MovimientoInventarioBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Movimiento Inventario DATOS");
			
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
			
	        //this.setTitle("[FOR] - Movimiento Inventario DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Movimiento Inventario Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			MovimientoInventarioModel movimientoinventarioModel=new MovimientoInventarioModel(this);
			
			//SI USARA CLASE INTERNA
			//MovimientoInventarioModel.MovimientoInventarioFocusTraversalPolicy movimientoinventarioFocusTraversalPolicy = movimientoinventarioModel.new MovimientoInventarioFocusTraversalPolicy(this);
			
			//movimientoinventarioFocusTraversalPolicy.setmovimientoinventarioJInternalFrame(this);
			
			this.setFocusTraversalPolicy(movimientoinventarioModel);
			
			
			this.jContentPaneDetalleMovimientoInventario = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleMovimientoInventario = new GridBagLayout();	
			this.jContentPaneDetalleMovimientoInventario.setLayout(gridaBagLayoutDetalleMovimientoInventario);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosMovimientoInventario = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionMovimientoInventario=   new JScrollPane(jContentPaneDetalleMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralMovimientoInventario=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsMovimientoInventario.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsMovimientoInventario.gridx = 0;
	        
			this.jContentPaneDetalleMovimientoInventario.add(jPanelCamposMovimientoInventario, gridBagConstraintsMovimientoInventario);
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsMovimientoInventario.gridy = iGridyRelaciones++;
		this.gridBagConstraintsMovimientoInventario.gridx = 0;

		this.jContentPaneDetalleMovimientoInventario.add(jPanelCamposIniciogeneralMovimientoInventario, gridBagConstraintsMovimientoInventario);
			
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
						&& movimientoinventarioSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(this.puedeCargarPorParteDetalleMovimientoInventario,false,-1);
					
					if(this.movimientoinventarioSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsMovimientoInventario= new GridBagConstraints();
						this.gridBagConstraintsMovimientoInventario.gridy = iGridyRelaciones++;
						this.gridBagConstraintsMovimientoInventario.gridx = 0;
						this.jContentPaneDetalleMovimientoInventario.add(this.jTabbedPaneRelacionesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesMovimientoInventario.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsMovimientoInventario.gridy = iGridyRelaciones++;
		this.gridBagConstraintsMovimientoInventario.gridx = 0;

		this.jContentPaneDetalleMovimientoInventario.add(jPanelCamposFintotalMovimientoInventario, gridBagConstraintsMovimientoInventario);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosMovimientoInventario.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
					this.gridBagConstraintsMovimientoInventario.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsMovimientoInventario.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsMovimientoInventario.gridx = 0;
					
				
					this.jContentPaneDetalleMovimientoInventario.add(jPanelCamposOcultosMovimientoInventario, gridBagConstraintsMovimientoInventario);
				
					this.jPanelCamposOcultosMovimientoInventario.setVisible(true);
				}
			}					
			
			
			
			
			
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsMovimientoInventario.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsMovimientoInventario.gridx = 0;
	        
			
			this.jContentPaneDetalleMovimientoInventario.add(this.jPanelAccionesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionMovimientoInventario);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionMovimientoInventario=   new JScrollPane(this.jPanelCamposMovimientoInventario,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionMovimientoInventario.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientoInventario.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionMovimientoInventario.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsMovimientoInventario.gridx = 0;
			this.gridBagConstraintsMovimientoInventario.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsMovimientoInventario.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsMovimientoInventario.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMovimientoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioMovimientoInventario, this.gridBagConstraintsMovimientoInventario);			
			
			this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
			this.gridBagConstraintsMovimientoInventario.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsMovimientoInventario.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
			
			
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoInventario.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		
			
		this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
		this.gridBagConstraintsMovimientoInventario.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsMovimientoInventario.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesMovimientoInventario, this.gridBagConstraintsMovimientoInventario);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralMovimientoInventario;//jContentPane;
		
		return jScrollPanelDatosEdicionMovimientoInventario;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleMovimientoInventario(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallemovimientoinventarioSessionBean=new DetalleMovimientoInventarioSessionBean();
		this.detallemovimientoinventarioSessionBean.setConGuardarRelaciones(false);
		this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);

		this.detallemovimientoinventarioBeanSwingJInternalFrame=null;//new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallemovimientoinventarioBeanSwingJInternalFramePopup=new DetalleMovimientoInventarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallemovimientoinventarioBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {

				DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL=MovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleMovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=MovimientoInventarioJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(true);

				this.detallemovimientoinventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallemovimientoinventarioBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallemovimientoinventarioBeanSwingJInternalFrame.setdetallemovimientoinventarioSessionBean(this.detallemovimientoinventarioSessionBean);

				//this.gridBagConstraintsMovimientoInventario = new GridBagConstraints();
				//this.gridBagConstraintsMovimientoInventario.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsMovimientoInventario.gridx = 0;
				//this.jContentPaneDetalleMovimientoInventario.add(this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsMovimientoInventario);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesMovimientoInventario.add("Detalle Movimiento Inventarios",this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesMovimientoInventario.setComponentAt(iIndexTab,this.detallemovimientoinventarioBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleMovimientoInventarioJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallemovimientoinventarioSessionBean.setEsGuardarRelacionado(false);
				this.detallemovimientoinventarioBeanSwingJInternalFrame=null;//new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallemovimientoinventarioSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleMovimientoInventario) {
					this.jTabbedPaneRelacionesMovimientoInventario.add("Detalle Movimiento Inventarios",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleMovimientoInventarioBeanSwingJInternalFrame(List<MovimientoInventario> movimientoinventarios,MovimientoInventario movimientoinventario,DetalleMovimientoInventarioBeanSwingJInternalFrame detallemovimientoinventarioBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallemovimientoinventarioBeanSwingJInternalFrame=new DetalleMovimientoInventarioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallemovimientoinventarioBeanSwingJInternalFrame.getDetalleMovimientoInventarioLogic().setConnexion(this.movimientoinventarioLogic.getConnexion());

					detallemovimientoinventarioBeanSwingJInternalFrame.setmovimientoinventariosForeignKey(movimientoinventarios);
					detallemovimientoinventarioBeanSwingJInternalFrame.setmovimientoinventarioForeignKey(movimientoinventario);
					detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setisBusquedaDesdeForeignKeySesionMovimientoInventario(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.detallemovimientoinventarioSessionBean.setlidMovimientoInventarioActual(movimientoinventario.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallemovimientoinventarioBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleMovimientoInventario(detallemovimientoinventarioBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallemovimientoinventarioBeanSwingJInternalFrame.setVisibilidadBusquedasParaMovimientoInventario(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setid_movimiento_inventarioFK_IdMovimientoInventario(movimientoinventario.getId());

					if(!this.conCargarFormDetalle) {
						detallemovimientoinventarioBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallemovimientoinventarioBeanSwingJInternalFrame.setSelectedItemCombosFrameMovimientoInventarioForeignKey(movimientoinventario,1,false,true,true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallemovimientoinventarioBeanSwingJInternalFrame.procesarBusqueda("FK_IdMovimientoInventario");
					detallemovimientoinventarioBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdMovimientoInventario");
					detallemovimientoinventarioBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleMovimientoInventario(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleMovimientoInventario("n",detallemovimientoinventarioBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallemovimientoinventarioBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallemovimientoinventarioBeanSwingJInternalFrame.setAutoscrolls(true);
					detallemovimientoinventarioBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("relacionado");
					} else {
						detallemovimientoinventarioBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleMovimientoInventario("no_relacionado");
					}

					detallemovimientoinventarioBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleMovimientoInventario().setVisible(false);

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
