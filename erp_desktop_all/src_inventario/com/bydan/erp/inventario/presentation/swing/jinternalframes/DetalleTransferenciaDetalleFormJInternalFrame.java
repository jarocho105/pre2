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

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.inventario.util.DetalleTransferenciaConstantesFunciones;

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
public class DetalleTransferenciaDetalleFormJInternalFrame extends DetalleTransferenciaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	/*
	public JToolBar jTtoolBarDetalleDetalleTransferencia;
	
	protected JMenuBar jmenuBarDetalleDetalleTransferencia;
	
	protected JMenu jmenuDetalleDetalleTransferencia;
	protected JMenu jmenuDetalleArchivoDetalleTransferencia;
	protected JMenu jmenuDetalleAccionesDetalleTransferencia;
	protected JMenu jmenuDetalleDatosDetalleTransferencia;
	
	*/
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleTransferencia;	
	protected GridBagConstraints gridBagConstraintsDetalleTransferencia;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleTransferenciaBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleTransferencia;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected TransferenciaBeanSwingJInternalFrame transferenciaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_transferencia="";

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

	protected BodegaBeanSwingJInternalFrame bodegaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodega="";

	protected ProductoBeanSwingJInternalFrame productoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_producto="";

	protected UnidadBeanSwingJInternalFrame unidadBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_unidad="";

	protected BodegaBeanSwingJInternalFrame bodegaenviarBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_bodegaenviar="";

	protected NovedadProductoBeanSwingJInternalFrame novedadproductoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_novedadproducto="";

	protected EstadoDetalleInventarioBeanSwingJInternalFrame estadodetalleinventarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadodetalleinventario="";
	
	public DetalleTransferenciaSessionBean detalletransferenciaSessionBean;
	
	
	
	
	public TransferenciaSessionBean transferenciaSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public BodegaSessionBean bodegaenviarSessionBean;
	public NovedadProductoSessionBean novedadproductoSessionBean;
	public EstadoDetalleInventarioSessionBean estadodetalleinventarioSessionBean;	
	
	public DetalleTransferenciaLogic detalletransferenciaLogic;
	
	public JScrollPane jScrollPanelDatosDetalleTransferencia;
	public JScrollPane jScrollPanelDatosEdicionDetalleTransferencia;
	public JScrollPane jScrollPanelDatosGeneralDetalleTransferencia;
	
	protected JPanel jPanelCamposDetalleTransferencia;    
	protected JPanel jPanelCamposOcultosDetalleTransferencia;    	
	protected JPanel jPanelAccionesDetalleTransferencia;
	protected JPanel jPanelAccionesFormularioDetalleTransferencia;
    
	
	
	protected Integer iXPanelCamposDetalleTransferencia=0;
	protected Integer iYPanelCamposDetalleTransferencia=0;
	
	protected Integer iXPanelCamposOcultosDetalleTransferencia=0;
	protected Integer iYPanelCamposOcultosDetalleTransferencia=0;
	
	

	protected JPanel jPanelCamposIniciogeneralDetalleTransferencia;
	protected Integer iXPanelCamposIniciogeneralDetalleTransferencia=0;
	protected Integer iYPanelCamposIniciogeneralDetalleTransferencia=0;

	protected JPanel jPanelCamposIniciovaloresDetalleTransferencia;
	protected Integer iXPanelCamposIniciovaloresDetalleTransferencia=0;
	protected Integer iYPanelCamposIniciovaloresDetalleTransferencia=0;

	protected JPanel jPanelCamposIniciogeneral2DetalleTransferencia;
	protected Integer iXPanelCamposIniciogeneral2DetalleTransferencia=0;
	protected Integer iYPanelCamposIniciogeneral2DetalleTransferencia=0;;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleTransferencia;
	public JButton jButtonModificarDetalleTransferencia;
	public JButton jButtonActualizarDetalleTransferencia;
    public JButton jButtonEliminarDetalleTransferencia;
	public JButton jButtonCancelarDetalleTransferencia;
    public JButton jButtonGuardarCambiosDetalleTransferencia;
	public JButton jButtonGuardarCambiosTablaDetalleTransferencia;
	protected JButton jButtonCerrarDetalleTransferencia;
	
	/*
	protected JButton jButtonProcesarInformacionDetalleTransferencia;
	*/
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleTransferencia;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleTransferencia;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleTransferencia;
	
	//TOOLBAR
	/*
	
	protected JButton jButtonNuevoToolBarDetalleTransferencia;
	protected JButton jButtonModificarToolBarDetalleTransferencia;
	protected JButton jButtonActualizarToolBarDetalleTransferencia;
    protected JButton jButtonEliminarToolBarDetalleTransferencia;
	protected JButton jButtonCancelarToolBarDetalleTransferencia;
    protected JButton jButtonGuardarCambiosToolBarDetalleTransferencia;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleTransferencia;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleTransferencia;
	protected JButton jButtonCerrarToolBarDetalleTransferencia;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleTransferencia;
	
	*/
	//TOOLBAR
	
	
	//MENU
	/*
	
	protected JMenuItem jMenuItemNuevoDetalleTransferencia;
	protected JMenuItem jMenuItemModificarDetalleTransferencia;
	protected JMenuItem jMenuItemActualizarDetalleTransferencia;
    protected JMenuItem jMenuItemEliminarDetalleTransferencia;
	protected JMenuItem jMenuItemCancelarDetalleTransferencia;
    protected JMenuItem jMenuItemGuardarCambiosDetalleTransferencia;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleTransferencia;
	protected JMenuItem jMenuItemCerrarDetalleTransferencia;
	protected JMenuItem jMenuItemDetalleCerrarDetalleTransferencia;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleTransferencia;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleTransferencia;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleTransferencia;
	protected JMenuItem jMenuItemMostrarOcultarDetalleTransferencia;
	
	*/
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleTransferencia;	
		
	/*
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleTransferencia;
	*/
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleTransferencia;
	
	/*	
	
	
	
	
	
	*/
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleTransferencia;
	public JLabel jLabelIdDetalleTransferencia;
	public JLabel jLabelidDetalleTransferencia;
	public JButton jButtonidDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleTransferencia;
	public JLabel jLabeldescripcionDetalleTransferencia;
	public JTextArea jTextAreadescripcionDetalleTransferencia;
	public JScrollPane jscrollPanedescripcionDetalleTransferencia;
	public JButton jButtondescripcionDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelcantidadDetalleTransferencia;
	public JLabel jLabelcantidadDetalleTransferencia;
	public JTextField jTextFieldcantidadDetalleTransferencia;
	public JButton jButtoncantidadDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPaneldescuentoDetalleTransferencia;
	public JLabel jLabeldescuentoDetalleTransferencia;
	public JTextField jTextFielddescuentoDetalleTransferencia;
	public JButton jButtondescuentoDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioDetalleTransferencia;
	public JLabel jLabelcosto_unitarioDetalleTransferencia;
	public JTextField jTextFieldcosto_unitarioDetalleTransferencia;
	public JButton jButtoncosto_unitarioDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalDetalleTransferencia;
	public JLabel jLabelcosto_totalDetalleTransferencia;
	public JTextField jTextFieldcosto_totalDetalleTransferencia;
	public JButton jButtoncosto_totalDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPaneldisponibleDetalleTransferencia;
	public JLabel jLabeldisponibleDetalleTransferencia;
	public JTextField jTextFielddisponibleDetalleTransferencia;
	public JButton jButtondisponibleDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelloteDetalleTransferencia;
	public JLabel jLabelloteDetalleTransferencia;
	public JTextField jTextFieldloteDetalleTransferencia;
	public JButton jButtonloteDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_elaboracion_loteDetalleTransferencia;
	public JLabel jLabelfecha_elaboracion_loteDetalleTransferencia;
	//public JFormattedTextField jDateChooserfecha_elaboracion_loteDetalleTransferencia;

	public JDateChooser jDateChooserfecha_elaboracion_loteDetalleTransferencia;
	public JButton jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_caducidad_loteDetalleTransferencia;
	public JLabel jLabelfecha_caducidad_loteDetalleTransferencia;
	//public JFormattedTextField jDateChooserfecha_caducidad_loteDetalleTransferencia;

	public JDateChooser jDateChooserfecha_caducidad_loteDetalleTransferencia;
	public JButton jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelnumero_comprobanteDetalleTransferencia;
	public JLabel jLabelnumero_comprobanteDetalleTransferencia;
	public JTextField jTextFieldnumero_comprobanteDetalleTransferencia;
	public JButton jButtonnumero_comprobanteDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanellote_clienteDetalleTransferencia;
	public JLabel jLabellote_clienteDetalleTransferencia;
	public JTextField jTextFieldlote_clienteDetalleTransferencia;
	public JButton jButtonlote_clienteDetalleTransferenciaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_transferenciaDetalleTransferencia;
	public JLabel jLabelid_transferenciaDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_transferenciaDetalleTransferencia;
	public JButton jButtonid_transferenciaDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_transferenciaDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_transferenciaDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleTransferencia;
	public JLabel jLabelid_empresaDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleTransferencia;
	public JButton jButtonid_empresaDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_empresaDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleTransferencia;
	public JLabel jLabelid_sucursalDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleTransferencia;
	public JButton jButtonid_sucursalDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_sucursalDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleTransferencia;
	public JLabel jLabelid_ejercicioDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleTransferencia;
	public JButton jButtonid_ejercicioDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleTransferencia;
	public JLabel jLabelid_periodoDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleTransferencia;
	public JButton jButtonid_periodoDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_periodoDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleTransferencia;
	public JLabel jLabelid_anioDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleTransferencia;
	public JButton jButtonid_anioDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_anioDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleTransferencia;
	public JLabel jLabelid_mesDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleTransferencia;
	public JButton jButtonid_mesDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_mesDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleTransferencia;
	public JLabel jLabelid_bodegaDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleTransferencia;
	public JButton jButtonid_bodegaDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_bodegaDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleTransferencia;
	public JLabel jLabelid_productoDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleTransferencia;
	public JButton jButtonid_productoDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_productoDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleTransferencia;
	public JLabel jLabelid_unidadDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleTransferencia;
	public JButton jButtonid_unidadDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_unidadDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_bodega_enviarDetalleTransferencia;
	public JLabel jLabelid_bodega_enviarDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodega_enviarDetalleTransferencia;
	public JButton jButtonid_bodega_enviarDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_bodega_enviarDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_bodega_enviarDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_novedad_productoDetalleTransferencia;
	public JLabel jLabelid_novedad_productoDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_novedad_productoDetalleTransferencia;
	public JButton jButtonid_novedad_productoDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_novedad_productoDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_novedad_productoDetalleTransferenciaBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_detalle_inventarioDetalleTransferencia;
	public JLabel jLabelid_estado_detalle_inventarioDetalleTransferencia;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_detalle_inventarioDetalleTransferencia;
	public JButton jButtonid_estado_detalle_inventarioDetalleTransferencia= new JButtonMe();
	public JButton jButtonid_estado_detalle_inventarioDetalleTransferenciaUpdate= new JButtonMe();
	public JButton jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleTransferencia;
	
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
	public int iHeightFormulario=550;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleTransferenciaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleTransferencia=new JPanel();
				this.jPanelAccionesFormularioDetalleTransferencia=new JPanel();
				this.jmenuBarDetalleDetalleTransferencia=new JMenuBar();
				this.jTtoolBarDetalleDetalleTransferencia=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTransferenciaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleTransferenciaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTransferenciaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTransferenciaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleTransferenciaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleTransferencia No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	public JButton getjButtonActualizarToolBarDetalleTransferencia() {
		return this.jButtonActualizarToolBarDetalleTransferencia;
	}
	
	public JButton getjButtonEliminarToolBarDetalleTransferencia() {
		return this.jButtonEliminarToolBarDetalleTransferencia;
	}
	
	public JButton getjButtonCancelarToolBarDetalleTransferencia() {
		return this.jButtonCancelarToolBarDetalleTransferencia;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleTransferencia() {
		return this.jButtonProcesarInformacionDetalleTransferencia;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleTransferencia)	{
		this.jButtonProcesarInformacionDetalleTransferencia = jButtonProcesarInformacionDetalleTransferencia;
	}
	*/
	
	

	
	
	/*
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleTransferencia() {
		return this.jComboBoxTiposAccionesDetalleTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleTransferencia(
			JComboBox jComboBoxTiposRelacionesDetalleTransferencia) {
		this.jComboBoxTiposRelacionesDetalleTransferencia = jComboBoxTiposRelacionesDetalleTransferencia;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleTransferencia(
			JComboBox jComboBoxTiposAccionesDetalleTransferencia) {
		this.jComboBoxTiposAccionesDetalleTransferencia = jComboBoxTiposAccionesDetalleTransferencia;
	}		
	
	*/		
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleTransferencia() {
		return this.jComboBoxTiposAccionesFormularioDetalleTransferencia;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleTransferencia(
			JComboBox jComboBoxTiposAccionesFormularioDetalleTransferencia) {
		this.jComboBoxTiposAccionesFormularioDetalleTransferencia = jComboBoxTiposAccionesFormularioDetalleTransferencia;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalletransferenciaSessionBean=new DetalleTransferenciaSessionBean();
		
		this.detalletransferenciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalletransferenciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalletransferenciaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleTransferenciaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleTransferenciaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Transferencia MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleTransferenciaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	/*
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleTransferencia= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleTransferencia=new JButtonMe();
				this.jButtonModificarToolBarDetalleTransferencia=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleTransferencia,this.jTtoolBarDetalleDetalleTransferencia,
							"actualizar","actualizar","Actualizar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleTransferencia,this.jTtoolBarDetalleDetalleTransferencia,
							"eliminar","eliminar","Eliminar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleTransferencia,this.jTtoolBarDetalleDetalleTransferencia,
							"cancelar","cancelar","Cancelar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleTransferencia=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleTransferencia,this.jTtoolBarDetalleDetalleTransferencia,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	*/
	
	/*
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleTransferencia=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleTransferencia=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleTransferencia=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleTransferencia=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleTransferencia=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleTransferencia= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleTransferencia.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleTransferencia,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleTransferencia= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleTransferencia.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleTransferencia,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleTransferencia= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleTransferencia.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleTransferencia,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleTransferencia= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleTransferencia.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleTransferencia,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleTransferencia= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleTransferencia.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleTransferencia,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleTransferencia= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleTransferencia.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleTransferencia,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleTransferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleTransferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleTransferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleTransferencia= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleTransferencia.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleTransferencia,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleTransferencia= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleTransferencia.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleTransferencia,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleTransferencia.add(this.jMenuItemDetalleCerrarDetalleTransferencia);
		
		this.jmenuDetalleAccionesDetalleTransferencia.add(this.jMenuItemActualizarDetalleTransferencia);
		this.jmenuDetalleAccionesDetalleTransferencia.add(this.jMenuItemEliminarDetalleTransferencia);
		this.jmenuDetalleAccionesDetalleTransferencia.add(this.jMenuItemCancelarDetalleTransferencia);		
		
		//this.jmenuDetalleDatosDetalleTransferencia.add(this.jMenuItemDetalleAbrirOrderByDetalleTransferencia);				
		this.jmenuDetalleDatosDetalleTransferencia.add(this.jMenuItemDetalleMostarOcultarDetalleTransferencia);				
				
		//this.jmenuDetalleAccionesDetalleTransferencia.add(this.jMenuItemGuardarCambiosDetalleTransferencia);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleTransferencia.add(this.jmenuDetalleArchivoDetalleTransferencia);		
		this.jmenuBarDetalleDetalleTransferencia.add(this.jmenuDetalleAccionesDetalleTransferencia);		
		this.jmenuBarDetalleDetalleTransferencia.add(this.jmenuDetalleDatosDetalleTransferencia);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleTransferencia);				
	}
	*/
	
	public void inicializarElementosCamposDetalleTransferencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleTransferencia = new JLabelMe();
		jLabelIdDetalleTransferencia.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleTransferencia = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleTransferencia= new GridBagLayout();

		this.jPanelidDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);

		jLabelidDetalleTransferencia = new JLabel();
		jLabelidDetalleTransferencia.setText("Id");

		jLabelidDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabeldescripcionDetalleTransferencia = new JLabelMe();
		this.jLabeldescripcionDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleTransferencia.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPaneldescripcionDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jTextAreadescripcionDetalleTransferencia= new JTextAreaMe();
		jTextAreadescripcionDetalleTransferencia.setEnabled(false);
		jTextAreadescripcionDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleTransferencia.setLineWrap(true);
		jTextAreadescripcionDetalleTransferencia.setWrapStyleWord(true);
		jTextAreadescripcionDetalleTransferencia.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleTransferencia.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleTransferencia = new JScrollPane(jTextAreadescripcionDetalleTransferencia);
		jscrollPanedescripcionDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleTransferenciaBusqueda.setText("U");
		this.jButtondescripcionDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelcantidadDetalleTransferencia = new JLabelMe();
		this.jLabelcantidadDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_CANTIDAD+" : *");
		this.jLabelcantidadDetalleTransferencia.setToolTipText("Cantidad");
		this.jLabelcantidadDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcantidadDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidadDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidadDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidadDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_CANTIDAD);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelcantidadDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jTextFieldcantidadDetalleTransferencia= new JTextFieldMe();
		jTextFieldcantidadDetalleTransferencia.setEnabled(false);
		jTextFieldcantidadDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidadDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidadDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidadDetalleTransferencia.setText("0");

		this.jButtoncantidadDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtoncantidadDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidadDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidadDetalleTransferenciaBusqueda.setText("U");
		this.jButtoncantidadDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidadDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidadDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidadDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidadDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidadDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidadDetalleTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabeldescuentoDetalleTransferencia = new JLabelMe();
		this.jLabeldescuentoDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_DESCUENTO+" : *");
		this.jLabeldescuentoDetalleTransferencia.setToolTipText("Descuento");
		this.jLabeldescuentoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescuentoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuentoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuentoDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuentoDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_DESCUENTO);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPaneldescuentoDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jTextFielddescuentoDetalleTransferencia= new JTextFieldMe();
		jTextFielddescuentoDetalleTransferencia.setEnabled(false);
		jTextFielddescuentoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuentoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuentoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuentoDetalleTransferencia.setText("0.0");

		this.jButtondescuentoDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtondescuentoDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuentoDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuentoDetalleTransferenciaBusqueda.setText("U");
		this.jButtondescuentoDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuentoDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuentoDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuentoDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuentoDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuentoDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuentoDetalleTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioDetalleTransferencia = new JLabelMe();
		this.jLabelcosto_unitarioDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioDetalleTransferencia.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelcosto_unitarioDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jTextFieldcosto_unitarioDetalleTransferencia= new JTextFieldMe();
		jTextFieldcosto_unitarioDetalleTransferencia.setEnabled(false);
		jTextFieldcosto_unitarioDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioDetalleTransferencia.setText("0.0");

		this.jButtoncosto_unitarioDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioDetalleTransferenciaBusqueda.setText("U");
		this.jButtoncosto_unitarioDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioDetalleTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalDetalleTransferencia = new JLabelMe();
		this.jLabelcosto_totalDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalDetalleTransferencia.setToolTipText("Costo Total");
		this.jLabelcosto_totalDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelcosto_totalDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jTextFieldcosto_totalDetalleTransferencia= new JTextFieldMe();
		jTextFieldcosto_totalDetalleTransferencia.setEnabled(false);
		jTextFieldcosto_totalDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalDetalleTransferencia.setText("0.0");

		this.jButtoncosto_totalDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtoncosto_totalDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalDetalleTransferenciaBusqueda.setText("U");
		this.jButtoncosto_totalDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalDetalleTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabeldisponibleDetalleTransferencia = new JLabelMe();
		this.jLabeldisponibleDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_DISPONIBLE+" :");
		this.jLabeldisponibleDetalleTransferencia.setToolTipText("Disponible");
		this.jLabeldisponibleDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldisponibleDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldisponibleDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldisponibleDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldisponibleDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_DISPONIBLE);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPaneldisponibleDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jTextFielddisponibleDetalleTransferencia= new JTextFieldMe();
		jTextFielddisponibleDetalleTransferencia.setEnabled(false);
		jTextFielddisponibleDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddisponibleDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddisponibleDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddisponibleDetalleTransferencia.setText("0");

		this.jButtondisponibleDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtondisponibleDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondisponibleDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondisponibleDetalleTransferenciaBusqueda.setText("U");
		this.jButtondisponibleDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondisponibleDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondisponibleDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddisponibleDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddisponibleDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"disponibleDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondisponibleDetalleTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelloteDetalleTransferencia = new JLabelMe();
		this.jLabelloteDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_LOTE+" : *");
		this.jLabelloteDetalleTransferencia.setToolTipText("Lote");
		this.jLabelloteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelloteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelloteDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelloteDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelloteDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_LOTE);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelloteDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jTextFieldloteDetalleTransferencia= new JTextFieldMe();

		jTextFieldloteDetalleTransferencia.setEnabled(false);
		jTextFieldloteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldloteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldloteDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonloteDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonloteDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonloteDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonloteDetalleTransferenciaBusqueda.setText("U");
		this.jButtonloteDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonloteDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonloteDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldloteDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldloteDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"loteDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonloteDetalleTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_elaboracion_loteDetalleTransferencia = new JLabelMe();
		this.jLabelfecha_elaboracion_loteDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_FECHAELABORACIONLOTE+" : *");
		this.jLabelfecha_elaboracion_loteDetalleTransferencia.setToolTipText("Fecha Elaboracion Lote");
		this.jLabelfecha_elaboracion_loteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_elaboracion_loteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_elaboracion_loteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_elaboracion_loteDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_elaboracion_loteDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_elaboracion_loteDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_FECHAELABORACIONLOTE);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelfecha_elaboracion_loteDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		//jFormattedTextFieldfecha_elaboracion_loteDetalleTransferencia= new JFormattedTextFieldMe();

		jDateChooserfecha_elaboracion_loteDetalleTransferencia= new JDateChooser();
		jDateChooserfecha_elaboracion_loteDetalleTransferencia.setEnabled(false);
		jDateChooserfecha_elaboracion_loteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_elaboracion_loteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_elaboracion_loteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_elaboracion_loteDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_elaboracion_loteDetalleTransferencia.setDate(new Date());
		jDateChooserfecha_elaboracion_loteDetalleTransferencia.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_elaboracion_loteDetalleTransferencia.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda.setText("U");
		this.jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_elaboracion_loteDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_elaboracion_loteDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_elaboracion_loteDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_caducidad_loteDetalleTransferencia = new JLabelMe();
		this.jLabelfecha_caducidad_loteDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_FECHACADUCIDADLOTE+" : *");
		this.jLabelfecha_caducidad_loteDetalleTransferencia.setToolTipText("Fecha Caducidad Lote");
		this.jLabelfecha_caducidad_loteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_caducidad_loteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelfecha_caducidad_loteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_caducidad_loteDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_caducidad_loteDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_caducidad_loteDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_FECHACADUCIDADLOTE);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelfecha_caducidad_loteDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		//jFormattedTextFieldfecha_caducidad_loteDetalleTransferencia= new JFormattedTextFieldMe();

		jDateChooserfecha_caducidad_loteDetalleTransferencia= new JDateChooser();
		jDateChooserfecha_caducidad_loteDetalleTransferencia.setEnabled(false);
		jDateChooserfecha_caducidad_loteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidad_loteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_caducidad_loteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_caducidad_loteDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_caducidad_loteDetalleTransferencia.setDate(new Date());
		jDateChooserfecha_caducidad_loteDetalleTransferencia.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_caducidad_loteDetalleTransferencia.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda.setText("U");
		this.jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_caducidad_loteDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_caducidad_loteDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_caducidad_loteDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabelnumero_comprobanteDetalleTransferencia = new JLabelMe();
		this.jLabelnumero_comprobanteDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_NUMEROCOMPROBANTE+" :");
		this.jLabelnumero_comprobanteDetalleTransferencia.setToolTipText("Nro Comprobante");
		this.jLabelnumero_comprobanteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_comprobanteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_comprobanteDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_comprobanteDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_comprobanteDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelnumero_comprobanteDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jTextFieldnumero_comprobanteDetalleTransferencia= new JTextFieldMe();

		jTextFieldnumero_comprobanteDetalleTransferencia.setEnabled(false);
		jTextFieldnumero_comprobanteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_comprobanteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_comprobanteDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_comprobanteDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonnumero_comprobanteDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_comprobanteDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_comprobanteDetalleTransferenciaBusqueda.setText("U");
		this.jButtonnumero_comprobanteDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_comprobanteDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_comprobanteDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_comprobanteDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_comprobanteDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_comprobanteDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_comprobanteDetalleTransferenciaBusqueda.setVisible(false);		}


					
		this.jLabellote_clienteDetalleTransferencia = new JLabelMe();
		this.jLabellote_clienteDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_LOTECLIENTE+" :");
		this.jLabellote_clienteDetalleTransferencia.setToolTipText("Lote Cliente");
		this.jLabellote_clienteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellote_clienteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellote_clienteDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellote_clienteDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellote_clienteDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_LOTECLIENTE);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanellote_clienteDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jTextFieldlote_clienteDetalleTransferencia= new JTextFieldMe();

		jTextFieldlote_clienteDetalleTransferencia.setEnabled(false);
		jTextFieldlote_clienteDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlote_clienteDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlote_clienteDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlote_clienteDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonlote_clienteDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlote_clienteDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlote_clienteDetalleTransferenciaBusqueda.setText("U");
		this.jButtonlote_clienteDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlote_clienteDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlote_clienteDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlote_clienteDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlote_clienteDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lote_clienteDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlote_clienteDetalleTransferenciaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleTransferencia() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_transferenciaDetalleTransferencia = new JLabelMe();
		this.jLabelid_transferenciaDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDTRANSFERENCIA+" : *");
		this.jLabelid_transferenciaDetalleTransferencia.setToolTipText("Transferencia");
		this.jLabelid_transferenciaDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transferenciaDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_transferenciaDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_transferenciaDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_transferenciaDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_transferenciaDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDTRANSFERENCIA);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_transferenciaDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_transferenciaDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_transferenciaDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transferenciaDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_transferenciaDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_transferenciaDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_transferenciaDetalleTransferencia= new JButtonMe();
		this.jButtonid_transferenciaDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transferenciaDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transferenciaDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_transferenciaDetalleTransferencia.setText("Buscar");
		this.jButtonid_transferenciaDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_transferenciaDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transferenciaDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_transferenciaDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transferenciaDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transferenciaDetalleTransferencia"));

		this.jButtonid_transferenciaDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_transferenciaDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transferenciaDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transferenciaDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transferenciaDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_transferenciaDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_transferenciaDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transferenciaDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_transferenciaDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transferenciaDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transferenciaDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_transferenciaDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_transferenciaDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_transferenciaDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transferenciaDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_transferenciaDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_transferenciaDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_transferenciaDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_transferenciaDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_transferenciaDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_transferenciaDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_transferenciaDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_transferenciaDetalleTransferenciaUpdate"));



					
		this.jLabelid_empresaDetalleTransferencia = new JLabelMe();
		this.jLabelid_empresaDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleTransferencia.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_empresaDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_empresaDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_empresaDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleTransferencia.setEnabled(false);

		this.jButtonid_empresaDetalleTransferencia= new JButtonMe();
		this.jButtonid_empresaDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleTransferencia.setText("Buscar");
		this.jButtonid_empresaDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleTransferencia"));

		this.jButtonid_empresaDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_empresaDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_empresaDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleTransferenciaUpdate"));



					
		this.jLabelid_sucursalDetalleTransferencia = new JLabelMe();
		this.jLabelid_sucursalDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleTransferencia.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_sucursalDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_sucursalDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_sucursalDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleTransferencia.setEnabled(false);

		this.jButtonid_sucursalDetalleTransferencia= new JButtonMe();
		this.jButtonid_sucursalDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleTransferencia.setText("Buscar");
		this.jButtonid_sucursalDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleTransferencia"));

		this.jButtonid_sucursalDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_sucursalDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_sucursalDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleTransferenciaUpdate"));



					
		this.jLabelid_ejercicioDetalleTransferencia = new JLabelMe();
		this.jLabelid_ejercicioDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleTransferencia.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_ejercicioDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_ejercicioDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleTransferencia.setEnabled(false);

		this.jButtonid_ejercicioDetalleTransferencia= new JButtonMe();
		this.jButtonid_ejercicioDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleTransferencia.setText("Buscar");
		this.jButtonid_ejercicioDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleTransferencia"));

		this.jButtonid_ejercicioDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_ejercicioDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleTransferenciaUpdate"));



					
		this.jLabelid_periodoDetalleTransferencia = new JLabelMe();
		this.jLabelid_periodoDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleTransferencia.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_periodoDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_periodoDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_periodoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleTransferencia.setEnabled(false);

		this.jButtonid_periodoDetalleTransferencia= new JButtonMe();
		this.jButtonid_periodoDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleTransferencia.setText("Buscar");
		this.jButtonid_periodoDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleTransferencia"));

		this.jButtonid_periodoDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_periodoDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_periodoDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleTransferenciaUpdate"));



					
		this.jLabelid_anioDetalleTransferencia = new JLabelMe();
		this.jLabelid_anioDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleTransferencia.setToolTipText("Anio");
		this.jLabelid_anioDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_anioDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_anioDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_anioDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleTransferencia.setEnabled(false);

		this.jButtonid_anioDetalleTransferencia= new JButtonMe();
		this.jButtonid_anioDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleTransferencia.setText("Buscar");
		this.jButtonid_anioDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleTransferencia"));

		this.jButtonid_anioDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_anioDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_anioDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_anioDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleTransferenciaUpdate"));



					
		this.jLabelid_mesDetalleTransferencia = new JLabelMe();
		this.jLabelid_mesDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleTransferencia.setToolTipText("Mes");
		this.jLabelid_mesDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_mesDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_mesDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_mesDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleTransferencia.setEnabled(false);

		this.jButtonid_mesDetalleTransferencia= new JButtonMe();
		this.jButtonid_mesDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleTransferencia.setText("Buscar");
		this.jButtonid_mesDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleTransferencia"));

		this.jButtonid_mesDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_mesDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_mesDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_mesDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleTransferenciaUpdate"));



					
		this.jLabelid_bodegaDetalleTransferencia = new JLabelMe();
		this.jLabelid_bodegaDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleTransferencia.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_bodegaDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_bodegaDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_bodegaDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleTransferencia= new JButtonMe();
		this.jButtonid_bodegaDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleTransferencia.setText("Buscar");
		this.jButtonid_bodegaDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleTransferencia"));

		this.jButtonid_bodegaDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_bodegaDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_bodegaDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleTransferenciaUpdate"));



					
		this.jLabelid_productoDetalleTransferencia = new JLabelMe();
		this.jLabelid_productoDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleTransferencia.setToolTipText("Producto");
		this.jLabelid_productoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_productoDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_productoDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_productoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleTransferencia= new JButtonMe();
		this.jButtonid_productoDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleTransferencia.setText("Buscar");
		this.jButtonid_productoDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleTransferencia"));

		this.jButtonid_productoDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_productoDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_productoDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_productoDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleTransferenciaUpdate"));



					
		this.jLabelid_unidadDetalleTransferencia = new JLabelMe();
		this.jLabelid_unidadDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleTransferencia.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_unidadDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_unidadDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_unidadDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleTransferencia= new JButtonMe();
		this.jButtonid_unidadDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleTransferencia.setText("Buscar");
		this.jButtonid_unidadDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleTransferencia"));

		this.jButtonid_unidadDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_unidadDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_unidadDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleTransferenciaUpdate"));



					
		this.jLabelid_bodega_enviarDetalleTransferencia = new JLabelMe();
		this.jLabelid_bodega_enviarDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDBODEGAENVIAR+" : *");
		this.jLabelid_bodega_enviarDetalleTransferencia.setToolTipText("Bodega Enviar");
		this.jLabelid_bodega_enviarDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_enviarDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodega_enviarDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodega_enviarDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodega_enviarDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodega_enviarDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDBODEGAENVIAR);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_bodega_enviarDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_bodega_enviarDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_bodega_enviarDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_enviarDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodega_enviarDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodega_enviarDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodega_enviarDetalleTransferencia= new JButtonMe();
		this.jButtonid_bodega_enviarDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_enviarDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_enviarDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodega_enviarDetalleTransferencia.setText("Buscar");
		this.jButtonid_bodega_enviarDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodega_enviarDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_enviarDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodega_enviarDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_enviarDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_enviarDetalleTransferencia"));

		this.jButtonid_bodega_enviarDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_bodega_enviarDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_enviarDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_enviarDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_enviarDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_bodega_enviarDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodega_enviarDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_enviarDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodega_enviarDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_enviarDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_enviarDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodega_enviarDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_bodega_enviarDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_bodega_enviarDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_enviarDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodega_enviarDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodega_enviarDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_bodega_enviarDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodega_enviarDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodega_enviarDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodega_enviarDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodega_enviarDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodega_enviarDetalleTransferenciaUpdate"));



					
		this.jLabelid_novedad_productoDetalleTransferencia = new JLabelMe();
		this.jLabelid_novedad_productoDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDNOVEDADPRODUCTO+" :");
		this.jLabelid_novedad_productoDetalleTransferencia.setToolTipText("Novedad");
		this.jLabelid_novedad_productoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_novedad_productoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_novedad_productoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_novedad_productoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_novedad_productoDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_novedad_productoDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDNOVEDADPRODUCTO);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_novedad_productoDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_novedad_productoDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_novedad_productoDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_novedad_productoDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_novedad_productoDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_novedad_productoDetalleTransferencia= new JButtonMe();
		this.jButtonid_novedad_productoDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_novedad_productoDetalleTransferencia.setText("Buscar");
		this.jButtonid_novedad_productoDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_novedad_productoDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_novedad_productoDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleTransferencia"));

		this.jButtonid_novedad_productoDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_novedad_productoDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_novedad_productoDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_novedad_productoDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_novedad_productoDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_novedad_productoDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_novedad_productoDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_novedad_productoDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_novedad_productoDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_novedad_productoDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_novedad_productoDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_novedad_productoDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_novedad_productoDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_novedad_productoDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_novedad_productoDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_novedad_productoDetalleTransferenciaUpdate"));



					
		this.jLabelid_estado_detalle_inventarioDetalleTransferencia = new JLabelMe();
		this.jLabelid_estado_detalle_inventarioDetalleTransferencia.setText(""+DetalleTransferenciaConstantesFunciones.LABEL_IDESTADODETALLEINVENTARIO+" : *");
		this.jLabelid_estado_detalle_inventarioDetalleTransferencia.setToolTipText("Estado");
		this.jLabelid_estado_detalle_inventarioDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_inventarioDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_detalle_inventarioDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-25),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_detalle_inventarioDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_detalle_inventarioDetalleTransferencia=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_detalle_inventarioDetalleTransferencia.setToolTipText(DetalleTransferenciaConstantesFunciones.LABEL_IDESTADODETALLEINVENTARIO);
		this.gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		this.jPanelid_estado_detalle_inventarioDetalleTransferencia.setLayout(this.gridaBagLayoutDetalleTransferencia);


		jComboBoxid_estado_detalle_inventarioDetalleTransferencia= new JComboBoxMe();
		jComboBoxid_estado_detalle_inventarioDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_inventarioDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_detalle_inventarioDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_detalle_inventarioDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_detalle_inventarioDetalleTransferencia.setEnabled(false);

		this.jButtonid_estado_detalle_inventarioDetalleTransferencia= new JButtonMe();
		this.jButtonid_estado_detalle_inventarioDetalleTransferencia.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_inventarioDetalleTransferencia.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_inventarioDetalleTransferencia.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_detalle_inventarioDetalleTransferencia.setText("Buscar");
		this.jButtonid_estado_detalle_inventarioDetalleTransferencia.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_detalle_inventarioDetalleTransferencia.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_inventarioDetalleTransferencia,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_detalle_inventarioDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_inventarioDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_inventarioDetalleTransferencia"));

		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda= new JButtonMe();
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda.setText("U");
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_detalle_inventarioDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_inventarioDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_inventarioDetalleTransferenciaBusqueda"));

		if(this.detalletransferenciaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda.setVisible(false);		}

		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaUpdate= new JButtonMe();
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_detalle_inventarioDetalleTransferenciaUpdate.setText("U");
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_detalle_inventarioDetalleTransferenciaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_detalle_inventarioDetalleTransferenciaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_detalle_inventarioDetalleTransferencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_detalle_inventarioDetalleTransferencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_detalle_inventarioDetalleTransferenciaUpdate"));



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
		//this.jInternalFrameDetalleDetalleTransferencia = new DetalleTransferenciaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Transferencia DATOS");
		
		/*
		this.cargarMenus();		
		*/
		
		this.gridaBagLayoutDetalleTransferencia= new GridBagLayout();
		

		
		String sToolTipDetalleTransferencia="";
		sToolTipDetalleTransferencia=DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleTransferencia+="(Inventario.DetalleTransferencia)";
		}
		
		if(!this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleTransferencia+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleTransferencia = new JButtonMe();
		this.jButtonModificarDetalleTransferencia = new JButtonMe();
        this.jButtonActualizarDetalleTransferencia = new JButtonMe();
        this.jButtonEliminarDetalleTransferencia = new JButtonMe();
        this.jButtonCancelarDetalleTransferencia = new JButtonMe();
        this.jButtonGuardarCambiosDetalleTransferencia = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleTransferencia = new JButtonMe();
		this.jButtonCerrarDetalleTransferencia = new JButtonMe();
		
		this.jScrollPanelDatosDetalleTransferencia = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleTransferencia = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleTransferencia = new JScrollPane();
		//this.jScrollPanelDatosDetalleTransferenciaTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		
		this.jPanelCamposIniciogeneralDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciovaloresDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposIniciogeneral2DetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Transferencia";
		
		if(!this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Transferencias" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleTransferencia.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleTransferenciaTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleTransferencia.setName("jPanelCamposDetalleTransferencia"); 

		this.jPanelCamposOcultosDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleTransferencia.setName("jPanelCamposOcultosDetalleTransferencia"); 

        this.jPanelAccionesDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleTransferencia.setToolTipText("Acciones");
        this.jPanelAccionesDetalleTransferencia.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleTransferencia.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleTransferencia.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		

		this.jPanelCamposIniciogeneralDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("General"));
		this.jPanelCamposIniciogeneralDetalleTransferencia.setName("jPanelCamposFingeneralDetalleTransferencia");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneralDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciovaloresDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Valores"));
		this.jPanelCamposIniciovaloresDetalleTransferencia.setName("jPanelCamposFinvaloresDetalleTransferencia");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciovaloresDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelCamposIniciogeneral2DetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("General2"));
		this.jPanelCamposIniciogeneral2DetalleTransferencia.setName("jPanelCamposFingeneral2DetalleTransferencia");
		FuncionesSwing.setBoldPanel(this.jPanelCamposIniciogeneral2DetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleTransferencia.setText("Nuevo");
		this.jButtonModificarDetalleTransferencia.setText("Editar");
        this.jButtonActualizarDetalleTransferencia.setText("Actualizar");
        this.jButtonEliminarDetalleTransferencia.setText("Eliminar");
        this.jButtonCancelarDetalleTransferencia.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleTransferencia.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleTransferencia.setText("Guardar");
		this.jButtonCerrarDetalleTransferencia.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleTransferencia,"nuevo_button","Nuevo",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleTransferencia,"modificar_button","Editar",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleTransferencia,"actualizar_button","Actualizar",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleTransferencia,"eliminar_button","Eliminar",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleTransferencia,"cancelar_button","Cancelar",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleTransferencia,"guardarcambios_button","Guardar",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleTransferencia,"guardarcambiostabla_button","Guardar",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleTransferencia,"cerrar_button","Salir",this.detalletransferenciaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleTransferencia.setToolTipText("Nuevo"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleTransferencia.setToolTipText("Editar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleTransferencia.setToolTipText("Actualizar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleTransferencia.setToolTipText("Eliminar)"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleTransferencia.setToolTipText("Cancelar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleTransferencia.setToolTipText("Guardar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleTransferencia.setToolTipText("Guardar"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleTransferencia.setToolTipText("Salir"+" "+DetalleTransferenciaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleTransferencia";
		inputMap = this.jButtonNuevoDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleTransferencia.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleTransferencia"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleTransferencia";
		inputMap = this.jButtonActualizarDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleTransferencia"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleTransferencia";
		inputMap = this.jButtonEliminarDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleTransferencia"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleTransferencia";
		inputMap = this.jButtonCancelarDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleTransferencia"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleTransferencia";
		inputMap = this.jButtonCerrarDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleTransferencia"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleTransferencia";
		inputMap = this.jButtonGuardarCambiosTablaDetalleTransferencia.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleTransferencia.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleTransferencia"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleTransferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleTransferencia.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleTransferencia.setToolTipText("Nuevo DetalleTransferencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleTransferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleTransferencia.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleTransferencia.setToolTipText("Sin Cerrar Ventana DetalleTransferencia");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleTransferencia = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleTransferencia.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleTransferencia.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
		/*	
			
		this.jComboBoxTiposAccionesDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleTransferencia.setText("Accion");
		this.jComboBoxTiposAccionesDetalleTransferencia.setToolTipText("Tipos de Acciones");
							
		*/

		this.jComboBoxTiposAccionesFormularioDetalleTransferencia = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleTransferencia.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleTransferencia.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleTransferencia = new JLabelMe();
		
		this.jLabelAccionesDetalleTransferencia.setText("Acciones");		
		this.jLabelAccionesDetalleTransferencia.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTransferencia.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleTransferencia.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleTransferencia();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleTransferencia();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleTransferencia=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleTransferencia.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleTransferencia,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		/*
		this.jComboBoxTiposAccionesDetalleTransferencia.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTransferencia.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleTransferencia.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		*/
		
		this.jComboBoxTiposAccionesFormularioDetalleTransferencia.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleTransferencia.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleTransferencia.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleTransferencia, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleTransferencia = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleTransferencia = new GridBagLayout();
		
		this.jPanelCamposDetalleTransferencia.setLayout(gridaBagLayoutCamposDetalleTransferencia);
		this.jPanelCamposOcultosDetalleTransferencia.setLayout(gridaBagLayoutCamposOcultosDetalleTransferencia);
		
		

		GridBagLayout gridaBagLayoutCamposIniciogeneralDetalleTransferencia= new GridBagLayout();
		this.jPanelCamposIniciogeneralDetalleTransferencia.setLayout(gridaBagLayoutCamposIniciogeneralDetalleTransferencia);

		GridBagLayout gridaBagLayoutCamposIniciovaloresDetalleTransferencia= new GridBagLayout();
		this.jPanelCamposIniciovaloresDetalleTransferencia.setLayout(gridaBagLayoutCamposIniciovaloresDetalleTransferencia);

		GridBagLayout gridaBagLayoutCamposIniciogeneral2DetalleTransferencia= new GridBagLayout();
		this.jPanelCamposIniciogeneral2DetalleTransferencia.setLayout(gridaBagLayoutCamposIniciogeneral2DetalleTransferencia);;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleTransferencia.add(jLabelIdDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleTransferencia.add(jLabelidDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_transferenciaDetalleTransferencia.add(jLabelid_transferenciaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transferenciaDetalleTransferencia.add(jButtonid_transferenciaDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_transferenciaDetalleTransferencia.add(jButtonid_transferenciaDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_transferenciaDetalleTransferencia.add(jComboBoxid_transferenciaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleTransferencia.add(jLabelid_empresaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleTransferencia.add(jButtonid_empresaDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleTransferencia.add(jButtonid_empresaDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleTransferencia.add(jComboBoxid_empresaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleTransferencia.add(jLabelid_sucursalDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleTransferencia.add(jButtonid_sucursalDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleTransferencia.add(jButtonid_sucursalDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleTransferencia.add(jComboBoxid_sucursalDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleTransferencia.add(jLabelid_ejercicioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleTransferencia.add(jButtonid_ejercicioDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleTransferencia.add(jButtonid_ejercicioDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleTransferencia.add(jComboBoxid_ejercicioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleTransferencia.add(jLabelid_periodoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleTransferencia.add(jButtonid_periodoDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleTransferencia.add(jButtonid_periodoDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleTransferencia.add(jComboBoxid_periodoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleTransferencia.add(jLabelid_anioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleTransferencia.add(jButtonid_anioDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleTransferencia.add(jButtonid_anioDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleTransferencia.add(jComboBoxid_anioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleTransferencia.add(jLabelid_mesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleTransferencia.add(jButtonid_mesDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleTransferencia.add(jButtonid_mesDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleTransferencia.add(jComboBoxid_mesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleTransferencia.add(jLabelid_bodegaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleTransferencia.add(jButtonid_bodegaDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleTransferencia.add(jButtonid_bodegaDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleTransferencia.add(jComboBoxid_bodegaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleTransferencia.add(jLabelid_productoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 2;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleTransferencia.add(jButtonid_productoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleTransferencia.add(jButtonid_productoDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 4;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleTransferencia.add(jButtonid_productoDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleTransferencia.add(jComboBoxid_productoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleTransferencia.add(jLabelid_unidadDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleTransferencia.add(jButtonid_unidadDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleTransferencia.add(jButtonid_unidadDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleTransferencia.add(jComboBoxid_unidadDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodega_enviarDetalleTransferencia.add(jLabelid_bodega_enviarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_enviarDetalleTransferencia.add(jButtonid_bodega_enviarDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodega_enviarDetalleTransferencia.add(jButtonid_bodega_enviarDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodega_enviarDetalleTransferencia.add(jComboBoxid_bodega_enviarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleTransferencia.add(jLabeldescripcionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleTransferencia.add(jButtondescripcionDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleTransferencia.add(jscrollPanedescripcionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_novedad_productoDetalleTransferencia.add(jLabelid_novedad_productoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoDetalleTransferencia.add(jButtonid_novedad_productoDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_novedad_productoDetalleTransferencia.add(jButtonid_novedad_productoDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_novedad_productoDetalleTransferencia.add(jComboBoxid_novedad_productoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_detalle_inventarioDetalleTransferencia.add(jLabelid_estado_detalle_inventarioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_inventarioDetalleTransferencia.add(jButtonid_estado_detalle_inventarioDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 3;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_detalle_inventarioDetalleTransferencia.add(jButtonid_estado_detalle_inventarioDetalleTransferenciaUpdate, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_detalle_inventarioDetalleTransferencia.add(jComboBoxid_estado_detalle_inventarioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidadDetalleTransferencia.add(jLabelcantidadDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidadDetalleTransferencia.add(jButtoncantidadDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidadDetalleTransferencia.add(jTextFieldcantidadDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuentoDetalleTransferencia.add(jLabeldescuentoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuentoDetalleTransferencia.add(jButtondescuentoDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuentoDetalleTransferencia.add(jTextFielddescuentoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioDetalleTransferencia.add(jLabelcosto_unitarioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioDetalleTransferencia.add(jButtoncosto_unitarioDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioDetalleTransferencia.add(jTextFieldcosto_unitarioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalDetalleTransferencia.add(jLabelcosto_totalDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalDetalleTransferencia.add(jButtoncosto_totalDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalDetalleTransferencia.add(jTextFieldcosto_totalDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldisponibleDetalleTransferencia.add(jLabeldisponibleDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPaneldisponibleDetalleTransferencia.add(jButtondisponibleDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldisponibleDetalleTransferencia.add(jTextFielddisponibleDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelloteDetalleTransferencia.add(jLabelloteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelloteDetalleTransferencia.add(jButtonloteDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelloteDetalleTransferencia.add(jTextFieldloteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_elaboracion_loteDetalleTransferencia.add(jLabelfecha_elaboracion_loteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_elaboracion_loteDetalleTransferencia.add(jButtonfecha_elaboracion_loteDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_elaboracion_loteDetalleTransferencia.add(jDateChooserfecha_elaboracion_loteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_caducidad_loteDetalleTransferencia.add(jLabelfecha_caducidad_loteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_caducidad_loteDetalleTransferencia.add(jButtonfecha_caducidad_loteDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_caducidad_loteDetalleTransferencia.add(jDateChooserfecha_caducidad_loteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_comprobanteDetalleTransferencia.add(jLabelnumero_comprobanteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_comprobanteDetalleTransferencia.add(jButtonnumero_comprobanteDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_comprobanteDetalleTransferencia.add(jTextFieldnumero_comprobanteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellote_clienteDetalleTransferencia.add(jLabellote_clienteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		//this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = 2;
		this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
		this.gridBagConstraintsDetalleTransferencia.insets = new Insets(0, 0, 0, 0);
		this.jPanellote_clienteDetalleTransferencia.add(jButtonlote_clienteDetalleTransferenciaBusqueda, this.gridBagConstraintsDetalleTransferencia);
	}

	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleTransferencia.gridy = 0;
	this.gridBagConstraintsDetalleTransferencia.gridx = 1;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellote_clienteDetalleTransferencia.add(jTextFieldlote_clienteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposOcultosDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposOcultosDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTransferencia.add(this.jPanelid_empresaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposOcultosDetalleTransferencia % 1==0) {
		iXPanelCamposOcultosDetalleTransferencia=0;
		iYPanelCamposOcultosDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposOcultosDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposOcultosDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTransferencia.add(this.jPanelid_sucursalDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposOcultosDetalleTransferencia % 1==0) {
		iXPanelCamposOcultosDetalleTransferencia=0;
		iYPanelCamposOcultosDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposOcultosDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposOcultosDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTransferencia.add(this.jPanelid_ejercicioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposOcultosDetalleTransferencia % 1==0) {
		iXPanelCamposOcultosDetalleTransferencia=0;
		iYPanelCamposOcultosDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposOcultosDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposOcultosDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTransferencia.add(this.jPanelid_periodoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposOcultosDetalleTransferencia % 1==0) {
		iXPanelCamposOcultosDetalleTransferencia=0;
		iYPanelCamposOcultosDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposOcultosDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposOcultosDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTransferencia.add(this.jPanelid_anioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposOcultosDetalleTransferencia % 1==0) {
		iXPanelCamposOcultosDetalleTransferencia=0;
		iYPanelCamposOcultosDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposOcultosDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposOcultosDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTransferencia.add(this.jPanelid_mesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposOcultosDetalleTransferencia % 1==0) {
		iXPanelCamposOcultosDetalleTransferencia=0;
		iYPanelCamposOcultosDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposOcultosDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposOcultosDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTransferencia.add(this.jPaneldescuentoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposOcultosDetalleTransferencia % 1==0) {
		iXPanelCamposOcultosDetalleTransferencia=0;
		iYPanelCamposOcultosDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposOcultosDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposOcultosDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTransferencia.add(this.jPanelnumero_comprobanteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposOcultosDetalleTransferencia % 2==0) {
		iXPanelCamposOcultosDetalleTransferencia=0;
		iYPanelCamposOcultosDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposOcultosDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposOcultosDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleTransferencia.add(this.jPanellote_clienteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposOcultosDetalleTransferencia % 2==0) {
		iXPanelCamposOcultosDetalleTransferencia=0;
		iYPanelCamposOcultosDetalleTransferencia++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneralDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneralDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleTransferencia.add(this.jPanelidDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneralDetalleTransferencia % 1==0) {
		iXPanelCamposIniciogeneralDetalleTransferencia=0;
		iYPanelCamposIniciogeneralDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneralDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneralDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleTransferencia.add(this.jPanelid_transferenciaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneralDetalleTransferencia % 1==0) {
		iXPanelCamposIniciogeneralDetalleTransferencia=0;
		iYPanelCamposIniciogeneralDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneralDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneralDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleTransferencia.add(this.jPanelid_bodegaDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneralDetalleTransferencia % 1==0) {
		iXPanelCamposIniciogeneralDetalleTransferencia=0;
		iYPanelCamposIniciogeneralDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneralDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneralDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleTransferencia.add(this.jPanelid_productoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneralDetalleTransferencia % 1==0) {
		iXPanelCamposIniciogeneralDetalleTransferencia=0;
		iYPanelCamposIniciogeneralDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneralDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneralDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleTransferencia.add(this.jPanelid_unidadDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneralDetalleTransferencia % 1==0) {
		iXPanelCamposIniciogeneralDetalleTransferencia=0;
		iYPanelCamposIniciogeneralDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneralDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneralDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleTransferencia.add(this.jPanelid_bodega_enviarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneralDetalleTransferencia % 1==0) {
		iXPanelCamposIniciogeneralDetalleTransferencia=0;
		iYPanelCamposIniciogeneralDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneralDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneralDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleTransferencia.add(this.jPaneldescripcionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneralDetalleTransferencia % 1==0) {
		iXPanelCamposIniciogeneralDetalleTransferencia=0;
		iYPanelCamposIniciogeneralDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneralDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneralDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleTransferencia.add(this.jPanelid_novedad_productoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneralDetalleTransferencia % 1==0) {
		iXPanelCamposIniciogeneralDetalleTransferencia=0;
		iYPanelCamposIniciogeneralDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneralDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneralDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneralDetalleTransferencia.add(this.jPanelid_estado_detalle_inventarioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneralDetalleTransferencia % 1==0) {
		iXPanelCamposIniciogeneralDetalleTransferencia=0;
		iYPanelCamposIniciogeneralDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciovaloresDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciovaloresDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleTransferencia.add(this.jPanelcantidadDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciovaloresDetalleTransferencia % 1==0) {
		iXPanelCamposIniciovaloresDetalleTransferencia=0;
		iYPanelCamposIniciovaloresDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciovaloresDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciovaloresDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleTransferencia.add(this.jPanelcosto_unitarioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciovaloresDetalleTransferencia % 1==0) {
		iXPanelCamposIniciovaloresDetalleTransferencia=0;
		iYPanelCamposIniciovaloresDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciovaloresDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciovaloresDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleTransferencia.add(this.jPanelcosto_totalDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciovaloresDetalleTransferencia % 1==0) {
		iXPanelCamposIniciovaloresDetalleTransferencia=0;
		iYPanelCamposIniciovaloresDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciovaloresDetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciovaloresDetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciovaloresDetalleTransferencia.add(this.jPaneldisponibleDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciovaloresDetalleTransferencia % 1==0) {
		iXPanelCamposIniciovaloresDetalleTransferencia=0;
		iYPanelCamposIniciovaloresDetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneral2DetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneral2DetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneral2DetalleTransferencia.add(this.jPanelloteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneral2DetalleTransferencia % 2==0) {
		iXPanelCamposIniciogeneral2DetalleTransferencia=0;
		iYPanelCamposIniciogeneral2DetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneral2DetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneral2DetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneral2DetalleTransferencia.add(this.jPanelfecha_elaboracion_loteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneral2DetalleTransferencia % 2==0) {
		iXPanelCamposIniciogeneral2DetalleTransferencia=0;
		iYPanelCamposIniciogeneral2DetalleTransferencia++;
	}
	this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleTransferencia.gridy = iYPanelCamposIniciogeneral2DetalleTransferencia;
	this.gridBagConstraintsDetalleTransferencia.gridx = iXPanelCamposIniciogeneral2DetalleTransferencia++;
	this.gridBagConstraintsDetalleTransferencia.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleTransferencia.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposIniciogeneral2DetalleTransferencia.add(this.jPanelfecha_caducidad_loteDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);



	if(iXPanelCamposIniciogeneral2DetalleTransferencia % 2==0) {
		iXPanelCamposIniciogeneral2DetalleTransferencia=0;
		iYPanelCamposIniciogeneral2DetalleTransferencia++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleTransferencia= new GridBagLayout();
		this.jPanelAccionesDetalleTransferencia.setLayout(gridaBagLayoutAccionesDetalleTransferencia);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleTransferencia= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleTransferencia.setLayout(gridaBagLayoutAccionesFormularioDetalleTransferencia);
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleTransferencia.add(this.jComboBoxTiposAccionesFormularioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleTransferencia.add(this.jCheckBoxPostAccionNuevoDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalletransferenciaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleTransferencia.add(this.jCheckBoxPostAccionSinCerrarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalletransferenciaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalletransferenciaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleTransferencia.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleTransferencia.add(this.jCheckBoxPostAccionSinMensajeDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleTransferencia.add(this.jButtonModificarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);							

		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;
		this.gridBagConstraintsDetalleTransferencia.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleTransferencia.add(this.jButtonEliminarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
			
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleTransferencia.add(this.jButtonActualizarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);


		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;		
		this.gridBagConstraintsDetalleTransferencia.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleTransferencia.add(this.jButtonGuardarCambiosDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);	
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = 0;		
		this.gridBagConstraintsDetalleTransferencia.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleTransferencia.add(this.jButtonCancelarDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleTransferencia = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleTransferencia);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalletransferenciaSessionBean.getEsGuardarRelacionado()) {			
			/*									
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();						
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleTransferencia.gridx = 0;		
			//this.gridBagConstraintsDetalleTransferencia.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleTransferencia.ipadx = 100;
				
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
		
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleTransferencia.gridx =0;
		this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleTransferencia.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleTransferenciaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleTransferencia = new DetalleTransferenciaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Transferencia DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Transferencia DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Transferencia Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleTransferenciaModel detalletransferenciaModel=new DetalleTransferenciaModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleTransferenciaModel.DetalleTransferenciaFocusTraversalPolicy detalletransferenciaFocusTraversalPolicy = detalletransferenciaModel.new DetalleTransferenciaFocusTraversalPolicy(this);
			
			//detalletransferenciaFocusTraversalPolicy.setdetalletransferenciaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalletransferenciaModel);
			
			
			this.jContentPaneDetalleDetalleTransferencia = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleTransferencia = new GridBagLayout();	
			this.jContentPaneDetalleDetalleTransferencia.setLayout(gridaBagLayoutDetalleDetalleTransferencia);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleTransferencia = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				/*
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
				this.gridBagConstraintsDetalleTransferencia.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleTransferencia.gridx = 0;
					
				this.gridBagConstraintsDetalleTransferencia.gridwidth=2;
				
				this.jContentPaneDetalleDetalleTransferencia.add(jTtoolBarDetalleDetalleTransferencia, gridBagConstraintsDetalleTransferencia);								
				*/
}
			
			this.jScrollPanelDatosEdicionDetalleTransferencia=   new JScrollPane(jContentPaneDetalleDetalleTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleTransferencia=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			
			
			
			
			//if(!this.conCargarMinimo) {
			


		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsDetalleTransferencia.gridy = iGridyRelaciones++;
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
		this.gridBagConstraintsDetalleTransferencia.gridwidth = 2;
		this.gridBagConstraintsDetalleTransferencia.gridheight = 1;
		iGridyRelaciones = iGridyRelaciones++;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleTransferencia.add(jPanelCamposIniciogeneralDetalleTransferencia, gridBagConstraintsDetalleTransferencia);


		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsDetalleTransferencia.gridy = 1;
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
		this.gridBagConstraintsDetalleTransferencia.gridwidth = 2;
		this.gridBagConstraintsDetalleTransferencia.gridheight = 1;
		iGridyRelaciones = 1;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleTransferencia.add(jPanelCamposIniciovaloresDetalleTransferencia, gridBagConstraintsDetalleTransferencia);


		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.fill=GridBagConstraints.NONE;
		this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.CENTER;

		this.gridBagConstraintsDetalleTransferencia.gridy = 2;
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
		this.gridBagConstraintsDetalleTransferencia.gridwidth = 2;
		this.gridBagConstraintsDetalleTransferencia.gridheight = 1;
		iGridyRelaciones = 2;
		iGridyRelaciones++;

		this.jContentPaneDetalleDetalleTransferencia.add(jPanelCamposIniciogeneral2DetalleTransferencia, gridBagConstraintsDetalleTransferencia);
			
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
						&& detalletransferenciaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalletransferenciaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleTransferencia= new GridBagConstraints();
						this.gridBagConstraintsDetalleTransferencia.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleTransferencia.gridx = 0;
						this.jContentPaneDetalleDetalleTransferencia.add(this.jTabbedPaneRelacionesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleTransferencia.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleTransferencia.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
					this.gridBagConstraintsDetalleTransferencia.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleTransferencia.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleTransferencia.gridx = 0;
					
					this.gridBagConstraintsDetalleTransferencia.gridwidth=2;
				
					this.jContentPaneDetalleDetalleTransferencia.add(jPanelCamposOcultosDetalleTransferencia, gridBagConstraintsDetalleTransferencia);
				
					this.jPanelCamposOcultosDetalleTransferencia.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	        this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.CENTER;//WEST;
			
			this.gridBagConstraintsDetalleTransferencia.gridwidth=2;
			
			
			this.jContentPaneDetalleDetalleTransferencia.add(this.jPanelAccionesFormularioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);							
			
			
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
	        this.gridBagConstraintsDetalleTransferencia.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleTransferencia.gridx = 0;
	        
			this.gridBagConstraintsDetalleTransferencia.gridwidth=2;
			
			this.jContentPaneDetalleDetalleTransferencia.add(this.jPanelAccionesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleTransferencia);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleTransferencia=   new JScrollPane(this.jPanelCamposDetalleTransferencia,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleTransferencia.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTransferencia.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleTransferencia.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleTransferencia.gridx = 0;
			this.gridBagConstraintsDetalleTransferencia.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleTransferencia.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleTransferencia.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleTransferencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);			
			
			this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
			this.gridBagConstraintsDetalleTransferencia.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleTransferencia.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
			
			
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTransferencia.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		
			
		this.gridBagConstraintsDetalleTransferencia = new GridBagConstraints();
		this.gridBagConstraintsDetalleTransferencia.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleTransferencia.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleTransferencia, this.gridBagConstraintsDetalleTransferencia);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleTransferencia;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleTransferencia;
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
