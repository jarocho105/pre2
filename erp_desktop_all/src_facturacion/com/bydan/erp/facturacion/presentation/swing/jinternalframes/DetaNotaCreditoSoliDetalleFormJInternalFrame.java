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
import com.bydan.erp.facturacion.util.DetaNotaCreditoSoliConstantesFunciones;

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
public class DetaNotaCreditoSoliDetalleFormJInternalFrame extends DetaNotaCreditoSoliBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetaNotaCreditoSoli;
	
	protected JMenuBar jmenuBarDetalleDetaNotaCreditoSoli;
	
	protected JMenu jmenuDetalleDetaNotaCreditoSoli;
	protected JMenu jmenuDetalleArchivoDetaNotaCreditoSoli;
	protected JMenu jmenuDetalleAccionesDetaNotaCreditoSoli;
	protected JMenu jmenuDetalleDatosDetaNotaCreditoSoli;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetaNotaCreditoSoli;	
	protected GridBagConstraints gridBagConstraintsDetaNotaCreditoSoli;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetaNotaCreditoSoliBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetaNotaCreditoSoli;		
	
	
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

	protected NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_notacreditosoli="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected EmpaqueBeanSwingJInternalFrame empaqueBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empaque="";

	protected TipoDevolucionEmpresaBeanSwingJInternalFrame tipodevolucionempresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodevolucionempresa="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetaNotaCreditoSoliSessionBean detanotacreditosoliSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public NotaCreditoSoliSessionBean notacreditosoliSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public EmpaqueSessionBean empaqueSessionBean;
	public TipoDevolucionEmpresaSessionBean tipodevolucionempresaSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;	
	
	public DetaNotaCreditoSoliLogic detanotacreditosoliLogic;
	
	public JScrollPane jScrollPanelDatosDetaNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosEdicionDetaNotaCreditoSoli;
	public JScrollPane jScrollPanelDatosGeneralDetaNotaCreditoSoli;
	
	protected JPanel jPanelCamposDetaNotaCreditoSoli;    
	protected JPanel jPanelCamposOcultosDetaNotaCreditoSoli;    	
	protected JPanel jPanelAccionesDetaNotaCreditoSoli;
	protected JPanel jPanelAccionesFormularioDetaNotaCreditoSoli;
    
	
	
	protected Integer iXPanelCamposDetaNotaCreditoSoli=0;
	protected Integer iYPanelCamposDetaNotaCreditoSoli=0;
	
	protected Integer iXPanelCamposOcultosDetaNotaCreditoSoli=0;
	protected Integer iYPanelCamposOcultosDetaNotaCreditoSoli=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetaNotaCreditoSoli;
	public JButton jButtonModificarDetaNotaCreditoSoli;
	public JButton jButtonActualizarDetaNotaCreditoSoli;
    public JButton jButtonEliminarDetaNotaCreditoSoli;
	public JButton jButtonCancelarDetaNotaCreditoSoli;
    public JButton jButtonGuardarCambiosDetaNotaCreditoSoli;
	public JButton jButtonGuardarCambiosTablaDetaNotaCreditoSoli;
	protected JButton jButtonCerrarDetaNotaCreditoSoli;
	
	
	protected JButton jButtonProcesarInformacionDetaNotaCreditoSoli;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetaNotaCreditoSoli;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetaNotaCreditoSoli;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetaNotaCreditoSoli;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetaNotaCreditoSoli;
	protected JButton jButtonModificarToolBarDetaNotaCreditoSoli;
	protected JButton jButtonActualizarToolBarDetaNotaCreditoSoli;
    protected JButton jButtonEliminarToolBarDetaNotaCreditoSoli;
	protected JButton jButtonCancelarToolBarDetaNotaCreditoSoli;
    protected JButton jButtonGuardarCambiosToolBarDetaNotaCreditoSoli;
	protected JButton jButtonGuardarCambiosTablaToolBarDetaNotaCreditoSoli;
	protected JButton jButtonMostrarOcultarTablaToolBarDetaNotaCreditoSoli;
	protected JButton jButtonCerrarToolBarDetaNotaCreditoSoli;
	
	protected JButton jButtonProcesarInformacionToolBarDetaNotaCreditoSoli;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemModificarDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemActualizarDetaNotaCreditoSoli;
    protected JMenuItem jMenuItemEliminarDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemCancelarDetaNotaCreditoSoli;
    protected JMenuItem jMenuItemGuardarCambiosDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemCerrarDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleCerrarDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli;
	
	protected JMenuItem jMenuItemProcesarInformacionDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetaNotaCreditoSoli;
	protected JMenuItem jMenuItemMostrarOcultarDetaNotaCreditoSoli;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetaNotaCreditoSoli;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetaNotaCreditoSoli;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetaNotaCreditoSoli;
	public JLabel jLabelIdDetaNotaCreditoSoli;
	public JLabel jLabelidDetaNotaCreditoSoli;
	public JButton jButtonidDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetaNotaCreditoSoli;
	public JLabel jLabelcantidadDetaNotaCreditoSoli;
	public JTextField jTextFieldcantidadDetaNotaCreditoSoli;
	public JButton jButtoncantidadDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetaNotaCreditoSoli;
	public JLabel jLabelprecioDetaNotaCreditoSoli;
	public JTextField jTextFieldprecioDetaNotaCreditoSoli;
	public JButton jButtonprecioDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelporcen_descuenDetaNotaCreditoSoli;
	public JLabel jLabelporcen_descuenDetaNotaCreditoSoli;
	public JTextField jTextFieldporcen_descuenDetaNotaCreditoSoli;
	public JButton jButtonporcen_descuenDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetaNotaCreditoSoli;
	public JLabel jLabeldescuentoDetaNotaCreditoSoli;
	public JTextField jTextFielddescuentoDetaNotaCreditoSoli;
	public JButton jButtondescuentoDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelimpuestoDetaNotaCreditoSoli;
	public JLabel jLabelimpuestoDetaNotaCreditoSoli;
	public JTextField jTextFieldimpuestoDetaNotaCreditoSoli;
	public JButton jButtonimpuestoDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelporcen_ivaDetaNotaCreditoSoli;
	public JLabel jLabelporcen_ivaDetaNotaCreditoSoli;
	public JTextField jTextFieldporcen_ivaDetaNotaCreditoSoli;
	public JButton jButtonporcen_ivaDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetaNotaCreditoSoli;
	public JLabel jLabeltotalDetaNotaCreditoSoli;
	public JTextField jTextFieldtotalDetaNotaCreditoSoli;
	public JButton jButtontotalDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetaNotaCreditoSoli;
	public JLabel jLabeldescripcionDetaNotaCreditoSoli;
	public JTextArea jTextAreadescripcionDetaNotaCreditoSoli;
	public JScrollPane jscrollPanedescripcionDetaNotaCreditoSoli;
	public JButton jButtondescripcionDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_loteDetaNotaCreditoSoli;
	public JLabel jLabelcodigo_loteDetaNotaCreditoSoli;
	public JTextField jTextFieldcodigo_loteDetaNotaCreditoSoli;
	public JButton jButtoncodigo_loteDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cajaDetaNotaCreditoSoli;
	public JLabel jLabelnumero_cajaDetaNotaCreditoSoli;
	public JTextField jTextFieldnumero_cajaDetaNotaCreditoSoli;
	public JButton jButtonnumero_cajaDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPaneldescuento2DetaNotaCreditoSoli;
	public JLabel jLabeldescuento2DetaNotaCreditoSoli;
	public JTextField jTextFielddescuento2DetaNotaCreditoSoli;
	public JButton jButtondescuento2DetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelcostoDetaNotaCreditoSoli;
	public JLabel jLabelcostoDetaNotaCreditoSoli;
	public JTextField jTextFieldcostoDetaNotaCreditoSoli;
	public JButton jButtoncostoDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelincluye_impuestoDetaNotaCreditoSoli;
	public JLabel jLabelincluye_impuestoDetaNotaCreditoSoli;
	public JCheckBox jCheckBoxincluye_impuestoDetaNotaCreditoSoli;
	public JButton jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelporcen_iceDetaNotaCreditoSoli;
	public JLabel jLabelporcen_iceDetaNotaCreditoSoli;
	public JTextField jTextFieldporcen_iceDetaNotaCreditoSoli;
	public JButton jButtonporcen_iceDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionDetaNotaCreditoSoli;
	public JLabel jLabelfecha_emisionDetaNotaCreditoSoli;
	//public JFormattedTextField jDateChooserfecha_emisionDetaNotaCreditoSoli;

	public JDateChooser jDateChooserfecha_emisionDetaNotaCreditoSoli;
	public JButton jButtonfecha_emisionDetaNotaCreditoSoliBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetaNotaCreditoSoli;
	public JLabel jLabelid_empresaDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetaNotaCreditoSoli;
	public JButton jButtonid_empresaDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_empresaDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetaNotaCreditoSoli;
	public JLabel jLabelid_sucursalDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetaNotaCreditoSoli;
	public JButton jButtonid_sucursalDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_sucursalDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetaNotaCreditoSoli;
	public JLabel jLabelid_ejercicioDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetaNotaCreditoSoli;
	public JButton jButtonid_ejercicioDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_ejercicioDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetaNotaCreditoSoli;
	public JLabel jLabelid_periodoDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetaNotaCreditoSoli;
	public JButton jButtonid_periodoDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_periodoDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetaNotaCreditoSoli;
	public JLabel jLabelid_anioDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetaNotaCreditoSoli;
	public JButton jButtonid_anioDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_anioDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_anioDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetaNotaCreditoSoli;
	public JLabel jLabelid_mesDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetaNotaCreditoSoli;
	public JButton jButtonid_mesDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_mesDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_mesDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_nota_credito_soliDetaNotaCreditoSoli;
	public JLabel jLabelid_nota_credito_soliDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_nota_credito_soliDetaNotaCreditoSoli;
	public JButton jButtonid_nota_credito_soliDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_nota_credito_soliDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetaNotaCreditoSoli;
	public JLabel jLabelid_bodegaDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetaNotaCreditoSoli;
	public JButton jButtonid_bodegaDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_bodegaDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetaNotaCreditoSoli;
	public JLabel jLabelid_productoDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetaNotaCreditoSoli;
	public JButton jButtonid_productoDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_productoDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_productoDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetaNotaCreditoSoli;
	public JLabel jLabelid_unidadDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetaNotaCreditoSoli;
	public JButton jButtonid_unidadDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_unidadDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_empaqueDetaNotaCreditoSoli;
	public JLabel jLabelid_empaqueDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empaqueDetaNotaCreditoSoli;
	public JButton jButtonid_empaqueDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_empaqueDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_empaqueDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_devolucion_empresaDetaNotaCreditoSoli;
	public JLabel jLabelid_tipo_devolucion_empresaDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli;
	public JButton jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetaNotaCreditoSoli;
	public JLabel jLabelid_centro_costoDetaNotaCreditoSoli;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetaNotaCreditoSoli;
	public JButton jButtonid_centro_costoDetaNotaCreditoSoli= new JButtonMe();
	public JButton jButtonid_centro_costoDetaNotaCreditoSoliUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetaNotaCreditoSoliBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetaNotaCreditoSoliArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetaNotaCreditoSoli;
	
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
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=515;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=902;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetaNotaCreditoSoliDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetaNotaCreditoSoli=new JPanel();
				this.jPanelAccionesFormularioDetaNotaCreditoSoli=new JPanel();
				this.jmenuBarDetalleDetaNotaCreditoSoli=new JMenuBar();
				this.jTtoolBarDetalleDetaNotaCreditoSoli=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoSoliDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetaNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetaNotaCreditoSoliDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetaNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoSoliDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoSoliDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetaNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetaNotaCreditoSoliDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetaNotaCreditoSoli No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetaNotaCreditoSoli() {
		return this.jButtonActualizarToolBarDetaNotaCreditoSoli;
	}
	
	public JButton getjButtonEliminarToolBarDetaNotaCreditoSoli() {
		return this.jButtonEliminarToolBarDetaNotaCreditoSoli;
	}
	
	public JButton getjButtonCancelarToolBarDetaNotaCreditoSoli() {
		return this.jButtonCancelarToolBarDetaNotaCreditoSoli;
	}		
	
	public JButton getjButtonProcesarInformacionDetaNotaCreditoSoli() {
		return this.jButtonProcesarInformacionDetaNotaCreditoSoli;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetaNotaCreditoSoli)	{
		this.jButtonProcesarInformacionDetaNotaCreditoSoli = jButtonProcesarInformacionDetaNotaCreditoSoli;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetaNotaCreditoSoli() {
		return this.jComboBoxTiposAccionesDetaNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetaNotaCreditoSoli(
			JComboBox jComboBoxTiposRelacionesDetaNotaCreditoSoli) {
		this.jComboBoxTiposRelacionesDetaNotaCreditoSoli = jComboBoxTiposRelacionesDetaNotaCreditoSoli;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetaNotaCreditoSoli(
			JComboBox jComboBoxTiposAccionesDetaNotaCreditoSoli) {
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli = jComboBoxTiposAccionesDetaNotaCreditoSoli;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetaNotaCreditoSoli() {
		return this.jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetaNotaCreditoSoli(
			JComboBox jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli) {
		this.jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli = jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detanotacreditosoliSessionBean=new DetaNotaCreditoSoliSessionBean();
		
		this.detanotacreditosoliSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detanotacreditosoliSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detanotacreditosoliSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetaNotaCreditoSoliJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetaNotaCreditoSoliJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle  Solicitud Nota Credit MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {
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
	
		DetaNotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetaNotaCreditoSoli= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetaNotaCreditoSoli=new JButtonMe();
				this.jButtonModificarToolBarDetaNotaCreditoSoli=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetaNotaCreditoSoli,this.jTtoolBarDetalleDetaNotaCreditoSoli,
							"actualizar","actualizar","Actualizar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetaNotaCreditoSoli,this.jTtoolBarDetalleDetaNotaCreditoSoli,
							"eliminar","eliminar","Eliminar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetaNotaCreditoSoli,this.jTtoolBarDetalleDetaNotaCreditoSoli,
							"cancelar","cancelar","Cancelar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetaNotaCreditoSoli=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetaNotaCreditoSoli,this.jTtoolBarDetalleDetaNotaCreditoSoli,
							"guardarcambios","guardarcambios","Guardar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetaNotaCreditoSoli=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetaNotaCreditoSoli=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetaNotaCreditoSoli=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetaNotaCreditoSoli=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetaNotaCreditoSoli=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetaNotaCreditoSoli= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetaNotaCreditoSoli.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetaNotaCreditoSoli,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetaNotaCreditoSoli= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetaNotaCreditoSoli.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetaNotaCreditoSoli,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetaNotaCreditoSoli= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetaNotaCreditoSoli.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetaNotaCreditoSoli,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetaNotaCreditoSoli= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetaNotaCreditoSoli.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetaNotaCreditoSoli,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetaNotaCreditoSoli= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetaNotaCreditoSoli.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetaNotaCreditoSoli,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetaNotaCreditoSoli= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetaNotaCreditoSoli.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetaNotaCreditoSoli,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetaNotaCreditoSoli= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetaNotaCreditoSoli.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetaNotaCreditoSoli,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetaNotaCreditoSoli= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetaNotaCreditoSoli.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetaNotaCreditoSoli,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetaNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetaNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetaNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetaNotaCreditoSoli.add(this.jMenuItemDetalleCerrarDetaNotaCreditoSoli);
		
		this.jmenuDetalleAccionesDetaNotaCreditoSoli.add(this.jMenuItemActualizarDetaNotaCreditoSoli);
		this.jmenuDetalleAccionesDetaNotaCreditoSoli.add(this.jMenuItemEliminarDetaNotaCreditoSoli);
		this.jmenuDetalleAccionesDetaNotaCreditoSoli.add(this.jMenuItemCancelarDetaNotaCreditoSoli);		
		
		//this.jmenuDetalleDatosDetaNotaCreditoSoli.add(this.jMenuItemDetalleAbrirOrderByDetaNotaCreditoSoli);				
		this.jmenuDetalleDatosDetaNotaCreditoSoli.add(this.jMenuItemDetalleMostarOcultarDetaNotaCreditoSoli);				
				
		//this.jmenuDetalleAccionesDetaNotaCreditoSoli.add(this.jMenuItemGuardarCambiosDetaNotaCreditoSoli);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetaNotaCreditoSoli.add(this.jmenuDetalleArchivoDetaNotaCreditoSoli);		
		this.jmenuBarDetalleDetaNotaCreditoSoli.add(this.jmenuDetalleAccionesDetaNotaCreditoSoli);		
		this.jmenuBarDetalleDetaNotaCreditoSoli.add(this.jmenuDetalleDatosDetaNotaCreditoSoli);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetaNotaCreditoSoli);				
	}
	
	
	public void inicializarElementosCamposDetaNotaCreditoSoli() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetaNotaCreditoSoli = new JLabelMe();
		jLabelIdDetaNotaCreditoSoli.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetaNotaCreditoSoli = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetaNotaCreditoSoli= new GridBagLayout();

		this.jPanelidDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);

		jLabelidDetaNotaCreditoSoli = new JLabel();
		jLabelidDetaNotaCreditoSoli.setText("Id");

		jLabelidDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidadDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelcantidadDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetaNotaCreditoSoli.setToolTipText("Cantidad");
		this.jLabelcantidadDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelcantidadDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFieldcantidadDetaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldcantidadDetaNotaCreditoSoli.setEnabled(false);
		jTextFieldcantidadDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetaNotaCreditoSoli.setText("0");

		this.jButtoncantidadDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtoncantidadDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtoncantidadDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelprecioDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetaNotaCreditoSoli.setToolTipText("Precio");
		this.jLabelprecioDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelprecioDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFieldprecioDetaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldprecioDetaNotaCreditoSoli.setEnabled(false);
		jTextFieldprecioDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetaNotaCreditoSoli.setText("0.0");

		this.jButtonprecioDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonprecioDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonprecioDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelporcen_descuenDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelporcen_descuenDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_PORCENDESCUEN+" : *");
		this.jLabelporcen_descuenDetaNotaCreditoSoli.setToolTipText("% Descuen");
		this.jLabelporcen_descuenDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_descuenDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_descuenDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_descuenDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_descuenDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_descuenDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_PORCENDESCUEN);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelporcen_descuenDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFieldporcen_descuenDetaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldporcen_descuenDetaNotaCreditoSoli.setEnabled(false);
		jTextFieldporcen_descuenDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_descuenDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_descuenDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_descuenDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_descuenDetaNotaCreditoSoli.setText("0.0");

		this.jButtonporcen_descuenDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonporcen_descuenDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_descuenDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_descuenDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_descuenDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonporcen_descuenDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_descuenDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_descuenDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_descuenDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_descuenDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_descuenDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_descuenDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetaNotaCreditoSoli = new JLabelMe();
		this.jLabeldescuentoDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetaNotaCreditoSoli.setToolTipText("Descuento");
		this.jLabeldescuentoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPaneldescuentoDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFielddescuentoDetaNotaCreditoSoli= new JTextFieldMe();
		jTextFielddescuentoDetaNotaCreditoSoli.setEnabled(false);
		jTextFielddescuentoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetaNotaCreditoSoli.setText("0.0");

		this.jButtondescuentoDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtondescuentoDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtondescuentoDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelimpuestoDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelimpuestoDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IMPUESTO+" : *");
		this.jLabelimpuestoDetaNotaCreditoSoli.setToolTipText("Impuesto");
		this.jLabelimpuestoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelimpuestoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelimpuestoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelimpuestoDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelimpuestoDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IMPUESTO);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelimpuestoDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFieldimpuestoDetaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldimpuestoDetaNotaCreditoSoli.setEnabled(false);
		jTextFieldimpuestoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldimpuestoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldimpuestoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldimpuestoDetaNotaCreditoSoli.setText("0.0");

		this.jButtonimpuestoDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonimpuestoDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonimpuestoDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonimpuestoDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonimpuestoDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonimpuestoDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonimpuestoDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldimpuestoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldimpuestoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"impuestoDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonimpuestoDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelporcen_ivaDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelporcen_ivaDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_PORCENIVA+" : *");
		this.jLabelporcen_ivaDetaNotaCreditoSoli.setToolTipText("% Iva");
		this.jLabelporcen_ivaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_ivaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_ivaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_ivaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_ivaDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_ivaDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_PORCENIVA);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelporcen_ivaDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFieldporcen_ivaDetaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldporcen_ivaDetaNotaCreditoSoli.setEnabled(false);
		jTextFieldporcen_ivaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_ivaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_ivaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_ivaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_ivaDetaNotaCreditoSoli.setText("0.0");

		this.jButtonporcen_ivaDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonporcen_ivaDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_ivaDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_ivaDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_ivaDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonporcen_ivaDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_ivaDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_ivaDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_ivaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_ivaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_ivaDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_ivaDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetaNotaCreditoSoli = new JLabelMe();
		this.jLabeltotalDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetaNotaCreditoSoli.setToolTipText("Total");
		this.jLabeltotalDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPaneltotalDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFieldtotalDetaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldtotalDetaNotaCreditoSoli.setEnabled(false);
		jTextFieldtotalDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetaNotaCreditoSoli.setText("0.0");

		this.jButtontotalDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtontotalDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtontotalDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetaNotaCreditoSoli = new JLabelMe();
		this.jLabeldescripcionDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetaNotaCreditoSoli.setToolTipText("Descripcion");
		this.jLabeldescripcionDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPaneldescripcionDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextAreadescripcionDetaNotaCreditoSoli= new JTextAreaMe();
		jTextAreadescripcionDetaNotaCreditoSoli.setEnabled(false);
		jTextAreadescripcionDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetaNotaCreditoSoli.setLineWrap(true);
		jTextAreadescripcionDetaNotaCreditoSoli.setWrapStyleWord(true);
		jTextAreadescripcionDetaNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetaNotaCreditoSoli.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetaNotaCreditoSoli = new JScrollPane(jTextAreadescripcionDetaNotaCreditoSoli);
		jscrollPanedescripcionDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtondescripcionDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtondescripcionDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_loteDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelcodigo_loteDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_CODIGOLOTE+" : *");
		this.jLabelcodigo_loteDetaNotaCreditoSoli.setToolTipText("Codigo Lote");
		this.jLabelcodigo_loteDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_loteDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigo_loteDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_loteDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_loteDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_loteDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_CODIGOLOTE);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelcodigo_loteDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFieldcodigo_loteDetaNotaCreditoSoli= new JTextFieldMe();

		jTextFieldcodigo_loteDetaNotaCreditoSoli.setEnabled(false);
		jTextFieldcodigo_loteDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_loteDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_loteDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_loteDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_loteDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtoncodigo_loteDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_loteDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_loteDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_loteDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtoncodigo_loteDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_loteDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_loteDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_loteDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_loteDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_loteDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_loteDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cajaDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelnumero_cajaDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_NUMEROCAJA+" : *");
		this.jLabelnumero_cajaDetaNotaCreditoSoli.setToolTipText("Numero Caja");
		this.jLabelnumero_cajaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cajaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cajaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cajaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cajaDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cajaDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_NUMEROCAJA);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelnumero_cajaDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFieldnumero_cajaDetaNotaCreditoSoli= new JTextFieldMe();

		jTextFieldnumero_cajaDetaNotaCreditoSoli.setEnabled(false);
		jTextFieldnumero_cajaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cajaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cajaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cajaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cajaDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonnumero_cajaDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cajaDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cajaDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cajaDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonnumero_cajaDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cajaDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cajaDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cajaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cajaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cajaDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cajaDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabeldescuento2DetaNotaCreditoSoli = new JLabelMe();
		this.jLabeldescuento2DetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_DESCUENTO2+" : *");
		this.jLabeldescuento2DetaNotaCreditoSoli.setToolTipText("Descuento2");
		this.jLabeldescuento2DetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento2DetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento2DetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento2DetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_DESCUENTO2);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPaneldescuento2DetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFielddescuento2DetaNotaCreditoSoli= new JTextFieldMe();
		jTextFielddescuento2DetaNotaCreditoSoli.setEnabled(false);
		jTextFielddescuento2DetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento2DetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento2DetaNotaCreditoSoli.setText("0.0");

		this.jButtondescuento2DetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtondescuento2DetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento2DetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtondescuento2DetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento2DetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento2DetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento2DetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento2DetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento2DetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento2DetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelcostoDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelcostoDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_COSTO+" : *");
		this.jLabelcostoDetaNotaCreditoSoli.setToolTipText("Costo");
		this.jLabelcostoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcostoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcostoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcostoDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcostoDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_COSTO);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelcostoDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFieldcostoDetaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldcostoDetaNotaCreditoSoli.setEnabled(false);
		jTextFieldcostoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcostoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcostoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcostoDetaNotaCreditoSoli.setText("0.0");

		this.jButtoncostoDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtoncostoDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncostoDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncostoDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtoncostoDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncostoDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncostoDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcostoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcostoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costoDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncostoDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelincluye_impuestoDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelincluye_impuestoDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_INCLUYEIMPUESTO+" : *");
		this.jLabelincluye_impuestoDetaNotaCreditoSoli.setToolTipText("Incluye Impuesto");
		this.jLabelincluye_impuestoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelincluye_impuestoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelincluye_impuestoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelincluye_impuestoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelincluye_impuestoDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelincluye_impuestoDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_INCLUYEIMPUESTO);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelincluye_impuestoDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jCheckBoxincluye_impuestoDetaNotaCreditoSoli= new JCheckBoxMe();
		jCheckBoxincluye_impuestoDetaNotaCreditoSoli.setEnabled(false);

		jCheckBoxincluye_impuestoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxincluye_impuestoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxincluye_impuestoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxincluye_impuestoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxincluye_impuestoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxincluye_impuestoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"incluye_impuestoDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelporcen_iceDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelporcen_iceDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_PORCENICE+" : *");
		this.jLabelporcen_iceDetaNotaCreditoSoli.setToolTipText("% Ice");
		this.jLabelporcen_iceDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_iceDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcen_iceDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcen_iceDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcen_iceDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcen_iceDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_PORCENICE);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelporcen_iceDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jTextFieldporcen_iceDetaNotaCreditoSoli= new JTextFieldMe();
		jTextFieldporcen_iceDetaNotaCreditoSoli.setEnabled(false);
		jTextFieldporcen_iceDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_iceDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcen_iceDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcen_iceDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcen_iceDetaNotaCreditoSoli.setText("0.0");

		this.jButtonporcen_iceDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonporcen_iceDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_iceDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcen_iceDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcen_iceDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonporcen_iceDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcen_iceDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcen_iceDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcen_iceDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcen_iceDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcen_iceDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcen_iceDetaNotaCreditoSoliBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelfecha_emisionDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionDetaNotaCreditoSoli.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelfecha_emisionDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		//jFormattedTextFieldfecha_emisionDetaNotaCreditoSoli= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionDetaNotaCreditoSoli= new JDateChooser();
		jDateChooserfecha_emisionDetaNotaCreditoSoli.setEnabled(false);
		jDateChooserfecha_emisionDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionDetaNotaCreditoSoli.setDate(new Date());
		jDateChooserfecha_emisionDetaNotaCreditoSoli.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionDetaNotaCreditoSoli.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonfecha_emisionDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonfecha_emisionDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionDetaNotaCreditoSoliBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetaNotaCreditoSoli() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_empresaDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetaNotaCreditoSoli.setToolTipText("Empresa");
		this.jLabelid_empresaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_empresaDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_empresaDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_empresaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetaNotaCreditoSoli.setEnabled(false);

		this.jButtonid_empresaDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_empresaDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_empresaDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaNotaCreditoSoli"));

		this.jButtonid_empresaDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_empresaDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_empresaDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_empresaDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_empresaDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_sucursalDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_sucursalDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetaNotaCreditoSoli.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_sucursalDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_sucursalDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_sucursalDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetaNotaCreditoSoli.setEnabled(false);

		this.jButtonid_sucursalDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_sucursalDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_sucursalDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetaNotaCreditoSoli"));

		this.jButtonid_sucursalDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_sucursalDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_sucursalDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_sucursalDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_ejercicioDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_ejercicioDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetaNotaCreditoSoli.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_ejercicioDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_ejercicioDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_ejercicioDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetaNotaCreditoSoli.setEnabled(false);

		this.jButtonid_ejercicioDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_ejercicioDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_ejercicioDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetaNotaCreditoSoli"));

		this.jButtonid_ejercicioDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_ejercicioDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_ejercicioDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_periodoDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_periodoDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetaNotaCreditoSoli.setToolTipText("Periodo");
		this.jLabelid_periodoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_periodoDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_periodoDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_periodoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetaNotaCreditoSoli.setEnabled(false);

		this.jButtonid_periodoDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_periodoDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_periodoDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetaNotaCreditoSoli"));

		this.jButtonid_periodoDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_periodoDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_periodoDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_periodoDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_periodoDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_anioDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_anioDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetaNotaCreditoSoli.setToolTipText("Anio");
		this.jLabelid_anioDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_anioDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_anioDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_anioDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetaNotaCreditoSoli.setEnabled(false);

		this.jButtonid_anioDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_anioDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_anioDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetaNotaCreditoSoli"));

		this.jButtonid_anioDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_anioDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_anioDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_anioDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_anioDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_anioDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_mesDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_mesDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetaNotaCreditoSoli.setToolTipText("Mes");
		this.jLabelid_mesDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_mesDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_mesDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_mesDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetaNotaCreditoSoli.setEnabled(false);

		this.jButtonid_mesDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_mesDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_mesDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetaNotaCreditoSoli"));

		this.jButtonid_mesDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_mesDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_mesDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_mesDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_mesDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_mesDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_nota_credito_soliDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_nota_credito_soliDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDNOTACREDITOSOLI+" : *");
		this.jLabelid_nota_credito_soliDetaNotaCreditoSoli.setToolTipText("Solicitud Nota Credito");
		this.jLabelid_nota_credito_soliDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_nota_credito_soliDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_nota_credito_soliDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_nota_credito_soliDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_nota_credito_soliDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_nota_credito_soliDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDNOTACREDITOSOLI);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_nota_credito_soliDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_nota_credito_soliDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_nota_credito_soliDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nota_credito_soliDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_nota_credito_soliDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_nota_credito_soliDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_nota_credito_soliDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nota_credito_soliDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_nota_credito_soliDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nota_credito_soliDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nota_credito_soliDetaNotaCreditoSoli"));

		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_nota_credito_soliDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nota_credito_soliDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nota_credito_soliDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_nota_credito_soliDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_nota_credito_soliDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_nota_credito_soliDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_nota_credito_soliDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_nota_credito_soliDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_nota_credito_soliDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_bodegaDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_bodegaDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetaNotaCreditoSoli.setToolTipText("Bodega");
		this.jLabelid_bodegaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_bodegaDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_bodegaDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_bodegaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_bodegaDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_bodegaDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetaNotaCreditoSoli"));

		this.jButtonid_bodegaDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_bodegaDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_bodegaDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_bodegaDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_productoDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_productoDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetaNotaCreditoSoli.setToolTipText("Producto");
		this.jLabelid_productoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_productoDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_productoDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_productoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_productoDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_productoDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetaNotaCreditoSoli"));

		this.jButtonid_productoDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_productoDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_productoDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_productoDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_productoDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_productoDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_unidadDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_unidadDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetaNotaCreditoSoli.setToolTipText("Unidad");
		this.jLabelid_unidadDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_unidadDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_unidadDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_unidadDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_unidadDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_unidadDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetaNotaCreditoSoli"));

		this.jButtonid_unidadDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_unidadDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_unidadDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_unidadDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_unidadDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_empaqueDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_empaqueDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDEMPAQUE+" :");
		this.jLabelid_empaqueDetaNotaCreditoSoli.setToolTipText("Empaque");
		this.jLabelid_empaqueDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empaqueDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empaqueDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empaqueDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empaqueDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empaqueDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDEMPAQUE);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_empaqueDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_empaqueDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_empaqueDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empaqueDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empaqueDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empaqueDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_empaqueDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empaqueDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empaqueDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empaqueDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_empaqueDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empaqueDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empaqueDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empaqueDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empaqueDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empaqueDetaNotaCreditoSoli"));

		this.jButtonid_empaqueDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_empaqueDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empaqueDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_empaqueDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empaqueDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empaqueDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empaqueDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empaqueDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empaqueDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empaqueDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_empaqueDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_empaqueDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empaqueDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empaqueDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_empaqueDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empaqueDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empaqueDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empaqueDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empaqueDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empaqueDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_tipo_devolucion_empresaDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_tipo_devolucion_empresaDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA+" : *");
		this.jLabelid_tipo_devolucion_empresaDetaNotaCreditoSoli.setToolTipText("Tipo Devolucion");
		this.jLabelid_tipo_devolucion_empresaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_devolucion_empresaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_devolucion_empresaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_devolucion_empresaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_devolucion_empresaDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_devolucion_empresaDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDTIPODEVOLUCIONEMPRESA);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_tipo_devolucion_empresaDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_devolucion_empresaDetaNotaCreditoSoli"));

		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate"));



					
		this.jLabelid_centro_costoDetaNotaCreditoSoli = new JLabelMe();
		this.jLabelid_centro_costoDetaNotaCreditoSoli.setText(""+DetaNotaCreditoSoliConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetaNotaCreditoSoli.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetaNotaCreditoSoli=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetaNotaCreditoSoli.setToolTipText(DetaNotaCreditoSoliConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		this.jPanelid_centro_costoDetaNotaCreditoSoli.setLayout(this.gridaBagLayoutDetaNotaCreditoSoli);


		jComboBoxid_centro_costoDetaNotaCreditoSoli= new JComboBoxMe();
		jComboBoxid_centro_costoDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetaNotaCreditoSoli= new JButtonMe();
		this.jButtonid_centro_costoDetaNotaCreditoSoli.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetaNotaCreditoSoli.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetaNotaCreditoSoli.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetaNotaCreditoSoli.setText("Buscar");
		this.jButtonid_centro_costoDetaNotaCreditoSoli.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetaNotaCreditoSoli.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetaNotaCreditoSoli,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetaNotaCreditoSoli"));

		this.jButtonid_centro_costoDetaNotaCreditoSoliBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetaNotaCreditoSoliBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetaNotaCreditoSoliBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetaNotaCreditoSoliBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetaNotaCreditoSoliBusqueda.setText("U");
		this.jButtonid_centro_costoDetaNotaCreditoSoliBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetaNotaCreditoSoliBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetaNotaCreditoSoliBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetaNotaCreditoSoliBusqueda"));

		if(this.detanotacreditosoliSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetaNotaCreditoSoliBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetaNotaCreditoSoliUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetaNotaCreditoSoliUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetaNotaCreditoSoliUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetaNotaCreditoSoliUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetaNotaCreditoSoliUpdate.setText("U");
		this.jButtonid_centro_costoDetaNotaCreditoSoliUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetaNotaCreditoSoliUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetaNotaCreditoSoliUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetaNotaCreditoSoliUpdate"));


		jButtonid_centro_costoDetaNotaCreditoSoliArbol= new JButtonMe();
		jButtonid_centro_costoDetaNotaCreditoSoliArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetaNotaCreditoSoliArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetaNotaCreditoSoliArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetaNotaCreditoSoliArbol.setText("Arbol");
		jButtonid_centro_costoDetaNotaCreditoSoliArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetaNotaCreditoSoliArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetaNotaCreditoSoliArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetaNotaCreditoSoli.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetaNotaCreditoSoli.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetaNotaCreditoSoliArbol"));



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
		//this.jInternalFrameDetalleDetaNotaCreditoSoli = new DetaNotaCreditoSoliBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle  Solicitud Nota Credit DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetaNotaCreditoSoli= new GridBagLayout();
		

		
		String sToolTipDetaNotaCreditoSoli="";
		sToolTipDetaNotaCreditoSoli=DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetaNotaCreditoSoli+="(Facturacion.DetaNotaCreditoSoli)";
		}
		
		if(!this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetaNotaCreditoSoli+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonModificarDetaNotaCreditoSoli = new JButtonMe();
        this.jButtonActualizarDetaNotaCreditoSoli = new JButtonMe();
        this.jButtonEliminarDetaNotaCreditoSoli = new JButtonMe();
        this.jButtonCancelarDetaNotaCreditoSoli = new JButtonMe();
        this.jButtonGuardarCambiosDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli = new JButtonMe();
		this.jButtonCerrarDetaNotaCreditoSoli = new JButtonMe();
		
		this.jScrollPanelDatosDetaNotaCreditoSoli = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetaNotaCreditoSoli = new JScrollPane();
		this.jScrollPanelDatosGeneralDetaNotaCreditoSoli = new JScrollPane();
		//this.jScrollPanelDatosDetaNotaCreditoSoliTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle  Solicitud Nota Credit";
		
		if(!this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle  Solicitud Nota Credits" + this.sPath));
		} else {
			this.jScrollPanelDatosDetaNotaCreditoSoli.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetaNotaCreditoSoliTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetaNotaCreditoSoli.setName("jPanelCamposDetaNotaCreditoSoli"); 

		this.jPanelCamposOcultosDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetaNotaCreditoSoli.setName("jPanelCamposOcultosDetaNotaCreditoSoli"); 

        this.jPanelAccionesDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetaNotaCreditoSoli.setToolTipText("Acciones");
        this.jPanelAccionesDetaNotaCreditoSoli.setName("Acciones"); 

		this.jPanelAccionesFormularioDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetaNotaCreditoSoli.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetaNotaCreditoSoli.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetaNotaCreditoSoli.setText("Nuevo");
		this.jButtonModificarDetaNotaCreditoSoli.setText("Editar");
        this.jButtonActualizarDetaNotaCreditoSoli.setText("Actualizar");
        this.jButtonEliminarDetaNotaCreditoSoli.setText("Eliminar");
        this.jButtonCancelarDetaNotaCreditoSoli.setText("Cancelar");
        this.jButtonGuardarCambiosDetaNotaCreditoSoli.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli.setText("Guardar");
		this.jButtonCerrarDetaNotaCreditoSoli.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetaNotaCreditoSoli,"nuevo_button","Nuevo",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetaNotaCreditoSoli,"modificar_button","Editar",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetaNotaCreditoSoli,"actualizar_button","Actualizar",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetaNotaCreditoSoli,"eliminar_button","Eliminar",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetaNotaCreditoSoli,"cancelar_button","Cancelar",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetaNotaCreditoSoli,"guardarcambios_button","Guardar",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli,"guardarcambiostabla_button","Guardar",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetaNotaCreditoSoli,"cerrar_button","Salir",this.detanotacreditosoliSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetaNotaCreditoSoli.setToolTipText("Nuevo"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetaNotaCreditoSoli.setToolTipText("Editar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetaNotaCreditoSoli.setToolTipText("Actualizar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetaNotaCreditoSoli.setToolTipText("Eliminar)"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetaNotaCreditoSoli.setToolTipText("Cancelar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetaNotaCreditoSoli.setToolTipText("Guardar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli.setToolTipText("Guardar"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetaNotaCreditoSoli.setToolTipText("Salir"+" "+DetaNotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetaNotaCreditoSoli";
		inputMap = this.jButtonNuevoDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetaNotaCreditoSoli.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetaNotaCreditoSoli"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetaNotaCreditoSoli";
		inputMap = this.jButtonActualizarDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetaNotaCreditoSoli"));
		
		//ELIMINAR
		sMapKey = "EliminarDetaNotaCreditoSoli";
		inputMap = this.jButtonEliminarDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetaNotaCreditoSoli"));
		
		//CANCELAR	
		sMapKey = "CancelarDetaNotaCreditoSoli";
		inputMap = this.jButtonCancelarDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetaNotaCreditoSoli"));
		
		//CERRAR		
		sMapKey = "CerrarDetaNotaCreditoSoli";
		inputMap = this.jButtonCerrarDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetaNotaCreditoSoli"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetaNotaCreditoSoli";
		inputMap = this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetaNotaCreditoSoli.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetaNotaCreditoSoli"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetaNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetaNotaCreditoSoli.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetaNotaCreditoSoli.setToolTipText("Nuevo DetaNotaCreditoSoli");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetaNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetaNotaCreditoSoli.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetaNotaCreditoSoli.setToolTipText("Sin Cerrar Ventana DetaNotaCreditoSoli");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetaNotaCreditoSoli = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetaNotaCreditoSoli.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetaNotaCreditoSoli.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetaNotaCreditoSoli.setText("Accion");
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetaNotaCreditoSoli = new JLabelMe();
		
		this.jLabelAccionesDetaNotaCreditoSoli.setText("Acciones");		
		this.jLabelAccionesDetaNotaCreditoSoli.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaNotaCreditoSoli.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetaNotaCreditoSoli.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetaNotaCreditoSoli();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetaNotaCreditoSoli();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetaNotaCreditoSoli=new JTabbedPane();
		this.jTabbedPaneRelacionesDetaNotaCreditoSoli.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetaNotaCreditoSoli,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetaNotaCreditoSoli = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetaNotaCreditoSoli = new GridBagLayout();
		
		this.jPanelCamposDetaNotaCreditoSoli.setLayout(gridaBagLayoutCamposDetaNotaCreditoSoli);
		this.jPanelCamposOcultosDetaNotaCreditoSoli.setLayout(gridaBagLayoutCamposOcultosDetaNotaCreditoSoli);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetaNotaCreditoSoli.add(jLabelIdDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetaNotaCreditoSoli.add(jLabelidDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetaNotaCreditoSoli.add(jLabelid_empresaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetaNotaCreditoSoli.add(jButtonid_empresaDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetaNotaCreditoSoli.add(jButtonid_empresaDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetaNotaCreditoSoli.add(jComboBoxid_empresaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetaNotaCreditoSoli.add(jLabelid_sucursalDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetaNotaCreditoSoli.add(jButtonid_sucursalDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetaNotaCreditoSoli.add(jButtonid_sucursalDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetaNotaCreditoSoli.add(jComboBoxid_sucursalDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetaNotaCreditoSoli.add(jLabelid_ejercicioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetaNotaCreditoSoli.add(jButtonid_ejercicioDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetaNotaCreditoSoli.add(jButtonid_ejercicioDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetaNotaCreditoSoli.add(jComboBoxid_ejercicioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetaNotaCreditoSoli.add(jLabelid_periodoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetaNotaCreditoSoli.add(jButtonid_periodoDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetaNotaCreditoSoli.add(jButtonid_periodoDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetaNotaCreditoSoli.add(jComboBoxid_periodoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetaNotaCreditoSoli.add(jLabelid_anioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetaNotaCreditoSoli.add(jButtonid_anioDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetaNotaCreditoSoli.add(jButtonid_anioDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetaNotaCreditoSoli.add(jComboBoxid_anioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetaNotaCreditoSoli.add(jLabelid_mesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetaNotaCreditoSoli.add(jButtonid_mesDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetaNotaCreditoSoli.add(jButtonid_mesDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetaNotaCreditoSoli.add(jComboBoxid_mesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_nota_credito_soliDetaNotaCreditoSoli.add(jLabelid_nota_credito_soliDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nota_credito_soliDetaNotaCreditoSoli.add(jButtonid_nota_credito_soliDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_nota_credito_soliDetaNotaCreditoSoli.add(jButtonid_nota_credito_soliDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_nota_credito_soliDetaNotaCreditoSoli.add(jComboBoxid_nota_credito_soliDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetaNotaCreditoSoli.add(jLabelid_bodegaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetaNotaCreditoSoli.add(jButtonid_bodegaDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetaNotaCreditoSoli.add(jButtonid_bodegaDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetaNotaCreditoSoli.add(jComboBoxid_bodegaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetaNotaCreditoSoli.add(jLabelid_productoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetaNotaCreditoSoli.add(jButtonid_productoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetaNotaCreditoSoli.add(jButtonid_productoDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 4;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetaNotaCreditoSoli.add(jButtonid_productoDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetaNotaCreditoSoli.add(jComboBoxid_productoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetaNotaCreditoSoli.add(jLabelid_unidadDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetaNotaCreditoSoli.add(jButtonid_unidadDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetaNotaCreditoSoli.add(jButtonid_unidadDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetaNotaCreditoSoli.add(jComboBoxid_unidadDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empaqueDetaNotaCreditoSoli.add(jLabelid_empaqueDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empaqueDetaNotaCreditoSoli.add(jButtonid_empaqueDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empaqueDetaNotaCreditoSoli.add(jButtonid_empaqueDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empaqueDetaNotaCreditoSoli.add(jComboBoxid_empaqueDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_devolucion_empresaDetaNotaCreditoSoli.add(jLabelid_tipo_devolucion_empresaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_devolucion_empresaDetaNotaCreditoSoli.add(jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_devolucion_empresaDetaNotaCreditoSoli.add(jButtonid_tipo_devolucion_empresaDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_devolucion_empresaDetaNotaCreditoSoli.add(jComboBoxid_tipo_devolucion_empresaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetaNotaCreditoSoli.add(jLabelid_centro_costoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetaNotaCreditoSoli.add(jButtonid_centro_costoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 3;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetaNotaCreditoSoli.add(jButtonid_centro_costoDetaNotaCreditoSoliArbol, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 4;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetaNotaCreditoSoli.add(jButtonid_centro_costoDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 5;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetaNotaCreditoSoli.add(jButtonid_centro_costoDetaNotaCreditoSoliUpdate, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetaNotaCreditoSoli.add(jComboBoxid_centro_costoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetaNotaCreditoSoli.add(jLabelcantidadDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetaNotaCreditoSoli.add(jButtoncantidadDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetaNotaCreditoSoli.add(jTextFieldcantidadDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetaNotaCreditoSoli.add(jLabelprecioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetaNotaCreditoSoli.add(jButtonprecioDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetaNotaCreditoSoli.add(jTextFieldprecioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_descuenDetaNotaCreditoSoli.add(jLabelporcen_descuenDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_descuenDetaNotaCreditoSoli.add(jButtonporcen_descuenDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_descuenDetaNotaCreditoSoli.add(jTextFieldporcen_descuenDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetaNotaCreditoSoli.add(jLabeldescuentoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetaNotaCreditoSoli.add(jButtondescuentoDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetaNotaCreditoSoli.add(jTextFielddescuentoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelimpuestoDetaNotaCreditoSoli.add(jLabelimpuestoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelimpuestoDetaNotaCreditoSoli.add(jButtonimpuestoDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelimpuestoDetaNotaCreditoSoli.add(jTextFieldimpuestoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_ivaDetaNotaCreditoSoli.add(jLabelporcen_ivaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_ivaDetaNotaCreditoSoli.add(jButtonporcen_ivaDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_ivaDetaNotaCreditoSoli.add(jTextFieldporcen_ivaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetaNotaCreditoSoli.add(jLabeltotalDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetaNotaCreditoSoli.add(jButtontotalDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetaNotaCreditoSoli.add(jTextFieldtotalDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetaNotaCreditoSoli.add(jLabeldescripcionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetaNotaCreditoSoli.add(jButtondescripcionDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetaNotaCreditoSoli.add(jscrollPanedescripcionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_loteDetaNotaCreditoSoli.add(jLabelcodigo_loteDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_loteDetaNotaCreditoSoli.add(jButtoncodigo_loteDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_loteDetaNotaCreditoSoli.add(jTextFieldcodigo_loteDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cajaDetaNotaCreditoSoli.add(jLabelnumero_cajaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cajaDetaNotaCreditoSoli.add(jButtonnumero_cajaDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cajaDetaNotaCreditoSoli.add(jTextFieldnumero_cajaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento2DetaNotaCreditoSoli.add(jLabeldescuento2DetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento2DetaNotaCreditoSoli.add(jButtondescuento2DetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento2DetaNotaCreditoSoli.add(jTextFielddescuento2DetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcostoDetaNotaCreditoSoli.add(jLabelcostoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelcostoDetaNotaCreditoSoli.add(jButtoncostoDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcostoDetaNotaCreditoSoli.add(jTextFieldcostoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelincluye_impuestoDetaNotaCreditoSoli.add(jLabelincluye_impuestoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelincluye_impuestoDetaNotaCreditoSoli.add(jButtonincluye_impuestoDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelincluye_impuestoDetaNotaCreditoSoli.add(jCheckBoxincluye_impuestoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcen_iceDetaNotaCreditoSoli.add(jLabelporcen_iceDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcen_iceDetaNotaCreditoSoli.add(jButtonporcen_iceDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcen_iceDetaNotaCreditoSoli.add(jTextFieldporcen_iceDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionDetaNotaCreditoSoli.add(jLabelfecha_emisionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		//this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 2;
		this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionDetaNotaCreditoSoli.add(jButtonfecha_emisionDetaNotaCreditoSoliBusqueda, this.gridBagConstraintsDetaNotaCreditoSoli);
	}

	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 1;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionDetaNotaCreditoSoli.add(jDateChooserfecha_emisionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelidDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelid_nota_credito_soliDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelid_bodegaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelid_productoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelid_unidadDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelid_empaqueDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelid_tipo_devolucion_empresaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelid_centro_costoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelcantidadDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelprecioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelporcen_descuenDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPaneldescuentoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelimpuestoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPanelporcen_ivaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPaneltotalDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetaNotaCreditoSoli.add(this.jPaneldescripcionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposDetaNotaCreditoSoli=0;
		iYPanelCamposDetaNotaCreditoSoli++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelid_empresaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelid_sucursalDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelid_ejercicioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelid_periodoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelid_anioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelid_mesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelcodigo_loteDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelnumero_cajaDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPaneldescuento2DetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelcostoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelincluye_impuestoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelporcen_iceDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
	}
	this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iYPanelCamposOcultosDetaNotaCreditoSoli;
	this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iXPanelCamposOcultosDetaNotaCreditoSoli++;
	this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetaNotaCreditoSoli.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetaNotaCreditoSoli.add(this.jPanelfecha_emisionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);



	if(iXPanelCamposOcultosDetaNotaCreditoSoli % 1==0) {
		iXPanelCamposOcultosDetaNotaCreditoSoli=0;
		iYPanelCamposOcultosDetaNotaCreditoSoli++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetaNotaCreditoSoli= new GridBagLayout();
		this.jPanelAccionesDetaNotaCreditoSoli.setLayout(gridaBagLayoutAccionesDetaNotaCreditoSoli);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetaNotaCreditoSoli= new GridBagLayout();
		this.jPanelAccionesFormularioDetaNotaCreditoSoli.setLayout(gridaBagLayoutAccionesFormularioDetaNotaCreditoSoli);
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetaNotaCreditoSoli.add(this.jComboBoxTiposAccionesFormularioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetaNotaCreditoSoli.add(this.jCheckBoxPostAccionNuevoDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detanotacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetaNotaCreditoSoli.add(this.jCheckBoxPostAccionSinCerrarDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detanotacreditosoliSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetaNotaCreditoSoli.add(this.jCheckBoxPostAccionSinMensajeDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetaNotaCreditoSoli.add(this.jButtonModificarDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);							

		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetaNotaCreditoSoli.add(this.jButtonEliminarDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
			
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetaNotaCreditoSoli.add(this.jButtonActualizarDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);


		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetaNotaCreditoSoli.add(this.jButtonGuardarCambiosDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);	
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = 0;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetaNotaCreditoSoli.add(this.jButtonCancelarDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetaNotaCreditoSoli = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetaNotaCreditoSoli);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detanotacreditosoliSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();						
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;		
			//this.gridBagConstraintsDetaNotaCreditoSoli.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetaNotaCreditoSoli.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx =0;
		this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetaNotaCreditoSoli.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetaNotaCreditoSoliJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetaNotaCreditoSoli = new DetaNotaCreditoSoliBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle  Solicitud Nota Credit DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle  Solicitud Nota Credit DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle  Solicitud Nota Credit Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetaNotaCreditoSoliModel detanotacreditosoliModel=new DetaNotaCreditoSoliModel(this);
			
			//SI USARA CLASE INTERNA
			//DetaNotaCreditoSoliModel.DetaNotaCreditoSoliFocusTraversalPolicy detanotacreditosoliFocusTraversalPolicy = detanotacreditosoliModel.new DetaNotaCreditoSoliFocusTraversalPolicy(this);
			
			//detanotacreditosoliFocusTraversalPolicy.setdetanotacreditosoliJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detanotacreditosoliModel);
			
			
			this.jContentPaneDetalleDetaNotaCreditoSoli = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetaNotaCreditoSoli = new GridBagLayout();	
			this.jContentPaneDetalleDetaNotaCreditoSoli.setLayout(gridaBagLayoutDetalleDetaNotaCreditoSoli);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetaNotaCreditoSoli = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
				this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
					
				
				this.jContentPaneDetalleDetaNotaCreditoSoli.add(jTtoolBarDetalleDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);								
				
}
			
			this.jScrollPanelDatosEdicionDetaNotaCreditoSoli=   new JScrollPane(jContentPaneDetalleDetaNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetaNotaCreditoSoli=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	        
			this.jContentPaneDetalleDetaNotaCreditoSoli.add(jPanelCamposDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);
			
			
			
			
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
						&& detanotacreditosoliSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detanotacreditosoliSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetaNotaCreditoSoli= new GridBagConstraints();
						this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
						this.jContentPaneDetalleDetaNotaCreditoSoli.add(this.jTabbedPaneRelacionesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetaNotaCreditoSoli.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetaNotaCreditoSoli.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
					this.gridBagConstraintsDetaNotaCreditoSoli.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
					
				
					this.jContentPaneDetalleDetaNotaCreditoSoli.add(jPanelCamposOcultosDetaNotaCreditoSoli, gridBagConstraintsDetaNotaCreditoSoli);
				
					this.jPanelCamposOcultosDetaNotaCreditoSoli.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	        this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetaNotaCreditoSoli.add(this.jPanelAccionesFormularioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);							
			
			
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
	        this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
	        
			
			this.jContentPaneDetalleDetaNotaCreditoSoli.add(this.jPanelAccionesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetaNotaCreditoSoli);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetaNotaCreditoSoli=   new JScrollPane(this.jPanelCamposDetaNotaCreditoSoli,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetaNotaCreditoSoli.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaNotaCreditoSoli.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetaNotaCreditoSoli.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
			this.gridBagConstraintsDetaNotaCreditoSoli.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetaNotaCreditoSoli.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetaNotaCreditoSoli.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);			
			
			this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
			this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
			
			
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		
			
		this.gridBagConstraintsDetaNotaCreditoSoli = new GridBagConstraints();
		this.gridBagConstraintsDetaNotaCreditoSoli.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetaNotaCreditoSoli.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetaNotaCreditoSoli, this.gridBagConstraintsDetaNotaCreditoSoli);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetaNotaCreditoSoli;//jContentPane;
		
		return jScrollPanelDatosEdicionDetaNotaCreditoSoli;
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
