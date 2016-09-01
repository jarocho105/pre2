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
import com.bydan.erp.facturacion.util.DetalleGuiaRemisionConstantesFunciones;

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
public class DetalleGuiaRemisionDetalleFormJInternalFrame extends DetalleGuiaRemisionBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleGuiaRemision;
	
	protected JMenuBar jmenuBarDetalleDetalleGuiaRemision;
	
	protected JMenu jmenuDetalleDetalleGuiaRemision;
	protected JMenu jmenuDetalleArchivoDetalleGuiaRemision;
	protected JMenu jmenuDetalleAccionesDetalleGuiaRemision;
	protected JMenu jmenuDetalleDatosDetalleGuiaRemision;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleGuiaRemision;	
	protected GridBagConstraints gridBagConstraintsDetalleGuiaRemision;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleGuiaRemisionBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleGuiaRemision;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_ejercicio="";

	protected PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periodo="";

	protected GuiaRemisionBeanSwingJInternalFrame guiaremisionBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_guiaremision="";

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetalleGuiaRemisionSessionBean detalleguiaremisionSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public GuiaRemisionSessionBean guiaremisionSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;	
	
	public DetalleGuiaRemisionLogic detalleguiaremisionLogic;
	
	public JScrollPane jScrollPanelDatosDetalleGuiaRemision;
	public JScrollPane jScrollPanelDatosEdicionDetalleGuiaRemision;
	public JScrollPane jScrollPanelDatosGeneralDetalleGuiaRemision;
	
	protected JPanel jPanelCamposDetalleGuiaRemision;    
	protected JPanel jPanelCamposOcultosDetalleGuiaRemision;    	
	protected JPanel jPanelAccionesDetalleGuiaRemision;
	protected JPanel jPanelAccionesFormularioDetalleGuiaRemision;
    
	
	
	protected Integer iXPanelCamposDetalleGuiaRemision=0;
	protected Integer iYPanelCamposDetalleGuiaRemision=0;
	
	protected Integer iXPanelCamposOcultosDetalleGuiaRemision=0;
	protected Integer iYPanelCamposOcultosDetalleGuiaRemision=0;
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleGuiaRemision;
	protected Integer iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
	protected Integer iYPanelCamposIniciogeneralDetalleGuiaRemision=0;

	protected JPanel jPanelCamposIniciovaloresDetalleGuiaRemision;
	protected Integer iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
	protected Integer iYPanelCamposIniciovaloresDetalleGuiaRemision=0;

	protected JPanel jPanelCamposInicioextraDetalleGuiaRemision;
	protected Integer iXPanelCamposInicioextraDetalleGuiaRemision=0;
	protected Integer iYPanelCamposInicioextraDetalleGuiaRemision=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleGuiaRemision;
	public JButton jButtonModificarDetalleGuiaRemision;
	public JButton jButtonActualizarDetalleGuiaRemision;
    public JButton jButtonEliminarDetalleGuiaRemision;
	public JButton jButtonCancelarDetalleGuiaRemision;
    public JButton jButtonGuardarCambiosDetalleGuiaRemision;
	public JButton jButtonGuardarCambiosTablaDetalleGuiaRemision;
	protected JButton jButtonCerrarDetalleGuiaRemision;
	
	
	protected JButton jButtonProcesarInformacionDetalleGuiaRemision;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleGuiaRemision;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleGuiaRemision;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleGuiaRemision;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleGuiaRemision;
	protected JButton jButtonModificarToolBarDetalleGuiaRemision;
	protected JButton jButtonActualizarToolBarDetalleGuiaRemision;
    protected JButton jButtonEliminarToolBarDetalleGuiaRemision;
	protected JButton jButtonCancelarToolBarDetalleGuiaRemision;
    protected JButton jButtonGuardarCambiosToolBarDetalleGuiaRemision;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleGuiaRemision;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleGuiaRemision;
	protected JButton jButtonCerrarToolBarDetalleGuiaRemision;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleGuiaRemision;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleGuiaRemision;
	protected JMenuItem jMenuItemModificarDetalleGuiaRemision;
	protected JMenuItem jMenuItemActualizarDetalleGuiaRemision;
    protected JMenuItem jMenuItemEliminarDetalleGuiaRemision;
	protected JMenuItem jMenuItemCancelarDetalleGuiaRemision;
    protected JMenuItem jMenuItemGuardarCambiosDetalleGuiaRemision;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleGuiaRemision;
	protected JMenuItem jMenuItemCerrarDetalleGuiaRemision;
	protected JMenuItem jMenuItemDetalleCerrarDetalleGuiaRemision;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleGuiaRemision;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleGuiaRemision;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleGuiaRemision;
	protected JMenuItem jMenuItemMostrarOcultarDetalleGuiaRemision;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleGuiaRemision;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleGuiaRemision;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleGuiaRemision;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleGuiaRemision;
	public JLabel jLabelIdDetalleGuiaRemision;
	public JLabel jLabelidDetalleGuiaRemision;
	public JButton jButtonidDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_envasesDetalleGuiaRemision;
	public JLabel jLabelcantidad_envasesDetalleGuiaRemision;
	public JTextField jTextFieldcantidad_envasesDetalleGuiaRemision;
	public JButton jButtoncantidad_envasesDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_auxiliarDetalleGuiaRemision;
	public JLabel jLabelcantidad_auxiliarDetalleGuiaRemision;
	public JTextField jTextFieldcantidad_auxiliarDetalleGuiaRemision;
	public JButton jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleGuiaRemision;
	public JLabel jLabeldescripcionDetalleGuiaRemision;
	public JTextArea jTextAreadescripcionDetalleGuiaRemision;
	public JScrollPane jscrollPanedescripcionDetalleGuiaRemision;
	public JButton jButtondescripcionDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleGuiaRemision;
	public JLabel jLabelcantidadDetalleGuiaRemision;
	public JTextField jTextFieldcantidadDetalleGuiaRemision;
	public JButton jButtoncantidadDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelmontoDetalleGuiaRemision;
	public JLabel jLabelmontoDetalleGuiaRemision;
	public JTextField jTextFieldmontoDetalleGuiaRemision;
	public JButton jButtonmontoDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelprecioDetalleGuiaRemision;
	public JLabel jLabelprecioDetalleGuiaRemision;
	public JTextField jTextFieldprecioDetalleGuiaRemision;
	public JButton jButtonprecioDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_descuentoDetalleGuiaRemision;
	public JLabel jLabelporcentaje_descuentoDetalleGuiaRemision;
	public JTextField jTextFieldporcentaje_descuentoDetalleGuiaRemision;
	public JButton jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetalleGuiaRemision;
	public JLabel jLabeldescuentoDetalleGuiaRemision;
	public JTextField jTextFielddescuentoDetalleGuiaRemision;
	public JButton jButtondescuentoDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneldescuento2DetalleGuiaRemision;
	public JLabel jLabeldescuento2DetalleGuiaRemision;
	public JTextField jTextFielddescuento2DetalleGuiaRemision;
	public JButton jButtondescuento2DetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneldescuento3DetalleGuiaRemision;
	public JLabel jLabeldescuento3DetalleGuiaRemision;
	public JTextField jTextFielddescuento3DetalleGuiaRemision;
	public JButton jButtondescuento3DetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelporcentaje_ivaDetalleGuiaRemision;
	public JLabel jLabelporcentaje_ivaDetalleGuiaRemision;
	public JTextField jTextFieldporcentaje_ivaDetalleGuiaRemision;
	public JButton jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelivaDetalleGuiaRemision;
	public JLabel jLabelivaDetalleGuiaRemision;
	public JTextField jTextFieldivaDetalleGuiaRemision;
	public JButton jButtonivaDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneltotal_descuentoDetalleGuiaRemision;
	public JLabel jLabeltotal_descuentoDetalleGuiaRemision;
	public JTextField jTextFieldtotal_descuentoDetalleGuiaRemision;
	public JButton jButtontotal_descuentoDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneltotal_impuestoDetalleGuiaRemision;
	public JLabel jLabeltotal_impuestoDetalleGuiaRemision;
	public JTextField jTextFieldtotal_impuestoDetalleGuiaRemision;
	public JButton jButtontotal_impuestoDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalDetalleGuiaRemision;
	public JLabel jLabelsub_totalDetalleGuiaRemision;
	public JTextField jTextFieldsub_totalDetalleGuiaRemision;
	public JButton jButtonsub_totalDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPaneltotalDetalleGuiaRemision;
	public JLabel jLabeltotalDetalleGuiaRemision;
	public JTextField jTextFieldtotalDetalleGuiaRemision;
	public JButton jButtontotalDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelloteDetalleGuiaRemision;
	public JLabel jLabelloteDetalleGuiaRemision;
	public JTextField jTextFieldloteDetalleGuiaRemision;
	public JButton jButtonloteDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanellote_clienteDetalleGuiaRemision;
	public JLabel jLabellote_clienteDetalleGuiaRemision;
	public JTextField jTextFieldlote_clienteDetalleGuiaRemision;
	public JButton jButtonlote_clienteDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelorden_compraDetalleGuiaRemision;
	public JLabel jLabelorden_compraDetalleGuiaRemision;
	public JTextField jTextFieldorden_compraDetalleGuiaRemision;
	public JButton jButtonorden_compraDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelareaDetalleGuiaRemision;
	public JLabel jLabelareaDetalleGuiaRemision;
	public JTextField jTextFieldareaDetalleGuiaRemision;
	public JButton jButtonareaDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelmedidasDetalleGuiaRemision;
	public JLabel jLabelmedidasDetalleGuiaRemision;
	public JTextField jTextFieldmedidasDetalleGuiaRemision;
	public JButton jButtonmedidasDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelacabadoDetalleGuiaRemision;
	public JLabel jLabelacabadoDetalleGuiaRemision;
	public JTextField jTextFieldacabadoDetalleGuiaRemision;
	public JButton jButtonacabadoDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelacabado2DetalleGuiaRemision;
	public JLabel jLabelacabado2DetalleGuiaRemision;
	public JTextField jTextFieldacabado2DetalleGuiaRemision;
	public JButton jButtonacabado2DetalleGuiaRemisionBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleGuiaRemision;
	public JLabel jLabelid_empresaDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleGuiaRemision;
	public JButton jButtonid_empresaDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_empresaDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleGuiaRemision;
	public JLabel jLabelid_sucursalDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleGuiaRemision;
	public JButton jButtonid_sucursalDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_sucursalDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleGuiaRemision;
	public JLabel jLabelid_ejercicioDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleGuiaRemision;
	public JButton jButtonid_ejercicioDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleGuiaRemision;
	public JLabel jLabelid_periodoDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleGuiaRemision;
	public JButton jButtonid_periodoDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_periodoDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_guia_remisionDetalleGuiaRemision;
	public JLabel jLabelid_guia_remisionDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_guia_remisionDetalleGuiaRemision;
	public JButton jButtonid_guia_remisionDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_guia_remisionDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_guia_remisionDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleGuiaRemision;
	public JLabel jLabelid_bodegaDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleGuiaRemision;
	public JButton jButtonid_bodegaDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_bodegaDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleGuiaRemision;
	public JLabel jLabelid_productoDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleGuiaRemision;
	public JButton jButtonid_productoDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_productoDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleGuiaRemision;
	public JLabel jLabelid_unidadDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleGuiaRemision;
	public JButton jButtonid_unidadDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_unidadDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleGuiaRemisionBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleGuiaRemision;
	public JLabel jLabelid_centro_costoDetalleGuiaRemision;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleGuiaRemision;
	public JButton jButtonid_centro_costoDetalleGuiaRemision= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleGuiaRemisionUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleGuiaRemisionBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleGuiaRemisionArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleGuiaRemision;
	
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
	public int iHeightFormulario=2090;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleGuiaRemisionDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleGuiaRemision=new JPanel();
				this.jPanelAccionesFormularioDetalleGuiaRemision=new JPanel();
				this.jmenuBarDetalleDetalleGuiaRemision=new JMenuBar();
				this.jTtoolBarDetalleDetalleGuiaRemision=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGuiaRemisionDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleGuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleGuiaRemisionDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleGuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGuiaRemisionDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleGuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGuiaRemisionDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleGuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleGuiaRemisionDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleGuiaRemision No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleGuiaRemision() {
		return this.jButtonActualizarToolBarDetalleGuiaRemision;
	}
	
	public JButton getjButtonEliminarToolBarDetalleGuiaRemision() {
		return this.jButtonEliminarToolBarDetalleGuiaRemision;
	}
	
	public JButton getjButtonCancelarToolBarDetalleGuiaRemision() {
		return this.jButtonCancelarToolBarDetalleGuiaRemision;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleGuiaRemision() {
		return this.jButtonProcesarInformacionDetalleGuiaRemision;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleGuiaRemision)	{
		this.jButtonProcesarInformacionDetalleGuiaRemision = jButtonProcesarInformacionDetalleGuiaRemision;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleGuiaRemision() {
		return this.jComboBoxTiposAccionesDetalleGuiaRemision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleGuiaRemision(
			JComboBox jComboBoxTiposRelacionesDetalleGuiaRemision) {
		this.jComboBoxTiposRelacionesDetalleGuiaRemision = jComboBoxTiposRelacionesDetalleGuiaRemision;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleGuiaRemision(
			JComboBox jComboBoxTiposAccionesDetalleGuiaRemision) {
		this.jComboBoxTiposAccionesDetalleGuiaRemision = jComboBoxTiposAccionesDetalleGuiaRemision;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleGuiaRemision() {
		return this.jComboBoxTiposAccionesFormularioDetalleGuiaRemision;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleGuiaRemision(
			JComboBox jComboBoxTiposAccionesFormularioDetalleGuiaRemision) {
		this.jComboBoxTiposAccionesFormularioDetalleGuiaRemision = jComboBoxTiposAccionesFormularioDetalleGuiaRemision;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalleguiaremisionSessionBean=new DetalleGuiaRemisionSessionBean();
		
		this.detalleguiaremisionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleguiaremisionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalleguiaremisionSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleGuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleGuiaRemisionJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleGuiaRemisionJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Guia Remision MANTENIMIENTO"));
		
		
		if(iWidth > 3050) {
			iWidth=3050;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleGuiaRemisionJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleGuiaRemision= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleGuiaRemision=new JButtonMe();
				this.jButtonModificarToolBarDetalleGuiaRemision=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleGuiaRemision,this.jTtoolBarDetalleDetalleGuiaRemision,
							"actualizar","actualizar","Actualizar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleGuiaRemision,this.jTtoolBarDetalleDetalleGuiaRemision,
							"eliminar","eliminar","Eliminar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleGuiaRemision,this.jTtoolBarDetalleDetalleGuiaRemision,
							"cancelar","cancelar","Cancelar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleGuiaRemision=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleGuiaRemision,this.jTtoolBarDetalleDetalleGuiaRemision,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleGuiaRemision=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleGuiaRemision=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleGuiaRemision=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleGuiaRemision=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleGuiaRemision=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleGuiaRemision= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleGuiaRemision.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleGuiaRemision,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleGuiaRemision= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleGuiaRemision.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleGuiaRemision,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleGuiaRemision= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleGuiaRemision.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleGuiaRemision,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleGuiaRemision= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleGuiaRemision.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleGuiaRemision,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleGuiaRemision= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleGuiaRemision.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleGuiaRemision,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleGuiaRemision= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleGuiaRemision.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleGuiaRemision,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleGuiaRemision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleGuiaRemision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleGuiaRemision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleGuiaRemision= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleGuiaRemision.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleGuiaRemision,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleGuiaRemision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleGuiaRemision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleGuiaRemision,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleGuiaRemision= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleGuiaRemision.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleGuiaRemision,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleGuiaRemision.add(this.jMenuItemDetalleCerrarDetalleGuiaRemision);
		
		this.jmenuDetalleAccionesDetalleGuiaRemision.add(this.jMenuItemActualizarDetalleGuiaRemision);
		this.jmenuDetalleAccionesDetalleGuiaRemision.add(this.jMenuItemEliminarDetalleGuiaRemision);
		this.jmenuDetalleAccionesDetalleGuiaRemision.add(this.jMenuItemCancelarDetalleGuiaRemision);		
		
		//this.jmenuDetalleDatosDetalleGuiaRemision.add(this.jMenuItemDetalleAbrirOrderByDetalleGuiaRemision);				
		this.jmenuDetalleDatosDetalleGuiaRemision.add(this.jMenuItemDetalleMostarOcultarDetalleGuiaRemision);				
				
		//this.jmenuDetalleAccionesDetalleGuiaRemision.add(this.jMenuItemGuardarCambiosDetalleGuiaRemision);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleGuiaRemision.add(this.jmenuDetalleArchivoDetalleGuiaRemision);		
		this.jmenuBarDetalleDetalleGuiaRemision.add(this.jmenuDetalleAccionesDetalleGuiaRemision);		
		this.jmenuBarDetalleDetalleGuiaRemision.add(this.jmenuDetalleDatosDetalleGuiaRemision);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleGuiaRemision);				
	}
	
	
	public void inicializarElementosCamposDetalleGuiaRemision() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleGuiaRemision = new JLabelMe();
		jLabelIdDetalleGuiaRemision.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleGuiaRemision = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleGuiaRemision= new GridBagLayout();

		this.jPanelidDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);

		jLabelidDetalleGuiaRemision = new JLabel();
		jLabelidDetalleGuiaRemision.setText("Id");

		jLabelidDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidad_envasesDetalleGuiaRemision = new JLabelMe();
		this.jLabelcantidad_envasesDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_CANTIDADENVASES+" : *");
		this.jLabelcantidad_envasesDetalleGuiaRemision.setToolTipText("Cantidad Envases");
		this.jLabelcantidad_envasesDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_envasesDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_envasesDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_envasesDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_envasesDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_envasesDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_CANTIDADENVASES);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelcantidad_envasesDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldcantidad_envasesDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldcantidad_envasesDetalleGuiaRemision.setEnabled(false);
		jTextFieldcantidad_envasesDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_envasesDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_envasesDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_envasesDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_envasesDetalleGuiaRemision.setText("0");

		this.jButtoncantidad_envasesDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtoncantidad_envasesDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_envasesDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_envasesDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_envasesDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtoncantidad_envasesDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_envasesDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_envasesDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_envasesDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_envasesDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_envasesDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_envasesDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_auxiliarDetalleGuiaRemision = new JLabelMe();
		this.jLabelcantidad_auxiliarDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_CANTIDADAUXILIAR+" : *");
		this.jLabelcantidad_auxiliarDetalleGuiaRemision.setToolTipText("Cantidad Auxiliar");
		this.jLabelcantidad_auxiliarDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_auxiliarDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_auxiliarDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_auxiliarDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_auxiliarDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_auxiliarDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_CANTIDADAUXILIAR);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelcantidad_auxiliarDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldcantidad_auxiliarDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldcantidad_auxiliarDetalleGuiaRemision.setEnabled(false);
		jTextFieldcantidad_auxiliarDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_auxiliarDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_auxiliarDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_auxiliarDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_auxiliarDetalleGuiaRemision.setText("0");

		this.jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_auxiliarDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_auxiliarDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_auxiliarDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleGuiaRemision = new JLabelMe();
		this.jLabeldescripcionDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleGuiaRemision.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPaneldescripcionDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextAreadescripcionDetalleGuiaRemision= new JTextAreaMe();
		jTextAreadescripcionDetalleGuiaRemision.setEnabled(false);
		jTextAreadescripcionDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleGuiaRemision.setLineWrap(true);
		jTextAreadescripcionDetalleGuiaRemision.setWrapStyleWord(true);
		jTextAreadescripcionDetalleGuiaRemision.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleGuiaRemision.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleGuiaRemision = new JScrollPane(jTextAreadescripcionDetalleGuiaRemision);
		jscrollPanedescripcionDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtondescripcionDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleGuiaRemision = new JLabelMe();
		this.jLabelcantidadDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleGuiaRemision.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelcantidadDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldcantidadDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldcantidadDetalleGuiaRemision.setEnabled(false);
		jTextFieldcantidadDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleGuiaRemision.setText("0");

		this.jButtoncantidadDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtoncantidadDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelmontoDetalleGuiaRemision = new JLabelMe();
		this.jLabelmontoDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_MONTO+" : *");
		this.jLabelmontoDetalleGuiaRemision.setToolTipText("Monto");
		this.jLabelmontoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmontoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmontoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmontoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmontoDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_MONTO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelmontoDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldmontoDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldmontoDetalleGuiaRemision.setEnabled(false);
		jTextFieldmontoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmontoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmontoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldmontoDetalleGuiaRemision.setText("0.0");

		this.jButtonmontoDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonmontoDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmontoDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmontoDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonmontoDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmontoDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmontoDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmontoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmontoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"montoDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmontoDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelprecioDetalleGuiaRemision = new JLabelMe();
		this.jLabelprecioDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_PRECIO+" : *");
		this.jLabelprecioDetalleGuiaRemision.setToolTipText("Precio");
		this.jLabelprecioDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprecioDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprecioDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprecioDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprecioDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_PRECIO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelprecioDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldprecioDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldprecioDetalleGuiaRemision.setEnabled(false);
		jTextFieldprecioDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldprecioDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldprecioDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldprecioDetalleGuiaRemision.setText("0.0");

		this.jButtonprecioDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonprecioDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprecioDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprecioDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonprecioDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprecioDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprecioDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldprecioDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldprecioDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"precioDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprecioDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_descuentoDetalleGuiaRemision = new JLabelMe();
		this.jLabelporcentaje_descuentoDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_PORCENTAJEDESCUENTO+" : *");
		this.jLabelporcentaje_descuentoDetalleGuiaRemision.setToolTipText("% Descuento");
		this.jLabelporcentaje_descuentoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_descuentoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_descuentoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_descuentoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_descuentoDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_PORCENTAJEDESCUENTO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelporcentaje_descuentoDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldporcentaje_descuentoDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldporcentaje_descuentoDetalleGuiaRemision.setEnabled(false);
		jTextFieldporcentaje_descuentoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_descuentoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_descuentoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_descuentoDetalleGuiaRemision.setText("0.0");

		this.jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_descuentoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_descuentoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_descuentoDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetalleGuiaRemision = new JLabelMe();
		this.jLabeldescuentoDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetalleGuiaRemision.setToolTipText("Descuento");
		this.jLabeldescuentoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPaneldescuentoDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFielddescuentoDetalleGuiaRemision= new JTextFieldMe();
		jTextFielddescuentoDetalleGuiaRemision.setEnabled(false);
		jTextFielddescuentoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetalleGuiaRemision.setText("0.0");

		this.jButtondescuentoDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtondescuentoDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtondescuentoDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeldescuento2DetalleGuiaRemision = new JLabelMe();
		this.jLabeldescuento2DetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_DESCUENTO2+" : *");
		this.jLabeldescuento2DetalleGuiaRemision.setToolTipText("Descuento 2");
		this.jLabeldescuento2DetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento2DetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento2DetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento2DetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento2DetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_DESCUENTO2);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPaneldescuento2DetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFielddescuento2DetalleGuiaRemision= new JTextFieldMe();
		jTextFielddescuento2DetalleGuiaRemision.setEnabled(false);
		jTextFielddescuento2DetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento2DetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento2DetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento2DetalleGuiaRemision.setText("0.0");

		this.jButtondescuento2DetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtondescuento2DetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento2DetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento2DetalleGuiaRemisionBusqueda.setText("U");
		this.jButtondescuento2DetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento2DetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento2DetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento2DetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento2DetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento2DetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento2DetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeldescuento3DetalleGuiaRemision = new JLabelMe();
		this.jLabeldescuento3DetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_DESCUENTO3+" : *");
		this.jLabeldescuento3DetalleGuiaRemision.setToolTipText("Descuento 3");
		this.jLabeldescuento3DetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento3DetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuento3DetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento3DetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento3DetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento3DetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_DESCUENTO3);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPaneldescuento3DetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFielddescuento3DetalleGuiaRemision= new JTextFieldMe();
		jTextFielddescuento3DetalleGuiaRemision.setEnabled(false);
		jTextFielddescuento3DetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento3DetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento3DetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento3DetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento3DetalleGuiaRemision.setText("0.0");

		this.jButtondescuento3DetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtondescuento3DetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento3DetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento3DetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento3DetalleGuiaRemisionBusqueda.setText("U");
		this.jButtondescuento3DetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento3DetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento3DetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento3DetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento3DetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento3DetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento3DetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelporcentaje_ivaDetalleGuiaRemision = new JLabelMe();
		this.jLabelporcentaje_ivaDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_PORCENTAJEIVA+" : *");
		this.jLabelporcentaje_ivaDetalleGuiaRemision.setToolTipText("% Iva");
		this.jLabelporcentaje_ivaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_ivaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelporcentaje_ivaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelporcentaje_ivaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelporcentaje_ivaDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelporcentaje_ivaDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_PORCENTAJEIVA);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelporcentaje_ivaDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldporcentaje_ivaDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldporcentaje_ivaDetalleGuiaRemision.setEnabled(false);
		jTextFieldporcentaje_ivaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ivaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldporcentaje_ivaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldporcentaje_ivaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldporcentaje_ivaDetalleGuiaRemision.setText("0.0");

		this.jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldporcentaje_ivaDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldporcentaje_ivaDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"porcentaje_ivaDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelivaDetalleGuiaRemision = new JLabelMe();
		this.jLabelivaDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaDetalleGuiaRemision.setToolTipText("Iva");
		this.jLabelivaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelivaDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldivaDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldivaDetalleGuiaRemision.setEnabled(false);
		jTextFieldivaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaDetalleGuiaRemision.setText("0.0");

		this.jButtonivaDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonivaDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonivaDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeltotal_descuentoDetalleGuiaRemision = new JLabelMe();
		this.jLabeltotal_descuentoDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_TOTALDESCUENTO+" : *");
		this.jLabeltotal_descuentoDetalleGuiaRemision.setToolTipText("Total Descuento");
		this.jLabeltotal_descuentoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeltotal_descuentoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_descuentoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_descuentoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_descuentoDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_TOTALDESCUENTO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPaneltotal_descuentoDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldtotal_descuentoDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldtotal_descuentoDetalleGuiaRemision.setEnabled(false);
		jTextFieldtotal_descuentoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_descuentoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_descuentoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_descuentoDetalleGuiaRemision.setText("0.0");

		this.jButtontotal_descuentoDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtontotal_descuentoDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_descuentoDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_descuentoDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtontotal_descuentoDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_descuentoDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_descuentoDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_descuentoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_descuentoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_descuentoDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_descuentoDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeltotal_impuestoDetalleGuiaRemision = new JLabelMe();
		this.jLabeltotal_impuestoDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_TOTALIMPUESTO+" : *");
		this.jLabeltotal_impuestoDetalleGuiaRemision.setToolTipText("Total Impuesto");
		this.jLabeltotal_impuestoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_impuestoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotal_impuestoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotal_impuestoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotal_impuestoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotal_impuestoDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_TOTALIMPUESTO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPaneltotal_impuestoDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldtotal_impuestoDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldtotal_impuestoDetalleGuiaRemision.setEnabled(false);
		jTextFieldtotal_impuestoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_impuestoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotal_impuestoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotal_impuestoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotal_impuestoDetalleGuiaRemision.setText("0.0");

		this.jButtontotal_impuestoDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtontotal_impuestoDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_impuestoDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotal_impuestoDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotal_impuestoDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtontotal_impuestoDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotal_impuestoDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotal_impuestoDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotal_impuestoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotal_impuestoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"total_impuestoDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotal_impuestoDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalDetalleGuiaRemision = new JLabelMe();
		this.jLabelsub_totalDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalDetalleGuiaRemision.setToolTipText("Sub Total");
		this.jLabelsub_totalDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelsub_totalDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldsub_totalDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldsub_totalDetalleGuiaRemision.setEnabled(false);
		jTextFieldsub_totalDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalDetalleGuiaRemision.setText("0.0");

		this.jButtonsub_totalDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonsub_totalDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonsub_totalDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabeltotalDetalleGuiaRemision = new JLabelMe();
		this.jLabeltotalDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalDetalleGuiaRemision.setToolTipText("Total");
		this.jLabeltotalDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPaneltotalDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldtotalDetalleGuiaRemision= new JTextFieldMe();
		jTextFieldtotalDetalleGuiaRemision.setEnabled(false);
		jTextFieldtotalDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalDetalleGuiaRemision.setText("0.0");

		this.jButtontotalDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtontotalDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtontotalDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelloteDetalleGuiaRemision = new JLabelMe();
		this.jLabelloteDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_LOTE+" :");
		this.jLabelloteDetalleGuiaRemision.setToolTipText("Lote");
		this.jLabelloteDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelloteDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldloteDetalleGuiaRemision= new JTextFieldMe();

		jTextFieldloteDetalleGuiaRemision.setEnabled(false);
		jTextFieldloteDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonloteDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonloteDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabellote_clienteDetalleGuiaRemision = new JLabelMe();
		this.jLabellote_clienteDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_LOTECLIENTE+" :");
		this.jLabellote_clienteDetalleGuiaRemision.setToolTipText("Lote Cliente");
		this.jLabellote_clienteDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellote_clienteDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellote_clienteDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellote_clienteDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_LOTECLIENTE);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanellote_clienteDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldlote_clienteDetalleGuiaRemision= new JTextFieldMe();

		jTextFieldlote_clienteDetalleGuiaRemision.setEnabled(false);
		jTextFieldlote_clienteDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlote_clienteDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlote_clienteDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonlote_clienteDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlote_clienteDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonlote_clienteDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlote_clienteDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlote_clienteDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlote_clienteDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlote_clienteDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lote_clienteDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlote_clienteDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelorden_compraDetalleGuiaRemision = new JLabelMe();
		this.jLabelorden_compraDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_ORDENCOMPRA+" :");
		this.jLabelorden_compraDetalleGuiaRemision.setToolTipText("Orden Compra");
		this.jLabelorden_compraDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorden_compraDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelorden_compraDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelorden_compraDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelorden_compraDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelorden_compraDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_ORDENCOMPRA);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelorden_compraDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldorden_compraDetalleGuiaRemision= new JTextFieldMe();

		jTextFieldorden_compraDetalleGuiaRemision.setEnabled(false);
		jTextFieldorden_compraDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_compraDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldorden_compraDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldorden_compraDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonorden_compraDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonorden_compraDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorden_compraDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonorden_compraDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonorden_compraDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonorden_compraDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonorden_compraDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonorden_compraDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldorden_compraDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldorden_compraDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"orden_compraDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonorden_compraDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelareaDetalleGuiaRemision = new JLabelMe();
		this.jLabelareaDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_AREA+" :");
		this.jLabelareaDetalleGuiaRemision.setToolTipText("Area");
		this.jLabelareaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelareaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelareaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelareaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelareaDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelareaDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_AREA);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelareaDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldareaDetalleGuiaRemision= new JTextFieldMe();

		jTextFieldareaDetalleGuiaRemision.setEnabled(false);
		jTextFieldareaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldareaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldareaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldareaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonareaDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonareaDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonareaDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonareaDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonareaDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonareaDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonareaDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonareaDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldareaDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldareaDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"areaDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonareaDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelmedidasDetalleGuiaRemision = new JLabelMe();
		this.jLabelmedidasDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_MEDIDAS+" :");
		this.jLabelmedidasDetalleGuiaRemision.setToolTipText("Medidas");
		this.jLabelmedidasDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmedidasDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelmedidasDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelmedidasDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmedidasDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmedidasDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_MEDIDAS);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelmedidasDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldmedidasDetalleGuiaRemision= new JTextFieldMe();

		jTextFieldmedidasDetalleGuiaRemision.setEnabled(false);
		jTextFieldmedidasDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmedidasDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldmedidasDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldmedidasDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonmedidasDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonmedidasDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmedidasDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmedidasDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmedidasDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonmedidasDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmedidasDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmedidasDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldmedidasDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldmedidasDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"medidasDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmedidasDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelacabadoDetalleGuiaRemision = new JLabelMe();
		this.jLabelacabadoDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_ACABADO+" :");
		this.jLabelacabadoDetalleGuiaRemision.setToolTipText("Acabado");
		this.jLabelacabadoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacabadoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacabadoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelacabadoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelacabadoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelacabadoDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_ACABADO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelacabadoDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldacabadoDetalleGuiaRemision= new JTextFieldMe();

		jTextFieldacabadoDetalleGuiaRemision.setEnabled(false);
		jTextFieldacabadoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacabadoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacabadoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldacabadoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonacabadoDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonacabadoDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacabadoDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacabadoDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonacabadoDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonacabadoDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonacabadoDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonacabadoDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldacabadoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldacabadoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"acabadoDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonacabadoDetalleGuiaRemisionBusqueda.setVisible(false);		}


					
		this.jLabelacabado2DetalleGuiaRemision = new JLabelMe();
		this.jLabelacabado2DetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_ACABADO2+" :");
		this.jLabelacabado2DetalleGuiaRemision.setToolTipText("Acabado 2");
		this.jLabelacabado2DetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacabado2DetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelacabado2DetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelacabado2DetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelacabado2DetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelacabado2DetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_ACABADO2);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelacabado2DetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jTextFieldacabado2DetalleGuiaRemision= new JTextFieldMe();

		jTextFieldacabado2DetalleGuiaRemision.setEnabled(false);
		jTextFieldacabado2DetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacabado2DetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldacabado2DetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldacabado2DetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonacabado2DetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonacabado2DetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacabado2DetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonacabado2DetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonacabado2DetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonacabado2DetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonacabado2DetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonacabado2DetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldacabado2DetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldacabado2DetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"acabado2DetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonacabado2DetalleGuiaRemisionBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleGuiaRemision() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleGuiaRemision = new JLabelMe();
		this.jLabelid_empresaDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleGuiaRemision.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelid_empresaDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jComboBoxid_empresaDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_empresaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleGuiaRemision.setEnabled(false);

		this.jButtonid_empresaDetalleGuiaRemision= new JButtonMe();
		this.jButtonid_empresaDetalleGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleGuiaRemision.setText("Buscar");
		this.jButtonid_empresaDetalleGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleGuiaRemision"));

		this.jButtonid_empresaDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonid_empresaDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleGuiaRemisionUpdate.setText("U");
		this.jButtonid_empresaDetalleGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleGuiaRemisionUpdate"));



					
		this.jLabelid_sucursalDetalleGuiaRemision = new JLabelMe();
		this.jLabelid_sucursalDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleGuiaRemision.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelid_sucursalDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jComboBoxid_sucursalDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_sucursalDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleGuiaRemision.setEnabled(false);

		this.jButtonid_sucursalDetalleGuiaRemision= new JButtonMe();
		this.jButtonid_sucursalDetalleGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleGuiaRemision.setText("Buscar");
		this.jButtonid_sucursalDetalleGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleGuiaRemision"));

		this.jButtonid_sucursalDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonid_sucursalDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleGuiaRemisionUpdate.setText("U");
		this.jButtonid_sucursalDetalleGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleGuiaRemisionUpdate"));



					
		this.jLabelid_ejercicioDetalleGuiaRemision = new JLabelMe();
		this.jLabelid_ejercicioDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleGuiaRemision.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelid_ejercicioDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jComboBoxid_ejercicioDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleGuiaRemision.setEnabled(false);

		this.jButtonid_ejercicioDetalleGuiaRemision= new JButtonMe();
		this.jButtonid_ejercicioDetalleGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleGuiaRemision.setText("Buscar");
		this.jButtonid_ejercicioDetalleGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleGuiaRemision"));

		this.jButtonid_ejercicioDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleGuiaRemisionUpdate.setText("U");
		this.jButtonid_ejercicioDetalleGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleGuiaRemisionUpdate"));



					
		this.jLabelid_periodoDetalleGuiaRemision = new JLabelMe();
		this.jLabelid_periodoDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleGuiaRemision.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelid_periodoDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jComboBoxid_periodoDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_periodoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleGuiaRemision.setEnabled(false);

		this.jButtonid_periodoDetalleGuiaRemision= new JButtonMe();
		this.jButtonid_periodoDetalleGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleGuiaRemision.setText("Buscar");
		this.jButtonid_periodoDetalleGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleGuiaRemision"));

		this.jButtonid_periodoDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonid_periodoDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleGuiaRemisionUpdate.setText("U");
		this.jButtonid_periodoDetalleGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleGuiaRemisionUpdate"));



					
		this.jLabelid_guia_remisionDetalleGuiaRemision = new JLabelMe();
		this.jLabelid_guia_remisionDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_IDGUIAREMISION+" : *");
		this.jLabelid_guia_remisionDetalleGuiaRemision.setToolTipText("Guia Remision");
		this.jLabelid_guia_remisionDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_guia_remisionDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_guia_remisionDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_guia_remisionDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_guia_remisionDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_guia_remisionDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_IDGUIAREMISION);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelid_guia_remisionDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jComboBoxid_guia_remisionDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_guia_remisionDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_guia_remisionDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_guia_remisionDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_guia_remisionDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_guia_remisionDetalleGuiaRemision= new JButtonMe();
		this.jButtonid_guia_remisionDetalleGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_guia_remisionDetalleGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_guia_remisionDetalleGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_guia_remisionDetalleGuiaRemision.setText("Buscar");
		this.jButtonid_guia_remisionDetalleGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_guia_remisionDetalleGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_guia_remisionDetalleGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_guia_remisionDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_guia_remisionDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_guia_remisionDetalleGuiaRemision"));

		this.jButtonid_guia_remisionDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_guia_remisionDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_guia_remisionDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_guia_remisionDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_guia_remisionDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonid_guia_remisionDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_guia_remisionDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_guia_remisionDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_guia_remisionDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_guia_remisionDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_guia_remisionDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_guia_remisionDetalleGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_guia_remisionDetalleGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_guia_remisionDetalleGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_guia_remisionDetalleGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_guia_remisionDetalleGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_guia_remisionDetalleGuiaRemisionUpdate.setText("U");
		this.jButtonid_guia_remisionDetalleGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_guia_remisionDetalleGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_guia_remisionDetalleGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_guia_remisionDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_guia_remisionDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_guia_remisionDetalleGuiaRemisionUpdate"));



					
		this.jLabelid_bodegaDetalleGuiaRemision = new JLabelMe();
		this.jLabelid_bodegaDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleGuiaRemision.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelid_bodegaDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jComboBoxid_bodegaDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_bodegaDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleGuiaRemision= new JButtonMe();
		this.jButtonid_bodegaDetalleGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleGuiaRemision.setText("Buscar");
		this.jButtonid_bodegaDetalleGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleGuiaRemision"));

		this.jButtonid_bodegaDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonid_bodegaDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleGuiaRemisionUpdate.setText("U");
		this.jButtonid_bodegaDetalleGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleGuiaRemisionUpdate"));



					
		this.jLabelid_productoDetalleGuiaRemision = new JLabelMe();
		this.jLabelid_productoDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleGuiaRemision.setToolTipText("Producto");
		this.jLabelid_productoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelid_productoDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jComboBoxid_productoDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_productoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleGuiaRemision= new JButtonMe();
		this.jButtonid_productoDetalleGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleGuiaRemision.setText("Buscar");
		this.jButtonid_productoDetalleGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleGuiaRemision"));

		this.jButtonid_productoDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonid_productoDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_productoDetalleGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleGuiaRemisionUpdate.setText("U");
		this.jButtonid_productoDetalleGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleGuiaRemisionUpdate"));



					
		this.jLabelid_unidadDetalleGuiaRemision = new JLabelMe();
		this.jLabelid_unidadDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleGuiaRemision.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelid_unidadDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jComboBoxid_unidadDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_unidadDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleGuiaRemision= new JButtonMe();
		this.jButtonid_unidadDetalleGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleGuiaRemision.setText("Buscar");
		this.jButtonid_unidadDetalleGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleGuiaRemision"));

		this.jButtonid_unidadDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonid_unidadDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleGuiaRemisionUpdate.setText("U");
		this.jButtonid_unidadDetalleGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleGuiaRemisionUpdate"));



					
		this.jLabelid_centro_costoDetalleGuiaRemision = new JLabelMe();
		this.jLabelid_centro_costoDetalleGuiaRemision.setText(""+DetalleGuiaRemisionConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetalleGuiaRemision.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-17),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleGuiaRemision=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleGuiaRemision.setToolTipText(DetalleGuiaRemisionConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		this.jPanelid_centro_costoDetalleGuiaRemision.setLayout(this.gridaBagLayoutDetalleGuiaRemision);


		jComboBoxid_centro_costoDetalleGuiaRemision= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetalleGuiaRemision= new JButtonMe();
		this.jButtonid_centro_costoDetalleGuiaRemision.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleGuiaRemision.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleGuiaRemision.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleGuiaRemision.setText("Buscar");
		this.jButtonid_centro_costoDetalleGuiaRemision.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleGuiaRemision.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleGuiaRemision,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleGuiaRemision"));

		this.jButtonid_centro_costoDetalleGuiaRemisionBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleGuiaRemisionBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleGuiaRemisionBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleGuiaRemisionBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleGuiaRemisionBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleGuiaRemisionBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleGuiaRemisionBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleGuiaRemisionBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleGuiaRemisionBusqueda"));

		if(this.detalleguiaremisionSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleGuiaRemisionBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleGuiaRemisionUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleGuiaRemisionUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleGuiaRemisionUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleGuiaRemisionUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleGuiaRemisionUpdate.setText("U");
		this.jButtonid_centro_costoDetalleGuiaRemisionUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleGuiaRemisionUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleGuiaRemisionUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleGuiaRemisionUpdate"));


		jButtonid_centro_costoDetalleGuiaRemisionArbol= new JButtonMe();
		jButtonid_centro_costoDetalleGuiaRemisionArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleGuiaRemisionArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleGuiaRemisionArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleGuiaRemisionArbol.setText("Arbol");
		jButtonid_centro_costoDetalleGuiaRemisionArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleGuiaRemisionArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleGuiaRemisionArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleGuiaRemision.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleGuiaRemision.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleGuiaRemisionArbol"));



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
		//this.jInternalFrameDetalleDetalleGuiaRemision = new DetalleGuiaRemisionBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Guia Remision DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleGuiaRemision= new GridBagLayout();
		

		
		String sToolTipDetalleGuiaRemision="";
		sToolTipDetalleGuiaRemision=DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleGuiaRemision+="(Facturacion.DetalleGuiaRemision)";
		}
		
		if(!this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleGuiaRemision+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleGuiaRemision = new JButtonMe();
		this.jButtonModificarDetalleGuiaRemision = new JButtonMe();
        this.jButtonActualizarDetalleGuiaRemision = new JButtonMe();
        this.jButtonEliminarDetalleGuiaRemision = new JButtonMe();
        this.jButtonCancelarDetalleGuiaRemision = new JButtonMe();
        this.jButtonGuardarCambiosDetalleGuiaRemision = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleGuiaRemision = new JButtonMe();
		this.jButtonCerrarDetalleGuiaRemision = new JButtonMe();
		
		this.jScrollPanelDatosDetalleGuiaRemision = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleGuiaRemision = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleGuiaRemision = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposInicioextraDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Guia Remision";
		
		if(!this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Guia Remisiones" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleGuiaRemision.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleGuiaRemision.setName("jPanelCamposDetalleGuiaRemision"); 

		this.jPanelCamposOcultosDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleGuiaRemision.setName("jPanelCamposOcultosDetalleGuiaRemision"); 

        this.jPanelAccionesDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleGuiaRemision.setToolTipText("Acciones");
        this.jPanelAccionesDetalleGuiaRemision.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleGuiaRemision.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleGuiaRemision.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleGuiaRemision.setName("jPanelCamposFingeneralDetalleGuiaRemision");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleGuiaRemision.setName("jPanelCamposFinvaloresDetalleGuiaRemision");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposInicioextraDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Extra"));
		this.jPanelCamposInicioextraDetalleGuiaRemision.setName("jPanelCamposFinextraDetalleGuiaRemision");
		FuncionesSwing.setBoldPanel(this.jPanelCamposInicioextraDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleGuiaRemision.setText("Nuevo");
		this.jButtonModificarDetalleGuiaRemision.setText("Editar");
        this.jButtonActualizarDetalleGuiaRemision.setText("Actualizar");
        this.jButtonEliminarDetalleGuiaRemision.setText("Eliminar");
        this.jButtonCancelarDetalleGuiaRemision.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleGuiaRemision.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleGuiaRemision.setText("Guardar");
		this.jButtonCerrarDetalleGuiaRemision.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleGuiaRemision,"nuevo_button","Nuevo",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleGuiaRemision,"modificar_button","Editar",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleGuiaRemision,"actualizar_button","Actualizar",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleGuiaRemision,"eliminar_button","Eliminar",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleGuiaRemision,"cancelar_button","Cancelar",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleGuiaRemision,"guardarcambios_button","Guardar",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleGuiaRemision,"guardarcambiostabla_button","Guardar",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleGuiaRemision,"cerrar_button","Salir",this.detalleguiaremisionSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleGuiaRemision.setToolTipText("Nuevo"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleGuiaRemision.setToolTipText("Editar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleGuiaRemision.setToolTipText("Actualizar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleGuiaRemision.setToolTipText("Eliminar)"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleGuiaRemision.setToolTipText("Cancelar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleGuiaRemision.setToolTipText("Guardar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleGuiaRemision.setToolTipText("Guardar"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleGuiaRemision.setToolTipText("Salir"+" "+DetalleGuiaRemisionConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleGuiaRemision";
		inputMap = this.jButtonNuevoDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleGuiaRemision.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleGuiaRemision"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleGuiaRemision";
		inputMap = this.jButtonActualizarDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleGuiaRemision"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleGuiaRemision";
		inputMap = this.jButtonEliminarDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleGuiaRemision"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleGuiaRemision";
		inputMap = this.jButtonCancelarDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleGuiaRemision"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleGuiaRemision";
		inputMap = this.jButtonCerrarDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleGuiaRemision"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleGuiaRemision";
		inputMap = this.jButtonGuardarCambiosTablaDetalleGuiaRemision.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleGuiaRemision.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleGuiaRemision"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleGuiaRemision.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleGuiaRemision.setToolTipText("Nuevo DetalleGuiaRemision");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleGuiaRemision.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleGuiaRemision.setToolTipText("Sin Cerrar Ventana DetalleGuiaRemision");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleGuiaRemision = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleGuiaRemision.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleGuiaRemision.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleGuiaRemision.setText("Accion");
		this.jComboBoxTiposAccionesDetalleGuiaRemision.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleGuiaRemision = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleGuiaRemision.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleGuiaRemision.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleGuiaRemision = new JLabelMe();
		
		this.jLabelAccionesDetalleGuiaRemision.setText("Acciones");		
		this.jLabelAccionesDetalleGuiaRemision.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleGuiaRemision.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleGuiaRemision.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleGuiaRemision();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleGuiaRemision();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleGuiaRemision=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleGuiaRemision.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleGuiaRemision,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleGuiaRemision.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleGuiaRemision.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleGuiaRemision.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleGuiaRemision.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleGuiaRemision.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleGuiaRemision.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleGuiaRemision, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleGuiaRemision = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleGuiaRemision = new GridBagLayout();
		
		this.jPanelCamposDetalleGuiaRemision.setLayout(gridaBagLayoutCamposDetalleGuiaRemision);
		this.jPanelCamposOcultosDetalleGuiaRemision.setLayout(gridaBagLayoutCamposOcultosDetalleGuiaRemision);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleGuiaRemision= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleGuiaRemision.setLayout(gridaBagLayoutCamposIniciogeneralDetalleGuiaRemision);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleGuiaRemision= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleGuiaRemision.setLayout(gridaBagLayoutCamposIniciovaloresDetalleGuiaRemision);

		GridBagLayout gridaBagLayoutCamposInicioextraDetalleGuiaRemision= new GridBagLayout();
		this.jPanelCamposInicioextraDetalleGuiaRemision.setLayout(gridaBagLayoutCamposInicioextraDetalleGuiaRemision);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleGuiaRemision.add(jLabelIdDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleGuiaRemision.add(jLabelidDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleGuiaRemision.add(jLabelid_empresaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleGuiaRemision.add(jButtonid_empresaDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 3;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleGuiaRemision.add(jButtonid_empresaDetalleGuiaRemisionUpdate, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleGuiaRemision.add(jComboBoxid_empresaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleGuiaRemision.add(jLabelid_sucursalDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleGuiaRemision.add(jButtonid_sucursalDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 3;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleGuiaRemision.add(jButtonid_sucursalDetalleGuiaRemisionUpdate, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleGuiaRemision.add(jComboBoxid_sucursalDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleGuiaRemision.add(jLabelid_ejercicioDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleGuiaRemision.add(jButtonid_ejercicioDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 3;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleGuiaRemision.add(jButtonid_ejercicioDetalleGuiaRemisionUpdate, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleGuiaRemision.add(jComboBoxid_ejercicioDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleGuiaRemision.add(jLabelid_periodoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleGuiaRemision.add(jButtonid_periodoDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 3;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleGuiaRemision.add(jButtonid_periodoDetalleGuiaRemisionUpdate, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleGuiaRemision.add(jComboBoxid_periodoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_guia_remisionDetalleGuiaRemision.add(jLabelid_guia_remisionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_guia_remisionDetalleGuiaRemision.add(jButtonid_guia_remisionDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 3;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_guia_remisionDetalleGuiaRemision.add(jButtonid_guia_remisionDetalleGuiaRemisionUpdate, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_guia_remisionDetalleGuiaRemision.add(jComboBoxid_guia_remisionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleGuiaRemision.add(jLabelid_bodegaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleGuiaRemision.add(jButtonid_bodegaDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 3;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleGuiaRemision.add(jButtonid_bodegaDetalleGuiaRemisionUpdate, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleGuiaRemision.add(jComboBoxid_bodegaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleGuiaRemision.add(jLabelid_productoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleGuiaRemision.add(jButtonid_productoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 3;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleGuiaRemision.add(jButtonid_productoDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 4;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleGuiaRemision.add(jButtonid_productoDetalleGuiaRemisionUpdate, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleGuiaRemision.add(jComboBoxid_productoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleGuiaRemision.add(jLabelid_unidadDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleGuiaRemision.add(jButtonid_unidadDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 3;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleGuiaRemision.add(jButtonid_unidadDetalleGuiaRemisionUpdate, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleGuiaRemision.add(jComboBoxid_unidadDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetalleGuiaRemision.add(jLabelid_centro_costoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleGuiaRemision.add(jButtonid_centro_costoDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 3;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleGuiaRemision.add(jButtonid_centro_costoDetalleGuiaRemisionUpdate, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetalleGuiaRemision.add(jComboBoxid_centro_costoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_envasesDetalleGuiaRemision.add(jLabelcantidad_envasesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_envasesDetalleGuiaRemision.add(jButtoncantidad_envasesDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_envasesDetalleGuiaRemision.add(jTextFieldcantidad_envasesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_auxiliarDetalleGuiaRemision.add(jLabelcantidad_auxiliarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_auxiliarDetalleGuiaRemision.add(jButtoncantidad_auxiliarDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_auxiliarDetalleGuiaRemision.add(jTextFieldcantidad_auxiliarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleGuiaRemision.add(jLabeldescripcionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleGuiaRemision.add(jButtondescripcionDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleGuiaRemision.add(jscrollPanedescripcionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleGuiaRemision.add(jLabelcantidadDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleGuiaRemision.add(jButtoncantidadDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleGuiaRemision.add(jTextFieldcantidadDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmontoDetalleGuiaRemision.add(jLabelmontoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelmontoDetalleGuiaRemision.add(jButtonmontoDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmontoDetalleGuiaRemision.add(jTextFieldmontoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprecioDetalleGuiaRemision.add(jLabelprecioDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelprecioDetalleGuiaRemision.add(jButtonprecioDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprecioDetalleGuiaRemision.add(jTextFieldprecioDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_descuentoDetalleGuiaRemision.add(jLabelporcentaje_descuentoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_descuentoDetalleGuiaRemision.add(jButtonporcentaje_descuentoDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_descuentoDetalleGuiaRemision.add(jTextFieldporcentaje_descuentoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetalleGuiaRemision.add(jLabeldescuentoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetalleGuiaRemision.add(jButtondescuentoDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetalleGuiaRemision.add(jTextFielddescuentoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento2DetalleGuiaRemision.add(jLabeldescuento2DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento2DetalleGuiaRemision.add(jButtondescuento2DetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento2DetalleGuiaRemision.add(jTextFielddescuento2DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento3DetalleGuiaRemision.add(jLabeldescuento3DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento3DetalleGuiaRemision.add(jButtondescuento3DetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento3DetalleGuiaRemision.add(jTextFielddescuento3DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelporcentaje_ivaDetalleGuiaRemision.add(jLabelporcentaje_ivaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelporcentaje_ivaDetalleGuiaRemision.add(jButtonporcentaje_ivaDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelporcentaje_ivaDetalleGuiaRemision.add(jTextFieldporcentaje_ivaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaDetalleGuiaRemision.add(jLabelivaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaDetalleGuiaRemision.add(jButtonivaDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaDetalleGuiaRemision.add(jTextFieldivaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_descuentoDetalleGuiaRemision.add(jLabeltotal_descuentoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_descuentoDetalleGuiaRemision.add(jButtontotal_descuentoDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_descuentoDetalleGuiaRemision.add(jTextFieldtotal_descuentoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotal_impuestoDetalleGuiaRemision.add(jLabeltotal_impuestoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotal_impuestoDetalleGuiaRemision.add(jButtontotal_impuestoDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotal_impuestoDetalleGuiaRemision.add(jTextFieldtotal_impuestoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalDetalleGuiaRemision.add(jLabelsub_totalDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalDetalleGuiaRemision.add(jButtonsub_totalDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalDetalleGuiaRemision.add(jTextFieldsub_totalDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalDetalleGuiaRemision.add(jLabeltotalDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalDetalleGuiaRemision.add(jButtontotalDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalDetalleGuiaRemision.add(jTextFieldtotalDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteDetalleGuiaRemision.add(jLabelloteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteDetalleGuiaRemision.add(jButtonloteDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteDetalleGuiaRemision.add(jTextFieldloteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellote_clienteDetalleGuiaRemision.add(jLabellote_clienteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanellote_clienteDetalleGuiaRemision.add(jButtonlote_clienteDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellote_clienteDetalleGuiaRemision.add(jTextFieldlote_clienteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelorden_compraDetalleGuiaRemision.add(jLabelorden_compraDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelorden_compraDetalleGuiaRemision.add(jButtonorden_compraDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelorden_compraDetalleGuiaRemision.add(jTextFieldorden_compraDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelareaDetalleGuiaRemision.add(jLabelareaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelareaDetalleGuiaRemision.add(jButtonareaDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelareaDetalleGuiaRemision.add(jTextFieldareaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmedidasDetalleGuiaRemision.add(jLabelmedidasDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelmedidasDetalleGuiaRemision.add(jButtonmedidasDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmedidasDetalleGuiaRemision.add(jTextFieldmedidasDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelacabadoDetalleGuiaRemision.add(jLabelacabadoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelacabadoDetalleGuiaRemision.add(jButtonacabadoDetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelacabadoDetalleGuiaRemision.add(jTextFieldacabadoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelacabado2DetalleGuiaRemision.add(jLabelacabado2DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		//this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 2;
		this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(0, 0, 0, 0);
		this.jPanelacabado2DetalleGuiaRemision.add(jButtonacabado2DetalleGuiaRemisionBusqueda, this.gridBagConstraintsDetalleGuiaRemision);
	}

	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelacabado2DetalleGuiaRemision.add(jTextFieldacabado2DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposOcultosDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposOcultosDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleGuiaRemision.add(this.jPanelid_empresaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposOcultosDetalleGuiaRemision % 1==0) {
		iXPanelCamposOcultosDetalleGuiaRemision=0;
		iYPanelCamposOcultosDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposOcultosDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposOcultosDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleGuiaRemision.add(this.jPanelid_sucursalDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposOcultosDetalleGuiaRemision % 1==0) {
		iXPanelCamposOcultosDetalleGuiaRemision=0;
		iYPanelCamposOcultosDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposOcultosDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposOcultosDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleGuiaRemision.add(this.jPanelid_ejercicioDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposOcultosDetalleGuiaRemision % 1==0) {
		iXPanelCamposOcultosDetalleGuiaRemision=0;
		iYPanelCamposOcultosDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposOcultosDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposOcultosDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleGuiaRemision.add(this.jPanelid_periodoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposOcultosDetalleGuiaRemision % 1==0) {
		iXPanelCamposOcultosDetalleGuiaRemision=0;
		iYPanelCamposOcultosDetalleGuiaRemision++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciogeneralDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciogeneralDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleGuiaRemision.add(this.jPanelidDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciogeneralDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
		iYPanelCamposIniciogeneralDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciogeneralDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciogeneralDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleGuiaRemision.add(this.jPanelid_guia_remisionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciogeneralDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
		iYPanelCamposIniciogeneralDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciogeneralDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciogeneralDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleGuiaRemision.add(this.jPanelid_bodegaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciogeneralDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
		iYPanelCamposIniciogeneralDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciogeneralDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciogeneralDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleGuiaRemision.add(this.jPanelid_productoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciogeneralDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
		iYPanelCamposIniciogeneralDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciogeneralDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciogeneralDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleGuiaRemision.add(this.jPanelid_unidadDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciogeneralDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
		iYPanelCamposIniciogeneralDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciogeneralDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciogeneralDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleGuiaRemision.add(this.jPanelid_centro_costoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciogeneralDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
		iYPanelCamposIniciogeneralDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciogeneralDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciogeneralDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleGuiaRemision.add(this.jPanelcantidad_envasesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciogeneralDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
		iYPanelCamposIniciogeneralDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciogeneralDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciogeneralDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleGuiaRemision.add(this.jPanelcantidad_auxiliarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciogeneralDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
		iYPanelCamposIniciogeneralDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciogeneralDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciogeneralDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleGuiaRemision.add(this.jPaneldescripcionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciogeneralDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciogeneralDetalleGuiaRemision=0;
		iYPanelCamposIniciogeneralDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPanelcantidadDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPanelmontoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPanelprecioDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPanelporcentaje_descuentoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPaneldescuentoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPaneldescuento2DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPaneldescuento3DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPanelporcentaje_ivaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPanelivaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPaneltotal_descuentoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPaneltotal_impuestoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPanelsub_totalDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposIniciovaloresDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposIniciovaloresDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleGuiaRemision.add(this.jPaneltotalDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposIniciovaloresDetalleGuiaRemision % 1==0) {
		iXPanelCamposIniciovaloresDetalleGuiaRemision=0;
		iYPanelCamposIniciovaloresDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposInicioextraDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposInicioextraDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetalleGuiaRemision.add(this.jPanelloteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposInicioextraDetalleGuiaRemision % 1==0) {
		iXPanelCamposInicioextraDetalleGuiaRemision=0;
		iYPanelCamposInicioextraDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposInicioextraDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposInicioextraDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetalleGuiaRemision.add(this.jPanellote_clienteDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposInicioextraDetalleGuiaRemision % 1==0) {
		iXPanelCamposInicioextraDetalleGuiaRemision=0;
		iYPanelCamposInicioextraDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposInicioextraDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposInicioextraDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetalleGuiaRemision.add(this.jPanelorden_compraDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposInicioextraDetalleGuiaRemision % 1==0) {
		iXPanelCamposInicioextraDetalleGuiaRemision=0;
		iYPanelCamposInicioextraDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposInicioextraDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposInicioextraDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetalleGuiaRemision.add(this.jPanelareaDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposInicioextraDetalleGuiaRemision % 1==0) {
		iXPanelCamposInicioextraDetalleGuiaRemision=0;
		iYPanelCamposInicioextraDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposInicioextraDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposInicioextraDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetalleGuiaRemision.add(this.jPanelmedidasDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposInicioextraDetalleGuiaRemision % 1==0) {
		iXPanelCamposInicioextraDetalleGuiaRemision=0;
		iYPanelCamposInicioextraDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposInicioextraDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposInicioextraDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetalleGuiaRemision.add(this.jPanelacabadoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposInicioextraDetalleGuiaRemision % 1==0) {
		iXPanelCamposInicioextraDetalleGuiaRemision=0;
		iYPanelCamposInicioextraDetalleGuiaRemision++;
	}
	this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleGuiaRemision.gridy = iYPanelCamposInicioextraDetalleGuiaRemision;
	this.gridBagConstraintsDetalleGuiaRemision.gridx = iXPanelCamposInicioextraDetalleGuiaRemision++;
	this.gridBagConstraintsDetalleGuiaRemision.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleGuiaRemision.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposInicioextraDetalleGuiaRemision.add(this.jPanelacabado2DetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);



	if(iXPanelCamposInicioextraDetalleGuiaRemision % 1==0) {
		iXPanelCamposInicioextraDetalleGuiaRemision=0;
		iYPanelCamposInicioextraDetalleGuiaRemision++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleGuiaRemision= new GridBagLayout();
		this.jPanelAccionesDetalleGuiaRemision.setLayout(gridaBagLayoutAccionesDetalleGuiaRemision);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleGuiaRemision= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleGuiaRemision.setLayout(gridaBagLayoutAccionesFormularioDetalleGuiaRemision);
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleGuiaRemision.add(this.jComboBoxTiposAccionesFormularioDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleGuiaRemision.add(this.jCheckBoxPostAccionNuevoDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalleguiaremisionSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleGuiaRemision.add(this.jCheckBoxPostAccionSinCerrarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalleguiaremisionSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleGuiaRemision.add(this.jCheckBoxPostAccionSinMensajeDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleGuiaRemision.add(this.jButtonModificarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);							

		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleGuiaRemision.add(this.jButtonEliminarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
			
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleGuiaRemision.add(this.jButtonActualizarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);


		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleGuiaRemision.add(this.jButtonGuardarCambiosDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);	
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = 0;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleGuiaRemision.add(this.jButtonCancelarDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleGuiaRemision = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleGuiaRemision);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalleguiaremisionSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();						
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;		
			//this.gridBagConstraintsDetalleGuiaRemision.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleGuiaRemision.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleGuiaRemision.gridx =0;
		this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleGuiaRemision.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleGuiaRemisionJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleGuiaRemision = new DetalleGuiaRemisionBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Guia Remision DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Guia Remision DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Guia Remision Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleGuiaRemisionModel detalleguiaremisionModel=new DetalleGuiaRemisionModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleGuiaRemisionModel.DetalleGuiaRemisionFocusTraversalPolicy detalleguiaremisionFocusTraversalPolicy = detalleguiaremisionModel.new DetalleGuiaRemisionFocusTraversalPolicy(this);
			
			//detalleguiaremisionFocusTraversalPolicy.setdetalleguiaremisionJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalleguiaremisionModel);
			
			
			this.jContentPaneDetalleDetalleGuiaRemision = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleGuiaRemision = new GridBagLayout();	
			this.jContentPaneDetalleDetalleGuiaRemision.setLayout(gridaBagLayoutDetalleDetalleGuiaRemision);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleGuiaRemision = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
				this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
					
				this.gridBagConstraintsDetalleGuiaRemision.gridwidth=2;
				
				this.jContentPaneDetalleDetalleGuiaRemision.add(jTtoolBarDetalleDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleGuiaRemision=   new JScrollPane(jContentPaneDetalleDetalleGuiaRemision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleGuiaRemision=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDetalleGuiaRemision.gridy = 1;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridwidth = 2;
		this.gridBagConstraintsDetalleGuiaRemision.gridheight = 1;
		iGridyRelaciones = 1;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleGuiaRemision.add(jPanelCamposIniciogeneralDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);


		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDetalleGuiaRemision.gridy = 2;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
		this.gridBagConstraintsDetalleGuiaRemision.gridwidth = 1;
		this.gridBagConstraintsDetalleGuiaRemision.gridheight = 1;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleGuiaRemision.add(jPanelCamposIniciovaloresDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);


		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;

		this.gridBagConstraintsDetalleGuiaRemision.gridy = 2;
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 1;
		this.gridBagConstraintsDetalleGuiaRemision.gridwidth = 1;
		this.gridBagConstraintsDetalleGuiaRemision.gridheight = 1;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleGuiaRemision.add(jPanelCamposInicioextraDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);
			
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
						&& detalleguiaremisionSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalleguiaremisionSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleGuiaRemision= new GridBagConstraints();
						this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
						this.jContentPaneDetalleDetalleGuiaRemision.add(this.jTabbedPaneRelacionesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleGuiaRemision.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleGuiaRemision.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
					this.gridBagConstraintsDetalleGuiaRemision.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
					
					this.gridBagConstraintsDetalleGuiaRemision.gridwidth=2;
				
					this.jContentPaneDetalleDetalleGuiaRemision.add(jPanelCamposOcultosDetalleGuiaRemision, gridBagConstraintsDetalleGuiaRemision);
				
					this.jPanelCamposOcultosDetalleGuiaRemision.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	        this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.CENTER;//WEST;
			
			this.gridBagConstraintsDetalleGuiaRemision.gridwidth=2;
			
			
			this.jContentPaneDetalleDetalleGuiaRemision.add(this.jPanelAccionesFormularioDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);							
			
			
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
	        this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
	        
			this.gridBagConstraintsDetalleGuiaRemision.gridwidth=2;
			
			this.jContentPaneDetalleDetalleGuiaRemision.add(this.jPanelAccionesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleGuiaRemision);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleGuiaRemision=   new JScrollPane(this.jPanelCamposDetalleGuiaRemision,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleGuiaRemision.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleGuiaRemision.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleGuiaRemision.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
			this.gridBagConstraintsDetalleGuiaRemision.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleGuiaRemision.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleGuiaRemision.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);			
			
			this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
			this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
			
			
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		
			
		this.gridBagConstraintsDetalleGuiaRemision = new GridBagConstraints();
		this.gridBagConstraintsDetalleGuiaRemision.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleGuiaRemision.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleGuiaRemision, this.gridBagConstraintsDetalleGuiaRemision);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleGuiaRemision;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleGuiaRemision;
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
