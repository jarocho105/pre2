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
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
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
import com.bydan.erp.inventario.util.RequisicionCompraConstantesFunciones;

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
public class RequisicionCompraDetalleFormJInternalFrame extends RequisicionCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRequisicionCompra;
	
	protected JMenuBar jmenuBarDetalleRequisicionCompra;
	
	protected JMenu jmenuDetalleRequisicionCompra;
	protected JMenu jmenuDetalleArchivoRequisicionCompra;
	protected JMenu jmenuDetalleAccionesRequisicionCompra;
	protected JMenu jmenuDetalleDatosRequisicionCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRequisicionCompra;	
	protected GridBagConstraints gridBagConstraintsRequisicionCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RequisicionCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleRequisicionCompra;		
	
	
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

	protected ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_cliente="";

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";

	protected MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_moneda="";

	protected EstadoRequisicionBeanSwingJInternalFrame estadorequisicioncompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_estadorequisicioncompra="";

	protected EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empleado="";

	protected FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_formato="";

	protected TipoCambioBeanSwingJInternalFrame tipocambioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocambio="";
	
	public RequisicionCompraSessionBean requisicioncompraSessionBean;
	
	

	public DetalleRequisicionCompraBeanSwingJInternalFrame detallerequisicioncompraBeanSwingJInternalFrame=null;
	public DetalleRequisicionCompraBeanSwingJInternalFrame detallerequisicioncompraBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleRequisicionCompra=false;
	public DetalleRequisicionCompraSessionBean detallerequisicioncompraSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public ClienteSessionBean clienteSessionBean;
	public UsuarioSessionBean usuarioSessionBean;
	public MonedaSessionBean monedaSessionBean;
	public EstadoRequisicionSessionBean estadorequisicioncompraSessionBean;
	public EmpleadoSessionBean empleadoSessionBean;
	public FormatoSessionBean formatoSessionBean;
	public TipoCambioSessionBean tipocambioSessionBean;	
	
	public RequisicionCompraLogic requisicioncompraLogic;
	
	public JScrollPane jScrollPanelDatosRequisicionCompra;
	public JScrollPane jScrollPanelDatosEdicionRequisicionCompra;
	public JScrollPane jScrollPanelDatosGeneralRequisicionCompra;
	
	protected JPanel jPanelCamposRequisicionCompra;    
	protected JPanel jPanelCamposOcultosRequisicionCompra;    	
	protected JPanel jPanelAccionesRequisicionCompra;
	protected JPanel jPanelAccionesFormularioRequisicionCompra;
    
	
	
	protected Integer iXPanelCamposRequisicionCompra=0;
	protected Integer iYPanelCamposRequisicionCompra=0;
	
	protected Integer iXPanelCamposOcultosRequisicionCompra=0;
	protected Integer iYPanelCamposOcultosRequisicionCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRequisicionCompra;
	public JButton jButtonModificarRequisicionCompra;
	public JButton jButtonActualizarRequisicionCompra;
    public JButton jButtonEliminarRequisicionCompra;
	public JButton jButtonCancelarRequisicionCompra;
    public JButton jButtonGuardarCambiosRequisicionCompra;
	public JButton jButtonGuardarCambiosTablaRequisicionCompra;
	protected JButton jButtonCerrarRequisicionCompra;
	
	
	protected JButton jButtonProcesarInformacionRequisicionCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRequisicionCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRequisicionCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRequisicionCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRequisicionCompra;
	protected JButton jButtonModificarToolBarRequisicionCompra;
	protected JButton jButtonActualizarToolBarRequisicionCompra;
    protected JButton jButtonEliminarToolBarRequisicionCompra;
	protected JButton jButtonCancelarToolBarRequisicionCompra;
    protected JButton jButtonGuardarCambiosToolBarRequisicionCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarRequisicionCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarRequisicionCompra;
	protected JButton jButtonCerrarToolBarRequisicionCompra;
	
	protected JButton jButtonProcesarInformacionToolBarRequisicionCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRequisicionCompra;
	protected JMenuItem jMenuItemModificarRequisicionCompra;
	protected JMenuItem jMenuItemActualizarRequisicionCompra;
    protected JMenuItem jMenuItemEliminarRequisicionCompra;
	protected JMenuItem jMenuItemCancelarRequisicionCompra;
    protected JMenuItem jMenuItemGuardarCambiosRequisicionCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaRequisicionCompra;
	protected JMenuItem jMenuItemCerrarRequisicionCompra;
	protected JMenuItem jMenuItemDetalleCerrarRequisicionCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarRequisicionCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionRequisicionCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRequisicionCompra;
	protected JMenuItem jMenuItemMostrarOcultarRequisicionCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRequisicionCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRequisicionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRequisicionCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRequisicionCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRequisicionCompra;
	public JLabel jLabelIdRequisicionCompra;
	public JLabel jLabelidRequisicionCompra;
	public JButton jButtonidRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialRequisicionCompra;
	public JLabel jLabelnumero_secuencialRequisicionCompra;
	public JTextField jTextFieldnumero_secuencialRequisicionCompra;
	public JButton jButtonnumero_secuencialRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPaneltotalRequisicionCompra;
	public JLabel jLabeltotalRequisicionCompra;
	public JTextField jTextFieldtotalRequisicionCompra;
	public JButton jButtontotalRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelfechaRequisicionCompra;
	public JLabel jLabelfechaRequisicionCompra;
	//public JFormattedTextField jDateChooserfechaRequisicionCompra;

	public JDateChooser jDateChooserfechaRequisicionCompra;
	public JButton jButtonfechaRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelresponsableRequisicionCompra;
	public JLabel jLabelresponsableRequisicionCompra;
	public JTextArea jTextArearesponsableRequisicionCompra;
	public JScrollPane jscrollPaneresponsableRequisicionCompra;
	public JButton jButtonresponsableRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelsolicitado_porRequisicionCompra;
	public JLabel jLabelsolicitado_porRequisicionCompra;
	public JTextArea jTextAreasolicitado_porRequisicionCompra;
	public JScrollPane jscrollPanesolicitado_porRequisicionCompra;
	public JButton jButtonsolicitado_porRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelmotivo_solicitudRequisicionCompra;
	public JLabel jLabelmotivo_solicitudRequisicionCompra;
	public JTextArea jTextAreamotivo_solicitudRequisicionCompra;
	public JScrollPane jscrollPanemotivo_solicitudRequisicionCompra;
	public JButton jButtonmotivo_solicitudRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelarea_solicitudRequisicionCompra;
	public JLabel jLabelarea_solicitudRequisicionCompra;
	public JTextArea jTextAreaarea_solicitudRequisicionCompra;
	public JScrollPane jscrollPanearea_solicitudRequisicionCompra;
	public JButton jButtonarea_solicitudRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelpara_uso_deRequisicionCompra;
	public JLabel jLabelpara_uso_deRequisicionCompra;
	public JTextArea jTextAreapara_uso_deRequisicionCompra;
	public JScrollPane jscrollPanepara_uso_deRequisicionCompra;
	public JButton jButtonpara_uso_deRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanellugar_entregaRequisicionCompra;
	public JLabel jLabellugar_entregaRequisicionCompra;
	public JTextField jTextFieldlugar_entregaRequisicionCompra;
	public JButton jButtonlugar_entregaRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionRequisicionCompra;
	public JLabel jLabeldescripcionRequisicionCompra;
	public JTextArea jTextAreadescripcionRequisicionCompra;
	public JScrollPane jscrollPanedescripcionRequisicionCompra;
	public JButton jButtondescripcionRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionRequisicionCompra;
	public JLabel jLabelfecha_emisionRequisicionCompra;
	//public JFormattedTextField jDateChooserfecha_emisionRequisicionCompra;

	public JDateChooser jDateChooserfecha_emisionRequisicionCompra;
	public JButton jButtonfecha_emisionRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelfecha_entregaRequisicionCompra;
	public JLabel jLabelfecha_entregaRequisicionCompra;
	//public JFormattedTextField jDateChooserfecha_entregaRequisicionCompra;

	public JDateChooser jDateChooserfecha_entregaRequisicionCompra;
	public JButton jButtonfecha_entregaRequisicionCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRequisicionCompra;
	public JLabel jLabelid_empresaRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRequisicionCompra;
	public JButton jButtonid_empresaRequisicionCompra= new JButtonMe();
	public JButton jButtonid_empresaRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalRequisicionCompra;
	public JLabel jLabelid_sucursalRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalRequisicionCompra;
	public JButton jButtonid_sucursalRequisicionCompra= new JButtonMe();
	public JButton jButtonid_sucursalRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloRequisicionCompra;
	public JLabel jLabelid_moduloRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloRequisicionCompra;
	public JButton jButtonid_moduloRequisicionCompra= new JButtonMe();
	public JButton jButtonid_moduloRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_moduloRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioRequisicionCompra;
	public JLabel jLabelid_ejercicioRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioRequisicionCompra;
	public JButton jButtonid_ejercicioRequisicionCompra= new JButtonMe();
	public JButton jButtonid_ejercicioRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoRequisicionCompra;
	public JLabel jLabelid_periodoRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoRequisicionCompra;
	public JButton jButtonid_periodoRequisicionCompra= new JButtonMe();
	public JButton jButtonid_periodoRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_periodoRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_anioRequisicionCompra;
	public JLabel jLabelid_anioRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioRequisicionCompra;
	public JButton jButtonid_anioRequisicionCompra= new JButtonMe();
	public JButton jButtonid_anioRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_anioRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_mesRequisicionCompra;
	public JLabel jLabelid_mesRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesRequisicionCompra;
	public JButton jButtonid_mesRequisicionCompra= new JButtonMe();
	public JButton jButtonid_mesRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_mesRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_clienteRequisicionCompra;
	public JLabel jLabelid_clienteRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_clienteRequisicionCompra;
	public JButton jButtonid_clienteRequisicionCompra= new JButtonMe();
	public JButton jButtonid_clienteRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_clienteRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_usuarioRequisicionCompra;
	public JLabel jLabelid_usuarioRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioRequisicionCompra;
	public JButton jButtonid_usuarioRequisicionCompra= new JButtonMe();
	public JButton jButtonid_usuarioRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_usuarioRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_monedaRequisicionCompra;
	public JLabel jLabelid_monedaRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_monedaRequisicionCompra;
	public JButton jButtonid_monedaRequisicionCompra= new JButtonMe();
	public JButton jButtonid_monedaRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_monedaRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_estado_requisicion_compraRequisicionCompra;
	public JLabel jLabelid_estado_requisicion_compraRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_estado_requisicion_compraRequisicionCompra;
	public JButton jButtonid_estado_requisicion_compraRequisicionCompra= new JButtonMe();
	public JButton jButtonid_estado_requisicion_compraRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_estado_requisicion_compraRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_empleadoRequisicionCompra;
	public JLabel jLabelid_empleadoRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empleadoRequisicionCompra;
	public JButton jButtonid_empleadoRequisicionCompra= new JButtonMe();
	public JButton jButtonid_empleadoRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_empleadoRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_formatoRequisicionCompra;
	public JLabel jLabelid_formatoRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_formatoRequisicionCompra;
	public JButton jButtonid_formatoRequisicionCompra= new JButtonMe();
	public JButton jButtonid_formatoRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_formatoRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_cambioRequisicionCompra;
	public JLabel jLabelid_tipo_cambioRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_cambioRequisicionCompra;
	public JButton jButtonid_tipo_cambioRequisicionCompra= new JButtonMe();
	public JButton jButtonid_tipo_cambioRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_tipo_cambioRequisicionCompraBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRequisicionCompra;
	
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
		
	public int iWidthFormulario=1050;//(screenSize.width-screenSize.width/2)+(250*2);
	public int iHeightFormulario=579;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public RequisicionCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRequisicionCompra=new JPanel();
				this.jPanelAccionesFormularioRequisicionCompra=new JPanel();
				this.jmenuBarDetalleRequisicionCompra=new JMenuBar();
				this.jTtoolBarDetalleRequisicionCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RequisicionCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RequisicionCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRequisicionCompra() {
		return this.jButtonActualizarToolBarRequisicionCompra;
	}
	
	public JButton getjButtonEliminarToolBarRequisicionCompra() {
		return this.jButtonEliminarToolBarRequisicionCompra;
	}
	
	public JButton getjButtonCancelarToolBarRequisicionCompra() {
		return this.jButtonCancelarToolBarRequisicionCompra;
	}		
	
	public JButton getjButtonProcesarInformacionRequisicionCompra() {
		return this.jButtonProcesarInformacionRequisicionCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRequisicionCompra)	{
		this.jButtonProcesarInformacionRequisicionCompra = jButtonProcesarInformacionRequisicionCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRequisicionCompra() {
		return this.jComboBoxTiposAccionesRequisicionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRequisicionCompra(
			JComboBox jComboBoxTiposRelacionesRequisicionCompra) {
		this.jComboBoxTiposRelacionesRequisicionCompra = jComboBoxTiposRelacionesRequisicionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRequisicionCompra(
			JComboBox jComboBoxTiposAccionesRequisicionCompra) {
		this.jComboBoxTiposAccionesRequisicionCompra = jComboBoxTiposAccionesRequisicionCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRequisicionCompra() {
		return this.jComboBoxTiposAccionesFormularioRequisicionCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRequisicionCompra(
			JComboBox jComboBoxTiposAccionesFormularioRequisicionCompra) {
		this.jComboBoxTiposAccionesFormularioRequisicionCompra = jComboBoxTiposAccionesFormularioRequisicionCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.requisicioncompraSessionBean=new RequisicionCompraSessionBean();
		
		this.requisicioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.requisicioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.requisicioncompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=opcionActual.getcon_mostrar_acciones_campo();
		
		if(!this.conMostrarAccionesCampo) {
			this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_relaciones();
		}
		
		if(!this.conCargarMinimo) {
		
		//this.detallerequisicioncompraSessionBean=new DetalleRequisicionCompraSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RequisicionCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Requisicion Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {
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
	
		RequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRequisicionCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRequisicionCompra=new JButtonMe();
				this.jButtonModificarToolBarRequisicionCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"actualizar","actualizar","Actualizar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"eliminar","eliminar","Eliminar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"cancelar","cancelar","Cancelar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRequisicionCompra,this.jTtoolBarDetalleRequisicionCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRequisicionCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRequisicionCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRequisicionCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRequisicionCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRequisicionCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRequisicionCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRequisicionCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRequisicionCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRequisicionCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRequisicionCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRequisicionCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRequisicionCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRequisicionCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRequisicionCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRequisicionCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRequisicionCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRequisicionCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRequisicionCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRequisicionCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRequisicionCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRequisicionCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRequisicionCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRequisicionCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRequisicionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRequisicionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRequisicionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRequisicionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRequisicionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRequisicionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRequisicionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRequisicionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRequisicionCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRequisicionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRequisicionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRequisicionCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRequisicionCompra.add(this.jMenuItemDetalleCerrarRequisicionCompra);
		
		this.jmenuDetalleAccionesRequisicionCompra.add(this.jMenuItemActualizarRequisicionCompra);
		this.jmenuDetalleAccionesRequisicionCompra.add(this.jMenuItemEliminarRequisicionCompra);
		this.jmenuDetalleAccionesRequisicionCompra.add(this.jMenuItemCancelarRequisicionCompra);		
		
		//this.jmenuDetalleDatosRequisicionCompra.add(this.jMenuItemDetalleAbrirOrderByRequisicionCompra);				
		this.jmenuDetalleDatosRequisicionCompra.add(this.jMenuItemDetalleMostarOcultarRequisicionCompra);				
				
		//this.jmenuDetalleAccionesRequisicionCompra.add(this.jMenuItemGuardarCambiosRequisicionCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRequisicionCompra.add(this.jmenuDetalleArchivoRequisicionCompra);		
		this.jmenuBarDetalleRequisicionCompra.add(this.jmenuDetalleAccionesRequisicionCompra);		
		this.jmenuBarDetalleRequisicionCompra.add(this.jmenuDetalleDatosRequisicionCompra);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleRequisicionCompra.add(this.jmenuDetalleRequisicionCompra);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
	}
	
	
	public void inicializarElementosCamposRequisicionCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRequisicionCompra = new JLabelMe();
		jLabelIdRequisicionCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRequisicionCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRequisicionCompra= new GridBagLayout();

		this.jPanelidRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);

		jLabelidRequisicionCompra = new JLabel();
		jLabelidRequisicionCompra.setText("Id");

		jLabelidRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_secuencialRequisicionCompra = new JLabelMe();
		this.jLabelnumero_secuencialRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialRequisicionCompra.setToolTipText("No Secuencial");
		this.jLabelnumero_secuencialRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelnumero_secuencialRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jTextFieldnumero_secuencialRequisicionCompra= new JTextFieldMe();

		jTextFieldnumero_secuencialRequisicionCompra.setEnabled(false);
		jTextFieldnumero_secuencialRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldnumero_secuencialRequisicionCompra.setEnabled(false);
		this.jButtonnumero_secuencialRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialRequisicionCompraBusqueda.setText("U");
		this.jButtonnumero_secuencialRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabeltotalRequisicionCompra = new JLabelMe();
		this.jLabeltotalRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalRequisicionCompra.setToolTipText("Total");
		this.jLabeltotalRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPaneltotalRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jTextFieldtotalRequisicionCompra= new JTextFieldMe();
		jTextFieldtotalRequisicionCompra.setEnabled(false);
		jTextFieldtotalRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalRequisicionCompra.setText("0.0");

		this.jButtontotalRequisicionCompraBusqueda= new JButtonMe();
		this.jButtontotalRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalRequisicionCompraBusqueda.setText("U");
		this.jButtontotalRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelfechaRequisicionCompra = new JLabelMe();
		this.jLabelfechaRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_FECHA+" : *");
		this.jLabelfechaRequisicionCompra.setToolTipText("Fecha");
		this.jLabelfechaRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfechaRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfechaRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfechaRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfechaRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_FECHA);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelfechaRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		//jFormattedTextFieldfechaRequisicionCompra= new JFormattedTextFieldMe();

		jDateChooserfechaRequisicionCompra= new JDateChooser();
		jDateChooserfechaRequisicionCompra.setEnabled(false);
		jDateChooserfechaRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfechaRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfechaRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfechaRequisicionCompra.setDate(new Date());
		jDateChooserfechaRequisicionCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfechaRequisicionCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfechaRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonfechaRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfechaRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfechaRequisicionCompraBusqueda.setText("U");
		this.jButtonfechaRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfechaRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfechaRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfechaRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfechaRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fechaRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfechaRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelresponsableRequisicionCompra = new JLabelMe();
		this.jLabelresponsableRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_RESPONSABLE+" :");
		this.jLabelresponsableRequisicionCompra.setToolTipText("Responsable");
		this.jLabelresponsableRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelresponsableRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelresponsableRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelresponsableRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelresponsableRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_RESPONSABLE);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelresponsableRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jTextArearesponsableRequisicionCompra= new JTextAreaMe();
		jTextArearesponsableRequisicionCompra.setEnabled(false);
		jTextArearesponsableRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextArearesponsableRequisicionCompra.setLineWrap(true);
		jTextArearesponsableRequisicionCompra.setWrapStyleWord(true);
		jTextArearesponsableRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextArearesponsableRequisicionCompra.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextArearesponsableRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneresponsableRequisicionCompra = new JScrollPane(jTextArearesponsableRequisicionCompra);
		jscrollPaneresponsableRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneresponsableRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPaneresponsableRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonresponsableRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonresponsableRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonresponsableRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonresponsableRequisicionCompraBusqueda.setText("U");
		this.jButtonresponsableRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonresponsableRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonresponsableRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextArearesponsableRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextArearesponsableRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"responsableRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonresponsableRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelsolicitado_porRequisicionCompra = new JLabelMe();
		this.jLabelsolicitado_porRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_SOLICITADOPOR+" :");
		this.jLabelsolicitado_porRequisicionCompra.setToolTipText("Solicitado Por");
		this.jLabelsolicitado_porRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsolicitado_porRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsolicitado_porRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsolicitado_porRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsolicitado_porRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsolicitado_porRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_SOLICITADOPOR);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelsolicitado_porRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jTextAreasolicitado_porRequisicionCompra= new JTextAreaMe();
		jTextAreasolicitado_porRequisicionCompra.setEnabled(false);
		jTextAreasolicitado_porRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasolicitado_porRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasolicitado_porRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreasolicitado_porRequisicionCompra.setLineWrap(true);
		jTextAreasolicitado_porRequisicionCompra.setWrapStyleWord(true);
		jTextAreasolicitado_porRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreasolicitado_porRequisicionCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreasolicitado_porRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanesolicitado_porRequisicionCompra = new JScrollPane(jTextAreasolicitado_porRequisicionCompra);
		jscrollPanesolicitado_porRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanesolicitado_porRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanesolicitado_porRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonsolicitado_porRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonsolicitado_porRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsolicitado_porRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsolicitado_porRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsolicitado_porRequisicionCompraBusqueda.setText("U");
		this.jButtonsolicitado_porRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsolicitado_porRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsolicitado_porRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreasolicitado_porRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreasolicitado_porRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"solicitado_porRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsolicitado_porRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelmotivo_solicitudRequisicionCompra = new JLabelMe();
		this.jLabelmotivo_solicitudRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_MOTIVOSOLICITUD+" : *");
		this.jLabelmotivo_solicitudRequisicionCompra.setToolTipText("Motivo Solicitud");
		this.jLabelmotivo_solicitudRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmotivo_solicitudRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelmotivo_solicitudRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelmotivo_solicitudRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelmotivo_solicitudRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelmotivo_solicitudRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_MOTIVOSOLICITUD);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelmotivo_solicitudRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jTextAreamotivo_solicitudRequisicionCompra= new JTextAreaMe();
		jTextAreamotivo_solicitudRequisicionCompra.setEnabled(false);
		jTextAreamotivo_solicitudRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamotivo_solicitudRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamotivo_solicitudRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreamotivo_solicitudRequisicionCompra.setLineWrap(true);
		jTextAreamotivo_solicitudRequisicionCompra.setWrapStyleWord(true);
		jTextAreamotivo_solicitudRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreamotivo_solicitudRequisicionCompra.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreamotivo_solicitudRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanemotivo_solicitudRequisicionCompra = new JScrollPane(jTextAreamotivo_solicitudRequisicionCompra);
		jscrollPanemotivo_solicitudRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanemotivo_solicitudRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanemotivo_solicitudRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonmotivo_solicitudRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonmotivo_solicitudRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmotivo_solicitudRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonmotivo_solicitudRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonmotivo_solicitudRequisicionCompraBusqueda.setText("U");
		this.jButtonmotivo_solicitudRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonmotivo_solicitudRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonmotivo_solicitudRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreamotivo_solicitudRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreamotivo_solicitudRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"motivo_solicitudRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonmotivo_solicitudRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelarea_solicitudRequisicionCompra = new JLabelMe();
		this.jLabelarea_solicitudRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_AREASOLICITUD+" :");
		this.jLabelarea_solicitudRequisicionCompra.setToolTipText("Area Solicitud");
		this.jLabelarea_solicitudRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarea_solicitudRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelarea_solicitudRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelarea_solicitudRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelarea_solicitudRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelarea_solicitudRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_AREASOLICITUD);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelarea_solicitudRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jTextAreaarea_solicitudRequisicionCompra= new JTextAreaMe();
		jTextAreaarea_solicitudRequisicionCompra.setEnabled(false);
		jTextAreaarea_solicitudRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaarea_solicitudRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaarea_solicitudRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaarea_solicitudRequisicionCompra.setLineWrap(true);
		jTextAreaarea_solicitudRequisicionCompra.setWrapStyleWord(true);
		jTextAreaarea_solicitudRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaarea_solicitudRequisicionCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaarea_solicitudRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanearea_solicitudRequisicionCompra = new JScrollPane(jTextAreaarea_solicitudRequisicionCompra);
		jscrollPanearea_solicitudRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanearea_solicitudRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanearea_solicitudRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonarea_solicitudRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonarea_solicitudRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarea_solicitudRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonarea_solicitudRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonarea_solicitudRequisicionCompraBusqueda.setText("U");
		this.jButtonarea_solicitudRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonarea_solicitudRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonarea_solicitudRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaarea_solicitudRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaarea_solicitudRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"area_solicitudRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonarea_solicitudRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelpara_uso_deRequisicionCompra = new JLabelMe();
		this.jLabelpara_uso_deRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_PARAUSODE+" : *");
		this.jLabelpara_uso_deRequisicionCompra.setToolTipText("Para Uso De");
		this.jLabelpara_uso_deRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_uso_deRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelpara_uso_deRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelpara_uso_deRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelpara_uso_deRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelpara_uso_deRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_PARAUSODE);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelpara_uso_deRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jTextAreapara_uso_deRequisicionCompra= new JTextAreaMe();
		jTextAreapara_uso_deRequisicionCompra.setEnabled(false);
		jTextAreapara_uso_deRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapara_uso_deRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapara_uso_deRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreapara_uso_deRequisicionCompra.setLineWrap(true);
		jTextAreapara_uso_deRequisicionCompra.setWrapStyleWord(true);
		jTextAreapara_uso_deRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreapara_uso_deRequisicionCompra.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreapara_uso_deRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanepara_uso_deRequisicionCompra = new JScrollPane(jTextAreapara_uso_deRequisicionCompra);
		jscrollPanepara_uso_deRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanepara_uso_deRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));
		jscrollPanepara_uso_deRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),35));

		this.jButtonpara_uso_deRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonpara_uso_deRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_uso_deRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonpara_uso_deRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonpara_uso_deRequisicionCompraBusqueda.setText("U");
		this.jButtonpara_uso_deRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonpara_uso_deRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonpara_uso_deRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreapara_uso_deRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreapara_uso_deRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"para_uso_deRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonpara_uso_deRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabellugar_entregaRequisicionCompra = new JLabelMe();
		this.jLabellugar_entregaRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_LUGARENTREGA+" :");
		this.jLabellugar_entregaRequisicionCompra.setToolTipText("Lugar Entrega");
		this.jLabellugar_entregaRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellugar_entregaRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabellugar_entregaRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabellugar_entregaRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanellugar_entregaRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanellugar_entregaRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_LUGARENTREGA);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanellugar_entregaRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jTextFieldlugar_entregaRequisicionCompra= new JTextFieldMe();

		jTextFieldlugar_entregaRequisicionCompra.setEnabled(false);
		jTextFieldlugar_entregaRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlugar_entregaRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldlugar_entregaRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldlugar_entregaRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonlugar_entregaRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonlugar_entregaRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlugar_entregaRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonlugar_entregaRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonlugar_entregaRequisicionCompraBusqueda.setText("U");
		this.jButtonlugar_entregaRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonlugar_entregaRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonlugar_entregaRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldlugar_entregaRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldlugar_entregaRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"lugar_entregaRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonlugar_entregaRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionRequisicionCompra = new JLabelMe();
		this.jLabeldescripcionRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionRequisicionCompra.setToolTipText("Descripcion");
		this.jLabeldescripcionRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPaneldescripcionRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jTextAreadescripcionRequisicionCompra= new JTextAreaMe();
		jTextAreadescripcionRequisicionCompra.setEnabled(false);
		jTextAreadescripcionRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRequisicionCompra.setLineWrap(true);
		jTextAreadescripcionRequisicionCompra.setWrapStyleWord(true);
		jTextAreadescripcionRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionRequisicionCompra.setRows(7);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionRequisicionCompra = new JScrollPane(jTextAreadescripcionRequisicionCompra);
		jscrollPanedescripcionRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedescripcionRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35 + FuncionesSwing.getValorProporcion(35,0)));
		jscrollPanedescripcionRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,200),35 + FuncionesSwing.getValorProporcion(35,0)));

		this.jButtondescripcionRequisicionCompraBusqueda= new JButtonMe();
		this.jButtondescripcionRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionRequisicionCompraBusqueda.setText("U");
		this.jButtondescripcionRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionRequisicionCompra = new JLabelMe();
		this.jLabelfecha_emisionRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionRequisicionCompra.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelfecha_emisionRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		//jFormattedTextFieldfecha_emisionRequisicionCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionRequisicionCompra= new JDateChooser();
		jDateChooserfecha_emisionRequisicionCompra.setEnabled(false);
		jDateChooserfecha_emisionRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionRequisicionCompra.setDate(new Date());
		jDateChooserfecha_emisionRequisicionCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionRequisicionCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonfecha_emisionRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionRequisicionCompraBusqueda.setText("U");
		this.jButtonfecha_emisionRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelfecha_entregaRequisicionCompra = new JLabelMe();
		this.jLabelfecha_entregaRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_FECHAENTREGA+" : *");
		this.jLabelfecha_entregaRequisicionCompra.setToolTipText("Fecha Entrega");
		this.jLabelfecha_entregaRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_entregaRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_entregaRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_entregaRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_entregaRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_FECHAENTREGA);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelfecha_entregaRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		//jFormattedTextFieldfecha_entregaRequisicionCompra= new JFormattedTextFieldMe();

		jDateChooserfecha_entregaRequisicionCompra= new JDateChooser();
		jDateChooserfecha_entregaRequisicionCompra.setEnabled(false);
		jDateChooserfecha_entregaRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_entregaRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_entregaRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_entregaRequisicionCompra.setDate(new Date());
		jDateChooserfecha_entregaRequisicionCompra.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_entregaRequisicionCompra.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_entregaRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonfecha_entregaRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_entregaRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_entregaRequisicionCompraBusqueda.setText("U");
		this.jButtonfecha_entregaRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_entregaRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_entregaRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_entregaRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_entregaRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_entregaRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_entregaRequisicionCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRequisicionCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRequisicionCompra = new JLabelMe();
		this.jLabelid_empresaRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRequisicionCompra.setToolTipText("Empresa");
		this.jLabelid_empresaRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_empresaRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_empresaRequisicionCompra= new JComboBoxMe();
		jComboBoxid_empresaRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRequisicionCompra.setEnabled(false);

		this.jButtonid_empresaRequisicionCompra= new JButtonMe();
		this.jButtonid_empresaRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRequisicionCompra.setText("Buscar");
		this.jButtonid_empresaRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRequisicionCompra"));

		this.jButtonid_empresaRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRequisicionCompraBusqueda.setText("U");
		this.jButtonid_empresaRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_empresaRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRequisicionCompraUpdate.setText("U");
		this.jButtonid_empresaRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRequisicionCompraUpdate"));



					
		this.jLabelid_sucursalRequisicionCompra = new JLabelMe();
		this.jLabelid_sucursalRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalRequisicionCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_sucursalRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_sucursalRequisicionCompra= new JComboBoxMe();
		jComboBoxid_sucursalRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalRequisicionCompra.setEnabled(false);

		this.jButtonid_sucursalRequisicionCompra= new JButtonMe();
		this.jButtonid_sucursalRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalRequisicionCompra.setText("Buscar");
		this.jButtonid_sucursalRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRequisicionCompra"));

		this.jButtonid_sucursalRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRequisicionCompraBusqueda.setText("U");
		this.jButtonid_sucursalRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalRequisicionCompraUpdate.setText("U");
		this.jButtonid_sucursalRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalRequisicionCompraUpdate"));



					
		this.jLabelid_moduloRequisicionCompra = new JLabelMe();
		this.jLabelid_moduloRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloRequisicionCompra.setToolTipText("Modulo");
		this.jLabelid_moduloRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_moduloRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_moduloRequisicionCompra= new JComboBoxMe();
		jComboBoxid_moduloRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloRequisicionCompra.setEnabled(false);

		this.jButtonid_moduloRequisicionCompra= new JButtonMe();
		this.jButtonid_moduloRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloRequisicionCompra.setText("Buscar");
		this.jButtonid_moduloRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloRequisicionCompra"));

		this.jButtonid_moduloRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_moduloRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloRequisicionCompraBusqueda.setText("U");
		this.jButtonid_moduloRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_moduloRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_moduloRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloRequisicionCompraUpdate.setText("U");
		this.jButtonid_moduloRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloRequisicionCompraUpdate"));



					
		this.jLabelid_ejercicioRequisicionCompra = new JLabelMe();
		this.jLabelid_ejercicioRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioRequisicionCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_ejercicioRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_ejercicioRequisicionCompra= new JComboBoxMe();
		jComboBoxid_ejercicioRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioRequisicionCompra.setEnabled(false);

		this.jButtonid_ejercicioRequisicionCompra= new JButtonMe();
		this.jButtonid_ejercicioRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioRequisicionCompra.setText("Buscar");
		this.jButtonid_ejercicioRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRequisicionCompra"));

		this.jButtonid_ejercicioRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRequisicionCompraBusqueda.setText("U");
		this.jButtonid_ejercicioRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioRequisicionCompraUpdate.setText("U");
		this.jButtonid_ejercicioRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioRequisicionCompraUpdate"));



					
		this.jLabelid_periodoRequisicionCompra = new JLabelMe();
		this.jLabelid_periodoRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoRequisicionCompra.setToolTipText("Periodo");
		this.jLabelid_periodoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_periodoRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_periodoRequisicionCompra= new JComboBoxMe();
		jComboBoxid_periodoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoRequisicionCompra.setEnabled(false);

		this.jButtonid_periodoRequisicionCompra= new JButtonMe();
		this.jButtonid_periodoRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoRequisicionCompra.setText("Buscar");
		this.jButtonid_periodoRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRequisicionCompra"));

		this.jButtonid_periodoRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_periodoRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRequisicionCompraBusqueda.setText("U");
		this.jButtonid_periodoRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_periodoRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_periodoRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoRequisicionCompraUpdate.setText("U");
		this.jButtonid_periodoRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoRequisicionCompraUpdate"));



					
		this.jLabelid_anioRequisicionCompra = new JLabelMe();
		this.jLabelid_anioRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioRequisicionCompra.setToolTipText("Anio");
		this.jLabelid_anioRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_anioRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_anioRequisicionCompra= new JComboBoxMe();
		jComboBoxid_anioRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioRequisicionCompra.setEnabled(false);

		this.jButtonid_anioRequisicionCompra= new JButtonMe();
		this.jButtonid_anioRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioRequisicionCompra.setText("Buscar");
		this.jButtonid_anioRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRequisicionCompra"));

		this.jButtonid_anioRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_anioRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioRequisicionCompraBusqueda.setText("U");
		this.jButtonid_anioRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_anioRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_anioRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioRequisicionCompraUpdate.setText("U");
		this.jButtonid_anioRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioRequisicionCompraUpdate"));



					
		this.jLabelid_mesRequisicionCompra = new JLabelMe();
		this.jLabelid_mesRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesRequisicionCompra.setToolTipText("Mes");
		this.jLabelid_mesRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_mesRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_mesRequisicionCompra= new JComboBoxMe();
		jComboBoxid_mesRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesRequisicionCompra.setEnabled(false);

		this.jButtonid_mesRequisicionCompra= new JButtonMe();
		this.jButtonid_mesRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesRequisicionCompra.setText("Buscar");
		this.jButtonid_mesRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRequisicionCompra"));

		this.jButtonid_mesRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_mesRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesRequisicionCompraBusqueda.setText("U");
		this.jButtonid_mesRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_mesRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_mesRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesRequisicionCompraUpdate.setText("U");
		this.jButtonid_mesRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesRequisicionCompraUpdate"));



					
		this.jLabelid_clienteRequisicionCompra = new JLabelMe();
		this.jLabelid_clienteRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDCLIENTE+" : *");
		this.jLabelid_clienteRequisicionCompra.setToolTipText("Cliente");
		this.jLabelid_clienteRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_clienteRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_clienteRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_clienteRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_clienteRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDCLIENTE);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_clienteRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_clienteRequisicionCompra= new JComboBoxMe();
		jComboBoxid_clienteRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_clienteRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_clienteRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_clienteRequisicionCompra= new JButtonMe();
		this.jButtonid_clienteRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_clienteRequisicionCompra.setText("Buscar");
		this.jButtonid_clienteRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_clienteRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_clienteRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteRequisicionCompra"));

		this.jButtonid_clienteRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_clienteRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteRequisicionCompraBusqueda.setText("U");
		this.jButtonid_clienteRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_clienteRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_clienteRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_clienteRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_clienteRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_clienteRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_clienteRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_clienteRequisicionCompraUpdate.setText("U");
		this.jButtonid_clienteRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_clienteRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_clienteRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_clienteRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_clienteRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_clienteRequisicionCompraUpdate"));



					
		this.jLabelid_usuarioRequisicionCompra = new JLabelMe();
		this.jLabelid_usuarioRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioRequisicionCompra.setToolTipText("Usuario");
		this.jLabelid_usuarioRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_usuarioRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_usuarioRequisicionCompra= new JComboBoxMe();
		jComboBoxid_usuarioRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioRequisicionCompra.setEnabled(false);

		this.jButtonid_usuarioRequisicionCompra= new JButtonMe();
		this.jButtonid_usuarioRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioRequisicionCompra.setText("Buscar");
		this.jButtonid_usuarioRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioRequisicionCompra"));

		this.jButtonid_usuarioRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_usuarioRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioRequisicionCompraBusqueda.setText("U");
		this.jButtonid_usuarioRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_usuarioRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_usuarioRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioRequisicionCompraUpdate.setText("U");
		this.jButtonid_usuarioRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioRequisicionCompraUpdate"));



					
		this.jLabelid_monedaRequisicionCompra = new JLabelMe();
		this.jLabelid_monedaRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDMONEDA+" : *");
		this.jLabelid_monedaRequisicionCompra.setToolTipText("Moneda");
		this.jLabelid_monedaRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_monedaRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_monedaRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_monedaRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_monedaRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDMONEDA);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_monedaRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_monedaRequisicionCompra= new JComboBoxMe();
		jComboBoxid_monedaRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_monedaRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_monedaRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_monedaRequisicionCompra= new JButtonMe();
		this.jButtonid_monedaRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_monedaRequisicionCompra.setText("Buscar");
		this.jButtonid_monedaRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_monedaRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_monedaRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaRequisicionCompra"));

		this.jButtonid_monedaRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_monedaRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaRequisicionCompraBusqueda.setText("U");
		this.jButtonid_monedaRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_monedaRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_monedaRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_monedaRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_monedaRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_monedaRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_monedaRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_monedaRequisicionCompraUpdate.setText("U");
		this.jButtonid_monedaRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_monedaRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_monedaRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_monedaRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_monedaRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_monedaRequisicionCompraUpdate"));



					
		this.jLabelid_estado_requisicion_compraRequisicionCompra = new JLabelMe();
		this.jLabelid_estado_requisicion_compraRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDESTADOREQUISICIONCOMPRA+" : *");
		this.jLabelid_estado_requisicion_compraRequisicionCompra.setToolTipText("Estado");
		this.jLabelid_estado_requisicion_compraRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_requisicion_compraRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_estado_requisicion_compraRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_estado_requisicion_compraRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_estado_requisicion_compraRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_estado_requisicion_compraRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDESTADOREQUISICIONCOMPRA);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_estado_requisicion_compraRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_estado_requisicion_compraRequisicionCompra= new JComboBoxMe();
		jComboBoxid_estado_requisicion_compraRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_requisicion_compraRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_estado_requisicion_compraRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_estado_requisicion_compraRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_estado_requisicion_compraRequisicionCompra.setEnabled(false);

		this.jButtonid_estado_requisicion_compraRequisicionCompra= new JButtonMe();
		this.jButtonid_estado_requisicion_compraRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_requisicion_compraRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_requisicion_compraRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_estado_requisicion_compraRequisicionCompra.setText("Buscar");
		this.jButtonid_estado_requisicion_compraRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_estado_requisicion_compraRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_requisicion_compraRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_estado_requisicion_compraRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_requisicion_compraRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_requisicion_compraRequisicionCompra"));

		this.jButtonid_estado_requisicion_compraRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_estado_requisicion_compraRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_requisicion_compraRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_requisicion_compraRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_requisicion_compraRequisicionCompraBusqueda.setText("U");
		this.jButtonid_estado_requisicion_compraRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_estado_requisicion_compraRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_requisicion_compraRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_estado_requisicion_compraRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_requisicion_compraRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_requisicion_compraRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_estado_requisicion_compraRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_estado_requisicion_compraRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_estado_requisicion_compraRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_requisicion_compraRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_estado_requisicion_compraRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_estado_requisicion_compraRequisicionCompraUpdate.setText("U");
		this.jButtonid_estado_requisicion_compraRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_estado_requisicion_compraRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_estado_requisicion_compraRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_estado_requisicion_compraRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_estado_requisicion_compraRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_estado_requisicion_compraRequisicionCompraUpdate"));



					
		this.jLabelid_empleadoRequisicionCompra = new JLabelMe();
		this.jLabelid_empleadoRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDEMPLEADO+" : *");
		this.jLabelid_empleadoRequisicionCompra.setToolTipText("Empleado");
		this.jLabelid_empleadoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empleadoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empleadoRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empleadoRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empleadoRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDEMPLEADO);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_empleadoRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_empleadoRequisicionCompra= new JComboBoxMe();
		jComboBoxid_empleadoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empleadoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empleadoRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_empleadoRequisicionCompra= new JButtonMe();
		this.jButtonid_empleadoRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empleadoRequisicionCompra.setText("Buscar");
		this.jButtonid_empleadoRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empleadoRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empleadoRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRequisicionCompra"));

		this.jButtonid_empleadoRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_empleadoRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoRequisicionCompraBusqueda.setText("U");
		this.jButtonid_empleadoRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empleadoRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empleadoRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empleadoRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_empleadoRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_empleadoRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empleadoRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empleadoRequisicionCompraUpdate.setText("U");
		this.jButtonid_empleadoRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empleadoRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empleadoRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empleadoRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empleadoRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empleadoRequisicionCompraUpdate"));



					
		this.jLabelid_formatoRequisicionCompra = new JLabelMe();
		this.jLabelid_formatoRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDFORMATO+" :");
		this.jLabelid_formatoRequisicionCompra.setToolTipText("Formato");
		this.jLabelid_formatoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_formatoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_formatoRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_formatoRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_formatoRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDFORMATO);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_formatoRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_formatoRequisicionCompra= new JComboBoxMe();
		jComboBoxid_formatoRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_formatoRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_formatoRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_formatoRequisicionCompra= new JButtonMe();
		this.jButtonid_formatoRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_formatoRequisicionCompra.setText("Buscar");
		this.jButtonid_formatoRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_formatoRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_formatoRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoRequisicionCompra"));

		this.jButtonid_formatoRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_formatoRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoRequisicionCompraBusqueda.setText("U");
		this.jButtonid_formatoRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_formatoRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_formatoRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_formatoRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_formatoRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_formatoRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_formatoRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_formatoRequisicionCompraUpdate.setText("U");
		this.jButtonid_formatoRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_formatoRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_formatoRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_formatoRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_formatoRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_formatoRequisicionCompraUpdate"));



					
		this.jLabelid_tipo_cambioRequisicionCompra = new JLabelMe();
		this.jLabelid_tipo_cambioRequisicionCompra.setText(""+RequisicionCompraConstantesFunciones.LABEL_IDTIPOCAMBIO+" :");
		this.jLabelid_tipo_cambioRequisicionCompra.setToolTipText("Tipo Cambio");
		this.jLabelid_tipo_cambioRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_cambioRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL2,30),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_cambioRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_cambioRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_cambioRequisicionCompra.setToolTipText(RequisicionCompraConstantesFunciones.LABEL_IDTIPOCAMBIO);
		this.gridaBagLayoutRequisicionCompra = new GridBagLayout();
		this.jPanelid_tipo_cambioRequisicionCompra.setLayout(this.gridaBagLayoutRequisicionCompra);


		jComboBoxid_tipo_cambioRequisicionCompra= new JComboBoxMe();
		jComboBoxid_tipo_cambioRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_cambioRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_cambioRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_cambioRequisicionCompra.setEnabled(false);

		this.jButtonid_tipo_cambioRequisicionCompra= new JButtonMe();
		this.jButtonid_tipo_cambioRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_cambioRequisicionCompra.setText("Buscar");
		this.jButtonid_tipo_cambioRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_cambioRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_cambioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioRequisicionCompra"));

		this.jButtonid_tipo_cambioRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_tipo_cambioRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioRequisicionCompraBusqueda.setText("U");
		this.jButtonid_tipo_cambioRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_cambioRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_cambioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioRequisicionCompraBusqueda"));

		if(this.requisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_cambioRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_tipo_cambioRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_tipo_cambioRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_cambioRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_cambioRequisicionCompraUpdate.setText("U");
		this.jButtonid_tipo_cambioRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_cambioRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_cambioRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_cambioRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_cambioRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_cambioRequisicionCompraUpdate"));



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
		//this.jInternalFrameDetalleRequisicionCompra = new RequisicionCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Requisicion Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRequisicionCompra= new GridBagLayout();
		

		
		String sToolTipRequisicionCompra="";
		sToolTipRequisicionCompra=RequisicionCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRequisicionCompra+="(Inventario.RequisicionCompra)";
		}
		
		if(!this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipRequisicionCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRequisicionCompra = new JButtonMe();
		this.jButtonModificarRequisicionCompra = new JButtonMe();
        this.jButtonActualizarRequisicionCompra = new JButtonMe();
        this.jButtonEliminarRequisicionCompra = new JButtonMe();
        this.jButtonCancelarRequisicionCompra = new JButtonMe();
        this.jButtonGuardarCambiosRequisicionCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaRequisicionCompra = new JButtonMe();
		this.jButtonCerrarRequisicionCompra = new JButtonMe();
		
		this.jScrollPanelDatosRequisicionCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionRequisicionCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralRequisicionCompra = new JScrollPane();
				
		
		
		this.jPanelCamposRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Requisicion Compra";
		
		if(!this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Requisicion Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
		this.jPanelCamposRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        this.jPanelCamposRequisicionCompra.setName("jPanelCamposRequisicionCompra"); 

		this.jPanelCamposOcultosRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRequisicionCompra.setName("jPanelCamposOcultosRequisicionCompra"); 

        this.jPanelAccionesRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRequisicionCompra.setToolTipText("Acciones");
        this.jPanelAccionesRequisicionCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRequisicionCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRequisicionCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRequisicionCompra.setText("Nuevo");
		this.jButtonModificarRequisicionCompra.setText("Editar");
        this.jButtonActualizarRequisicionCompra.setText("Actualizar");
        this.jButtonEliminarRequisicionCompra.setText("Eliminar");
        this.jButtonCancelarRequisicionCompra.setText("Cancelar");
        this.jButtonGuardarCambiosRequisicionCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaRequisicionCompra.setText("Guardar");
		this.jButtonCerrarRequisicionCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRequisicionCompra,"nuevo_button","Nuevo",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRequisicionCompra,"modificar_button","Editar",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRequisicionCompra,"actualizar_button","Actualizar",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRequisicionCompra,"eliminar_button","Eliminar",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRequisicionCompra,"cancelar_button","Cancelar",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRequisicionCompra,"guardarcambios_button","Guardar",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRequisicionCompra,"guardarcambiostabla_button","Guardar",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRequisicionCompra,"cerrar_button","Salir",this.requisicioncompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRequisicionCompra.setToolTipText("Nuevo"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRequisicionCompra.setToolTipText("Editar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRequisicionCompra.setToolTipText("Actualizar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRequisicionCompra.setToolTipText("Eliminar)"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRequisicionCompra.setToolTipText("Cancelar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRequisicionCompra.setToolTipText("Guardar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRequisicionCompra.setToolTipText("Guardar"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRequisicionCompra.setToolTipText("Salir"+" "+RequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRequisicionCompra";
		inputMap = this.jButtonNuevoRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRequisicionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRequisicionCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRequisicionCompra";
		inputMap = this.jButtonActualizarRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRequisicionCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarRequisicionCompra";
		inputMap = this.jButtonEliminarRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRequisicionCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarRequisicionCompra";
		inputMap = this.jButtonCancelarRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRequisicionCompra"));
		
		//CERRAR		
		sMapKey = "CerrarRequisicionCompra";
		inputMap = this.jButtonCerrarRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRequisicionCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRequisicionCompra";
		inputMap = this.jButtonGuardarCambiosTablaRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRequisicionCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRequisicionCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRequisicionCompra.setToolTipText("Nuevo RequisicionCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRequisicionCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRequisicionCompra.setToolTipText("Sin Cerrar Ventana RequisicionCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRequisicionCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRequisicionCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRequisicionCompra.setText("Accion");
		this.jComboBoxTiposAccionesRequisicionCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRequisicionCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRequisicionCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRequisicionCompra = new JLabelMe();
		
		this.jLabelAccionesRequisicionCompra.setText("Acciones");		
		this.jLabelAccionesRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRequisicionCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRequisicionCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRequisicionCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRequisicionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRequisicionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRequisicionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRequisicionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRequisicionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRequisicionCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRequisicionCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRequisicionCompra = new GridBagLayout();
		
		this.jPanelCamposRequisicionCompra.setLayout(gridaBagLayoutCamposRequisicionCompra);
		this.jPanelCamposOcultosRequisicionCompra.setLayout(gridaBagLayoutCamposOcultosRequisicionCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRequisicionCompra.add(jLabelIdRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRequisicionCompra.add(jLabelidRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRequisicionCompra.add(jLabelid_empresaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRequisicionCompra.add(jButtonid_empresaRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRequisicionCompra.add(jButtonid_empresaRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRequisicionCompra.add(jComboBoxid_empresaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalRequisicionCompra.add(jLabelid_sucursalRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRequisicionCompra.add(jButtonid_sucursalRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalRequisicionCompra.add(jButtonid_sucursalRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalRequisicionCompra.add(jComboBoxid_sucursalRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloRequisicionCompra.add(jLabelid_moduloRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloRequisicionCompra.add(jButtonid_moduloRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloRequisicionCompra.add(jButtonid_moduloRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloRequisicionCompra.add(jComboBoxid_moduloRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioRequisicionCompra.add(jLabelid_ejercicioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRequisicionCompra.add(jButtonid_ejercicioRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioRequisicionCompra.add(jButtonid_ejercicioRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioRequisicionCompra.add(jComboBoxid_ejercicioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoRequisicionCompra.add(jLabelid_periodoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRequisicionCompra.add(jButtonid_periodoRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoRequisicionCompra.add(jButtonid_periodoRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoRequisicionCompra.add(jComboBoxid_periodoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioRequisicionCompra.add(jLabelid_anioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioRequisicionCompra.add(jButtonid_anioRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioRequisicionCompra.add(jButtonid_anioRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioRequisicionCompra.add(jComboBoxid_anioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesRequisicionCompra.add(jLabelid_mesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesRequisicionCompra.add(jButtonid_mesRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesRequisicionCompra.add(jButtonid_mesRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesRequisicionCompra.add(jComboBoxid_mesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_secuencialRequisicionCompra.add(jLabelnumero_secuencialRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialRequisicionCompra.add(jButtonnumero_secuencialRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_secuencialRequisicionCompra.add(jTextFieldnumero_secuencialRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_clienteRequisicionCompra.add(jLabelid_clienteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 2;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_clienteRequisicionCompra.add(jButtonid_clienteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteRequisicionCompra.add(jButtonid_clienteRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 4;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_clienteRequisicionCompra.add(jButtonid_clienteRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_clienteRequisicionCompra.add(jComboBoxid_clienteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioRequisicionCompra.add(jLabelid_usuarioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioRequisicionCompra.add(jButtonid_usuarioRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioRequisicionCompra.add(jButtonid_usuarioRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioRequisicionCompra.add(jComboBoxid_usuarioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_monedaRequisicionCompra.add(jLabelid_monedaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaRequisicionCompra.add(jButtonid_monedaRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_monedaRequisicionCompra.add(jButtonid_monedaRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_monedaRequisicionCompra.add(jComboBoxid_monedaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_estado_requisicion_compraRequisicionCompra.add(jLabelid_estado_requisicion_compraRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_requisicion_compraRequisicionCompra.add(jButtonid_estado_requisicion_compraRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_estado_requisicion_compraRequisicionCompra.add(jButtonid_estado_requisicion_compraRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_estado_requisicion_compraRequisicionCompra.add(jComboBoxid_estado_requisicion_compraRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalRequisicionCompra.add(jLabeltotalRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalRequisicionCompra.add(jButtontotalRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalRequisicionCompra.add(jTextFieldtotalRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfechaRequisicionCompra.add(jLabelfechaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfechaRequisicionCompra.add(jButtonfechaRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfechaRequisicionCompra.add(jDateChooserfechaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empleadoRequisicionCompra.add(jLabelid_empleadoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 2;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_empleadoRequisicionCompra.add(jButtonid_empleadoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoRequisicionCompra.add(jButtonid_empleadoRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 4;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empleadoRequisicionCompra.add(jButtonid_empleadoRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empleadoRequisicionCompra.add(jComboBoxid_empleadoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelresponsableRequisicionCompra.add(jLabelresponsableRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelresponsableRequisicionCompra.add(jButtonresponsableRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelresponsableRequisicionCompra.add(jscrollPaneresponsableRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsolicitado_porRequisicionCompra.add(jLabelsolicitado_porRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelsolicitado_porRequisicionCompra.add(jButtonsolicitado_porRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsolicitado_porRequisicionCompra.add(jscrollPanesolicitado_porRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelmotivo_solicitudRequisicionCompra.add(jLabelmotivo_solicitudRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelmotivo_solicitudRequisicionCompra.add(jButtonmotivo_solicitudRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelmotivo_solicitudRequisicionCompra.add(jscrollPanemotivo_solicitudRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelarea_solicitudRequisicionCompra.add(jLabelarea_solicitudRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelarea_solicitudRequisicionCompra.add(jButtonarea_solicitudRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelarea_solicitudRequisicionCompra.add(jscrollPanearea_solicitudRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelpara_uso_deRequisicionCompra.add(jLabelpara_uso_deRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelpara_uso_deRequisicionCompra.add(jButtonpara_uso_deRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelpara_uso_deRequisicionCompra.add(jscrollPanepara_uso_deRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanellugar_entregaRequisicionCompra.add(jLabellugar_entregaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanellugar_entregaRequisicionCompra.add(jButtonlugar_entregaRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanellugar_entregaRequisicionCompra.add(jTextFieldlugar_entregaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionRequisicionCompra.add(jLabeldescripcionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionRequisicionCompra.add(jButtondescripcionRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionRequisicionCompra.add(jscrollPanedescripcionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionRequisicionCompra.add(jLabelfecha_emisionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionRequisicionCompra.add(jButtonfecha_emisionRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionRequisicionCompra.add(jDateChooserfecha_emisionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_entregaRequisicionCompra.add(jLabelfecha_entregaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_entregaRequisicionCompra.add(jButtonfecha_entregaRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_entregaRequisicionCompra.add(jDateChooserfecha_entregaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_formatoRequisicionCompra.add(jLabelid_formatoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 2;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoRequisicionCompra.add(jButtonid_formatoRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_formatoRequisicionCompra.add(jButtonid_formatoRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_formatoRequisicionCompra.add(jComboBoxid_formatoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 0;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_cambioRequisicionCompra.add(jLabelid_tipo_cambioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 2;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_tipo_cambioRequisicionCompra.add(jButtonid_tipo_cambioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 3;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioRequisicionCompra.add(jButtonid_tipo_cambioRequisicionCompraBusqueda, this.gridBagConstraintsRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = 4;
		this.gridBagConstraintsRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_cambioRequisicionCompra.add(jButtonid_tipo_cambioRequisicionCompraUpdate, this.gridBagConstraintsRequisicionCompra);
	}

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRequisicionCompra.gridy = 0;
	this.gridBagConstraintsRequisicionCompra.gridx = 1;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_cambioRequisicionCompra.add(jComboBoxid_tipo_cambioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelidRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelnumero_secuencialRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelid_clienteRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelid_monedaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelid_estado_requisicion_compraRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelid_empleadoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelresponsableRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelsolicitado_porRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelmotivo_solicitudRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelarea_solicitudRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelpara_uso_deRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanellugar_entregaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.gridBagConstraintsRequisicionCompra.gridwidth = 2;

	this.jPanelCamposRequisicionCompra.add(this.jPaneldescripcionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}

	iXPanelCamposRequisicionCompra=0;
	iYPanelCamposRequisicionCompra++;

	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelfecha_emisionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelfecha_entregaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRequisicionCompra.add(this.jPanelid_formatoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposRequisicionCompra % 3==0) {
		iXPanelCamposRequisicionCompra=0;
		iYPanelCamposRequisicionCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPanelid_empresaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPanelid_sucursalRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPanelid_moduloRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPanelid_ejercicioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPanelid_periodoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPanelid_anioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPanelid_mesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPanelid_usuarioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPaneltotalRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPanelfechaRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
	}
	this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRequisicionCompra.gridy = iYPanelCamposOcultosRequisicionCompra;
	this.gridBagConstraintsRequisicionCompra.gridx = iXPanelCamposOcultosRequisicionCompra++;
	this.gridBagConstraintsRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRequisicionCompra.add(this.jPanelid_tipo_cambioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);



	if(iXPanelCamposOcultosRequisicionCompra % 3==0) {
		iXPanelCamposOcultosRequisicionCompra=0;
		iYPanelCamposOcultosRequisicionCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesRequisicionCompra= new GridBagLayout();
		this.jPanelAccionesRequisicionCompra.setLayout(gridaBagLayoutAccionesRequisicionCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRequisicionCompra= new GridBagLayout();
		this.jPanelAccionesFormularioRequisicionCompra.setLayout(gridaBagLayoutAccionesFormularioRequisicionCompra);
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRequisicionCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRequisicionCompra.add(this.jComboBoxTiposAccionesFormularioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRequisicionCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRequisicionCompra.add(this.jCheckBoxPostAccionNuevoRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.requisicioncompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRequisicionCompra.add(this.jCheckBoxPostAccionSinCerrarRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.requisicioncompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.requisicioncompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRequisicionCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRequisicionCompra.add(this.jCheckBoxPostAccionSinMensajeRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesRequisicionCompra.add(this.jButtonModificarRequisicionCompra, this.gridBagConstraintsRequisicionCompra);							

		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRequisicionCompra.gridy = 0;
		this.gridBagConstraintsRequisicionCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesRequisicionCompra.add(this.jButtonEliminarRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
			
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = 0;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesRequisicionCompra.add(this.jButtonActualizarRequisicionCompra, this.gridBagConstraintsRequisicionCompra);


		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = 0;		
		this.gridBagConstraintsRequisicionCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesRequisicionCompra.add(this.jButtonGuardarCambiosRequisicionCompra, this.gridBagConstraintsRequisicionCompra);	
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = 0;		
		this.gridBagConstraintsRequisicionCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesRequisicionCompra.add(this.jButtonCancelarRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRequisicionCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRequisicionCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.requisicioncompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();						
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRequisicionCompra.gridx = 0;		
			//this.gridBagConstraintsRequisicionCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRequisicionCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRequisicionCompra.gridx =0;
		this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRequisicionCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*2);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RequisicionCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRequisicionCompra = new RequisicionCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Requisicion Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Requisicion Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Requisicion Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RequisicionCompraModel requisicioncompraModel=new RequisicionCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//RequisicionCompraModel.RequisicionCompraFocusTraversalPolicy requisicioncompraFocusTraversalPolicy = requisicioncompraModel.new RequisicionCompraFocusTraversalPolicy(this);
			
			//requisicioncompraFocusTraversalPolicy.setrequisicioncompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(requisicioncompraModel);
			
			
			this.jContentPaneDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();	
			this.jContentPaneDetalleRequisicionCompra.setLayout(gridaBagLayoutDetalleRequisicionCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRequisicionCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
}
			
			this.jScrollPanelDatosEdicionRequisicionCompra=   new JScrollPane(jContentPaneDetalleRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRequisicionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRequisicionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRequisicionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRequisicionCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRequisicionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRequisicionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRequisicionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			
			
	        this.gridBagConstraintsRequisicionCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRequisicionCompra.gridx = 0;
	        
			this.jContentPaneDetalleRequisicionCompra.add(jPanelCamposRequisicionCompra, gridBagConstraintsRequisicionCompra);
			
			
			
			
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
						&& requisicioncompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleRequisicionCompra(this.puedeCargarPorParteDetalleRequisicionCompra,false,-1);
					
					if(this.requisicioncompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRequisicionCompra= new GridBagConstraints();
						this.gridBagConstraintsRequisicionCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRequisicionCompra.gridx = 0;
						this.jContentPaneDetalleRequisicionCompra.add(this.jTabbedPaneRelacionesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRequisicionCompra.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleRequisicionCompra(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRequisicionCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
					this.gridBagConstraintsRequisicionCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRequisicionCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRequisicionCompra.gridx = 0;
					
				
					this.jContentPaneDetalleRequisicionCompra.add(jPanelCamposOcultosRequisicionCompra, gridBagConstraintsRequisicionCompra);
				
					this.jPanelCamposOcultosRequisicionCompra.setVisible(true);
				}
			}					
			
			
			
			
			
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.fill=GridBagConstraints.NONE;
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.CENTER;//WEST;
	        this.gridBagConstraintsRequisicionCompra.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsRequisicionCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleRequisicionCompra.add(this.jPanelAccionesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRequisicionCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRequisicionCompra=   new JScrollPane(this.jPanelCamposRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRequisicionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRequisicionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRequisicionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRequisicionCompra.gridx = 0;
			this.gridBagConstraintsRequisicionCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRequisicionCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRequisicionCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRequisicionCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRequisicionCompra, this.gridBagConstraintsRequisicionCompra);			
			
			this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsRequisicionCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRequisicionCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
			
			
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRequisicionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		
			
		this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsRequisicionCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRequisicionCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRequisicionCompra, this.gridBagConstraintsRequisicionCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRequisicionCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionRequisicionCompra;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleRequisicionCompra(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detallerequisicioncompraSessionBean=new DetalleRequisicionCompraSessionBean();
		this.detallerequisicioncompraSessionBean.setConGuardarRelaciones(false);
		this.detallerequisicioncompraSessionBean.setEsGuardarRelacionado(true);

		this.detallerequisicioncompraBeanSwingJInternalFrame=null;//new DetalleRequisicionCompraBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detallerequisicioncompraBeanSwingJInternalFramePopup=new DetalleRequisicionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detallerequisicioncompraBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {

				DetalleRequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleRequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=RequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detallerequisicioncompraSessionBean.setEsGuardarRelacionado(true);

				this.detallerequisicioncompraBeanSwingJInternalFrame=new DetalleRequisicionCompraBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detallerequisicioncompraBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detallerequisicioncompraBeanSwingJInternalFrame.setdetallerequisicioncompraSessionBean(this.detallerequisicioncompraSessionBean);

				//this.gridBagConstraintsRequisicionCompra = new GridBagConstraints();
				//this.gridBagConstraintsRequisicionCompra.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsRequisicionCompra.gridx = 0;
				//this.jContentPaneDetalleRequisicionCompra.add(this.detallerequisicioncompraBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsRequisicionCompra);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesRequisicionCompra.add("Detalle Requisicion Compras",this.detallerequisicioncompraBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesRequisicionCompra.setComponentAt(iIndexTab,this.detallerequisicioncompraBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleRequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detallerequisicioncompraSessionBean.setEsGuardarRelacionado(false);
				this.detallerequisicioncompraBeanSwingJInternalFrame=null;//new DetalleRequisicionCompraBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleRequisicionCompra) {
					this.jTabbedPaneRelacionesRequisicionCompra.add("Detalle Requisicion Compras",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleRequisicionCompraBeanSwingJInternalFrame(List<RequisicionCompra> requisicioncompras,RequisicionCompra requisicioncompra,DetalleRequisicionCompraBeanSwingJInternalFrame detallerequisicioncompraBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detallerequisicioncompraBeanSwingJInternalFrame=new DetalleRequisicionCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detallerequisicioncompraBeanSwingJInternalFrame.getDetalleRequisicionCompraLogic().setConnexion(this.requisicioncompraLogic.getConnexion());

					detallerequisicioncompraBeanSwingJInternalFrame.setrequisicioncomprasForeignKey(requisicioncompras);
					detallerequisicioncompraBeanSwingJInternalFrame.setrequisicioncompraForeignKey(requisicioncompra);
					detallerequisicioncompraBeanSwingJInternalFrame.detallerequisicioncompraSessionBean.setisBusquedaDesdeForeignKeySesionRequisicionCompra(true);
					detallerequisicioncompraBeanSwingJInternalFrame.detallerequisicioncompraSessionBean.setlidRequisicionCompraActual(requisicioncompra.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detallerequisicioncompraBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleRequisicionCompra(detallerequisicioncompraBeanSwingJInternalFrame.isCargarCombosDependencia);
					detallerequisicioncompraBeanSwingJInternalFrame.setVisibilidadBusquedasParaRequisicionCompra(true);
					detallerequisicioncompraBeanSwingJInternalFrame.setid_requisicion_compraFK_IdRequisicionCompra(requisicioncompra.getId());

					if(!this.conCargarFormDetalle) {
						detallerequisicioncompraBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					detallerequisicioncompraBeanSwingJInternalFrame.setSelectedItemCombosFrameRequisicionCompraForeignKey(requisicioncompra,1,false,true,true);
					detallerequisicioncompraBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detallerequisicioncompraBeanSwingJInternalFrame.procesarBusqueda("FK_IdRequisicionCompra");
					detallerequisicioncompraBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdRequisicionCompra");
					detallerequisicioncompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleRequisicionCompra(true);
					detallerequisicioncompraBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleRequisicionCompra("n",detallerequisicioncompraBeanSwingJInternalFrame.isGuardarCambiosEnLote, detallerequisicioncompraBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detallerequisicioncompraBeanSwingJInternalFrame.setAutoscrolls(true);
					detallerequisicioncompraBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detallerequisicioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleRequisicionCompra("relacionado");
					} else {
						detallerequisicioncompraBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleRequisicionCompra("no_relacionado");
					}

					detallerequisicioncompraBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleRequisicionCompra().setVisible(false);

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
