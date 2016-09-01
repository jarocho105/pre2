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
import com.bydan.erp.inventario.util.DetalleRequisicionCompraConstantesFunciones;

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
public class DetalleRequisicionCompraDetalleFormJInternalFrame extends DetalleRequisicionCompraBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleRequisicionCompra;
	
	protected JMenuBar jmenuBarDetalleDetalleRequisicionCompra;
	
	protected JMenu jmenuDetalleDetalleRequisicionCompra;
	protected JMenu jmenuDetalleArchivoDetalleRequisicionCompra;
	protected JMenu jmenuDetalleAccionesDetalleRequisicionCompra;
	protected JMenu jmenuDetalleDatosDetalleRequisicionCompra;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleRequisicionCompra;	
	protected GridBagConstraints gridBagConstraintsDetalleRequisicionCompra;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleRequisicionCompraBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleRequisicionCompra;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected RequisicionCompraBeanSwingJInternalFrame requisicioncompraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_requisicioncompra="";

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

	protected CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_centrocosto="";
	
	public DetalleRequisicionCompraSessionBean detallerequisicioncompraSessionBean;
	
	
	
	
	public RequisicionCompraSessionBean requisicioncompraSessionBean;
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public EjercicioSessionBean ejercicioSessionBean;
	public PeriodoSessionBean periodoSessionBean;
	public AnioSessionBean anioSessionBean;
	public MesSessionBean mesSessionBean;
	public BodegaSessionBean bodegaSessionBean;
	public ProductoSessionBean productoSessionBean;
	public UnidadSessionBean unidadSessionBean;
	public CentroCostoSessionBean centrocostoSessionBean;	
	
	public DetalleRequisicionCompraLogic detallerequisicioncompraLogic;
	
	public JScrollPane jScrollPanelDatosDetalleRequisicionCompra;
	public JScrollPane jScrollPanelDatosEdicionDetalleRequisicionCompra;
	public JScrollPane jScrollPanelDatosGeneralDetalleRequisicionCompra;
	
	protected JPanel jPanelCamposDetalleRequisicionCompra;    
	protected JPanel jPanelCamposOcultosDetalleRequisicionCompra;    	
	protected JPanel jPanelAccionesDetalleRequisicionCompra;
	protected JPanel jPanelAccionesFormularioDetalleRequisicionCompra;
    
	
	
	protected Integer iXPanelCamposDetalleRequisicionCompra=0;
	protected Integer iYPanelCamposDetalleRequisicionCompra=0;
	
	protected Integer iXPanelCamposOcultosDetalleRequisicionCompra=0;
	protected Integer iYPanelCamposOcultosDetalleRequisicionCompra=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleRequisicionCompra;
	public JButton jButtonModificarDetalleRequisicionCompra;
	public JButton jButtonActualizarDetalleRequisicionCompra;
    public JButton jButtonEliminarDetalleRequisicionCompra;
	public JButton jButtonCancelarDetalleRequisicionCompra;
    public JButton jButtonGuardarCambiosDetalleRequisicionCompra;
	public JButton jButtonGuardarCambiosTablaDetalleRequisicionCompra;
	protected JButton jButtonCerrarDetalleRequisicionCompra;
	
	
	protected JButton jButtonProcesarInformacionDetalleRequisicionCompra;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleRequisicionCompra;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleRequisicionCompra;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleRequisicionCompra;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleRequisicionCompra;
	protected JButton jButtonModificarToolBarDetalleRequisicionCompra;
	protected JButton jButtonActualizarToolBarDetalleRequisicionCompra;
    protected JButton jButtonEliminarToolBarDetalleRequisicionCompra;
	protected JButton jButtonCancelarToolBarDetalleRequisicionCompra;
    protected JButton jButtonGuardarCambiosToolBarDetalleRequisicionCompra;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleRequisicionCompra;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleRequisicionCompra;
	protected JButton jButtonCerrarToolBarDetalleRequisicionCompra;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleRequisicionCompra;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleRequisicionCompra;
	protected JMenuItem jMenuItemModificarDetalleRequisicionCompra;
	protected JMenuItem jMenuItemActualizarDetalleRequisicionCompra;
    protected JMenuItem jMenuItemEliminarDetalleRequisicionCompra;
	protected JMenuItem jMenuItemCancelarDetalleRequisicionCompra;
    protected JMenuItem jMenuItemGuardarCambiosDetalleRequisicionCompra;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleRequisicionCompra;
	protected JMenuItem jMenuItemCerrarDetalleRequisicionCompra;
	protected JMenuItem jMenuItemDetalleCerrarDetalleRequisicionCompra;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleRequisicionCompra;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleRequisicionCompra;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleRequisicionCompra;
	protected JMenuItem jMenuItemMostrarOcultarDetalleRequisicionCompra;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleRequisicionCompra;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleRequisicionCompra;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleRequisicionCompra;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleRequisicionCompra;
	public JLabel jLabelIdDetalleRequisicionCompra;
	public JLabel jLabelidDetalleRequisicionCompra;
	public JButton jButtonidDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_requisicionDetalleRequisicionCompra;
	public JLabel jLabelcantidad_requisicionDetalleRequisicionCompra;
	public JTextField jTextFieldcantidad_requisicionDetalleRequisicionCompra;
	public JButton jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_unitarioDetalleRequisicionCompra;
	public JLabel jLabelcosto_unitarioDetalleRequisicionCompra;
	public JTextField jTextFieldcosto_unitarioDetalleRequisicionCompra;
	public JButton jButtoncosto_unitarioDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelcosto_totalDetalleRequisicionCompra;
	public JLabel jLabelcosto_totalDetalleRequisicionCompra;
	public JTextField jTextFieldcosto_totalDetalleRequisicionCompra;
	public JButton jButtoncosto_totalDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionDetalleRequisicionCompra;
	public JLabel jLabeldescripcionDetalleRequisicionCompra;
	public JTextArea jTextAreadescripcionDetalleRequisicionCompra;
	public JScrollPane jscrollPanedescripcionDetalleRequisicionCompra;
	public JButton jButtondescripcionDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_entregadaDetalleRequisicionCompra;
	public JLabel jLabelcantidad_entregadaDetalleRequisicionCompra;
	public JTextField jTextFieldcantidad_entregadaDetalleRequisicionCompra;
	public JButton jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelcantidad_pendienteDetalleRequisicionCompra;
	public JLabel jLabelcantidad_pendienteDetalleRequisicionCompra;
	public JTextField jTextFieldcantidad_pendienteDetalleRequisicionCompra;
	public JButton jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda= new JButtonMe();

	
	public JPanel jPanelid_requisicion_compraDetalleRequisicionCompra;
	public JLabel jLabelid_requisicion_compraDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_requisicion_compraDetalleRequisicionCompra;
	public JButton jButtonid_requisicion_compraDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_requisicion_compraDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_empresaDetalleRequisicionCompra;
	public JLabel jLabelid_empresaDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleRequisicionCompra;
	public JButton jButtonid_empresaDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_empresaDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalDetalleRequisicionCompra;
	public JLabel jLabelid_sucursalDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalDetalleRequisicionCompra;
	public JButton jButtonid_sucursalDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_sucursalDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_sucursalDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_ejercicioDetalleRequisicionCompra;
	public JLabel jLabelid_ejercicioDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_ejercicioDetalleRequisicionCompra;
	public JButton jButtonid_ejercicioDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_ejercicioDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_periodoDetalleRequisicionCompra;
	public JLabel jLabelid_periodoDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodoDetalleRequisicionCompra;
	public JButton jButtonid_periodoDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_periodoDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_periodoDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_anioDetalleRequisicionCompra;
	public JLabel jLabelid_anioDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_anioDetalleRequisicionCompra;
	public JButton jButtonid_anioDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_anioDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_anioDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_mesDetalleRequisicionCompra;
	public JLabel jLabelid_mesDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_mesDetalleRequisicionCompra;
	public JButton jButtonid_mesDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_mesDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_mesDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_bodegaDetalleRequisicionCompra;
	public JLabel jLabelid_bodegaDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_bodegaDetalleRequisicionCompra;
	public JButton jButtonid_bodegaDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_bodegaDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_bodegaDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_productoDetalleRequisicionCompra;
	public JLabel jLabelid_productoDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_productoDetalleRequisicionCompra;
	public JButton jButtonid_productoDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_productoDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_productoDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_unidadDetalleRequisicionCompra;
	public JLabel jLabelid_unidadDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_unidadDetalleRequisicionCompra;
	public JButton jButtonid_unidadDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_unidadDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_unidadDetalleRequisicionCompraBusqueda= new JButtonMe();

	public JPanel jPanelid_centro_costoDetalleRequisicionCompra;
	public JLabel jLabelid_centro_costoDetalleRequisicionCompra;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_centro_costoDetalleRequisicionCompra;
	public JButton jButtonid_centro_costoDetalleRequisicionCompra= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleRequisicionCompraUpdate= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleRequisicionCompraBusqueda= new JButtonMe();
	public JButton jButtonid_centro_costoDetalleRequisicionCompraArbol= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleRequisicionCompra;
	
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
	public int iHeightFormulario=726;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleRequisicionCompraDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleRequisicionCompra=new JPanel();
				this.jPanelAccionesFormularioDetalleRequisicionCompra=new JPanel();
				this.jmenuBarDetalleDetalleRequisicionCompra=new JMenuBar();
				this.jTtoolBarDetalleDetalleRequisicionCompra=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionCompraDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleRequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleRequisicionCompraDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleRequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionCompraDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionCompraDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleRequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleRequisicionCompraDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleRequisicionCompra No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleRequisicionCompra() {
		return this.jButtonActualizarToolBarDetalleRequisicionCompra;
	}
	
	public JButton getjButtonEliminarToolBarDetalleRequisicionCompra() {
		return this.jButtonEliminarToolBarDetalleRequisicionCompra;
	}
	
	public JButton getjButtonCancelarToolBarDetalleRequisicionCompra() {
		return this.jButtonCancelarToolBarDetalleRequisicionCompra;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleRequisicionCompra() {
		return this.jButtonProcesarInformacionDetalleRequisicionCompra;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleRequisicionCompra)	{
		this.jButtonProcesarInformacionDetalleRequisicionCompra = jButtonProcesarInformacionDetalleRequisicionCompra;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleRequisicionCompra() {
		return this.jComboBoxTiposAccionesDetalleRequisicionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleRequisicionCompra(
			JComboBox jComboBoxTiposRelacionesDetalleRequisicionCompra) {
		this.jComboBoxTiposRelacionesDetalleRequisicionCompra = jComboBoxTiposRelacionesDetalleRequisicionCompra;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleRequisicionCompra(
			JComboBox jComboBoxTiposAccionesDetalleRequisicionCompra) {
		this.jComboBoxTiposAccionesDetalleRequisicionCompra = jComboBoxTiposAccionesDetalleRequisicionCompra;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleRequisicionCompra() {
		return this.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleRequisicionCompra(
			JComboBox jComboBoxTiposAccionesFormularioDetalleRequisicionCompra) {
		this.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra = jComboBoxTiposAccionesFormularioDetalleRequisicionCompra;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detallerequisicioncompraSessionBean=new DetalleRequisicionCompraSessionBean();
		
		this.detallerequisicioncompraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallerequisicioncompraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleRequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleRequisicionCompraJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleRequisicionCompraJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Requisicion Compra MANTENIMIENTO"));
		
		
		if(iWidth > 1350) {
			iWidth=1350;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleRequisicionCompraJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleRequisicionCompra= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleRequisicionCompra=new JButtonMe();
				this.jButtonModificarToolBarDetalleRequisicionCompra=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleDetalleRequisicionCompra,
							"actualizar","actualizar","Actualizar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleDetalleRequisicionCompra,
							"eliminar","eliminar","Eliminar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleDetalleRequisicionCompra,
							"cancelar","cancelar","Cancelar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleRequisicionCompra=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleRequisicionCompra,this.jTtoolBarDetalleDetalleRequisicionCompra,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleRequisicionCompra=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleRequisicionCompra=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleRequisicionCompra=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleRequisicionCompra=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleRequisicionCompra=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleRequisicionCompra= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleRequisicionCompra.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleRequisicionCompra,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleRequisicionCompra= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleRequisicionCompra.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleRequisicionCompra,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleRequisicionCompra= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleRequisicionCompra.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleRequisicionCompra,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleRequisicionCompra= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleRequisicionCompra.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleRequisicionCompra,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleRequisicionCompra= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleRequisicionCompra.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleRequisicionCompra,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleRequisicionCompra= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleRequisicionCompra.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleRequisicionCompra,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleRequisicionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleRequisicionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleRequisicionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleRequisicionCompra= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleRequisicionCompra.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleRequisicionCompra,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleRequisicionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleRequisicionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleRequisicionCompra,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleRequisicionCompra= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleRequisicionCompra.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleRequisicionCompra,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleRequisicionCompra.add(this.jMenuItemDetalleCerrarDetalleRequisicionCompra);
		
		this.jmenuDetalleAccionesDetalleRequisicionCompra.add(this.jMenuItemActualizarDetalleRequisicionCompra);
		this.jmenuDetalleAccionesDetalleRequisicionCompra.add(this.jMenuItemEliminarDetalleRequisicionCompra);
		this.jmenuDetalleAccionesDetalleRequisicionCompra.add(this.jMenuItemCancelarDetalleRequisicionCompra);		
		
		//this.jmenuDetalleDatosDetalleRequisicionCompra.add(this.jMenuItemDetalleAbrirOrderByDetalleRequisicionCompra);				
		this.jmenuDetalleDatosDetalleRequisicionCompra.add(this.jMenuItemDetalleMostarOcultarDetalleRequisicionCompra);				
				
		//this.jmenuDetalleAccionesDetalleRequisicionCompra.add(this.jMenuItemGuardarCambiosDetalleRequisicionCompra);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleRequisicionCompra.add(this.jmenuDetalleArchivoDetalleRequisicionCompra);		
		this.jmenuBarDetalleDetalleRequisicionCompra.add(this.jmenuDetalleAccionesDetalleRequisicionCompra);		
		this.jmenuBarDetalleDetalleRequisicionCompra.add(this.jmenuDetalleDatosDetalleRequisicionCompra);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleRequisicionCompra);				
	}
	
	
	public void inicializarElementosCamposDetalleRequisicionCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleRequisicionCompra = new JLabelMe();
		jLabelIdDetalleRequisicionCompra.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleRequisicionCompra = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleRequisicionCompra= new GridBagLayout();

		this.jPanelidDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);

		jLabelidDetalleRequisicionCompra = new JLabel();
		jLabelidDetalleRequisicionCompra.setText("Id");

		jLabelidDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcantidad_requisicionDetalleRequisicionCompra = new JLabelMe();
		this.jLabelcantidad_requisicionDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_CANTIDADREQUISICION+" : *");
		this.jLabelcantidad_requisicionDetalleRequisicionCompra.setToolTipText("Cantidad Requisicion");
		this.jLabelcantidad_requisicionDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcantidad_requisicionDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcantidad_requisicionDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_requisicionDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_requisicionDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_requisicionDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_CANTIDADREQUISICION);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelcantidad_requisicionDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jTextFieldcantidad_requisicionDetalleRequisicionCompra= new JTextFieldMe();
		jTextFieldcantidad_requisicionDetalleRequisicionCompra.setEnabled(false);
		jTextFieldcantidad_requisicionDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_requisicionDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_requisicionDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_requisicionDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_requisicionDetalleRequisicionCompra.setText("0");

		this.jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_requisicionDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_requisicionDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_requisicionDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_unitarioDetalleRequisicionCompra = new JLabelMe();
		this.jLabelcosto_unitarioDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_COSTOUNITARIO+" : *");
		this.jLabelcosto_unitarioDetalleRequisicionCompra.setToolTipText("Costo Unitario");
		this.jLabelcosto_unitarioDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_unitarioDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_unitarioDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_unitarioDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_unitarioDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_COSTOUNITARIO);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelcosto_unitarioDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jTextFieldcosto_unitarioDetalleRequisicionCompra= new JTextFieldMe();
		jTextFieldcosto_unitarioDetalleRequisicionCompra.setEnabled(false);
		jTextFieldcosto_unitarioDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_unitarioDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_unitarioDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_unitarioDetalleRequisicionCompra.setText("0.0");

		jTextFieldcosto_unitarioDetalleRequisicionCompra.setEnabled(false);
		this.jButtoncosto_unitarioDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtoncosto_unitarioDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_unitarioDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_unitarioDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtoncosto_unitarioDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_unitarioDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_unitarioDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_unitarioDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_unitarioDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_unitarioDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_unitarioDetalleRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelcosto_totalDetalleRequisicionCompra = new JLabelMe();
		this.jLabelcosto_totalDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_COSTOTOTAL+" : *");
		this.jLabelcosto_totalDetalleRequisicionCompra.setToolTipText("Costo Total");
		this.jLabelcosto_totalDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcosto_totalDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcosto_totalDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcosto_totalDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcosto_totalDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_COSTOTOTAL);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelcosto_totalDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jTextFieldcosto_totalDetalleRequisicionCompra= new JTextFieldMe();
		jTextFieldcosto_totalDetalleRequisicionCompra.setEnabled(false);
		jTextFieldcosto_totalDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcosto_totalDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcosto_totalDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcosto_totalDetalleRequisicionCompra.setText("0.0");

		jTextFieldcosto_totalDetalleRequisicionCompra.setEnabled(false);
		this.jButtoncosto_totalDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtoncosto_totalDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncosto_totalDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncosto_totalDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtoncosto_totalDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncosto_totalDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncosto_totalDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcosto_totalDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcosto_totalDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"costo_totalDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncosto_totalDetalleRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionDetalleRequisicionCompra = new JLabelMe();
		this.jLabeldescripcionDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_DESCRIPCION+" :");
		this.jLabeldescripcionDetalleRequisicionCompra.setToolTipText("Descripcion");
		this.jLabeldescripcionDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPaneldescripcionDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jTextAreadescripcionDetalleRequisicionCompra= new JTextAreaMe();
		jTextAreadescripcionDetalleRequisicionCompra.setEnabled(false);
		jTextAreadescripcionDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionDetalleRequisicionCompra.setLineWrap(true);
		jTextAreadescripcionDetalleRequisicionCompra.setWrapStyleWord(true);
		jTextAreadescripcionDetalleRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionDetalleRequisicionCompra.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionDetalleRequisicionCompra = new JScrollPane(jTextAreadescripcionDetalleRequisicionCompra);
		jscrollPanedescripcionDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtondescripcionDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtondescripcionDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionDetalleRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_entregadaDetalleRequisicionCompra = new JLabelMe();
		this.jLabelcantidad_entregadaDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_CANTIDADENTREGADA+" : *");
		this.jLabelcantidad_entregadaDetalleRequisicionCompra.setToolTipText("Cantidad Entregada");
		this.jLabelcantidad_entregadaDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_entregadaDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_entregadaDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_entregadaDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_entregadaDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_entregadaDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_CANTIDADENTREGADA);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelcantidad_entregadaDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jTextFieldcantidad_entregadaDetalleRequisicionCompra= new JTextFieldMe();
		jTextFieldcantidad_entregadaDetalleRequisicionCompra.setEnabled(false);
		jTextFieldcantidad_entregadaDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_entregadaDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_entregadaDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_entregadaDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_entregadaDetalleRequisicionCompra.setText("0");

		jTextFieldcantidad_entregadaDetalleRequisicionCompra.setEnabled(false);
		this.jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_entregadaDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_entregadaDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_entregadaDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda.setVisible(false);		}


					
		this.jLabelcantidad_pendienteDetalleRequisicionCompra = new JLabelMe();
		this.jLabelcantidad_pendienteDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_CANTIDADPENDIENTE+" : *");
		this.jLabelcantidad_pendienteDetalleRequisicionCompra.setToolTipText("Cantidad Pendiente");
		this.jLabelcantidad_pendienteDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendienteDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelcantidad_pendienteDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelcantidad_pendienteDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcantidad_pendienteDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcantidad_pendienteDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_CANTIDADPENDIENTE);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelcantidad_pendienteDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jTextFieldcantidad_pendienteDetalleRequisicionCompra= new JTextFieldMe();
		jTextFieldcantidad_pendienteDetalleRequisicionCompra.setEnabled(false);
		jTextFieldcantidad_pendienteDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendienteDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcantidad_pendienteDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcantidad_pendienteDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldcantidad_pendienteDetalleRequisicionCompra.setText("0");

		jTextFieldcantidad_pendienteDetalleRequisicionCompra.setEnabled(false);
		this.jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcantidad_pendienteDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcantidad_pendienteDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"cantidad_pendienteDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleRequisicionCompra() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_requisicion_compraDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_requisicion_compraDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDREQUISICIONCOMPRA+" : *");
		this.jLabelid_requisicion_compraDetalleRequisicionCompra.setToolTipText("Requisicion Compra");
		this.jLabelid_requisicion_compraDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_requisicion_compraDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_requisicion_compraDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_requisicion_compraDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_requisicion_compraDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_requisicion_compraDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDREQUISICIONCOMPRA);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_requisicion_compraDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_requisicion_compraDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_requisicion_compraDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_requisicion_compraDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_requisicion_compraDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_requisicion_compraDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_requisicion_compraDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_requisicion_compraDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_requisicion_compraDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_requisicion_compraDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_requisicion_compraDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_requisicion_compraDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_requisicion_compraDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_requisicion_compraDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_requisicion_compraDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_requisicion_compraDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_requisicion_compraDetalleRequisicionCompra"));

		this.jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_requisicion_compraDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_requisicion_compraDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_requisicion_compraDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_requisicion_compraDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_requisicion_compraDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_requisicion_compraDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_requisicion_compraDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_requisicion_compraDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_requisicion_compraDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_requisicion_compraDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_requisicion_compraDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_requisicion_compraDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_requisicion_compraDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_requisicion_compraDetalleRequisicionCompraUpdate"));



					
		this.jLabelid_empresaDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_empresaDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleRequisicionCompra.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_empresaDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_empresaDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_empresaDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleRequisicionCompra.setEnabled(false);

		this.jButtonid_empresaDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_empresaDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_empresaDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRequisicionCompra"));

		this.jButtonid_empresaDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_empresaDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_empresaDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleRequisicionCompraUpdate"));



					
		this.jLabelid_sucursalDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_sucursalDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalDetalleRequisicionCompra.setToolTipText("Sucursal");
		this.jLabelid_sucursalDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_sucursalDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_sucursalDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_sucursalDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalDetalleRequisicionCompra.setEnabled(false);

		this.jButtonid_sucursalDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_sucursalDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_sucursalDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleRequisicionCompra"));

		this.jButtonid_sucursalDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_sucursalDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_sucursalDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_sucursalDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_sucursalDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_sucursalDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalDetalleRequisicionCompraUpdate"));



					
		this.jLabelid_ejercicioDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_ejercicioDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDEJERCICIO+" : *");
		this.jLabelid_ejercicioDetalleRequisicionCompra.setToolTipText("Ejercicio");
		this.jLabelid_ejercicioDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_ejercicioDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_ejercicioDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_ejercicioDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_ejercicioDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDEJERCICIO);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_ejercicioDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_ejercicioDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_ejercicioDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_ejercicioDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_ejercicioDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_ejercicioDetalleRequisicionCompra.setEnabled(false);

		this.jButtonid_ejercicioDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_ejercicioDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_ejercicioDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_ejercicioDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_ejercicioDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_ejercicioDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleRequisicionCompra"));

		this.jButtonid_ejercicioDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_ejercicioDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_ejercicioDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_ejercicioDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_ejercicioDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_ejercicioDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_ejercicioDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_ejercicioDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_ejercicioDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_ejercicioDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_ejercicioDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_ejercicioDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_ejercicioDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_ejercicioDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_ejercicioDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_ejercicioDetalleRequisicionCompraUpdate"));



					
		this.jLabelid_periodoDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_periodoDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDPERIODO+" : *");
		this.jLabelid_periodoDetalleRequisicionCompra.setToolTipText("Periodo");
		this.jLabelid_periodoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_periodoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodoDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodoDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodoDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDPERIODO);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_periodoDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_periodoDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_periodoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodoDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_periodoDetalleRequisicionCompra.setEnabled(false);

		this.jButtonid_periodoDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_periodoDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodoDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_periodoDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodoDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodoDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleRequisicionCompra"));

		this.jButtonid_periodoDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_periodoDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_periodoDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodoDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodoDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodoDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_periodoDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_periodoDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodoDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodoDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_periodoDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodoDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodoDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodoDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodoDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodoDetalleRequisicionCompraUpdate"));



					
		this.jLabelid_anioDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_anioDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDANIO+" : *");
		this.jLabelid_anioDetalleRequisicionCompra.setToolTipText("Anio");
		this.jLabelid_anioDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_anioDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_anioDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_anioDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_anioDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDANIO);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_anioDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_anioDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_anioDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_anioDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_anioDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_anioDetalleRequisicionCompra.setEnabled(false);

		this.jButtonid_anioDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_anioDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_anioDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_anioDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_anioDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_anioDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleRequisicionCompra"));

		this.jButtonid_anioDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_anioDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_anioDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_anioDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_anioDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_anioDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_anioDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_anioDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_anioDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_anioDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_anioDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_anioDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_anioDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_anioDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_anioDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_anioDetalleRequisicionCompraUpdate"));



					
		this.jLabelid_mesDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_mesDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDMES+" : *");
		this.jLabelid_mesDetalleRequisicionCompra.setToolTipText("Mes");
		this.jLabelid_mesDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_mesDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_mesDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_mesDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_mesDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDMES);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_mesDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_mesDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_mesDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_mesDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_mesDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_mesDetalleRequisicionCompra.setEnabled(false);

		this.jButtonid_mesDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_mesDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_mesDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_mesDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_mesDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_mesDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleRequisicionCompra"));

		this.jButtonid_mesDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_mesDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_mesDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_mesDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_mesDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_mesDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_mesDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_mesDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_mesDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_mesDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_mesDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_mesDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_mesDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_mesDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_mesDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_mesDetalleRequisicionCompraUpdate"));



					
		this.jLabelid_bodegaDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_bodegaDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDBODEGA+" : *");
		this.jLabelid_bodegaDetalleRequisicionCompra.setToolTipText("Bodega");
		this.jLabelid_bodegaDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_bodegaDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_bodegaDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_bodegaDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_bodegaDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDBODEGA);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_bodegaDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_bodegaDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_bodegaDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_bodegaDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_bodegaDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_bodegaDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_bodegaDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_bodegaDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_bodegaDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_bodegaDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_bodegaDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleRequisicionCompra"));

		this.jButtonid_bodegaDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_bodegaDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_bodegaDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_bodegaDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_bodegaDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_bodegaDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_bodegaDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_bodegaDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_bodegaDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_bodegaDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_bodegaDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_bodegaDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_bodegaDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_bodegaDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_bodegaDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_bodegaDetalleRequisicionCompraUpdate"));



					
		this.jLabelid_productoDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_productoDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDPRODUCTO+" : *");
		this.jLabelid_productoDetalleRequisicionCompra.setToolTipText("Producto");
		this.jLabelid_productoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_productoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_productoDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_productoDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_productoDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDPRODUCTO);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_productoDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_productoDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_productoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_productoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_productoDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_productoDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_productoDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_productoDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_productoDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_productoDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_productoDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleRequisicionCompra"));

		this.jButtonid_productoDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_productoDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_productoDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_productoDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_productoDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_productoDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_productoDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_productoDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_productoDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_productoDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_productoDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_productoDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_productoDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_productoDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_productoDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_productoDetalleRequisicionCompraUpdate"));



					
		this.jLabelid_unidadDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_unidadDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDUNIDAD+" : *");
		this.jLabelid_unidadDetalleRequisicionCompra.setToolTipText("Unidad");
		this.jLabelid_unidadDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_unidadDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_unidadDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_unidadDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_unidadDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDUNIDAD);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_unidadDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_unidadDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_unidadDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_unidadDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_unidadDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_unidadDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_unidadDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_unidadDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_unidadDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_unidadDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_unidadDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleRequisicionCompra"));

		this.jButtonid_unidadDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_unidadDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_unidadDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_unidadDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_unidadDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_unidadDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_unidadDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_unidadDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_unidadDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_unidadDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_unidadDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_unidadDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_unidadDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_unidadDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_unidadDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_unidadDetalleRequisicionCompraUpdate"));



					
		this.jLabelid_centro_costoDetalleRequisicionCompra = new JLabelMe();
		this.jLabelid_centro_costoDetalleRequisicionCompra.setText(""+DetalleRequisicionCompraConstantesFunciones.LABEL_IDCENTROCOSTO+" :");
		this.jLabelid_centro_costoDetalleRequisicionCompra.setToolTipText("Centro Costo");
		this.jLabelid_centro_costoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_centro_costoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_centro_costoDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_centro_costoDetalleRequisicionCompra=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_centro_costoDetalleRequisicionCompra.setToolTipText(DetalleRequisicionCompraConstantesFunciones.LABEL_IDCENTROCOSTO);
		this.gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		this.jPanelid_centro_costoDetalleRequisicionCompra.setLayout(this.gridaBagLayoutDetalleRequisicionCompra);


		jComboBoxid_centro_costoDetalleRequisicionCompra= new JComboBoxMe();
		jComboBoxid_centro_costoDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_centro_costoDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_centro_costoDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_centro_costoDetalleRequisicionCompra= new JButtonMe();
		this.jButtonid_centro_costoDetalleRequisicionCompra.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleRequisicionCompra.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleRequisicionCompra.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_centro_costoDetalleRequisicionCompra.setText("Buscar");
		this.jButtonid_centro_costoDetalleRequisicionCompra.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_centro_costoDetalleRequisicionCompra.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleRequisicionCompra,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_centro_costoDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleRequisicionCompra"));

		this.jButtonid_centro_costoDetalleRequisicionCompraBusqueda= new JButtonMe();
		this.jButtonid_centro_costoDetalleRequisicionCompraBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleRequisicionCompraBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleRequisicionCompraBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleRequisicionCompraBusqueda.setText("U");
		this.jButtonid_centro_costoDetalleRequisicionCompraBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_centro_costoDetalleRequisicionCompraBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleRequisicionCompraBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_centro_costoDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleRequisicionCompraBusqueda"));

		if(this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_centro_costoDetalleRequisicionCompraBusqueda.setVisible(false);		}

		this.jButtonid_centro_costoDetalleRequisicionCompraUpdate= new JButtonMe();
		this.jButtonid_centro_costoDetalleRequisicionCompraUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleRequisicionCompraUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_centro_costoDetalleRequisicionCompraUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_centro_costoDetalleRequisicionCompraUpdate.setText("U");
		this.jButtonid_centro_costoDetalleRequisicionCompraUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_centro_costoDetalleRequisicionCompraUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleRequisicionCompraUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_centro_costoDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleRequisicionCompraUpdate"));


		jButtonid_centro_costoDetalleRequisicionCompraArbol= new JButtonMe();
		jButtonid_centro_costoDetalleRequisicionCompraArbol.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleRequisicionCompraArbol.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleRequisicionCompraArbol.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		jButtonid_centro_costoDetalleRequisicionCompraArbol.setText("Arbol");
		jButtonid_centro_costoDetalleRequisicionCompraArbol.setToolTipText("Buscar Por Arbol ("+FuncionesSwing.getKeyNameControl("CONTROL_ARBOL")+")");
		jButtonid_centro_costoDetalleRequisicionCompraArbol.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_centro_costoDetalleRequisicionCompraArbol,"arbol","Buscar Por Arbol");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ARBOL");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ARBOL");
		jComboBoxid_centro_costoDetalleRequisicionCompra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_centro_costoDetalleRequisicionCompra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_centro_costoDetalleRequisicionCompraArbol"));



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
		//this.jInternalFrameDetalleDetalleRequisicionCompra = new DetalleRequisicionCompraBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Requisicion Compra DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleRequisicionCompra= new GridBagLayout();
		

		
		String sToolTipDetalleRequisicionCompra="";
		sToolTipDetalleRequisicionCompra=DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleRequisicionCompra+="(Inventario.DetalleRequisicionCompra)";
		}
		
		if(!this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleRequisicionCompra+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleRequisicionCompra = new JButtonMe();
		this.jButtonModificarDetalleRequisicionCompra = new JButtonMe();
        this.jButtonActualizarDetalleRequisicionCompra = new JButtonMe();
        this.jButtonEliminarDetalleRequisicionCompra = new JButtonMe();
        this.jButtonCancelarDetalleRequisicionCompra = new JButtonMe();
        this.jButtonGuardarCambiosDetalleRequisicionCompra = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleRequisicionCompra = new JButtonMe();
		this.jButtonCerrarDetalleRequisicionCompra = new JButtonMe();
		
		this.jScrollPanelDatosDetalleRequisicionCompra = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleRequisicionCompra = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleRequisicionCompra = new JScrollPane();
		//this.jScrollPanelDatosDetalleRequisicionCompraTotales = new JScrollPane();		
		
		
		this.jPanelCamposDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Requisicion Compra";
		
		if(!this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Requisicion Compras" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleRequisicionCompra.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		//this.jScrollPanelDatosDetalleRequisicionCompraTotales.setBorder(javax.swing.BorderFactory.createTitledBorder("Totales"));
		
			
        this.jPanelCamposDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleRequisicionCompra.setName("jPanelCamposDetalleRequisicionCompra"); 

		this.jPanelCamposOcultosDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleRequisicionCompra.setName("jPanelCamposOcultosDetalleRequisicionCompra"); 

        this.jPanelAccionesDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleRequisicionCompra.setToolTipText("Acciones");
        this.jPanelAccionesDetalleRequisicionCompra.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleRequisicionCompra.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleRequisicionCompra.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleRequisicionCompra.setText("Nuevo");
		this.jButtonModificarDetalleRequisicionCompra.setText("Editar");
        this.jButtonActualizarDetalleRequisicionCompra.setText("Actualizar");
        this.jButtonEliminarDetalleRequisicionCompra.setText("Eliminar");
        this.jButtonCancelarDetalleRequisicionCompra.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleRequisicionCompra.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleRequisicionCompra.setText("Guardar");
		this.jButtonCerrarDetalleRequisicionCompra.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleRequisicionCompra,"nuevo_button","Nuevo",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleRequisicionCompra,"modificar_button","Editar",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleRequisicionCompra,"actualizar_button","Actualizar",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleRequisicionCompra,"eliminar_button","Eliminar",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleRequisicionCompra,"cancelar_button","Cancelar",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleRequisicionCompra,"guardarcambios_button","Guardar",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleRequisicionCompra,"guardarcambiostabla_button","Guardar",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleRequisicionCompra,"cerrar_button","Salir",this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleRequisicionCompra.setToolTipText("Nuevo"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleRequisicionCompra.setToolTipText("Editar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleRequisicionCompra.setToolTipText("Actualizar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleRequisicionCompra.setToolTipText("Eliminar)"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleRequisicionCompra.setToolTipText("Cancelar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleRequisicionCompra.setToolTipText("Guardar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleRequisicionCompra.setToolTipText("Guardar"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleRequisicionCompra.setToolTipText("Salir"+" "+DetalleRequisicionCompraConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleRequisicionCompra";
		inputMap = this.jButtonNuevoDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleRequisicionCompra.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleRequisicionCompra"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleRequisicionCompra";
		inputMap = this.jButtonActualizarDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleRequisicionCompra"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleRequisicionCompra";
		inputMap = this.jButtonEliminarDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleRequisicionCompra"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleRequisicionCompra";
		inputMap = this.jButtonCancelarDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleRequisicionCompra"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleRequisicionCompra";
		inputMap = this.jButtonCerrarDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleRequisicionCompra"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleRequisicionCompra";
		inputMap = this.jButtonGuardarCambiosTablaDetalleRequisicionCompra.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleRequisicionCompra.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleRequisicionCompra"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleRequisicionCompra.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleRequisicionCompra.setToolTipText("Nuevo DetalleRequisicionCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleRequisicionCompra.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleRequisicionCompra.setToolTipText("Sin Cerrar Ventana DetalleRequisicionCompra");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleRequisicionCompra = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleRequisicionCompra.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleRequisicionCompra.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleRequisicionCompra.setText("Accion");
		this.jComboBoxTiposAccionesDetalleRequisicionCompra.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleRequisicionCompra = new JLabelMe();
		
		this.jLabelAccionesDetalleRequisicionCompra.setText("Acciones");		
		this.jLabelAccionesDetalleRequisicionCompra.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRequisicionCompra.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleRequisicionCompra.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleRequisicionCompra();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleRequisicionCompra();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleRequisicionCompra=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleRequisicionCompra.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleRequisicionCompra,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleRequisicionCompra.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRequisicionCompra.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleRequisicionCompra.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleRequisicionCompra = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleRequisicionCompra = new GridBagLayout();
		
		this.jPanelCamposDetalleRequisicionCompra.setLayout(gridaBagLayoutCamposDetalleRequisicionCompra);
		this.jPanelCamposOcultosDetalleRequisicionCompra.setLayout(gridaBagLayoutCamposOcultosDetalleRequisicionCompra);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleRequisicionCompra.add(jLabelIdDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleRequisicionCompra.add(jLabelidDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_requisicion_compraDetalleRequisicionCompra.add(jLabelid_requisicion_compraDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_requisicion_compraDetalleRequisicionCompra.add(jButtonid_requisicion_compraDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_requisicion_compraDetalleRequisicionCompra.add(jButtonid_requisicion_compraDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_requisicion_compraDetalleRequisicionCompra.add(jComboBoxid_requisicion_compraDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleRequisicionCompra.add(jLabelid_empresaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleRequisicionCompra.add(jButtonid_empresaDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleRequisicionCompra.add(jButtonid_empresaDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleRequisicionCompra.add(jComboBoxid_empresaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalDetalleRequisicionCompra.add(jLabelid_sucursalDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleRequisicionCompra.add(jButtonid_sucursalDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalDetalleRequisicionCompra.add(jButtonid_sucursalDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalDetalleRequisicionCompra.add(jComboBoxid_sucursalDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_ejercicioDetalleRequisicionCompra.add(jLabelid_ejercicioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleRequisicionCompra.add(jButtonid_ejercicioDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_ejercicioDetalleRequisicionCompra.add(jButtonid_ejercicioDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_ejercicioDetalleRequisicionCompra.add(jComboBoxid_ejercicioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodoDetalleRequisicionCompra.add(jLabelid_periodoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleRequisicionCompra.add(jButtonid_periodoDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodoDetalleRequisicionCompra.add(jButtonid_periodoDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodoDetalleRequisicionCompra.add(jComboBoxid_periodoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_anioDetalleRequisicionCompra.add(jLabelid_anioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleRequisicionCompra.add(jButtonid_anioDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_anioDetalleRequisicionCompra.add(jButtonid_anioDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_anioDetalleRequisicionCompra.add(jComboBoxid_anioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_mesDetalleRequisicionCompra.add(jLabelid_mesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleRequisicionCompra.add(jButtonid_mesDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_mesDetalleRequisicionCompra.add(jButtonid_mesDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_mesDetalleRequisicionCompra.add(jComboBoxid_mesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_bodegaDetalleRequisicionCompra.add(jLabelid_bodegaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleRequisicionCompra.add(jButtonid_bodegaDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_bodegaDetalleRequisicionCompra.add(jButtonid_bodegaDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_bodegaDetalleRequisicionCompra.add(jComboBoxid_bodegaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_productoDetalleRequisicionCompra.add(jLabelid_productoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_productoDetalleRequisicionCompra.add(jButtonid_productoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleRequisicionCompra.add(jButtonid_productoDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 4;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_productoDetalleRequisicionCompra.add(jButtonid_productoDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_productoDetalleRequisicionCompra.add(jComboBoxid_productoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_unidadDetalleRequisicionCompra.add(jLabelid_unidadDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleRequisicionCompra.add(jButtonid_unidadDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_unidadDetalleRequisicionCompra.add(jButtonid_unidadDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_unidadDetalleRequisicionCompra.add(jComboBoxid_unidadDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_centro_costoDetalleRequisicionCompra.add(jLabelid_centro_costoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleRequisicionCompra.add(jButtonid_centro_costoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 3;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
	this.jPanelid_centro_costoDetalleRequisicionCompra.add(jButtonid_centro_costoDetalleRequisicionCompraArbol, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 4;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleRequisicionCompra.add(jButtonid_centro_costoDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 5;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_centro_costoDetalleRequisicionCompra.add(jButtonid_centro_costoDetalleRequisicionCompraUpdate, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_centro_costoDetalleRequisicionCompra.add(jComboBoxid_centro_costoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_requisicionDetalleRequisicionCompra.add(jLabelcantidad_requisicionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_requisicionDetalleRequisicionCompra.add(jButtoncantidad_requisicionDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_requisicionDetalleRequisicionCompra.add(jTextFieldcantidad_requisicionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_unitarioDetalleRequisicionCompra.add(jLabelcosto_unitarioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_unitarioDetalleRequisicionCompra.add(jButtoncosto_unitarioDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_unitarioDetalleRequisicionCompra.add(jTextFieldcosto_unitarioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcosto_totalDetalleRequisicionCompra.add(jLabelcosto_totalDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcosto_totalDetalleRequisicionCompra.add(jButtoncosto_totalDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcosto_totalDetalleRequisicionCompra.add(jTextFieldcosto_totalDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionDetalleRequisicionCompra.add(jLabeldescripcionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionDetalleRequisicionCompra.add(jButtondescripcionDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionDetalleRequisicionCompra.add(jscrollPanedescripcionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_entregadaDetalleRequisicionCompra.add(jLabelcantidad_entregadaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_entregadaDetalleRequisicionCompra.add(jButtoncantidad_entregadaDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_entregadaDetalleRequisicionCompra.add(jTextFieldcantidad_entregadaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcantidad_pendienteDetalleRequisicionCompra.add(jLabelcantidad_pendienteDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		//this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 2;
		this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(0, 0, 0, 0);
		this.jPanelcantidad_pendienteDetalleRequisicionCompra.add(jButtoncantidad_pendienteDetalleRequisicionCompraBusqueda, this.gridBagConstraintsDetalleRequisicionCompra);
	}

	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = 1;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcantidad_pendienteDetalleRequisicionCompra.add(jTextFieldcantidad_pendienteDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelidDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelid_requisicion_compraDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelid_bodegaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelid_productoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelid_unidadDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelid_centro_costoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelcantidad_requisicionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelcosto_unitarioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelcosto_totalDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPaneldescripcionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelcantidad_entregadaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleRequisicionCompra.add(this.jPanelcantidad_pendienteDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposDetalleRequisicionCompra % 1==0) {
		iXPanelCamposDetalleRequisicionCompra=0;
		iYPanelCamposDetalleRequisicionCompra++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposOcultosDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposOcultosDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicionCompra.add(this.jPanelid_empresaDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposOcultosDetalleRequisicionCompra % 1==0) {
		iXPanelCamposOcultosDetalleRequisicionCompra=0;
		iYPanelCamposOcultosDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposOcultosDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposOcultosDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicionCompra.add(this.jPanelid_sucursalDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposOcultosDetalleRequisicionCompra % 1==0) {
		iXPanelCamposOcultosDetalleRequisicionCompra=0;
		iYPanelCamposOcultosDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposOcultosDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposOcultosDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicionCompra.add(this.jPanelid_ejercicioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposOcultosDetalleRequisicionCompra % 1==0) {
		iXPanelCamposOcultosDetalleRequisicionCompra=0;
		iYPanelCamposOcultosDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposOcultosDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposOcultosDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicionCompra.add(this.jPanelid_periodoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposOcultosDetalleRequisicionCompra % 1==0) {
		iXPanelCamposOcultosDetalleRequisicionCompra=0;
		iYPanelCamposOcultosDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposOcultosDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposOcultosDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicionCompra.add(this.jPanelid_anioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposOcultosDetalleRequisicionCompra % 1==0) {
		iXPanelCamposOcultosDetalleRequisicionCompra=0;
		iYPanelCamposOcultosDetalleRequisicionCompra++;
	}
	this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleRequisicionCompra.gridy = iYPanelCamposOcultosDetalleRequisicionCompra;
	this.gridBagConstraintsDetalleRequisicionCompra.gridx = iXPanelCamposOcultosDetalleRequisicionCompra++;
	this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleRequisicionCompra.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleRequisicionCompra.add(this.jPanelid_mesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);



	if(iXPanelCamposOcultosDetalleRequisicionCompra % 1==0) {
		iXPanelCamposOcultosDetalleRequisicionCompra=0;
		iYPanelCamposOcultosDetalleRequisicionCompra++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleRequisicionCompra= new GridBagLayout();
		this.jPanelAccionesDetalleRequisicionCompra.setLayout(gridaBagLayoutAccionesDetalleRequisicionCompra);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleRequisicionCompra= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleRequisicionCompra.setLayout(gridaBagLayoutAccionesFormularioDetalleRequisicionCompra);
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleRequisicionCompra.add(this.jComboBoxTiposAccionesFormularioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleRequisicionCompra.add(this.jCheckBoxPostAccionNuevoDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detallerequisicioncompraSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleRequisicionCompra.add(this.jCheckBoxPostAccionSinCerrarDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detallerequisicioncompraSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleRequisicionCompra.add(this.jCheckBoxPostAccionSinMensajeDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleRequisicionCompra.add(this.jButtonModificarDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);							

		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleRequisicionCompra.add(this.jButtonEliminarDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
			
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleRequisicionCompra.add(this.jButtonActualizarDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);


		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleRequisicionCompra.add(this.jButtonGuardarCambiosDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);	
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = 0;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleRequisicionCompra.add(this.jButtonCancelarDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleRequisicionCompra = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleRequisicionCompra);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detallerequisicioncompraSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();						
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;		
			//this.gridBagConstraintsDetalleRequisicionCompra.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleRequisicionCompra.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleRequisicionCompra.gridx =0;
		this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleRequisicionCompra.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleRequisicionCompraJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleRequisicionCompra = new DetalleRequisicionCompraBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Requisicion Compra DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Requisicion Compra DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Requisicion Compra Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleRequisicionCompraModel detallerequisicioncompraModel=new DetalleRequisicionCompraModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleRequisicionCompraModel.DetalleRequisicionCompraFocusTraversalPolicy detallerequisicioncompraFocusTraversalPolicy = detallerequisicioncompraModel.new DetalleRequisicionCompraFocusTraversalPolicy(this);
			
			//detallerequisicioncompraFocusTraversalPolicy.setdetallerequisicioncompraJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detallerequisicioncompraModel);
			
			
			this.jContentPaneDetalleDetalleRequisicionCompra = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleRequisicionCompra = new GridBagLayout();	
			this.jContentPaneDetalleDetalleRequisicionCompra.setLayout(gridaBagLayoutDetalleDetalleRequisicionCompra);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleRequisicionCompra = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
				this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleRequisicionCompra.add(jTtoolBarDetalleDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleRequisicionCompra=   new JScrollPane(jContentPaneDetalleDetalleRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleRequisicionCompra=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	        
			this.jContentPaneDetalleDetalleRequisicionCompra.add(jPanelCamposDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);
			
			
			
			
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
						&& detallerequisicioncompraSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detallerequisicioncompraSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleRequisicionCompra= new GridBagConstraints();
						this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
						this.jContentPaneDetalleDetalleRequisicionCompra.add(this.jTabbedPaneRelacionesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleRequisicionCompra.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleRequisicionCompra.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
					this.gridBagConstraintsDetalleRequisicionCompra.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleRequisicionCompra.add(jPanelCamposOcultosDetalleRequisicionCompra, gridBagConstraintsDetalleRequisicionCompra);
				
					this.jPanelCamposOcultosDetalleRequisicionCompra.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	        this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleRequisicionCompra.add(this.jPanelAccionesFormularioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);							
			
			
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
	        this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleRequisicionCompra.add(this.jPanelAccionesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleRequisicionCompra);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleRequisicionCompra=   new JScrollPane(this.jPanelCamposDetalleRequisicionCompra,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleRequisicionCompra.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRequisicionCompra.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleRequisicionCompra.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
			this.gridBagConstraintsDetalleRequisicionCompra.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleRequisicionCompra.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleRequisicionCompra.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);			
			
			this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
			this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
			
			
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		
			
		this.gridBagConstraintsDetalleRequisicionCompra = new GridBagConstraints();
		this.gridBagConstraintsDetalleRequisicionCompra.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleRequisicionCompra.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleRequisicionCompra, this.gridBagConstraintsDetalleRequisicionCompra);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleRequisicionCompra;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleRequisicionCompra;
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
