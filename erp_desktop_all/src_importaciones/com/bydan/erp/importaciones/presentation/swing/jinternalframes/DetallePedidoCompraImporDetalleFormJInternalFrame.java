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
package com.bydan.erp.importaciones.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.importaciones.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.importaciones.util.DetallePedidoCompraImporConstantesFunciones;

import com.bydan.erp.importaciones.business.logic.*;
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
public class DetallePedidoCompraImporDetalleFormJInternalFrame extends DetallePedidoCompraImporBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetallePedidoCompraImpor;
	
	protected JMenuBar jmenuBarDetalleDetallePedidoCompraImpor;
	
	protected JMenu jmenuDetalleDetallePedidoCompraImpor;
	protected JMenu jmenuDetalleArchivoDetallePedidoCompraImpor;
	protected JMenu jmenuDetalleAccionesDetallePedidoCompraImpor;
	protected JMenu jmenuDetalleDatosDetallePedidoCompraImpor;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetallePedidoCompraImpor;	
	protected GridBagConstraints gridBagConstraintsDetallePedidoCompraImpor;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetallePedidoCompraImporBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetallePedidoCompraImpor;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected PedidoCompraImporBeanSwingJInternalFrame pedidocompraimporBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_pedidocompraimpor="";

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected ArancelBeanSwingJInternalFrame arancelBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_arancel="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";

	protected AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_anio="";

	protected MesBeanSwingJInternalFrame mesBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_mes="";
	
	public DetallePedidoCompraImporSessionBean detallepedidocompraimporSessionBean;
	
	
	
	
	public PedidoCompraImporSessionBean pedidocompraimporSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public ArancelSessionBean arancelSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;	
	
	public DetallePedidoCompraImporLogic detallepedidocompraimporLogic;
	
	public JScrollPane jScrollPanelDatosDetallePedidoCompraImpor;
	public JScrollPane jScrollPanelDatosEdicionDetallePedidoCompraImpor;
	public JScrollPane jScrollPanelDatosGeneralDetallePedidoCompraImpor;
	
	protected JPanel jPanelCamposDetallePedidoCompraImpor;    
	protected JPanel jPanelCamposOcultosDetallePedidoCompraImpor;    	
	protected JPanel jPanelAccionesDetallePedidoCompraImpor;
	protected JPanel jPanelAccionesFormularioDetallePedidoCompraImpor;
    
	
	
	protected Integer iXPanelCamposDetallePedidoCompraImpor=0;
	protected Integer iYPanelCamposDetallePedidoCompraImpor=0;
	
	protected Integer iXPanelCamposOcultosDetallePedidoCompraImpor=0;
	protected Integer iYPanelCamposOcultosDetallePedidoCompraImpor=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetallePedidoCompraImpor;
	public JButton jButtonModificarDetallePedidoCompraImpor;
	public JButton jButtonActualizarDetallePedidoCompraImpor;
    public JButton jButtonEliminarDetallePedidoCompraImpor;
	public JButton jButtonCancelarDetallePedidoCompraImpor;
    public JButton jButtonGuardarCambiosDetallePedidoCompraImpor;
	public JButton jButtonGuardarCambiosTablaDetallePedidoCompraImpor;
	protected JButton jButtonCerrarDetallePedidoCompraImpor;
	
	
	protected JButton jButtonProcesarInformacionDetallePedidoCompraImpor;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetallePedidoCompraImpor;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetallePedidoCompraImpor;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetallePedidoCompraImpor;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetallePedidoCompraImpor;
	protected JButton jButtonModificarToolBarDetallePedidoCompraImpor;
	protected JButton jButtonActualizarToolBarDetallePedidoCompraImpor;
    protected JButton jButtonEliminarToolBarDetallePedidoCompraImpor;
	protected JButton jButtonCancelarToolBarDetallePedidoCompraImpor;
    protected JButton jButtonGuardarCambiosToolBarDetallePedidoCompraImpor;
	protected JButton jButtonGuardarCambiosTablaToolBarDetallePedidoCompraImpor;
	protected JButton jButtonMostrarOcultarTablaToolBarDetallePedidoCompraImpor;
	protected JButton jButtonCerrarToolBarDetallePedidoCompraImpor;
	
	protected JButton jButtonProcesarInformacionToolBarDetallePedidoCompraImpor;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemModificarDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemActualizarDetallePedidoCompraImpor;
    protected JMenuItem jMenuItemEliminarDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemCancelarDetallePedidoCompraImpor;
    protected JMenuItem jMenuItemGuardarCambiosDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemCerrarDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemDetalleCerrarDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor;
	
	protected JMenuItem jMenuItemProcesarInformacionDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetallePedidoCompraImpor;
	protected JMenuItem jMenuItemMostrarOcultarDetallePedidoCompraImpor;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetallePedidoCompraImpor;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetallePedidoCompraImpor;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetallePedidoCompraImpor;
	public JLabel jLabelIdDetallePedidoCompraImpor;
	public JLabel jLabelidDetallePedidoCompraImpor;
	public JButton jButtonidDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pedidoDetallePedidoCompraImpor;
	public JLabel jLabelcantidad_pedidoDetallePedidoCompraImpor;
	public JTextField jTextFieldcantidad_pedidoDetallePedidoCompraImpor;
	public JButton jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_entraDetallePedidoCompraImpor;
	public JLabel jLabelcantidad_entraDetallePedidoCompraImpor;
	public JTextField jTextFieldcantidad_entraDetallePedidoCompraImpor;
	public JButton jButtoncantidad_entraDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pendienteDetallePedidoCompraImpor;
	public JLabel jLabelcantidad_pendienteDetallePedidoCompraImpor;
	public JTextField jTextFieldcantidad_pendienteDetallePedidoCompraImpor;
	public JButton jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelporcentajeDetallePedidoCompraImpor;
	public JLabel jLabelporcentajeDetallePedidoCompraImpor;
	public JTextField jTextFieldporcentajeDetallePedidoCompraImpor;
	public JButton jButtonporcentajeDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelpesoDetallePedidoCompraImpor;
	public JLabel jLabelpesoDetallePedidoCompraImpor;
	public JTextField jTextFieldpesoDetallePedidoCompraImpor;
	public JButton jButtonpesoDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetallePedidoCompraImpor;
	public JLabel jLabelprecioDetallePedidoCompraImpor;
	public JTextField jTextFieldprecioDetallePedidoCompraImpor;
	public JButton jButtonprecioDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelloteDetallePedidoCompraImpor;
	public JLabel jLabelloteDetallePedidoCompraImpor;
	public JTextField jTextFieldloteDetallePedidoCompraImpor;
	public JButton jButtonloteDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_arancelDetallePedidoCompraImpor;
	public JLabel jLabelporcentaje_arancelDetallePedidoCompraImpor;
	public JTextField jTextFieldporcentaje_arancelDetallePedidoCompraImpor;
	public JButton jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_unidad_auxiliarDetallePedidoCompraImpor;
	public JLabel jLabelcantidad_unidad_auxiliarDetallePedidoCompraImpor;
	public JTextField jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor;
	public JButton jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelprecio_unidad_auxiliarDetallePedidoCompraImpor;
	public JLabel jLabelprecio_unidad_auxiliarDetallePedidoCompraImpor;
	public JTextField jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor;
	public JButton jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelfobDetallePedidoCompraImpor;
	public JLabel jLabelfobDetallePedidoCompraImpor;
	public JTextField jTextFieldfobDetallePedidoCompraImpor;
	public JButton jButtonfobDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelfob_exwDetallePedidoCompraImpor;
	public JLabel jLabelfob_exwDetallePedidoCompraImpor;
	public JTextField jTextFieldfob_exwDetallePedidoCompraImpor;
	public JButton jButtonfob_exwDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetallePedidoCompraImpor;
	public JLabel jLabeltotalDetallePedidoCompraImpor;
	public JTextField jTextFieldtotalDetallePedidoCompraImpor;
	public JButton jButtontotalDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetallePedidoCompraImpor;
	public JLabel jLabeldescripcionDetallePedidoCompraImpor;
	public JTextArea jTextAreadescripcionDetallePedidoCompraImpor;
	public JScrollPane jscrollPanedescripcionDetallePedidoCompraImpor;
	public JButton jButtondescripcionDetallePedidoCompraImporBusqueda= new JButtonMe();

	
	public JPanel jPanelid_pedido_compra_imporDetallePedidoCompraImpor;
	public JLabel jLabelid_pedido_compra_imporDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor;
	public JButton jButtonid_pedido_compra_imporDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_pedido_compra_imporDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetallePedidoCompraImpor;
	public JLabel jLabelid_empresaDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetallePedidoCompraImpor;
	public JButton jButtonid_empresaDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_empresaDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetallePedidoCompraImpor;
	public JLabel jLabelid_sucursalDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetallePedidoCompraImpor;
	public JButton jButtonid_sucursalDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_sucursalDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetallePedidoCompraImpor;
	public JLabel jLabelid_bodegaDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetallePedidoCompraImpor;
	public JButton jButtonid_bodegaDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_bodegaDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetallePedidoCompraImpor;
	public JLabel jLabelid_productoDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetallePedidoCompraImpor;
	public JButton jButtonid_productoDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_productoDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_productoDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetallePedidoCompraImpor;
	public JLabel jLabelid_unidadDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetallePedidoCompraImpor;
	public JButton jButtonid_unidadDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_unidadDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetallePedidoCompraImpor;
	public JLabel jLabelid_ejercicioDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetallePedidoCompraImpor;
	public JButton jButtonid_ejercicioDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetallePedidoCompraImpor;
	public JLabel jLabelid_periodoDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetallePedidoCompraImpor;
	public JButton jButtonid_periodoDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_periodoDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_arancelDetallePedidoCompraImpor;
	public JLabel jLabelid_arancelDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_arancelDetallePedidoCompraImpor;
	public JButton jButtonid_arancelDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_arancelDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_arancelDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetallePedidoCompraImpor;
	public JLabel jLabelid_centro_costoDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetallePedidoCompraImpor;
	public JButton jButtonid_centro_costoDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_centro_costoDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetallePedidoCompraImporBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetallePedidoCompraImporArbol= new JButtonMe();

	public JPanel jPanelid_anioDetallePedidoCompraImpor;
	public JLabel jLabelid_anioDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetallePedidoCompraImpor;
	public JButton jButtonid_anioDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_anioDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_anioDetallePedidoCompraImporBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetallePedidoCompraImpor;
	public JLabel jLabelid_mesDetallePedidoCompraImpor;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetallePedidoCompraImpor;
	public JButton jButtonid_mesDetallePedidoCompraImpor= new JButtonMe();
	public JButton jButtonid_mesDetallePedidoCompraImporUpdate= new JButtonMe();
	public JButton jButtonid_mesDetallePedidoCompraImporBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetallePedidoCompraImpor;
	
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
	public int iHeightFormulario=660;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetallePedidoCompraImporDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetallePedidoCompraImpor=new JPanel();
				this.jPanelAccionesFormularioDetallePedidoCompraImpor=new JPanel();
				this.jmenuBarDetalleDetallePedidoCompraImpor=new JMenuBar();
				this.jTtoolBarDetalleDetallePedidoCompraImpor=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraImporDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetallePedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetallePedidoCompraImporDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetallePedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraImporDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraImporDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetallePedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetallePedidoCompraImporDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetallePedidoCompraImpor No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetallePedidoCompraImpor() {
		return this.jButtonActualizarToolBarDetallePedidoCompraImpor;
	}
	
	public JButton getjButtonEliminarToolBarDetallePedidoCompraImpor() {
		return this.jButtonEliminarToolBarDetallePedidoCompraImpor;
	}
	
	public JButton getjButtonCancelarToolBarDetallePedidoCompraImpor() {
		return this.jButtonCancelarToolBarDetallePedidoCompraImpor;
	}		
	
	public JButton getjButtonProcesarInformacionDetallePedidoCompraImpor() {
		return this.jButtonProcesarInformacionDetallePedidoCompraImpor;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetallePedidoCompraImpor)	{
		this.jButtonProcesarInformacionDetallePedidoCompraImpor = jButtonProcesarInformacionDetallePedidoCompraImpor;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetallePedidoCompraImpor() {
		return this.jComboBoxTiposAccionesDetallePedidoCompraImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetallePedidoCompraImpor(
			JComboBox jComboBoxTiposRelacionesDetallePedidoCompraImpor) {
		this.jComboBoxTiposRelacionesDetallePedidoCompraImpor = jComboBoxTiposRelacionesDetallePedidoCompraImpor;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetallePedidoCompraImpor(
			JComboBox jComboBoxTiposAccionesDetallePedidoCompraImpor) {
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor = jComboBoxTiposAccionesDetallePedidoCompraImpor;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetallePedidoCompraImpor() {
		return this.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetallePedidoCompraImpor(
			JComboBox jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor) {
		this.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor = jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallepedidocompraimporSessionBean=new DetallePedidoCompraImporSessionBean();
		
		this.detallepedidocompraimporSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepedidocompraimporSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetallePedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetallePedidoCompraImporJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetallePedidoCompraImporJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Pedido Compra MANTENIMIENTO"));
		
		
		if(iWidth > 2250) {
			iWidth=2250;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {
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
	
		DetallePedidoCompraImporJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetallePedidoCompraImpor= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetallePedidoCompraImpor=new JButtonMe();
				this.jButtonModificarToolBarDetallePedidoCompraImpor=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetallePedidoCompraImpor,this.jTtoolBarDetalleDetallePedidoCompraImpor,
							"actualizar","actualizar","Actualizar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetallePedidoCompraImpor,this.jTtoolBarDetalleDetallePedidoCompraImpor,
							"eliminar","eliminar","Eliminar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetallePedidoCompraImpor,this.jTtoolBarDetalleDetallePedidoCompraImpor,
							"cancelar","cancelar","Cancelar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetallePedidoCompraImpor=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetallePedidoCompraImpor,this.jTtoolBarDetalleDetallePedidoCompraImpor,
							"guardarcambios","guardarcambios","Guardar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetallePedidoCompraImpor=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetallePedidoCompraImpor=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetallePedidoCompraImpor=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetallePedidoCompraImpor=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetallePedidoCompraImpor=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetallePedidoCompraImpor= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetallePedidoCompraImpor.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetallePedidoCompraImpor,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetallePedidoCompraImpor= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetallePedidoCompraImpor.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetallePedidoCompraImpor,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetallePedidoCompraImpor= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetallePedidoCompraImpor.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetallePedidoCompraImpor,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetallePedidoCompraImpor= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetallePedidoCompraImpor.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetallePedidoCompraImpor,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetallePedidoCompraImpor= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetallePedidoCompraImpor.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetallePedidoCompraImpor,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetallePedidoCompraImpor= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetallePedidoCompraImpor.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetallePedidoCompraImpor,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetallePedidoCompraImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetallePedidoCompraImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetallePedidoCompraImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetallePedidoCompraImpor= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetallePedidoCompraImpor.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetallePedidoCompraImpor,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetallePedidoCompraImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetallePedidoCompraImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetallePedidoCompraImpor,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetallePedidoCompraImpor.add(this.jMenuItemDetalleCerrarDetallePedidoCompraImpor);
		
		this.jmenuDetalleAccionesDetallePedidoCompraImpor.add(this.jMenuItemActualizarDetallePedidoCompraImpor);
		this.jmenuDetalleAccionesDetallePedidoCompraImpor.add(this.jMenuItemEliminarDetallePedidoCompraImpor);
		this.jmenuDetalleAccionesDetallePedidoCompraImpor.add(this.jMenuItemCancelarDetallePedidoCompraImpor);		
		
		//this.jmenuDetalleDatosDetallePedidoCompraImpor.add(this.jMenuItemDetalleAbrirOrderByDetallePedidoCompraImpor);				
		this.jmenuDetalleDatosDetallePedidoCompraImpor.add(this.jMenuItemDetalleMostarOcultarDetallePedidoCompraImpor);				
				
		//this.jmenuDetalleAccionesDetallePedidoCompraImpor.add(this.jMenuItemGuardarCambiosDetallePedidoCompraImpor);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetallePedidoCompraImpor.add(this.jmenuDetalleArchivoDetallePedidoCompraImpor);		
		this.jmenuBarDetalleDetallePedidoCompraImpor.add(this.jmenuDetalleAccionesDetallePedidoCompraImpor);		
		this.jmenuBarDetalleDetallePedidoCompraImpor.add(this.jmenuDetalleDatosDetallePedidoCompraImpor);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetallePedidoCompraImpor);				
	}
	
	
	public void inicializarElementosCamposDetallePedidoCompraImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetallePedidoCompraImpor = new JLabelMe();
		jLabelIdDetallePedidoCompraImpor.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetallePedidoCompraImpor = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetallePedidoCompraImpor= new GridBagLayout();

		this.jPanelidDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);

		jLabelidDetallePedidoCompraImpor = new JLabel();
		jLabelidDetallePedidoCompraImpor.setText("Id");

		jLabelidDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidad_pedidoDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelcantidad_pedidoDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADPEDIDO+" : *");
		this.jLabelcantidad_pedidoDetallePedidoCompraImpor.setToolTipText("Cantad Pedo");
		this.jLabelcantidad_pedidoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_pedidoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_pedidoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pedidoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pedidoDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pedidoDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADPEDIDO);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelcantidad_pedidoDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldcantidad_pedidoDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldcantidad_pedidoDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldcantidad_pedidoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pedidoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pedidoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pedidoDetallePedidoCompraImpor.setText("0");

		this.jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pedidoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pedidoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pedidoDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_entraDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelcantidad_entraDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADENTRA+" : *");
		this.jLabelcantidad_entraDetallePedidoCompraImpor.setToolTipText("Cantad Entra");
		this.jLabelcantidad_entraDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_entraDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidad_entraDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_entraDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_entraDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_entraDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADENTRA);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelcantidad_entraDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldcantidad_entraDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldcantidad_entraDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldcantidad_entraDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_entraDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_entraDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_entraDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_entraDetallePedidoCompraImpor.setText("0");

		this.jButtoncantidad_entraDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtoncantidad_entraDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_entraDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_entraDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_entraDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtoncantidad_entraDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_entraDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_entraDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_entraDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_entraDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_entraDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_entraDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_pendienteDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelcantidad_pendienteDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADPENDIENTE+" : *");
		this.jLabelcantidad_pendienteDetallePedidoCompraImpor.setToolTipText("Cantad Pendiente");
		this.jLabelcantidad_pendienteDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendienteDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendienteDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pendienteDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pendienteDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pendienteDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADPENDIENTE);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelcantidad_pendienteDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldcantidad_pendienteDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldcantidad_pendienteDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldcantidad_pendienteDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendienteDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendienteDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pendienteDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pendienteDetallePedidoCompraImpor.setText("0");

		this.jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pendienteDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pendienteDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pendienteDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelporcentajeDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelporcentajeDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_PORCENTAJE+" : *");
		this.jLabelporcentajeDetallePedidoCompraImpor.setToolTipText("Porcentaje");
		this.jLabelporcentajeDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentajeDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentajeDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentajeDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentajeDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_PORCENTAJE);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelporcentajeDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldporcentajeDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldporcentajeDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldporcentajeDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentajeDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentajeDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentajeDetallePedidoCompraImpor.setText("0.0");

		this.jButtonporcentajeDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonporcentajeDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentajeDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentajeDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonporcentajeDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentajeDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentajeDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentajeDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentajeDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentajeDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentajeDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelpesoDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelpesoDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_PESO+" : *");
		this.jLabelpesoDetallePedidoCompraImpor.setToolTipText("Peso");
		this.jLabelpesoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpesoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpesoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpesoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpesoDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpesoDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_PESO);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelpesoDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldpesoDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldpesoDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldpesoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpesoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldpesoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldpesoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldpesoDetallePedidoCompraImpor.setText("0.0");

		this.jButtonpesoDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonpesoDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpesoDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpesoDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpesoDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonpesoDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpesoDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpesoDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldpesoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldpesoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"pesoDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpesoDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelprecioDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetallePedidoCompraImpor.setToolTipText("Precio");
		this.jLabelprecioDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelprecioDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldprecioDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldprecioDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldprecioDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetallePedidoCompraImpor.setText("0.0");

		this.jButtonprecioDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonprecioDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonprecioDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelloteDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelloteDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_LOTE+" : *");
		this.jLabelloteDetallePedidoCompraImpor.setToolTipText("Lote");
		this.jLabelloteDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelloteDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldloteDetallePedidoCompraImpor= new JTextFieldMe();

		jTextFieldloteDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldloteDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonloteDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonloteDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_arancelDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelporcentaje_arancelDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_PORCENTAJEARANCEL+" : *");
		this.jLabelporcentaje_arancelDetallePedidoCompraImpor.setToolTipText("Porcentaje Arancel");
		this.jLabelporcentaje_arancelDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_arancelDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelporcentaje_arancelDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_arancelDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_arancelDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_arancelDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_PORCENTAJEARANCEL);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelporcentaje_arancelDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldporcentaje_arancelDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldporcentaje_arancelDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldporcentaje_arancelDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_arancelDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_arancelDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_arancelDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_arancelDetallePedidoCompraImpor.setText("0.0");

		this.jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_arancelDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_arancelDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_arancelDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_unidad_auxiliarDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelcantidad_unidad_auxiliarDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADUNIDADAUXILIAR+" : *");
		this.jLabelcantidad_unidad_auxiliarDetallePedidoCompraImpor.setToolTipText("Cantad Unad Auxiliar");
		this.jLabelcantidad_unidad_auxiliarDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcantidad_unidad_auxiliarDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcantidad_unidad_auxiliarDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_unidad_auxiliarDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_unidad_auxiliarDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_unidad_auxiliarDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_CANTIDADUNIDADAUXILIAR);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelcantidad_unidad_auxiliarDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor.setText("0");

		this.jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelprecio_unidad_auxiliarDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelprecio_unidad_auxiliarDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_PRECIOUNIDADAUXILIAR+" : *");
		this.jLabelprecio_unidad_auxiliarDetallePedidoCompraImpor.setToolTipText("Precio Unad Auxiliar");
		this.jLabelprecio_unidad_auxiliarDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprecio_unidad_auxiliarDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelprecio_unidad_auxiliarDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelprecio_unidad_auxiliarDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecio_unidad_auxiliarDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecio_unidad_auxiliarDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_PRECIOUNIDADAUXILIAR);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelprecio_unidad_auxiliarDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor.setText("0.0");

		this.jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precio_unidad_auxiliarDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelfobDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelfobDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_FOB+" : *");
		this.jLabelfobDetallePedidoCompraImpor.setToolTipText("Fob");
		this.jLabelfobDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfobDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfobDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfobDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfobDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfobDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_FOB);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelfobDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldfobDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldfobDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldfobDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfobDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfobDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfobDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfobDetallePedidoCompraImpor.setText("0.0");

		this.jButtonfobDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonfobDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfobDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfobDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfobDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonfobDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfobDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfobDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfobDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfobDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fobDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfobDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabelfob_exwDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelfob_exwDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_FOBEXW+" : *");
		this.jLabelfob_exwDetallePedidoCompraImpor.setToolTipText("Fob Exw");
		this.jLabelfob_exwDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfob_exwDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfob_exwDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfob_exwDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfob_exwDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfob_exwDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_FOBEXW);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelfob_exwDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldfob_exwDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldfob_exwDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldfob_exwDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfob_exwDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldfob_exwDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldfob_exwDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldfob_exwDetallePedidoCompraImpor.setText("0.0");

		this.jButtonfob_exwDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonfob_exwDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfob_exwDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfob_exwDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfob_exwDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonfob_exwDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfob_exwDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfob_exwDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldfob_exwDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldfob_exwDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fob_exwDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfob_exwDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetallePedidoCompraImpor = new JLabelMe();
		this.jLabeltotalDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetallePedidoCompraImpor.setToolTipText("Total");
		this.jLabeltotalDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPaneltotalDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextFieldtotalDetallePedidoCompraImpor= new JTextFieldMe();
		jTextFieldtotalDetallePedidoCompraImpor.setEnabled(false);
		jTextFieldtotalDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetallePedidoCompraImpor.setText("0.0");

		this.jButtontotalDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtontotalDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtontotalDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetallePedidoCompraImporBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetallePedidoCompraImpor = new JLabelMe();
		this.jLabeldescripcionDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionDetallePedidoCompraImpor.setToolTipText("Descripcion");
		this.jLabeldescripcionDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPaneldescripcionDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jTextAreadescripcionDetallePedidoCompraImpor= new JTextAreaMe();
		jTextAreadescripcionDetallePedidoCompraImpor.setEnabled(false);
		jTextAreadescripcionDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetallePedidoCompraImpor.setLineWrap(true);
		jTextAreadescripcionDetallePedidoCompraImpor.setWrapStyleWord(true);
		jTextAreadescripcionDetallePedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetallePedidoCompraImpor.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetallePedidoCompraImpor = new JScrollPane(jTextAreadescripcionDetallePedidoCompraImpor);
		jscrollPanedescripcionDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtondescripcionDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtondescripcionDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetallePedidoCompraImporBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetallePedidoCompraImpor() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_pedido_compra_imporDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_pedido_compra_imporDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR+" : *");
		this.jLabelid_pedido_compra_imporDetallePedidoCompraImpor.setToolTipText("Pedo Compra Impor");
		this.jLabelid_pedido_compra_imporDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pedido_compra_imporDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_pedido_compra_imporDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_pedido_compra_imporDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_pedido_compra_imporDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_pedido_compra_imporDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDPEDIDOCOMPRAIMPOR);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_pedido_compra_imporDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_pedido_compra_imporDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compra_imporDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compra_imporDetallePedidoCompraImpor"));

		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compra_imporDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_pedido_compra_imporDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_pedido_compra_imporDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_pedido_compra_imporDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_pedido_compra_imporDetallePedidoCompraImporUpdate"));



					
		this.jLabelid_empresaDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_empresaDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetallePedidoCompraImpor.setToolTipText("Empresa");
		this.jLabelid_empresaDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_empresaDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_empresaDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_empresaDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetallePedidoCompraImpor.setEnabled(false);

		this.jButtonid_empresaDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_empresaDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_empresaDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoCompraImpor"));

		this.jButtonid_empresaDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_empresaDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_empresaDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_empresaDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_empresaDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetallePedidoCompraImporUpdate"));



					
		this.jLabelid_sucursalDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_sucursalDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetallePedidoCompraImpor.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_sucursalDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_sucursalDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_sucursalDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetallePedidoCompraImpor.setEnabled(false);

		this.jButtonid_sucursalDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_sucursalDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoCompraImpor"));

		this.jButtonid_sucursalDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_sucursalDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_sucursalDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_sucursalDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetallePedidoCompraImporUpdate"));



					
		this.jLabelid_bodegaDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_bodegaDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetallePedidoCompraImpor.setToolTipText("Bodega");
		this.jLabelid_bodegaDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_bodegaDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_bodegaDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_bodegaDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_bodegaDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoCompraImpor"));

		this.jButtonid_bodegaDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_bodegaDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_bodegaDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_bodegaDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetallePedidoCompraImporUpdate"));



					
		this.jLabelid_productoDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_productoDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetallePedidoCompraImpor.setToolTipText("Producto");
		this.jLabelid_productoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_productoDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_productoDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_productoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_productoDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_productoDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoCompraImpor"));

		this.jButtonid_productoDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_productoDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_productoDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_productoDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_productoDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_productoDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetallePedidoCompraImporUpdate"));



					
		this.jLabelid_unidadDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_unidadDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetallePedidoCompraImpor.setToolTipText("Unad");
		this.jLabelid_unidadDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_unidadDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_unidadDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_unidadDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_unidadDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_unidadDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoCompraImpor"));

		this.jButtonid_unidadDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_unidadDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_unidadDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_unidadDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_unidadDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetallePedidoCompraImporUpdate"));



					
		this.jLabelid_ejercicioDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_ejercicioDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetallePedidoCompraImpor.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_ejercicioDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_ejercicioDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_ejercicioDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetallePedidoCompraImpor.setEnabled(false);

		this.jButtonid_ejercicioDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_ejercicioDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoCompraImpor"));

		this.jButtonid_ejercicioDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_ejercicioDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_ejercicioDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetallePedidoCompraImporUpdate"));



					
		this.jLabelid_periodoDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_periodoDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetallePedidoCompraImpor.setToolTipText("Periodo");
		this.jLabelid_periodoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_periodoDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_periodoDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_periodoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetallePedidoCompraImpor.setEnabled(false);

		this.jButtonid_periodoDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_periodoDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_periodoDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoCompraImpor"));

		this.jButtonid_periodoDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_periodoDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_periodoDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_periodoDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_periodoDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetallePedidoCompraImporUpdate"));



					
		this.jLabelid_arancelDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_arancelDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDARANCEL+" : *");
		this.jLabelid_arancelDetallePedidoCompraImpor.setToolTipText("Arancel");
		this.jLabelid_arancelDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_arancelDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_arancelDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_arancelDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_arancelDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_arancelDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDARANCEL);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_arancelDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_arancelDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_arancelDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_arancelDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_arancelDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_arancelDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_arancelDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_arancelDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_arancelDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_arancelDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_arancelDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_arancelDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_arancelDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_arancelDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_arancelDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_arancelDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_arancelDetallePedidoCompraImpor"));

		this.jButtonid_arancelDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_arancelDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_arancelDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_arancelDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_arancelDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_arancelDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_arancelDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_arancelDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_arancelDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_arancelDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_arancelDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_arancelDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_arancelDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_arancelDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_arancelDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_arancelDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_arancelDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_arancelDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_arancelDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_arancelDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_arancelDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_arancelDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_arancelDetallePedidoCompraImporUpdate"));



					
		this.jLabelid_centro_costoDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_centro_costoDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDCENTROCOSTO+" : *");
		this.jLabelid_centro_costoDetallePedidoCompraImpor.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_centro_costoDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_centro_costoDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_centro_costoDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_centro_costoDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_centro_costoDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetallePedidoCompraImpor"));

		this.jButtonid_centro_costoDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_centro_costoDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_centro_costoDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetallePedidoCompraImporUpdate"));


		jButtonid_centro_costoDetallePedidoCompraImporArbol= new JButtonMe();
		jButtonid_centro_costoDetallePedidoCompraImporArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetallePedidoCompraImporArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetallePedidoCompraImporArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetallePedidoCompraImporArbol.setText("Arbol");
		jButtonid_centro_costoDetallePedidoCompraImporArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetallePedidoCompraImporArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetallePedidoCompraImporArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetallePedidoCompraImporArbol"));



					
		this.jLabelid_anioDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_anioDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetallePedidoCompraImpor.setToolTipText("Anio");
		this.jLabelid_anioDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_anioDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_anioDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_anioDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetallePedidoCompraImpor.setEnabled(false);

		this.jButtonid_anioDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_anioDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_anioDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoCompraImpor"));

		this.jButtonid_anioDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_anioDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_anioDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_anioDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_anioDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_anioDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetallePedidoCompraImporUpdate"));



					
		this.jLabelid_mesDetallePedidoCompraImpor = new JLabelMe();
		this.jLabelid_mesDetallePedidoCompraImpor.setText(""+DetallePedidoCompraImporConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetallePedidoCompraImpor.setToolTipText("Mes");
		this.jLabelid_mesDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetallePedidoCompraImpor=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetallePedidoCompraImpor.setToolTipText(DetallePedidoCompraImporConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		this.jPanelid_mesDetallePedidoCompraImpor.setLayout(this.gridaBagLayoutDetallePedidoCompraImpor);


		jComboBoxid_mesDetallePedidoCompraImpor= new JComboBoxMe();
		jComboBoxid_mesDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetallePedidoCompraImpor.setEnabled(false);

		this.jButtonid_mesDetallePedidoCompraImpor= new JButtonMe();
		this.jButtonid_mesDetallePedidoCompraImpor.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedidoCompraImpor.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedidoCompraImpor.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetallePedidoCompraImpor.setText("Buscar");
		this.jButtonid_mesDetallePedidoCompraImpor.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetallePedidoCompraImpor.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoCompraImpor,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoCompraImpor"));

		this.jButtonid_mesDetallePedidoCompraImporBusqueda= new JButtonMe();
		this.jButtonid_mesDetallePedidoCompraImporBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoCompraImporBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoCompraImporBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePedidoCompraImporBusqueda.setText("U");
		this.jButtonid_mesDetallePedidoCompraImporBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetallePedidoCompraImporBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoCompraImporBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoCompraImporBusqueda"));

		if(this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetallePedidoCompraImporBusqueda.setVisible(false);		}

		this.jButtonid_mesDetallePedidoCompraImporUpdate= new JButtonMe();
		this.jButtonid_mesDetallePedidoCompraImporUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoCompraImporUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetallePedidoCompraImporUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetallePedidoCompraImporUpdate.setText("U");
		this.jButtonid_mesDetallePedidoCompraImporUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetallePedidoCompraImporUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetallePedidoCompraImporUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetallePedidoCompraImpor.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetallePedidoCompraImpor.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetallePedidoCompraImporUpdate"));



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
		//this.jInternalFrameDetalleDetallePedidoCompraImpor = new DetallePedidoCompraImporBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Pedido Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetallePedidoCompraImpor= new GridBagLayout();
		

		
		String sToolTipDetallePedidoCompraImpor="";
		sToolTipDetallePedidoCompraImpor=DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetallePedidoCompraImpor+="(Importaciones.DetallePedidoCompraImpor)";
		}
		
		if(!this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetallePedidoCompraImpor+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonModificarDetallePedidoCompraImpor = new JButtonMe();
        this.jButtonActualizarDetallePedidoCompraImpor = new JButtonMe();
        this.jButtonEliminarDetallePedidoCompraImpor = new JButtonMe();
        this.jButtonCancelarDetallePedidoCompraImpor = new JButtonMe();
        this.jButtonGuardarCambiosDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor = new JButtonMe();
		this.jButtonCerrarDetallePedidoCompraImpor = new JButtonMe();
		
		this.jScrollPanelDatosDetallePedidoCompraImpor = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetallePedidoCompraImpor = new JScrollPane();
		this.jScrollPanelDatosGeneralDetallePedidoCompraImpor = new JScrollPane();
		//this.jScrollPanelDatosDetallePedidoCompraImporTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Pedido Compra";
		
		if(!this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Pedido Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetallePedidoCompraImpor.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetallePedidoCompraImporTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetallePedidoCompraImpor.setName("jPanelCamposDetallePedidoCompraImpor"); 

		this.jPanelCamposOcultosDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetallePedidoCompraImpor.setName("jPanelCamposOcultosDetallePedidoCompraImpor"); 

        this.jPanelAccionesDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetallePedidoCompraImpor.setToolTipText("Acciones");
        this.jPanelAccionesDetallePedidoCompraImpor.setName("Acciones"); 

		this.jPanelAccionesFormularioDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetallePedidoCompraImpor.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetallePedidoCompraImpor.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetallePedidoCompraImpor.setText("Nuevo");
		this.jButtonModificarDetallePedidoCompraImpor.setText("Editar");
        this.jButtonActualizarDetallePedidoCompraImpor.setText("Actualizar");
        this.jButtonEliminarDetallePedidoCompraImpor.setText("Eliminar");
        this.jButtonCancelarDetallePedidoCompraImpor.setText("Cancelar");
        this.jButtonGuardarCambiosDetallePedidoCompraImpor.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor.setText("Guardar");
		this.jButtonCerrarDetallePedidoCompraImpor.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetallePedidoCompraImpor,"nuevo_button","Nuevo",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetallePedidoCompraImpor,"modificar_button","Editar",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetallePedidoCompraImpor,"actualizar_button","Actualizar",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetallePedidoCompraImpor,"eliminar_button","Eliminar",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetallePedidoCompraImpor,"cancelar_button","Cancelar",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetallePedidoCompraImpor,"guardarcambios_button","Guardar",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor,"guardarcambiostabla_button","Guardar",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetallePedidoCompraImpor,"cerrar_button","Salir",this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetallePedidoCompraImpor.setToolTipText("Nuevo"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetallePedidoCompraImpor.setToolTipText("Editar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetallePedidoCompraImpor.setToolTipText("Actualizar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetallePedidoCompraImpor.setToolTipText("Eliminar)"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetallePedidoCompraImpor.setToolTipText("Cancelar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetallePedidoCompraImpor.setToolTipText("Guardar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor.setToolTipText("Guardar"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetallePedidoCompraImpor.setToolTipText("Salir"+" "+DetallePedidoCompraImporConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetallePedidoCompraImpor";
		inputMap = this.jButtonNuevoDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetallePedidoCompraImpor.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetallePedidoCompraImpor"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetallePedidoCompraImpor";
		inputMap = this.jButtonActualizarDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetallePedidoCompraImpor"));
		
		//ELIMINAR
		sMapKey = "EliminarDetallePedidoCompraImpor";
		inputMap = this.jButtonEliminarDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetallePedidoCompraImpor"));
		
		//CANCELAR	
		sMapKey = "CancelarDetallePedidoCompraImpor";
		inputMap = this.jButtonCancelarDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetallePedidoCompraImpor"));
		
		//CERRAR		
		sMapKey = "CerrarDetallePedidoCompraImpor";
		inputMap = this.jButtonCerrarDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetallePedidoCompraImpor"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetallePedidoCompraImpor";
		inputMap = this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetallePedidoCompraImpor.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetallePedidoCompraImpor"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetallePedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetallePedidoCompraImpor.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetallePedidoCompraImpor.setToolTipText("Nuevo DetallePedidoCompraImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetallePedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetallePedidoCompraImpor.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetallePedidoCompraImpor.setToolTipText("Sin Cerrar Ventana DetallePedidoCompraImpor");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetallePedidoCompraImpor = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetallePedidoCompraImpor.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetallePedidoCompraImpor.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetallePedidoCompraImpor.setText("Accion");
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetallePedidoCompraImpor = new JLabelMe();
		
		this.jLabelAccionesDetallePedidoCompraImpor.setText("Acciones");		
		this.jLabelAccionesDetallePedidoCompraImpor.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoCompraImpor.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetallePedidoCompraImpor.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetallePedidoCompraImpor();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetallePedidoCompraImpor();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetallePedidoCompraImpor=new JTabbedPane();
		this.jTabbedPaneRelacionesDetallePedidoCompraImpor.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetallePedidoCompraImpor,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetallePedidoCompraImpor = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetallePedidoCompraImpor = new GridBagLayout();
		
		this.jPanelCamposDetallePedidoCompraImpor.setLayout(gridaBagLayoutCamposDetallePedidoCompraImpor);
		this.jPanelCamposOcultosDetallePedidoCompraImpor.setLayout(gridaBagLayoutCamposOcultosDetallePedidoCompraImpor);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetallePedidoCompraImpor.add(jLabelIdDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetallePedidoCompraImpor.add(jLabelidDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_pedido_compra_imporDetallePedidoCompraImpor.add(jLabelid_pedido_compra_imporDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_compra_imporDetallePedidoCompraImpor.add(jButtonid_pedido_compra_imporDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_pedido_compra_imporDetallePedidoCompraImpor.add(jButtonid_pedido_compra_imporDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_pedido_compra_imporDetallePedidoCompraImpor.add(jComboBoxid_pedido_compra_imporDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetallePedidoCompraImpor.add(jLabelid_empresaDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePedidoCompraImpor.add(jButtonid_empresaDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetallePedidoCompraImpor.add(jButtonid_empresaDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetallePedidoCompraImpor.add(jComboBoxid_empresaDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetallePedidoCompraImpor.add(jLabelid_sucursalDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePedidoCompraImpor.add(jButtonid_sucursalDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetallePedidoCompraImpor.add(jButtonid_sucursalDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetallePedidoCompraImpor.add(jComboBoxid_sucursalDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetallePedidoCompraImpor.add(jLabelid_bodegaDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetallePedidoCompraImpor.add(jButtonid_bodegaDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetallePedidoCompraImpor.add(jButtonid_bodegaDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetallePedidoCompraImpor.add(jComboBoxid_bodegaDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetallePedidoCompraImpor.add(jLabelid_productoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetallePedidoCompraImpor.add(jButtonid_productoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePedidoCompraImpor.add(jButtonid_productoDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 4;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetallePedidoCompraImpor.add(jButtonid_productoDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetallePedidoCompraImpor.add(jComboBoxid_productoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetallePedidoCompraImpor.add(jLabelid_unidadDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePedidoCompraImpor.add(jButtonid_unidadDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetallePedidoCompraImpor.add(jButtonid_unidadDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetallePedidoCompraImpor.add(jComboBoxid_unidadDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetallePedidoCompraImpor.add(jLabelid_ejercicioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePedidoCompraImpor.add(jButtonid_ejercicioDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetallePedidoCompraImpor.add(jButtonid_ejercicioDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetallePedidoCompraImpor.add(jComboBoxid_ejercicioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetallePedidoCompraImpor.add(jLabelid_periodoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePedidoCompraImpor.add(jButtonid_periodoDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetallePedidoCompraImpor.add(jButtonid_periodoDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetallePedidoCompraImpor.add(jComboBoxid_periodoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_arancelDetallePedidoCompraImpor.add(jLabelid_arancelDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_arancelDetallePedidoCompraImpor.add(jButtonid_arancelDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_arancelDetallePedidoCompraImpor.add(jButtonid_arancelDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_arancelDetallePedidoCompraImpor.add(jComboBoxid_arancelDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pedidoDetallePedidoCompraImpor.add(jLabelcantidad_pedidoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pedidoDetallePedidoCompraImpor.add(jButtoncantidad_pedidoDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pedidoDetallePedidoCompraImpor.add(jTextFieldcantidad_pedidoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_entraDetallePedidoCompraImpor.add(jLabelcantidad_entraDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_entraDetallePedidoCompraImpor.add(jButtoncantidad_entraDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_entraDetallePedidoCompraImpor.add(jTextFieldcantidad_entraDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pendienteDetallePedidoCompraImpor.add(jLabelcantidad_pendienteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pendienteDetallePedidoCompraImpor.add(jButtoncantidad_pendienteDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pendienteDetallePedidoCompraImpor.add(jTextFieldcantidad_pendienteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentajeDetallePedidoCompraImpor.add(jLabelporcentajeDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentajeDetallePedidoCompraImpor.add(jButtonporcentajeDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentajeDetallePedidoCompraImpor.add(jTextFieldporcentajeDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpesoDetallePedidoCompraImpor.add(jLabelpesoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelpesoDetallePedidoCompraImpor.add(jButtonpesoDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpesoDetallePedidoCompraImpor.add(jTextFieldpesoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetallePedidoCompraImpor.add(jLabelprecioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetallePedidoCompraImpor.add(jButtonprecioDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetallePedidoCompraImpor.add(jTextFieldprecioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteDetallePedidoCompraImpor.add(jLabelloteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteDetallePedidoCompraImpor.add(jButtonloteDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteDetallePedidoCompraImpor.add(jTextFieldloteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_arancelDetallePedidoCompraImpor.add(jLabelporcentaje_arancelDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_arancelDetallePedidoCompraImpor.add(jButtonporcentaje_arancelDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_arancelDetallePedidoCompraImpor.add(jTextFieldporcentaje_arancelDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_unidad_auxiliarDetallePedidoCompraImpor.add(jLabelcantidad_unidad_auxiliarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_unidad_auxiliarDetallePedidoCompraImpor.add(jButtoncantidad_unidad_auxiliarDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_unidad_auxiliarDetallePedidoCompraImpor.add(jTextFieldcantidad_unidad_auxiliarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecio_unidad_auxiliarDetallePedidoCompraImpor.add(jLabelprecio_unidad_auxiliarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecio_unidad_auxiliarDetallePedidoCompraImpor.add(jButtonprecio_unidad_auxiliarDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecio_unidad_auxiliarDetallePedidoCompraImpor.add(jTextFieldprecio_unidad_auxiliarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfobDetallePedidoCompraImpor.add(jLabelfobDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfobDetallePedidoCompraImpor.add(jButtonfobDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfobDetallePedidoCompraImpor.add(jTextFieldfobDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfob_exwDetallePedidoCompraImpor.add(jLabelfob_exwDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelfob_exwDetallePedidoCompraImpor.add(jButtonfob_exwDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfob_exwDetallePedidoCompraImpor.add(jTextFieldfob_exwDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetallePedidoCompraImpor.add(jLabeltotalDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetallePedidoCompraImpor.add(jButtontotalDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetallePedidoCompraImpor.add(jTextFieldtotalDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetallePedidoCompraImpor.add(jLabeldescripcionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetallePedidoCompraImpor.add(jButtondescripcionDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetallePedidoCompraImpor.add(jscrollPanedescripcionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetallePedidoCompraImpor.add(jLabelid_centro_costoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetallePedidoCompraImpor.add(jButtonid_centro_costoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetallePedidoCompraImpor.add(jButtonid_centro_costoDetallePedidoCompraImporArbol, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 4;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetallePedidoCompraImpor.add(jButtonid_centro_costoDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 5;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetallePedidoCompraImpor.add(jButtonid_centro_costoDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetallePedidoCompraImpor.add(jComboBoxid_centro_costoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetallePedidoCompraImpor.add(jLabelid_anioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePedidoCompraImpor.add(jButtonid_anioDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetallePedidoCompraImpor.add(jButtonid_anioDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetallePedidoCompraImpor.add(jComboBoxid_anioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetallePedidoCompraImpor.add(jLabelid_mesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 2;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePedidoCompraImpor.add(jButtonid_mesDetallePedidoCompraImporBusqueda, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		//this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 3;
		this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetallePedidoCompraImpor.add(jButtonid_mesDetallePedidoCompraImporUpdate, this.gridBagConstraintsDetallePedidoCompraImpor);
	}

	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 1;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetallePedidoCompraImpor.add(jComboBoxid_mesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelidDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelid_pedido_compra_imporDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelid_bodegaDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelid_productoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelid_unidadDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelid_arancelDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelcantidad_pedidoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelcantidad_entraDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelcantidad_pendienteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelporcentajeDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelpesoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelprecioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelloteDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelporcentaje_arancelDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelcantidad_unidad_auxiliarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelprecio_unidad_auxiliarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelfobDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelfob_exwDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPaneltotalDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPaneldescripcionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetallePedidoCompraImpor.add(this.jPanelid_centro_costoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposDetallePedidoCompraImpor=0;
		iYPanelCamposDetallePedidoCompraImpor++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposOcultosDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposOcultosDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompraImpor.add(this.jPanelid_empresaDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposOcultosDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosDetallePedidoCompraImpor=0;
		iYPanelCamposOcultosDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposOcultosDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposOcultosDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompraImpor.add(this.jPanelid_sucursalDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposOcultosDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosDetallePedidoCompraImpor=0;
		iYPanelCamposOcultosDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposOcultosDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposOcultosDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompraImpor.add(this.jPanelid_ejercicioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposOcultosDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosDetallePedidoCompraImpor=0;
		iYPanelCamposOcultosDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposOcultosDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposOcultosDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompraImpor.add(this.jPanelid_periodoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposOcultosDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosDetallePedidoCompraImpor=0;
		iYPanelCamposOcultosDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposOcultosDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposOcultosDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompraImpor.add(this.jPanelid_anioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposOcultosDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosDetallePedidoCompraImpor=0;
		iYPanelCamposOcultosDetallePedidoCompraImpor++;
	}
	this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iYPanelCamposOcultosDetallePedidoCompraImpor;
	this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iXPanelCamposOcultosDetallePedidoCompraImpor++;
	this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetallePedidoCompraImpor.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetallePedidoCompraImpor.add(this.jPanelid_mesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);



	if(iXPanelCamposOcultosDetallePedidoCompraImpor % 2==0) {
		iXPanelCamposOcultosDetallePedidoCompraImpor=0;
		iYPanelCamposOcultosDetallePedidoCompraImpor++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetallePedidoCompraImpor= new GridBagLayout();
		this.jPanelAccionesDetallePedidoCompraImpor.setLayout(gridaBagLayoutAccionesDetallePedidoCompraImpor);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetallePedidoCompraImpor= new GridBagLayout();
		this.jPanelAccionesFormularioDetallePedidoCompraImpor.setLayout(gridaBagLayoutAccionesFormularioDetallePedidoCompraImpor);
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePedidoCompraImpor.add(this.jComboBoxTiposAccionesFormularioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetallePedidoCompraImpor.add(this.jCheckBoxPostAccionNuevoDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallepedidocompraimporSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePedidoCompraImpor.add(this.jCheckBoxPostAccionSinCerrarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallepedidocompraimporSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetallePedidoCompraImpor.add(this.jCheckBoxPostAccionSinMensajeDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetallePedidoCompraImpor.add(this.jButtonModificarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);							

		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetallePedidoCompraImpor.add(this.jButtonEliminarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
			
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoCompraImpor.add(this.jButtonActualizarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);


		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoCompraImpor.add(this.jButtonGuardarCambiosDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);	
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = 0;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetallePedidoCompraImpor.add(this.jButtonCancelarDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetallePedidoCompraImpor = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetallePedidoCompraImpor);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallepedidocompraimporSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();						
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;		
			//this.gridBagConstraintsDetallePedidoCompraImpor.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetallePedidoCompraImpor.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx =0;
		this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetallePedidoCompraImpor.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetallePedidoCompraImporJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetallePedidoCompraImpor = new DetallePedidoCompraImporBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Pedido Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Pedido Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pedido Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetallePedidoCompraImporModel detallepedidocompraimporModel=new DetallePedidoCompraImporModel(this);
			
			//SI USARA CLASE INTERNA
			//DetallePedidoCompraImporModel.DetallePedidoCompraImporFocusTraversalPolicy detallepedidocompraimporFocusTraversalPolicy = detallepedidocompraimporModel.new DetallePedidoCompraImporFocusTraversalPolicy(this);
			
			//detallepedidocompraimporFocusTraversalPolicy.setdetallepedidocompraimporJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallepedidocompraimporModel);
			
			
			this.jContentPaneDetalleDetallePedidoCompraImpor = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetallePedidoCompraImpor = new GridBagLayout();	
			this.jContentPaneDetalleDetallePedidoCompraImpor.setLayout(gridaBagLayoutDetalleDetallePedidoCompraImpor);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetallePedidoCompraImpor = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
				this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
					
				
				this.jContentPaneDetalleDetallePedidoCompraImpor.add(jTtoolBarDetalleDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);								
				
}
			
			this.jScrollPanelDatosEdicionDetallePedidoCompraImpor=   new JScrollPane(jContentPaneDetalleDetallePedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetallePedidoCompraImpor=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	        
			this.jContentPaneDetalleDetallePedidoCompraImpor.add(jPanelCamposDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);
			
			
			
			
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
						&& detallepedidocompraimporSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallepedidocompraimporSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetallePedidoCompraImpor= new GridBagConstraints();
						this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
						this.jContentPaneDetalleDetallePedidoCompraImpor.add(this.jTabbedPaneRelacionesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetallePedidoCompraImpor.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetallePedidoCompraImpor.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
					this.gridBagConstraintsDetallePedidoCompraImpor.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
					
				
					this.jContentPaneDetalleDetallePedidoCompraImpor.add(jPanelCamposOcultosDetallePedidoCompraImpor, gridBagConstraintsDetallePedidoCompraImpor);
				
					this.jPanelCamposOcultosDetallePedidoCompraImpor.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	        this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetallePedidoCompraImpor.add(this.jPanelAccionesFormularioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);							
			
			
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
	        this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
	        
			
			this.jContentPaneDetalleDetallePedidoCompraImpor.add(this.jPanelAccionesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetallePedidoCompraImpor);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetallePedidoCompraImpor=   new JScrollPane(this.jPanelCamposDetallePedidoCompraImpor,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetallePedidoCompraImpor.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoCompraImpor.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetallePedidoCompraImpor.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
			this.gridBagConstraintsDetallePedidoCompraImpor.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetallePedidoCompraImpor.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetallePedidoCompraImpor.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);			
			
			this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
			this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
			
			
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		
			
		this.gridBagConstraintsDetallePedidoCompraImpor = new GridBagConstraints();
		this.gridBagConstraintsDetallePedidoCompraImpor.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetallePedidoCompraImpor.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetallePedidoCompraImpor, this.gridBagConstraintsDetallePedidoCompraImpor);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetallePedidoCompraImpor;//jContentPane;
		
		return jScrollPanelDatosEdicionDetallePedidoCompraImpor;
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
