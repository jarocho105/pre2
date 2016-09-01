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
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.util.DetaNotaCreditoConstantesFunciones;

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
public class DetaNotaCreditoDetalleFormJInternalFrame extends DetaNotaCreditoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetaNotaCredito;
	
	protected JMenuBar jmenuBarDetalleDetaNotaCredito;
	
	protected JMenu jmenuDetalleDetaNotaCredito;
	protected JMenu jmenuDetalleArchivoDetaNotaCredito;
	protected JMenu jmenuDetalleAccionesDetaNotaCredito;
	protected JMenu jmenuDetalleDatosDetaNotaCredito;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetaNotaCredito;	
	protected GridBagConstraints gridBagConstraintsDetaNotaCredito;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetaNotaCreditoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetaNotaCredito;		
	
	
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

	protected NotaCreditoBeanSwingJInternalFrame notacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_notacredito="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected TipoDetaNotaCreditoBeanSwingJInternalFrame tipodetanotacreditoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodetanotacredito="";

	protected TipoDevolucionEmpresaBeanSwingJInternalFrame tipodevolucionempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodevolucionempresa="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected EmpaqueBeanSwingJInternalFrame empaqueBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empaque="";
	
	public DetaNotaCreditoSessionBean detanotacreditoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public NotaCreditoSessionBean notacreditoSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public TipoDetaNotaCreditoSessionBean tipodetanotacreditoSessionBean;
	public TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public EmpaqueSessionBean empaqueSessionBean;	
	
	public DetaNotaCreditoLogic detanotacreditoLogic;
	
	public JScrollPane jScrollPanelDatosDetaNotaCredito;
	public JScrollPane jScrollPanelDatosEdicionDetaNotaCredito;
	public JScrollPane jScrollPanelDatosGeneralDetaNotaCredito;
	
	protected JPanel jPanelCamposDetaNotaCredito;    
	protected JPanel jPanelCamposOcultosDetaNotaCredito;    	
	protected JPanel jPanelAccionesDetaNotaCredito;
	protected JPanel jPanelAccionesFormularioDetaNotaCredito;
    
	
	
	protected Integer iXPanelCamposDetaNotaCredito=0;
	protected Integer iYPanelCamposDetaNotaCredito=0;
	
	protected Integer iXPanelCamposOcultosDetaNotaCredito=0;
	protected Integer iYPanelCamposOcultosDetaNotaCredito=0;
	
	

	protected JPanel jPanelCamposIniciogeneralDetaNotaCredito;
	protected Integer iXPanelCamposIniciogeneralDetaNotaCredito=0;
	protected Integer iYPanelCamposIniciogeneralDetaNotaCredito=0;

	protected JPanel jPanelCamposIniciovaloresDetaNotaCredito;
	protected Integer iXPanelCamposIniciovaloresDetaNotaCredito=0;
	protected Integer iYPanelCamposIniciovaloresDetaNotaCredito=0;

	protected JPanel jPanelCamposInicioextraDetaNotaCredito;
	protected Integer iXPanelCamposInicioextraDetaNotaCredito=0;
	protected Integer iYPanelCamposInicioextraDetaNotaCredito=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetaNotaCredito;
	public JButton jButtonModificarDetaNotaCredito;
	public JButton jButtonActualizarDetaNotaCredito;
    public JButton jButtonEliminarDetaNotaCredito;
	public JButton jButtonCancelarDetaNotaCredito;
    public JButton jButtonGuardarCambiosDetaNotaCredito;
	public JButton jButtonGuardarCambiosTablaDetaNotaCredito;
	protected JButton jButtonCerrarDetaNotaCredito;
	
	
	protected JButton jButtonProcesarInformacionDetaNotaCredito;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetaNotaCredito;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetaNotaCredito;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetaNotaCredito;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetaNotaCredito;
	protected JButton jButtonModificarToolBarDetaNotaCredito;
	protected JButton jButtonActualizarToolBarDetaNotaCredito;
    protected JButton jButtonEliminarToolBarDetaNotaCredito;
	protected JButton jButtonCancelarToolBarDetaNotaCredito;
    protected JButton jButtonGuardarCambiosToolBarDetaNotaCredito;
	protected JButton jButtonGuardarCambiosTablaToolBarDetaNotaCredito;
	protected JButton jButtonMostrarOcultarTablaToolBarDetaNotaCredito;
	protected JButton jButtonCerrarToolBarDetaNotaCredito;
	
	protected JButton jButtonProcesarInformacionToolBarDetaNotaCredito;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetaNotaCredito;
	protected JMenuItem jMenuItemModificarDetaNotaCredito;
	protected JMenuItem jMenuItemActualizarDetaNotaCredito;
    protected JMenuItem jMenuItemEliminarDetaNotaCredito;
	protected JMenuItem jMenuItemCancelarDetaNotaCredito;
    protected JMenuItem jMenuItemGuardarCambiosDetaNotaCredito;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetaNotaCredito;
	protected JMenuItem jMenuItemCerrarDetaNotaCredito;
	protected JMenuItem jMenuItemDetalleCerrarDetaNotaCredito;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetaNotaCredito;
	
	protected JMenuItem jMenuItemProcesarInformacionDetaNotaCredito;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetaNotaCredito;
	protected JMenuItem jMenuItemMostrarOcultarDetaNotaCredito;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetaNotaCredito;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetaNotaCredito;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetaNotaCredito;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetaNotaCredito;
	public JLabel jLabelIdDetaNotaCredito;
	public JLabel jLabelidDetaNotaCredito;
	public JButton jButtonidDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetaNotaCredito;
	public JLabel jLabeldescripcionDetaNotaCredito;
	public JTextArea jTextAreadescripcionDetaNotaCredito;
	public JScrollPane jscrollPanedescripcionDetaNotaCredito;
	public JButton jButtondescripcionDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetaNotaCredito;
	public JLabel jLabelcantidadDetaNotaCredito;
	public JTextField jTextFieldcantidadDetaNotaCredito;
	public JButton jButtoncantidadDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetaNotaCredito;
	public JLabel jLabelprecioDetaNotaCredito;
	public JTextField jTextFieldprecioDetaNotaCredito;
	public JButton jButtonprecioDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelmontoDetaNotaCredito;
	public JLabel jLabelmontoDetaNotaCredito;
	public JTextField jTextFieldmontoDetaNotaCredito;
	public JButton jButtonmontoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelcostoDetaNotaCredito;
	public JLabel jLabelcostoDetaNotaCredito;
	public JTextField jTextFieldcostoDetaNotaCredito;
	public JButton jButtoncostoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetaNotaCredito;
	public JLabel jLabeldescuentoDetaNotaCredito;
	public JTextField jTextFielddescuentoDetaNotaCredito;
	public JButton jButtondescuentoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneldescuento2DetaNotaCredito;
	public JLabel jLabeldescuento2DetaNotaCredito;
	public JTextField jTextFielddescuento2DetaNotaCredito;
	public JButton jButtondescuento2DetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelimpuestoDetaNotaCredito;
	public JLabel jLabelimpuestoDetaNotaCredito;
	public JTextField jTextFieldimpuestoDetaNotaCredito;
	public JButton jButtonimpuestoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelporcen_ivaDetaNotaCredito;
	public JLabel jLabelporcen_ivaDetaNotaCredito;
	public JTextField jTextFieldporcen_ivaDetaNotaCredito;
	public JButton jButtonporcen_ivaDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelporcen_descuenDetaNotaCredito;
	public JLabel jLabelporcen_descuenDetaNotaCredito;
	public JTextField jTextFieldporcen_descuenDetaNotaCredito;
	public JButton jButtonporcen_descuenDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelporcen_iceDetaNotaCredito;
	public JLabel jLabelporcen_iceDetaNotaCredito;
	public JTextField jTextFieldporcen_iceDetaNotaCredito;
	public JButton jButtonporcen_iceDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalDetaNotaCredito;
	public JLabel jLabelsub_totalDetaNotaCredito;
	public JTextField jTextFieldsub_totalDetaNotaCredito;
	public JButton jButtonsub_totalDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetaNotaCredito;
	public JLabel jLabeltotalDetaNotaCredito;
	public JTextField jTextFieldtotalDetaNotaCredito;
	public JButton jButtontotalDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelincluye_impuestoDetaNotaCredito;
	public JLabel jLabelincluye_impuestoDetaNotaCredito;
	public JCheckBox jCheckBoxincluye_impuestoDetaNotaCredito;
	public JButton jButtonincluye_impuestoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionDetaNotaCredito;
	public JLabel jLabelfecha_emisionDetaNotaCredito;
	//public JFormattedTextField jDateChooserfecha_emisionDetaNotaCredito;

	public JDateChooser jDateChooserfecha_emisionDetaNotaCredito;
	public JButton jButtonfecha_emisionDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_loteDetaNotaCredito;
	public JLabel jLabelcodigo_loteDetaNotaCredito;
	public JTextField jTextFieldcodigo_loteDetaNotaCredito;
	public JButton jButtoncodigo_loteDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cajaDetaNotaCredito;
	public JLabel jLabelnumero_cajaDetaNotaCredito;
	public JTextField jTextFieldnumero_cajaDetaNotaCredito;
	public JButton jButtonnumero_cajaDetaNotaCreditoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetaNotaCredito;
	public JLabel jLabelid_empresaDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetaNotaCredito;
	public JButton jButtonid_empresaDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_empresaDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetaNotaCredito;
	public JLabel jLabelid_sucursalDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetaNotaCredito;
	public JButton jButtonid_sucursalDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_sucursalDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetaNotaCredito;
	public JLabel jLabelid_ejercicioDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetaNotaCredito;
	public JButton jButtonid_ejercicioDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_ejercicioDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetaNotaCredito;
	public JLabel jLabelid_periodoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetaNotaCredito;
	public JButton jButtonid_periodoDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_periodoDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetaNotaCredito;
	public JLabel jLabelid_anioDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetaNotaCredito;
	public JButton jButtonid_anioDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_anioDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_anioDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetaNotaCredito;
	public JLabel jLabelid_mesDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetaNotaCredito;
	public JButton jButtonid_mesDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_mesDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_mesDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_nota_creditoDetaNotaCredito;
	public JLabel jLabelid_nota_creditoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nota_creditoDetaNotaCredito;
	public JButton jButtonid_nota_creditoDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_nota_creditoDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_nota_creditoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetaNotaCredito;
	public JLabel jLabelid_bodegaDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetaNotaCredito;
	public JButton jButtonid_bodegaDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_bodegaDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetaNotaCredito;
	public JLabel jLabelid_productoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetaNotaCredito;
	public JButton jButtonid_productoDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_productoDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_productoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetaNotaCredito;
	public JLabel jLabelid_unidadDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetaNotaCredito;
	public JButton jButtonid_unidadDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_unidadDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_deta_nota_creditoDetaNotaCredito;
	public JLabel jLabelid_tipo_deta_nota_creditoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito;
	public JButton jButtonid_tipo_deta_nota_creditoDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_tipo_deta_nota_creditoDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_devolucion_empresaDetaNotaCredito;
	public JLabel jLabelid_tipo_devolucion_empresaDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_devolucion_empresaDetaNotaCredito;
	public JButton jButtonid_tipo_devolucion_empresaDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetaNotaCredito;
	public JLabel jLabelid_centro_costoDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetaNotaCredito;
	public JButton jButtonid_centro_costoDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_centro_costoDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetaNotaCreditoBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetaNotaCreditoArbol= new JButtonMe();

	public JPanel jPanelid_empaqueDetaNotaCredito;
	public JLabel jLabelid_empaqueDetaNotaCredito;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empaqueDetaNotaCredito;
	public JButton jButtonid_empaqueDetaNotaCredito= new JButtonMe();
	public JButton jButtonid_empaqueDetaNotaCreditoUpdate= new JButtonMe();
	public JButton jButtonid_empaqueDetaNotaCreditoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetaNotaCredito;
	
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
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetaNotaCreditoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetaNotaCredito=new JPanel();
				this.jPanelAccionesFormularioDetaNotaCredito=new JPanel();
				this.jmenuBarDetalleDetaNotaCredito=new JMenuBar();
				this.jTtoolBarDetalleDetaNotaCredito=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetaNotaCreditoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetaNotaCredito No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetaNotaCredito() {
		return this.jButtonActualizarToolBarDetaNotaCredito;
	}
	
	public JButton getjButtonEliminarToolBarDetaNotaCredito() {
		return this.jButtonEliminarToolBarDetaNotaCredito;
	}
	
	public JButton getjButtonCancelarToolBarDetaNotaCredito() {
		return this.jButtonCancelarToolBarDetaNotaCredito;
	}		
	
	public JButton getjButtonProcesarInformacionDetaNotaCredito() {
		return this.jButtonProcesarInformacionDetaNotaCredito;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetaNotaCredito)	{
		this.jButtonProcesarInformacionDetaNotaCredito = jButtonProcesarInformacionDetaNotaCredito;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetaNotaCredito() {
		return this.jComboBoxTiposAccionesDetaNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetaNotaCredito(
			JComboBox jComboBoxTiposRelacionesDetaNotaCredito) {
		this.jComboBoxTiposRelacionesDetaNotaCredito = jComboBoxTiposRelacionesDetaNotaCredito;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetaNotaCredito(
			JComboBox jComboBoxTiposAccionesDetaNotaCredito) {
		this.jComboBoxTiposAccionesDetaNotaCredito = jComboBoxTiposAccionesDetaNotaCredito;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetaNotaCredito() {
		return this.jComboBoxTiposAccionesFormularioDetaNotaCredito;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetaNotaCredito(
			JComboBox jComboBoxTiposAccionesFormularioDetaNotaCredito) {
		this.jComboBoxTiposAccionesFormularioDetaNotaCredito = jComboBoxTiposAccionesFormularioDetaNotaCredito;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detanotacreditoSessionBean=new DetaNotaCreditoSessionBean();
		
		this.detanotacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detanotacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detanotacreditoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetaNotaCreditoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetaNotaCreditoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Deta Nota Credito MANTENIMIENTO"));
		
		
		if(iWidth > 2750) {
			iWidth=2750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetaNotaCreditoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetaNotaCredito= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetaNotaCredito=new JButtonMe();
				this.jButtonModificarToolBarDetaNotaCredito=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetaNotaCredito,this.jTtoolBarDetalleDetaNotaCredito,
							"actualizar","actualizar","Actualizar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetaNotaCredito,this.jTtoolBarDetalleDetaNotaCredito,
							"eliminar","eliminar","Eliminar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetaNotaCredito,this.jTtoolBarDetalleDetaNotaCredito,
							"cancelar","cancelar","Cancelar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetaNotaCredito=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetaNotaCredito,this.jTtoolBarDetalleDetaNotaCredito,
							"guardarcambios","guardarcambios","Guardar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetaNotaCredito=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetaNotaCredito=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetaNotaCredito=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetaNotaCredito=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetaNotaCredito=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetaNotaCredito= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetaNotaCredito.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetaNotaCredito,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetaNotaCredito= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetaNotaCredito.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetaNotaCredito,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetaNotaCredito= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetaNotaCredito.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetaNotaCredito,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetaNotaCredito= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetaNotaCredito.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetaNotaCredito,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetaNotaCredito= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetaNotaCredito.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetaNotaCredito,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetaNotaCredito= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetaNotaCredito.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetaNotaCredito,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetaNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetaNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetaNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetaNotaCredito= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetaNotaCredito.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetaNotaCredito,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetaNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetaNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetaNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetaNotaCredito= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetaNotaCredito.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetaNotaCredito,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetaNotaCredito.add(this.jMenuItemDetalleCerrarDetaNotaCredito);
		
		this.jmenuDetalleAccionesDetaNotaCredito.add(this.jMenuItemActualizarDetaNotaCredito);
		this.jmenuDetalleAccionesDetaNotaCredito.add(this.jMenuItemEliminarDetaNotaCredito);
		this.jmenuDetalleAccionesDetaNotaCredito.add(this.jMenuItemCancelarDetaNotaCredito);		
		
		//this.jmenuDetalleDatosDetaNotaCredito.add(this.jMenuItemDetalleAbrirOrderByDetaNotaCredito);				
		this.jmenuDetalleDatosDetaNotaCredito.add(this.jMenuItemDetalleMostarOcultarDetaNotaCredito);				
				
		//this.jmenuDetalleAccionesDetaNotaCredito.add(this.jMenuItemGuardarCambiosDetaNotaCredito);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetaNotaCredito.add(this.jmenuDetalleArchivoDetaNotaCredito);		
		this.jmenuBarDetalleDetaNotaCredito.add(this.jmenuDetalleAccionesDetaNotaCredito);		
		this.jmenuBarDetalleDetaNotaCredito.add(this.jmenuDetalleDatosDetaNotaCredito);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetaNotaCredito);				
	}
	
	
	public void inicializarElementosCamposDetaNotaCredito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetaNotaCredito = new JLabelMe();
		jLabelIdDetaNotaCredito.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetaNotaCredito = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetaNotaCredito= new GridBagLayout();

		this.jPanelidDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);

		jLabelidDetaNotaCredito = new JLabel();
		jLabelidDetaNotaCredito.setText("Id");

		jLabelidDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionDetaNotaCredito = new JLabelMe();
		this.jLabeldescripcionDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetaNotaCredito.setToolTipText("Descripcion");
		this.jLabeldescripcionDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPaneldescripcionDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextAreadescripcionDetaNotaCredito= new JTextAreaMe();
		jTextAreadescripcionDetaNotaCredito.setEnabled(false);
		jTextAreadescripcionDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaNotaCredito.setLineWrap(true);
		jTextAreadescripcionDetaNotaCredito.setWrapStyleWord(true);
		jTextAreadescripcionDetaNotaCredito.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetaNotaCredito.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetaNotaCredito = new JScrollPane(jTextAreadescripcionDetaNotaCredito);
		jscrollPanedescripcionDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtondescripcionDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetaNotaCreditoBusqueda.setText("U");
		this.jButtondescripcionDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetaNotaCredito = new JLabelMe();
		this.jLabelcantidadDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetaNotaCredito.setToolTipText("Cantidad");
		this.jLabelcantidadDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelcantidadDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldcantidadDetaNotaCredito= new JTextFieldMe();
		jTextFieldcantidadDetaNotaCredito.setEnabled(false);
		jTextFieldcantidadDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetaNotaCredito.setText("0");

		this.jButtoncantidadDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtoncantidadDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetaNotaCreditoBusqueda.setText("U");
		this.jButtoncantidadDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetaNotaCredito = new JLabelMe();
		this.jLabelprecioDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetaNotaCredito.setToolTipText("Precio");
		this.jLabelprecioDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelprecioDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldprecioDetaNotaCredito= new JTextFieldMe();
		jTextFieldprecioDetaNotaCredito.setEnabled(false);
		jTextFieldprecioDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetaNotaCredito.setText("0.0");

		this.jButtonprecioDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonprecioDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetaNotaCreditoBusqueda.setText("U");
		this.jButtonprecioDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelmontoDetaNotaCredito = new JLabelMe();
		this.jLabelmontoDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoDetaNotaCredito.setToolTipText("Monto");
		this.jLabelmontoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelmontoDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldmontoDetaNotaCredito= new JTextFieldMe();
		jTextFieldmontoDetaNotaCredito.setEnabled(false);
		jTextFieldmontoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoDetaNotaCredito.setText("0.0");

		this.jButtonmontoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonmontoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoDetaNotaCreditoBusqueda.setText("U");
		this.jButtonmontoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelcostoDetaNotaCredito = new JLabelMe();
		this.jLabelcostoDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoDetaNotaCredito.setToolTipText("Costo");
		this.jLabelcostoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelcostoDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldcostoDetaNotaCredito= new JTextFieldMe();
		jTextFieldcostoDetaNotaCredito.setEnabled(false);
		jTextFieldcostoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoDetaNotaCredito.setText("0.0");

		this.jButtoncostoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtoncostoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoDetaNotaCreditoBusqueda.setText("U");
		this.jButtoncostoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetaNotaCredito = new JLabelMe();
		this.jLabeldescuentoDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetaNotaCredito.setToolTipText("Descuento");
		this.jLabeldescuentoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPaneldescuentoDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFielddescuentoDetaNotaCredito= new JTextFieldMe();
		jTextFielddescuentoDetaNotaCredito.setEnabled(false);
		jTextFielddescuentoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetaNotaCredito.setText("0.0");

		this.jButtondescuentoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtondescuentoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetaNotaCreditoBusqueda.setText("U");
		this.jButtondescuentoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeldescuento2DetaNotaCredito = new JLabelMe();
		this.jLabeldescuento2DetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_DESCUENTO2+" : *");
		this.jLabeldescuento2DetaNotaCredito.setToolTipText("Descuento 2");
		this.jLabeldescuento2DetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento2DetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento2DetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento2DetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_DESCUENTO2);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPaneldescuento2DetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFielddescuento2DetaNotaCredito= new JTextFieldMe();
		jTextFielddescuento2DetaNotaCredito.setEnabled(false);
		jTextFielddescuento2DetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento2DetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento2DetaNotaCredito.setText("0.0");

		this.jButtondescuento2DetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtondescuento2DetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento2DetaNotaCreditoBusqueda.setText("U");
		this.jButtondescuento2DetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento2DetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento2DetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento2DetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento2DetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento2DetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento2DetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelimpuestoDetaNotaCredito = new JLabelMe();
		this.jLabelimpuestoDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IMPUESTO+" : *");
		this.jLabelimpuestoDetaNotaCredito.setToolTipText("Impuesto");
		this.jLabelimpuestoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuestoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuestoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuestoDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IMPUESTO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelimpuestoDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldimpuestoDetaNotaCredito= new JTextFieldMe();
		jTextFieldimpuestoDetaNotaCredito.setEnabled(false);
		jTextFieldimpuestoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuestoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuestoDetaNotaCredito.setText("0.0");

		this.jButtonimpuestoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonimpuestoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuestoDetaNotaCreditoBusqueda.setText("U");
		this.jButtonimpuestoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuestoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuestoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuestoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuestoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuestoDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuestoDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelporcen_ivaDetaNotaCredito = new JLabelMe();
		this.jLabelporcen_ivaDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_PORCENIVA+" : *");
		this.jLabelporcen_ivaDetaNotaCredito.setToolTipText("% Iva");
		this.jLabelporcen_ivaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_ivaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_ivaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_ivaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_ivaDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_ivaDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_PORCENIVA);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelporcen_ivaDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldporcen_ivaDetaNotaCredito= new JTextFieldMe();
		jTextFieldporcen_ivaDetaNotaCredito.setEnabled(false);
		jTextFieldporcen_ivaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_ivaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_ivaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_ivaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_ivaDetaNotaCredito.setText("0.0");

		this.jButtonporcen_ivaDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonporcen_ivaDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_ivaDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_ivaDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_ivaDetaNotaCreditoBusqueda.setText("U");
		this.jButtonporcen_ivaDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_ivaDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_ivaDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_ivaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_ivaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_ivaDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_ivaDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelporcen_descuenDetaNotaCredito = new JLabelMe();
		this.jLabelporcen_descuenDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_PORCENDESCUEN+" : *");
		this.jLabelporcen_descuenDetaNotaCredito.setToolTipText("% Descuen");
		this.jLabelporcen_descuenDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_descuenDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_descuenDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_descuenDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_descuenDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_descuenDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_PORCENDESCUEN);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelporcen_descuenDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldporcen_descuenDetaNotaCredito= new JTextFieldMe();
		jTextFieldporcen_descuenDetaNotaCredito.setEnabled(false);
		jTextFieldporcen_descuenDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_descuenDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_descuenDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_descuenDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_descuenDetaNotaCredito.setText("0.0");

		this.jButtonporcen_descuenDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonporcen_descuenDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_descuenDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_descuenDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_descuenDetaNotaCreditoBusqueda.setText("U");
		this.jButtonporcen_descuenDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_descuenDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_descuenDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_descuenDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_descuenDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_descuenDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_descuenDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelporcen_iceDetaNotaCredito = new JLabelMe();
		this.jLabelporcen_iceDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_PORCENICE+" : *");
		this.jLabelporcen_iceDetaNotaCredito.setToolTipText("% Ice");
		this.jLabelporcen_iceDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_iceDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_iceDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_iceDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_iceDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_iceDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_PORCENICE);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelporcen_iceDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldporcen_iceDetaNotaCredito= new JTextFieldMe();
		jTextFieldporcen_iceDetaNotaCredito.setEnabled(false);
		jTextFieldporcen_iceDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_iceDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_iceDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_iceDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_iceDetaNotaCredito.setText("0.0");

		this.jButtonporcen_iceDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonporcen_iceDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_iceDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_iceDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_iceDetaNotaCreditoBusqueda.setText("U");
		this.jButtonporcen_iceDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_iceDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_iceDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_iceDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_iceDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_iceDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_iceDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalDetaNotaCredito = new JLabelMe();
		this.jLabelsub_totalDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalDetaNotaCredito.setToolTipText("Sub Total");
		this.jLabelsub_totalDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelsub_totalDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldsub_totalDetaNotaCredito= new JTextFieldMe();
		jTextFieldsub_totalDetaNotaCredito.setEnabled(false);
		jTextFieldsub_totalDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalDetaNotaCredito.setText("0.0");

		this.jButtonsub_totalDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonsub_totalDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalDetaNotaCreditoBusqueda.setText("U");
		this.jButtonsub_totalDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetaNotaCredito = new JLabelMe();
		this.jLabeltotalDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetaNotaCredito.setToolTipText("Total");
		this.jLabeltotalDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPaneltotalDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldtotalDetaNotaCredito= new JTextFieldMe();
		jTextFieldtotalDetaNotaCredito.setEnabled(false);
		jTextFieldtotalDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetaNotaCredito.setText("0.0");

		this.jButtontotalDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtontotalDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetaNotaCreditoBusqueda.setText("U");
		this.jButtontotalDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelincluye_impuestoDetaNotaCredito = new JLabelMe();
		this.jLabelincluye_impuestoDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_INCLUYEIMPUESTO+" : *");
		this.jLabelincluye_impuestoDetaNotaCredito.setToolTipText("Incluye Impuesto");
		this.jLabelincluye_impuestoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelincluye_impuestoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelincluye_impuestoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelincluye_impuestoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelincluye_impuestoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelincluye_impuestoDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_INCLUYEIMPUESTO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelincluye_impuestoDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jCheckBoxincluye_impuestoDetaNotaCredito= new JCheckBoxMe();
		jCheckBoxincluye_impuestoDetaNotaCredito.setEnabled(false);

		jCheckBoxincluye_impuestoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxincluye_impuestoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxincluye_impuestoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxincluye_impuestoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonincluye_impuestoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonincluye_impuestoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonincluye_impuestoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonincluye_impuestoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonincluye_impuestoDetaNotaCreditoBusqueda.setText("U");
		this.jButtonincluye_impuestoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonincluye_impuestoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonincluye_impuestoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxincluye_impuestoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxincluye_impuestoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"incluye_impuestoDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonincluye_impuestoDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionDetaNotaCredito = new JLabelMe();
		this.jLabelfecha_emisionDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionDetaNotaCredito.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelfecha_emisionDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		//jFormattedTextFieldfecha_emisionDetaNotaCredito= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionDetaNotaCredito= new JDateChooser();
		jDateChooserfecha_emisionDetaNotaCredito.setEnabled(false);
		jDateChooserfecha_emisionDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionDetaNotaCredito.setDate(new Date());
		jDateChooserfecha_emisionDetaNotaCredito.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionDetaNotaCredito.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonfecha_emisionDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionDetaNotaCreditoBusqueda.setText("U");
		this.jButtonfecha_emisionDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_loteDetaNotaCredito = new JLabelMe();
		this.jLabelcodigo_loteDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_CODIGOLOTE+" :");
		this.jLabelcodigo_loteDetaNotaCredito.setToolTipText("Codigo Lote");
		this.jLabelcodigo_loteDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_loteDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_loteDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_loteDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_loteDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_loteDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_CODIGOLOTE);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelcodigo_loteDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldcodigo_loteDetaNotaCredito= new JTextFieldMe();

		jTextFieldcodigo_loteDetaNotaCredito.setEnabled(false);
		jTextFieldcodigo_loteDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_loteDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_loteDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_loteDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_loteDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtoncodigo_loteDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_loteDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_loteDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_loteDetaNotaCreditoBusqueda.setText("U");
		this.jButtoncodigo_loteDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_loteDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_loteDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_loteDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_loteDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_loteDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_loteDetaNotaCreditoBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cajaDetaNotaCredito = new JLabelMe();
		this.jLabelnumero_cajaDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_NUMEROCAJA+" :");
		this.jLabelnumero_cajaDetaNotaCredito.setToolTipText("Numero Caja");
		this.jLabelnumero_cajaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cajaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cajaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cajaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cajaDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cajaDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_NUMEROCAJA);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelnumero_cajaDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jTextFieldnumero_cajaDetaNotaCredito= new JTextFieldMe();

		jTextFieldnumero_cajaDetaNotaCredito.setEnabled(false);
		jTextFieldnumero_cajaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cajaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cajaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cajaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cajaDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonnumero_cajaDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cajaDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cajaDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cajaDetaNotaCreditoBusqueda.setText("U");
		this.jButtonnumero_cajaDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cajaDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cajaDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cajaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cajaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cajaDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cajaDetaNotaCreditoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetaNotaCredito() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetaNotaCredito = new JLabelMe();
		this.jLabelid_empresaDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetaNotaCredito.setToolTipText("Empresa");
		this.jLabelid_empresaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_empresaDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_empresaDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_empresaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetaNotaCredito.setEnabled(false);

		this.jButtonid_empresaDetaNotaCredito= new JButtonMe();
		this.jButtonid_empresaDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaNotaCredito.setText("Buscar");
		this.jButtonid_empresaDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaNotaCredito"));

		this.jButtonid_empresaDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_empresaDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_empresaDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_empresaDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_empresaDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaNotaCreditoUpdate"));



					
		this.jLabelid_sucursalDetaNotaCredito = new JLabelMe();
		this.jLabelid_sucursalDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetaNotaCredito.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_sucursalDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_sucursalDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_sucursalDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetaNotaCredito.setEnabled(false);

		this.jButtonid_sucursalDetaNotaCredito= new JButtonMe();
		this.jButtonid_sucursalDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetaNotaCredito.setText("Buscar");
		this.jButtonid_sucursalDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetaNotaCredito"));

		this.jButtonid_sucursalDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_sucursalDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_sucursalDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_sucursalDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetaNotaCreditoUpdate"));



					
		this.jLabelid_ejercicioDetaNotaCredito = new JLabelMe();
		this.jLabelid_ejercicioDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetaNotaCredito.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_ejercicioDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_ejercicioDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_ejercicioDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetaNotaCredito.setEnabled(false);

		this.jButtonid_ejercicioDetaNotaCredito= new JButtonMe();
		this.jButtonid_ejercicioDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetaNotaCredito.setText("Buscar");
		this.jButtonid_ejercicioDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetaNotaCredito"));

		this.jButtonid_ejercicioDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_ejercicioDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_ejercicioDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetaNotaCreditoUpdate"));



					
		this.jLabelid_periodoDetaNotaCredito = new JLabelMe();
		this.jLabelid_periodoDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetaNotaCredito.setToolTipText("Periodo");
		this.jLabelid_periodoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_periodoDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_periodoDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_periodoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetaNotaCredito.setEnabled(false);

		this.jButtonid_periodoDetaNotaCredito= new JButtonMe();
		this.jButtonid_periodoDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetaNotaCredito.setText("Buscar");
		this.jButtonid_periodoDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetaNotaCredito"));

		this.jButtonid_periodoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_periodoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_periodoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_periodoDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_periodoDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetaNotaCreditoUpdate"));



					
		this.jLabelid_anioDetaNotaCredito = new JLabelMe();
		this.jLabelid_anioDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetaNotaCredito.setToolTipText("Anio");
		this.jLabelid_anioDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_anioDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_anioDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_anioDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetaNotaCredito.setEnabled(false);

		this.jButtonid_anioDetaNotaCredito= new JButtonMe();
		this.jButtonid_anioDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetaNotaCredito.setText("Buscar");
		this.jButtonid_anioDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetaNotaCredito"));

		this.jButtonid_anioDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_anioDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_anioDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_anioDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_anioDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_anioDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetaNotaCreditoUpdate"));



					
		this.jLabelid_mesDetaNotaCredito = new JLabelMe();
		this.jLabelid_mesDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetaNotaCredito.setToolTipText("Mes");
		this.jLabelid_mesDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_mesDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_mesDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_mesDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetaNotaCredito.setEnabled(false);

		this.jButtonid_mesDetaNotaCredito= new JButtonMe();
		this.jButtonid_mesDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetaNotaCredito.setText("Buscar");
		this.jButtonid_mesDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetaNotaCredito"));

		this.jButtonid_mesDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_mesDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_mesDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_mesDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_mesDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_mesDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetaNotaCreditoUpdate"));



					
		this.jLabelid_nota_creditoDetaNotaCredito = new JLabelMe();
		this.jLabelid_nota_creditoDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDNOTACREDITO+" : *");
		this.jLabelid_nota_creditoDetaNotaCredito.setToolTipText("Nota Credito");
		this.jLabelid_nota_creditoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_nota_creditoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_nota_creditoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_nota_creditoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_nota_creditoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_nota_creditoDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDNOTACREDITO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_nota_creditoDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_nota_creditoDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_nota_creditoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nota_creditoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nota_creditoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nota_creditoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_nota_creditoDetaNotaCredito= new JButtonMe();
		this.jButtonid_nota_creditoDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nota_creditoDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nota_creditoDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nota_creditoDetaNotaCredito.setText("Buscar");
		this.jButtonid_nota_creditoDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_nota_creditoDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nota_creditoDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_nota_creditoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nota_creditoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nota_creditoDetaNotaCredito"));

		this.jButtonid_nota_creditoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_nota_creditoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nota_creditoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nota_creditoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nota_creditoDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_nota_creditoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_nota_creditoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nota_creditoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_nota_creditoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nota_creditoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nota_creditoDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_nota_creditoDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_nota_creditoDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_nota_creditoDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nota_creditoDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nota_creditoDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nota_creditoDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_nota_creditoDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_nota_creditoDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nota_creditoDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_nota_creditoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nota_creditoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nota_creditoDetaNotaCreditoUpdate"));



					
		this.jLabelid_bodegaDetaNotaCredito = new JLabelMe();
		this.jLabelid_bodegaDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetaNotaCredito.setToolTipText("Bodega");
		this.jLabelid_bodegaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_bodegaDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_bodegaDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_bodegaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetaNotaCredito= new JButtonMe();
		this.jButtonid_bodegaDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetaNotaCredito.setText("Buscar");
		this.jButtonid_bodegaDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetaNotaCredito"));

		this.jButtonid_bodegaDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_bodegaDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_bodegaDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_bodegaDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetaNotaCreditoUpdate"));



					
		this.jLabelid_productoDetaNotaCredito = new JLabelMe();
		this.jLabelid_productoDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetaNotaCredito.setToolTipText("Producto");
		this.jLabelid_productoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_productoDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_productoDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_productoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetaNotaCredito= new JButtonMe();
		this.jButtonid_productoDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetaNotaCredito.setText("Buscar");
		this.jButtonid_productoDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetaNotaCredito"));

		this.jButtonid_productoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_productoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_productoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_productoDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_productoDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_productoDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetaNotaCreditoUpdate"));



					
		this.jLabelid_unidadDetaNotaCredito = new JLabelMe();
		this.jLabelid_unidadDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetaNotaCredito.setToolTipText("Unidad");
		this.jLabelid_unidadDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_unidadDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_unidadDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_unidadDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetaNotaCredito= new JButtonMe();
		this.jButtonid_unidadDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetaNotaCredito.setText("Buscar");
		this.jButtonid_unidadDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetaNotaCredito"));

		this.jButtonid_unidadDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_unidadDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_unidadDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_unidadDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_unidadDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetaNotaCreditoUpdate"));



					
		this.jLabelid_tipo_deta_nota_creditoDetaNotaCredito = new JLabelMe();
		this.jLabelid_tipo_deta_nota_creditoDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDTIPODETANOTACREDITO+" : *");
		this.jLabelid_tipo_deta_nota_creditoDetaNotaCredito.setToolTipText("Tipo");
		this.jLabelid_tipo_deta_nota_creditoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_deta_nota_creditoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_deta_nota_creditoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_deta_nota_creditoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_deta_nota_creditoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_deta_nota_creditoDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDTIPODETANOTACREDITO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_tipo_deta_nota_creditoDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_deta_nota_creditoDetaNotaCredito= new JButtonMe();
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCredito.setText("Buscar");
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_deta_nota_creditoDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_deta_nota_creditoDetaNotaCredito"));

		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_deta_nota_creditoDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_deta_nota_creditoDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_deta_nota_creditoDetaNotaCreditoUpdate"));



					
		this.jLabelid_tipo_devolucion_empresaDetaNotaCredito = new JLabelMe();
		this.jLabelid_tipo_devolucion_empresaDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA+" : *");
		this.jLabelid_tipo_devolucion_empresaDetaNotaCredito.setToolTipText("Tipo Devolucion");
		this.jLabelid_tipo_devolucion_empresaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_devolucion_empresaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_devolucion_empresaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_devolucion_empresaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_devolucion_empresaDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_devolucion_empresaDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_tipo_devolucion_empresaDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_tipo_devolucion_empresaDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_tipo_devolucion_empresaDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_devolucion_empresaDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_devolucion_empresaDetaNotaCredito= new JButtonMe();
		this.jButtonid_tipo_devolucion_empresaDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCredito.setText("Buscar");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_devolucion_empresaDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_devolucion_empresaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_devolucion_empresaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_devolucion_empresaDetaNotaCredito"));

		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_devolucion_empresaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_devolucion_empresaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_devolucion_empresaDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_devolucion_empresaDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_devolucion_empresaDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_devolucion_empresaDetaNotaCreditoUpdate"));



					
		this.jLabelid_centro_costoDetaNotaCredito = new JLabelMe();
		this.jLabelid_centro_costoDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetaNotaCredito.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_centro_costoDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_centro_costoDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_centro_costoDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetaNotaCredito= new JButtonMe();
		this.jButtonid_centro_costoDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetaNotaCredito.setText("Buscar");
		this.jButtonid_centro_costoDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetaNotaCredito"));

		this.jButtonid_centro_costoDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_centro_costoDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_centro_costoDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetaNotaCreditoUpdate"));


		jButtonid_centro_costoDetaNotaCreditoArbol= new JButtonMe();
		jButtonid_centro_costoDetaNotaCreditoArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetaNotaCreditoArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetaNotaCreditoArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetaNotaCreditoArbol.setText("Arbol");
		jButtonid_centro_costoDetaNotaCreditoArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetaNotaCreditoArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetaNotaCreditoArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetaNotaCreditoArbol"));



					
		this.jLabelid_empaqueDetaNotaCredito = new JLabelMe();
		this.jLabelid_empaqueDetaNotaCredito.setText(""+DetaNotaCreditoConstantesFunciones.LABEL_IDEMPAQUE+" :");
		this.jLabelid_empaqueDetaNotaCredito.setToolTipText("Empaque");
		this.jLabelid_empaqueDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empaqueDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empaqueDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empaqueDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empaqueDetaNotaCredito=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empaqueDetaNotaCredito.setToolTipText(DetaNotaCreditoConstantesFunciones.LABEL_IDEMPAQUE);
		this.gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		this.jPanelid_empaqueDetaNotaCredito.setLayout(this.gridaBagLayoutDetaNotaCredito);


		jComboBoxid_empaqueDetaNotaCredito= new JComboBoxMe();
		jComboBoxid_empaqueDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empaqueDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empaqueDetaNotaCredito= new JButtonMe();
		this.jButtonid_empaqueDetaNotaCredito.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empaqueDetaNotaCredito.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empaqueDetaNotaCredito.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empaqueDetaNotaCredito.setText("Buscar");
		this.jButtonid_empaqueDetaNotaCredito.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empaqueDetaNotaCredito.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empaqueDetaNotaCredito,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empaqueDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empaqueDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empaqueDetaNotaCredito"));

		this.jButtonid_empaqueDetaNotaCreditoBusqueda= new JButtonMe();
		this.jButtonid_empaqueDetaNotaCreditoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetaNotaCreditoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetaNotaCreditoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empaqueDetaNotaCreditoBusqueda.setText("U");
		this.jButtonid_empaqueDetaNotaCreditoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empaqueDetaNotaCreditoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empaqueDetaNotaCreditoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empaqueDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empaqueDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empaqueDetaNotaCreditoBusqueda"));

		if(this.detanotacreditoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empaqueDetaNotaCreditoBusqueda.setVisible(false);		}

		this.jButtonid_empaqueDetaNotaCreditoUpdate= new JButtonMe();
		this.jButtonid_empaqueDetaNotaCreditoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetaNotaCreditoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetaNotaCreditoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empaqueDetaNotaCreditoUpdate.setText("U");
		this.jButtonid_empaqueDetaNotaCreditoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empaqueDetaNotaCreditoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empaqueDetaNotaCreditoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empaqueDetaNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empaqueDetaNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empaqueDetaNotaCreditoUpdate"));



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
		//this.jInternalFrameDetalleDetaNotaCredito = new DetaNotaCreditoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Deta Nota Credito DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetaNotaCredito= new GridBagLayout();
		

		
		String sToolTipDetaNotaCredito="";
		sToolTipDetaNotaCredito=DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetaNotaCredito+="(Facturacion.DetaNotaCredito)";
		}
		
		if(!this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetaNotaCredito+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetaNotaCredito = new JButtonMe();
		this.jButtonModificarDetaNotaCredito = new JButtonMe();
        this.jButtonActualizarDetaNotaCredito = new JButtonMe();
        this.jButtonEliminarDetaNotaCredito = new JButtonMe();
        this.jButtonCancelarDetaNotaCredito = new JButtonMe();
        this.jButtonGuardarCambiosDetaNotaCredito = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetaNotaCredito = new JButtonMe();
		this.jButtonCerrarDetaNotaCredito = new JButtonMe();
		
		this.jScrollPanelDatosDetaNotaCredito = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetaNotaCredito = new JScrollPane();
		this.jScrollPanelDatosGeneralDetaNotaCredito = new JScrollPane();
		//this.jScrollPanelDatosDetaNotaCreditoTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioextraDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Deta Nota Credito";
		
		if(!this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Deta Nota Creditos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetaNotaCredito.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetaNotaCreditoTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetaNotaCredito.setName("jPanelCamposDetaNotaCredito"); 

		this.jPanelCamposOcultosDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetaNotaCredito.setName("jPanelCamposOcultosDetaNotaCredito"); 

        this.jPanelAccionesDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetaNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesDetaNotaCredito.setName("Acciones"); 

		this.jPanelAccionesFormularioDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetaNotaCredito.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetaNotaCredito.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetaNotaCredito.setName("jPanelCamposFingeneralDetaNotaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetaNotaCredito.setName("jPanelCamposFinvaloresDetaNotaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioextraDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Extra"));
		this.jPanelCamposInicioextraDetaNotaCredito.setName("jPanelCamposFinextraDetaNotaCredito");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioextraDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetaNotaCredito.setText("Nuevo");
		this.jButtonModificarDetaNotaCredito.setText("Editar");
        this.jButtonActualizarDetaNotaCredito.setText("Actualizar");
        this.jButtonEliminarDetaNotaCredito.setText("Eliminar");
        this.jButtonCancelarDetaNotaCredito.setText("Cancelar");
        this.jButtonGuardarCambiosDetaNotaCredito.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetaNotaCredito.setText("Guardar");
		this.jButtonCerrarDetaNotaCredito.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetaNotaCredito,"nuevo_button","Nuevo",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetaNotaCredito,"modificar_button","Editar",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetaNotaCredito,"actualizar_button","Actualizar",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetaNotaCredito,"eliminar_button","Eliminar",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetaNotaCredito,"cancelar_button","Cancelar",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetaNotaCredito,"guardarcambios_button","Guardar",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetaNotaCredito,"guardarcambiostabla_button","Guardar",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetaNotaCredito,"cerrar_button","Salir",this.detanotacreditoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetaNotaCredito.setToolTipText("Nuevo"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetaNotaCredito.setToolTipText("Editar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetaNotaCredito.setToolTipText("Actualizar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetaNotaCredito.setToolTipText("Eliminar)"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetaNotaCredito.setToolTipText("Cancelar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetaNotaCredito.setToolTipText("Guardar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetaNotaCredito.setToolTipText("Guardar"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetaNotaCredito.setToolTipText("Salir"+" "+DetaNotaCreditoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetaNotaCredito";
		inputMap = this.jButtonNuevoDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetaNotaCredito.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetaNotaCredito"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetaNotaCredito";
		inputMap = this.jButtonActualizarDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetaNotaCredito"));
		
		//ELIMINAR
		sMapKey = "EliminarDetaNotaCredito";
		inputMap = this.jButtonEliminarDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetaNotaCredito"));
		
		//CANCELAR	
		sMapKey = "CancelarDetaNotaCredito";
		inputMap = this.jButtonCancelarDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetaNotaCredito"));
		
		//CERRAR		
		sMapKey = "CerrarDetaNotaCredito";
		inputMap = this.jButtonCerrarDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetaNotaCredito"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetaNotaCredito";
		inputMap = this.jButtonGuardarCambiosTablaDetaNotaCredito.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetaNotaCredito.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetaNotaCredito"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetaNotaCredito.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetaNotaCredito.setToolTipText("Nuevo DetaNotaCredito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetaNotaCredito.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetaNotaCredito.setToolTipText("Sin Cerrar Ventana DetaNotaCredito");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetaNotaCredito = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetaNotaCredito.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetaNotaCredito.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetaNotaCredito.setText("Accion");
		this.jComboBoxTiposAccionesDetaNotaCredito.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetaNotaCredito = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetaNotaCredito.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetaNotaCredito.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetaNotaCredito = new JLabelMe();
		
		this.jLabelAccionesDetaNotaCredito.setText("Acciones");		
		this.jLabelAccionesDetaNotaCredito.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaNotaCredito.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaNotaCredito.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetaNotaCredito();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetaNotaCredito();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetaNotaCredito=new JTabbedPane();
		this.jTabbedPaneRelacionesDetaNotaCredito.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetaNotaCredito,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetaNotaCredito.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaNotaCredito.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaNotaCredito.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetaNotaCredito.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetaNotaCredito.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetaNotaCredito.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetaNotaCredito, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetaNotaCredito = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetaNotaCredito = new GridBagLayout();
		
		this.jPanelCamposDetaNotaCredito.setLayout(gridaBagLayoutCamposDetaNotaCredito);
		this.jPanelCamposOcultosDetaNotaCredito.setLayout(gridaBagLayoutCamposOcultosDetaNotaCredito);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetaNotaCredito= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetaNotaCredito.setLayout(gridaBagLayoutCamposIniciogeneralDetaNotaCredito);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetaNotaCredito= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetaNotaCredito.setLayout(gridaBagLayoutCamposIniciovaloresDetaNotaCredito);

		GridBagLayout gridaBagLayoutCamposInicioextraDetaNotaCredito= new GridBagLayout();
		this.jPanelCamposInicioextraDetaNotaCredito.setLayout(gridaBagLayoutCamposInicioextraDetaNotaCredito);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetaNotaCredito.add(jLabelIdDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetaNotaCredito.add(jLabelidDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetaNotaCredito.add(jLabelid_empresaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetaNotaCredito.add(jButtonid_empresaDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetaNotaCredito.add(jButtonid_empresaDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetaNotaCredito.add(jComboBoxid_empresaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetaNotaCredito.add(jLabelid_sucursalDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetaNotaCredito.add(jButtonid_sucursalDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetaNotaCredito.add(jButtonid_sucursalDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetaNotaCredito.add(jComboBoxid_sucursalDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetaNotaCredito.add(jLabelid_ejercicioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetaNotaCredito.add(jButtonid_ejercicioDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetaNotaCredito.add(jButtonid_ejercicioDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetaNotaCredito.add(jComboBoxid_ejercicioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetaNotaCredito.add(jLabelid_periodoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetaNotaCredito.add(jButtonid_periodoDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetaNotaCredito.add(jButtonid_periodoDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetaNotaCredito.add(jComboBoxid_periodoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetaNotaCredito.add(jLabelid_anioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetaNotaCredito.add(jButtonid_anioDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetaNotaCredito.add(jButtonid_anioDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetaNotaCredito.add(jComboBoxid_anioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetaNotaCredito.add(jLabelid_mesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetaNotaCredito.add(jButtonid_mesDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetaNotaCredito.add(jButtonid_mesDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetaNotaCredito.add(jComboBoxid_mesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_nota_creditoDetaNotaCredito.add(jLabelid_nota_creditoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nota_creditoDetaNotaCredito.add(jButtonid_nota_creditoDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nota_creditoDetaNotaCredito.add(jButtonid_nota_creditoDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_nota_creditoDetaNotaCredito.add(jComboBoxid_nota_creditoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetaNotaCredito.add(jLabelid_bodegaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetaNotaCredito.add(jButtonid_bodegaDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetaNotaCredito.add(jButtonid_bodegaDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetaNotaCredito.add(jComboBoxid_bodegaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetaNotaCredito.add(jLabelid_productoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 2;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetaNotaCredito.add(jButtonid_productoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetaNotaCredito.add(jButtonid_productoDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 4;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetaNotaCredito.add(jButtonid_productoDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetaNotaCredito.add(jComboBoxid_productoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetaNotaCredito.add(jLabelid_unidadDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetaNotaCredito.add(jButtonid_unidadDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetaNotaCredito.add(jButtonid_unidadDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetaNotaCredito.add(jComboBoxid_unidadDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_deta_nota_creditoDetaNotaCredito.add(jLabelid_tipo_deta_nota_creditoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_deta_nota_creditoDetaNotaCredito.add(jButtonid_tipo_deta_nota_creditoDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_deta_nota_creditoDetaNotaCredito.add(jButtonid_tipo_deta_nota_creditoDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_deta_nota_creditoDetaNotaCredito.add(jComboBoxid_tipo_deta_nota_creditoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_devolucion_empresaDetaNotaCredito.add(jLabelid_tipo_devolucion_empresaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_devolucion_empresaDetaNotaCredito.add(jButtonid_tipo_devolucion_empresaDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_devolucion_empresaDetaNotaCredito.add(jButtonid_tipo_devolucion_empresaDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_devolucion_empresaDetaNotaCredito.add(jComboBoxid_tipo_devolucion_empresaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetaNotaCredito.add(jLabeldescripcionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetaNotaCredito.add(jButtondescripcionDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetaNotaCredito.add(jscrollPanedescripcionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetaNotaCredito.add(jLabelcantidadDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetaNotaCredito.add(jButtoncantidadDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetaNotaCredito.add(jTextFieldcantidadDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetaNotaCredito.add(jLabelprecioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetaNotaCredito.add(jButtonprecioDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetaNotaCredito.add(jTextFieldprecioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoDetaNotaCredito.add(jLabelmontoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoDetaNotaCredito.add(jButtonmontoDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoDetaNotaCredito.add(jTextFieldmontoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoDetaNotaCredito.add(jLabelcostoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoDetaNotaCredito.add(jButtoncostoDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoDetaNotaCredito.add(jTextFieldcostoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetaNotaCredito.add(jLabeldescuentoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetaNotaCredito.add(jButtondescuentoDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetaNotaCredito.add(jTextFielddescuentoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento2DetaNotaCredito.add(jLabeldescuento2DetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento2DetaNotaCredito.add(jButtondescuento2DetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento2DetaNotaCredito.add(jTextFielddescuento2DetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuestoDetaNotaCredito.add(jLabelimpuestoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuestoDetaNotaCredito.add(jButtonimpuestoDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuestoDetaNotaCredito.add(jTextFieldimpuestoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_ivaDetaNotaCredito.add(jLabelporcen_ivaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_ivaDetaNotaCredito.add(jButtonporcen_ivaDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_ivaDetaNotaCredito.add(jTextFieldporcen_ivaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_descuenDetaNotaCredito.add(jLabelporcen_descuenDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_descuenDetaNotaCredito.add(jButtonporcen_descuenDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_descuenDetaNotaCredito.add(jTextFieldporcen_descuenDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_iceDetaNotaCredito.add(jLabelporcen_iceDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_iceDetaNotaCredito.add(jButtonporcen_iceDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_iceDetaNotaCredito.add(jTextFieldporcen_iceDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalDetaNotaCredito.add(jLabelsub_totalDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalDetaNotaCredito.add(jButtonsub_totalDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalDetaNotaCredito.add(jTextFieldsub_totalDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetaNotaCredito.add(jLabeltotalDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetaNotaCredito.add(jButtontotalDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetaNotaCredito.add(jTextFieldtotalDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetaNotaCredito.add(jLabelid_centro_costoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 2;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetaNotaCredito.add(jButtonid_centro_costoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 3;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetaNotaCredito.add(jButtonid_centro_costoDetaNotaCreditoArbol, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 4;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetaNotaCredito.add(jButtonid_centro_costoDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 5;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetaNotaCredito.add(jButtonid_centro_costoDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetaNotaCredito.add(jComboBoxid_centro_costoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empaqueDetaNotaCredito.add(jLabelid_empaqueDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empaqueDetaNotaCredito.add(jButtonid_empaqueDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 3;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empaqueDetaNotaCredito.add(jButtonid_empaqueDetaNotaCreditoUpdate, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empaqueDetaNotaCredito.add(jComboBoxid_empaqueDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelincluye_impuestoDetaNotaCredito.add(jLabelincluye_impuestoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelincluye_impuestoDetaNotaCredito.add(jButtonincluye_impuestoDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelincluye_impuestoDetaNotaCredito.add(jCheckBoxincluye_impuestoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionDetaNotaCredito.add(jLabelfecha_emisionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionDetaNotaCredito.add(jButtonfecha_emisionDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionDetaNotaCredito.add(jDateChooserfecha_emisionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_loteDetaNotaCredito.add(jLabelcodigo_loteDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_loteDetaNotaCredito.add(jButtoncodigo_loteDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_loteDetaNotaCredito.add(jTextFieldcodigo_loteDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cajaDetaNotaCredito.add(jLabelnumero_cajaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = 2;
		this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
		this.gridBagConstraintsDetaNotaCredito.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cajaDetaNotaCredito.add(jButtonnumero_cajaDetaNotaCreditoBusqueda, this.gridBagConstraintsDetaNotaCredito);
	}

	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCredito.gridy = 0;
	this.gridBagConstraintsDetaNotaCredito.gridx = 1;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cajaDetaNotaCredito.add(jTextFieldnumero_cajaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposOcultosDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposOcultosDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCredito.add(this.jPanelid_empresaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposOcultosDetaNotaCredito % 1==0) {
		iXPanelCamposOcultosDetaNotaCredito=0;
		iYPanelCamposOcultosDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposOcultosDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposOcultosDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCredito.add(this.jPanelid_sucursalDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposOcultosDetaNotaCredito % 1==0) {
		iXPanelCamposOcultosDetaNotaCredito=0;
		iYPanelCamposOcultosDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposOcultosDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposOcultosDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCredito.add(this.jPanelid_ejercicioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposOcultosDetaNotaCredito % 1==0) {
		iXPanelCamposOcultosDetaNotaCredito=0;
		iYPanelCamposOcultosDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposOcultosDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposOcultosDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCredito.add(this.jPanelid_periodoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposOcultosDetaNotaCredito % 1==0) {
		iXPanelCamposOcultosDetaNotaCredito=0;
		iYPanelCamposOcultosDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposOcultosDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposOcultosDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCredito.add(this.jPanelid_anioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposOcultosDetaNotaCredito % 1==0) {
		iXPanelCamposOcultosDetaNotaCredito=0;
		iYPanelCamposOcultosDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposOcultosDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposOcultosDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCredito.add(this.jPanelid_mesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposOcultosDetaNotaCredito % 1==0) {
		iXPanelCamposOcultosDetaNotaCredito=0;
		iYPanelCamposOcultosDetaNotaCredito++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciogeneralDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciogeneralDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetaNotaCredito.add(this.jPanelidDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciogeneralDetaNotaCredito % 1==0) {
		iXPanelCamposIniciogeneralDetaNotaCredito=0;
		iYPanelCamposIniciogeneralDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciogeneralDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciogeneralDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetaNotaCredito.add(this.jPanelid_nota_creditoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciogeneralDetaNotaCredito % 1==0) {
		iXPanelCamposIniciogeneralDetaNotaCredito=0;
		iYPanelCamposIniciogeneralDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciogeneralDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciogeneralDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetaNotaCredito.add(this.jPanelid_bodegaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciogeneralDetaNotaCredito % 1==0) {
		iXPanelCamposIniciogeneralDetaNotaCredito=0;
		iYPanelCamposIniciogeneralDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciogeneralDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciogeneralDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetaNotaCredito.add(this.jPanelid_productoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciogeneralDetaNotaCredito % 1==0) {
		iXPanelCamposIniciogeneralDetaNotaCredito=0;
		iYPanelCamposIniciogeneralDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciogeneralDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciogeneralDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetaNotaCredito.add(this.jPanelid_unidadDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciogeneralDetaNotaCredito % 1==0) {
		iXPanelCamposIniciogeneralDetaNotaCredito=0;
		iYPanelCamposIniciogeneralDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciogeneralDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciogeneralDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetaNotaCredito.add(this.jPanelid_tipo_deta_nota_creditoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciogeneralDetaNotaCredito % 1==0) {
		iXPanelCamposIniciogeneralDetaNotaCredito=0;
		iYPanelCamposIniciogeneralDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciogeneralDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciogeneralDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetaNotaCredito.add(this.jPanelid_tipo_devolucion_empresaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciogeneralDetaNotaCredito % 1==0) {
		iXPanelCamposIniciogeneralDetaNotaCredito=0;
		iYPanelCamposIniciogeneralDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciogeneralDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciogeneralDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetaNotaCredito.add(this.jPaneldescripcionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciogeneralDetaNotaCredito % 1==0) {
		iXPanelCamposIniciogeneralDetaNotaCredito=0;
		iYPanelCamposIniciogeneralDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPanelcantidadDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPanelprecioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPanelmontoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPanelcostoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPaneldescuentoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPaneldescuento2DetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPanelimpuestoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPanelporcen_ivaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPanelporcen_descuenDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPanelporcen_iceDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPanelsub_totalDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposIniciovaloresDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposIniciovaloresDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetaNotaCredito.add(this.jPaneltotalDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposIniciovaloresDetaNotaCredito % 1==0) {
		iXPanelCamposIniciovaloresDetaNotaCredito=0;
		iYPanelCamposIniciovaloresDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposInicioextraDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposInicioextraDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetaNotaCredito.add(this.jPanelid_centro_costoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposInicioextraDetaNotaCredito % 1==0) {
		iXPanelCamposInicioextraDetaNotaCredito=0;
		iYPanelCamposInicioextraDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposInicioextraDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposInicioextraDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetaNotaCredito.add(this.jPanelid_empaqueDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposInicioextraDetaNotaCredito % 1==0) {
		iXPanelCamposInicioextraDetaNotaCredito=0;
		iYPanelCamposInicioextraDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposInicioextraDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposInicioextraDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetaNotaCredito.add(this.jPanelincluye_impuestoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposInicioextraDetaNotaCredito % 1==0) {
		iXPanelCamposInicioextraDetaNotaCredito=0;
		iYPanelCamposInicioextraDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposInicioextraDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposInicioextraDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetaNotaCredito.add(this.jPanelfecha_emisionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposInicioextraDetaNotaCredito % 1==0) {
		iXPanelCamposInicioextraDetaNotaCredito=0;
		iYPanelCamposInicioextraDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposInicioextraDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposInicioextraDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetaNotaCredito.add(this.jPanelcodigo_loteDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposInicioextraDetaNotaCredito % 1==0) {
		iXPanelCamposInicioextraDetaNotaCredito=0;
		iYPanelCamposInicioextraDetaNotaCredito++;
	}
	this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCredito.gridy = iYPanelCamposInicioextraDetaNotaCredito;
	this.gridBagConstraintsDetaNotaCredito.gridx = iXPanelCamposInicioextraDetaNotaCredito++;
	this.gridBagConstraintsDetaNotaCredito.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCredito.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetaNotaCredito.add(this.jPanelnumero_cajaDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);



	if(iXPanelCamposInicioextraDetaNotaCredito % 1==0) {
		iXPanelCamposInicioextraDetaNotaCredito=0;
		iYPanelCamposInicioextraDetaNotaCredito++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetaNotaCredito= new GridBagLayout();
		this.jPanelAccionesDetaNotaCredito.setLayout(gridaBagLayoutAccionesDetaNotaCredito);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetaNotaCredito= new GridBagLayout();
		this.jPanelAccionesFormularioDetaNotaCredito.setLayout(gridaBagLayoutAccionesFormularioDetaNotaCredito);
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetaNotaCredito.add(this.jComboBoxTiposAccionesFormularioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetaNotaCredito.add(this.jCheckBoxPostAccionNuevoDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detanotacreditoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetaNotaCredito.add(this.jCheckBoxPostAccionSinCerrarDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detanotacreditoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detanotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetaNotaCredito.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetaNotaCredito.add(this.jCheckBoxPostAccionSinMensajeDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetaNotaCredito.add(this.jButtonModificarDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);							

		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;
		this.gridBagConstraintsDetaNotaCredito.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetaNotaCredito.add(this.jButtonEliminarDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
			
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetaNotaCredito.add(this.jButtonActualizarDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);


		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;		
		this.gridBagConstraintsDetaNotaCredito.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetaNotaCredito.add(this.jButtonGuardarCambiosDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);	
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = 0;		
		this.gridBagConstraintsDetaNotaCredito.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetaNotaCredito.add(this.jButtonCancelarDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetaNotaCredito = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetaNotaCredito);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detanotacreditoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();						
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaNotaCredito.gridx = 0;		
			//this.gridBagConstraintsDetaNotaCredito.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetaNotaCredito.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetaNotaCredito.gridx =0;
		this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetaNotaCredito.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetaNotaCreditoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetaNotaCredito = new DetaNotaCreditoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Deta Nota Credito DATOS");
			
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
			
	        //this.setTitle("[FOR] - Deta Nota Credito DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Deta Nota Credito Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetaNotaCreditoModel detanotacreditoModel=new DetaNotaCreditoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetaNotaCreditoModel.DetaNotaCreditoFocusTraversalPolicy detanotacreditoFocusTraversalPolicy = detanotacreditoModel.new DetaNotaCreditoFocusTraversalPolicy(this);
			
			//detanotacreditoFocusTraversalPolicy.setdetanotacreditoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detanotacreditoModel);
			
			
			this.jContentPaneDetalleDetaNotaCredito = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetaNotaCredito = new GridBagLayout();	
			this.jContentPaneDetalleDetaNotaCredito.setLayout(gridaBagLayoutDetalleDetaNotaCredito);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetaNotaCredito = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
				this.gridBagConstraintsDetaNotaCredito.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetaNotaCredito.gridx = 0;
					
				this.gridBagConstraintsDetaNotaCredito.gridwidth=2;
				
				this.jContentPaneDetalleDetaNotaCredito.add(jTtoolBarDetalleDetaNotaCredito, gridBagConstraintsDetaNotaCredito);								
				
}
			
			this.jScrollPanelDatosEdicionDetaNotaCredito=   new JScrollPane(jContentPaneDetalleDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetaNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetaNotaCredito=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetaNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDetaNotaCredito.gridy = 1;
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;
		this.gridBagConstraintsDetaNotaCredito.gridwidth = 2;
		this.gridBagConstraintsDetaNotaCredito.gridheight = 1;
		iGridyRelaciones = 1;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetaNotaCredito.add(jPanelCamposIniciogeneralDetaNotaCredito, gridBagConstraintsDetaNotaCredito);


		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDetaNotaCredito.gridy = 2;
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;
		this.gridBagConstraintsDetaNotaCredito.gridwidth = 1;
		this.gridBagConstraintsDetaNotaCredito.gridheight = 1;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetaNotaCredito.add(jPanelCamposIniciovaloresDetaNotaCredito, gridBagConstraintsDetaNotaCredito);


		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDetaNotaCredito.gridy = 2;
		this.gridBagConstraintsDetaNotaCredito.gridx = 1;
		this.gridBagConstraintsDetaNotaCredito.gridwidth = 1;
		this.gridBagConstraintsDetaNotaCredito.gridheight = 1;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetaNotaCredito.add(jPanelCamposInicioextraDetaNotaCredito, gridBagConstraintsDetaNotaCredito);
			
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
						&& detanotacreditoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detanotacreditoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetaNotaCredito= new GridBagConstraints();
						this.gridBagConstraintsDetaNotaCredito.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetaNotaCredito.gridx = 0;
						this.jContentPaneDetalleDetaNotaCredito.add(this.jTabbedPaneRelacionesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetaNotaCredito.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetaNotaCredito.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
					this.gridBagConstraintsDetaNotaCredito.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetaNotaCredito.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetaNotaCredito.gridx = 0;
					
					this.gridBagConstraintsDetaNotaCredito.gridwidth=2;
				
					this.jContentPaneDetalleDetaNotaCredito.add(jPanelCamposOcultosDetaNotaCredito, gridBagConstraintsDetaNotaCredito);
				
					this.jPanelCamposOcultosDetaNotaCredito.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	        this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.CENTER;//WEST;
			
			this.gridBagConstraintsDetaNotaCredito.gridwidth=2;
			
			
			this.jContentPaneDetalleDetaNotaCredito.add(this.jPanelAccionesFormularioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);							
			
			
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
	        this.gridBagConstraintsDetaNotaCredito.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetaNotaCredito.gridx = 0;
	        
			this.gridBagConstraintsDetaNotaCredito.gridwidth=2;
			
			this.jContentPaneDetalleDetaNotaCredito.add(this.jPanelAccionesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetaNotaCredito);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetaNotaCredito=   new JScrollPane(this.jPanelCamposDetaNotaCredito,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetaNotaCredito.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaNotaCredito.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaNotaCredito.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetaNotaCredito.gridx = 0;
			this.gridBagConstraintsDetaNotaCredito.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetaNotaCredito.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetaNotaCredito.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetaNotaCredito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);			
			
			this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCredito.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetaNotaCredito.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
			
			
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCredito.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		
			
		this.gridBagConstraintsDetaNotaCredito = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCredito.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCredito.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetaNotaCredito, this.gridBagConstraintsDetaNotaCredito);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetaNotaCredito;//jContentPane;
		
		return jScrollPanelDatosEdicionDetaNotaCredito;
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
