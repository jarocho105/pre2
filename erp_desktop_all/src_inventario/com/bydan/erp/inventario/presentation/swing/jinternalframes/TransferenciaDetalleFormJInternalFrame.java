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
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.TransferenciaConstantesFunciones;

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
public class TransferenciaDetalleFormJInternalFrame extends TransferenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTransferencia;
	
	protected JMenuBar jmenuBarDetalleTransferencia;
	
	protected JMenu jmenuDetalleTransferencia;
	protected JMenu jmenuDetalleArchivoTransferencia;
	protected JMenu jmenuDetalleAccionesTransferencia;
	protected JMenu jmenuDetalleDatosTransferencia;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTransferencia;	
	protected GridBagConstraints gridBagConstraintsTransferencia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TransferenciaBeanSwingJInternalFrameAdditional jInternalFrameDetalleTransferencia;		
	
	
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

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TransportistaBeanSwingJInternalFrame transportistaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transportista="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected AsientoContableBeanSwingJInternalFrame asientocontableBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_asientocontable="";
	
	public TransferenciaSessionBean transferenciaSessionBean;
	
	

	public DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFrame=null;
	public DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleTransferencia=false;
	public DetalleTransferenciaSessionBean detalletransferenciaSessionBean;
	
	
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
	public FormatoSessionBean formatoSessionBean;
	public TransportistaSessionBean transportistaSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public AsientoContableSessionBean asientocontableSessionBean;	
	
	public TransferenciaLogic transferenciaLogic;
	
	public JScrollPane jScrollPanelDatosTransferencia;
	public JScrollPane jScrollPanelDatosEdicionTransferencia;
	public JScrollPane jScrollPanelDatosGeneralTransferencia;
	
	protected JPanel jPanelCamposTransferencia;    
	protected JPanel jPanelCamposOcultosTransferencia;    	
	protected JPanel jPanelAccionesTransferencia;
	protected JPanel jPanelAccionesFormularioTransferencia;
    
	
	
	protected Integer iXPanelCamposTransferencia=0;
	protected Integer iYPanelCamposTransferencia=0;
	
	protected Integer iXPanelCamposOcultosTransferencia=0;
	protected Integer iYPanelCamposOcultosTransferencia=0;
	
	

	protected JPanel jPanelCamposFintotalTransferencia;
	protected Integer iXPanelCamposFintotalTransferencia=0;
	protected Integer iYPanelCamposFintotalTransferencia=0;

	protected JPanel jPanelCamposIniciogeneralTransferencia;
	protected Integer iXPanelCamposIniciogeneralTransferencia=0;
	protected Integer iYPanelCamposIniciogeneralTransferencia=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTransferencia;
	public JButton jButtonModificarTransferencia;
	public JButton jButtonActualizarTransferencia;
    public JButton jButtonEliminarTransferencia;
	public JButton jButtonCancelarTransferencia;
    public JButton jButtonGuardarCambiosTransferencia;
	public JButton jButtonGuardarCambiosTablaTransferencia;
	protected JButton jButtonCerrarTransferencia;
	
	
	protected JButton jButtonProcesarInformacionTransferencia;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTransferencia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTransferencia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTransferencia;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTransferencia;
	protected JButton jButtonModificarToolBarTransferencia;
	protected JButton jButtonActualizarToolBarTransferencia;
    protected JButton jButtonEliminarToolBarTransferencia;
	protected JButton jButtonCancelarToolBarTransferencia;
    protected JButton jButtonGuardarCambiosToolBarTransferencia;
	protected JButton jButtonGuardarCambiosTablaToolBarTransferencia;
	protected JButton jButtonMostrarOcultarTablaToolBarTransferencia;
	protected JButton jButtonCerrarToolBarTransferencia;
	
	protected JButton jButtonProcesarInformacionToolBarTransferencia;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTransferencia;
	protected JMenuItem jMenuItemModificarTransferencia;
	protected JMenuItem jMenuItemActualizarTransferencia;
    protected JMenuItem jMenuItemEliminarTransferencia;
	protected JMenuItem jMenuItemCancelarTransferencia;
    protected JMenuItem jMenuItemGuardarCambiosTransferencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaTransferencia;
	protected JMenuItem jMenuItemCerrarTransferencia;
	protected JMenuItem jMenuItemDetalleCerrarTransferencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarTransferencia;
	
	protected JMenuItem jMenuItemProcesarInformacionTransferencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTransferencia;
	protected JMenuItem jMenuItemMostrarOcultarTransferencia;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTransferencia;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTransferencia;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTransferencia;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTransferencia;
	public JLabel jLabelIdTransferencia;
	public JLabel jLabelidTransferencia;
	public JButton jButtonidTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionTransferencia;
	public JLabel jLabelfecha_emisionTransferencia;
	//public JFormattedTextField jDateChooserfecha_emisionTransferencia;

	public JDateChooser jDateChooserfecha_emisionTransferencia;
	public JButton jButtonfecha_emisionTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaTransferencia;
	public JLabel jLabelfecha_entregaTransferencia;
	//public JFormattedTextField jDateChooserfecha_entregaTransferencia;

	public JDateChooser jDateChooserfecha_entregaTransferencia;
	public JButton jButtonfecha_entregaTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialTransferencia;
	public JLabel jLabelnumero_secuencialTransferencia;
	public JTextField jTextFieldnumero_secuencialTransferencia;
	public JButton jButtonnumero_secuencialTransferenciaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionTransferencia;
	public JLabel jLabeldescripcionTransferencia;
	public JTextArea jTextAreadescripcionTransferencia;
	public JScrollPane jscrollPanedescripcionTransferencia;
	public JButton jButtondescripcionTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_descuentoTransferencia;
	public JLabel jLabelporcentaje_descuentoTransferencia;
	public JTextField jTextFieldporcentaje_descuentoTransferencia;
	public JButton jButtonporcentaje_descuentoTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelsumanTransferencia;
	public JLabel jLabelsumanTransferencia;
	public JTextField jTextFieldsumanTransferencia;
	public JButton jButtonsumanTransferenciaBusqueda= new JButtonMe();

	public JPanel jPaneliceTransferencia;
	public JLabel jLabeliceTransferencia;
	public JTextField jTextFieldiceTransferencia;
	public JButton jButtoniceTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelvalor_descuentoTransferencia;
	public JLabel jLabelvalor_descuentoTransferencia;
	public JTextField jTextFieldvalor_descuentoTransferencia;
	public JButton jButtonvalor_descuentoTransferenciaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoTransferencia;
	public JLabel jLabeltotal_descuentoTransferencia;
	public JTextField jTextFieldtotal_descuentoTransferencia;
	public JButton jButtontotal_descuentoTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelivaTransferencia;
	public JLabel jLabelivaTransferencia;
	public JTextField jTextFieldivaTransferencia;
	public JButton jButtonivaTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelstockTransferencia;
	public JLabel jLabelstockTransferencia;
	public JTextField jTextFieldstockTransferencia;
	public JButton jButtonstockTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalTransferencia;
	public JLabel jLabelsub_totalTransferencia;
	public JTextField jTextFieldsub_totalTransferencia;
	public JButton jButtonsub_totalTransferenciaBusqueda= new JButtonMe();

	public JPanel jPaneltotal_otroTransferencia;
	public JLabel jLabeltotal_otroTransferencia;
	public JTextField jTextFieldtotal_otroTransferencia;
	public JButton jButtontotal_otroTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelultimo_costoTransferencia;
	public JLabel jLabelultimo_costoTransferencia;
	public JTextField jTextFieldultimo_costoTransferencia;
	public JButton jButtonultimo_costoTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_itemsTransferencia;
	public JLabel jLabelnumero_itemsTransferencia;
	public JTextField jTextFieldnumero_itemsTransferencia;
	public JButton jButtonnumero_itemsTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelretencionTransferencia;
	public JLabel jLabelretencionTransferencia;
	public JTextField jTextFieldretencionTransferencia;
	public JButton jButtonretencionTransferenciaBusqueda= new JButtonMe();

	public JPanel jPaneltotalTransferencia;
	public JLabel jLabeltotalTransferencia;
	public JTextField jTextFieldtotalTransferencia;
	public JButton jButtontotalTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelfleteTransferencia;
	public JLabel jLabelfleteTransferencia;
	public JTextField jTextFieldfleteTransferencia;
	public JButton jButtonfleteTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelimpuestoTransferencia;
	public JLabel jLabelimpuestoTransferencia;
	public JTextField jTextFieldimpuestoTransferencia;
	public JButton jButtonimpuestoTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteTransferencia;
	public JLabel jLabelnumero_comprobanteTransferencia;
	public JTextField jTextFieldnumero_comprobanteTransferencia;
	public JButton jButtonnumero_comprobanteTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelfechaTransferencia;
	public JLabel jLabelfechaTransferencia;
	//public JFormattedTextField jDateChooserfechaTransferencia;

	public JDateChooser jDateChooserfechaTransferencia;
	public JButton jButtonfechaTransferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTransferencia;
	public JLabel jLabelid_empresaTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTransferencia;
	public JButton jButtonid_empresaTransferencia= new JButtonMe();
	public JButton jButtonid_empresaTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_empresaTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalTransferencia;
	public JLabel jLabelid_sucursalTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalTransferencia;
	public JButton jButtonid_sucursalTransferencia= new JButtonMe();
	public JButton jButtonid_sucursalTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloTransferencia;
	public JLabel jLabelid_moduloTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloTransferencia;
	public JButton jButtonid_moduloTransferencia= new JButtonMe();
	public JButton jButtonid_moduloTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_moduloTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioTransferencia;
	public JLabel jLabelid_ejercicioTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioTransferencia;
	public JButton jButtonid_ejercicioTransferencia= new JButtonMe();
	public JButton jButtonid_ejercicioTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoTransferencia;
	public JLabel jLabelid_periodoTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoTransferencia;
	public JButton jButtonid_periodoTransferencia= new JButtonMe();
	public JButton jButtonid_periodoTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_periodoTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioTransferencia;
	public JLabel jLabelid_anioTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioTransferencia;
	public JButton jButtonid_anioTransferencia= new JButtonMe();
	public JButton jButtonid_anioTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_anioTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesTransferencia;
	public JLabel jLabelid_mesTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesTransferencia;
	public JButton jButtonid_mesTransferencia= new JButtonMe();
	public JButton jButtonid_mesTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_mesTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioTransferencia;
	public JLabel jLabelid_usuarioTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioTransferencia;
	public JButton jButtonid_usuarioTransferencia= new JButtonMe();
	public JButton jButtonid_usuarioTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaTransferencia;
	public JLabel jLabelid_monedaTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaTransferencia;
	public JButton jButtonid_monedaTransferencia= new JButtonMe();
	public JButton jButtonid_monedaTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_monedaTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioTransferencia;
	public JLabel jLabelid_tipo_cambioTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioTransferencia;
	public JButton jButtonid_tipo_cambioTransferencia= new JButtonMe();
	public JButton jButtonid_tipo_cambioTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_inventarioTransferencia;
	public JLabel jLabelid_estado_inventarioTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_inventarioTransferencia;
	public JButton jButtonid_estado_inventarioTransferencia= new JButtonMe();
	public JButton jButtonid_estado_inventarioTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_estado_inventarioTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoTransferencia;
	public JLabel jLabelid_formatoTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoTransferencia;
	public JButton jButtonid_formatoTransferencia= new JButtonMe();
	public JButton jButtonid_formatoTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_formatoTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_transportistaTransferencia;
	public JLabel jLabelid_transportistaTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transportistaTransferencia;
	public JButton jButtonid_transportistaTransferencia= new JButtonMe();
	public JButton jButtonid_transportistaTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_transportistaTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoTransferencia;
	public JLabel jLabelid_empleadoTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoTransferencia;
	public JButton jButtonid_empleadoTransferencia= new JButtonMe();
	public JButton jButtonid_empleadoTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_empleadoTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloTransferencia;
	public JLabel jLabelid_tipo_transaccion_moduloTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloTransferencia;
	public JButton jButtonid_tipo_transaccion_moduloTransferencia= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_asiento_contableTransferencia;
	public JLabel jLabelid_asiento_contableTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_asiento_contableTransferencia;
	public JButton jButtonid_asiento_contableTransferencia= new JButtonMe();
	public JButton jButtonid_asiento_contableTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_asiento_contableTransferenciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTransferencia;
	
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
	public int iHeightFormulario=520;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TransferenciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTransferencia=new JPanel();
				this.jPanelAccionesFormularioTransferencia=new JPanel();
				this.jmenuBarDetalleTransferencia=new JMenuBar();
				this.jTtoolBarDetalleTransferencia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Transferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TransferenciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Transferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Transferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TransferenciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Transferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTransferencia() {
		return this.jButtonActualizarToolBarTransferencia;
	}
	
	public JButton getjButtonEliminarToolBarTransferencia() {
		return this.jButtonEliminarToolBarTransferencia;
	}
	
	public JButton getjButtonCancelarToolBarTransferencia() {
		return this.jButtonCancelarToolBarTransferencia;
	}		
	
	public JButton getjButtonProcesarInformacionTransferencia() {
		return this.jButtonProcesarInformacionTransferencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTransferencia)	{
		this.jButtonProcesarInformacionTransferencia = jButtonProcesarInformacionTransferencia;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTransferencia() {
		return this.jComboBoxTiposAccionesTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTransferencia(
			JComboBox jComboBoxTiposRelacionesTransferencia) {
		this.jComboBoxTiposRelacionesTransferencia = jComboBoxTiposRelacionesTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTransferencia(
			JComboBox jComboBoxTiposAccionesTransferencia) {
		this.jComboBoxTiposAccionesTransferencia = jComboBoxTiposAccionesTransferencia;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTransferencia() {
		return this.jComboBoxTiposAccionesFormularioTransferencia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTransferencia(
			JComboBox jComboBoxTiposAccionesFormularioTransferencia) {
		this.jComboBoxTiposAccionesFormularioTransferencia = jComboBoxTiposAccionesFormularioTransferencia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.transferenciaSessionBean=new TransferenciaSessionBean();
		
		this.transferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.transferenciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detalletransferenciaSessionBean=new DetalleTransferenciaSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TransferenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Transferencia MANTENIMIENTO"));
		
		
		if(iWidth > 2550) {
			iWidth=2550;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.transferenciaSessionBean.getEsGuardarRelacionado()) {
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
	
		TransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTransferencia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTransferencia=new JButtonMe();
				this.jButtonModificarToolBarTransferencia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTransferencia,this.jTtoolBarDetalleTransferencia,
							"actualizar","actualizar","Actualizar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTransferencia,this.jTtoolBarDetalleTransferencia,
							"eliminar","eliminar","Eliminar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTransferencia,this.jTtoolBarDetalleTransferencia,
							"cancelar","cancelar","Cancelar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTransferencia,this.jTtoolBarDetalleTransferencia,
							"guardarcambios","guardarcambios","Guardar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTransferencia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTransferencia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTransferencia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTransferencia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTransferencia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTransferencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTransferencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTransferencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTransferencia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTransferencia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTransferencia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTransferencia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTransferencia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTransferencia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTransferencia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTransferencia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTransferencia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTransferencia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTransferencia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTransferencia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTransferencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTransferencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTransferencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTransferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTransferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTransferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTransferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTransferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTransferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTransferencia.add(this.jMenuItemDetalleCerrarTransferencia);
		
		this.jmenuDetalleAccionesTransferencia.add(this.jMenuItemActualizarTransferencia);
		this.jmenuDetalleAccionesTransferencia.add(this.jMenuItemEliminarTransferencia);
		this.jmenuDetalleAccionesTransferencia.add(this.jMenuItemCancelarTransferencia);		
		
		//this.jmenuDetalleDatosTransferencia.add(this.jMenuItemDetalleAbrirOrderByTransferencia);				
		this.jmenuDetalleDatosTransferencia.add(this.jMenuItemDetalleMostarOcultarTransferencia);				
				
		//this.jmenuDetalleAccionesTransferencia.add(this.jMenuItemGuardarCambiosTransferencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTransferencia.add(this.jmenuDetalleArchivoTransferencia);		
		this.jmenuBarDetalleTransferencia.add(this.jmenuDetalleAccionesTransferencia);		
		this.jmenuBarDetalleTransferencia.add(this.jmenuDetalleDatosTransferencia);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTransferencia.add(this.jmenuDetalleTransferencia);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposTransferencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTransferencia = new JLabelMe();
		jLabelIdTransferencia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTransferencia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTransferencia= new GridBagLayout();

		this.jPanelidTransferencia.setLayout(this.gridaBagLayoutTransferencia);

		jLabelidTransferencia = new JLabel();
		jLabelidTransferencia.setText("Id");

		jLabelidTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emisionTransferencia = new JLabelMe();
		this.jLabelfecha_emisionTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionTransferencia.setToolTipText("F Emision");
		this.jLabelfecha_emisionTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelfecha_emisionTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		//jFormattedTextFieldfecha_emisionTransferencia= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionTransferencia= new JDateChooser();
		jDateChooserfecha_emisionTransferencia.setEnabled(false);
		jDateChooserfecha_emisionTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionTransferencia.setDate(new Date());
		jDateChooserfecha_emisionTransferencia.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionTransferencia.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionTransferenciaBusqueda= new JButtonMe();
		this.jButtonfecha_emisionTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionTransferenciaBusqueda.setText("U");
		this.jButtonfecha_emisionTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaTransferencia = new JLabelMe();
		this.jLabelfecha_entregaTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaTransferencia.setToolTipText("F Entrega");
		this.jLabelfecha_entregaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelfecha_entregaTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		//jFormattedTextFieldfecha_entregaTransferencia= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaTransferencia= new JDateChooser();
		jDateChooserfecha_entregaTransferencia.setEnabled(false);
		jDateChooserfecha_entregaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaTransferencia.setDate(new Date());
		jDateChooserfecha_entregaTransferencia.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaTransferencia.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaTransferenciaBusqueda= new JButtonMe();
		this.jButtonfecha_entregaTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaTransferenciaBusqueda.setText("U");
		this.jButtonfecha_entregaTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_secuencialTransferencia = new JLabelMe();
		this.jLabelnumero_secuencialTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialTransferencia.setToolTipText("No Secuencial");
		this.jLabelnumero_secuencialTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelnumero_secuencialTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldnumero_secuencialTransferencia= new JTextFieldMe();

		jTextFieldnumero_secuencialTransferencia.setEnabled(false);
		jTextFieldnumero_secuencialTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_secuencialTransferencia.setEnabled(false);
		this.jButtonnumero_secuencialTransferenciaBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialTransferenciaBusqueda.setText("U");
		this.jButtonnumero_secuencialTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionTransferencia = new JLabelMe();
		this.jLabeldescripcionTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionTransferencia.setToolTipText("Descripcion");
		this.jLabeldescripcionTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPaneldescripcionTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextAreadescripcionTransferencia= new JTextAreaMe();
		jTextAreadescripcionTransferencia.setEnabled(false);
		jTextAreadescripcionTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionTransferencia.setLineWrap(true);
		jTextAreadescripcionTransferencia.setWrapStyleWord(true);
		jTextAreadescripcionTransferencia.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionTransferencia.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionTransferencia = new JScrollPane(jTextAreadescripcionTransferencia);
		jscrollPanedescripcionTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanedescripcionTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtondescripcionTransferenciaBusqueda= new JButtonMe();
		this.jButtondescripcionTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionTransferenciaBusqueda.setText("U");
		this.jButtondescripcionTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_descuentoTransferencia = new JLabelMe();
		this.jLabelporcentaje_descuentoTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_PORCENTAJEDESCUENTO+" : *");
		this.jLabelporcentaje_descuentoTransferencia.setToolTipText("Descuento %");
		this.jLabelporcentaje_descuentoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_descuentoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_descuentoTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_descuentoTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_PORCENTAJEDESCUENTO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelporcentaje_descuentoTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldporcentaje_descuentoTransferencia= new JTextFieldMe();
		jTextFieldporcentaje_descuentoTransferencia.setEnabled(false);
		jTextFieldporcentaje_descuentoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_descuentoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_descuentoTransferencia.setText("0.0");

		jTextFieldporcentaje_descuentoTransferencia.setEnabled(false);
		this.jButtonporcentaje_descuentoTransferenciaBusqueda= new JButtonMe();
		this.jButtonporcentaje_descuentoTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_descuentoTransferenciaBusqueda.setText("U");
		this.jButtonporcentaje_descuentoTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_descuentoTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_descuentoTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_descuentoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_descuentoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_descuentoTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_descuentoTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelsumanTransferencia = new JLabelMe();
		this.jLabelsumanTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_SUMAN+" : *");
		this.jLabelsumanTransferencia.setToolTipText("Suman");
		this.jLabelsumanTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsumanTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsumanTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsumanTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsumanTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_SUMAN);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelsumanTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldsumanTransferencia= new JTextFieldMe();
		jTextFieldsumanTransferencia.setEnabled(false);
		jTextFieldsumanTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsumanTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsumanTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsumanTransferencia.setText("0.0");

		jTextFieldsumanTransferencia.setEnabled(false);
		this.jButtonsumanTransferenciaBusqueda= new JButtonMe();
		this.jButtonsumanTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsumanTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsumanTransferenciaBusqueda.setText("U");
		this.jButtonsumanTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsumanTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsumanTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsumanTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsumanTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sumanTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsumanTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabeliceTransferencia = new JLabelMe();
		this.jLabeliceTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_ICE+" : *");
		this.jLabeliceTransferencia.setToolTipText("Ice");
		this.jLabeliceTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeliceTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeliceTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneliceTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneliceTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_ICE);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPaneliceTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldiceTransferencia= new JTextFieldMe();
		jTextFieldiceTransferencia.setEnabled(false);
		jTextFieldiceTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldiceTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldiceTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldiceTransferencia.setText("0.0");

		jTextFieldiceTransferencia.setEnabled(false);
		this.jButtoniceTransferenciaBusqueda= new JButtonMe();
		this.jButtoniceTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoniceTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoniceTransferenciaBusqueda.setText("U");
		this.jButtoniceTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoniceTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoniceTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldiceTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldiceTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"iceTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoniceTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelvalor_descuentoTransferencia = new JLabelMe();
		this.jLabelvalor_descuentoTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_VALORDESCUENTO+" : *");
		this.jLabelvalor_descuentoTransferencia.setToolTipText("Descuento Valor");
		this.jLabelvalor_descuentoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_descuentoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_descuentoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_descuentoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_descuentoTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_descuentoTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_VALORDESCUENTO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelvalor_descuentoTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldvalor_descuentoTransferencia= new JTextFieldMe();
		jTextFieldvalor_descuentoTransferencia.setEnabled(false);
		jTextFieldvalor_descuentoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_descuentoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_descuentoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_descuentoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_descuentoTransferencia.setText("0.0");

		jTextFieldvalor_descuentoTransferencia.setEnabled(false);
		this.jButtonvalor_descuentoTransferenciaBusqueda= new JButtonMe();
		this.jButtonvalor_descuentoTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_descuentoTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_descuentoTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_descuentoTransferenciaBusqueda.setText("U");
		this.jButtonvalor_descuentoTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_descuentoTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_descuentoTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_descuentoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_descuentoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_descuentoTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_descuentoTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoTransferencia = new JLabelMe();
		this.jLabeltotal_descuentoTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoTransferencia.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPaneltotal_descuentoTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldtotal_descuentoTransferencia= new JTextFieldMe();
		jTextFieldtotal_descuentoTransferencia.setEnabled(false);
		jTextFieldtotal_descuentoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoTransferencia.setText("0.0");

		jTextFieldtotal_descuentoTransferencia.setEnabled(false);
		this.jButtontotal_descuentoTransferenciaBusqueda= new JButtonMe();
		this.jButtontotal_descuentoTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoTransferenciaBusqueda.setText("U");
		this.jButtontotal_descuentoTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelivaTransferencia = new JLabelMe();
		this.jLabelivaTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaTransferencia.setToolTipText("Iva");
		this.jLabelivaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelivaTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldivaTransferencia= new JTextFieldMe();
		jTextFieldivaTransferencia.setEnabled(false);
		jTextFieldivaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaTransferencia.setText("0.0");

		jTextFieldivaTransferencia.setEnabled(false);
		this.jButtonivaTransferenciaBusqueda= new JButtonMe();
		this.jButtonivaTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaTransferenciaBusqueda.setText("U");
		this.jButtonivaTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelstockTransferencia = new JLabelMe();
		this.jLabelstockTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_STOCK+" : *");
		this.jLabelstockTransferencia.setToolTipText("Stock");
		this.jLabelstockTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstockTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelstockTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelstockTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelstockTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelstockTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_STOCK);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelstockTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldstockTransferencia= new JTextFieldMe();
		jTextFieldstockTransferencia.setEnabled(false);
		jTextFieldstockTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstockTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldstockTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldstockTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldstockTransferencia.setText("0.0");

		jTextFieldstockTransferencia.setEnabled(false);
		this.jButtonstockTransferenciaBusqueda= new JButtonMe();
		this.jButtonstockTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstockTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonstockTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonstockTransferenciaBusqueda.setText("U");
		this.jButtonstockTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonstockTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonstockTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldstockTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldstockTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"stockTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonstockTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalTransferencia = new JLabelMe();
		this.jLabelsub_totalTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalTransferencia.setToolTipText("Sub Total");
		this.jLabelsub_totalTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelsub_totalTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldsub_totalTransferencia= new JTextFieldMe();
		jTextFieldsub_totalTransferencia.setEnabled(false);
		jTextFieldsub_totalTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalTransferencia.setText("0.0");

		jTextFieldsub_totalTransferencia.setEnabled(false);
		this.jButtonsub_totalTransferenciaBusqueda= new JButtonMe();
		this.jButtonsub_totalTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalTransferenciaBusqueda.setText("U");
		this.jButtonsub_totalTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabeltotal_otroTransferencia = new JLabelMe();
		this.jLabeltotal_otroTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_TOTALOTRO+" : *");
		this.jLabeltotal_otroTransferencia.setToolTipText("Total Otro");
		this.jLabeltotal_otroTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_otroTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_otroTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_otroTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_otroTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_TOTALOTRO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPaneltotal_otroTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldtotal_otroTransferencia= new JTextFieldMe();
		jTextFieldtotal_otroTransferencia.setEnabled(false);
		jTextFieldtotal_otroTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_otroTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_otroTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_otroTransferencia.setText("0.0");

		jTextFieldtotal_otroTransferencia.setEnabled(false);
		this.jButtontotal_otroTransferenciaBusqueda= new JButtonMe();
		this.jButtontotal_otroTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_otroTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_otroTransferenciaBusqueda.setText("U");
		this.jButtontotal_otroTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_otroTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_otroTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_otroTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_otroTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_otroTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_otroTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelultimo_costoTransferencia = new JLabelMe();
		this.jLabelultimo_costoTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_ULTIMOCOSTO+" : *");
		this.jLabelultimo_costoTransferencia.setToolTipText("Ultimo Costo");
		this.jLabelultimo_costoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelultimo_costoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelultimo_costoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelultimo_costoTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelultimo_costoTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_ULTIMOCOSTO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelultimo_costoTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldultimo_costoTransferencia= new JTextFieldMe();
		jTextFieldultimo_costoTransferencia.setEnabled(false);
		jTextFieldultimo_costoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldultimo_costoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldultimo_costoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldultimo_costoTransferencia.setText("0.0");

		jTextFieldultimo_costoTransferencia.setEnabled(false);
		this.jButtonultimo_costoTransferenciaBusqueda= new JButtonMe();
		this.jButtonultimo_costoTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonultimo_costoTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonultimo_costoTransferenciaBusqueda.setText("U");
		this.jButtonultimo_costoTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonultimo_costoTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonultimo_costoTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldultimo_costoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldultimo_costoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ultimo_costoTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonultimo_costoTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_itemsTransferencia = new JLabelMe();
		this.jLabelnumero_itemsTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_NUMEROITEMS+" : *");
		this.jLabelnumero_itemsTransferencia.setToolTipText("No Items");
		this.jLabelnumero_itemsTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_itemsTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_itemsTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_itemsTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_itemsTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_itemsTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_NUMEROITEMS);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelnumero_itemsTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldnumero_itemsTransferencia= new JTextFieldMe();
		jTextFieldnumero_itemsTransferencia.setEnabled(false);
		jTextFieldnumero_itemsTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_itemsTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_itemsTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_itemsTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_itemsTransferencia.setText("0.0");

		jTextFieldnumero_itemsTransferencia.setEnabled(false);
		this.jButtonnumero_itemsTransferenciaBusqueda= new JButtonMe();
		this.jButtonnumero_itemsTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_itemsTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_itemsTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_itemsTransferenciaBusqueda.setText("U");
		this.jButtonnumero_itemsTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_itemsTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_itemsTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_itemsTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_itemsTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_itemsTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_itemsTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelretencionTransferencia = new JLabelMe();
		this.jLabelretencionTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_RETENCION+" : *");
		this.jLabelretencionTransferencia.setToolTipText("Retencion");
		this.jLabelretencionTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelretencionTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelretencionTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelretencionTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelretencionTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_RETENCION);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelretencionTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldretencionTransferencia= new JTextFieldMe();
		jTextFieldretencionTransferencia.setEnabled(false);
		jTextFieldretencionTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldretencionTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldretencionTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldretencionTransferencia.setText("0.0");

		jTextFieldretencionTransferencia.setEnabled(false);
		this.jButtonretencionTransferenciaBusqueda= new JButtonMe();
		this.jButtonretencionTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonretencionTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonretencionTransferenciaBusqueda.setText("U");
		this.jButtonretencionTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonretencionTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonretencionTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldretencionTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldretencionTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"retencionTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonretencionTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabeltotalTransferencia = new JLabelMe();
		this.jLabeltotalTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalTransferencia.setToolTipText("Total");
		this.jLabeltotalTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPaneltotalTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldtotalTransferencia= new JTextFieldMe();
		jTextFieldtotalTransferencia.setEnabled(false);
		jTextFieldtotalTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalTransferencia.setText("0.0");

		jTextFieldtotalTransferencia.setEnabled(false);
		this.jButtontotalTransferenciaBusqueda= new JButtonMe();
		this.jButtontotalTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalTransferenciaBusqueda.setText("U");
		this.jButtontotalTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelfleteTransferencia = new JLabelMe();
		this.jLabelfleteTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_FLETE+" : *");
		this.jLabelfleteTransferencia.setToolTipText("Flete");
		this.jLabelfleteTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfleteTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfleteTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfleteTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfleteTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_FLETE);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelfleteTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldfleteTransferencia= new JTextFieldMe();
		jTextFieldfleteTransferencia.setEnabled(false);
		jTextFieldfleteTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfleteTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfleteTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfleteTransferencia.setText("0.0");

		this.jButtonfleteTransferenciaBusqueda= new JButtonMe();
		this.jButtonfleteTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfleteTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfleteTransferenciaBusqueda.setText("U");
		this.jButtonfleteTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfleteTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfleteTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfleteTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfleteTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fleteTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfleteTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelimpuestoTransferencia = new JLabelMe();
		this.jLabelimpuestoTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IMPUESTO+" : *");
		this.jLabelimpuestoTransferencia.setToolTipText("Impuesto");
		this.jLabelimpuestoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuestoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuestoTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuestoTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IMPUESTO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelimpuestoTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldimpuestoTransferencia= new JTextFieldMe();
		jTextFieldimpuestoTransferencia.setEnabled(false);
		jTextFieldimpuestoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuestoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuestoTransferencia.setText("0.0");

		this.jButtonimpuestoTransferenciaBusqueda= new JButtonMe();
		this.jButtonimpuestoTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuestoTransferenciaBusqueda.setText("U");
		this.jButtonimpuestoTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuestoTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuestoTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuestoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuestoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuestoTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuestoTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteTransferencia = new JLabelMe();
		this.jLabelnumero_comprobanteTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" :");
		this.jLabelnumero_comprobanteTransferencia.setToolTipText("Numero Comprobante");
		this.jLabelnumero_comprobanteTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelnumero_comprobanteTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jTextFieldnumero_comprobanteTransferencia= new JTextFieldMe();

		jTextFieldnumero_comprobanteTransferencia.setEnabled(false);
		jTextFieldnumero_comprobanteTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteTransferenciaBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteTransferenciaBusqueda.setText("U");
		this.jButtonnumero_comprobanteTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelfechaTransferencia = new JLabelMe();
		this.jLabelfechaTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaTransferencia.setToolTipText("Fecha");
		this.jLabelfechaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelfechaTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		//jFormattedTextFieldfechaTransferencia= new JFormattedTextFieldMe();

		jDateChooserfechaTransferencia= new JDateChooser();
		jDateChooserfechaTransferencia.setEnabled(false);
		jDateChooserfechaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaTransferencia.setDate(new Date());
		jDateChooserfechaTransferencia.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaTransferencia.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaTransferenciaBusqueda= new JButtonMe();
		this.jButtonfechaTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaTransferenciaBusqueda.setText("U");
		this.jButtonfechaTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaTransferenciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTransferencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTransferencia = new JLabelMe();
		this.jLabelid_empresaTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTransferencia.setToolTipText("Empresa");
		this.jLabelid_empresaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_empresaTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_empresaTransferencia= new JComboBoxMe();
		jComboBoxid_empresaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTransferencia.setEnabled(false);

		this.jButtonid_empresaTransferencia= new JButtonMe();
		this.jButtonid_empresaTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTransferencia.setText("Buscar");
		this.jButtonid_empresaTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransferencia"));

		this.jButtonid_empresaTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_empresaTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransferenciaBusqueda.setText("U");
		this.jButtonid_empresaTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_empresaTransferenciaUpdate= new JButtonMe();
		this.jButtonid_empresaTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTransferenciaUpdate.setText("U");
		this.jButtonid_empresaTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTransferenciaUpdate"));



					
		this.jLabelid_sucursalTransferencia = new JLabelMe();
		this.jLabelid_sucursalTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalTransferencia.setToolTipText("Sucursal");
		this.jLabelid_sucursalTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_sucursalTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_sucursalTransferencia= new JComboBoxMe();
		jComboBoxid_sucursalTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalTransferencia.setEnabled(false);

		this.jButtonid_sucursalTransferencia= new JButtonMe();
		this.jButtonid_sucursalTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalTransferencia.setText("Buscar");
		this.jButtonid_sucursalTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransferencia"));

		this.jButtonid_sucursalTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_sucursalTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTransferenciaBusqueda.setText("U");
		this.jButtonid_sucursalTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalTransferenciaUpdate= new JButtonMe();
		this.jButtonid_sucursalTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalTransferenciaUpdate.setText("U");
		this.jButtonid_sucursalTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalTransferenciaUpdate"));



					
		this.jLabelid_moduloTransferencia = new JLabelMe();
		this.jLabelid_moduloTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloTransferencia.setToolTipText("Modulo");
		this.jLabelid_moduloTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_moduloTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_moduloTransferencia= new JComboBoxMe();
		jComboBoxid_moduloTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloTransferencia.setEnabled(false);

		this.jButtonid_moduloTransferencia= new JButtonMe();
		this.jButtonid_moduloTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloTransferencia.setText("Buscar");
		this.jButtonid_moduloTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransferencia"));

		this.jButtonid_moduloTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_moduloTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTransferenciaBusqueda.setText("U");
		this.jButtonid_moduloTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_moduloTransferenciaUpdate= new JButtonMe();
		this.jButtonid_moduloTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloTransferenciaUpdate.setText("U");
		this.jButtonid_moduloTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloTransferenciaUpdate"));



					
		this.jLabelid_ejercicioTransferencia = new JLabelMe();
		this.jLabelid_ejercicioTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioTransferencia.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_ejercicioTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_ejercicioTransferencia= new JComboBoxMe();
		jComboBoxid_ejercicioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioTransferencia.setEnabled(false);

		this.jButtonid_ejercicioTransferencia= new JButtonMe();
		this.jButtonid_ejercicioTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioTransferencia.setText("Buscar");
		this.jButtonid_ejercicioTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTransferencia"));

		this.jButtonid_ejercicioTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioTransferenciaBusqueda.setText("U");
		this.jButtonid_ejercicioTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioTransferenciaUpdate= new JButtonMe();
		this.jButtonid_ejercicioTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioTransferenciaUpdate.setText("U");
		this.jButtonid_ejercicioTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioTransferenciaUpdate"));



					
		this.jLabelid_periodoTransferencia = new JLabelMe();
		this.jLabelid_periodoTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoTransferencia.setToolTipText("Periodo");
		this.jLabelid_periodoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_periodoTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_periodoTransferencia= new JComboBoxMe();
		jComboBoxid_periodoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoTransferencia.setEnabled(false);

		this.jButtonid_periodoTransferencia= new JButtonMe();
		this.jButtonid_periodoTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoTransferencia.setText("Buscar");
		this.jButtonid_periodoTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoTransferencia"));

		this.jButtonid_periodoTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_periodoTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoTransferenciaBusqueda.setText("U");
		this.jButtonid_periodoTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_periodoTransferenciaUpdate= new JButtonMe();
		this.jButtonid_periodoTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoTransferenciaUpdate.setText("U");
		this.jButtonid_periodoTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoTransferenciaUpdate"));



					
		this.jLabelid_anioTransferencia = new JLabelMe();
		this.jLabelid_anioTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioTransferencia.setToolTipText("Anio");
		this.jLabelid_anioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_anioTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_anioTransferencia= new JComboBoxMe();
		jComboBoxid_anioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioTransferencia.setEnabled(false);

		this.jButtonid_anioTransferencia= new JButtonMe();
		this.jButtonid_anioTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioTransferencia.setText("Buscar");
		this.jButtonid_anioTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioTransferencia"));

		this.jButtonid_anioTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_anioTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioTransferenciaBusqueda.setText("U");
		this.jButtonid_anioTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_anioTransferenciaUpdate= new JButtonMe();
		this.jButtonid_anioTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioTransferenciaUpdate.setText("U");
		this.jButtonid_anioTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioTransferenciaUpdate"));



					
		this.jLabelid_mesTransferencia = new JLabelMe();
		this.jLabelid_mesTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesTransferencia.setToolTipText("Mes");
		this.jLabelid_mesTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_mesTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_mesTransferencia= new JComboBoxMe();
		jComboBoxid_mesTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesTransferencia.setEnabled(false);

		this.jButtonid_mesTransferencia= new JButtonMe();
		this.jButtonid_mesTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesTransferencia.setText("Buscar");
		this.jButtonid_mesTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesTransferencia"));

		this.jButtonid_mesTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_mesTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesTransferenciaBusqueda.setText("U");
		this.jButtonid_mesTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_mesTransferenciaUpdate= new JButtonMe();
		this.jButtonid_mesTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesTransferenciaUpdate.setText("U");
		this.jButtonid_mesTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesTransferenciaUpdate"));



					
		this.jLabelid_usuarioTransferencia = new JLabelMe();
		this.jLabelid_usuarioTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioTransferencia.setToolTipText("Usuario");
		this.jLabelid_usuarioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_usuarioTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_usuarioTransferencia= new JComboBoxMe();
		jComboBoxid_usuarioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioTransferencia.setEnabled(false);

		this.jButtonid_usuarioTransferencia= new JButtonMe();
		this.jButtonid_usuarioTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioTransferencia.setText("Buscar");
		this.jButtonid_usuarioTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioTransferencia"));

		this.jButtonid_usuarioTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_usuarioTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioTransferenciaBusqueda.setText("U");
		this.jButtonid_usuarioTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioTransferenciaUpdate= new JButtonMe();
		this.jButtonid_usuarioTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioTransferenciaUpdate.setText("U");
		this.jButtonid_usuarioTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioTransferenciaUpdate"));



					
		this.jLabelid_monedaTransferencia = new JLabelMe();
		this.jLabelid_monedaTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaTransferencia.setToolTipText("Moneda");
		this.jLabelid_monedaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_monedaTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_monedaTransferencia= new JComboBoxMe();
		jComboBoxid_monedaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaTransferencia= new JButtonMe();
		this.jButtonid_monedaTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaTransferencia.setText("Buscar");
		this.jButtonid_monedaTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaTransferencia"));

		this.jButtonid_monedaTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_monedaTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaTransferenciaBusqueda.setText("U");
		this.jButtonid_monedaTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_monedaTransferenciaUpdate= new JButtonMe();
		this.jButtonid_monedaTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaTransferenciaUpdate.setText("U");
		this.jButtonid_monedaTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaTransferenciaUpdate"));



					
		this.jLabelid_tipo_cambioTransferencia = new JLabelMe();
		this.jLabelid_tipo_cambioTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioTransferencia.setToolTipText("T Cambio");
		this.jLabelid_tipo_cambioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_tipo_cambioTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_tipo_cambioTransferencia= new JComboBoxMe();
		jComboBoxid_tipo_cambioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_cambioTransferencia= new JButtonMe();
		this.jButtonid_tipo_cambioTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioTransferencia.setText("Buscar");
		this.jButtonid_tipo_cambioTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioTransferencia"));

		this.jButtonid_tipo_cambioTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioTransferenciaBusqueda.setText("U");
		this.jButtonid_tipo_cambioTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioTransferenciaUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioTransferenciaUpdate.setText("U");
		this.jButtonid_tipo_cambioTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioTransferenciaUpdate"));



					
		this.jLabelid_estado_inventarioTransferencia = new JLabelMe();
		this.jLabelid_estado_inventarioTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDESTADOINVENTARIO+" : *");
		this.jLabelid_estado_inventarioTransferencia.setToolTipText("Estado");
		this.jLabelid_estado_inventarioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_inventarioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_inventarioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_inventarioTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_inventarioTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_inventarioTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDESTADOINVENTARIO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_estado_inventarioTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_estado_inventarioTransferencia= new JComboBoxMe();
		jComboBoxid_estado_inventarioTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_inventarioTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_inventarioTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_inventarioTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_inventarioTransferencia.setEnabled(false);

		this.jButtonid_estado_inventarioTransferencia= new JButtonMe();
		this.jButtonid_estado_inventarioTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_inventarioTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_inventarioTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_inventarioTransferencia.setText("Buscar");
		this.jButtonid_estado_inventarioTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_inventarioTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_inventarioTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_inventarioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_inventarioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_inventarioTransferencia"));

		this.jButtonid_estado_inventarioTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_estado_inventarioTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_inventarioTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_inventarioTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_inventarioTransferenciaBusqueda.setText("U");
		this.jButtonid_estado_inventarioTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_inventarioTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_inventarioTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_inventarioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_inventarioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_inventarioTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_inventarioTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_estado_inventarioTransferenciaUpdate= new JButtonMe();
		this.jButtonid_estado_inventarioTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_inventarioTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_inventarioTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_inventarioTransferenciaUpdate.setText("U");
		this.jButtonid_estado_inventarioTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_inventarioTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_inventarioTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_inventarioTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_inventarioTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_inventarioTransferenciaUpdate"));



					
		this.jLabelid_formatoTransferencia = new JLabelMe();
		this.jLabelid_formatoTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDFORMATO+" : *");
		this.jLabelid_formatoTransferencia.setToolTipText("Formato");
		this.jLabelid_formatoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_formatoTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_formatoTransferencia= new JComboBoxMe();
		jComboBoxid_formatoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoTransferencia= new JButtonMe();
		this.jButtonid_formatoTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoTransferencia.setText("Buscar");
		this.jButtonid_formatoTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoTransferencia"));

		this.jButtonid_formatoTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_formatoTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoTransferenciaBusqueda.setText("U");
		this.jButtonid_formatoTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_formatoTransferenciaUpdate= new JButtonMe();
		this.jButtonid_formatoTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoTransferenciaUpdate.setText("U");
		this.jButtonid_formatoTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoTransferenciaUpdate"));



					
		this.jLabelid_transportistaTransferencia = new JLabelMe();
		this.jLabelid_transportistaTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDTRANSPORTISTA+" :");
		this.jLabelid_transportistaTransferencia.setToolTipText("Transportista");
		this.jLabelid_transportistaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transportistaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transportistaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transportistaTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transportistaTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDTRANSPORTISTA);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_transportistaTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_transportistaTransferencia= new JComboBoxMe();
		jComboBoxid_transportistaTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transportistaTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transportistaTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transportistaTransferencia= new JButtonMe();
		this.jButtonid_transportistaTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transportistaTransferencia.setText("Buscar");
		this.jButtonid_transportistaTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transportistaTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transportistaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaTransferencia"));

		this.jButtonid_transportistaTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_transportistaTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaTransferenciaBusqueda.setText("U");
		this.jButtonid_transportistaTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transportistaTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transportistaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transportistaTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_transportistaTransferenciaUpdate= new JButtonMe();
		this.jButtonid_transportistaTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transportistaTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transportistaTransferenciaUpdate.setText("U");
		this.jButtonid_transportistaTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transportistaTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transportistaTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transportistaTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transportistaTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transportistaTransferenciaUpdate"));



					
		this.jLabelid_empleadoTransferencia = new JLabelMe();
		this.jLabelid_empleadoTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoTransferencia.setToolTipText("Empleado");
		this.jLabelid_empleadoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_empleadoTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_empleadoTransferencia= new JComboBoxMe();
		jComboBoxid_empleadoTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoTransferencia= new JButtonMe();
		this.jButtonid_empleadoTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoTransferencia.setText("Buscar");
		this.jButtonid_empleadoTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoTransferencia"));

		this.jButtonid_empleadoTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_empleadoTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoTransferenciaBusqueda.setText("U");
		this.jButtonid_empleadoTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_empleadoTransferenciaUpdate= new JButtonMe();
		this.jButtonid_empleadoTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoTransferenciaUpdate.setText("U");
		this.jButtonid_empleadoTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoTransferenciaUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloTransferencia = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloTransferencia.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_tipo_transaccion_moduloTransferencia= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloTransferencia.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloTransferencia= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloTransferencia.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloTransferencia"));

		this.jButtonid_tipo_transaccion_moduloTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloTransferenciaBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloTransferenciaUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloTransferenciaUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloTransferenciaUpdate"));



					
		this.jLabelid_asiento_contableTransferencia = new JLabelMe();
		this.jLabelid_asiento_contableTransferencia.setText(""+TransferenciaConstantesFunciones.LABEL_IDASIENTOCONTABLE+" : *");
		this.jLabelid_asiento_contableTransferencia.setToolTipText("Asiento Contable");
		this.jLabelid_asiento_contableTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_asiento_contableTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_asiento_contableTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_asiento_contableTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_asiento_contableTransferencia.setToolTipText(TransferenciaConstantesFunciones.LABEL_IDASIENTOCONTABLE);
		this.gridaBagLayoutTransferencia = new GridBagLayout();
		this.jPanelid_asiento_contableTransferencia.setLayout(this.gridaBagLayoutTransferencia);


		jComboBoxid_asiento_contableTransferencia= new JComboBoxMe();
		jComboBoxid_asiento_contableTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_asiento_contableTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_asiento_contableTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_asiento_contableTransferencia.setEnabled(false);

		this.jButtonid_asiento_contableTransferencia= new JButtonMe();
		this.jButtonid_asiento_contableTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_asiento_contableTransferencia.setText("Buscar");
		this.jButtonid_asiento_contableTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_asiento_contableTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_asiento_contableTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableTransferencia"));

		this.jButtonid_asiento_contableTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_asiento_contableTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableTransferenciaBusqueda.setText("U");
		this.jButtonid_asiento_contableTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_asiento_contableTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_asiento_contableTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableTransferenciaBusqueda"));

		if(this.transferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_asiento_contableTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_asiento_contableTransferenciaUpdate= new JButtonMe();
		this.jButtonid_asiento_contableTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_asiento_contableTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_asiento_contableTransferenciaUpdate.setText("U");
		this.jButtonid_asiento_contableTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_asiento_contableTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_asiento_contableTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_asiento_contableTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_asiento_contableTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_asiento_contableTransferenciaUpdate"));



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
		//this.jInternalFrameDetalleTransferencia = new TransferenciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Transferencia DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTransferencia= new GridBagLayout();
		

		
		String sToolTipTransferencia="";
		sToolTipTransferencia=TransferenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTransferencia+="(Inventario.Transferencia)";
		}
		
		if(!this.transferenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipTransferencia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTransferencia = new JButtonMe();
		this.jButtonModificarTransferencia = new JButtonMe();
        this.jButtonActualizarTransferencia = new JButtonMe();
        this.jButtonEliminarTransferencia = new JButtonMe();
        this.jButtonCancelarTransferencia = new JButtonMe();
        this.jButtonGuardarCambiosTransferencia = new JButtonMe();
		this.jButtonGuardarCambiosTablaTransferencia = new JButtonMe();
		this.jButtonCerrarTransferencia = new JButtonMe();
		
		this.jScrollPanelDatosTransferencia = new JScrollPane();   
        this.jScrollPanelDatosEdicionTransferencia = new JScrollPane();
		this.jScrollPanelDatosGeneralTransferencia = new JScrollPane();
				
		
		
		this.jPanelCamposTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposFintotalTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneralTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Transferencia";
		
		if(!this.transferenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Transferencias" + this.sPath));
		} else {
			this.jScrollPanelDatosTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposTransferencia.setName("jPanelCamposTransferencia"); 

		this.jPanelCamposOcultosTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTransferencia.setName("jPanelCamposOcultosTransferencia"); 

        this.jPanelAccionesTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTransferencia.setToolTipText("Acciones");
        this.jPanelAccionesTransferencia.setName("Acciones"); 

		this.jPanelAccionesFormularioTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTransferencia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTransferencia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposFintotalTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		this.jPanelCamposFintotalTransferencia.setName("jPanelCamposFintotalTransferencia");
		FuncionesSwing.setBoldPanel(this.jPanelCamposFintotalTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		this.jPanelCamposIniciogeneralTransferencia.setName("jPanelCamposFingeneralTransferencia");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTransferencia.setText("Nuevo");
		this.jButtonModificarTransferencia.setText("Editar");
        this.jButtonActualizarTransferencia.setText("Actualizar");
        this.jButtonEliminarTransferencia.setText("Eliminar");
        this.jButtonCancelarTransferencia.setText("Cancelar");
        this.jButtonGuardarCambiosTransferencia.setText("Guardar");
		this.jButtonGuardarCambiosTablaTransferencia.setText("Guardar");
		this.jButtonCerrarTransferencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTransferencia,"nuevo_button","Nuevo",this.transferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTransferencia,"modificar_button","Editar",this.transferenciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTransferencia,"actualizar_button","Actualizar",this.transferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTransferencia,"eliminar_button","Eliminar",this.transferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTransferencia,"cancelar_button","Cancelar",this.transferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTransferencia,"guardarcambios_button","Guardar",this.transferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTransferencia,"guardarcambiostabla_button","Guardar",this.transferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTransferencia,"cerrar_button","Salir",this.transferenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTransferencia.setToolTipText("Nuevo"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTransferencia.setToolTipText("Editar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTransferencia.setToolTipText("Actualizar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTransferencia.setToolTipText("Eliminar)"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTransferencia.setToolTipText("Cancelar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTransferencia.setToolTipText("Guardar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTransferencia.setToolTipText("Guardar"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTransferencia.setToolTipText("Salir"+" "+TransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTransferencia";
		inputMap = this.jButtonNuevoTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTransferencia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTransferencia";
		inputMap = this.jButtonActualizarTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTransferencia"));
		
		//ELIMINAR
		sMapKey = "EliminarTransferencia";
		inputMap = this.jButtonEliminarTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTransferencia"));
		
		//CANCELAR	
		sMapKey = "CancelarTransferencia";
		inputMap = this.jButtonCancelarTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTransferencia"));
		
		//CERRAR		
		sMapKey = "CerrarTransferencia";
		inputMap = this.jButtonCerrarTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTransferencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTransferencia";
		inputMap = this.jButtonGuardarCambiosTablaTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTransferencia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTransferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTransferencia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTransferencia.setToolTipText("Nuevo Transferencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTransferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTransferencia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTransferencia.setToolTipText("Sin Cerrar Ventana Transferencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTransferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTransferencia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTransferencia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTransferencia.setText("Accion");
		this.jComboBoxTiposAccionesTransferencia.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTransferencia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTransferencia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTransferencia = new JLabelMe();
		
		this.jLabelAccionesTransferencia.setText("Acciones");		
		this.jLabelAccionesTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTransferencia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTransferencia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTransferencia=new JTabbedPane();
		this.jTabbedPaneRelacionesTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTransferencia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTransferencia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTransferencia = new GridBagLayout();
		
		this.jPanelCamposTransferencia.setLayout(gridaBagLayoutCamposTransferencia);
		this.jPanelCamposOcultosTransferencia.setLayout(gridaBagLayoutCamposOcultosTransferencia);
		
		

		GridBagLayout gridaBagLayoutCamposFintotalTransferencia= new GridBagLayout();
		this.jPanelCamposFintotalTransferencia.setLayout(gridaBagLayoutCamposFintotalTransferencia);

		GridBagLayout gridaBagLayoutCamposIniciogeneralTransferencia= new GridBagLayout();
		this.jPanelCamposIniciogeneralTransferencia.setLayout(gridaBagLayoutCamposIniciogeneralTransferencia);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelidTransferencia.add(jLabelIdTransferencia, this.gridBagConstraintsTransferencia);



	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelidTransferencia.add(jLabelidTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empresaTransferencia.add(jLabelid_empresaTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransferencia.add(jButtonid_empresaTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTransferencia.add(jButtonid_empresaTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empresaTransferencia.add(jComboBoxid_empresaTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_sucursalTransferencia.add(jLabelid_sucursalTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTransferencia.add(jButtonid_sucursalTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalTransferencia.add(jButtonid_sucursalTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_sucursalTransferencia.add(jComboBoxid_sucursalTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_moduloTransferencia.add(jLabelid_moduloTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTransferencia.add(jButtonid_moduloTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloTransferencia.add(jButtonid_moduloTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_moduloTransferencia.add(jComboBoxid_moduloTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_ejercicioTransferencia.add(jLabelid_ejercicioTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioTransferencia.add(jButtonid_ejercicioTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioTransferencia.add(jButtonid_ejercicioTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_ejercicioTransferencia.add(jComboBoxid_ejercicioTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_periodoTransferencia.add(jLabelid_periodoTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoTransferencia.add(jButtonid_periodoTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoTransferencia.add(jButtonid_periodoTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_periodoTransferencia.add(jComboBoxid_periodoTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_anioTransferencia.add(jLabelid_anioTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioTransferencia.add(jButtonid_anioTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioTransferencia.add(jButtonid_anioTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_anioTransferencia.add(jComboBoxid_anioTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_mesTransferencia.add(jLabelid_mesTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesTransferencia.add(jButtonid_mesTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesTransferencia.add(jButtonid_mesTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_mesTransferencia.add(jComboBoxid_mesTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_usuarioTransferencia.add(jLabelid_usuarioTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioTransferencia.add(jButtonid_usuarioTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioTransferencia.add(jButtonid_usuarioTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_usuarioTransferencia.add(jComboBoxid_usuarioTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_emisionTransferencia.add(jLabelfecha_emisionTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionTransferencia.add(jButtonfecha_emisionTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_emisionTransferencia.add(jDateChooserfecha_emisionTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfecha_entregaTransferencia.add(jLabelfecha_entregaTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaTransferencia.add(jButtonfecha_entregaTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfecha_entregaTransferencia.add(jDateChooserfecha_entregaTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_secuencialTransferencia.add(jLabelnumero_secuencialTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialTransferencia.add(jButtonnumero_secuencialTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_secuencialTransferencia.add(jTextFieldnumero_secuencialTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_monedaTransferencia.add(jLabelid_monedaTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaTransferencia.add(jButtonid_monedaTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaTransferencia.add(jButtonid_monedaTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_monedaTransferencia.add(jComboBoxid_monedaTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_cambioTransferencia.add(jLabelid_tipo_cambioTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 2;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioTransferencia.add(jButtonid_tipo_cambioTransferencia, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioTransferencia.add(jButtonid_tipo_cambioTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 4;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioTransferencia.add(jButtonid_tipo_cambioTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_cambioTransferencia.add(jComboBoxid_tipo_cambioTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_estado_inventarioTransferencia.add(jLabelid_estado_inventarioTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_inventarioTransferencia.add(jButtonid_estado_inventarioTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_inventarioTransferencia.add(jButtonid_estado_inventarioTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_estado_inventarioTransferencia.add(jComboBoxid_estado_inventarioTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_formatoTransferencia.add(jLabelid_formatoTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoTransferencia.add(jButtonid_formatoTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoTransferencia.add(jButtonid_formatoTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_formatoTransferencia.add(jComboBoxid_formatoTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_transportistaTransferencia.add(jLabelid_transportistaTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaTransferencia.add(jButtonid_transportistaTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transportistaTransferencia.add(jButtonid_transportistaTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_transportistaTransferencia.add(jComboBoxid_transportistaTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_empleadoTransferencia.add(jLabelid_empleadoTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 2;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoTransferencia.add(jButtonid_empleadoTransferencia, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoTransferencia.add(jButtonid_empleadoTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 4;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoTransferencia.add(jButtonid_empleadoTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_empleadoTransferencia.add(jComboBoxid_empleadoTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneldescripcionTransferencia.add(jLabeldescripcionTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionTransferencia.add(jButtondescripcionTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneldescripcionTransferencia.add(jscrollPanedescripcionTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelporcentaje_descuentoTransferencia.add(jLabelporcentaje_descuentoTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_descuentoTransferencia.add(jButtonporcentaje_descuentoTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelporcentaje_descuentoTransferencia.add(jTextFieldporcentaje_descuentoTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsumanTransferencia.add(jLabelsumanTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelsumanTransferencia.add(jButtonsumanTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsumanTransferencia.add(jTextFieldsumanTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneliceTransferencia.add(jLabeliceTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneliceTransferencia.add(jButtoniceTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneliceTransferencia.add(jTextFieldiceTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelvalor_descuentoTransferencia.add(jLabelvalor_descuentoTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_descuentoTransferencia.add(jButtonvalor_descuentoTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelvalor_descuentoTransferencia.add(jTextFieldvalor_descuentoTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_descuentoTransferencia.add(jLabeltotal_descuentoTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoTransferencia.add(jButtontotal_descuentoTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_descuentoTransferencia.add(jTextFieldtotal_descuentoTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelivaTransferencia.add(jLabelivaTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaTransferencia.add(jButtonivaTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelivaTransferencia.add(jTextFieldivaTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelstockTransferencia.add(jLabelstockTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelstockTransferencia.add(jButtonstockTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelstockTransferencia.add(jTextFieldstockTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelsub_totalTransferencia.add(jLabelsub_totalTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalTransferencia.add(jButtonsub_totalTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelsub_totalTransferencia.add(jTextFieldsub_totalTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotal_otroTransferencia.add(jLabeltotal_otroTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_otroTransferencia.add(jButtontotal_otroTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotal_otroTransferencia.add(jTextFieldtotal_otroTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelultimo_costoTransferencia.add(jLabelultimo_costoTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelultimo_costoTransferencia.add(jButtonultimo_costoTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelultimo_costoTransferencia.add(jTextFieldultimo_costoTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_itemsTransferencia.add(jLabelnumero_itemsTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_itemsTransferencia.add(jButtonnumero_itemsTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_itemsTransferencia.add(jTextFieldnumero_itemsTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelretencionTransferencia.add(jLabelretencionTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelretencionTransferencia.add(jButtonretencionTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelretencionTransferencia.add(jTextFieldretencionTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPaneltotalTransferencia.add(jLabeltotalTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalTransferencia.add(jButtontotalTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPaneltotalTransferencia.add(jTextFieldtotalTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfleteTransferencia.add(jLabelfleteTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelfleteTransferencia.add(jButtonfleteTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfleteTransferencia.add(jTextFieldfleteTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelimpuestoTransferencia.add(jLabelimpuestoTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuestoTransferencia.add(jButtonimpuestoTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelimpuestoTransferencia.add(jTextFieldimpuestoTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_tipo_transaccion_moduloTransferencia.add(jLabelid_tipo_transaccion_moduloTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloTransferencia.add(jButtonid_tipo_transaccion_moduloTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloTransferencia.add(jButtonid_tipo_transaccion_moduloTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_tipo_transaccion_moduloTransferencia.add(jComboBoxid_tipo_transaccion_moduloTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelid_asiento_contableTransferencia.add(jLabelid_asiento_contableTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 2;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_asiento_contableTransferencia.add(jButtonid_asiento_contableTransferencia, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 3;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableTransferencia.add(jButtonid_asiento_contableTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 4;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_asiento_contableTransferencia.add(jButtonid_asiento_contableTransferenciaUpdate, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelid_asiento_contableTransferencia.add(jComboBoxid_asiento_contableTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelnumero_comprobanteTransferencia.add(jLabelnumero_comprobanteTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteTransferencia.add(jButtonnumero_comprobanteTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelnumero_comprobanteTransferencia.add(jTextFieldnumero_comprobanteTransferencia, this.gridBagConstraintsTransferencia);


	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 0;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelfechaTransferencia.add(jLabelfechaTransferencia, this.gridBagConstraintsTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = 2;
		this.gridBagConstraintsTransferencia.ipadx = 0;
		this.gridBagConstraintsTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaTransferencia.add(jButtonfechaTransferenciaBusqueda, this.gridBagConstraintsTransferencia);
	}

	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTransferencia.gridy = 0;
	this.gridBagConstraintsTransferencia.gridx = 1;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);
	this.jPanelfechaTransferencia.add(jDateChooserfechaTransferencia, this.gridBagConstraintsTransferencia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelid_empresaTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelid_sucursalTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelid_moduloTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelid_ejercicioTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelid_periodoTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelid_anioTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelid_mesTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelid_usuarioTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelfleteTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelimpuestoTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelid_tipo_transaccion_moduloTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelid_asiento_contableTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelnumero_comprobanteTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposOcultosTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposOcultosTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposOcultosTransferencia.add(this.jPanelfechaTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposOcultosTransferencia % 3==0) {
		iXPanelCamposOcultosTransferencia=0;
		iYPanelCamposOcultosTransferencia++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPanelidTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPanelfecha_emisionTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPanelfecha_entregaTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPanelnumero_secuencialTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPanelid_monedaTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPanelid_tipo_cambioTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPanelid_estado_inventarioTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPanelid_formatoTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPanelid_transportistaTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPanelid_empleadoTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposIniciogeneralTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposIniciogeneralTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposIniciogeneralTransferencia.add(this.jPaneldescripcionTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposIniciogeneralTransferencia % 3==0) {
		iXPanelCamposIniciogeneralTransferencia=0;
		iYPanelCamposIniciogeneralTransferencia++;
	}
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPanelporcentaje_descuentoTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPanelsumanTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPaneliceTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPanelvalor_descuentoTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPaneltotal_descuentoTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPanelivaTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPanelstockTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPanelsub_totalTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPaneltotal_otroTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPanelultimo_costoTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPanelnumero_itemsTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPanelretencionTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
	}
	this.gridBagConstraintsTransferencia = new GridBagConstraints();
	//NUM X EXTRA
	iXPanelCamposFintotalTransferencia+=2;
	this.gridBagConstraintsTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTransferencia.gridy = iYPanelCamposFintotalTransferencia;
	this.gridBagConstraintsTransferencia.gridx = iXPanelCamposFintotalTransferencia++;
	this.gridBagConstraintsTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTransferencia.insets = new Insets(0, Constantes2.I_CELLSPACING_LEFT, 0, 0);

	this.jPanelCamposFintotalTransferencia.add(this.jPaneltotalTransferencia, this.gridBagConstraintsTransferencia);



	if(iXPanelCamposFintotalTransferencia % 3==0) {
		iXPanelCamposFintotalTransferencia=0;
		iYPanelCamposFintotalTransferencia++;
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
			
		GridBagLayout gridaBagLayoutAccionesTransferencia= new GridBagLayout();
		this.jPanelAccionesTransferencia.setLayout(gridaBagLayoutAccionesTransferencia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTransferencia= new GridBagLayout();
		this.jPanelAccionesFormularioTransferencia.setLayout(gridaBagLayoutAccionesFormularioTransferencia);
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransferencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransferencia.add(this.jComboBoxTiposAccionesFormularioTransferencia, this.gridBagConstraintsTransferencia);

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTransferencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTransferencia.add(this.jCheckBoxPostAccionNuevoTransferencia, this.gridBagConstraintsTransferencia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.transferenciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransferencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransferencia.add(this.jCheckBoxPostAccionSinCerrarTransferencia, this.gridBagConstraintsTransferencia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.transferenciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.transferenciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTransferencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTransferencia.add(this.jCheckBoxPostAccionSinMensajeTransferencia, this.gridBagConstraintsTransferencia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx = iPosXAccion++;
			
		this.jPanelAccionesTransferencia.add(this.jButtonModificarTransferencia, this.gridBagConstraintsTransferencia);							

		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTransferencia.gridy = 0;
		this.gridBagConstraintsTransferencia.gridx =iPosXAccion++;
			
		this.jPanelAccionesTransferencia.add(this.jButtonEliminarTransferencia, this.gridBagConstraintsTransferencia);
		
			
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = 0;		
		this.gridBagConstraintsTransferencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransferencia.add(this.jButtonActualizarTransferencia, this.gridBagConstraintsTransferencia);


		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = 0;		
		this.gridBagConstraintsTransferencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesTransferencia.add(this.jButtonGuardarCambiosTransferencia, this.gridBagConstraintsTransferencia);	
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = 0;		
		this.gridBagConstraintsTransferencia.gridx =iPosXAccion++;
		
		this.jPanelAccionesTransferencia.add(this.jButtonCancelarTransferencia, this.gridBagConstraintsTransferencia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTransferencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTransferencia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.transferenciaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTransferencia = new GridBagConstraints();						
			this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTransferencia.gridx = 0;		
			//this.gridBagConstraintsTransferencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTransferencia.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTransferencia.gridx =0;
		this.gridBagConstraintsTransferencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTransferencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTransferencia, this.gridBagConstraintsTransferencia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TransferenciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTransferencia = new TransferenciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Transferencia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Transferencia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transferencia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TransferenciaModel transferenciaModel=new TransferenciaModel(this);
			
			//SI USARA CLASE INTERNA
			//TransferenciaModel.TransferenciaFocusTraversalPolicy transferenciaFocusTraversalPolicy = transferenciaModel.new TransferenciaFocusTraversalPolicy(this);
			
			//transferenciaFocusTraversalPolicy.settransferenciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(transferenciaModel);
			
			
			this.jContentPaneDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTransferencia = new GridBagLayout();	
			this.jContentPaneDetalleTransferencia.setLayout(gridaBagLayoutDetalleTransferencia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTransferencia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionTransferencia=   new JScrollPane(jContentPaneDetalleTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTransferencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsTransferencia.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTransferencia.gridx = 0;
	        
			this.jContentPaneDetalleTransferencia.add(jPanelCamposTransferencia, gridBagConstraintsTransferencia);
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsTransferencia.gridy = iGridyRelaciones++;
		this.gridBagConstraintsTransferencia.gridx = 0;

		this.jContentPaneDetalleTransferencia.add(jPanelCamposIniciogeneralTransferencia, gridBagConstraintsTransferencia);
			
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
						&& transferenciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(this.puedeCargarPorParteDetalleTransferencia,false,-1);
					
					if(this.transferenciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTransferencia= new GridBagConstraints();
						this.gridBagConstraintsTransferencia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTransferencia.gridx = 0;
						this.jContentPaneDetalleTransferencia.add(this.jTabbedPaneRelacionesTransferencia, this.gridBagConstraintsTransferencia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTransferencia.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
			
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsTransferencia.gridy = iGridyRelaciones++;
		this.gridBagConstraintsTransferencia.gridx = 0;

		this.jContentPaneDetalleTransferencia.add(jPanelCamposFintotalTransferencia, gridBagConstraintsTransferencia);			
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTransferencia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTransferencia = new GridBagConstraints();
					this.gridBagConstraintsTransferencia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTransferencia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTransferencia.gridx = 0;
					
				
					this.jContentPaneDetalleTransferencia.add(jPanelCamposOcultosTransferencia, gridBagConstraintsTransferencia);
				
					this.jPanelCamposOcultosTransferencia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTransferencia.gridx = 0;
	        this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTransferencia.add(this.jPanelAccionesFormularioTransferencia, this.gridBagConstraintsTransferencia);							
			
			
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsTransferencia.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTransferencia.gridx = 0;
	        
			
			this.jContentPaneDetalleTransferencia.add(this.jPanelAccionesTransferencia, this.gridBagConstraintsTransferencia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTransferencia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTransferencia=   new JScrollPane(this.jPanelCamposTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTransferencia.gridx = 0;
			this.gridBagConstraintsTransferencia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTransferencia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTransferencia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTransferencia, this.gridBagConstraintsTransferencia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransferencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTransferencia, this.gridBagConstraintsTransferencia);			
			
			this.gridBagConstraintsTransferencia = new GridBagConstraints();
			this.gridBagConstraintsTransferencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTransferencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTransferencia, this.gridBagConstraintsTransferencia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTransferencia, this.gridBagConstraintsTransferencia);
			
			
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTransferencia, this.gridBagConstraintsTransferencia);
		
			
		this.gridBagConstraintsTransferencia = new GridBagConstraints();
		this.gridBagConstraintsTransferencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTransferencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTransferencia, this.gridBagConstraintsTransferencia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTransferencia;//jContentPane;
		
		return jScrollPanelDatosEdicionTransferencia;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleTransferencia(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalletransferenciaSessionBean=new DetalleTransferenciaSessionBean();
		this.detalletransferenciaSessionBean.setConGuardarRelaciones(false);
		this.detalletransferenciaSessionBean.setEsGuardarRelacionado(true);

		this.detalletransferenciaBeanSwingJInternalFrame=null;//new DetalleTransferenciaBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalletransferenciaBeanSwingJInternalFramePopup=new DetalleTransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalletransferenciaBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {

				DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalletransferenciaSessionBean.setEsGuardarRelacionado(true);

				this.detalletransferenciaBeanSwingJInternalFrame=new DetalleTransferenciaBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalletransferenciaBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalletransferenciaBeanSwingJInternalFrame.setdetalletransferenciaSessionBean(this.detalletransferenciaSessionBean);

				//this.gridBagConstraintsTransferencia = new GridBagConstraints();
				//this.gridBagConstraintsTransferencia.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTransferencia.gridx = 0;
				//this.jContentPaneDetalleTransferencia.add(this.detalletransferenciaBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTransferencia);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTransferencia.add("Detalle Transferencias",this.detalletransferenciaBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTransferencia.setComponentAt(iIndexTab,this.detalletransferenciaBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalletransferenciaSessionBean.setEsGuardarRelacionado(false);
				this.detalletransferenciaBeanSwingJInternalFrame=null;//new DetalleTransferenciaBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleTransferencia) {
					this.jTabbedPaneRelacionesTransferencia.add("Detalle Transferencias",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleTransferenciaBeanSwingJInternalFrame(List<Transferencia> transferencias,Transferencia transferencia,DetalleTransferenciaBeanSwingJInternalFrame detalletransferenciaBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalletransferenciaBeanSwingJInternalFrame=new DetalleTransferenciaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalletransferenciaBeanSwingJInternalFrame.getDetalleTransferenciaLogic().setConnexion(this.transferenciaLogic.getConnexion());

					detalletransferenciaBeanSwingJInternalFrame.settransferenciasForeignKey(transferencias);
					detalletransferenciaBeanSwingJInternalFrame.settransferenciaForeignKey(transferencia);
					detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setisBusquedaDesdeForeignKeySesionTransferencia(true);
					detalletransferenciaBeanSwingJInternalFrame.detalletransferenciaSessionBean.setlidTransferenciaActual(transferencia.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalletransferenciaBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleTransferencia(detalletransferenciaBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalletransferenciaBeanSwingJInternalFrame.setVisibilidadBusquedasParaTransferencia(true);
					detalletransferenciaBeanSwingJInternalFrame.setid_transferenciaFK_IdTransferencia(transferencia.getId());

					if(!this.conCargarFormDetalle) {
						detalletransferenciaBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detalletransferenciaBeanSwingJInternalFrame.setSelectedItemCombosFrameTransferenciaForeignKey(transferencia,1,false,true,true);
					detalletransferenciaBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalletransferenciaBeanSwingJInternalFrame.procesarBusqueda("FK_IdTransferencia");
					detalletransferenciaBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTransferencia");
					detalletransferenciaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTransferencia(true);
					detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleTransferencia("n",detalletransferenciaBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalletransferenciaBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalletransferenciaBeanSwingJInternalFrame.setAutoscrolls(true);
					detalletransferenciaBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTransferencia("relacionado");
					} else {
						detalletransferenciaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTransferencia("no_relacionado");
					}

					detalletransferenciaBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleTransferencia().setVisible(false);

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
